package com.spring_boot.betrieb;

import com.spring_boot.adresse.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class BetriebService {

    private final BetriebRepository betriebRepository;

    @Autowired
    public BetriebService(BetriebRepository betriebRepository) {
        this.betriebRepository = betriebRepository;
    }

    @Transactional
    public String saveBetrieb(Betrieb betrieb) {
        betriebRepository.save(betrieb);
        return "success";
    }

    /*
    @Transactional
    public Betrieb findUniqueBetrieb(String name, String fax, String email) {
        return betriebRepository.findByNameAndFaxAndEmail(name, fax, email);
    }*/

    @Transactional
    public Betrieb getOrCreateBetrieb(Betrieb betrieb) {
        Optional<Betrieb> existingBetrieb = betriebRepository.findByNameAndFaxAndEmail(betrieb.getName(), betrieb.getFax(), betrieb.getEmail());
        if (existingBetrieb.isEmpty()) {
            return betriebRepository.save(betrieb);
        }
        return existingBetrieb.get();
    }

}

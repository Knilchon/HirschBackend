package com.spring_boot.betrieb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}

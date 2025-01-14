package com.spring_boot.wochentagkombination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WochentagkombinationService {

    private final WochentagkombinationRepository wochentagkombinationRepository;

    @Autowired
    public WochentagkombinationService(WochentagkombinationRepository wochentagkombinationRepository) {
        this.wochentagkombinationRepository = wochentagkombinationRepository;
    }

    @Transactional
    public void saveWochentagkombination(Wochentagkombination wochentagkombination) {
        wochentagkombinationRepository.save(wochentagkombination);
    }

    @Transactional
    public String saveAllWeekdayCombos(List<String> wochentagkombinations) {
        disableAllWeekDayCombos();
        for (String wochentagkombination : wochentagkombinations) {
            wochentagkombinationRepository.updateIstAktiv(wochentagkombination);
        }
        return "success";
    }

    @Transactional
    public void disableAllWeekDayCombos() {
        List<Wochentagkombination> wochentagkombinations = wochentagkombinationRepository.findByIstAktivTrue();
        for (Wochentagkombination wochentagkombination : wochentagkombinations) {
            wochentagkombination.setIstAktiv(false);
            wochentagkombinationRepository.save(wochentagkombination);
        }
    }
    @Transactional
    public List<Wochentagkombination> getActiveWeekDayCombos() {
        return wochentagkombinationRepository.findByIstAktivTrue();
    }
    @Transactional
    public Long getWochentagkomboId(String wochentagkombowunsch) {
        return wochentagkombinationRepository.findByWochentagkombo(wochentagkombowunsch).getWochentagkombinationID();
    }
}

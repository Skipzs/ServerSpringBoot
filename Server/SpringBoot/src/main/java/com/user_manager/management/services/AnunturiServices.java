package com.user_manager.management.services;

import com.user_manager.management.models.Anunturi;
import com.user_manager.management.repository.AnunturiRepository;
import com.user_manager.management.repository.CamereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnunturiServices {

    @Autowired
    AnunturiRepository anunturiRepository;

    public List<Anunturi> getAnunturiOrderedByDateAndId() {
        List<Anunturi> anunturiList = anunturiRepository.findAll(Sort.by(Sort.Order.desc("data"), Sort.Order.desc("id")));

        List<Anunturi> sortedList = anunturiList.stream()
                .sorted(Comparator.comparing(Anunturi::getData, Comparator.reverseOrder())
                        .thenComparing(Anunturi::getId, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        return sortedList;
    }

    public int addNewAnuntServiceMethod(Date data, String titlu, String mainbody){
        return anunturiRepository.addNewAnunt(data, titlu, mainbody);
    }


}

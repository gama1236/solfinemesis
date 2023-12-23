package com.solucion.solfinemesis.service;

import com.solucion.solfinemesis.entitys.NationalityEntity;
import com.solucion.solfinemesis.mappers.NationalityMapper;
import com.solucion.solfinemesis.repository.NationalityRepository;
import com.solucion.solfinemesis.responses.NationalityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalityServiceImpl  implements  NationalityService{

    private final NationalityRepository nationalityRepository;

    @Autowired
     NationalityServiceImpl(NationalityRepository  nationalityRepository) {
         this.nationalityRepository =  nationalityRepository;
     }

    /**
     * se llama todas la nacionalidades existentes en la base de datos
     * y las muestra
     * @return List<NationalityResponse>
     */
    @Override
    public List<NationalityResponse> getAllNationalities() {
        List<NationalityEntity> nationalityEntity =  this.nationalityRepository.findAll();
        return nationalityEntity.stream().map(NationalityMapper::nationalityEntityToNationalityResponse).toList();
    }
}

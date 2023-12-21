package com.solucion.solfinemesis.mappers;

import com.solucion.solfinemesis.entitys.NationalityEntity;
import com.solucion.solfinemesis.responses.NationalityResponse;

public class NationalityMapper {

    public static NationalityResponse nationalityEntityToNationalityResponse(NationalityEntity nationalityEntity) {
        return NationalityResponse.builder()
                .codCountry(nationalityEntity.getCodCountry())
                .desCountry(nationalityEntity.getDesCountry())
                .build();
    }
}

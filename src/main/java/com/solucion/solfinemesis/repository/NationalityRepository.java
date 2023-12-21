package com.solucion.solfinemesis.repository;

import com.solucion.solfinemesis.entitys.NationalityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends JpaRepository<NationalityEntity, Long> {
}

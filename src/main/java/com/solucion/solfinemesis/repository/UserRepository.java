package com.solucion.solfinemesis.repository;

import com.solucion.solfinemesis.entitys.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Long> {
}

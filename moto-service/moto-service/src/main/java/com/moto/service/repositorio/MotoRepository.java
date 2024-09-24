package com.moto.service.repositorio;

import com.moto.service.entidades.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends JpaRepository<Moto, Long> {

    List<Moto> getReferenceById
            (long usuarioId);
}

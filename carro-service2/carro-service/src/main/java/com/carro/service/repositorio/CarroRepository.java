package com.carro.service.repositorio;
import com.carro.service.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CarroRepository extends JpaRepository<Carro, Long> {

    List<Carro> getReferenceById
            (long usuarioId);
}

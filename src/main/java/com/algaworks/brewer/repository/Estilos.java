package com.algaworks.brewer.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.brewer.model.Estilo;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>{

}
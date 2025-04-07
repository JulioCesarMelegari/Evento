package com.jcm.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcm.evento.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}

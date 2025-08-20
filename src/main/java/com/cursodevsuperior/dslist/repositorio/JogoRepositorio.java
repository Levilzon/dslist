package com.cursodevsuperior.dslist.repositorio;

import com.cursodevsuperior.dslist.entidades.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepositorio extends JpaRepository<Jogos,Long> {
}

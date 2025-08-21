package com.cursodevsuperior.dslist.repositorio;

import com.cursodevsuperior.dslist.entidades.Jogos;
import com.cursodevsuperior.dslist.projection.JogosMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JogoRepositorio extends JpaRepository<Jogos,Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_game.jogos_id, tb_game.title, tb_game.game_year AS year, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.jogos_id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
    List<JogosMinProjection> searchByList(Long listId);
}

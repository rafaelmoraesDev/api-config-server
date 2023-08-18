package br.com.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myproject.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}

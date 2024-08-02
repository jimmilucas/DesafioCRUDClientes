package com.cursosrpingprofessional.desafiocrudclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursosrpingprofessional.desafiocrudclientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
}

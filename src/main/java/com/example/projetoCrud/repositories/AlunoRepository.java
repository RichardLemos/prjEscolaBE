package com.example.projetoCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.projetoCrud.domain.Aluno;



@Repository
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

	
	
	
}
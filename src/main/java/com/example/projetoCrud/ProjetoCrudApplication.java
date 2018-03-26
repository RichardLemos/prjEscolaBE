package com.example.projetoCrud;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projetoCrud.domain.Aluno;
import com.example.projetoCrud.domain.Curso;
import com.example.projetoCrud.repositories.AlunoRepository;
import com.example.projetoCrud.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoCrudApplication implements CommandLineRunner {
	@Autowired
	CursoRepository repo;
	
	@Autowired
	AlunoRepository repoAluno;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetoCrudApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		Curso curso1 = new Curso(null, 50, "Sistemas de Informação");
		Curso curso2 = new Curso(null, 51, "Análise e Desenvolvimento de Sistemas");
		Curso curso3 = new Curso(null, 52, "Design Gráfico");
		Curso curso4 = new Curso(null, 53, "Redes de Computadores");
		repo.save(Arrays.asList(curso1,curso2, curso3, curso4));
		
		Aluno aluno = new Aluno(null, "Richard de Oliveira Lemos", 5306184, null, curso1);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		aluno.setAnoNascimento(sdf.parse("01/09/1996"));
		
		Aluno aluno2 = new Aluno(null, "Cristiane de Oliveira Lemos", 5306197, null, curso2);
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		aluno2.setAnoNascimento(sdf2.parse("27/12/1978"));
	
		
		Aluno aluno3 = new Aluno(null, "Maxuel Ferreira Lemos", 5306188, null, curso3);
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		aluno3.setAnoNascimento(sdf3.parse("08/09/1973"));
		repoAluno.save(Arrays.asList(aluno, aluno2, aluno3));
	}
}

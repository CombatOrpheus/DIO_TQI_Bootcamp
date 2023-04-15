package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
	Curso curso1 = new Curso("curso java", "descricao curso java", 8);
	Curso curso2 = new Curso("curso js", "descricao curso js", 4);
	Mentoria mentoria = new Mentoria("mentoria java", "descricao mentoria java", LocalDate.now());

	System.out.println(curso1);
	System.out.println(curso2);
	System.out.println(mentoria);
    }

}

package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
	Curso curso1 = new Curso("curso java", "descricao curso java", 8);
	Curso curso2 = new Curso("curso js", "descricao curso js", 4);
	Mentoria mentoria = new Mentoria("mentoria java", "descricao mentoria java", LocalDate.now());

	System.out.println(curso1);
	System.out.println(curso2);
	System.out.println(mentoria);
	
	Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer");
	var conteudos = bootcamp.getConteudos();
	conteudos.addAll(List.of(curso1, curso2, mentoria));
	
	Dev devCamila = new Dev("Camila");
	devCamila.inscreverBootcamp(bootcamp);
	System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
	devCamila.progredir();
	System.out.println("-");
	System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
	System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
	System.out.println("XP: " + devCamila.calcularTotalXp());
	
	System.out.println("----------");
	
	Dev devJoao= new Dev("João");
	devJoao.inscreverBootcamp(bootcamp);
	System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
	devJoao.progredir();
	System.out.println("-");
	System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
	System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
	System.out.println("XP: " + devJoao.calcularTotalXp());
    }

}

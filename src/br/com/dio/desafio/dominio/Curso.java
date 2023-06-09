package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private String titulo;
    private String descricao;
    private int cargaHoraria;
    
    public Curso(String titulo, String descricao, int cargaHoraria) {
	super();
	this.titulo = titulo;
	this.descricao = descricao;
	this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
	return cargaHoraria * XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
	return "Curso{titulo=\'" + titulo + "\', descricao=\'" + descricao + "\', cargaHoraria=" + cargaHoraria + "}";
    }
}

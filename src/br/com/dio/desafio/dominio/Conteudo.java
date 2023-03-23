package br.com.dio.desafio.dominio;

import enums.NivelEnum;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    private NivelEnum nivel;

    public NivelEnum getNivel() {
        return nivel;
    }

    public void setNivel(NivelEnum nivel) {
        this.nivel = nivel;
    }

    public abstract double calcularXp();

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
}

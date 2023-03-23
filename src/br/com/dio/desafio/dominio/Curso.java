package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {

        if(getNivel() != null){
            double experienciaPorCurso = 0;
            switch (getNivel()){
                case FACIL -> {
                    experienciaPorCurso = 1 * XP_PADRAO * cargaHoraria;
                }
                case MEDIO -> {
                experienciaPorCurso = 2*XP_PADRAO * cargaHoraria;
            }
                case DIFICIL -> {
                    experienciaPorCurso = 3 * XP_PADRAO * cargaHoraria;
                }
            }
            return experienciaPorCurso;
        }
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", Dificuldade='" + getNivel() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

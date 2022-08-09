package br.com.dio.desafio.dominio;

//abstract quer dizer que não consegue instanciar conteudo (ou seja criar novo objeto/"new")
//porque essa classe serve apenas como classe mãe das classes curso e mentoria (essas sim serão instanciadas)
public abstract class Conteudo {
    //constante começa com final
    //protected só classes filhas terão acesso
    //static quer dizer que pode acessar fora da classe conteúdo
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

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

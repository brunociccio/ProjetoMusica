package br.com.alura.minhasmusicas.modelos;

public class Audio {
    // variaveis
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;
    private Podcast podcast;
    private Musica musica;

    // const vazio
    public Audio() {
        super();
    }

    // const cheio
    public Audio(String titulo, int totalReproducoes, int totalCurtidas, int classificacao, Podcast podcast, Musica musica) {
        super();
        this.titulo = titulo;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = totalCurtidas;
        this.classificacao = classificacao;
        this.podcast = podcast;
        this.musica = musica;
    }

    // const parcial
    public Audio(String titulo, int totalReproducoes, int totalCurtidas, int classificacao) {
        super();
        this.titulo = titulo;
        this.totalReproducoes = totalReproducoes;
        this.totalCurtidas = totalCurtidas;
        this.classificacao = classificacao;
    }

    // setters and getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    // metodos
    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

}

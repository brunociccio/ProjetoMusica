package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    // variaveis
    private String host;
    private String descricao;

    // const vazio
    public Podcast() {
        super();
    }

    // const com atributos da propria classe
    public Podcast(String host, String descricao) {
        super();
        this.host = host;
        this.descricao = descricao;
    }

    // const cheio
    public Podcast(String titulo, int totalReproducoes, int totalCurtidas, int classificacao, Podcast podcast, Musica musica, String host, String descricao) {
        super(titulo, totalReproducoes, totalCurtidas, classificacao, podcast, musica);
        this.host = host;
        this.descricao = descricao;
    }

    // setters and getters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}

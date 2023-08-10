package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    // variaveis
    private String album;
    private String artista;
    private String genero;

    // const vazio
    public Musica() {
        super();
    }

    // const com atributos da propria classe
    public Musica(String album, String artista, String genero) {
        super();
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    // const cheio
    public Musica(String titulo, int totalReproducoes, int totalCurtidas, int classificacao, String album, String artista, String genero) {
        super(titulo, totalReproducoes, totalCurtidas, classificacao);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    // setters and getters
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

}

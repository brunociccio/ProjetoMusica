package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

import javax.swing.JOptionPane;

public class Principal {

    // metodo static
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double decimal(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    static float racional(String j) {
        return Float.parseFloat(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        // instanciar objetos
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("KISS");
        minhaMusica.setGenero("Rock in Roll");

        Podcast meuPodcast = new Podcast();
        meuPodcast.setHost("BolhaDev");
        meuPodcast.setDescricao("Podcast sobre mercado de trabalho para desenvolvedores");

        for (int indice = 0; indice < 1000; indice++) {
            minhaMusica.reproduz();
        }

        for (int indice = 0; indice < 50; indice++) {
            minhaMusica.curte();
        }

        for (int indice = 0; indice < 5000; indice++) {
            meuPodcast.reproduz();
        }

        for (int indice = 0; indice < 1000; indice++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}

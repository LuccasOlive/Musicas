package br.com.musicas.principal;

import br.com.musicas.modelos.Musicas;
import br.com.musicas.modelos.Podcast;
import br.com.musicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("Maribor");
        musicas.setCantor("Transit");
        musicas.setAlbum("Whitewater");
        musicas.setGenero("Rock");

        for (int i = 0; i < 1000; i++) {
            musicas.reproduz();
        }

        for (int i = 0; i < 50; i++ ) {
            musicas.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BlackCat");
        podcast.setApresentador("Luccas Oliver");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musicas);
    }

}

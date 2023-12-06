package br.com.musicas.modelos;

public class Preferidas {

    public void inclui(Audio audio) {

        if (audio.getClassificacao() >= 2000){
            System.out.println(audio.getTitulo() + " è considerado sucesso no mundo " + "A melhor do mundo");
        } else {
            System.out.println(audio.getTitulo() + " Ate que tem como ouvir....");
        }
    }
}

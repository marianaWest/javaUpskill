package Aula6.TA.ex1;

public class Playlist {
    private int capacidade;
    private Musica[] playlist;

    public Playlist(int capacidade) {
        this.capacidade = capacidade;
        this.playlist = new Musica[capacidade];
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void adicionarMusica(Musica one) {
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] == null) {
                playlist[i] = one;
                break;
            }
        }
    }

    /*
    private int numMusicas = 0;

    public void addMusic(Musica musica) {
    playlist[numMusicas] = musica;
    numMusicas++
    }
     */

    public void removerMusica(String titulo) {

        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] != null) {
                if (playlist[i].getTitulo() == titulo) {
                    playlist[i] = null;
                }
            }
        }
    }


    public void listaMusicas() {
        for (int i = 0; i < playlist.length; i++) {
            Musica musica = playlist[i];
            System.out.println("musica " + musica);
        }
    }

    public double duracaoTotal() {
        double duracao = 0.0;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] == null) {
                duracao = duracao + 0;
            } else {
                duracao = duracao + playlist[i].getDuracao();
            }
        }
        return duracao;

    }
}

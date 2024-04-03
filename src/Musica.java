public class Musica {
    private String titulo;
    private String artista;
    private String duracaoSegundos;

    // Construtor
    public Musica(String titulo, String artista, String duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(String duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }
}

// Subclasse
class MusicaSpotify extends Musica {
    private String idSpotify;

    // Construtor
    public MusicaSpotify(String titulo, String artista, String duracaoSegundos, String idSpotify) {
        super(titulo, artista, duracaoSegundos);
        this.idSpotify = idSpotify;
    }

    // Método getter e setter específico para MusicaSpotify
    public String getIdSpotify() {
        return idSpotify;
    }

    public void setIdSpotify(String idSpotify) {
        this.idSpotify = idSpotify;
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de MusicaSpotify
        MusicaSpotify minhaMusica = new MusicaSpotify("3 Dias Virado", "Mc IG", "3:27", "4uLU6hMCjMI75M1A2tKUQC");

        // Acessando os atributos da superclasse e da subclasse
        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Artista: " + minhaMusica.getArtista());
        System.out.println("Duração: " + minhaMusica.getDuracaoSegundos() + " segundos");
        System.out.println("ID do Spotify: " + minhaMusica.getIdSpotify());
    }
}
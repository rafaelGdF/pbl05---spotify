import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static List<Usuario> usuarios = new ArrayList<>();
    static List<Playlist> playlists = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("----- BEM VINDO AO MENU DO SPOTIFY -----");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Criar playlist");
            System.out.println("3 - Adicionar música a playlist");
            System.out.println("4 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            switch(opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    criarPlaylist();
                    break;
                case 3:
                    adicionarMusicaPlaylist();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 4);

        scanner.close();
    }

    public static void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do usuário:");
        String email = scanner.nextLine();

        int id = random.nextInt(1000); // Gerando um ID aleatório entre 0 e 999
        Usuario usuario = new Usuario(id, nome, email);
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static void criarPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da playlist:");
        String nomePlaylist = scanner.nextLine();

        Playlist playlist = new Playlist(nomePlaylist);
        playlists.add(playlist);
        System.out.println("Playlist criada com sucesso!");
    }

    public static void adicionarMusicaPlaylist() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título da música:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o nome do artista:");
        String artista = scanner.nextLine();
        System.out.println("Digite a duração da música em segundos:");
        String duracao = scanner.nextLine();

        Musica musica = new Musica(titulo, artista, duracao);
        System.out.println("Escolha a playlist para adicionar a música:");
        for (int i = 0; i < playlists.size(); i++) {
            System.out.println((i + 1) + " - " + playlists.get(i).getNome());
        }
        int escolhaPlaylist = scanner.nextInt();
        if (escolhaPlaylist > 0 && escolhaPlaylist <= playlists.size()) {
            playlists.get(escolhaPlaylist - 1).adicionarMusica(musica);
            System.out.println("Música adicionada à playlist com sucesso!");
        } else {
            System.out.println("Playlist inválida.");
        }
    }
}
public class Usuario {
    private int ID;
    private String nome;
    private String email;

    public Usuario(int ID, String nome, String email) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


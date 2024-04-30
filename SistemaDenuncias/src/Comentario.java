import java.util.List;
import java.util.ArrayList;

public class Comentario {
    private int id;
    private String cidadao;
    private String comentario;
    private int likes;

    // Construtor
    public Comentario(int id, String cidadao, String comentario) {
        this.id = id;
        this.cidadao = cidadao;
        this.comentario = comentario;
        this.likes = 0;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getCidadao() {
        return cidadao;
    }

    public String getComentario() {
        return comentario;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // Adicionar like a um comentário
    public void adicionarCurtida() {
        this.likes++;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Denuncia {
    private int id;
    private int usuarioId;
    private String descricao;
    private String endereco;
    private String dataHora;
    private String status;
    private int curtidas;
    private List<Comentario> comentarios;

    public Denuncia() {
        this.comentarios = new ArrayList<>();
        this.curtidas = 0;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

   

    // Métodos de operação
    public void adicionarCurtida() {
        this.curtidas++;
    }

    public void adicionarComentario(String comentario, String cidadao) {
    int novoId = this.comentarios.size() + 1;
    Comentario novoComentario = new Comentario(novoId, cidadao, comentario);
    this.comentarios.add(novoComentario);
}


    public void cadastrarDenuncia(int usuarioId, String descricao, String endereco, String dataHora, String status, List<Denuncia> listaDenuncias){
        this.setId(listaDenuncias.size() + 1);
        this.setUsuarioId(usuarioId);
        this.setDescricao(descricao);
        this.setEndereco(endereco);
        this.setDataHora(dataHora);
        this.setStatus(status);
        listaDenuncias.add(this);
    }

    public void atualizarStatus(String tipoUsuario, String status) {
        if (tipoUsuario.equals("Administrador")) {
            this.setStatus(status);
        }
    }
}

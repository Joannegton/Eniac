import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        List<Denuncia> listaDenuncias = new ArrayList<Denuncia>();

        //cadastrar administrador
        Usuario adm = new Usuario();
        adm.cadastrarUsuario("Wellington Tavares", "teste@teste.com", "1234", "12345678912", "11123456789", "endereço qualquer, 22", "Administrador", listaUsuarios);
        
        //cadastrar Cidadao
        Usuario cidadao = new Usuario();
        String nome = "Kathellen Tavares";
        cidadao.cadastrarUsuario(nome, "teste@teste.com", "1234", "12345678912", "11123456789", "endereço qualquer, 22", "Cidadao", listaUsuarios);
        //cadastrar denuncia
        Denuncia denuncia = new Denuncia();
        denuncia.cadastrarDenuncia(1, "Entulho ocupando a passagem de carros, diminuindo a largura da rua.", "Rua dores de campos, 456", "30/04/2024", "Pendente", listaDenuncias);
        //curtindo e comentando na denuncia
        denuncia.adicionarComentario("Precisam retirar urgente!", nome);
        denuncia.adicionarCurtida();

        denuncia.atualizarStatus("Administrador", "Andamento");
        

        for (Denuncia u : listaDenuncias) {
            System.out.println("Descricao: " + u.getDescricao());
            System.out.println("Endereço: " +u.getEndereco());
            System.out.println("Data: " +u.getDataHora());
            System.out.println("Status: " +u.getStatus());
            System.out.println("Curtidas: " +u.getCurtidas());
            System.out.println("Comentarios: ");
            for (Comentario c : denuncia.getComentarios()) {
                System.out.println("- " + c.getComentario() + " de " + c.getCidadao() + " (" + c.getLikes() + " likes)");
            }
        }
       }
}
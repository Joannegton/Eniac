import java.util.List;

public class Usuario {
    protected int id;
    protected String nome, email, senha, cpf, telefone, endereco, tipoUsuario;
    

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
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
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    //metodos
    public void cadastrarUsuario(String nome, String email, String senha, String cpf, String telefone, String endereco, String tipoUsuario, List<Usuario> listaUsuarios){
        Usuario usuario = new Usuario();
        usuario.setId(listaUsuarios.size() + 1);
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setCpf(cpf);
        usuario.setTelefone(telefone);
        usuario.setEndereco(endereco);
        usuario.setTipoUsuario(tipoUsuario);
        listaUsuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuarios(List<Usuario> listaUsuarios){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println("ID: " + listaUsuarios.get(i).getId());
            System.out.println("Nome: " + listaUsuarios.get(i).getNome());
            System.out.println("Email: " + listaUsuarios.get(i).getEmail());
            System.out.println("CPF: " + listaUsuarios.get(i).getCpf());
            System.out.println("Telefone: " + listaUsuarios.get(i).getTelefone());
            System.out.println("Endereço: " + listaUsuarios.get(i).getEndereco());
            System.out.println("Tipo de Usuário: " + listaUsuarios.get(i).getTipoUsuario());
            System.out.println("-------------------------------------------------");
        }
    }

    public void editarUsuario(int id, String nome, String email, String senha, String cpf, String telefone, String endereco, String tipoUsuario, List<Usuario> listaUsuarios){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getId() == id) {
                listaUsuarios.get(i).setNome(nome);
                listaUsuarios.get(i).setEmail(email);
                listaUsuarios.get(i).setSenha(senha);
                listaUsuarios.get(i).setCpf(cpf);
                listaUsuarios.get(i).setTelefone(telefone);
                listaUsuarios.get(i).setEndereco(endereco);
                listaUsuarios.get(i).setTipoUsuario(tipoUsuario);
                System.out.println("Usuário editado com sucesso!");
                break;
            }
        }
    }


    public void excluirUsuario(int id, String tipoUsuario, List<Usuario> listaUsuarios){
        if (tipoUsuario == "Administrador") {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).getId() == id) {
                    listaUsuarios.remove(i);
                    System.out.println("Usuário excluído com sucesso!");
                    break;
                }
            }
        } else {
            System.out.println("Você não tem permissão para excluir usuários!");

                        
        }
    }
    
}

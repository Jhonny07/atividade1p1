public class Gerente extends Funcionario {
    private int senha = 2525;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentificacao(){
         if (getSenha()== 2525){
             return true;
         }
         else{
             return false;
         }
    }
}

public class Principal {
    public static void main(String []args){
        Gerente g= new Gerente();
        g.setNome("Augusto Rogerio");
        g.setCpf("20076852971");
        g.setSalario(2000.0);
        g.setSenha(2525);
        g.setDepartamento("Produção");
        
        
        System.out.println(g.getNome());
        System.out.println(g.getCpf());
        System.out.println(g.getDepartamento());
        System.out.println(g.getSenha());
        System.out.println(g.autentificacao());
        System.out.println(g.Bonificacao());


        

    }
}
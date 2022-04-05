public class Funcionario{
    private String nome;
    private String cpf;
    private Double salario;
    private String departamento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    } 

    public double Bonificacao(){
        double bonus = getSalario()*10/100;
        double total = getSalario()+ bonus;
        return bonus;
    }

    
    
}
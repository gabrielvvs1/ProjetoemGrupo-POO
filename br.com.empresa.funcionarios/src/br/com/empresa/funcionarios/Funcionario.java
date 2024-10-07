package br.com.empresa.funcionarios;


public class Funcionario {
	
	// Atributos da classe:
    private String nome;
    private int id;
    private double salarioPorHora;
    private String cpf;
    private String email;
    private double horasTrabalhadasNoMes;

    // Construtor da classe, usado para instanciar a Classe com os atributos
    public Funcionario(String nome, int id, double salarioPorHora, String cpf, String email, double horasTrabalhadasNoMes) {
        super();
        this.nome = nome;
        this.id = id;
        this.salarioPorHora = salarioPorHora;
        this.cpf = cpf;
        this.email = email;
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
    }

    // Métodos getter e setter para encapsulamento, usamos para modificar e acessar os atributos privados da classe
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadasNoMes;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadasNoMes = horasTrabalhadas;
    }
    
   
    // Método para calcular o salário do funcionário com base no número de horas trabalhadas no mês e no salário por hora
    public double calcularSalario() {
        return horasTrabalhadasNoMes * salarioPorHora;
    }

    // Método para exibir as informações do funcionário
    public void informacoesFuncionario() {
        System.out.println(" - Nome: " + nome);
        System.out.println(" - ID: " + id);
        System.out.println(" - CPF: " + cpf);
        System.out.println(" - Email: " + email);
        System.out.println(" - Salário por hora: R$ " + salarioPorHora);
        System.out.println(" - Horas trabalhadas no mês: " + horasTrabalhadasNoMes);
    }
}

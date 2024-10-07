package br.com.empresa.funcionarios;



public class Gerente extends Funcionario {
	//Classe "Gerente" herda da classe "Funcionario", isso significa que todos os métodos e 
	//Atributos estão disponivels na classe filha(Gerente)
	// Atributos da classe
    private double salarioBonusEmReais;
    private int qtdSubordinados;

    // Construtor da classe, usado para instanciar a Classe com os atributos dela e da classe Mãe(Funcionario)
    public Gerente(String nome, int id, double salarioPorHora, String cpf, String email, double horasTrabalhadasNoMes, double salarioBonusEmReais, int qtdSubordinados) {
        super(nome, id, salarioPorHora, cpf, email, horasTrabalhadasNoMes);
        this.salarioBonusEmReais = salarioBonusEmReais;
        this.qtdSubordinados = qtdSubordinados;
    }
    
    // Métodos getter e setter para encapsulamento, usamos para modificar e acessar os atributos privados da classe
    public double getSalarioBonusEmReais() {
        return salarioBonusEmReais;
    }

    public void setSalarioBonusEmReais(double salarioBonusEmReais) {
        this.salarioBonusEmReais = salarioBonusEmReais;
    }

    public int getQtdSubordinados() {
        return qtdSubordinados;
    }

    public void setQtdSubordinados(int qtdSubordinados) {
        this.qtdSubordinados = qtdSubordinados;
    }

    // Aqui temos o sobrescrita do método "informacoesFuncionario" da classe mãe(Funcionario), usamos o polimorfismo aqui

    @Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
        System.out.println(" - Bonus salarial: " + salarioBonusEmReais);
        System.out.println(" - Quantidade de subordinados: " + qtdSubordinados);
    }

    // Aqui temos o sobrescrita do método "calcularSalario" da classe mãe(Funcionario), usamos o polimorfismo aqui
    // Método alem de calcular o salario com base nas horas ele adiciona o bonus salarial
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + salarioBonusEmReais;
    }


}
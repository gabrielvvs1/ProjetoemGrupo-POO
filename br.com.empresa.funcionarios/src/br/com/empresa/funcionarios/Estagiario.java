package br.com.empresa.funcionarios;



public class Estagiario extends Funcionario {
	//Classe "Estagiario" herda da classe "Funcionario", isso significa que todos os métodos e 
	//Atributos estão disponivels na classe filha(Estagiario)
	
	// Atributos da classe
    private double valorValeAlimentacao;

    // Construtor da classe, usado para instanciar a Classe com os atributos dela e da classe Mãe(Funcionario)
    public Estagiario(String nome, int id, double salarioPorHora, String cpf, String email,
                      double horasTrabalhadasNoMes, double valorValeAlimentacao) {
        super(nome, id, salarioPorHora, cpf, email, horasTrabalhadasNoMes);
        this.valorValeAlimentacao = valorValeAlimentacao;
    }

    // Métodos getter e setter para encapsulamento, usamos para modificar e acessar os atributos privados da classe
    public double getValorValeAlimentacao() {
        return valorValeAlimentacao;
    }

    // Aqui temos o sobrescrita do método "informacoesFuncionario" da classe mãe(Funcionario), usamos o polimorfismo aqui
    @Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
        System.out.println(" - Valor do vale alimentação: " + valorValeAlimentacao);
    }
    
    // Aqui temos o sobrescrita do método "calcularSalario" da classe mãe(Funcionario), usamos o polimorfismo aqui
    // Método alem de calcular o salario com base nas horas ele adiciona o vale alimentação.
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorValeAlimentacao;
    }
}

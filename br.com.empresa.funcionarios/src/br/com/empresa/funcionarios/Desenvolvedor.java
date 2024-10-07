package br.com.empresa.funcionarios;


public class Desenvolvedor extends Funcionario {
	//Classe "Desenvolvedor" herda da classe "Funcionario", isso significa que todos os métodos e 
	//Atributos estão disponivels na classe filha(Desenvolvedor)
	
	
	// Atributos da classe
    private String linguagemDeProgramacao;
    private String framework;
    private String nivelSenioridade;


    // Construtor da classe, usado para instanciar a Classe com os atributos dela e da classe Mãe(Funcionario)
    public Desenvolvedor(String nome, int id, double salarioPorHora, String cpf, String email,
                         double horasTrabalhadasNoMes, String linguagemDeProgramacao, String framework, String nivelSenioridade) {
        super(nome, id, salarioPorHora, cpf, email, horasTrabalhadasNoMes);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
        this.framework = framework;
        this.nivelSenioridade = nivelSenioridade;
    }
    
    // Métodos getter e setter para encapsulamento, usamos para modificar e acessar os atributos privados da classe
    public String getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}

	public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	public String getNivelSenioridade() {
		return nivelSenioridade;
	}

	public void setNivelSenioridade(String nivelSenioridade) {
		this.nivelSenioridade = nivelSenioridade;
	}

    // Aqui temos o sobrescrita do método "informacoesFuncionario" da classe mãe(Funcionario), usamos o polimorfismo aqui
	@Override
    public void informacoesFuncionario() {
        super.informacoesFuncionario();
        System.out.println(" - Linguagem de programação: " + linguagemDeProgramacao);
        System.out.println(" - Framework: " + framework);
        System.out.println(" - Nivel de Senioridade: " + nivelSenioridade);
    }

	// Aqui temos o sobrescrita do método "calcularSalario" da classe mãe(Funcionario), usamos o polimorfismo aqui
    // Método alem de calcular o salario com base nas horas ele adiciona o bonus salarial com base no nivel de senoridade do desenvolvedor.
	
    @Override
    public double calcularSalario() {
        switch (nivelSenioridade.toLowerCase()) {
            case "junior":
                return super.calcularSalario() * 0.30;
            case "pleno":
                return super.calcularSalario() * 0.75;
            case "senior":
                return super.calcularSalario() * 0.95;
            default:
                return super.calcularSalario();
        }
    }
}
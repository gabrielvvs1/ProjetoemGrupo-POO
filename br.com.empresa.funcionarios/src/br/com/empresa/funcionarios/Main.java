package br.com.empresa.funcionarios;


public class Main {
    public static void main(String[] args) {
    	//DESENVOLVEDOR
        // Instanciando a classe Desenvolvedor
    	System.out.println("\n======================= *FUNCIONÁRIOS DA EMPRESA* =======================\n");
    	System.out.println(" (DESENVOLVEDORES)\n");
        Desenvolvedor dev = new Desenvolvedor("Paul Atreides", 202, 100.0, "123.456.789-00", "paulatreides@gmail.com", 160.0, "Java", "Spring", "pleno");
        // Exibir as informacoes
        dev.informacoesFuncionario();
        // Chamar o método de calcular o salario e exibi
        System.out.printf(" - Salário total: R$ %.2f%n",dev.calcularSalario());

        System.out.println("\n==========================================================================\n");
        
        //GERENTE
        // Instanciando a classe Gerente
        System.out.println(" (GERENTES)\n");
        Gerente gerente = new Gerente("Ana Priscila", 301, 155.0, "167.684.907-00", "anapriscila@gmail.com", 175.0, 5200.0, 10);
        // Exibindo as informações do gerente
        gerente.informacoesFuncionario();
        // Chamar o método de calcular o salario e exibi
        System.out.printf(" - Salário total: R$ %.2f%n",gerente.calcularSalario());
        
        System.out.println("\n==========================================================================\n");

        //ESTAGIÁRIO
        // Instanciando a classe Estagiario
        System.out.println(" (ESTAGIÁRIOS)\n");
        Estagiario estagiario = new Estagiario("Pedro Alves", 403, 31.0, "654.987.123-00", "pedroalves@gmail.com", 122.0, 300.0);
        // Exibindo as informações do estagiário
        estagiario.informacoesFuncionario();
        // Calculando e exibindo o salário
        System.out.printf(" - Salário total: R$ %.2f%n",estagiario.calcularSalario());
    }
}


public class Valores {
	Double valor1;
	Double valor2;
	Double resultado1;
	Double valor3;
	Double valor4;
	Double resultado2;

	Input input = new Input();
	Tela tela = new Tela();

	public void soma1() {
		valor1 = input.InformarValor("Informe o primeiro valor: ");

		valor2 = input.InformarValor("informe o segundo valor: ");

		resultado1 = valor1 + valor2;

		tela.mostrarTela("O Resultado dos dois primeiros valores é: " + resultado1);
	}

	public void soma2() {
		
		valor3 = input.InformarValor("Informe o terceiro valor: ");

		valor4 = input.InformarValor("Informe o quarto valor: ");

		resultado2 = valor3 + valor4;

		tela.mostrarTela("O resultado da segunda soma é: " + resultado2);
	}
	
	public void somaFinal() {
		
		Double somaFinal = resultado1 + resultado2;
		
		tela.mostrarTela("O Resultado final das duas operações somadas é: " + somaFinal);
	}

}


public class InverterNum {
	Double valor1;
	Double valor2;
	
	Tela tela = new Tela();
	Input input = new Input();
	
	public void Inverte() {
		valor1 = input.InformarValor("Digite um valor");
		tela.mostrarTela("o valor que você digitou é: " + valor1);
		
		valor2 = input.InformarValor("Digite um segundo valor");
		tela.mostrarTela("O segundo valor que você digitou é: " + valor2);
		
		Double swit1 = valor1 = valor2;
		tela.mostrarTela("O Valor 1 agora é: "+ swit1);
		Double swit2 = valor2 = valor1;
		tela.mostrarTela("O Valor 2 agora é: " + swit2);
	}
}

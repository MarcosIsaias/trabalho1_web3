
public class Sorveteria {

	// Catalogo de picoles
	Double picoleFruta;
	Double picoleRecheado;
	Double picoleCremoso;

	// Valor dos picoles
	Double valorPF = 2.5;
	Double valorPR = 3.5;
	Double valorC = 4.5;
	
	// Lucro das vendas de cada picole e o total
	Double lucroPF;
	Double lucroPR;
	Double lucroPC;
	Double lucroTotal;

	Tela tela = new Tela();
	Input input = new Input();

	public void vendaDePicole() {

		picoleFruta = input.InformarValor("Informe o valor de picoles de Frutas vendidos:");
		tela.mostrarTela("Quantidade de picoles de Frutas vendidos é: " + picoleFruta);
		
		lucroPF = valorPF * picoleFruta;

		tela.mostrarTela("O valor arrecadado deste picole é: R$ " + lucroPF);

		picoleRecheado = input.InformarValor("Informe o valor de picoles recheados vendidos:");
		tela.mostrarTela("Quantidade de picoles de Recheado vendidos é: " + picoleRecheado);
		
		lucroPR = valorPR * picoleRecheado;
		
		tela.mostrarTela("O valor arrecadado deste picole é: R$ " + lucroPR);

		picoleCremoso = input.InformarValor("Informe o valor de picoles cremosos vendidos:");
		tela.mostrarTela("Quantidade de picoles de cremosa vendidos é: " + picoleCremoso);
		
		lucroPC = valorC * picoleCremoso;
		tela.mostrarTela("O valor arrecadado deste picole é: R$ " + lucroPC);

	}

	public void lucroDaVenda() {
		
		lucroTotal = lucroPF + lucroPR + lucroPC;
		
		tela.mostrarTela("Lucro das vendas de picoles de todos os sabores é: R$ " + lucroTotal);
	}

}

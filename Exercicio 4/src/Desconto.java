
public class Desconto {
	Double valor;
	Double desconto = 10.0;
	Double preco;
	Tela tela = new Tela();
	Input input = new Input();

	public void Operacao() {
		
		valor = input.InformarValor("Informe o valor de um produto");
		
		preco = valor / 100 * desconto;
		
		tela.mostrarTela("Você ganhou um desconto de 10% "
				+ "sobre o produto,\n o valor sera:  " + preco);
	}
}

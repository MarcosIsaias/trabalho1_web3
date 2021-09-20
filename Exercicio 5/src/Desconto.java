
public class Desconto {
	Double valor;
	Double desconto;
	Double preco;
	Double novoPreco;
	Tela tela = new Tela();
	Input input = new Input();
	
	
	public void Operacao() {
		
		desconto = input.InformarValor("Informe o valor do desconto: ");
		
		valor = input.InformarValor("Informe o valor de um produto");
		
		preco = valor / 100 * desconto;
		
		tela.mostrarTela("Você ganhou um desconto de " + desconto + "%" 
				+ "sobre o produto,\n o valor do produto");
		
		novoPreco = valor - desconto;
		
		tela.mostrarTela("O valor do produto sera: " + novoPreco);
	}
}
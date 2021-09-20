
public class Quadrado {
	Double lado;
	Double area;
	Tela tela = new Tela();
	Input input = new Input();
	
	public void ladosDoQuadrado() {
		
		lado = input.InformarValor("Informe o valor da lateral de um quadrado: ");
		
		area = lado * lado;
		
		tela.mostrarTela("A área do Quadrado é: " + area);
		
	}

}

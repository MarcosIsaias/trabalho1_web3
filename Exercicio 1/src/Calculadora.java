
public class Calculadora {

	// avalia��es do semestre do aluno
	double nota1;
	double nota2;
	double nota3;

	double resultado; // Soma das notas do aluno
	double media; // Resultado da m�dia do semestre

	Input input = new Input();
	Tela tela = new Tela();

	public void somar() {

		nota1 = input.informarValor("Informe");

		nota2 = input.informarValor("Informe a segunda nota do semestre do aluno: ");

		nota3 = input.informarValor("Informe a terceira nota do semestre do aluno: ");

		resultado = nota1 + nota2 + nota3;

		tela.mostrarMenssagem("A Soma das notas do aluno �: " + resultado);
	}

	public void dividir() {

		media = resultado / 2;

		tela.mostrarMenssagem("A media das notas do aluno �: " + media);

	}

}

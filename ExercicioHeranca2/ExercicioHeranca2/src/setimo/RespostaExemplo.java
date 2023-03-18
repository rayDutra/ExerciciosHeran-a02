package setimo;

public class RespostaExemplo {
	
	/*(sobrecarga) Quais são as regras para a utilização de sobrecarga de método? Forneça um exemplo em código Java.
	-Precisa ter uma lista de parâmetros diferente.
	-Pode possuir tipos de retorno diferentes.
	-Pode possuir modificadores de acesso diferentes.
	-Pode lançar exceções diferentes.*/
	
	class Calculadora {
	    public int soma(int x, int y) {
	        return x + y;
	    }

	    public double soma(double x, double y) {
	        return x + y;
	    }

	    public int soma(int x, int y, int z) {
	        return x + y + z;
	    }
	}


}

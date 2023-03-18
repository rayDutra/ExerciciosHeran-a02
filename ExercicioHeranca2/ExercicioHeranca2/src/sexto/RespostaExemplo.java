package sexto;

public class RespostaExemplo {

	/*(sobrescrita) Quais são as regras para a utilização de sobrescrita de método? Forneça um exemplo em código Java.
     -Deve possuir a mesma lista de parâmetros.
     -Deve possuir o mesmo tipo de retorno: embora um retorno covariante nos permita alterar o tipo de retorno do método sobrescrito.
     -Não pode possuir um modificador de acesso mais restritivo: deve possuir um modificador de acesso menos restritivo.
     -Não deve lançar uma exceção verificada (checked exception) nova ou mais ampla: pode lançar exceções verificadas mais restritas e pode lançar qualquer exceção não verificada.
      -Apenas métodos herdados podem ser sobrescritos (é necessário um relacionamento É UM).*/
	public class Pessoa {
	    public void apresentar() {
	        System.out.println("Eu sou uma pessoa!");
	    }
	}

	public class Estudante extends Pessoa {
	    @Override
	    public void apresentar() {
	        System.out.println("Eu sou um estudante!");
	    }
	}
	
}

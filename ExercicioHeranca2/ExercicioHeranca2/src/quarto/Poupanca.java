package quarto;

public class Poupanca extends Conta {
    private int diaRendimento;

    public Poupanca(double saldo, int diaRendimento) {
        super(saldo);
        this.diaRendimento = diaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() - valor >= 0) {
            setSaldo(getSaldo() - valor);
        }
    }
}
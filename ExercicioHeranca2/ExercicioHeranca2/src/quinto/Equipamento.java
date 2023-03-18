package quinto;

public class Equipamento {
    private boolean ligado;

    public void liga() {
        this.ligado = true;
    }

    public void desliga() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }
}
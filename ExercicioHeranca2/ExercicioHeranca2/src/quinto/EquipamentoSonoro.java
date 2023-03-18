package quinto;

public class EquipamentoSonoro extends Equipamento {
    private int volume;
    private boolean stereo;

    public void mono() {
        this.stereo = false;
    }

    public void stereo() {
        this.stereo = true;
    }

    @Override
    public void liga() {
        super.liga();
        this.volume = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isStereo() {
        return stereo;
    }
}


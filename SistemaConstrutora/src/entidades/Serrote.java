package entidades;

public class Cerrote extends Ferramenta{
    
    private int qtdeDentes;

    private Cor cor;

    public Cerrote() {

    }

    public int getQtdeDentes() {
        return qtdeDentes;
    }

    public void setQtdeDentes(int qtdeDentes) {
        this.qtdeDentes = qtdeDentes;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
}

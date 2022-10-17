import entidades.Serrote;
import entidades.Cor;
import entidades.Martelo;
import entidades.Pedreiro;
import entidades.TipoDeCabo;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Pedreiro pedreiro = new Pedreiro();
        pedreiro.setCodigo(1);
        pedreiro.setNomeCompleto("murilo Vieira Cruz");

        Serrote serrote = new Serrote();
        serrote.setCodigo(1);
        serrote.setCor(Cor.CINZA);
        serrote.setDescricaoCurta("Serrote bom");
        serrote.setPeso(1.5);
        serrote.setQtdeDentes(11);

        
        Martelo martelo = new Martelo();
        martelo.setCodigo(2);
        martelo.setDescricaoCurta("Martelo top");
        martelo.setPeso(0.5);
        martelo.setTipoDeCabo(TipoDeCabo.FIBRA);

        pedreiro.usar(martelo);
        pedreiro.usar(serrote);
    }
}

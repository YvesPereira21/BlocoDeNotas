import java.util.ArrayList;
import java.util.List;

public class BlocoDeNotas {

    List<Anotacao> Anotacoes= new ArrayList();


    public void adiciona(String textao){
        Anotacao anotacao = new Anotacao(textao, Anotacoes.size());
        Anotacoes.add(anotacao);
    }

}

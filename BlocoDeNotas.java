import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlocoDeNota {

    Scanner sc = new Scanner(System.in);
    List<Anotacao> Anotacoes= new ArrayList();
    List<Anotacao> notasDeletadas = new ArrayList<>();
    //adicionar, editar, buscar com id ou texto, deletar e listar.

    public void adiciona(String textao){
        Anotacao anotacao = new Anotacao(textao, Anotacoes.size() + 1);
        Anotacoes.add(anotacao);
    }

    public void editarAnotacao(int id, String textoEditado){
        Anotacao notaEditada = buscarNota(id);
        notaEditada.setTextao(textoEditado);
    }

    public Anotacao buscarNota(int id){
        return Anotacoes.get(id);
    }

    public String pesquisarAnotacao(String textoBuscar){
        String textos = "";
        for (Anotacao anota: Anotacoes) {
            if(anota.getTextao().contains(textoBuscar)){
                textos += (anota.toString());
                return textos;
            }
        }
        return null;
    }

    public String deletaAnotacao(int id){
        for (Anotacao notaDeletar : Anotacoes) {
            if(notaDeletar.getId() == id){
                Anotacao a = Anotacoes.get(id);
                notasDeletadas.add(a);
                Anotacoes.remove(id);
                return Anotacoes.toString();
            }
        }
        return null;
    }

    public void recuperaAnotacao(int id){
        for (Anotacao notaDeletada: notasDeletadas) {
            if(notaDeletada.getId() == id){
                Anotacao a = Anotacoes.get(id);
                Anotacoes.add(a);
                notasDeletadas.remove(id);
            }
        }
    }

    public String retornaAnotacoes(){
        for (Anotacao anot: Anotacoes) {
            System.out.println(anot.toString());
        }
        return null;
    }

    public String retornaAnotacaoRemovida(){
        String anotacoesRemovidas = "";
        for (Anotacao recuperaNota: notasDeletadas) {
            anotacoesRemovidas += recuperaNota.toString();
        }
        return anotacoesRemovidas;
    }


}

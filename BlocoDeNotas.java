import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlocoDeNota {

    Scanner sc = new Scanner(System.in);
    List<Anotacao> Anotacoes= new ArrayList();
    List<Anotacao> notasDeletadas = new ArrayList<>();
    //adicionar, editar, recuperar com id ou texto, deletar e listar.


    public void adiciona(String textao){
        Anotacao anotacao = new Anotacao(textao, Anotacoes.size() + 1);
        Anotacoes.add(anotacao);
    }

    public void editarNota(int id, String textoEditado){
        Anotacao notaEditada = buscarNota(id);
        notaEditada.setTextao(textoEditado);
    }
    public Anotacao buscarNota(int id){
        return Anotacoes.get(id - 1);
    }

    public String pesquisarAluno(String textoBuscar){
        String textos = "";
        for (Anotacao anota: Anotacoes) {
            if(anota.getTextao().contains(textoBuscar)){
                textos += (anota.toString());
            }
        }
        return textos;
    }

    public void deletaNota(int id){
        for (Anotacao notaDeletar: Anotacoes) {
            if(notaDeletar.getId() == id - 1){
                Anotacao a = Anotacoes.get(id - 1);
                notasDeletadas.add(a);
                Anotacoes.remove(id - 1);
            }
        }
    }

    public void recuperaNota(int id){
        for (Anotacao notaDeletada: notasDeletadas) {
            if(notaDeletada.getId() == id){
                Anotacao a = Anotacoes.get(id - 1);
                Anotacoes.add(a);
                notasDeletadas.remove(id - 1);
            }
        }
    }

    @Override
    public String toString(){

        String todasAnotacoes = "";
        for (Anotacao aluno: Anotacoes) {
            todasAnotacoes += (aluno.toString());
        }
        return todasAnotacoes;
    }


}

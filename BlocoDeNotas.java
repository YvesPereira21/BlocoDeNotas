import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlocoDeNota {

    Scanner sc = new Scanner(System.in);
    List<Anotacao> Anotacoes= new ArrayList();
    //adicionar, editar, recuperar com id ou texto, deletar e listar.
    public Anotacao getAnotacaoId(int id){
        System.out.println("id que deseja pegar: ");
        Anotacao pegaId = Anotacoes.get(id - 1);
        return pegaId;
    }


    public void adiciona(String textao){
        Anotacao anotacao = new Anotacao(textao, Anotacoes.size() + 1);
        Anotacoes.add(anotacao);
    }

    public void editarNota(int id, String textoEditado){
        Anotacao notaEditada = getAnotacaoId(id);
        notaEditada.setTextao(textoEditado);
    }
    public void recuperarNota(int id){
        System.out.println("Qual o id da anotação que deseja recuperar? ");
        int anotacaoEditar = Anotacoes.indexOf(sc.nextInt());
        String texto = sc.next();
        Anotacoes.get(anotacaoEditar);
    }

    public void recuperarNota(String buscoTexto){


        for (int i = 0; i < Anotacoes.size(); i++) {
            Anotacao an = Anotacoes.get(i);
            buscoTexto = sc.next();
            if (an.getTextao().contains(buscoTexto)){
                System.out.println(an.toString());
            }
        }
    }
    public void setAnotacoes(List<Anotacao> anotacoes) {
        Anotacoes = anotacoes;
    }
}

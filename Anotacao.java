import java.time.LocalDate;
import java.util.Scanner;

public class Anotacao extends BlocoDeNota{

    public String textao;
    public LocalDate data;
    public int id;
    public boolean remover = false;
    Scanner sc = new Scanner(System.in);

    public Anotacao(String textao, int id){

        this.textao = textao;
        LocalDate data = LocalDate.now();
    }
    public String getTextao(){
        return textao;
    }
    public void setTextao(String textoEditado){
        textoEditado = textao;
    }
    public Anotacao getId(){
        System.out.println("id que deseja pegar: ");
        Anotacao pegaId = Anotacoes.get(id - 1);
        return pegaId;
    }
    public void isRemover() {
        if (remover != false){
            System.out.println("Qual o id da anotação que deseja deletar? ");
            int anotacaoDeletar = Anotacoes.indexOf(sc.nextInt());
            Anotacoes.remove(anotacaoDeletar);
        }
    }



    public String toString() {
        return "Id " + id + "\n" + getTextao() + "\n" + data;
    }

}

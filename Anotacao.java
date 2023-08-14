import java.time.LocalDate;
import java.util.Scanner;

public class Anotacao extends BlocoDeNotas{

    public String textao;
    public LocalDate data;
    public int id;
    public boolean remover = false;
    BlocoDeNotas bloquinho = new BlocoDeNotas();
    Scanner sc = new Scanner(System.in);

    public Anotacao(String textao, int id){

        this.textao = textao;
        LocalDate data = LocalDate.now();
    }


    public int getId() {
        return id;
    }

    public void isRemover() {
        while (remover != false){
            System.out.println("Qual o id da anotação que deseja deletar? ");
            int anotacaoDeletar = Anotacoes.indexOf(sc.nextInt());
            Anotacoes.remove(anotacaoDeletar);
        }
    }



    public String toString() {
        return textao;
    }
}

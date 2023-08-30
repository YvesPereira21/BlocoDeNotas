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
        this.data = LocalDate.now();
        this.id = id;
    }
    public String getTextao(){
        return textao;
    }
    public void setTextao(String textoEditado){
        textao = textoEditado;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void isRemover(int id) {;
        Anotacoes.remove(id);

    }

    public String toString() {
        return "Id: " + id + "\n" + getTextao() + "\n" + data;
    }

}



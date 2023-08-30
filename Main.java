import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BlocoDeNota bc = new BlocoDeNota();
        boolean condParada = false;

        System.out.println("Bem vindo ao Bloco de notas!");
        System.out.println("Qual opção deseja realizar? ");
        System.out.println("Digite 1 se deseja criar uma anotação\n" +
                "Digite 2 se deseja editar alguma anotação\n" +
                "Digite 3 se deseja buscar alguma anotação com o id\n" +
                "Digite 4 se deseja buscar alguma anotação com o texto\n" +
                "Digite 5 se deseja deletar alguma anotação\n" +
                "Digite 6 se deseja retornar a lista de anotações\n" +
                "Digite 7 se deseja retornar a lista de lixeira.\n" +
                "Digite 8 se deseja sair.");

        do{
            System.out.println("Qual opção deseja realizar? ");
            int opcao = sc.nextInt();
            if (opcao < 1 && opcao > 9){
                System.out.println("Opção inválida! Digite a opção correta.");
                opcao = sc.nextInt();
            }
            switch (opcao){
                case 1:
                    System.out.println("Digite o que você quer anotar: ");
                    sc.nextLine();
                    String texto = sc.nextLine();

                    bc.adiciona(texto);
                    break;
                case 2:
                    System.out.println("Digite o id e depois a nova anotação: ");
                    int id = sc.nextInt();

                    String novoTexto = sc.next();

                    bc.editarAnotacao(id, novoTexto);
                    break;
                case 3:
                    System.out.println("Digite o id da anotação que procura: ");
                    int idBuscar = sc.nextInt();

                    bc.buscarNota(idBuscar);
                    break;
                case 4:
                    System.out.println("Digite o texto da anotação que procura: ");
                    sc.nextLine();
                    String textoBuscar = sc.nextLine();

                    bc.pesquisarAnotacao(textoBuscar);
                    break;
                case 5:
                    System.out.println("Digite o id da anotação que deseja deletar: ");
                    int idDeletar = sc.nextInt();

                    bc.deletaAnotacao(idDeletar);
                    break;
                case 6:
                    System.out.println("Digite o id da anotação que deseja recuperar: ");
                    int idRecuperar = sc.nextInt();

                    bc.recuperaAnotacao(idRecuperar);
                case 7:
                    bc.retornaAnotacoes();
                    break;
                case 8:
                    System.out.println(bc.retornaAnotacaoRemovida());
                    break;
                case 9:
                    condParada = true;
                    break;

            }

        }while(!condParada);







    }
}

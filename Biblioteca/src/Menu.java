import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.Scanner;
public class Menu {
    private int option;

    public void menu(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Opções \n 1. Cadastrar Livro \n 2.Cadastrar Amigo \n 3. Emprestar Livro \n 4. Devolução \n 5. Sair");
        option = input.nextInt();
        System.out.print("Opção escolhida : ");
        BookRegister bookRegister = new BookRegister("teste");

        switch (option){
            case 1 :
            System.out.println("1. Cadastrar Livro");
            System.out.println(bookRegister.getCode());
            break;
            case 2 : 
            System.out.println("2.Cadastrar Amigo");
            break;
            case 3 :
            System.out.println("3. Emprestar Livro");
            break;
            case 4 :
            System.out.println("4. Devolução");
            break;
            case 5 :
            System.out.println("5. Sair");
            break;
            default :
            System.out.println("Opção inválida");
        }
    }
}

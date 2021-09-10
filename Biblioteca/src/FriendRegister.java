import java.util.ArrayList;
import java.util.Scanner;

public class FriendRegister extends Friend {

    Scanner input = new Scanner(System.in);
    
    public FriendRegister() {
        super();
    }

    private ArrayList<String> Arrayname;

    public void ArrayFriend(ArrayList<String> Arrayname){
        this.Arrayname = Arrayname;
    }

    public void Register(){
        
        System.out.print("Codigo do novo amigo: ");
        super.friendCode = input.nextLine();
        setFriendCode(super.friendCode); 
        input.nextLine(); 

        System.out.print("Nome do novo amigo: ");
        super.name = input.nextLine();
        setName(super.name);
        input.nextLine(); 

        System.out.print("Telefone do novo amigo: ");
        super.phone = input.nextLine();
        setPhone(super.phone);
        input.nextLine(); 

        System.out.print("Data de nascimento do novo amigo: ");
        super.birthDay = input.nextLine();
        setBirthDay(super.birthDay);
        input.nextLine();

        System.out.print("Endereço do novo amigo: ");
        super.address = input.nextLine();
        setAddress(super.address);
        input.nextLine();

        System.out.print("E-mail do novo amigo: ");
        super.email = input.nextLine();
        setEmail(super.email);
        input.nextLine();

        System.out.print("CPF do novo amigo: ");
        super.cpf = input.nextLine();
        setCpf(super.cpf);
        input.nextLine();

        System.out.print("Genero do novo amigo: ");
        super.sex = input.nextLine();
        setSex(super.sex);
        input.nextLine();
    }  
}

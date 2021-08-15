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

    public void Register(String friendCode, String name, String phone, String birthDay, String address, String email,
    String cpf, String sex){
        
        System.out.print("Codigo do novo amigo: ");
        friendCode = input.nextLine();
        setFriendCode(friendCode); 
        input.nextLine(); 

        System.out.print("Nome do novo amigo: ");
        name = input.nextLine();
        setName(name);
        input.nextLine(); 

        System.out.print("Telefone do novo amigo: ");
        phone = input.nextLine();
        setPhone(phone);
        input.nextLine(); 

        System.out.print("Data de nascimento do novo amigo: ");
        phone = input.nextLine();
        setBirthDay(birthDay);
        input.nextLine();

        System.out.print("Endereço do novo amigo: ");
        phone = input.nextLine();
        setAddress(address);
        input.nextLine();

        System.out.print("Endereço do novo amigo: ");
        phone = input.nextLine();
        setEmail(email);
        input.nextLine();

        System.out.print("CPF do novo amigo: ");
        phone = input.nextLine();
        setCpf(cpf);
        input.nextLine();

        System.out.print("Genero do novo amigo: ");
        phone = input.nextLine();
        setSex(sex);
        input.nextLine();
    }
   
}

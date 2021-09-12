import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

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

        RegisterForm();

        // Execute the write method
        write();
    }

    public void RegisterForm(){
        System.out.println("------------------------------------------------------");
        System.out.println("   O registor relizado foi de 1 amigo:");
        System.out.println("         Código: " + super.friendCode);
        System.out.println("         Nome: " + super.name);
        System.out.println("         Telefone: " + super.phone);
        System.out.println("         Data de nasciment: " + super.birthDay);
        System.out.println("         Endereço: " + super.address);
        System.out.println("         E-mail: " + super.email);
        System.out.println("         CPF: " + super.cpf);
        System.out.println("         Sexo: " + super.sex);
    }
    
    // Save the registration data in a txt file
    public void write(){

        try{
            FileWriter fw;
            fw = new FileWriter("arq.txt", true);
            fw.write("\n"+super.friendCode);
            fw.write("\n"+ super.name);
            fw.write("\n"+ super.phone);
            fw.write("\n"+ super.birthDay);
            fw.write("\n"+ super.address);
            fw.write("\n"+ super.email);
            fw.write("\n"+ super.cpf);
            fw.write("\n"+ super.sex);
            fw.close();
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        }
    }
}

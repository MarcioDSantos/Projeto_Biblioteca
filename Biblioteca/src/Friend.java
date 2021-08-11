import java.util.ArrayList;

public class Friend {
    protected String friendCode;
    protected String name;
    protected String phone;
    protected String birthDay; // atravez da data de nascimento mostrar a idade
    protected String address;
    protected String email;
    protected String cpf;
    protected String sex;
    protected ArrayList<String> Arrayname;

    public Friend(String friendCode, String name, String phone, String birthDay, String address, String email,
            String cpf, String sex) {
        this.friendCode = friendCode;
        this.name = name;
        this.phone = phone;
        this.birthDay = birthDay;
        this.address = address;
        this.email = email;
        this.cpf = cpf;
        this.sex = sex;
    }

    public Friend(ArrayList<String> Arrayname){
        this.Arrayname = Arrayname;
    }

    

    
    
}

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
    public Object register;

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

    public String getFriendCode() {
        return this.friendCode;
    }

    public String getName() {
        return this.name;
    }
    
    public String getPhone() {
        return this.phone;
    }

    public String getBirthDay() {
        return this.birthDay;
    }

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSex() {
        return this.sex;
    }

}

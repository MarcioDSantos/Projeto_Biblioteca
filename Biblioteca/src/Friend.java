import java.util.ArrayList;

public class Friend {
    private String friendCode;
    private String name;
    private String phone;
    private String birthDay; // atravez da data de nascimento mostrar a idade
    private String address;
    private ArrayList<String> Arrayname; 
    private String email;
    private String cpf;
    private String sex;

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
        return friendCode;
    }

    public void setFriendCode(String friendCode) {
        this.friendCode = friendCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    
    
}

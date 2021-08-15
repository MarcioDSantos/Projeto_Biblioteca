public class Friend {
    protected ArrayList <String> friend = new ArrayList<>();
    protected String friendCode;
    protected String name;
    protected String phone;
    protected String birthDay; // atravez da data de nascimento mostrar a idade
    protected String address;
    protected String email;
    protected String cpf;
    protected String sex;
<<<<<<< HEAD

=======
    
    
>>>>>>> f45d39317cc9dc6eca572fac10010cb351654ec9

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

    public Friend() {
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
    public void friend(){
        
    }

    public void setFriendCode(String friendCode) {
        this.friendCode = friendCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSex(String sex) {
        this.sex = sex;
    } 

}

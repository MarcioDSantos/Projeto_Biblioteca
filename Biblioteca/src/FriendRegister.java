public class FriendRegister extends Friend {

    public FriendRegister(String friendCode, String name, String phone, String birthDay, String address, String email,
            String cpf, String sex) {
        super(friendCode, name, phone, birthDay, address, email, cpf, sex);
    }

    public void setFriendCode(String friendCode) {
        super.friendCode = friendCode;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setPhone(String phone) {
        super.phone = phone;
    }

    public void setBirthDay(String birthDay) {
        super.birthDay = birthDay;
    }

    public void setAddress(String address) {
        super.address = address;
    }

    public void setEmail(String email) {
        super.email = email;
    }

    public void setCpf(String cpf) {
        super.cpf = cpf;
    }

    public void setSex(String sex) {
        super.sex = sex;
    } 

    public void Register(String friendCode, String name){

     setFriendCode(friendCode);  
     setName(name);
     
    }
   
}

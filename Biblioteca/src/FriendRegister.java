public class FriendRegister {
    //cadastrar amigos com nome data de nascimento endereço telefone
    private String friendCode;
    private String name;
    private String phone;
    private String birthDay; // atravez da data de nascimento mostrar a idade
    private String address;

    public FriendRegister(String friendCode, String name, String phone, String birthDay, String address){
        this.friendCode = friendCode;
        this.name = name;
        this.phone = phone;
        this.birthDay = birthDay;
        this.address = address;
    }
}

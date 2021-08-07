public class BookRegister {
    private String code;
    private String publishingCompany;
    private String title;
    private String author;
    private double price;
    private int pageNumber;

    public BookRegister (String title, String author, double price, int pageNumber, String publishingCompany){
      this.title = title;
      this.publishingCompany = publishingCompany;
      this.author = author;
      this.price = price;
      this.pageNumber = pageNumber;
    }

    public BookRegister( String code){
        this.code = code;
    }

    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
}

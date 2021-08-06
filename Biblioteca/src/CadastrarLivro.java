public class CadastrarLivro {
    private int codigo;
    private String titulo;
    private String autor;
    private double valorPago;

    public CadastrarLivro (String titulo, String autor, double valor){
        this.titulo = titulo;
        this.autor = autor;
        this.valorPago = valor;
    }
}

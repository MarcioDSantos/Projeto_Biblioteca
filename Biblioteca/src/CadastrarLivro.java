public class CadastrarLivro {
    private int codigo;
    private String titulo;
    private String autor;
    private double valorPago;
    private int numeroPaginas;

    public CadastrarLivro (String titulo, String autor, double valor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.valorPago = valor;
        this.numeroPaginas = numeroPaginas;
    }
}

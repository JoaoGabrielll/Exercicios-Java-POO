public class LivroDeBiblioteca {
    String cadastroLivro;
    boolean emprestado;

    public void emprestimoDeLivro(){
        if (this.emprestado == true){
            System.out.println("Livro emprestado");
        }else{
            System.out.println("Livro disponivel");
        }
    }
}

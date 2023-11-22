public class Main {
    public static void main(String[]args){

        Livro livro = new Livro();

        livro.nomeLivro = "Arte da Guerra";
        livro.tema = "Guerra";
        livro.classificacao = "Adulto";
        livro.idioma = "Português";
        livro.quantPaginas = 160;
        livro.preco = 48.99;

        System.out.println("Nome do livro: " + livro.nomeLivro);
        System.out.println("Tema: " + livro.tema);
        System.out.println("Classificação: " + livro.classificacao);
        System.out.println("Idioma: " + livro.idioma);
        System.out.println("Páginas: " + livro.quantPaginas);
        System.out.println("Preço: " + livro.preco);
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Biblioteca blib = new Biblioteca();

        Livro l1 = new Livro("A Arte da Guerra", "Sun Tzu");
        Livro l2 = new Livro("O principe", "Maquiavel");
        Livro l3 = new Livro("Meditações", "Marco Aurélio");
        //Livro l4 = new Livro(null, null); lança o throw
        //Livro l5 = new Livro("Senna o Herói revelado", null); lança a throw tbm.
        //Livro l6 = new Livro(null, "Jõao"); lança a throw tbm.
        //Livro l7 = new Livro("", ""); lança a throw tbm.

        blib.AdicionarLivro(l1);
        blib.AdicionarLivro(l2);
        blib.AdicionarLivro(l3);

        blib.ListarLivros();
        System.out.println();

        blib.EmprestarLivro("A Arte da Guerra");
        blib.ListarLivros();
        System.out.println();

        blib.EmprestarLivro("Meditações");
        blib.DevolverLivro("A Arte da Guerra");
        blib.ListarLivros();
    }
}

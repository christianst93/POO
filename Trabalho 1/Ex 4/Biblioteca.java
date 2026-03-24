import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
    }

    public void AdicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void EmprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {

                if (!livro.isDisponivel()) {
                    throw new IllegalStateException("O livro já está emprestado!");
                }

                livro.setDisponivel(false);
                return;
            }
        }
        throw new IllegalArgumentException("Livro não encontrado!");
    }

    public void DevolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.setDisponivel(true);
                return;
            }
        }
        throw new IllegalArgumentException("Livro não encontrado!");
    }

    public void ListarLivros() {
        for (Livro livro : this.livros) {
            System.out.println("Livro: " + livro.getTitulo() + 
                            "| Autor: " + livro.getAutor() + 
                            "| Disponivel?: " + (livro.isDisponivel() ? "Sim" : "Não"));
        }
    }
}
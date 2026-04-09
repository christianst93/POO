import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        ProdutoFisico pf = new ProdutoFisico("Camisa Bezerk", 69.90, 1.02f);
        ProdutoDigital pd = new ProdutoDigital("GTA IV", 700, 150);
        ProdutoImportado pi = new ProdutoImportado("PS5", 3500);

        produtos.add(pf);
        produtos.add(pd);
        produtos.add(pi);

        try {
            for (Produto produto : produtos) {
                produto.resumoDetalhado();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
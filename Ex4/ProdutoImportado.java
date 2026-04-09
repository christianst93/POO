public class ProdutoImportado extends Produto{

    private final double TAXA_IMPORTACAO = 1.15;

    public ProdutoImportado(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * TAXA_IMPORTACAO;
    }
    
}

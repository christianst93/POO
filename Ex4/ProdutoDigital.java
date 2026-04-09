public class ProdutoDigital extends Produto {

    private double taxaLicensa;

    public ProdutoDigital(String nome, double precoBase, double taxaLicensa) {
        super(nome, precoBase);
        if (taxaLicensa < 0) {
            throw new IllegalArgumentException("A taxa de licensa nao pode ser menor que zero!");
        }
        validarPreco(taxaLicensa);
        this.taxaLicensa = taxaLicensa;
    }

    @Override
    public double calcularPrecoFinal() {
        if (taxaLicensa == 0) {
            return getPrecoBase();
        }
        return getPrecoBase() + taxaLicensa;
    }
    
}

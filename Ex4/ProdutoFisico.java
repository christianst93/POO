public class ProdutoFisico extends Produto {
    private double taxaEnvio;

    public ProdutoFisico(String nome, double precoBase, double taxaEnvio) {
        super(nome, precoBase);
        if (taxaEnvio < 0) {
            throw new IllegalArgumentException("O valor da taxa de envio nao pode ser menor que zero!");
        }
        validarPreco(taxaEnvio);
        this.taxaEnvio = taxaEnvio;
    }

    @Override
    public double calcularPrecoFinal() {
        if (taxaEnvio == 0) {
            return getPrecoBase();
        }
        return getPrecoBase() * taxaEnvio;
    }
    
}

public abstract class Produto {
    private String nome;
    private double precoBase;
    
    public Produto(String nome, double precoBase) {
        setNome(nome);
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void validarPreco(double preco) {
        if (calcularPrecoFinal() <= 0) {
            throw new IllegalArgumentException("Preço inválido! Deve ser maior que zero!");
        }
    }

    public abstract double calcularPrecoFinal();

    public void resumoDetalhado() {
        System.out.println("Produto: " + getNome());
        System.out.printf("Preço base: %.2f" , getPrecoBase());
        System.out.printf("\nPreço final: %.2f" , calcularPrecoFinal());
        System.out.println("\n----------------");
    }
}

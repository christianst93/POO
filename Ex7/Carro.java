public class Carro extends  VeiculoFrota{

    public Carro(String placa, String modelo, double consumoBase) {
        super(placa, modelo, consumoBase);
    }

    @Override
    public double calcularAutonomia(double litros) {
        return getConsumoBase() * litros;
    }

    @Override
    public double calcularCustoViagem(double distancia, double precoCombustivel) {
        double litrosNecessarios = distancia / getConsumoBase();
        return litrosNecessarios * precoCombustivel;
    }
}

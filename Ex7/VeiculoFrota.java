public abstract class VeiculoFrota {
    private String placa;
    private String modelo;
    private double  consumoBase;

    

    public VeiculoFrota(String placa, String modelo, double consumoBase) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Placa inválida.");
        }
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido.");
        }
        if (consumoBase <= 0) {
            throw new IllegalArgumentException("Consumo inválido.");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.consumoBase = consumoBase;
    }

    

    public String getPlaca() {
        return placa;
    }



    public String getModelo() {
        return modelo;
    }



    public double getConsumoBase() {
        return consumoBase;
    }



    public abstract double calcularAutonomia(double litros);

    public abstract double calcularCustoViagem(double distancia, double  precoCombustivel);

    public String exibirDados() {
        return  "Placa: " + placa + "\nModelo:" + modelo + "\nConsumo: " + consumoBase;
    }
}
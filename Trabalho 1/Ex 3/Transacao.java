import java.time.LocalDate;

public class Transacao {
    
    private String tipo;
    private float valor;
    private LocalDate data;

    public Transacao(String tipo, float valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo +
           " | Valor: " + valor +
           " | Data: " + data;
    }    
    
    
}

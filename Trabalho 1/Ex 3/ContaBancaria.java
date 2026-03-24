import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private double saldo;
    private List<Transacao> historico;

    private class Transacao {

        private String tipo;
        private double valor;
        private LocalDate data;

        public Transacao(String tipo, double valor) {
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

    public ContaBancaria() {
        this.saldo = 0;
        this.historico = new ArrayList<>();
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor de depósito deve ser maior que zero!");
        }
        this.saldo += valor;
        historico.add(new Transacao("Depósito", valor));

    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor de saque deve ser maior que zero!");
        }
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= valor;
        historico.add(new Transacao("Saque", valor));
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public List<Transacao> getHistorico() {
        return historico;
    }

}

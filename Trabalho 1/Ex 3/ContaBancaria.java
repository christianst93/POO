import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private float saldo;
    private List<Transacao> historico;

    public ContaBancaria() {
        this.saldo = 0;
        this.historico = new ArrayList<>();
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor de depósito deve ser maior que zero!");
        }
        this.saldo += valor;
        historico.add(new Transacao("Depósito", valor));

    }

    public void sacar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor de saque deve ser maior que zero!");
        }
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= valor;
        historico.add(new Transacao("Saque", valor));
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    public List<Transacao> getHistorico() {
        return historico;
    }
}

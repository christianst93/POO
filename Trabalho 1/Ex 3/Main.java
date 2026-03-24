public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria();

        System.out.println(c1.consultarSaldo());
        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.consultarSaldo() == 300);

        //c1.depositar(-100); Não vai aceitar valor negativo ou zero de depósito por causa do throw.
        //c1.sacar(0);; Não vai aceitar valor negativo ou zero de depósito por causa do throw.

        System.out.println(c1.getHistorico());      
    }
}

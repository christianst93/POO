public class Main {
    
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria();

        System.out.println(c1.consultarSaldo());
        c1.depositar(500);
        c1.sacar(200);
        System.out.println(c1.consultarSaldo());

        System.out.println(c1.getHistorico());      
    }
}

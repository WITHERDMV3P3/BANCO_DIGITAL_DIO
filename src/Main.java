public class Main {
    public static void main(String[] args) {

        Cliente cristian = new Cliente();
        cristian.setNome("Cristian");

        Iconta cc = new ContaCorrente(cristian);
        Iconta cp = new ContaPoupanca(cristian);

        cc.depositar(100);
        cc.depositar(50);
        cc.transferir(100,cp);

        cp.sacar(40);

        cc.imprimirExtrato();
        System.out.println("\n");
        cp.imprimirExtrato();
    }
}

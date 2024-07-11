public abstract class Conta implements Iconta {
    protected int agencia;
    protected int numero;
    protected double saldo;

    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 0001;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void Imprimirinfocomuns() {
        System.out.printf("Titular: %s", this.cliente.getNome() + "\n");
        System.out.printf(String.format("Agencia: %d ", this.agencia) + "\n");
        System.out.printf(String.format("Numero: %d ", this.numero) + "\n");
        System.out.printf(String.format("Saldo: %.2f ", this.saldo) + "\n");
    }
}

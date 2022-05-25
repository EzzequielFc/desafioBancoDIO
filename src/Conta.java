public class Conta implements iConta{

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected double saldo;
    protected int numero;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }


    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo > valor){
            this.saldo -= valor;
            System.out.println("VALOR DEBITADO DA CONTA: R$" + valor);
        }else{
            System.out.println("SALDO INDISPONIVEL PARA SAQUE");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("VALOR ADICIONADO NA CONTA: R$" + valor);
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta -> " +
                "AGENCIA=000" + agencia +
                ", SALDO=" + saldo +
                ", NUMERO=" + numero;
    }
}

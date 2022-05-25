public class Main {

    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.depositar(150);
        cc.sacar(100);
        System.out.println(cc);


    }
}

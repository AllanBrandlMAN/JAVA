//Interface ContaBancaria
interface ContaBancaria {
    void depositar (double valor);
    void sacar (double valor);
    double consultarSaldo();
    
}

//Classe ContaCorrente

class ContaCorrente implements ContaBancaria{
    private String titular;
    private double saldo;


    public ContaCorrente(String titular){
        this.titular = titular;
        this.saldo = 0.0; // saldo inicial
    }

@Override
public void depositar (double valor){
    if(valor > 0){
        saldo += valor;
        System.out.println("Depositado R$ " + valor +  "\nSaldo Atual: R$ " + saldo);
    }else {
        System.out.println("Valor de deposito deve ser positivo !");
    }
}
public void sacar(double valor){
    if(valor > 0 && valor <= saldo){
        saldo -= valor;
        System.out.println("Sacado: R$ " + valor + "\nSaldo Atual: R$ " + saldo);
    }else{
        System.out.println("Saque invalido. Verifique  o valor !");
    }
   
}
@Override
    public double consultarSaldo(){
     return saldo;
    }

    public String getTitular(){
        return titular;
    }
}
 //Classe Principal


public class Main6 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente("Joao Silva");
       
        conta.depositar(1000);
        conta.sacar(300);
        System.out.println("Saldo Atual: R$ " + conta.consultarSaldo());
        conta.sacar(800);
        conta.depositar(-50);

    }

}

package inden;

public class Conta {
    private int numero_conta;
    private String nome;
    private double saldo;
    // Constante com a taxa do banco.
    public final double TAXA = 5.00;

    // Construtor sem o saldo.
    public Conta(int numero_conta, String nome) {
        this.numero_conta = numero_conta;
        this.nome = nome;
    }

    // Construtor com o Saldo
    public Conta(int numero_conta, String nome, double depositoInicial) {
        this.numero_conta = numero_conta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumero_conta() {
        return numero_conta;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }

    // método do depósito.
    public void deposito(double deposito){
        saldo += deposito;
    }

    // método do saque.
    public void saque(double saque){
        saldo -= saque + TAXA;
    }

    //Deixar o object como String.
    public String toString(){
        return "Conta: "
        + numero_conta
        + ", Titular: "
        + nome
        + ", Saldo: "
        + String.format("%.2f", saldo);
    }
}

import java.util.Locale;
import java.util.Scanner;

import inden.Conta;

// Sistema Principal
public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // Instanciando a classe.
        Conta conta;
        char resp;
        
        System.out.print("Digite o número da conta: ");
        int numero_conta = sc.nextInt();
        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Existe um depósito inicial (s/n)?: ");
        resp = sc.next().charAt(0);
        if (resp != 'n') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            // Passando o contrutor com o valor do deposito no saldo.
            conta = new Conta(numero_conta, nome, depositoInicial);
        }
        else{
            // Passando o construtor sem o saldo.
            conta = new Conta(numero_conta, nome);
        }
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        // Looping do Depósito.
        do{
            System.out.println();
            System.out.print("Digite um valor de depósito: ");
            double deposito = sc.nextDouble();
            // chamando o método depósito.
            conta.deposito(deposito);
            System.out.println("Dados da conta atualizado:");
            System.out.println(conta);
            System.out.print("Deseja depositar novamente (s/n)?: ");
            resp = sc.next().charAt(0);
        }while(resp != 'n');
        
        // Looping do Saque.
        do{
            System.out.println();
            System.out.print("Digite o valor que deseja sacar: ");
            double saque = sc.nextDouble();
            // chamando o método saque.
            conta.saque(saque);
            System.out.println("Dados da conta atualizado:");
            System.out.println(conta);
            System.out.print("Deseja sacar novamente (s/n)?: ");
            resp = sc.next().charAt(0);
        }while(resp != 'n');
        

        sc.close();
    }
}
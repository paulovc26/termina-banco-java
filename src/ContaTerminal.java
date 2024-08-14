import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        int contaNumero;
        String contaAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem Vindo ao BANF(Banco Fictício)");
        System.out.println("Por favor, informe o seu nome:");
        nomeCliente = enter.nextLine();

        System.out.println("Digite o número da conta: ");
        contaNumero = Integer.parseInt(enter.nextLine());

        System.out.println("Digite a sua agência:");
        contaAgencia = enter.nextLine();

        System.out.println("Qual o saldo da conta?");
        saldo = Double.parseDouble(enter.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ contaAgencia + ", conta " + contaNumero + " e seu saldo " + saldo + " já está disponível para saque");
    }






}

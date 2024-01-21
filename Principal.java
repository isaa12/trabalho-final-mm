import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        
        cc1.setNumero(001);
        cc1.setNome("João");
        cc1.setSaldo(1000);
        cc1.setSenha("1234");
        cc1.setLimite(1000);

        cp1.setNumero(002);
        cp1.setNome("Maria");
        cp1.setSaldo(1000);
        cp1.setSenha("1234");
        cp1.setDiaAniversario(10);

        boolean continuar = true;

        while (continuar) {
        System.out.println("Digite o número da conta:");
        int numero = entrada.nextInt();

        if(numero == cc1.getNumero()) {
            System.out.println("Digite a senha da conta:");
            String senha = entrada.next();
            
        if (senha.equals(cc1.getSenha())) {
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Sair");
            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                System.out.println("digite o valor do deposito:");
                double valorDeposito = entrada.nextDouble();
                cc1.depositar(valorDeposito);
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("O novo saldo da conta é:" + cc1.getSaldo());
                break;
                case 2:
                System.out.println("Digite o valor do saque:");
                double valorSaque = entrada.nextDouble();

                if (valorSaque <= cc1.getSaldo()) {
                cc1.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso!");
                System.out.println("O novo saldo da conta é:" + cc1.getSaldo());
                } else {
                    System.err.println("Saldo insuficiente para realizar o saque.");
                }
                break;
                case 3:
                continuar = false;
                System.out.println("Sessão encerrada. Até logo!");
                break;
                default:
                System.err.println("Opção inválida!");
                break;
            }
        } else {
            System.err.println("Senha incorreta!");
        }
    } else {
System.err.println("Conta inválida!");
    }
       
    }

    entrada.close();
}
}
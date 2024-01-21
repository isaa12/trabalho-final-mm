public class ContaPoupanca extends Conta{   
    private int diaAniversario;
    
    /*public ContaPoupanca(int numero, String nome, double saldo, String senha, int diaAniversario) {
        super(numero, nome, saldo,senha);
        this.diaAniversario = diaAniversario;
    }*/
    
    public int getDiaAniversario() {
        return this.diaAniversario;
    }
    
    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
    
    public void sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void atualizar(double taxa) {
        this.setSaldo(this.getSaldo() + this.getSaldo() * taxa * 3);
    }
    
    public String toString() {
        return "Conta Poupança: " + this.getNumero() + " - " + this.getNome() + " - " + this.getSaldo() + " - " + this.getDiaAniversario();
    }

}

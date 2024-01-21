public class ContaCorrente extends  Conta{
    private double limite;
    
    /*public ContaCorrente(int numero, String nome, double saldo, String senha, double limite) {
        super(numero, nome, saldo,senha);
        this.limite = limite;
    }
    */
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void sacar(double valor) {
        if (valor <= this.getSaldo() + this.getLimite()) {
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void atualizar(double taxa) {
        this.setSaldo(this.getSaldo() + this.getSaldo() * taxa * 2);
    }
    
    public String toString() {
        return "Conta Corrente: " + this.getNumero() + " - " + this.getNome() + " - " + this.getSaldo() + " - " + this.getLimite();
    }

}

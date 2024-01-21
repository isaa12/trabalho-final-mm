public abstract class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private String senha;
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*public Conta(int numero, String nome, double saldo,String senha) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.senha = senha;
.    }*/
    
    public int getNumero() {
        return this.numero;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    
    public abstract void atualizar(double taxa);
    
    public String toString() {
        return "Conta: " + this.numero + " - " + this.nome + " - " + this.saldo;
    }
    
}

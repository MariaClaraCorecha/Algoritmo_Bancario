package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    
    public void estadoAtual(){
        System.out.println("CONTA: " + this.getNumConta());
        System.out.println("TIPO: " + this.tipo);
        System.out.println("DONO: " + this.getDono());
        System.out.println("SALDO: " + this.getSaldo());
        System.out.println("STATUS: " + this.getStatus());
        System.out.println("-------------------------------");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("CONTA ABERTA COM SUCESSO!");
    }
    
    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("CONTA NÃO PODE SER FECHADA PORQUE AINDA TEM DINHEIRO.");
        } else if (this.getSaldo() < 0){
            System.out.println("CONTA NÃO PODE SER FECHADA POIS TEM DÉBITO.");
        } else {
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
           this.setSaldo(this.getSaldo() + v);
            System.out.println("DEPÓSITO REALIZADO NA CONTA " + this.getDono());
        } else{
            System.out.println("IMPOSSÍVEL DEPOSITAR EM UMA CONTA FECHADA!");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("SAQUE REALIZADO NA CONTA DE " + this.getSaldo());
            } else {
                System.out.println("SALDO INSUFICIENTE PARA SAQUE.");
            }
        } else {
            System.out.println("IMPOSSIVEL SACAR DE UMA CONTA FECHADA.");
        }
        
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("MENSALIDADE PAGA COM SUCESSO POR " +this.getDono()); 
        } else {
            System.out.println("IMPOSSIVEL PAGAR UMA CONTA FECHADA!");
        }
    }
    
    //Metodos Especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}

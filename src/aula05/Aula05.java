package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.fecharConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500f);
        p2.sacar(100f);
        
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}

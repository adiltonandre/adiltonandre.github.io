
package Aula2;

public class Conta {
    String nome = "Adilton";
    String cpf = "580.867.652-53";
    float saldo = 2.0f;
    
    void saque(){
        if(saldo > 0){
            System.out.println("Impossivel o saque!");
            
        }
    }
    
    void depositar(){
        
    }
    
    void exibir(){
        System.out.println("Nome....: "+nome);
        System.out.println("Cpf.....: "+cpf);
        System.out.println("Saldo.....: "+saldo);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author trixti
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static void soma (int a, int b) {
        int s = a + b;
        System.out.println("a soma é " + s);       
        ;
    }
    
    public static void main(String[] args) {
        /*
        (args significa argumento)
        (String é uma classe)
        void é um procedimento, onde main é um método
        que não retorna valor, que recebe um vetor como 
        parâmetro, que é um método estático e públixo
        */       
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5,2);
    }
    
}

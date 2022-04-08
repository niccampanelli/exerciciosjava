/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

/**
 *
 * @author 125221101937
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Funcionario func = new Funcionario();
        
        gerente.atualizar(func, "Analista");
        gerente.atualizar(func, 1200.0);
        
        System.out.println(func.getDados());
    }
    
}

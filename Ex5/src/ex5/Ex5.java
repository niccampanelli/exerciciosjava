/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

/**
 *
 * @author 125221101937
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno al1 = new Aluno(24124124);
        Aluno al2 = new Aluno("Pedro", 12345);
        
        System.out.println("Aluno 1: "+ al1.getDados());
        System.out.println("Aluno 2: "+ al2.getDados());
    }
    
}

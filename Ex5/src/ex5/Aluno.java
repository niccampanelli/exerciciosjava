/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author 125221101937
 */
public class Aluno {
 
    String nome;
    int RA;
    
    public Aluno(int RA){
        this.RA = RA;
    }
    
    public Aluno(String nome, int RA){
        this.nome = nome;
        this.RA = RA;
    }
    
    public String getDados(){
        return "O nome é: " + this.nome+
                  "\n O RA é: " + this.RA;
    }
}

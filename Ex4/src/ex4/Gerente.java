/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

/**
 *
 * @author 125221101937
 */
public class Gerente {
    
    public String nome;
    
    public void atualizar(Funcionario aux, String cargo){
        aux.cargo = cargo;
    }
    
    public void atualizar(Funcionario aux, double salario){
        aux.salario = salario;
    }
    
}

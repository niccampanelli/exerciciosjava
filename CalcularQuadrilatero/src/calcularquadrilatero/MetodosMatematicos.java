/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcularquadrilatero;

/**
 *
 * @author 125221101937
 */
public class MetodosMatematicos {
    public static void main(String[] args) {
        Calculos calc = new Calculos();
        
        // Com int
        System.out.println(calc.realizarCalculo(8, 2));
        
        // Com double
        System.out.println(calc.realizarCalculo(8.1, 2.4));
        
        //Com float
        System.out.println(calc.realizarCalculo(10.5f, 2.5f));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robô;

/**
 *
 * @author luciano
 */
public class RoboTeste {

    
    public static void main(String[] args) {
        
        RoboSimples0 Pedro = new RoboSimples0("Pedro", 20, 10,'S');
        RoboSimples0 Joao = new RoboSimples0("João");
        RoboSimples0 SemNome = new RoboSimples0();
        
        //movendo o robô
        Pedro.move(10);
        Joao.mudaDirecao('E');
        SemNome.move(5);
        
        //mostrar onde estão cada um
        System.out.println(Pedro);
        System.out.println(Joao);
        System.out.println(SemNome);
        
    }
    
}

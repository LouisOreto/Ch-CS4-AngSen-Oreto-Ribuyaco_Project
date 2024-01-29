/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_angsen_oreto_ribuyaco_project;


/**
 *
 * @author lnaoreto
 */
public class apexClue extends Clues {
    public static boolean Available = false;
    
    public static void generateApxClue(Location i, Person p){
    System.out.println("The camera shows " + p.name + " entering the room " + i.name + " the victim was in before the time of murder");
    }
}

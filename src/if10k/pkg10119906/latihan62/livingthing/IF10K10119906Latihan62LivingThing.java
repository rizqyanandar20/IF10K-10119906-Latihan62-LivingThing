/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan62.livingthing;

/**
 *
 * @author senenngahenen
 */
public class IF10K10119906Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human= new Human();
        human.setNama("Rizki Adam Kurniawan");
        human.walk(human.getNama());       
        human.breath("Rizki Adam Kurniawan");
        human.eat("Rizki Adam Kurniawan");
    }
    
}

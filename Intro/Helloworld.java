package Intro;
import javax.swing.*;//Importe le package qui gere le graphisme en Java
public class Helloworld{
    
    //Méthode principale,
    //Celle qui se lance quand on lance le programme!
    public static void main(String[] args){
        //System.out.println("Bienvenue en Java!");
        JOptionPane.showMessageDialog(null,"Bienvenue en Java!");
        String nomUtilisateur = JOptionPane.showInputDialog("Quel est ton nom? ");
        System.out.println("Bonjour "+nomUtilisateur);
        String strAge = JOptionPane.showInputDialog("Quel est ton age? ");
        int age = Integer.parseInt(strAge);//Méthode pour convertir yb String en int
        System.out.println("L'an prochain tu auras "+(age+1));
       }
}


  
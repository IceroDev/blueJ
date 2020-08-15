package Intro;
import javax.swing.*;
public class AppliSomme{
    public static void main(String[] args){
        //Présentation
        JOptionPane.showMessageDialog(null,"Bonjour, je vais calculer la somme de vos nombres!");
        int premierNombre;
        String strpremierNombre = JOptionPane.showInputDialog("Marques ton premier nombre! ");
        premierNombre = Integer.parseInt(strpremierNombre);
        int deuxiemeNombre;
        String strdeuxiemeNombre = JOptionPane.showInputDialog("Marques ton deuxième nombre! ");
        deuxiemeNombre = Integer.parseInt(strdeuxiemeNombre);
        int somme = premierNombre + deuxiemeNombre ;
        JOptionPane.showMessageDialog(null,""+premierNombre+" + "+deuxiemeNombre+" = "+somme);
    }
}
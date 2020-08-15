package Intro;
import javax.swing.*;
public class AppliPythagore{
    public static void main(String[] args){
        //Présentation
        JOptionPane.showMessageDialog(null,"Bonjour, je vais calculer l'hypothénuse de vos nombres! (car je suis badass)");
        JOptionPane.showMessageDialog(null,"On définis l'hypothénuse sur le coté c");
        int premierNombre;
        String strpremierNombre = JOptionPane.showInputDialog("Marques la valeur de a ");
        premierNombre = Integer.parseInt(strpremierNombre);
        int deuxiemeNombre;
        String strdeuxiemeNombre = JOptionPane.showInputDialog("Marques la valeur de b ");
        deuxiemeNombre = Integer.parseInt(strdeuxiemeNombre);
        double somme = Math.sqrt((premierNombre*premierNombre)+(deuxiemeNombre*deuxiemeNombre)) ;
        JOptionPane.showMessageDialog(null,"Hypothénuse = "+somme);
    }
}
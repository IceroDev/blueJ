package Intro;
import javax.swing.*;
public class AppliMoyenne{
    public static void main(String[] args){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("nb1"));
        
        int b;
        b = Integer.parseInt(JOptionPane.showInputDialog("nb2"));
        
        int c;
        c = Integer.parseInt(JOptionPane.showInputDialog("nb3"));
        
        int somme = a+b+c;
        
        int moy = somme/3;
        
        JOptionPane.showMessageDialog(null, "La moyenne de"+a+","+b+"et"+c+"est"+moy);



    
    }
}
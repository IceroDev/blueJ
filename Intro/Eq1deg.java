package Intro;


import javax.swing.*;
public class Eq1deg
{
    public static void main(String[] args){
        String ac = JOptionPane.showInputDialog(null,"valeure de a ");
        String bc = JOptionPane.showInputDialog(null,"valeure de b");
        int a = Integer.parseInt(ac);
        int b = Integer.parseInt(bc);
        double calcul1 = 0-b;
        double calcul2 = calcul1/a;

        if(a==0){
            if(b==0){
            JOptionPane.showMessageDialog(null,"Tous les réels sont valides");
            }
            else{
            JOptionPane.showMessageDialog(null,"l'équation n'admet pas de solutions");
            }
                }
       else{
            System.out.println("x= "+calcul2);
        
           }
}
}
                     
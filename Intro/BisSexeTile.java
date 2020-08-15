package Intro;


import javax.swing.*;
public class BisSexeTile{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Programme de verification d'année bis");
        int an = Integer.parseInt(JOptionPane.showInputDialog("Année"));
        if(an%4==0){
            if(an%100==0){
                if(an%400==0){
                    JOptionPane.showMessageDialog(null, "Cette année est Bis-Sexe-Tile");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Non elle ne l'est pas");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Cette année est Bis-Sexe-Tile");                
            }
        }   
        else{//an n'est pas div par 4
            JOptionPane.showMessageDialog(null, "Non elle ne l'est pas");
        }    
    }
}

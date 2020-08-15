package Intro;


import javax.swing.*;
public class majeurmineur
{
   public static void main(String[] args){
JOptionPane.showMessageDialog(null,"Programme de verification d'âge");
String ac = JOptionPane.showInputDialog(null,"Quel est votre âge ?");
int a = Integer.parseInt(ac);
int reste = (18-a);
int reste2 = (18-a)*-1;
if(a<0){
    JOptionPane.showMessageDialog(null,"Vous n'êtes pas né...");
    return;
}
    if(a>130){
        JOptionPane.showMessageDialog(null,"Solution 1, vous mentez\nSolution 2, vous êtes un surhomme ou un zombie");
        return;
    }
        if(a>=18){
            JOptionPane.showMessageDialog(null,"Vous êtes Majeur depuis "+reste2+"ans");
        }else{
            JOptionPane.showMessageDialog(null,"Vous êtes Mineur, dans "+reste+" an(s) vous ne le serez plus");
        }
            if(a<12){
                JOptionPane.showMessageDialog(null,"Vous êtes un enfant");
            }else if(a<18){
                JOptionPane.showMessageDialog(null,"Vous êtes ado");
            }else if(a>67){
                JOptionPane.showMessageDialog(null,"Vous êtes retraité ");
            }else{
                JOptionPane.showMessageDialog(null,"Vous êtes adulte");
            }
}
}

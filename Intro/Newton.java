package Intro;


import javax.swing.*;
public class Newton
{
   public static void main(String[] args){
JOptionPane.showMessageDialog(null,"Formule : F = G x (mA*mB)/d^2,\n");
String Mac = JOptionPane.showInputDialog(null,"masse du mobile A");
String Mbc = JOptionPane.showInputDialog(null,"masse du mobile B");
String Dc = JOptionPane.showInputDialog(null,"distance entre les 2 mobiles");
int Ma = Integer.parseInt(Mac);
int Mb = Integer.parseInt(Mbc);
int d = Integer.parseInt(Dc);
double G = 6.67*Math.pow(10,-11);
double calcul = G*((Ma*Mb)/Math.pow(d,2));
   System.out.println("Valeure de la force = "+calcul+"N");
}
}

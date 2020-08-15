package Intro;


import javax.swing.*;
public class modulo
{
   public static void main(String[] args){
String ac = JOptionPane.showInputDialog(null,"Nombre");
String nc = JOptionPane.showInputDialog(null,"diviseur");
int a = Integer.parseInt(ac);
int n = Integer.parseInt(nc);
int quotient = a/n;
int reste =a%n;
System.out.println(a+" = "+n+" * "+quotient+" + " + reste);
    
   
}
}

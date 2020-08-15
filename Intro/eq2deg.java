package Intro;


import javax.swing.*;
public class eq2deg
{
        public static void main(String[] args){
                String ac = JOptionPane.showInputDialog(null,"a = ?");
                
                String bc = JOptionPane.showInputDialog(null,"b = ?");
                String cc = JOptionPane.showInputDialog(null,"c= ?");
                int a = Integer.parseInt(ac);
                if(a==0){
                    System.out.println("L'équation n'est pas du second degré");
                    System.exit(0);
                }
                int b = Integer.parseInt(bc);
                int c = Integer.parseInt(cc);
                double DELTA = Math.pow(b,2)-4*a*c;
                double rac =Math.sqrt(Math.pow(b,2)-4*a*c);
                double X1 = (-b+rac)/2*a;
                double X2 = (-b-rac)/2*a;
                double X3 = -b/(2*a);
                System.out.println("DELTA = "+DELTA);
                JOptionPane.showMessageDialog(null,"Equation donnée : "+a+"x^2+"+b+"x+"+c);
        if(DELTA ==0){
            System.out.println("Il n'y a pas de solutions");
        }
                if(DELTA >0){
                    System.out.println("Solution 1 = "+X1);
                    System.out.println("Solution 2 = "+X2);
                }
        if(DELTA<0){
        System.out.println("Solution unique = "+X3);
        }
    }
}

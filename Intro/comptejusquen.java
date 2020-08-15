package Intro;


import javax.swing.*;
public class comptejusquen{
    public static void main(String[] args){
        int b = Integer.parseInt(JOptionPane.showInputDialog("Partir de :"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Jusque ?"));
        JOptionPane.showMessageDialog(null,"Programme qui compte jusque "+n+" depuis "+ b+" (oui c'est utile merde !)");
        
        int i = b;
        
        do{
            System.out.println(i);
            i=i+1;
        }while(i<=n);
    }
}

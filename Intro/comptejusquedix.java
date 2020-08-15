package Intro;


import javax.swing.*;
public class comptejusquedix{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Programme qui compte jusque 10 (oui c'est utile merde !)");
        int i = 5;
        
        do{
            System.out.println(i);
            i=i+1;
        }while(i<=10);
    }
}

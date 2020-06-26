/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q8;

/**
 *
 * @author yasmi
 */
public class Desafio6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      int cont; String res = "Serie\n";
       double x, acSerie;
       acSerie=0;
        DecimalFormat f= new DecimalFormat("0.0");
       x = Double.parseDouble(JOptionPane.showInputDialog("Valor X:"));
       for(cont = 1; cont<=20; cont++){
           acSerie += 1.0/Math.pow(x,cont); 
           res += " "+(1.0/Math.pow(x,cont))+"\n"; 
       }
       JOptionPane.showMessageDialog(null, res);
       JOptionPane.showMessageDialog(null, "O resultado da série é: "
               +f.format(acSerie));
    }

}

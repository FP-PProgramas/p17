
package fp.problema.pkg017;
import javax.swing.*;

public class FpProblema017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,min,max,res, residuo=0;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero"));
        
        min=Math.min(a, b);
        max=Math.max(a,b);
        
        while(min !=0){
        res=max%min;
        max=min;
        min=res;
        }
    residuo=max;
        JOptionPane.showMessageDialog(null,"El MCD es:"+ residuo);
}
        
        
    }
    


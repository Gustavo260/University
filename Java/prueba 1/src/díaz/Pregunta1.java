package díaz;
import javax.swing.JOptionPane;
public class Pregunta1 {
    public static void main(String[] args) {
        int promedionegativos=0, negativos=0, numero=0, mayor=0, sumanegativos=0;
        short i=0, sw=0;
        float promflot, sumaflotnega, negaflot;
        do{
            numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
            if(sw==0){
                mayor=numero;
            }
            sw=1;
            if(mayor<numero){
                mayor=numero;
            }
            if(numero<0){
                negativos++;
                sumanegativos=  sumanegativos+ numero;
            }
            i++;
        }
        while(i<50);
        if(sumanegativos%2==0){
            promedionegativos= (sumanegativos/negativos);
            JOptionPane.showMessageDialog(null,"el promedio de numeros negativos es: "+promedionegativos);
        }
        else{ /*en caso de que no de entero use float para que muestre decimal */
            sumaflotnega= (float)sumanegativos;
            promflot= (float)promedionegativos;
            negaflot= (float)negativos;
            promflot= (sumaflotnega/negaflot);
            JOptionPane.showMessageDialog(null,"el promedio de numeros negativos es: "+promflot);
            
        }
        JOptionPane.showMessageDialog(null,"el numero mayor es: "+mayor);
    }
}




           
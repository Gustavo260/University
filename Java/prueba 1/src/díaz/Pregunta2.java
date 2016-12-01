package díaz;
import javax.swing.JOptionPane;
public class Pregunta2 {
    public static void main(String[] args) {
        int sexo=0, sueldo=0, N=0, sueldoF=0, sueldoM=0, mayorSueldo=0, promedioM=0, hombres=0, sumasueldoM=0, mujeres=0, Menora50=0, sw=0;
        String nombre="", nombreM="";
        N= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de trabajadores"));
        for(int i=0; i<N; i++){
            sexo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese sexo del trabajador (masculino: 1/femenino: 0)"));
            nombre=JOptionPane.showInputDialog("Ingrese nombre del trabajador");
            sueldo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo del trabajador"));
            if(sexo==1){
                hombres++;
                sumasueldoM= sumasueldoM+ sueldo;
            }
            if(sexo==0){
                if(sueldo<500000){
                    Menora50++;
                }
            }
            if(sw==0){
                nombreM= nombre;
                mayorSueldo= sueldo;
            }
            sw=1;
            if(mayorSueldo<sueldo){
                nombreM= nombre;
                mayorSueldo= sueldo;
            }
        }
        promedioM= (sumasueldoM/hombres);
        JOptionPane.showMessageDialog(null,"en total hay " +Menora50+ "mujeres con sueldos menor a 500.000");
        JOptionPane.showMessageDialog(null,"el promedio de trabajadores de sexo masculino es: "+promedioM);
        JOptionPane.showMessageDialog(null,"el trabajador con mayor sueldo se llama "+nombreM+" con un sueldo de "+mayorSueldo);
    }
}
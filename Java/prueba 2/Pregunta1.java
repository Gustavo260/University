package diaz;
import javax.swing.JOptionPane;
public class Pregunta1 
{
    static int i, n=5;
    static int S[]= new int[5];
    static String N[]= new String[5];
    public static void personas() //llenado de ambos vectores (nombre y sueldo)
    { 
        int sw=0;
        for(i=0;i<n;i++)
        {
            N[i]=JOptionPane.showInputDialog("Ingrese nombre de la persona");
            do
            {
                try
                {
                S[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo de la persona"));
                sw=1;
                }
                catch(NumberFormatException n1)
                {
                sw=0;    
                }
            }
            while(sw==0);
        }
    }
    
    public static int cantidaddepersonas(String Nombre[], int Sueldo[]) //cantidad de gente con sueldos menores a 300.000
    {
        int menores=0;
        for(i=0;i<n;i++)
        {
            if(Sueldo[i]<300000)
            {
               menores++; 
            }
        }
        return(menores);
    }
    
    public static String listadepersonasmenores(String Nombreper[], int Sueldoper[]) //lista con los nombres de las personas con sueldos menores a 300.000
    {
        String listamenores="";
        for(i=0;i<n;i++)
        {
            if(Sueldoper[i]<300000)
            {
                listamenores= listamenores+"\n"+Nombreper[i];
            }
        }
        return(listamenores);
    }
    
    public static String menorsueldo(String Nombremenor[], int Sueldomenor2[]) //persona con menor sueldo
    {
        String datosmenores="";
        String nombremenor="";
        int repite=0;
        int sueldomenor=Sueldomenor2[0];
        for(i=0;i<n;i++)
        {
            if(Sueldomenor2[i]<sueldomenor)
            {
                sueldomenor= Sueldomenor2[i];
                nombremenor= Nombremenor[i];
            }
        }
        
        for(i=0;i<n;i++)
        {
            if(Sueldomenor2[i]==sueldomenor)
            {
                repite++;
                repite= repite-1;
            }
            
        }
        datosmenores= nombremenor+" "+sueldomenor+"\n sueldo menor repetido en otras personas: "+repite+" veces";
        return(datosmenores);
    }
    
    public static void imprimir(int cant,String list,String mensueldo) //mostrar datos
    {
        JOptionPane.showMessageDialog(null,"Cantidad de personas con sueldos menores a 300.000: \n"+cant);
        JOptionPane.showMessageDialog(null,"Lista de personas con sueldos menores a 300.000: \n"+list);
        JOptionPane.showMessageDialog(null,"Menor sueldo: \n"+mensueldo);
    }
    
    public static void main(String[] args) 
    {
        int cantidad=0;
        String lista="", msueldo="";
        personas();
        cantidad=cantidaddepersonas(N,S);
        lista=listadepersonasmenores(N,S);
        msueldo= menorsueldo(N,S);
        imprimir(cantidad,lista,msueldo);
    }
}

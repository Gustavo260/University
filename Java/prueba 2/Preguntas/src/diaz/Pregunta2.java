package diaz;
import javax.swing.JOptionPane;
public class Pregunta2 
{
    static int M[][]= new int[4][3];
    static int f,c;
    
    public static void llenadomatriz() //llenado de la matriz
    {
        int sw=0;
        for(f=0;f<4;f++)
        {
            for(c=0;c<3;c++)
            {
                do
                {
                    try
                    {
                        M[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en la posicion "+(f+1)+","+(c+1)));
                    sw=1;
                    }
                    catch(NumberFormatException n2)
                    {
                    sw=0;   
                    }
                }
                while(sw==0);
            }
        }
    }
    
    public static String muestraMatriz(int B[][]) //muestra la matriz
    {
        String Matrizz="";
        for(f=0;f<4;f++)
        {
            for(c=0;c<3;c++)
            {
                Matrizz= Matrizz+" "+B[f][c];
            }
            Matrizz= Matrizz+"\n";
        }
        return(Matrizz);
    }
    
    public static double calculapares(int C[][]) //calculapares
    {
        double pares=0, sumapar=0, promediopar=0;
        for(f=0;f<4;f++)
        {
            for(c=0;c<3;c++)
            {
                if(C[f][c]%2==0)
                {
                   pares++; 
                   sumapar= sumapar+C[f][c];
                }
            }
        }
        if(pares!=0)
        {
            promediopar= (sumapar/pares);            
        }
        else{
            promediopar=0;
        }
        return(promediopar);
    }   
    
    public static String listapares(int C[][]) //listado con los numeros pares
    {
        String paress="";
        for(f=0;f<4;f++)
        {
            for(c=0;c<3;c++)
            {
                if(C[f][c]%2==0)
                {
                   paress= paress+"\n"+C[f][c]; 
                }
            }
        }
        return(paress);
    }
    
    public static String sumafila(int D[][]) // suma las 4 filas
    {
        String sumatotal="";
        int ac=0;
        for(f=0;f<4;f++)
        {
            for(c=0;c<3;c++)
            {
                ac= ac+D[f][c];
            }
            sumatotal= "\n"+sumatotal+" la fila "+(f+1)+" suma "+ac+"\n";
            ac=0;
        }
        return(sumatotal);
    }
    
    public static void imprimir(String matris,double promediopares,String listapares, String sumafilaz) //mostrar datos
    {
        JOptionPane.showMessageDialog(null,matris);
        JOptionPane.showMessageDialog(null,"El promedio de los numeros pares es: "+promediopares);
        JOptionPane.showMessageDialog(null,"Los numeros pares son: \n"+listapares);
        JOptionPane.showMessageDialog(null,"Suma por fila: "+sumafilaz);
    }
    
    public static void main(String Args[])
    {
        String muestraM="", listapar="", sumafilass="";
        double promediopar=0;
        double nuevoprom=0;
        llenadomatriz();
        muestraM= muestraMatriz(M);
        promediopar=calculapares(M);
        listapar= listapares(M);
        sumafilass= sumafila(M);
        imprimir(muestraM,promediopar,listapar,sumafilass);
    }
}

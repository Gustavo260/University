package gustavodiaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pregunta extends JFrame
{
    private JLabel lbl1;
    private JTextField txt1;
    private JButton btnCal, btnLim, btnSal;
    private JRadioButton rbtCon, rbtCre;
    private JPanel pnl1, pnl2, pnl3;
    private ButtonGroup grp1;
    public pregunta()
    {
        super("Calculo de compra");
        btnCal= new JButton("Calcular");
        btnSal= new JButton("Salir");
        btnLim= new JButton("Limpiar");
        pnl1= new JPanel();
        pnl2= new JPanel();
        pnl3= new JPanel();
        txt1= new JTextField(10);
        lbl1= new JLabel("Ingrese Monto de la Compra");
        rbtCon= new JRadioButton("pago Contado");
        rbtCre= new JRadioButton("pago Credito");
        grp1= new ButtonGroup();
        
        grp1.add(rbtCon);
        grp1.add(rbtCre);
        
        setLayout(new GridLayout(3,1));
        
        pnl1.setLayout(new FlowLayout());
        pnl1.add(lbl1);
        pnl1.add(txt1);
        
        pnl2.setLayout(new FlowLayout());
        pnl2.add(rbtCon);
        pnl2.add(rbtCre);
        
        pnl3.setLayout(new FlowLayout());
        pnl3.add(btnCal);
        pnl3.add(btnLim);
        pnl3.add(btnSal);
        
        btnCal.addActionListener(new pregunta.AccionEvento());
        btnSal.addActionListener(new pregunta.AccionEvento());
        btnLim.addActionListener(new pregunta.AccionEvento());
          
        add(pnl1);
        add(pnl2);
        add(pnl3);
        
        setResizable(false); //bloquea ventana
        
        setVisible(true);
        setSize(400,200);
    }
    public static void main(String[] args) 
    {
        pregunta x= new pregunta();
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void limpiar()
    {
        txt1.setText("");
        grp1.clearSelection();
        txt1.requestFocus();
    }
    
    public float pagocontado(float contado)
    {
        float cont=0f;
        cont= ((contado*60)/100);
        return(cont);
    }
    
    public float pagocredito(float contado2)
    {
        float cont2=0f;
        cont2= ((contado2*140)/100);
        return(cont2);
    }
    
    private class AccionEvento implements ActionListener
    {
        public void actionPerformed(ActionEvent evento)
        {
            int nIng;
            float nIng2, pcontado, pcredito;
            
            if(evento.getSource()==btnCal)
            {
                if(rbtCon.isSelected())
                {
                    try
                    {
                        nIng=Integer.parseInt(txt1.getText());
                        while(nIng<=0)
                        {
                          JOptionPane.showMessageDialog(null,"Error!, tiene que ingresar numeros  mayores a 0");
                          limpiar();
                          nIng=Integer.parseInt(txt1.getText());  
                        }
                    }
                    catch(NumberFormatException n1)
                    {
                        JOptionPane.showMessageDialog(null,"Error!, tiene que ingresar numeros");
                        limpiar();
                        nIng=Integer.parseInt(txt1.getText());
                    }
                    if(txt1.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Error!, tiene que ingresar un valor");
                        limpiar();
                    }
                    else
                    {
                        nIng2= (int)nIng;
                        pcontado= pagocontado(nIng2);
                        JOptionPane.showMessageDialog(null,"Monto de la compra: "+nIng+"\n"+"Forma de pago: pago Contado"+"\n"+"Interes/descuento al monto de la compra: descuento de un 40%"+"\n"+"Valor total de la compra: "+pcontado);
                    }
                }
                
                if(rbtCre.isSelected())
                {
                    try
                    {
                        nIng=Integer.parseInt(txt1.getText());
                        while(nIng<=0)
                        {
                          JOptionPane.showMessageDialog(null,"Error!, tiene que ingresar numeros  mayores a 0");
                          limpiar();
                          nIng=Integer.parseInt(txt1.getText());  
                        }
                    }
                    catch(NumberFormatException n1)
                    {
                        JOptionPane.showMessageDialog(null,"Error!, tiene que ingresar numeros");
                        limpiar();
                        nIng=Integer.parseInt(txt1.getText());
                    }
                    if(txt1.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Error!, tiene que ingresar un valor");
                        limpiar();
                    }
                    else
                    {
                        nIng2= (int)nIng;
                        pcredito= pagocredito(nIng2);
                        JOptionPane.showMessageDialog(null,"Monto de la compra: "+nIng+"\n"+"Forma de pago: pago Credito"+"\n"+"Interes/descuento al monto de la compra: interes de un 40%"+"\n"+"Valor total de la compra: "+pcredito);
                    }
                }
            }
            
            if(evento.getSource()==btnLim)
            {
                limpiar();
            }
            
            if(evento.getSource()==btnSal)
            {
                System.exit(0);
            }
        }
    }
}

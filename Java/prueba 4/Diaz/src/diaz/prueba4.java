package diaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class prueba4 extends JFrame
{
    private JPanel pnl1,pnl2,pnl3;
    private JTextArea txtArea;
    private JTextField txt1;
    private JLabel lbl1;
    private JButton btnBus, btnLim, btnSal;
    public prueba4()
    {
        super("Cursado de alumnos");
        pnl1= new JPanel();
        pnl2= new JPanel();
        pnl3= new JPanel();
        txtArea= new JTextArea();
        lbl1= new JLabel("Ingrese Asignatura");
        txt1= new JTextField(10);
        btnBus= new JButton("Buscar");
        btnSal= new JButton("Salir");
        btnLim= new JButton("Limpiar");
        
        setLayout(new GridLayout(3,1));
        pnl1.setLayout(new FlowLayout());
        pnl1.add(lbl1);
        pnl1.add(txt1);
        
        pnl2.setLayout(new FlowLayout());
        pnl2.add(btnBus);
        pnl2.add(btnLim);
        pnl2.add(btnSal);
        
        pnl3.setLayout(new FlowLayout());
        pnl3.add(txtArea);
        
        add(pnl1);
        add(pnl2);
        add(pnl3);
        
        btnBus.addActionListener(new prueba4.ClaseEvento());
        btnLim.addActionListener(new prueba4.ClaseEvento());
        btnSal.addActionListener(new prueba4.ClaseEvento());
        
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        prueba4 x= new prueba4();
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void Limpiar()
    {
        txt1.setText("");
        txtArea.setText("");
        txt1.requestFocus();
    }
    
    public void Buscar()
    {
        String asig="";
        asig=("Select Alumno.Rut, Alumno.Nombre from(Alumno inner join Cursar on Alumno.Rut=Cursar.Rut) inner join Asignatura on Cursar.Codigo=Asignatura.Codigo where Asignatura.Nombre like '"+txt1.getText())+"'";
        if(txt1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Error! debe ingresar algo");
            Limpiar();
        }
        else{
            try
            {
                Connection c=null;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                c=DriverManager.getConnection("jdbc:odbc:PRUEBA702","","");
                Statement s=c.createStatement();
                ResultSet rs= s.executeQuery(asig);
                String q="";
                short i=0;
                txtArea.setText("");
                while(rs.next())
                {
                    i++;
                    q=rs.getInt(1)+"\t"+rs.getString(2)+"\n";
                    txtArea.append(q);
                }
                if(i==0)
                {
                    JOptionPane.showMessageDialog(null,"valor no encontrado");
                    Limpiar();
                }
            }
            catch(ClassNotFoundException ex1)
            {
                JOptionPane.showMessageDialog(null,"m1"+ex1.getMessage());
            }

            catch(Exception ex2)
            {
                JOptionPane.showMessageDialog(null,"m2"+ex2.getMessage());
            }
        }
    }
    
    private class ClaseEvento implements ActionListener
    {
        public void actionPerformed(ActionEvent ac1)
        {
            if(ac1.getSource()==btnBus)
            {
                Buscar();
            }
            
            if(ac1.getSource()==btnLim)
            {
                Limpiar();
            }
            
            if(ac1.getSource()==btnSal)
            {
                System.exit(0);
            }
        } 
    }
}



















<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Ventas.aspx.cs" Inherits="SistemaCasino.Ventas" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .style1
        {
            width: 77%;
        }
        .style2
        {
            width: 250px;
        }
        .style3
        {
            height: 87px;
        }
        .style4
        {
            width: 250px;
            height: 87px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    <table bgcolor="Silver" class="style1">
        <tr>
            <td align="center" colspan="3">
                Productos Aseo</td>
            <td align="center" class="style2">
                Sistema de Ventas Casino<br />
                <br />
            </td>
            <td align="center">
                Lista:</td>
        </tr>
        <tr>
            <td align="center" rowspan="4">
                <asp:ImageButton ID="ImgEscoba" runat="server" Height="100px" 
                    ImageUrl="~/Imagenes/ProductosAseo/escoba.jpg" onclick="ImgEscoba_Click" 
                    Width="100px" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <br />
            </td>
            <td align="center" rowspan="4">
                <asp:ImageButton ID="ImgGuantes" runat="server" Height="100px" 
                    ImageUrl="~/Imagenes/ProductosAseo/guantes.jpg" onclick="ImgGuantes_Click" 
                    Width="100px" />
            </td>
            <td align="center" rowspan="4">
                <asp:ImageButton ID="ImgCloro" runat="server" Height="100px" 
                    ImageUrl="~/Imagenes/ProductosAseo/cloro.jpg" onclick="ImgCloro_Click" 
                    Width="100px" />
            </td>
            <td align="left" class="style2">
&nbsp;Valor Unidad $&nbsp;
                <asp:TextBox ID="txtValorUnidad" runat="server" Height="15px" ReadOnly="True" 
                    Width="90px"></asp:TextBox>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            </td>
            <td align="center" rowspan="4">
                <asp:ListBox ID="ListBoxProductos" runat="server" AutoPostBack="True" 
                    Height="102px" Width="152px"></asp:ListBox>
            </td>
        </tr>
        <tr>
            <td align="left" class="style2">
&nbsp;&nbsp;&nbsp;&nbsp; Subtotal $&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="txtSubTotal" runat="server" Height="15px" ReadOnly="True" 
                    Width="90px">0</asp:TextBox>
            </td>
        </tr>
        <tr>
            <td align="left" class="style2">
&nbsp;&nbsp; Efectivo $&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="txtEfectivo" runat="server" Height="15px" Width="90px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td align="left" class="style2">
&nbsp;</td>
        </tr>
        <tr>
            <td align="center" colspan="3">
                Productos Lácteos</td>
            <td align="center" class="style2">
                <br />
                <br />
            </td>
            <td align="center">
                <asp:Button ID="btnComprar" runat="server" onclick="btnComprar_Click" 
                    Text="Comprar" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:Button ID="btnLimpiar" runat="server" onclick="Button1_Click" 
                    Text="Limpiar" />
            </td>
        </tr>
        <tr>
            <td align="center" class="style3">
                <asp:ImageButton ID="ImgLecheSabor" runat="server" Height="100px" 
                    ImageUrl="~/Imagenes/ProductosLacteos/lecheconsabor.jpg" 
                    onclick="ImgLecheSabor_Click" Width="100px" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            </td>
            <td align="center" class="style3">
                <asp:ImageButton ID="ImgLecheSinLactosa" runat="server" Height="100px" 
                    ImageUrl="~/Imagenes/ProductosLacteos/lechesinlactosa.jpg" 
                    onclick="ImgLecheSinLactosa_Click" Width="100px" />
            </td>
            <td align="center" class="style3">
                <asp:ImageButton ID="ImgLecheEntera" runat="server" Height="100px" 
                    ImageUrl="~/Imagenes/ProductosLacteos/lecheentera.jpg" 
                    onclick="ImgLecheEntera_Click" Width="100px" />
            </td>
            <td align="center" class="style4">
                Vuelto $
                <asp:TextBox ID="txtVuelto" runat="server" ReadOnly="True"></asp:TextBox>
&nbsp;&nbsp;&nbsp;
            </td>
            <td align="center" class="style3">
                <br />
                <br />
                <asp:Label ID="lblMensajeCompra" runat="server"></asp:Label>
                <br />
                <br />
            </td>
        </tr>
        <tr>
            <td align="center" colspan="3">
                &nbsp;</td>
            <td align="center" class="style2">
                Total $
                <asp:TextBox ID="txtTotal" runat="server" ReadOnly="True"></asp:TextBox>
&nbsp;
                <br />
            </td>
            <td align="center">
                &nbsp;</td>
        </tr>
        <tr>
            <td align="center" colspan="3">
                &nbsp;</td>
            <td align="center" class="style2">
                <br />
                <asp:Button ID="btnAceptar" runat="server" onclick="btnAceptar_Click" 
                    Text="Aceptar" />
&nbsp;<asp:Button ID="btnDeshacer" runat="server" onclick="btnDeshacer_Click" Text="Deshacer" />
            </td>
            <td align="center">
                &nbsp;</td>
        </tr>
    </table>
    </form>
</body>
</html>

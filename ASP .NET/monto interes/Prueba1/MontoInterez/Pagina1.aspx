<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Pagina1.aspx.cs" Inherits="Prueba1.MontoInterez.Pagina1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        .style1
        {
            width: 50%;
        }
        .style2
        {
            width: 155px;
        }
        .style3
        {
            width: 65px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
    </div>
    <table align="center" bgcolor="Silver" class="style1">
        <tr>
            <td colspan="2">
                Ingrese nombre</td>
            <td colspan="2">
                <asp:TextBox ID="txtNombre" runat="server" Width="265px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                Ingrese monto a solicitar</td>
            <td colspan="2">
                <asp:TextBox ID="txtMonto" runat="server" Width="266px"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td colspan="4">
                Seleccione el numero de cuotas</td>
        </tr>
        <tr>
            <td class="style3">
                <asp:RadioButton ID="Rbt1" runat="server" GroupName="cuotas" Text="1" />
            </td>
            <td align="center" class="style2">
                <asp:RadioButton ID="Rbt6" runat="server" GroupName="cuotas" Text="6" />
            </td>
            <td align="center">
                <asp:RadioButton ID="Rbt12" runat="server" GroupName="cuotas" Text="12" />
            </td>
            <td align="center">
                <asp:RadioButton ID="Rbt24" runat="server" GroupName="cuotas" Text="24" />
            </td>
        </tr>
        <tr>
            <td align="center" colspan="4">
                <asp:Label ID="LblMensaje" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <asp:Button ID="btnCalcular" runat="server" onclick="btnCalcular_Click" 
                    Text="Calcular" />
            </td>
            <td align="center" colspan="2">
                <asp:Button ID="btnLimpiar" runat="server" onclick="btnLimpiar_Click" 
                    Text="Limpiar" />
            </td>
        </tr>
    </table>
    </form>
</body>
</html>

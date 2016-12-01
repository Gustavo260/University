<%@ Page Title="" Language="C#" MasterPageFile="~/Main.master" AutoEventWireup="true" CodeFile="Agregar.aspx.cs" Inherits="Agregar" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
    .style4
    {
        width: 312px;
    }
        .style5
        {
            width: 128px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table class="style1">
    <tr>
        <td align="center" style="color: #FFFFFF">
            Menu agregar<br />
            <br />
            Inserte los datos correspondientes<br />
            <br />
            <table class="style1">
                <tr align="center">
                    <td class="style4">
                        <table class="style1" style="width: 27%">
                            <tr>
                                <td align="center" colspan="2">
                                    Abonados</td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Rut</td>
                                <td align="center">
                                    <asp:TextBox ID="txtRut" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Nombre</td>
                                <td align="center">
                                    <asp:TextBox ID="txtNombre" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Apellido</td>
                                <td align="center">
                                    <asp:TextBox ID="txtApellido" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Email</td>
                                <td align="center">
                                    <asp:TextBox ID="txtEmail" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
                                        Text="Agregar" />
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table class="style1" style="width: 78%">
                            <tr>
                                <td align="center" colspan="2">
                                    Giros</td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Rut del abonado</td>
                                <td align="center" class="style5">
                                    <asp:TextBox ID="txtRutAbonado" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Codigo del tipo de giro</td>
                                <td align="center" class="style5">
                                    <asp:TextBox ID="txtCodigoGiro" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Fecha del giro</td>
                                <td align="center" class="style5">
                                    <asp:TextBox ID="txtFechaGiro" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Monto del giro</td>
                                <td align="center" class="style5">
                                    <asp:TextBox ID="txtMontoGiro" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <asp:Button ID="Button2" runat="server" Text="Agregar" 
                                        onclick="Button2_Click" />
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table class="style1" style="width: 84%">
                            <tr>
                                <td align="center" colspan="2">
                                    Tipos_Giros</td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Codigo del giro</td>
                                <td align="center">
                                    <asp:TextBox ID="txtCodigoTipoGiro" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center">
                                    Nombre del giro</td>
                                <td align="center">
                                    <asp:TextBox ID="txtNombreGiro" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <asp:Button ID="Button3" runat="server" Text="Agregar" 
                                        onclick="Button3_Click" />
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>
</asp:Content>


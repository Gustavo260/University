<%@ Page Title="" Language="C#" MasterPageFile="~/Main.master" AutoEventWireup="true" CodeFile="Eliminar.aspx.cs" Inherits="Eliminar" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .style5
        {
            width: 128px;
        }
        .style6
        {
            width: 45px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table class="style1">
        <tr>
            <td class="style2" style="color: #FFFFFF">
                <div class="style2">
                    Menu Eliminar<br />
                    <br />
                    Ingrese los datos pedidos<br />
                    <br />
                </div>
                <table class="style1">
                    <tr align="center">
                        <td>
                        <table class="style1" style="width: 72%">
                            <tr>
                                <td align="center" colspan="2">
                                    Abonados</td>
                            </tr>
                            <tr>
                                <td align="center" class="style6">
                                    Rut</td>
                                <td align="center">
                                    <asp:TextBox ID="txtRut" runat="server" Width="117px"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
                                        Text="Eliminar" />
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
                                    Codigo del tipo de giro</td>
                                <td align="center" class="style5">
                                    <asp:TextBox ID="txtCodigoGiro" runat="server"></asp:TextBox>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <asp:Button ID="Button2" runat="server" Text="Eliminar" 
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
                                <td align="center" colspan="2">
                                    <asp:Button ID="Button3" runat="server" Text="Eliminar" 
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


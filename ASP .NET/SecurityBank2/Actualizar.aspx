<%@ Page Title="" Language="C#" MasterPageFile="~/Main.master" AutoEventWireup="true" CodeFile="Actualizar.aspx.cs" Inherits="Actualizar" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
        .style4
        {
            width: 275px;
        }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table class="style1">
        <tr>
            <td style="color: #FFFFFF">
                Menu actualizar<br />
                <br />
                <table class="style1">
                    <tr align="center">
                        <td>
                            <table class="style1" style="width: 24%">
                                <tr>
                                    <td align="center" colspan="2">
                                        Abonados</td>
                                </tr>
                                <tr>
                                    <td align="center" class="style4">
                                        Rut</td>
                                    <td align="center">
                                        <asp:TextBox ID="txtRut" runat="server"></asp:TextBox>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" class="style4">
                                        Campo</td>
                                    <td align="center">
                                        <asp:DropDownList ID="dwnCampoAbonado" runat="server" Height="21px" 
                                            Width="103px">
                                        </asp:DropDownList>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
                                            Text="Guardar" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td>
                            <table class="style1" style="width: 65%">
                                <tr>
                                    <td align="center" colspan="2">
                                        Giros</td>
                                </tr>
                                <tr>
                                    <td align="center" class="style4">
                                        Codigo del giro</td>
                                    <td align="center">
                                        <asp:TextBox ID="txtCodigoGiro" runat="server"></asp:TextBox>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" class="style4">
                                        Campo</td>
                                    <td align="center">
                                        <asp:DropDownList ID="dwnCampoGiros" runat="server" Height="21px" Width="103px">
                                        </asp:DropDownList>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:Button ID="Button2" runat="server" onclick="Button2_Click" 
                                            Text="Guardar" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td>
                            <table class="style1" style="width: 78%">
                                <tr>
                                    <td align="center" colspan="2">
                                        Tipos de giros</td>
                                </tr>
                                <tr>
                                    <td align="center" class="style4">
                                        Codigo del tipo de giro</td>
                                    <td align="center">
                                        <asp:TextBox ID="txtCodigoTipoGiro" runat="server"></asp:TextBox>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" class="style4">
                                        Campo</td>
                                    <td align="center">
                                        <asp:DropDownList ID="dwnCampoTiposGiros" runat="server" Height="21px" 
                                            Width="103px">
                                        </asp:DropDownList>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:Button ID="Button3" runat="server" onclick="Button3_Click" 
                                            Text="Guardar" />
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


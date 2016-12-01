<%@ Page Title="" Language="C#" MasterPageFile="~/Main.master" AutoEventWireup="true" CodeFile="Buscar.aspx.cs" Inherits="Buscar" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table class="style1">
        <tr>
            <td class="style2" style="color: #FFFFFF">
                <div class="style2">
                    Menu Consulta<br />
                    <br />
                    Seleccione lo que desea buscar por tabla<br />
                    <br />
                </div>
                <table class="style1">
                    <tr>
                        <td>
                            <table align="center" class="style1" style="width: 28%">
                                <tr>
                                    <td align="center" colspan="2">
                                        Abonados</td>
                                </tr>
                                <tr>
                                    <td align="center">
                                        Rut del abonado</td>
                                    <td align="center">
                                        <asp:DropDownList ID="dwnlistAbonados" runat="server" Height="16px" 
                                            Width="50px">
                                        </asp:DropDownList>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:ListBox ID="lstAbonados" runat="server" Width="234px"></asp:ListBox>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Buscar" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td>
                            <table align="center" class="style1" style="width: 28%">
                                <tr>
                                    <td align="center" colspan="2">
                                        Tipos de giros</td>
                                </tr>
                                <tr>
                                    <td align="center">
                                        Codigo del tipo de giro</td>
                                    <td align="center">
                                        <asp:DropDownList ID="dwnlistTiposGiros" runat="server" Height="16px" 
                                            Width="50px">
                                        </asp:DropDownList>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:ListBox ID="lstTiposGiros" runat="server" Width="234px"></asp:ListBox>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:Button ID="Button2" runat="server" onclick="Button2_Click" Text="Buscar" />
                                    </td>
                                </tr>
                            </table>
                        </td>
                        <td>
                            <table align="center" class="style1" style="width: 28%">
                                <tr>
                                    <td align="center" colspan="2">
                                        Giros Realizados</td>
                                </tr>
                                <tr>
                                    <td align="center">
                                        Codigo del giro</td>
                                    <td align="center">
                                        <asp:DropDownList ID="dwnlistGiros" runat="server" Height="16px" Width="50px">
                                        </asp:DropDownList>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:ListBox ID="lstGiros" runat="server" Width="234px"></asp:ListBox>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <asp:Button ID="Button3" runat="server" onclick="Button3_Click" Text="Buscar" />
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


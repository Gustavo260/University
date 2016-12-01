<%@ Page Title="" Language="C#" MasterPageFile="~/Main.master" AutoEventWireup="true" CodeFile="Consultageneral.aspx.cs" Inherits="Consultageneral" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
    <style type="text/css">
    .style3
    {
        color: #FFFFFF;
    }
    .style4
    {
        color: #FFFFFF;
    }
</style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <form id="form1" runat="server">
    <table class="style1">
        <tr>
            <td align="center" style="color: #FFFFFF">
                <strong>Tabla de trabajadores</strong><br />
                <br />
                <br />
                <br />
                <br />
            </td>
        </tr>
    </table>
    <table align="center" class="style1" style="width: 50%">
        <tr>
            <td align="center" class="style4">
                Lista</td>
        </tr>
        <tr>
            <td align="center" class="style3">
                <asp:ListBox ID="ListBox1" runat="server" Height="245px" Width="480px">
                </asp:ListBox>
                <br />
                <br />
                <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Buscar" />
            </td>
        </tr>
</table>
<br />
    <br />
</form>
</asp:Content>


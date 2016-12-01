<%@ Page Title="" Language="C#" MasterPageFile="~/Main.master" AutoEventWireup="true" CodeFile="Consultacodigo.aspx.cs" Inherits="Consultacodigo" %>

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
    .style5
    {
        color: #FFFFFF;
    }
    .style6
    {
        color: #FFFFFF;
        height: 30px;
    }
    </style>
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <form id="form1" runat="server">
    <table class="style1">
        <tr>
            <td align="center" style="color: #FFFFFF">
                ¿QUÉ TRABAJADOR DESEA BUSCAR?<br />
                <br />
            </td>
        </tr>
    </table>
    <table align="center" class="style1" style="width: 39%; height: 144px;">
        <tr>
            <td align="center" class="style4" colspan="2">
                Buscar por codigo</td>
        </tr>
        <tr>
            <td align="center" class="style5">
                Codigo del trabajador<br />
            </td>
            <td align="center" class="style3">
                <asp:TextBox ID="txtCodigo" runat="server"></asp:TextBox>
            </td>
        </tr>
        <tr>
            <td align="center" class="style5" colspan="2">
                <asp:Label ID="lblMensaje" runat="server"></asp:Label>
            </td>
        </tr>
        <tr>
            <td align="center" class="style6" colspan="2">
                <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Buscar" />
            </td>
        </tr>
    </table>
    <br />
    <br />
    </form>
</asp:Content>

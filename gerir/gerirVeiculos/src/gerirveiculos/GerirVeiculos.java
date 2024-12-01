/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerirveiculos;
import InterfaceGrafica.MenuPrincipal;
import InterfaceGrafica.ModeloTabela;
import InterfaceGrafica.TabelaPesquisaCliente;
import dbClasses.ConexaoJDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author gustavo
 */
public class GerirVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ConexaoJDBC con = new ConexaoJDBC();
        con.conecta();
        MenuPrincipal model = new MenuPrincipal();
        model.setVisible(true);
        
        con.disconecta();
    }
    
}

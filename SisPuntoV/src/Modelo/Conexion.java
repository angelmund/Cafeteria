
package Modelo;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Conexion {
    //conexion
    
   private static Connection Conection;
    private static Statement Sentencia;
    private static ResultSet Resultado;
    private final String bd;
    private final String user;
    private final String password;

    public Conexion(String bd, String user, String password) {
        Conection = null;
        Sentencia = null;
        Resultado = null;
        this.bd = bd;
        this.user = user;
        this.password = password;
    }

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/" + bd, user, password);
            if(Conection!=null){
            
        }
        } catch (SQLException | ClassNotFoundException e) {
            
        }
       return false;
    }

    public void desconectar() {
        try {
            this.Conection.close();
        } catch (Exception e) {
        }
    }

    public ArrayList getListaProductos() {
        ArrayList mListaProductos = new ArrayList();
        ModelProductos mProductos = null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = Conection.createStatement();
            resultado = consulta.executeQuery("select * from productos");

            while (resultado.next()) {
                mProductos = new  ModelProductos();
                mProductos.setIdProductos(resultado.getInt("idProductos"));
                mProductos.setProducto(resultado.getString("producto"));
                mProductos.setCantidad(resultado.getInt("cantidad"));
                mListaProductos.add(mProductos);
            }
        } catch (SQLException e) {
        }
        return mListaProductos;
    }
    
    public ArrayList getListaTamanos() {
        ArrayList mListaTamanos = new ArrayList();
        ModelTamanos mTamanos = null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = Conection.createStatement();
            resultado = consulta.executeQuery("select * from tamanos");

            while (resultado.next()) {
                mTamanos = new  ModelTamanos();
                mTamanos.setIdTamanos(resultado.getInt("idTamanos"));
                mTamanos.setPrecio(resultado.getInt("precio"));
                mTamanos.setTamano(resultado.getString("tamano"));
                mListaTamanos.add(mTamanos);
            }
        } catch (SQLException e) {
        }
        return mListaTamanos;
    }

    public PreparedStatement PreparedStatement(String insert_into_ventaidventaproductostamanosc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}


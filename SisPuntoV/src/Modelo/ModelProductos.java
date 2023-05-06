package Modelo;

import java.sql.Connection;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModelProductos {
    private int idProductos;
    private String producto;
    private int precio;
    private int cantidad;
    
    /*
    
    public ArrayList<Productos>getProductos(){
     
        Connection con = Conexion.conectar();
        Statement stmt;
        ResultSet rs;
        ArrayList<Productos>listaProductos = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM  productos"); //hace la consulta a la bd
            while(rs.next()){ //rs.next() trae al siguiente dato
                Ctr_Productos  productos= new Ctr_Productos(); 
                productos.setIdProductos(rs.getInt("IdProductos"));
                productos.setProducto(rs.getString("producto"));
                productos.setPrecio(rs.getInt("precio"));
                productos.setCantidad(rs.getInt("cantidad"));
                listaProductos.add(productos);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(ModelProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProductos;
    }
*/

    public ModelProductos() {
        idProductos = 0;
        producto = "";
        precio = 0;
        cantidad = 0;
       
    }

    
    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   
       
}

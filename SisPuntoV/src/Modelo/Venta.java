
package Modelo;

public class Venta {
    //Atributos
    int id;
    String producto;
    int cantidad;
    double precio;
    double total;
    String Tipotamano;
    
    

    //CONSTRUCTOR VACÍO
    public Venta() {
    }

    //Métodos GET Y SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getTipotamano() {
        return Tipotamano;
    }

    public void setTipotamano(String Tipotamano) {
        this.Tipotamano = Tipotamano;
    }
   

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
      //Aquí termina el Método GET Y SET   
}

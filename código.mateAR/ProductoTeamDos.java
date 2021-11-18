
public class ProductoTeamDos {
  
  public int codigoProducto;
  public String nombreProducto;
  public double precio;
  public String descripcion;
  public String color;
  public int stock;
  public String categoria;
  
  public ProductoTeamDos(int codigoProducto, String nombreProducto, double precio, String descripcion, String color, int stock, String categoria){
    this.codigoProducto = codigoProducto;
    this.nombreProducto = nombreProducto;
    this.precio = precio;
    this.descripcion = descripcion;
    this.color = color;
    this.stock = stock;
    this.categoria = categoria;
  }
  
   public int getCodigoProducto(){
    return this.codigoProducto;
  }
  public void setCodigoProducto(int codigoProducto){
    this.codigoProducto = codigoProducto;
  }
  
  public String getNombreProducto(){
    return this.nombreProducto;
  }
  public void setNombrProducto(String nombreProducto){
    this.nombreProducto = nombreProducto;
  }

  public String getDescripcion(){
    return this.descripcion;
  }
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }
 
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  
  public double getPrecio(){
    return this.precio;
  }
  public void setPrecio(double precio){
    this.precio = precio;
  }
  
  public int getStock(){
    return this.stock;
  }
  public void setStock(int stock){
    this.stock = stock;
  }
  
  public String getCategoria(){
    return this.categoria;
  }
  public void setCategoria(String categoria){
    this.categoria = categoria;
  }
  
}

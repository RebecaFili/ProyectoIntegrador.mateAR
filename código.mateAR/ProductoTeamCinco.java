
public class ProductoTeamCinco {
  
  public double precioDeProducto;
  public String descripcion;
  public String nombre;
  
  public ProductoTeamCinco(double precioDeProducto, String descripcion, String nombre){
    this.precioDeProducto = precioDeProducto;
    this.descripcion = descripcion;
    this.nombre = nombre;
  }
  
  public String getDescripcion(){
    return this.descripcion;
  }
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }
  
   public double getPrecioDeProducto(){
    return this.precioDeProducto;
  }
  public void setPrecioDeProducto(double precioDeProducto){
    this.precioDeProducto = precioDeProducto;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  public void setNombr(String nombre){
    this.nombre = nombre;
  }

}

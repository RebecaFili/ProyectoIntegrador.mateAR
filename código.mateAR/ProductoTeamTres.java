
public class ProductoTeamTres {
  
  public int codigoDeProducto;
  public double precioUnitario;
  public String descripcion;
  
  public ProductoTeamTres(int codigoDeProducto, double precioUnitario, String descripcion){
    this.codigoDeProducto = codigoDeProducto;
    this.precioUnitario = precioUnitario;
    this.descripcion = descripcion;
  }
  
   public int getCodigoDeProducto(){
    return this.codigoDeProducto;
  }
  public void setCodigoDeProducto(int codigoDeProducto){
    this.codigoDeProducto = codigoDeProducto;
  }
  
  public String getDescripcion(){
    return this.descripcion;
  }
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }
  
   public double getPrecioUnitario(){
    return this.precioUnitario;
  }
  public void setPrecioUnitario(double precioUnitario){
    this.precioUnitario = precioUnitario;
  }
  
}

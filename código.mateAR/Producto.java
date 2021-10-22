import java.time.LocalDate;

public class Producto {
  
  private int codigoProducto;
  private LocalDate fechaIngreso;
  private LocalDate fechaBaja;
  private String descripcionProducto;
  private String modelo;
  private String color;
  private String tamaño;
  private float precioUnitario;
  private int cantidadActual;
  private boolean disponibleALaVenta;
  private String categoria;
  
  public Producto (int codigoProducto, String descripcionProducto, String modelo, String color, float precioUnitario, int cantidadActual, boolean dispobleALaVenta, String categoria)
  {
    this.codigoProducto = codigoProducto;
    this.descripcionProducto = descripcionProducto;
    this.modelo = modelo;
    this.color = color;
    this.precioUnitario = precioUnitario;
    this.cantidadActual = cantidadActual;
    this.disponibleALaVenta = disponibleALaVenta;
    this.categoria = categoria;
  }
  
  public int getCodigoProducto(){
    return this.codigoProducto;
  }
  public void setCodigoProducto(int codigoProducto){
    this.codigoProducto = codigoProducto;
  }
  
  public String getDescripcionProducto(){
    return this.descripcionProducto;
  }
  public void setDescripcionProducto(String descripcionProducto){
    this.descripcionProducto = descripcionProducto;
  }
  
  public String getModelo(){
    return this.modelo;
  }
  public void setModelo(String modelo){
    this.modelo = modelo;
  }
   
 
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  
  
  public float getPrecioUnitario(){
    return this.precioUnitario;
  }
  public void setPrecioUnitario(float precioUnitario){
    this.precioUnitario = precioUnitario;
  }
  
  public int getCantidadActual(){
    return this.cantidadActual;
  }
  public void setCantidadActual(int cantidadActual){
    this.cantidadActual = cantidadActual;
  }
  
  public boolean getDisponibleALaVenta(){
    return this.disponibleALaVenta;
  }
  public void setDisponibleALaVenta(boolean disponibleALaVenta){
    this.disponibleALaVenta = disponibleALaVenta;
  }
  
  public String getCategoria(){
    return this.categoria;
  }
  public void setCategoria(String categoria){
    this.categoria = categoria;
  }
  
  public String toString() {
    return this.descripcionProducto;
  }
   
  
}

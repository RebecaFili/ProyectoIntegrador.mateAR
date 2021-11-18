import java.time.LocalDate;

public class Producto {
  
  private int codigoProducto;
  private LocalDate fechaIngreso;
  private LocalDate fechaBaja;
  private String nombreProducto;
  private String descripcionProducto;
  private String modelo;
  private String color;
  private String tamaño;
  private double precioUnitario;
  private int cantidadActual;
  private boolean disponibleALaVenta;
  private String categoria;
  private boolean estadoOferta;
  private String motivoOferta;
  private double importeOferta;
  
  public Producto (int codigoProducto, String nombreProducto, String descripcionProducto, String modelo, String color, int cantidadActual, boolean dispobleALaVenta, String categoria, boolean estadoOferta, String motivoOferta, double importeOferta)
  {
    this.codigoProducto = codigoProducto;
    this.nombreProducto = nombreProducto;
    this.descripcionProducto = descripcionProducto;
    this.modelo = modelo;
    this.color = color;
    this.cantidadActual = cantidadActual;
    this.disponibleALaVenta = disponibleALaVenta;
    this.categoria = categoria;
    this.estadoOferta = estadoOferta;
    this.motivoOferta = motivoOferta;
    this.importeOferta = importeOferta;
    
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
  
  public LocalDate getFechaBaja(){
    return this.fechaBaja;
  }
  public void setFechaBaja(LocalDate fechaBaja){
    this.fechaBaja = fechaBaja;
  }
  
  public boolean getEstadoOferta(){
    return this.estadoOferta;
  }
  public void setEstadoOferta(boolean estadoOferta){
    this.estadoOferta = estadoOferta;
  }
  
  public String getMotivoOferta(){
    return this.motivoOferta;
  }
  public void setMotivoOferta(String motivoOferta){
    this.motivoOferta = motivoOferta;
  }
  
  public double geImporteOferta(){
    return this.importeOferta;
  }
  public void setImporteOferta(double importeOferta){
    this.importeOferta = importeOferta;
  }
  
  
  
  public String toString() {
    return this.descripcionProducto;
  }

}


public class Combo {
  
  private int codigoCombo;
  private String nombreCombo;
  private String descripcionCombo;
  private double precioCombo;
  private int cantidadActual;
  private boolean disponibilidadComboALaVenta;
  
   public Combo (int codigoCombo, String nombreCombo, String descripcionCombo, double precioCombo, int cantidadActual, boolean disponibilidadComboALaVenta)
  {
    this.codigoCombo = codigoCombo;
    this.nombreCombo = nombreCombo;
    this.descripcionCombo = descripcionCombo;
    this.precioCombo = precioCombo;
    this.cantidadActual = cantidadActual;
    this.disponibilidadComboALaVenta = disponibilidadComboALaVenta;
  }
   
   public int getCodigoCombo(){
    return this.codigoCombo;
  }
  public void setCodigoCombo(int codigoCombo){
    this.codigoCombo = codigoCombo;
  }
  
  public String getNombreCombo(){
    return this.nombreCombo;
  }
  public void setNombreCombo(String nombreCombo){
    this.nombreCombo = nombreCombo;
  }
  
  public String getDescripcionCombo(){
    return this.descripcionCombo;
  }
  public void setDescripcionCombo(String descripcioCombo){
    this.descripcionCombo = descripcionCombo;
  }
  
  public double getPrecioCombo(){
    return this.precioCombo;
  }
  public void setPrecioCombo(double precioCombo){
    this.precioCombo = precioCombo;
  }
  
  public int getCantidadActual(){
    return this.cantidadActual;
  }
  public void setCantidadActual(int cantidadActual){
    this.cantidadActual = cantidadActual;
  }
  
  public boolean getDisponibilidadComboALaVenta(){
    return this.disponibilidadComboALaVenta;
  }
  public void setDisponibilidadComboALaVenta(boolean disponibilidadComboALaVenta){
    this.disponibilidadComboALaVenta = disponibilidadComboALaVenta;
  }
  
  public String toString() {
    return this.descripcionCombo;
  }
}

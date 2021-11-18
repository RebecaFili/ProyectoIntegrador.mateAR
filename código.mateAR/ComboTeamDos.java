
public class ComboTeamDos {
  
  private int codigoCombo;
  private String nombreCombo;
  private String descripcion;
  private double precio;
  private int stock;
  
   public ComboTeamDos (int codigoCombo, String nombreCombo, String descripcion, double precio, int stock)
  {
    this.codigoCombo = codigoCombo;
    this.nombreCombo = nombreCombo;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
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
  
  public String getDescripcion(){
    return this.descripcion;
  }
  public void setDescripcion(String descripcio){
    this.descripcion = descripcion;
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
  
}

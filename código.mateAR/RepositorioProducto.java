import java.util.*;
import java.time.LocalDate;

public class RepositorioProducto {
  private static ArrayList<Producto> listadoProductos = new ArrayList<Producto>();
  
  public void AgregarProducto(Producto nuevoProducto){
    listadoProductos.add(nuevoProducto);
  }
  
  public Producto ObtenerProducto(int codigoProducto){
    for (Producto producto: listadoProductos){
      if(producto.getCodigoProducto() == codigoProducto){
        return producto;
      }
    }
    return null;
  }
   
}

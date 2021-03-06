import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import org.json.*;

public class Main {
  
  public static void main(String[] args) { 
    System.out.println("-Seleccione una de las siguientes opciones!");
    System.out.println("1 -> Cargar producto");
    System.out.println("2 -> Cargar combo");
    System.out.println("3 -> Actualizar stock");
    System.out.println("4 -> Registro ofertas especiales");
    System.out.println("5 -> Registrar baja de producto");
    System.out.println("6 -> Registrar baja de combo");  
    
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();
    switch(opcion){
      case 1:
        CargarProducto();
      break;
      case 2:
        CargarCombo();
      break;
      case 3:
       CargarProducto();
       ActualizarStockDeProducto();
      break;
      case 4:
        CargarProducto();
        RegistroOfertasEspeciales();
      break;
      case 5:
        CargarProducto();
        RegistrarBajaProducto();
      break;
      case 6:
        CargarCombo();
        RegistrarBajaCombo();
      break;
    }
  }
    
    public static void CargarProducto(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      System.out.println("\n-Cargue los siguientes campos referidos al nuevo producto!");
      
      System.out.println("Nombre\t");
      Scanner scanner = new Scanner(System.in);
      String nombreProducto = scanner.nextLine();
      
      System.out.println("Descripcion\t");
      String descripcionProducto = scanner.nextLine();
      
      System.out.println("Modelo\t");
      String modelo = scanner.nextLine();
      
      System.out.println("Color\t");
      String color = scanner.nextLine();
      
      System.out.println("Categoria\t");
      String categoria = scanner.nextLine();

      System.out.println("Descripcion oferta\t");
      String motivoOferta = scanner.nextLine();
       
      System.out.println("Precio oferta\t");
      double importeOferta = scanner.nextFloat();
      
      System.out.println("Estado oferta\t");
      boolean estadoOferta = scanner.nextBoolean();
      
      System.out.println("Codigo\t");
      int codigoProducto = scanner.nextInt();
      
      System.out.println("Ingrese la cantidad de compra para definir el precio\t");
      int cantidadAComprar = scanner.nextInt();
      
      if(cantidadAComprar==1){
        System.out.println("Precio unitario\t");
        double precioUnitario = scanner.nextFloat();
        System.out.println("Precio final [" + precioUnitario + "]");
      }
      else{
        if(2 <= cantidadAComprar && cantidadAComprar <= 5){
          System.out.println("Precio minimo rango de referencia\t");
          double precioMinimoRango = scanner.nextFloat();
          precioMinimoRango = precioMinimoRango*1.2;
          System.out.println("Precio final [" + precioMinimoRango + "]");
        }
        else{
          if(6 <= cantidadAComprar && cantidadAComprar <= 10){
            System.out.println("Precio medio rango de referencia\t");
            double precioMedioRango = scanner.nextFloat();
            precioMedioRango = precioMedioRango*1.3;
            System.out.println("Precio final [" + precioMedioRango + "]\n");
          }
          else{
            if(cantidadAComprar >=8){
              System.out.println("Precio maximo rango de referencia\t");
              double precioMaximoRango = scanner.nextFloat();
              precioMaximoRango = precioMaximoRango*1.4;
              System.out.println("Precio final [" + precioMaximoRango + "]");
            }  
          }
        }
      }
    
      System.out.println("Cantidad actual\t");
      int cantidadActual = scanner.nextInt();
      
      System.out.println("Disponibilidad de venta\t");
      boolean disponibilidadALaVenta = scanner.nextBoolean();
      
      
      Producto producto1 = new Producto(codigoProducto, nombreProducto, descripcionProducto, modelo, color, cantidadActual, disponibilidadALaVenta, categoria, estadoOferta, motivoOferta, importeOferta);
      listadoProductos.AgregarProducto(producto1);
      System.out.println("El producto [" + producto1.getCodigoProducto() + "] se ha registrado con exito!\n");
    }
    
    
    
    public static void CargarCombo(){
      RepositorioCombo listadoCombos = new RepositorioCombo();
      
      System.out.println("\n-Cargue los siguientes campos referidos al nuevo combo!");
      
      System.out.println("Nombre\t");
      Scanner scanner = new Scanner(System.in);
      String nombreCombo = scanner.nextLine();
      
      System.out.println("Descripcion\t");
      String descripcionCombo = scanner.nextLine();
      
      System.out.println("Codigo\t");
      int codigoCombo = scanner.nextInt();
    
      System.out.println("Precio\t");
      double precioCombo= scanner.nextFloat();
      
      System.out.println("Cantidad actual\t");
      int cantidadActual = scanner.nextInt();
      
      System.out.println("Disponibilidad de venta\t");
      boolean disponibilidadComboALaVenta = scanner.nextBoolean();
      
      Combo combo1 = new Combo(codigoCombo, nombreCombo, descripcionCombo, precioCombo, cantidadActual, disponibilidadComboALaVenta);
      listadoCombos.AgregarCombo(combo1);
      System.out.println("El combo [" + combo1.getCodigoCombo() + "] se ha registrado con exito!\n");
    }
    
    
    
    public static void ActualizarStockDeProducto(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      System.out.println("-Ingrese el codigo del producto para poder actualizar su stock!\t");
      Scanner scanner = new Scanner(System.in);
      int codigoProducto = scanner.nextInt();
      Producto producto = listadoProductos.ObtenerProducto(codigoProducto);
    
      if (producto == null){
        System.out.println("ERROR! El producto con codigo " + codigoProducto + " no existe en el registro");
      }
      else{
        
        if (producto.getCantidadActual()>=0){
          System.out.println("Cantidad a reponer\t");
          int nuevaCantidad = scanner.nextInt();
          
          nuevaCantidad = nuevaCantidad + producto.getCantidadActual();
          producto.setCantidadActual(nuevaCantidad);
          System.out.println("El stock se actualizo con exito!\nCantidad Actual = " + nuevaCantidad);
        }
      }
    }
    
    
    public static void RegistroOfertasEspeciales(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      System.out.println("Para saber si el producto tiene ofertas especiales vigentes, ingrese el codigo correspondiente!\t");
      Scanner scanner = new Scanner(System.in);
      int codigoProducto = scanner.nextInt();
      Producto producto = listadoProductos.ObtenerProducto(codigoProducto);
    
      if (producto == null){
        System.out.println("ERROR! El producto con codigo " + codigoProducto + " no existe en el registro");
      }
      else{
        if(producto.getEstadoOferta() == true){
          System.out.println("Oferta especial del producto [" + producto + "] en el [" + producto.getMotivoOferta() + "]");
        }
      }
        
    }
      
    
    
    public static void RegistrarBajaProducto(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      System.out.println("Si desea dar de baja a un producto\n -Ingrese el codigo correspondiente!\t");
      Scanner scanner = new Scanner(System.in);
      int codigoProducto = scanner.nextInt();
      Producto producto = listadoProductos.ObtenerProducto(codigoProducto);
    
      if (producto == null){
        System.out.println("ERROR! El producto con codigo " + codigoProducto + " no existe en el registro");
      }
      else{
        System.out.println("Baja del producto [" + producto + "] registrada el dia [" + LocalDate.now() + "] a las [" + LocalTime.now() + "] horas");
        producto.setFechaBaja(LocalDate.now());
      }
    }
    
    
    
    public static void RegistrarBajaCombo(){
      RepositorioCombo listadoCombos = new RepositorioCombo();
      
      System.out.println("Si quiere dar de baja a un combo\n -Ingrese el codigo correspondiente!\t");
      Scanner scanner = new Scanner(System.in);
      int codigoCombo = scanner.nextInt();
      Combo combo = listadoCombos.ObtenerCombo(codigoCombo);
    
      if (combo == null){
        System.out.println("ERROR! El combo con codigo [" + codigoCombo + "] no existe en el registro");
      }
      else{
        System.out.println("Baja del combo [" + combo + "] registrada el dia [" + LocalDate.now() + "] a las [" + LocalTime.now() + "] horas");
      }
    }
    
    public static ArrayList<ProductoTeamDos> productosTeamDos = new ArrayList<ProductoTeamDos>();
    public static ArrayList<ComboTeamDos> combosTeamDos = new ArrayList<ComboTeamDos>();
    public static ArrayList<ProductoTeamTres> productosteamTres = new ArrayList<ProductoTeamTres>();
    public static ArrayList<ProductoTeamCinco> productosteamCinco = new ArrayList<ProductoTeamCinco>();
    
    public static void GenerarJsonProductosTeamDos(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      for(int valorActual in RepositorioProducto.listadoProductos){
    
        int codigoProducto = valorActual.codigoProducto;
        String nombreProducto = valorActual.nombreProducto;
        double precio = valorActual.precioUnitario;
        String descripcion = valorActual.descripcionProducto;
        String color = valorActual.color;
        int stock = valorActual.cantidadActual;
        String categoria = valorActual.categoria;
        
        ProductoTeamDos productosTeamDos = new ProductoTeamDos(codigoProducto, nombreProducto, precio, descripcion, color, stock, categoria);
        productosTeamDos.Add(productosTeamDos);
      }
    }
    
    public static void GenerarJsonCombosTeamDos(){
      RepositorioCombo listadoCombos = new RepositorioCombo();
      
      for(int valorActual in RepositorioCombo.listadoCombos){
        
        int codigoCombo = valorActual.codigoCombo;
        String nombreCombo = valorActual.nombreCombo;
        double precio = valorActual.precioCombo;
        String descripcion = valorActual.descripcionCombo;
        int stock = valorActual.cantidadActual;

        ComboTeamDos combosTeamDos = new ComboTeamDos(codigoCombo, nombreCombo, precio, descripcion, stock);
        combosTeamDos.Add(combosTeamDos);
      }
    }
    
    public static void GenerarJsonProductosTeamTres(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      for(int valorActual in RepositorioProducto.listadoProductos){
    
        int codigoDeProducto = valorActual.codigoProducto;
        double precioUnitario = valorActual.precioUnitario;
        String descripcion = valorActual.descripcionProducto;

        ProductoTeamDos productosTeamTres = new ProductoTeamTres(codigoDeProducto, precioUnitario, descripcion);
        productosTeamTres.Add(productosTeamTres);
      }
    }
    
    public static void GenerarJsonProductosTeamCinco(){
      RepositorioProducto listadoProductos = new RepositorioProducto();
      
      for(int valorActual in RepositorioProducto.listadoProductos){
    
        double precioDeProducto = valorActual.precioUnitario;
        String descripcion = valorActual.descripcionProducto;
        String nombre = valorActual.nombreProducto

        ProductoTeamDos productosTeamCinco = new ProductoTeamCinco(precioDeProducto, descripcion, nombre);
        productosTeamCinco.Add(productosTeamCinco);
      }
    }
    
}
  
 
  

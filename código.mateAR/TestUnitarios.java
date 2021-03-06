import junit.framework.TestCase;
  
public class TestUnitarios {
  
  @Test
  public void TestProductoDadoDeBaja(){
    Producto productoUno = new Producto(1, "nom1", "desc1", "mod1", "color1", 0, false, "cat1", true, "motOfe1", 152.30);
    listadoProductos.Add(nuevoProducto);
    
    for(int i=0;i<listadoProductos.size();i++){
      if(i.cantidadActual < 1){
        i.resultadoEsperado = true;
      }
      Assert.True(i.resultado);
    }
  }
  
    @Test
  public void TestProductoDisponible(){
    Producto productoDos = new Producto(2, "nom2", "desc2", "mod2", "color2", 24, false, "cat2", true, "motOfe2", 3000);
    listadoProductos.Add(nuevoProducto);
    
    boolean resultadoEsperado = false;
    
    for(int i=0;i<listadoProductos.size();i++){
      if(i.cantidadActual > 0){
        resultadoEsperado = true;
      }
      Assert.True(resultadoEsperado);
    }
  }
  
  @Test
  public void TestEstadoOferta(){
    Producto productoTres = new Producto(3, "nom3", "desc3", "mod3", "color3", 13, true, "cat3", true, "motOfe3", 6700);
   listadoProductos.Add(nuevoProducto);
   
   for(int i=0;i<listadoProductos.size();i++){
      if(i.estadoOferta){
        resultadoEsperado = true;
      }
      Assert.True(resultadoEsperado);
    }
  
  @Test
  public void TestNombreProducto(){
    Producto productoCuatro = new Producto();
    productoCuatro.setNombreProducto("Mate Pampa");
    Assert.Equals("Mate Pampa", productoCuatro.getNombreProducto());
  }
  
  @Test
  public void TestNombreCombo(){
    Combo comboUno = new Combo();
    comboUno.setNombreCombo("Combo completo");
    Assert.Equals("Combo completo", comboUno.getNombreCombo());
  }
}
  

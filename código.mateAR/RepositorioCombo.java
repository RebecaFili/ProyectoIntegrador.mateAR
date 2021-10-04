import java.util.*;

public class RepositorioCombo {
  private static ArrayList<Combo> listadoCombos = new ArrayList<Combo>();
  
  public void AgregarCombo(Combo nuevoCombo){
    listadoCombos.add(nuevoCombo);
  }
  
  public Combo ObtenerCombo(int codigoCombo){
    for (Combo combo: listadoCombos){
      if(combo.getCodigoCombo() == codigoCombo){
        return combo;
      }
    }
    return null;
  }
}

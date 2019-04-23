public class CotizarSeguro{

  // El tipo de seguro a cotizar.
  public TipoSeguro tipSeg;
  // El automovil sobre el cual aplicarse.
  public Automovil auto;


  /** Método que nos dice que tipo de seguro quiere cotizar el cliente.
  * Aquí solo llamaremos en tipoDeSeguro a la enumeración.
  * Idea: Puedo comparar la cadena con la enum y regresarla.
  * @param seguro el tipo de seguro sobre el que se quiere cotizar.
  * @return el tipo de seguro.
  */
  public String tipoDeSeguro(String seguro){
    switch(tipSeg) {
      case CA:
        if(seguro.equals("Cobertura Amplia"))
          return "Cobertura Amplia";
      case DT:
        if(seguro.equals("Daños a Terceros"))
          return "Daños a Terceros";
      case CL:
        if(seguro.equals("Cobertura Limitada"))
          return "Cobertura Limitada";
      case CE:
        if(seguro.equals("Cobertura Extendida"))
          return "Cobertura Extendida";
      default:
        return null;
    }
  }

  /** Método que nos regresa los datos del automovil.
  * @return los datos del auto.
  */
  public String datosAuto(Automovil auto){
    return (auto.getMarca() + auto.getModelo() + auto.getAño());
  }


}

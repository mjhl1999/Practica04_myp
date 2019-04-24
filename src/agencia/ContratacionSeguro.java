public class ContratacionSeguro{

  // El cliente.
  public Cliente cliente;
  // El tipo de seguro a cotizar.
  public TipoSeguro tipSeg;
  // El automovil sobre el cual aplicarse.
  public Automovil auto;
  // El tipo de pago a realizar ("Tarjeta" ó "Efectivo").
  String pago;

  /** Método que nos da los datos del cliente.
  * @return los datos del cliente.
  */
  public String datosCliente(Cliente cliente){
    return cliente.getNombre();
  }


  /** Método que nos dice que tipo de seguro quiere contratar el cliente.
  * Aquí solo llamaremos en tipoDeSeguro a la enumeración.
  * Idea: Puedo comparar la cadena con la enum y regresarla.
  * @param seguro el tipo de seguro sobre el que se quiere contratar.
  * @return el tipo de seguro.
  */
  public String tipoDeSeguro2(String seguro){
    switch(seguro) {
      case "Cobertura Amplia":
        if(seguro.equals("Cobertura Amplia"))
          return "Cobertura Amplia";
      case "Daños a Terceros":
        if(seguro.equals("Daños a Terceros"))
          return "Daños a Terceros";
      case "Cobertura Limitada":
        if(seguro.equals("Cobertura Limitada"))
          return "Cobertura Limitada";
      case "Cobertura Extendida":
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
    return (auto.getMarca() + "\n" +
            auto.getModelo() + "\n" +
            auto.getAño());
  }

  /** Método que define la forma de pago del seguro.
  * @param pago la forma de pagar.
  */
  public void setFormaDePago(String pago){
    this.pago = pago;
  }

  /** Método que regresa la forma de pago del seguro.
  * @return la forma de pagar.
  */
  public String getFormaDePago(){
    return this.pago;
  }




}

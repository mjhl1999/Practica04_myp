public class BajaServicio{

  // El cliente.
  public Cliente cliente;
  // El motivo de la baja.
  String motivo;

  /** Método que nos da los datos del cliente.
  * @return los datos del cliente.
  */
  public String datosCliente(Cliente cliente){
    return cliente.getNombre();
  }

  /** Método que define el motivo de la baja del seguro.
  * @param motivo el motivo de la baja.
  */
  public void setMotivoDeBaja(String motivo){
    this.motivo = motivo;
  }

  /** Método que regresa el motivo de la baja del seguro.
  * @return el motivo de la baja.
  */
  public String getMotivoDeBaja(){
    return this.motivo;
  }


}

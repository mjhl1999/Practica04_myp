public class Cliente{

  // El nombre del cliente.
  String nombre;

  // Constructor.
  public Cliente(String nombre){
    this.nombre = nombre;
  }


  /** Método que define el nombre completo del cliente.
  * @param nombre el nombre del cliente.
  */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /** Método que nos regresa ek nombre del cliente.
  * @return el nombre completo del cliente.
  */
  public String getNombre(){
    return this.nombre;
  }

}

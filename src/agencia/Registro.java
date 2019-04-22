public class Registro{

  /** El username del cliente. */
  public String username;
  /** El password del cliente. */
  public String password;
  /** Booleano para saber si ya está registrado. */
  public boolean reg;


  // Constructor.
  public Registro(String username, String password, boolean reg){
    this.username = username;
    this.password = password;
    this.reg = reg;
  }


  /** Método que define el username de un cliente.
  * @param username el username de un cliente.
  */
  public void setUsername(String username){
    this.username = username;
  }

  /** Método que obtiene el username de un cliente.
  * @return el username de un cliente.
  */
  public String getUsername(){
    return username;
  }

  /** Método que define el password de un cliente.
  * @param password el password de un cliente.
  */
  public void setPassword(String password){
    this.password = password;
  }

  /** Método que obtiene el password de un cliente.
  * @return el password de un cliente.
  */
  public String getPassword(){
    return password;
  }

  /** Método que nos dice si ya está registrado el usuario.
  * @param reg el booleano que nos dice si ya está registrado.
  * @return verdaderp si ya lo está falso en otro caso.
  */
  public boolean Registrado(boolean reg){
    // Creo que puedo regresar solo reg, pues ya es un booleano.
    return (reg) ? true : false;
  }





}

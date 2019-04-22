public class Automovil{

  // La marca del automovil.
  public String marca;
  // El modelo del automovil.
  public String modelo;
  // El año del automovil.
  public int año;


  // Constructor.
  public Automovil(String marca, String modelo, int año){
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
  }


  /** Método que define la marca de un automovil.
  * @param marca la marca del automovil.
  */
  public void setMarca(String marca){
    this.marca = marca;
  }

  /** Método que obtiene la marca de un automovil.
  * @return la marca del automovil.
  */
  public String getMarca(){
    return marca;
  }

  /** Método que define el modelo de un automovil.
  * @param modelo el modelo del automovil.
  */
  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  /** Método que obtiene el modelo de un automovil.
  * @return el modelo del automovil.
  */
  public String getModelo(){
    return modelo;
  }

  /** Método que define el año de un automovil.
  * @param año el año del automovil.
  */
  public void setAño(String año){
    this.año = año;
  }

  /** Método que obtiene el año de un automovil.
  * @return el año del automovil.
  */
  public String getAño(){
    return año;
  }



}

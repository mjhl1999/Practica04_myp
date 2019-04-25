public class Cajero implements Servidor{

  // La cuenta del cliente.
  int cuenta;
  // El monto de retiro.
  int retiro;
  // El saldo total.
  int saldo;

  // Constructor.
  public Cajero(int cuenta, int saldo, int retiro){
  	this.cuenta = cuenta;
    this.saldo = saldo;
    this.retiro = retiro;
  	}

  /** Método que define la cuenta del usuario.
  * @param cuenta el número de cuenta
  */
  public void setCuenta(int cuenta){
  	this.cuenta = cuenta;
  }

  /** Método regresa la cuenta del usuario.
  * @return la cuenta.
  */
  public int getCuenta(){
  	return cuenta;
  }

  /** Método que define el monto de retiro.
  * @param retiro el monto a retirar.
  */
  public void setRetiro(int retiro){
  	this.retiro = retiro;
  }

  /** Método que regresa el monto de retiro.
  * @return el monto a retirar.
  */
  public int getRetiro(){
  	return retiro;
  }

  /** Método que define el saldo.
  * @param saldo el saldo total.
  */
  public void setSaldo(int saldo){
  	this.saldo = saldo;
  }

  /** Método que regresa el saldo.
  * @return el saldo.
  */
  public int getSaldo(){
  	return saldo;
  }

  /** Método que se encarga de realizar el retiro.
  * @param cuenta la cuenta.
  * @param retiro el saldo actual.
  */
  public void realizarRetiro(int cuenta, int retiro){
    int total = saldo-retiro;

   if(saldo > retiro){
    	System.out.println("Retiro realizado con exito" + "\n" +
                        "Tu saldo actual es: " + total + "\n");
    }else if(saldo == retiro){
    	System.out.println("Retiro realizado con exito" + "\n" +
                        "Tu saldo actual es: " + total + "\n");
    }else{
    	System.out.println("No tienes suficiente saldo" + "\n" +
                        "Tu saldo actual es: " + saldo + "\n");
      }
  }

}

public class ServidorProxy implements Servidor{

  // El cajero.
  Cajero cajero;

  // La cuenta.
  private int cuenta;
  // El monto del retiro.
  private int retiro;
  // El saldo total.
  private int saldo;

  // Constructor.
  public ServidorProxy(int cuenta, int saldo, int retiro){
    this.cuenta = cuenta;
    this.saldo = saldo;
    this.retiro = retiro;
    cajero = null;
  }

  /** Método que se encarga de realizar el retiro.
  * Si el saldo es suficiente entonces realizamos el retiro, en otro caso no se permite.
  * @param cuenta la cuenta.
  * @param retiro el saldo actual.
  */
  public void realizarRetiro(int cuenta, int retiro){
    if(saldoSuficiente(cuenta, retiro) == true){
      if(cajero == null)
        cajero = new Cajero(cuenta, saldo, retiro);
      cajero.realizarRetiro(cuenta, retiro);
    }else{
      System.out.println("No cuenta con saldo suficiente");
      return;
    }
  }

  /** Método que nos dice si hay saldo suficiente.
  * @param cuenta la cuenta.
  * @param retiro el saldo actual.
  */
  public boolean saldoSuficiente(int cuenta, int retiro){
  	int total = saldo-retiro;

    if(saldo >= retiro)
      return true;
    else
      return false;
  }

}

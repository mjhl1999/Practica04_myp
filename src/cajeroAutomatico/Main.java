public class Main{

  public static void main(String[] args) {

    // Ejemplo donde si se puede realizar le retiro.

    int cuenta = 12345;
    int saldo = 3000;
    int retiro = 1500;

    // Nuestro servidor.
    Servidor servidor = new ServidorProxy(cuenta, saldo, retiro);

    // Realizamos el retiro.
    servidor.realizarRetiro(cuenta, retiro);


    // Ejemplo donde no se puede realizar el retiro.

    int cuenta2 = 12345;
    int saldo2 = 4000;
    int retiro2 = 10500;

    // Nuestro servidor.
    Servidor servidor2 = new ServidorProxy(cuenta2, saldo2, retiro2);

    // Realizamos el retiro.
    servidor.realizarRetiro(cuenta2, retiro2);

  }
}

public class Main{

  public static void main(String[] args) {

    // Ejemplo donde si se puede realizar le retiro.

    System.out.println("Ejemplo donde se puede realizar el retiro y el saldo " +
                      "es mayor al retiro: \n");
    int cuenta = 12345;
    int saldo = 3000;
    int retiro = 1500;

    // Nuestro servidor.
    Servidor servidor = new ServidorProxy(cuenta, saldo, retiro);

    // Realizamos el retiro.
    servidor.realizarRetiro(cuenta, retiro);



    // Ejemplo donde no se puede realizar el retiro.

    System.out.println("Ejemplo donde no se puede realizar el retiro pues el saldo " +
                      "es menor al retiro: \n");
    int cuenta2 = 2345;
    int saldo2 = 3000;
    int retiro2 = 4000;

    // Nuestro servidor.
    Servidor servidor2 = new ServidorProxy(cuenta2, saldo2, retiro2);

    // Realizamos el retiro.
    servidor2.realizarRetiro(cuenta2, retiro2);



    // Ejemplo donde si se puede realizar le retiro.

    System.out.println("Ejemplo donde se puede realizar el retiro y el saldo " +
                      "es igual al retiro: \n");
    int cuenta3 = 12345;
    int saldo3 = 1500;
    int retiro3 = 1500;

    // Nuestro servidor.
    Servidor servidor3 = new ServidorProxy(cuenta3, saldo3, retiro3);

    // Realizamos el retiro.
    servidor3.realizarRetiro(cuenta3, retiro3);

  }
}

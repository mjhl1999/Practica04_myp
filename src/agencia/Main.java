public class Main{

  public static void main(String[] args) {

    FacadeAgencia agencia = new FacadeAgencia();

    Automovil auto = new Automovil("Volkswagen", "Bocho", "2003");
    Cliente cliente = new Cliente("Ruiz López Jorge");

    // Registrarse.
    String username = "Jorge";
    String password = "123";
    boolean reg = true;
    agencia.realizarRegistro(username, password, reg);

    // Cotizar.
    String seguro = "Daños a terceros";
    String pago = "Efectivo";
    agencia.saberCotiza(seguro, auto);

    // Contratar.
    agencia.contrato(cliente, seguro, auto, pago);

    // Dar de baja.
    String motivo = "Sin dinero";
    agencia.darDeBaja(cliente, motivo);
  }
}

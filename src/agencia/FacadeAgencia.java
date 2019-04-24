public class FacadeAgencia{

  // El paso para poder registrarse.
  private Registro registro = new Registro(null, null, false);
  // El paso para cotizar el seguro.
  private CotizarSeguro cotizarSeguro = new CotizarSeguro();
  // El paso para contratar un seguro.
  private ContratacionSeguro contratarSeguro = new ContratacionSeguro();
  // El paso para poder dar de baja un seguro.
  private BajaServicio bajaServicio = new BajaServicio();

  // El automovil a buscar datos.
  Automovil auto = new Automovil(null, null, null);
  // Para el tipo de seguro.
  String seguro;

  // El username.
  String username;
  // El password.
  String password;
  // Para saber si se registró o no.
  boolean reg;

  // El cliente que va a la agencia.
  Cliente cliente = new Cliente(null);
  // El tipo de pago
  String pago;

  // El motivo de la baja.
  String motivo;


  /** Método que realiza el registro del cliente.
  */
  public void realizarRegistro(String username, String password, boolean reg){
    registro.setUsername(username);
    registro.setPassword(password);
    registro.registrado(reg);

    System.out.println("El registro se realizó con: \n" +
                      "Username: " + username + "\n" +
                      "Password: " + password + "\n");
  }

  /** Método que nos da la cotiza del seguro recibido.
  */
  public void saberCotiza(String seguro, Automovil auto){
    cotizarSeguro.tipoDeSeguro(seguro);
    String a;
    a = cotizarSeguro.datosAuto(auto);

    System.out.println("Se cotizó un seguro con: \n" +
                      "El tipo de seguro: " + seguro + "\n" +
                      "Los datos del auto: " + "\n" + a + "\n");
  }

  /** Método que realiza el contrato del seguro.
  */
  public void contrato(Cliente cliente, String seguro, Automovil auto, String pago){
    String datos, a;
    datos = contratarSeguro.datosCliente(cliente);
    contratarSeguro.tipoDeSeguro2(seguro);
    a = contratarSeguro.datosAuto(auto);

    contratarSeguro.setFormaDePago(pago);
    contratarSeguro.getFormaDePago();

    System.out.println("Se contrató el seguro con: " + "\n" +
                      "El cliente: " + datos + "\n" +
                      "El tipo de seguro: " + seguro + "\n" +
                      "Los datos del auto: " + "\n" + a + "\n" +
                      "El tipo de pago: " + pago + "\n");
  }

  /** Método que da de baja el servicio.
  */
  public void darDeBaja(Cliente cliente, String motivo){
    String datos;
    datos = bajaServicio.datosCliente(cliente);
    bajaServicio.setMotivoDeBaja(motivo);
    bajaServicio.getMotivoDeBaja();

    System.out.println("Se dio la baja del servicio con: " + "\n" +
                      "El cliente: " + datos + "\n" +
                      "El motivo de la baja: " + motivo + "\n");
  }



}

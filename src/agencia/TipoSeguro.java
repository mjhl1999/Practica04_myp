public enum TipoSeguro{

  /** Seguro por Cobertura Amplia. */
  CA,
  /** Seguro por Daños a Terceros. */
  DT,
  /** Seguro por Cobertura Limitada. */
  CL,
  /** Seguro por Cobertura Extendida. */
  CE;

  /**
  * Regresa una representación en cadena de los tipos de seguro por si es necesario.
  * @return una representación en cadena de los tipos de seguro.
  */
  public String toString(){
    switch(this) {
      case CA:
        return "Cobertura Amplia";
      case DT:
        return "Daños a Terceros";
      case CL:
        return "Cobertura Limitada";
      case CE:
        return "Cobertura Extendida";
      default:
        return null;
    }
  }

}

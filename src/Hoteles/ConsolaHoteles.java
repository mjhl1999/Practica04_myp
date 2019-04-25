import java.util.Scanner;

public class ConsolaHoteles{

  public double calculaCosto(double costo, int noches, int hotel){
    if (hotel == 1 && noches >= 5){
      return costo*noches*.9;
    }else if (hotel == 2 && noches >= 5){
      return costo*noches*.80;
    }else if (hotel == 3 && noches >= 4){
      return costo*noches*.75;
    }else{
      return costo*noches;
    }
  }

  	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double costo;
        int opcion;
        int noches;
        HotelBasico hotel = new HotelBasico();
        BasicoPlaya hotelp = new BasicoPlaya(hotel);

        do {
          System.out.println( "\n" +
                              "Ingrese el tipo de hotel que desea y después el número de noches que se hospedará, calcularemos el costo y los servicios que tiene su habitación: \n" +
                              "1. Básico. \n" +
                              "2. Básico en la playa. \n" +
                              "3. VIP en la playa. \n" +
                              "0. Salir\n");

          String opcionUsuario = sc.nextLine();
          opcion = Integer.parseInt(opcionUsuario);

          switch (opcion) {
            case 1:
              System.out.println("Costo: " +  hotel.darCosto());
              System.out.println("servicios: " + hotel.darServicios());
              break;

            case 2:
              hotel = new BasicoPlaya(hotel);
              System.out.println("Costo: " + hotel.darCosto());
              System.out.println("servicios: " + hotel.darServicios());
              break;

            case 3:
              hotel = new BasicoPlaya(hotel); 
              hotel = new VIPPlaya(hotel);
              System.out.println("Costo: " + hotel.darCosto());
              System.out.println("servicios: " + hotel.darServicios());
              break;


            case 0:
              break;

            default:
              System.out.println("Inregrese un hotel válido");
          }

        } while (opcion != 0);

    }
}

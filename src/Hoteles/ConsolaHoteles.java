import java.util.Scanner;

public class ConsolaHoteles{


  	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HotelBasico hotel = new HotelBasico();
        int opcion1;
        int opcion2;
        int noches;

        do {
          System.out.println( "\n" +
                              "Ingrese el tipo de hotel que desea: \n" +
                              "1. Básico. \n" +
                              "2. Básico en la playa. \n" +
                              "3. VIP en la playa. \n" +
                              "0. Salir\n");

          String opcionUsuario1 = sc.nextLine();
          opcion1 = Integer.parseInt(opcionUsuario1);

          if (opcion1 == 0){
            break;
          }

          System.out.println( "\n" +
                              "Ahora ingrese el número de noches que se hospedará, \n" +
                              "calcularemos el costo y los servicios que tiene su habitación:\n"+
                              "0.Salir\n");

          String opcionUsuario2 = sc.nextLine();
          opcion2 = Integer.parseInt(opcionUsuario2);
          noches = opcion2;

          if (opcion2 == 0){
            break;
          }

          switch (opcion1) {
            case 1:
              hotel = new HotelBasico();
              if (noches >= 5){
                System.out.println("Costo: " +  hotel.darCosto()*noches*.9);
              }else{
              System.out.println("Costo: " +  hotel.darCosto()*noches);
              }
              System.out.println("Servicios: " + hotel.darServicios());
              break;

            case 2:
              hotel = new HotelBasico();
              hotel = new BasicoPlaya(hotel);
              if (noches > 5){
                  System.out.println("Costo: " + hotel.darCosto()*noches*.80);
              }else{
              System.out.println("Costo: " + hotel.darCosto()*noches);
              }
              System.out.println("Servicios: " + hotel.darServicios());
              break;

            case 3:
              hotel = new HotelBasico();
              hotel = new BasicoPlaya(hotel);
              hotel = new VIPPlaya(hotel);
              if (noches > 4){
                  System.out.println("Costo: " + hotel.darCosto()*noches*.75);
              }else{
              System.out.println("Costo: " + hotel.darCosto()*noches);
              }
              System.out.println("Servicios: " + hotel.darServicios());
              break;

            case 0:
              break;

            default:
              System.out.println("Inregrese un hotel válido");
          }

        } while (opcion1 != 0);

    }
}

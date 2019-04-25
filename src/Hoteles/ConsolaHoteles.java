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
                              "calcularemos el costo y los servicios que tiene su habitación: \n \n"+
                              "0. Salir \n");

          String opcionUsuario2 = sc.nextLine();
          opcion2 = Integer.parseInt(opcionUsuario2);
          noches = opcion2;

          if (opcion2 <= 0){
            System.out.println("No existen noches negativas, ni se pueden pagar 0 " +
                              "noches. \n");
          }

          switch (opcion1) {
            case 1:
              hotel = new HotelBasico();
              if (noches >= 5){
                System.out.println("Costo: " +  hotel.darCosto()*noches*.9);
              }else if(noches < 5 && noches > 0){
                System.out.println("Costo: " +  hotel.darCosto()*noches);
              }else{
                break;
              }
              System.out.println("Servicios: " + hotel.darServicios());
              break;

            case 2:
              hotel = new HotelBasico();
              hotel = new BasicoPlaya(hotel);
              if (noches > 5){
                System.out.println("Costo: " + hotel.darCosto()*noches*.80);
              }else if(noches <= 5 && noches > 0){
                System.out.println("Costo: " + hotel.darCosto()*noches);
              }else{
                break;
              }
              System.out.println("Servicios: " + hotel.darServicios());
              break;

            case 3:
              hotel = new HotelBasico();
              hotel = new BasicoPlaya(hotel);
              hotel = new VIPPlaya(hotel);
              if (noches > 4){
                System.out.println("Costo: " + hotel.darCosto()*noches*.75);
              }else if(noches <= 4 && noches > 0){
                System.out.println("Costo: " + hotel.darCosto()*noches);
              }else{
                break;
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

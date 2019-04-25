public class VIPPlaya extends PlayaDecorator{

	HotelBasico playa;

	//Constructor
	public VIPPlaya(HotelBasico playa){
		this.playa = playa;
	}

	//Metodo que regresa el costo del hotel HotelBasico = costo(HotelBasico) + $1200
	public double darCosto(){
		return playa.darCosto() + 1200;
	}

	//Metodo que regresa los servicios del hotel HotelBasico = servicios(HotelBasico) + "frigobar, Barra libre, Comida buffet
	public String darServicios(){
		return playa.darServicios() + ", frigobar, Barra libre, Comida buffet";
	}
}

public class BasicoPlaya extends HotelDecorator{

	HotelBasico basico;

	//Constructor
	public BasicoPlaya(HotelBasico basico){
		this.basico = basico;
	}

	//Metodo que regresa el costo del hotel HotelBasico = costo(HotelBasico) + $500
	public double darCosto(){
		return basico.darCosto() + 500;
	}

	//Metodo que regresa los servicios del hotel HotelBasico = servicios(HotelBasico) + "Room service"
	public String darServicios(){
		return basico.darServicios() + ", Room service";
	}

}

//clase que implementa los metodos del decorator de HotelBasico
public class BPlayaDecorado extends PlayaDecorator{

	HotelBasico playa;

	public BPlayaDecorado(HotelBasico playa){
		this.playa = playa;
	}

	public double darCosto(){
		return playa.darCosto();
	}

	public String darServicios(){
		return playa.darServicios();
	}
}

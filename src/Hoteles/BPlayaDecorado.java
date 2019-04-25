public class BPlayaDecorado extends PlayaDecorator{

	BasicoPlaya playa;

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

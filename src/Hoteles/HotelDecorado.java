public abstract class HotelDecorado extends HotelBasico{

	protected HotelBasico basicoDecorado;

	public HotelDecorado(HotelBasico basicoDecorado){
		this.basicoDecorado = basicoDecorado;
	}

	public double darCosto(){
		return basicoDecorado.darCosto();
	}

	public String darServicios(){
		return basicoDecorado.darServicios();
	}
}

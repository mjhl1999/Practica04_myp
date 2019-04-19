public abstract class BPlayaDecorado extends HotelBasico{

	protected HotelBasico basicoDecorado;

	public BPlayaDecorado(HotelBasico basicoDecorado){
		this.basicoDecorado = basicoDecorado;
	}

	public double darCosto(){
		return basicoDecorado.darCosto();
	}

	public String darServicios(){
		return basicoDecorado.darServicios();
	}
}

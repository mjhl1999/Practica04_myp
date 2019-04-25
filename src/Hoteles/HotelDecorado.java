//clase que implementa los metodos del decorator de HotelBasico
public class HotelDecorado extends HotelDecorator{

	HotelBasico basico;

	public HotelDecorado(HotelBasico basico){
		this.basico = basico;
	}

	public double darCosto(){
		return basico.darCosto();
	}

	public String darServicios(){
		return basico.darServicios();
	}
}

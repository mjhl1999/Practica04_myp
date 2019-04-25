public class BasicoPlaya extends HotelDecorator{

	HotelBasico basico;

	public BasicoPlaya(HotelBasico basico){
		this.basico = basico;
	}

	public double darCosto(){
		return basico.darCosto() + 500;
	}

	public String darServicios(){
		return basico.darServicios() + ", Room service";
	}

}

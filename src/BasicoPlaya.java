public class BasicoPlaya extends HotelDecorado{

	HotelBasico basico;

	public BasicoPlaya(HotelBasico basico){
		super(basico);
	}

	public double darCosto(){
		return basico.darCosto() + 500;
	}

	public String darServicios(){
		return basico.darServicios() + ", Room service";
	}

}

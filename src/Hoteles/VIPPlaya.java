public class VIPPlaya extends PlayaDecorator{

	BasicoPlaya playa;

	public VIPPlaya(BasicoPlaya playa){
		this.playa = playa;
	}

	public double darCosto(){
		return playa.darCosto() + 1200;
	}

	public String darServicios(){
		return playa.darServicios() + ", frigobar, Barra libre, Comida buffet";
	}
}

public class VIPPlaya extends BPlayaDecorado{

	BasicoPlaya playa;

	public VIPPlaya(BasicoPlaya playa){
		super(playa);
	}

	public double darCosto(){
		return playa.darCosto() + 1200;
	}

	public String darServicios(){
		return playa.darServicios() + ", frigobar, Barra libre, Comida buffet";
	}
}

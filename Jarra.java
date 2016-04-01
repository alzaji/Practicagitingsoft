
public class Jarra {

	private int cantidad;
	private int capacidad;

	public Jarra(int capacidadinicial) {

		if (capacidadinicial <= 0) {

			throw new RuntimeException("Error: No se pueden crear jarras con capacidad menor " + "o igual que 0.");

		}
		this.capacidad = capacidadinicial;

	}
	//Carlos Pantoja Gomez (@CarlosPantoja), ProgA:
	public int getCapacidad(){
		return this.capacidad;
	}
	
	public int getCantidad(){
		return this.cantindad;
	}
	
	public void metodoComunitario(){
		
	//Comentario incluido para puebas
		
		System.out.println("Aqui escribimos todos");
	}
}

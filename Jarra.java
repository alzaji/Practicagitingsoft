
public class Jarra {

	private int cantidad;
	private int capacidad;

	public Jarra(int capacidadinicial) {

		if (capacidadinicial <= 0) {

			throw new RuntimeException("Error: No se pueden crear jarras con capacidad menor " + "o igual que 0.");

		}
		this.capacidad = capacidadinicial;

	}
	
	//metodos
	
	//Alvaro Casado Palomo (@DTHMemories), ProgB:
	public void llena(){ 
			this.cantidad=this.capacidad;
		}
	
	public void vacia(){
			this.cantidad=0;
		}
	
	public void metodoComunitario(){
		
	//Comentario incluido para puebas
		
		System.out.println("Aqui escribimos todos");
	}
}

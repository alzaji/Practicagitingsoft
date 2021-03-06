
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
		return this.cantidad;
	}
	
	//Alvaro Casado Palomo (@DTHMemories), ProgB:
	public void llena(){ 
			this.cantidad=this.capacidad;
		}
	
	public void vacia(){
			this.cantidad=0;
		}
	
	//ProgC Alberto Zamora (@alzaji)
	public void llenaDesdeJarra(Jarra j){
		
		while((this.cantidad< this.capacidad) && (j.cantidad > 0)){
			
			this.cantidad++;
			j.cantidad--;
		}
	}
	public String toString(){
		
		return ("("+this.capacidad+","+this.cantidad+")");
	}
	
	
	public void metodoComunitario(){

	//Comentario incluido para puebas

		System.out.println("Aqui escribimos todos");
	}
}

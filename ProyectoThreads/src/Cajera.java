
public class Cajera {
	
	private String nombre;

	public Cajera(String n) {
		// TODO Auto-generated constructor stub
		this.nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void procesarCompra(Cliente cliente, long tiempoInicial){
		int productosCliente[] = cliente.getCarroCompra();
		long tiempoActual = System.currentTimeMillis();
		
		System.out.println("La cajera a empezado a procesar los productos del cliente "+cliente.getNombre()+" con un tiempo inicial de:"+(tiempoActual-tiempoInicial)/1000+" segundos");
		
		for(int x=0; x<productosCliente.length; x++){
			this.esperaXsegundos(productosCliente[x]);
			System.out.println("Se ha procesado el producto: "+x+" -> Duración: "+productosCliente[x]+" segundos");
		}
		
		System.out.println("La cajera a terminado de procesar los productos de: "+cliente.getNombre()+" en un tiempo total de: "+(System.currentTimeMillis()-tiempoInicial)/1000+" segundos");
	}
	
	public void esperaXsegundos(int tiempo){
		try {
			Thread.sleep(tiempo*1000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

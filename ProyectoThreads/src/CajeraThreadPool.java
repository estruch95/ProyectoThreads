
public class CajeraThreadPool implements Runnable{
	
	private Cliente cliente;
	private long tiempoInicial;
	
	public CajeraThreadPool(Cliente cliente, long tiempoInicial){
		this.cliente = cliente;
		this.tiempoInicial = tiempoInicial;
	}

	@Override
	public void run() {
		procesarCompra();
	}
	
	public void procesarCompra(){
		int productosCliente[] = cliente.getCarroCompra();
		long tiempoActual = System.currentTimeMillis();
		
		System.out.println("La cajera a empezado a procesar los productos del cliente "+cliente.getNombre()+" con un tiempo inicial de:"+(tiempoActual-tiempoInicial)/1000+" segundos");
		
		for(int x=0; x<productosCliente.length; x++){
			this.esperaXsegundos(productosCliente[x]);
			System.out.println("Se ha procesado el producto: "+x+" de "+cliente.getNombre()+" -> Duración: "+productosCliente[x]+" segundos");
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

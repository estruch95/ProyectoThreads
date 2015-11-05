
public class Supermercado {

	public static void main(String[] args) {
		
		Cliente cliente1, cliente2;
		Cajera cajera;
		long tiempoInicial;
		
		//CAJERA
		cajera = new Cajera("Antonia");
		
		tiempoInicial = System.currentTimeMillis();
		
		//CLIENTE1
		int productos1[] = new int[]{7,3,4,1,5};
		cliente1 = new Cliente("Pepe", productos1);
		//cajera.procesarCompra(cliente1, tiempoInicial);
		
		//SEPARADOR EN CONSOLA
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//CLIENTE2
		int productos2[] = new int[]{3,8,3,1,9,2};
		cliente2 = new Cliente("Juan", productos2);
		//cajera.procesarCompra(cliente2, tiempoInicial);
		
		
		//PROCESAR PRODUCTOS DE 2 CLIENTES MEDIANTE HILOS DE EJECUCIÓN
		CajeraThread cajera1, cajera2;
		cajera1 = new CajeraThread(cliente1, tiempoInicial);
		cajera1.start();
		
		cajera2 = new CajeraThread(cliente2, tiempoInicial);
		cajera2.start();
		
	}
}

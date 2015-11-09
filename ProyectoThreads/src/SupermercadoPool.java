import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class SupermercadoPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objetos
		ThreadPoolExecutor threadPool;
		CajeraThreadPool cajera;
		Cliente cliente1, cliente2;
		long tiempoInicial;
		
		//Declaraciónes
		tiempoInicial = System.currentTimeMillis();
		threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		
		//Cliente1
		int productos1[] = new int[]{7,3,4,1,5};
		cliente1 = new Cliente("Joaquin", productos1);
		cajera = new CajeraThreadPool(cliente1, tiempoInicial);
		threadPool.execute(cajera);
		
		//SEPARADOR EN CONSOLA
		System.out.println("--------------------------------------------------------------------------------------------------------");
		
		//Cliente2
		int productos2[] = new int[]{3,8,3,1,9,2};
		cliente2 = new Cliente("Ivan", productos2);
		cajera = new CajeraThreadPool(cliente2, tiempoInicial);
		threadPool.execute(cajera);
	}

}

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class SupermercadoPool {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objetos
		ThreadPoolExecutor threadPool;
		CajeraThreadPool cajera;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		long tiempoInicial;
		
		//Declaraciónes
		tiempoInicial = System.currentTimeMillis();
		threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		
		int productos1[] = new int[]{7,3,4,1,5};
		int productos2[] = new int[]{3,8,3,1,9,2};
		int productos3[] = new int[]{5,3,2,1,6,4};
		int productos4[] = new int[]{6,5,4,3,2,1};
		
		clientes.add(new Cliente("Joaquin", productos1));
		clientes.add(new Cliente("Ivan", productos2));
		clientes.add(new Cliente("Jose", productos3));
		clientes.add(new Cliente("Silvia", productos4));
		
		
		for(int x=0; x<clientes.size(); x++){
			cajera = new CajeraThreadPool(clientes.get(x), tiempoInicial);
			threadPool.execute(cajera);
		}
	}

}

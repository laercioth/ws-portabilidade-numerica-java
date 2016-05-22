package celular.consult.test;
import org.junit.Test;

import celular.consult.factory.ServiceFactory;
import celular.entities.NroPortabilidade;


public class AppTest {
	/**
	 * Testa o pool de conexão, se esta funcionando ou não
	 */
	@Test
	public void testConnection() {
		ServiceFactory.consultarGet("http://consulta-operadora.fluxoti.com/v1/consult/3491904843", NroPortabilidade.class);
		if(ServiceFactory.connection_ok){
			System.out.println("Conectado!");
		}else{
			System.out.println("Não conectado!");
		}
	}
}

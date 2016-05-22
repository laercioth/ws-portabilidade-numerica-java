package celular.consult.app;

import celular.consult.factory.ServiceFactory;
import celular.entities.NroPortabilidade;

/**
 * Classe teste, simulando a aplicacao, classe, metodo que poderia estar invocando o servico
 */
public class App {

	public static void main(String[] args) {
		/**
		 * Celular a ser buscado DDD+CELULAR
		 */
		String nrCelular = "3491904843";
		/**
		 * Chamadas do ws
		 */
		NroPortabilidade nroPortabilidade = ServiceFactory.consultarGet("http://consulta-operadora.fluxoti.com/v1/consult/"+nrCelular, NroPortabilidade.class);
		
		if(nroPortabilidade != null){
			System.out.printf("%-15s %-15s", "Operadora ---->", nroPortabilidade.getData().getCarrier().toUpperCase());
		}else{
			System.out.printf("%-15s", "Número não foi encontrado ou não existe!" );
		}
	}
}

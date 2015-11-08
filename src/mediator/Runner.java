package mediator;

public class Runner {

	public static void main(String[] args) {
	    MensagemMediator mediador = new MensagemMediator();
	    
	    AndroidColleague android = new AndroidColleague(mediador);
	    IOSColleague ios = new IOSColleague(mediador);
	 
	    mediador.adicionarColleague(android);
	    mediador.adicionarColleague(ios);
	     
	    android.enviarMensagem("oi Eu sou um Android!");
	    System.out.println("=========");
	    ios.enviarMensagem("Olá, sou um iOs!");


	}

}

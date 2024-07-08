package pilarespoo.heranca;

public class Computador {
	public static void main(String[] args) {
		FacebookMessenger facebook = new FacebookMessenger();
		facebook.enviarMensagem();
		facebook.receberMensagem();
		
		TelegramMessenger telegram = new TelegramMessenger();
		telegram.enviarMensagem();
		telegram.receberMensagem();
	}
}

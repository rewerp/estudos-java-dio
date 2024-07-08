package pilarespoo.abstracaopolimorfismo;

public class Computador {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger facebook = new FacebookMessenger();
		facebook.enviarMensagem();
		facebook.receberMensagem();
	}
}

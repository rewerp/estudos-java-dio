package pilarespoo.abstracaopolimorfismo;

public class FacebookMessenger extends ServicoMensagens {
	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem Facebook");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem Facebook");
	}
}

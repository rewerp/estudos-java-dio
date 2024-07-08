package pilarespoo.abstracaopolimorfismo;

public class MSNMessenger extends ServicoMensagens {
	@Override
	public void enviarMensagem() {
		System.out.println("Enviando mensagem MSNMessenger");
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem MSNMessenger");
	}
}

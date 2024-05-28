package asj.sintaxe.metodos;

public class SmartTv {
  public boolean ligada = false;
  public int canal = 1;
  public int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    ++volume;
  }

  public void diminuirVolume() {
    --volume;
  }

  public void proximoCanal() {
    ++canal;
  }

  public void anteriorCanal() {
    --canal;
  }

  public void selecionarCanal(int _canal) {
    canal = _canal;
  }

  public void executarTeste() {
    System.out.println("TV Ligada: " + ligada);
    System.out.println("Canal atual: " + canal);
    System.out.println("Volume atual: " + volume);

    ligar();
    System.out.println("TV Ligada: " + ligada);

    proximoCanal();
    proximoCanal();
    System.out.println("Canal atual: " + canal);

    selecionarCanal(45);
    System.out.println("Canal atual: " + canal);

    aumentarVolume();
    aumentarVolume();
    System.out.println("Volume atual: " + volume);

    diminuirVolume();
    diminuirVolume();
    diminuirVolume();
    diminuirVolume();
    diminuirVolume();
    diminuirVolume();
    System.out.println("Volume atual: " + volume);
  }
}

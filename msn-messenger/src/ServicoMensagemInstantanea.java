public abstract class ServicoMensagemInstantanea {
   //Cada um dos serviços deve criar seus métodos de envio de mensagens
   //Porém, todos vão receber instruções desta classe
    public abstract void enviarMensagem();
    public abstract void receberMensagem();   
}
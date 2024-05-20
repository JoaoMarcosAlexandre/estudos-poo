public class Telegram extends ServicoMensagemInstantanea {
      //herda os recursos de ServicoMensagemInstanea com o 'EXTENDS'
      public void enviarMensagem(){
            System.out.println("Enviando Mensagens via TELEGRAM");
        }
        public void receberMensagem(){
            System.out.println("Recebendo mensagens via TELEGRAM");
        }
}

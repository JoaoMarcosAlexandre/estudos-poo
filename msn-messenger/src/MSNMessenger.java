public class MSNMessenger {
   public void enviarMensagem(){
    validarConexaoInternet();
    System.out.println("Envianto mensagem...");
    salvarHistoricoMensagm();
}
   public void receberMensagem(){
    System.out.println("Recebento mensagem...");
   }
   private void validarConexaoInternet(){
    System.out.println("Validando conexão com a internet.");
   }
   private void salvarHistoricoMensagm(){
    System.out.println("Salvando o histórico de mensagens.");
   }
}
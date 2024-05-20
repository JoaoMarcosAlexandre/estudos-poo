public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem...");
        salvarHistoricoMensagm();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagens...");
    }

    private void validarConexaoInternet(){
        System.out.println("Verificando conexão com a internet");
    }

    private void salvarHistoricoMensagm(){
        System.out.println("Salvando mensagens no histórico.");
    }
}

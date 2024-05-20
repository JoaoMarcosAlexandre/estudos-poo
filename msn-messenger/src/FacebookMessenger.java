public class FacebookMessenger extends ServicoMensagemInstantanea{
    //herda os recursos de ServicoMensagemInstanea com o 'EXTENDS'
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando Mensagens via FACEBOOK");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagens via FACEBOOK");
    }

}
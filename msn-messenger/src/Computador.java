public class Computador {
    public static void main(String[] args) {
      
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "MSN";
        if (appEscolhido.equals("MSN"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("FCB"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("TLG"));
            smi = new Telegram();
            
         smi.enviarMensagem();
         smi.receberMensagem();   
    }
}

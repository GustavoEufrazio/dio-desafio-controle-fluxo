public class ParametrosInvalidosException  extends Exception {
    String mensagem;
    public ParametrosInvalidosException (String mensagem) {
        this.mensagem=mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }

}


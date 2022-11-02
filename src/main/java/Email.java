public class Email extends NotificadorDecorator {

    public Email(Notificador notificador){
        super(notificador);
    }

    @Override
    public int getMetodoTotal() {
        return 100;
    }

    @Override
    public String getMetodoNome() {
        return "E-mail";
    }



}

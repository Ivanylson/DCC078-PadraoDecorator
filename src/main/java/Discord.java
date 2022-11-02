public class Discord extends NotificadorDecorator {

    public Discord(Notificador notificador){
        super(notificador);
    }

    @Override
    public int getMetodoTotal() {
        return 150;
    }

    @Override
    public String getMetodoNome() {
        return "Discord";
    }
}

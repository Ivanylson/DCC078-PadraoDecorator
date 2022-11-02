public class Zapier extends NotificadorDecorator {

    public Zapier(Notificador notificador){
        super(notificador);
    }

    @Override
    public int getMetodoTotal() {
        return 400;
    }

    @Override
    public String getMetodoNome() {
        return "Zapier";
    }
}

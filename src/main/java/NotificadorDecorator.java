public abstract class NotificadorDecorator implements Notificador {

    private Notificador notificador;
    public String metodo;

    public NotificadorDecorator(Notificador notificador){
        this.notificador = notificador;
    }

    public Notificador getNotificador(){
        return notificador;
    }

    public void setNotificador(Notificador notificador){
        this.notificador = notificador;
    }

    public abstract int getMetodoTotal();

    public int getTotal() {
        return this.notificador.getTotal() + this.getMetodoTotal();
    }

    public abstract String getMetodoNome();

    public String getMetodo() {
        return this.notificador.getMetodo() + "/" + this.getMetodoNome();
    }

    public void setMetodo(String metodo){
        this.metodo = metodo;
    }
}

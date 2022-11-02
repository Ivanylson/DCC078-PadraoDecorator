public class NotificadorPadrao implements Notificador {

    public int total;

    public NotificadorPadrao(){};

    public NotificadorPadrao(int total){
        this.total = total;
    }
    @Override
    public int getTotal() {
        return this.total;
    }

    @Override
    public String getMetodo() {
        return "Padrao";
    }
}

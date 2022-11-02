import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificadorTest {

    @Test
    void deveRetornarTotal(){
        Notificador notificador = new NotificadorPadrao(100);
        assertEquals(100, notificador.getTotal());
    }

    @Test
    void deveRetornarTotalComDiscord(){
        Notificador notificador = new Discord(new NotificadorPadrao(100));
        assertEquals(250, notificador.getTotal());
    }

    @Test
    void deveRetornarTotalComEmail(){
        Notificador notificador = new Email(new NotificadorPadrao(100));
        assertEquals(200, notificador.getTotal());
    }

    @Test
    void deveRetornarTotalComZapier(){
        Notificador notificador = new Zapier(new NotificadorPadrao(100));
        assertEquals(500, notificador.getTotal());
    }

    @Test
    void deveRetornarTotalComEmailComDiscordComZapier(){
        Notificador notificador = new Zapier(new Discord(new Email(new NotificadorPadrao(100))));
        assertEquals(750, notificador.getTotal());
    }

    @Test
    void deveRetornarMetodoComPadrao(){
        Notificador notificador = new NotificadorPadrao();
        assertEquals("Padrao", notificador.getMetodo());
    }
    @Test
    void deveRetornarMetodoComEmail(){
        Notificador notificador = new Email(new NotificadorPadrao());
        assertEquals("Padrao/E-mail", notificador.getMetodo());
    }
    @Test
    void deveRetornarMetodoComDiscord(){
        Notificador notificador = new Discord(new NotificadorPadrao());
        assertEquals("Padrao/Discord", notificador.getMetodo());
    }
    @Test
    void deveRetornarMetodoComZapier(){
        Notificador notificador = new Zapier(new NotificadorPadrao());
        assertEquals("Padrao/Zapier", notificador.getMetodo());
    }

    @Test
    void deveRetornarMetodoComEmailComDiscordComZapier(){
        Notificador notificador = new Zapier(new Discord(new Email(new NotificadorPadrao())));
        assertEquals("Padrao/E-mail/Discord/Zapier", notificador.getMetodo());
    }

}
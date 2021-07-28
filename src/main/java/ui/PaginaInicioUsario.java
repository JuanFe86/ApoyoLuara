package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicioUsario {

    public static final Target LBL_MENSAJE = Target.the("mensaje").locatedBy("//h1[contains(text(),'¡ Hola LAURA RAMIREZ !')]");
    public static final Target BTN_PERSONAS = Target.the("Personas").locatedBy("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/div[2]");
    public static final Target BTN_PERSONAS1 = Target.the("Personas").locatedBy("//div[contains(text(),'Crear personas')]");
}

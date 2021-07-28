package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {

    public static final Target TXT_USUARIO = Target.the("usuario").located(By.name("username"));
    public static final Target TXT_CONTRASEÑA = Target.the("CLAVE").located(By.id("standard-password-input"));
    public static final Target BTN_INGRESAR = Target.the("Ingresar").locatedBy("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]");
}

package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioCrearPersona {

    public static final Target TXT_DOCUMENTO = Target.the("DOCUMENTO").located(By.id("documentNumber"));
    public static final Target TXT_PRIMER_NOMBRE = Target.the("PRIMER_NOMBRE").located(By.id("firstName"));
    public static final Target TXT_SEGUNDO_NOMBRE = Target.the("SEGUNDO_NOMBRE").located(By.id("secondName"));
    public static final Target TXT_PRIMER_APELLIDO = Target.the("PRIMER_APELLIDO").located(By.id("firstLastName"));
    public static final Target TXT_SEGUNDO_APELLIDO = Target.the("SEGUNDO_APELLIDO").located(By.id("secondLastName"));
    public static final Target BTN_FECHA_NACIMIENTO = Target.the("").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/input[1]");
    public static final Target BTN_ELEGIR_DOCUMENTO = Target.the("").locatedBy("//div[@id='select-documentTypeId']");
    public static final Target BTN_TIPO_DOCUMENTO = Target.the("").locatedBy("/html[1]/body[1]/div[3]/div[2]/ul[1]/li[1]");
    public static final Target BTN_CALENDARIO = Target.the("").locatedBy("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/input[1]");
    public static final Target BTN_AÑO_CALENDARIO =Target.the("").locatedBy("//span[contains(text(),'‹')]");
    public static final Target BTN_AÑO_CALENDARIO1 =Target.the("").locatedBy("//td[contains(text(),'2000')]");
    public static final Target BTN_MES_CALENDARIO =Target.the("").locatedBy("//td[contains(text(),'Ene')]");
    public static final Target BTN_DIA_CALENDARIO =Target.the("").locatedBy("//tbody/tr[1]/td[6]");



}

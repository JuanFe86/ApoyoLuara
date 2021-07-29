package task;

import models.DataInjection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import ui.FormularioCrearPersona;

import static ui.FormularioCrearPersona.*;

public class RegistroUsuarios implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataInjection.getDocumento()).into(TXT_DOCUMENTO),
                JavaScriptClick.on(BTN_ELEGIR_DOCUMENTO),
                JavaScriptClick.on(BTN_TIPO_DOCUMENTO),
                Enter.theValue(dataInjection.getPrimer_nombre()).into(TXT_PRIMER_NOMBRE),
                Enter.theValue(dataInjection.getSegundo_nombre()).into(TXT_SEGUNDO_NOMBRE),
                Enter.theValue(dataInjection.getPrimer_apellido()).into(TXT_PRIMER_APELLIDO),
                Enter.theValue(dataInjection.getSegundo_apellido()).into(TXT_SEGUNDO_APELLIDO),
                JavaScriptClick.on(BTN_CALENDARIO),
                JavaScriptClick.on(BTN_AÑO_CALENDARIO),
                JavaScriptClick.on(BTN_AÑO_CALENDARIO),
                JavaScriptClick.on(BTN_AÑO_CALENDARIO1),
                JavaScriptClick.on(BTN_MES_CALENDARIO),
                JavaScriptClick.on(BTN_DIA_CALENDARIO),
                JavaScriptClick.on(BTN_GENERO),
                JavaScriptClick.on(BTN_ELEGIR_GENERO),
                Enter.theValue(dataInjection.getTelefono()).into(TXT_TELEFONO),
                Enter.theValue(dataInjection.getCelular()).into(TXT_CELULAR),
                Enter.theValue(dataInjection.getOtro_celular()).into(TXT_OTRO_CELULAR),
                JavaScriptClick.on(BTN_ESTADO_CIVIL),
                JavaScriptClick.on(BTN_ELEGIR_ESTADO_CIVIL),
                JavaScriptClick.on(BTN_COMUNA),
                JavaScriptClick.on(BTN_ELEGIR_COMUNA),
                JavaScriptClick.on(BTN_COMUNA),
                JavaScriptClick.on(BTN_ELEGIR_COMUNA),
                JavaScriptClick.on(BTN_BARRIO),
                JavaScriptClick.on(BTN_ELEGIR_BARRIO),
                JavaScriptClick.on(BTN_VIA),
                JavaScriptClick.on(BTN_ELEGIR_VIA),
                Enter.theValue("12").into(TXT_VIA_NRO),
                Enter.theValue("13").into(TXT_CRUCE_NRO),
                Enter.theValue("142").into(TXT_PUERTA_NRO),
                Enter.theValue("pruebas de direccion").into(TXT_DESCRIPCION),
                JavaScriptClick.on(BTN_ZONA),
                JavaScriptClick.on(BTN_ELEGIR_ZONA),
                JavaScriptClick.on(BTN_GRUPO_ETNICO),
                JavaScriptClick.on(BTN_ELEGIR_GRUPO_ETNICO),
                JavaScriptClick.on(BTN_CIUDAD_NACIMIENTO),
                JavaScriptClick.on(BTN_ELEGIR_CIUDAD_NACIMIENTO),
                JavaScriptClick.on(BTN_ESTUDIA),
                JavaScriptClick.on(BTN_ELEGIR_ESTUDIA),
                JavaScriptClick.on(BTN_NIVEL_ESCOLARIDAD),
                JavaScriptClick.on(BTN_ELEGIR_NIVEL_ESCOLARIDAD),
                JavaScriptClick.on(BTN_OCUPACION),
                JavaScriptClick.on(BTN_ELEGIR_OCUPACION),
                JavaScriptClick.on(BTN_CONTRATO),
                JavaScriptClick.on(BTN_ELEGIR_CONTRATO),
                JavaScriptClick.on(BTN_INGRESOS),
                JavaScriptClick.on(BTN_ELEGIR_INGRESO),
                JavaScriptClick.on(BTN_SISBENIZADO),
                JavaScriptClick.on(BTN_ELEGIR_SISBENIZADO),
               // JavaScriptClick.on(BTN_MUNICIPIO_SISBEN),
               // JavaScriptClick.on(BTN_ELEGIR_MUNICIPIO_SISBEN),
                JavaScriptClick.on(BTN_REGIMEN),
                JavaScriptClick.on(BTN_ELEGIR_REGIMEN),
                JavaScriptClick.on(BTN_EAPB),
                JavaScriptClick.on(BTN_ELEGIR_EAPB),
                JavaScriptClick.on(BTN_MUNICIPIO_AFILIADO),
                JavaScriptClick.on(BTN_ELEGIR_MUNICIPIO_AFILIADO),
                JavaScriptClick.on(BTN_CONDICION),
                JavaScriptClick.on(BTN_ELEGIR_CONDICION),
                Enter.theValue("1").into(TXT_FICHA),
                Enter.theValue("3.1").into(TXT_PUNTAJE),
                JavaScriptClick.on(BTN_CARNET),
                JavaScriptClick.on(BTN_ELEGIR_CARNET),
                JavaScriptClick.on(BTN_GRUPO_SANGUINEO),
                JavaScriptClick.on(BTN_ELEGIR_GRUPO_SANGUINEO),
                JavaScriptClick.on(BTN_DISCAPACIDAD),
                JavaScriptClick.on(BTN_ELEGIR_DISCAPACIDAD),
                JavaScriptClick.on(BTN_VICTIMA),
                JavaScriptClick.on(BTN_ELEGIR_VICTIMA),
                JavaScriptClick.on(BTN_ENFERMEDAD_CRONICA),
                JavaScriptClick.on(BTN_ELEGIR_ENFERMEDAD_CRONICA),
                JavaScriptClick.on(BTN_PROGRAMA),
                JavaScriptClick.on(BTN_ELEGIR_PROGRAMA),
                Enter.theValue(dataInjection.getEmail()).into(TXT_CORREO_ELECTRONICO),
                JavaScriptClick.on(BTN_TOS),
                JavaScriptClick.on(BTN_ELEGIR_TOS),
                JavaScriptClick.on(BTN_ODINOFAGIA),
                JavaScriptClick.on(BTN_ELEGIR_ODINOFAGIA),
                JavaScriptClick.on(BTN_FIEBRE),
                JavaScriptClick.on(BTN_ELEGIR_FIEBRE),
                JavaScriptClick.on(BTN_MALESTAR),
                JavaScriptClick.on(BTN_INGRESAR_MALESTAR),
                JavaScriptClick.on(BTN_RESPIRAR),
                JavaScriptClick.on(BTN_INGRESAR_RESPIRAR),
                JavaScriptClick.on(BTN_REPORTO),
                JavaScriptClick.on(BTN_INGRESAR_REPORTO)
















        );

    }

    public static RegistroUsuarios enText() {
        return Tasks.instrumented(RegistroUsuarios.class);
    }
}

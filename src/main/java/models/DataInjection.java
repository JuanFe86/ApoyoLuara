package models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String documento;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String telefono;
    private String celular;
    private String otro_celular;
    private String via;
    private String cruce;
    private String puerta;
    private String email;


    public DataInjection() {
        this.documento = faker.idNumber().ssnValid();
        this.primer_nombre = faker.name().firstName();
        this.segundo_nombre = faker.name().lastName();
        this.primer_apellido = faker.name().lastName();
        this.segundo_apellido = faker.name().lastName();
        this.telefono = faker.phoneNumber().phoneNumber();
        this.celular = faker.phoneNumber().cellPhone();
        this.otro_celular = faker.phoneNumber().cellPhone();
        this.via = faker.address().streetPrefix();
        this.cruce = faker.address().cityPrefix();
        this.puerta = faker.address().cityPrefix();
        this.email = faker.internet().emailAddress();

    }

    public String getDocumento() {
        return documento;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getOtro_celular() {
        return otro_celular;
    }

    public String getVia() {
        return via;
    }

    public String getCruce() {
        return cruce;
    }
    public String getPuerta() {
        return puerta;
    }

    public String getEmail() {
        return email;
    }
}

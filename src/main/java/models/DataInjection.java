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

    public DataInjection() {
        this.documento = faker.idNumber().ssnValid();
        this.primer_nombre = faker.name().firstName();
        this.segundo_nombre = faker.name().lastName();
        this.primer_apellido = faker.name().lastName();
        this.segundo_apellido = faker.name().lastName();

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

    public String getSegundo_apellido() {
        return segundo_apellido;
    }
}

package es.studium.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class EjemploFaker
{
	public static void main(String[] args) {
        // Crear una instancia de Faker
        Faker faker = new Faker(new Locale("es"));

        // Generar un nombre de persona
        String name = faker.name().fullName();
        System.out.println("Nombre: " + name);

        // Generar un número de teléfono
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println("Teléfono: " + phoneNumber);

        // Generar una dirección
        String address = faker.address().fullAddress();
        System.out.println("Dirección: " + address);

        // Generar un correo electrónico
        String email = faker.internet().emailAddress();
        System.out.println("Correo Electrónico: " + email);

        // Generar una fecha de nacimiento
        Date birthDate = faker.date().birthday();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedBirthDate = dateFormat.format(birthDate);
        System.out.println("Fecha de Nacimiento: " + formattedBirthDate);
        dateFormat.applyPattern("yyyy-MM-dd");
        formattedBirthDate = dateFormat.format(birthDate);
        System.out.println("Fecha de Nacimiento (MySQL): " + formattedBirthDate);
    }
}
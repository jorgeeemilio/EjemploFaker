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

        // Generar un n�mero de tel�fono
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println("Tel�fono: " + phoneNumber);

        // Generar una direcci�n
        String address = faker.address().fullAddress();
        System.out.println("Direcci�n: " + address);

        // Generar un correo electr�nico
        String email = faker.internet().emailAddress();
        System.out.println("Correo Electr�nico: " + email);

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
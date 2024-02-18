package by.itacademy.ivanchikov.domain;

import com.github.javafaker.Faker;

public class User {
    public static String getRandomNoCorrectEmail() {
        Faker faker = new Faker();
        return faker.internet().password() + "@test.com";
    }

    public static String getRandomCorrectEmail() {
        Faker faker = new Faker();
        return faker.internet().safeEmailAddress(faker.name().firstName());
    }

    public static String getRandomPassvord() {
        Faker faker = new Faker();

        return faker.internet().password();
    }
}


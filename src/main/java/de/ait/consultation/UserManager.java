package de.ait.consultation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserManager {
    public static void main(String[] args) {
        User user = new User();
        user.name = "John Does";
        user.age = 25;
        user.password = "password";

        User userHero = new User("Terminators", 200, "12345");
        log.info("user: {}", user);
        userHero.setName("Jorj Bush");
        log.info("userHero not null: ", userHero);

        User userNewHero = User.builder().name("aaao").age(001).password("0909").build();
        log.error("userNewHero: ", userNewHero);

        System.out.println(user);
        System.out.println(user.hashCode());

        System.out.println(userHero);
        System.out.println(userNewHero);
    }
}

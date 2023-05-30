package shirshin.human_friends.ui;

import shirshin.human_friends.model.*;
import shirshin.human_friends.services.Service;

import java.time.LocalDate;
import java.util.Scanner;

public class PetCreateMenu implements BaseMenu {

    @Override
    public void showMenu(Service service) {

        System.out.println("Меню добавления питомца");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Pet pet = null;

            System.out.println("Добавить кота, введите 1\n" +
                    "Добавить собаку, введите 2\n" +
                    "Добавить хомяка, введите 3\n" +
                    "Вернуться в предыдущее меню введите 0\n");
            System.out.print(">>>>/t");
            String input = scanner.nextLine();

            if (input.equals("0"))
                return;

            System.out.println("Введите имя питомца");
            String nikname = scanner.nextLine();

            System.out.println("Введите день рождения питомца в формате 1999-01-01");
            String birthday = scanner.nextLine();

            System.out.println("Введите окрас питомца");
            String colour = scanner.nextLine();

            System.out.println("Введите породу питомца");
            String breed = scanner.nextLine();

            switch (input) {
                case "1":
                    pet = new Cat();
                    pet.setNikname(nikname);
                    pet.setBirthday(LocalDate.parse(birthday));
                    pet.setColour(colour);
                    pet.setBreed(breed);
                    service.createHumanFriend(pet, PetType.cats);
                    break;
                case "2":
                    pet = new Dog();
                    pet.setNikname(nikname);
                    pet.setBirthday(LocalDate.parse(birthday));
                    pet.setColour(colour);
                    pet.setBreed(breed);
                    service.createHumanFriend(pet, PetType.dogs);
                    break;
                case "3":
                    pet = new Hamster();
                    pet.setNikname(nikname);
                    pet.setBirthday(LocalDate.parse(birthday));
                    pet.setColour(colour);
                    pet.setBreed(breed);
                    service.createHumanFriend(pet, PetType.hamsters);
                    break;
            }
        }
    }
}

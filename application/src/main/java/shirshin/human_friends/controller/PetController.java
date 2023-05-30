package shirshin.human_friends.controller;

import shirshin.human_friends.services.Service;
import shirshin.human_friends.ui.*;

import java.util.Scanner;

public class PetController {

    private final Service service;
    private final BaseMenu[] baseMenus;

    public PetController(Service service) {
        this.service = service;
        baseMenus = new BaseMenu[]{new PetCreateMenu(), new PetDeleteMenu(), new PetEditMenu(), new ShowPets()};
    }

    public void start() {
        System.out.println("Добро Пожаловать в Систему Учета Домашних Животных!!!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер действия, которое необходимо выполнить:\n" +
                    "1. Добавить питомца\n" +
                    "2. Удалить питомца\n" +
                    "3. Изменить данные питомца\n" +
                    "4. Просмотр всех питомцев\n" +
                    "5. Изучить новую команду питомца\n" +
                    "0. Выход из программы\n");
            System.out.print(">>>>\t");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 5) {
                baseMenus[input - 1].showMenu(service);
            }
            if (input == 0) {
                System.out.println("До свидания!!!");
                break;
            }
        }
    }
}
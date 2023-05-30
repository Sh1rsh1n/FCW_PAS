package shirshin.human_friends.ui;

import shirshin.human_friends.model.*;
import shirshin.human_friends.services.Service;

import java.util.List;
import java.util.Scanner;

public class PetDeleteMenu implements BaseMenu{

    @Override
    public void showMenu(Service service) {
        System.out.println("Меню удаления питомца");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Удалить кота, введите 1\n" +
                    "Удалить собаку, введите 2\n" +
                    "Удалить хомяка, введите 3\n" +
                    "Вернуться в предыдущее меню введите 0\n");
            System.out.print(">>>>/t");
            String input = scanner.nextLine();

            if (input.equals("0"))
                return;

            int id;
            List<HumanFriend> list;

            switch (input) {
                case "1":
                    list = service.getAllHumanFriend(PetType.cats);
                    for (HumanFriend humanFriend : list) {
                        System.out.println(humanFriend.getNikname() + humanFriend.getColour() + humanFriend.getBirthday());
                    }
                    System.out.println("Введите id питомца: ");
                    id = scanner.nextInt();
                    service.deleteHumanFriendById(id, PetType.cats);
                    System.out.println("cat with id: " + id + " is deleted.");
                    break;
                case "2":
                    list = service.getAllHumanFriend(PetType.dogs);
                    for (HumanFriend humanFriend : list) {
                        System.out.println(humanFriend.getNikname() + humanFriend.getColour() + humanFriend.getBirthday());
                    }
                    System.out.println("Введите id питомца: ");
                    id = scanner.nextInt();
                    service.deleteHumanFriendById(id, PetType.dogs);
                    System.out.println("dog with id: " + id + " is deleted.");
                    break;
                case "3":
                    list = service.getAllHumanFriend(PetType.hamsters);
                    for (HumanFriend humanFriend : list) {
                        System.out.println("id: " + humanFriend.getId() +
                                "\tnikname: " + humanFriend.getNikname() +
                                "\tcolour: " + humanFriend.getColour() +
                                "\tbirthday: " + humanFriend.getBirthday());
                    }
                    System.out.println("Введите id питомца: ");
                    id = scanner.nextInt();
                    service.deleteHumanFriendById(id, PetType.hamsters);
                    System.out.println("hamster with id: " + id + " is deleted.\n\n");
                    break;
            }

        }
    }
}

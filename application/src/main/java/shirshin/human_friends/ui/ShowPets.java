package shirshin.human_friends.ui;

import shirshin.human_friends.model.HumanFriend;
import shirshin.human_friends.model.PetType;
import shirshin.human_friends.services.Service;

import java.util.List;
import java.util.Scanner;

public class ShowPets implements BaseMenu{
    @Override
    public void showMenu(Service service) {
        System.out.println("Меню просмотра питомцев");
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Посмотреть всех питомцев введите 1\n" +
                    "Посмотреть всех кошек введите 2\n" +
                    "Посмотреть всех собак введите 3\n" +
                    "Посмотреть всех хомяков введите 4\n" +
                    "Для выхода в предыдущее меню введите 0\n");
            System.out.println(">>>>\t");
            String input = scanner.nextLine();

            if (input.equals("0"))
                return;

            int id;
            List<HumanFriend> list;

            switch (input) {
                case "1":
                    list = service.getAllHumanFriend();
                    for (HumanFriend humanFriend : list) {
                        System.out.println(humanFriend.getNikname() + humanFriend.getColour() + humanFriend.getBirthday());
                    }
                    break;
                case "2":
                    list = service.getAllHumanFriend(PetType.cats);
                    for (HumanFriend humanFriend : list) {
                        System.out.println(humanFriend.getNikname() + humanFriend.getColour() + humanFriend.getBirthday());
                    }
                    service.getAllHumanFriend(PetType.cats);
                    break;
                case "3":
                    list = service.getAllHumanFriend(PetType.dogs);
                    for (HumanFriend humanFriend : list) {
                        System.out.println(humanFriend.getNikname() + humanFriend.getColour() + humanFriend.getBirthday());
                    }
                    service.getAllHumanFriend(PetType.dogs);
                    break;
                case "4":
                    list = service.getAllHumanFriend(PetType.hamsters);
                    for (HumanFriend humanFriend : list) {
                        System.out.println(humanFriend.getNikname() + humanFriend.getColour() + humanFriend.getBirthday());
                    }
                    service.getAllHumanFriend(PetType.hamsters);
                    break;
            }
        }
    }
}

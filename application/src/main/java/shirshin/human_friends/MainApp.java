package shirshin.human_friends;

import shirshin.human_friends.controller.PetController;
import shirshin.human_friends.repository.PetRepository;
import shirshin.human_friends.services.PetService;
import shirshin.human_friends.services.Service;

public class MainApp {
    public static void main(String[] args) {

        Service service = new PetService(new PetRepository());
        new PetController(service).start();

    }
}
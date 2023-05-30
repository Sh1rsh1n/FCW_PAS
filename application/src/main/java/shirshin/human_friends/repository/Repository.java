package shirshin.human_friends.repository;

import shirshin.human_friends.model.HumanFriend;
import shirshin.human_friends.model.Pet;
import shirshin.human_friends.model.PetType;

import java.util.List;

public interface Repository {

    String URL = "jdbc:mysql://localhost:3306/human_friends";
    String USERNAME = "root";
    String PASSWORD = "root";

    void create(Pet pet, PetType petType);

    void update(int id, Pet pet);

    void delete(int id, PetType petType);

    HumanFriend getOne(int id, PetType petType);

    List<HumanFriend> getAll(PetType... args);
    
}
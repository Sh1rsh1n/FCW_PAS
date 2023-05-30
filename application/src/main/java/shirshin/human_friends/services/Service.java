package shirshin.human_friends.services;

import shirshin.human_friends.model.HumanFriend;
import shirshin.human_friends.model.Pet;
import shirshin.human_friends.model.PetType;

import java.util.List;

public interface Service {
     
    void createHumanFriend(Pet pet, PetType petType);
    
    HumanFriend getHumanFriendById(int id, PetType petType);
    
    void updateHumanFriendById(int id, Pet pet);
    
    void deleteHumanFriendById(int id, PetType petType);

    List<HumanFriend> getAllHumanFriend(PetType... args);
}
package shirshin.human_friends.services;


import shirshin.human_friends.model.HumanFriend;
import shirshin.human_friends.model.Pet;
import shirshin.human_friends.model.PetType;
import shirshin.human_friends.repository.Repository;

import java.util.List;

public class PetService implements Service {

    private Repository repository;

    public PetService(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void createHumanFriend(Pet pet, PetType petType){
        repository.create(pet, petType);
    }
    
    @Override
    public HumanFriend getHumanFriendById(int id, PetType petType){
        return repository.getOne(id, petType);
    }
    
    @Override
    public void updateHumanFriendById(int id, Pet pet){
        repository.update(id, pet);
    }
    
    @Override
    public void deleteHumanFriendById(int id, PetType petType){
        repository.delete(id, petType);
    }
    
    @Override
    public List<HumanFriend> getAllHumanFriend(PetType... args){

        for (PetType petType : args) {
            if (petType.equals(PetType.cats)) {
                return repository.getAll(PetType.cats);
            }
            if (petType.equals(PetType.dogs)) {
                return repository.getAll(PetType.dogs);
            }

            if (petType.equals(PetType.hamsters)) {
                return repository.getAll(PetType.hamsters);
            }
        }

        return repository.getAll(PetType.cats, PetType.dogs, PetType.hamsters);
    }
}
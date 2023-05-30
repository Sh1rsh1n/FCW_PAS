package shirshin.human_friends.services;



public class PetService implement Service {

    private Repository repository;
    
    Override
    public void createHumanFriend(HumanFriend humanFriend){
        repository.create(humanFriend);
    }
    
    @Override
    HumanFriend getHumanFriendById(int id){
        return repository.getAnimalById(id);
    }
    
    @Override
    void updateHumanFriendById(int id){
        repository.updateAnimalById(id);
    }
    
    @Override
    void deleteHumanFriendById(int id){
        repository.deleteHumanFriendById(id);
    }
    
    @Override
    List<HumanFriend> getAllHumanFriend(){
        return repository.getAllHumanFriend();
    }
}
package shirshin.human_friends.services;

public interface Service {
     
    void createHumanFriend(HumanFriend humanFriend);
    
    HumanFriend getHumanFriendById(int id);
    
    void updateHumanFriendById(int id);
    
    void deleteHumanFriendById(int id);
    
    List<HumanFriend> getAllHumanFriend();
}
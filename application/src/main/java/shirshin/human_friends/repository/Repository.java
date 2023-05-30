package shirshin.human_friends.repository;

public interface Repository {

    String URL = "";
    String USERNAME = "root";
    String PASSWORD = "root";

    void create(HumanFriend animal);
    
    HumanFriend getAnimalById(int id);
    
    void updateAnimalById(int id);
    
    void deleteById(int id);
    
    List<HumanFriend> getAll();
    
}
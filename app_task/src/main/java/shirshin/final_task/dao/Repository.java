package shirshin.final_task.dao;


import java.util.List;

public interface Repository<T> {

    String url = "jdbc:mysql://localhost:3306/human_friends?useSSL=false";
    String username = "root";
    String password = "root";

    List<T> getAllAnimal();
    T getById(int id);
    void add(T animal);
    void edit(T animal);
    void delete(T animal);

}

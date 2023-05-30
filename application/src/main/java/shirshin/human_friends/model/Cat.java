package shirshin.human_friends.model;

public class Cat extends Pet {
    
    public Cat(){
        super();
    }
    
    public Cat(int id, String nikname, LocalDateTime birthday, String colour, String breed){
        super(id, nikname, birthday, colour, breed);
    }
}
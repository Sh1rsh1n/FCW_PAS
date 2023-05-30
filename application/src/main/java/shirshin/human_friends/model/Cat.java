package shirshin.human_friends.model;

import java.time.LocalDate;

public class Cat extends Pet {
    
    public Cat(){
        super();
    }
    
    public Cat(int id, String nikname, LocalDate birthday, String colour, String breed){
        super(id, nikname, birthday, colour, breed);
    }
}
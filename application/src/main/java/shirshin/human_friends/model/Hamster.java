package shirshin.human_friends.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Hamster extends Pet{
    
    public Hamster(){
        super();
    }
    
    public Hamster(int id, String nikname, LocalDate birthday, String colour, String breed){
        super(id, nikname, birthday, colour, breed);
    }

}

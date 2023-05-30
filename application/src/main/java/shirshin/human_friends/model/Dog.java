package shirshin.human_friends.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog extends Pet{

    public Dog(int id, String nikname, LocalDate birthday, String colour, String breed){
        super(id, nikname, birthday, colour, breed);
    }

    public Dog() {

    }
}



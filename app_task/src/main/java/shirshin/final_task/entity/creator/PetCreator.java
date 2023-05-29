package shirshin.final_task.entity.creator;


import shirshin.final_task.entity.HumanFriend;
import shirshin.final_task.entity.HumanFriendType;
import shirshin.final_task.entity.animals.Cat;
import shirshin.final_task.entity.animals.Dog;
import shirshin.final_task.entity.animals.Hamster;

public class PetCreator extends HumanFriendCreator {
    
    @Override
    protected HumanFriend createNewHumanFriend(HumanFriendType type) {
        switch (type) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            case HAMSTER:
                return new Hamster();
        }
        return null;
    }
}

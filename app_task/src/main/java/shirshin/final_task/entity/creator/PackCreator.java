package shirshin.final_task.entity.creator;

import shirshin.final_task.entity.HumanFriend;
import shirshin.final_task.entity.HumanFriendType;
import shirshin.final_task.entity.animals.*;

public class PackCreator extends HumanFriendCreator{
    @Override
    protected HumanFriend createNewHumanFriend(HumanFriendType type) {
        switch (type) {
            case DONKEY:
                return new Donkey();
            case CAMEL:
                return new Camel();
            case HORSE:
                return new Horse();
        }
        return null;
    }
}

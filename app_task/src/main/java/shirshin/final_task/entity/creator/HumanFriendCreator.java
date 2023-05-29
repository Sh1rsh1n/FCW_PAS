package shirshin.final_task.entity.creator;

import shirshin.final_task.entity.*;

import java.time.LocalDateTime;

public abstract class HumanFriendCreator {

    protected abstract HumanFriend createNewHumanFriend(HumanFriendType petType);

    public HumanFriend createPet(HumanFriendType petType, String nikname, LocalDateTime date) {
        HumanFriend humanFriend = createNewHumanFriend(petType);
        humanFriend.setNikname(nikname);
        humanFriend.setBirthday(date);
        return humanFriend;
    }
}

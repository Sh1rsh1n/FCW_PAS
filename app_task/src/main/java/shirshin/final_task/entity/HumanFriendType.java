package shirshin.final_task.entity;

public enum HumanFriendType {

    DONKEY, CAMEL, HORSE, CAT, DOG, HAMSTER;

    public static HumanFriendType getType(int typeId) {
        if (typeId == 1)
            return HumanFriendType.DONKEY;
        if (typeId == 2)
            return HumanFriendType.CAMEL;
        if (typeId == 3)
            return HumanFriendType.HORSE;
        if (typeId == 4)
            return HumanFriendType.CAT;
        if (typeId == 5)
            return HumanFriendType.DOG;
        if (typeId == 6)
            return HumanFriendType.HAMSTER;
        return null;
    }
}

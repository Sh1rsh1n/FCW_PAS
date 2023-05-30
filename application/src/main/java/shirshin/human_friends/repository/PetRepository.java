package shirshin.human_friends.repository;

public PetRepository implements Repository {

    private static Connection connection;
    
    static {
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS human_friends" + " DEFAULT CHARACTER SET utf8" + " COLLATE utf8_general_ci");   
            System.out.println("База данных создана");   
        } catch (SQLException e) {   
            System.out.println("Ошибка: " + e.getMessage());   
        } finally {
            connection.close();
        }
        
        
    }
    
    
    
    @Override
    public void create(HumanFriend humanFriend){
        
    }
    
    @Override
    HumanFriend getAnimalById(int id){
    
    }
    
    @Override
    void updateAnimalById(int id){
    
    }
    
    @Override
    void deleteById(int id){
    
    }
    
    @Override
    List<HumanFriend> getAll(PetType petType){
        List<HumanFriend> humanFriendList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM ?");
            preparedStatement.setInt(1, petType);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                HumanFriend humanFriend = new HumanFriend();
                humanFriend.setId(resultSet.getInt("id"));
                humanFriend.setName(resultSet.getString("nikname"));
                humanFriend.setEmail(resultSet.getDate("brithday"));
                humanFriend.setAge(resultSet.getInt("colour"));
                humanFriendList.add(humanFriend);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return humanFriendList;
    }

}
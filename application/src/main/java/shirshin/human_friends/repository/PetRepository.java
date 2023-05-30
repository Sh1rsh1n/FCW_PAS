package shirshin.human_friends.repository;

import shirshin.human_friends.Counter;
import shirshin.human_friends.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetRepository implements Repository {

    private static Connection connection;

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void create(Pet pet, PetType petType) {
        if (petType.name().equals("cats")) {
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("INSERT INTO cats (nikname, birthday, colour, breed) VALUES (?, ?, ?, ?);");
                preparedStatement.setString(1, pet.getNikname());
                preparedStatement.setDate(2, Date.valueOf(pet.getBirthday()));
                preparedStatement.setString(3, pet.getColour());
                preparedStatement.setString(4, pet.getBreed());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if (petType.name().equals("dogs")) {
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("INSERT INTO dogs (nikname, birthday, colour, breed) VALUES (?, ?, ?, ?);");
                preparedStatement.setString(1, pet.getNikname());
                preparedStatement.setDate(2, Date.valueOf(pet.getBirthday()));
                preparedStatement.setString(3, pet.getColour());
                preparedStatement.setString(4, pet.getBreed());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if (petType.name().equals("hamsters")) {
            try {
                PreparedStatement preparedStatement =
                        connection.prepareStatement("INSERT INTO hamsters (nikname, birthday, colour, breed) VALUES (?, ?, ?, ?);");
                preparedStatement.setString(1, pet.getNikname());
                preparedStatement.setDate(2, Date.valueOf(pet.getBirthday()));
                preparedStatement.setString(3, pet.getColour());
                preparedStatement.setString(4, pet.getBreed());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public HumanFriend getOne(int id, PetType petType) {

        Pet pet = null;
        PreparedStatement preparedStatement = null;

        try {
            if (petType.name().equals("cats")) {
                pet = new Cat();
                preparedStatement = connection.prepareStatement("SELECT * FROM cats WHERE id=?");
            }
            if (petType.name().equals("dogs")) {
                pet = new Dog();
                preparedStatement = connection.prepareStatement("SELECT * FROM dogs WHERE id=?");
            }
            if (petType.name().equals("hamsters")) {
                pet = new Hamster();
                preparedStatement = connection.prepareStatement("SELECT * FROM hamsters WHERE id=?");
            }

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            pet.setId(resultSet.getInt("id"));
            pet.setNikname(resultSet.getString("nikname"));
            pet.setBirthday(resultSet.getDate("birthday").toLocalDate());
            pet.setColour(resultSet.getString("colour"));
            pet.setBreed(resultSet.getString("breed"));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pet;
    }

    @Override
    public void update(int id, Pet pet) {

        PreparedStatement preparedStatement = null;

        try {
            if (pet instanceof Cat) {
                preparedStatement = connection.prepareStatement("UPDATE cats SET nikname=?, birthday=?, colour=?, breed=? WHERE id=?");
            }
            if (pet instanceof Dog) {
                preparedStatement = connection.prepareStatement("UPDATE dogs SET nikname=?, birthday=?, colour=?, breed=? WHERE id=?");
            }
            if (pet instanceof Hamster) {
                preparedStatement = connection.prepareStatement("UPDATE hamsters SET nikname=?, birthday=?, colour=?, breed=? WHERE id=?");
            }

            preparedStatement.setString(1, pet.getNikname());
            preparedStatement.setDate(2, Date.valueOf(pet.getBirthday()));
            preparedStatement.setString(3, pet.getColour());
            preparedStatement.setString(4, pet.getBreed());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id, PetType petType) {

        PreparedStatement preparedStatement = null;

        try {
            if (petType.name().equals("cats")) {
                preparedStatement = connection.prepareStatement("DELETE FROM cats WHERE id=?");
            }
            if (petType.name().equals("dogs")) {
                preparedStatement = connection.prepareStatement("DELETE FROM dogs WHERE id=?");
            }
            if (petType.name().equals("hamsters")) {
                preparedStatement = connection.prepareStatement("DELETE FROM hamsters WHERE id=?");
            }

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<HumanFriend> getAll(PetType... args) {
        List<HumanFriend> humanFriendList = new ArrayList<>();

        for (PetType petType : args) {
            if (petType.equals(PetType.cats)) {
                try {
                    Statement statement =
                            connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM cats");
                    while (resultSet.next()) {
                        HumanFriend cat = new Cat();
                        cat.setId(resultSet.getInt("id"));
                        cat.setNikname(resultSet.getString("nikname"));
                        cat.setBirthday(resultSet.getDate("birthday").toLocalDate());
                        cat.setColour(resultSet.getString("colour"));
                        humanFriendList.add(cat);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (petType.equals(PetType.dogs)) {
                try {
                    Statement statement =
                            connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM dogs");
                    while (resultSet.next()) {
                        HumanFriend dog = new Dog();
                        dog.setId(resultSet.getInt("id"));
                        dog.setNikname(resultSet.getString("nikname"));
                        dog.setBirthday(resultSet.getDate("birthday").toLocalDate());
                        dog.setColour(resultSet.getString("colour"));
                        humanFriendList.add(dog);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (petType.equals(PetType.hamsters)) {
                try {
                    Statement statement =
                            connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM hamsters");
                    while (resultSet.next()) {
                        HumanFriend hamster = new Hamster();
                        hamster.setId(resultSet.getInt("id"));
                        hamster.setNikname(resultSet.getString("nikname"));
                        hamster.setBirthday(resultSet.getDate("birthday").toLocalDate());
                        hamster.setColour(resultSet.getString("colour"));
                        humanFriendList.add(hamster);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


        return humanFriendList;
    }
}
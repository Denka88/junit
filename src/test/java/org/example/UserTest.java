package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class UserTest {

    public User user;
    public User user1;
    public User user2;

    @Before
    public void setUp() {
        user = new User("Евгений", 35, Sex.MALE);
        user1 = new User("Марина", 34, Sex.FEMALE);
        user2 = new User("Алина", 7, Sex.FEMALE);
    }

    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetAllUsers() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected.size(), actual.size());
    }

    @Test
    public void testGetHowManyUsers() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        assertEquals(expected.size(), actual.size());
    }

    @Test
    public void getAllAgeUsers() {
        List<User> expected = User.getAllUsers();

        int expectedCountAge = 0;
        for (User user : expected) {
            expectedCountAge += user.getAge();
        }

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        int actualCountAge = 0;
        for (User user : actual) {
            actualCountAge += user.getAge();
        }

        assertEquals(expectedCountAge, actualCountAge);
    }

    @Test
    public void testGetAllAgeUsers() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        int expectedCountAge = 0;
        for (User user : expected) {
            expectedCountAge += user.getAge();
        }

        List<User> actual = new ArrayList<>();
        actual.add(user);

        int actualCountAge = 0;
        for (User user : actual) {
            actualCountAge += user.getAge();
        }

        assertEquals(expectedCountAge, actualCountAge);
    }

    @Test
    public void getAverageAgeOfAllUsers() {
        List<User> expected = User.getAllUsers();

        int expectedCountAge = 0;
        for (User user : expected) {
            expectedCountAge += user.getAge();
        }
        
        int expectedAverageAge = expectedCountAge / expected.size();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        int actualCountAge = 0;
        for (User user : actual) {
            actualCountAge += user.getAge();
        }
        
        int actualAverageAge = actualCountAge / expected.size();

        assertEquals(expectedAverageAge, actualAverageAge);
    }

    @Test
    public void testGetAverageAgeOfAllUsers() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        int expectedCountAge = 0;
        for (User user : expected) {
            expectedCountAge += user.getAge();
        }

        int expectedAverageAge = expectedCountAge / expected.size();

        List<User> actual = new ArrayList<>();
        actual.add(user);

        int actualCountAge = 0;
        for (User user : actual) {
            actualCountAge += user.getAge();
        }

        int actualAverageAge = actualCountAge / expected.size();

        assertEquals(expectedAverageAge, actualAverageAge);
    }
}
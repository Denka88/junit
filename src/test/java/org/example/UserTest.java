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

    /**
     * Тестирование метода getAllUsers
     * Сравнивает список пользователей с ожидаемым результатом
     * Если пользователи не совпадают, то ошибка
     */
    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, actual);
    }

    /**
     * Тестирование метода testGetAllUsers
     * Сравнивает список пользователей по полу, с ожидаемым результатом
     * Если пользователи не совпадают, то ошибка
     */
    @Test
    public void testGetAllUsers() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected, actual);
    }

    /**
     * Тестирование метода getHowManyUsers
     * Сравнивает количество пользователей с ожидаемым результатом
     * Если количество пользователей не совпадает, то ошибка
     */
    @Test
    public void getHowManyUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        assertEquals(expected.size(), actual.size());
    }

    /**
     * Тестирование метода testGetHowManyUsers
     * Сравнивает количество пользователей по полу, с ожидаемым результатом
     * Если количество пользователей и пол не совпадает, то ошибка
     */
    @Test
    public void testGetHowManyUsers() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        assertEquals(expected.size(), actual.size());
    }

    /**
     * Тестирование метода getAllAgeUsers
     * Сравнивает количество пользователей по возрасту, с ожидаемым результатом
     * Если количество пользователей не совпадает, то ошибка
     */
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

    /**
     * Тестирование метода testGetAllAgeUsers
     * Сравнивает количество пользователей по возрасту и по полу, с ожидаемым результатом
     * Если количество пользователей не совпадает, то ошибка
     */
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

    /**
     * Тестирование метода getAverageAgeOfAllUsers
     * Сравнивает средний возраст пользователей, с ожидаемым результатом
     * Если средний возраст не совпадает, то ошибка
     */
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

    /**
     * Тестирование метода testGetAverageAgeOfAllUsers
     * Сравнивает средний возраст пользователей по полу, с ожидаемым результатом
     * Если средний возраст и пол не совпадает, то ошибка
     */
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
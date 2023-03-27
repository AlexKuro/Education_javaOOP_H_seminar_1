package org.example;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private ArrayList<Product> userBasket;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Product> getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(ArrayList<Product> userBasket) {
        this.userBasket = userBasket;
    }

    @Override
    public String toString() {
        return "User{" + "login='" + login + '\'' + '\'' + ", userBasket =" + userBasket + '}';
    }

    /**
     *
     * @param loginIn
     * @param passwordIn
     * @return true, если логин и пароль верны
     */
    public boolean check(String loginIn, String passwordIn) {
        if (loginIn.equals(login) && passwordIn.equals(password)) {
            System.out.println("\nЗдравствуйте " + login);
            System.out.println("Аутентификация пользователя прошла успешно!");
            return true;
        } else {
            System.out.println("Логин или пароль введены неверно!");
            return false;
        }
    }
}

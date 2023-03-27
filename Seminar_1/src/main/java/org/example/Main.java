package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static Boolean request_1(Scanner iScanner) {
        System.out.println("Желаете переместить некоторые товары в корзину?");
        System.out.print("Нажмите 'Y' - Да, 'N' - Нет -> ");
        String st = iScanner.next();
        if ("y".equals(st.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean request_2(Scanner iScanner) {
        System.out.println("Желаете купить товары?");
        System.out.print("Нажмите 'Y' - Да, 'N' - Нет -> ");
        String st = iScanner.next();
        if ("y".equals(st.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean check(int n, ArrayList<Product> arr) {
        if (n > 0 & n <= arr.size()) {
            return true;
        } else {
            System.out.println("Некорректный ввод данных");
            return false;
        }
    }

    public static void printArray(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("\t" + products.get(i) + " \t- -> нажмите '" + (i + 1) + "'");
        }
        System.out.println();
    }

    public static void printArray2(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ":  " + products.get(i));
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Category computer = new Category();
        Category screens = new Category();
        Category officeEquement = new Category();
        Category inputDevices = new Category();
        computer.setName("Ноутбуки");
        screens.setName("Мониторы");
        officeEquement.setName("Оргтехника, принтер лазерный");
        inputDevices.setName("Устройства ввода");

        Product lap_1 = new Product("Apple MacBook Pro A2485", 299990, 5.0);
        Product lap_2 = new Product("Lenovo Legion S7 15ACH6", 110990, 5.0);
        Product lap_3 = new Product("MSI    Pulse GL76 12UEK", 129990, 5.0);
        Product lap_4 = new Product("Xiaomi    Pro RedmiBook", 73990, 4.5);

        Product scr_1 = new Product("Acer Nitro XV272UVbmiiprzx 27", 30500, 4.5);
        Product scr_2 = new Product("SunWind      SUN-M24BG110 23.8", 9990, 5.0);
        Product scr_3 = new Product("GIGABYTE            M27Q X 27", 45990, 4.5);
        Product scr_4 = new Product("Digma         DM-MONB2202 21.5", 6990, 4.0);

        Product offic_1 = new Product("Pantum P2207             черно-белый", 8590, 4.5);
        Product offic_2 = new Product("HP LaserJet M111a        черно-белый", 8590, 5.0);
        Product offic_3 = new Product("Canon i-Sensys LBP6030B черно-белый", 15590, 4.0);
        Product offic_4 = new Product("Brother HL-L2300DR      черно-белый", 27590, 4.0);

        Product inDev_1 = new Product("Комплект (клавиатура+мышь)  SunWind SW-S510G", 900, 4.5);
        Product inDev_2 = new Product("Комплект (клавиатура+мышь) Оклик HS-HKM200G", 2040, 4.0);
        Product inDev_3 = new Product("Комплект (клавиатура+мышь)  A4TECH KRS-8372", 1260, 5.0);
        Product inDev_4 = new Product("Комплект (клавиатура+мышь)  A4TECH Fstyler ", 1839, 4.5);

        ArrayList<Product> listCategory_1 = new ArrayList<>();
        ArrayList<Product> listCategory_2 = new ArrayList<>();
        ArrayList<Product> listCategory_3 = new ArrayList<>();
        ArrayList<Product> listCategory_4 = new ArrayList<>();

        computer.setProducts(listCategory_1);
        screens.setProducts(listCategory_2);
        officeEquement.setProducts(listCategory_3);
        inputDevices.setProducts(listCategory_4);

        listCategory_1.add(lap_1);
        listCategory_1.add(lap_2);
        listCategory_1.add(lap_3);
        listCategory_1.add(lap_4);

        listCategory_2.add(scr_1);
        listCategory_2.add(scr_2);
        listCategory_2.add(scr_3);
        listCategory_2.add(scr_4);

        listCategory_3.add(offic_1);
        listCategory_3.add(offic_2);
        listCategory_3.add(offic_3);
        listCategory_3.add(offic_4);

        listCategory_4.add(inDev_1);
        listCategory_4.add(inDev_2);
        listCategory_4.add(inDev_3);
        listCategory_4.add(inDev_4);


        Integer numShop = 0;

        Basket basket = new Basket();
        ArrayList<Product> basketShop = new ArrayList();
        basket.setBasket(basketShop); // корзина покупателя

        User user1 = new User("user", "1234");
        ArrayList<Product> basketUser = new ArrayList<>();
        user1.setUserBasket(basketUser);// корзина купленных товаров


        System.out.print("\033[H\033[2J"); // очистка консоли
        System.out.println("\nЗ А Д А Ч А  1\n");
        System.out.println("\t\t- -- Интернет магазин -- -");
        System.out.println("\t\t- --   Компьютер.RU   -- -\n");
        Scanner iScanner = new Scanner(System.in);
        Boolean fl = true;
        Boolean flcheck = false;
        Boolean fl1 = false;
        Boolean fl2 = false;
        Boolean fl3 = false;


        while (fl) {
            System.out.println("\tВойти в свой аккаунт  - - - нажмите '1'");
            System.out.println("\tПросмотр товаров  - - - - - нажмите '2'");
            System.out.println("\tВыход из программы  - - - - нажмите '9'");
            System.out.print("\nВведите число -> ");
            int n = iScanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("\t- -- Вход в магазин: -- -");
                    System.out.println("Аутентификация пользователя:");
                    System.out.print("Введите логин -> ");
                    String loginIn = iScanner.next();
                    System.out.print("Введите пароль -> ");
                    String passwordIn = iScanner.next();
                    flcheck = user1.check(loginIn, passwordIn);
                    if (flcheck) {
                        fl = false;
                    } else {
                        fl = true;
                    }
                    break;
                case 2:
                    System.out.println("\t- -- Товары по категориям -- -");
                    System.out.println(computer.getName() + "  - - - - - - - - - - - нажмите '1'");
                    System.out.println(screens.getName() + "  - - - - - - - - - - - нажмите '2'");
                    System.out.println(officeEquement.getName() + "  - нажмите '3'");
                    System.out.println(inputDevices.getName() + "  - - - - - - - нажмите '4'");
                    System.out.println("\tВыход из программы - нажмите '9'");
                    System.out.print("\nВведите число -> ");
                    n = iScanner.nextInt();
                    switch (n) {
                        case 1:
                            System.out.println(computer.getName());
                            printArray2(listCategory_1);
                            break;
                        case 2:
                            System.out.println(screens.getName());
                            printArray2(listCategory_2);
                            break;
                        case 3:
                            System.out.println(officeEquement.getName());
                            printArray2(listCategory_3);
                            break;
                        case 4:
                            System.out.println(inputDevices.getName());
                            printArray2(listCategory_4);
                            break;
                    }
                    break;
                case 9:
                    System.out.print("Завершение программы.\n\n");
                    fl = false;
                    flcheck = false;
                    break;
            }

            while (flcheck) {
                numShop = listCategory_1.size() +
                        listCategory_2.size() +
                        listCategory_3.size() +
                        listCategory_4.size();
                System.out.println("Купленные товары: " + basketUser.size());
                System.out.println("В корзине товаров: " + basketShop.size());
                System.out.println("В магазине товаров: " + numShop);

                System.out.println("\tВыйти из аккаунта - - - - - нажмите '1'");
                System.out.println("\tПросмотр товаров  - - - - - нажмите '2'");
                System.out.println("\tКорзина - - - - - - - - - - нажмите '3'");
                System.out.println("\tВыход из программы  - - - - нажмите '9'");
                System.out.print("\nВведите число -> ");
                n = iScanner.nextInt();
                switch (n) {
                    case 1:
                        fl = true;
                        flcheck = false;
                        break;
                    case 2:
                        System.out.println("\t- -- Товары по категориям -- -");
                        System.out.println(computer.getName() + "  - - - - - - - - - - - нажмите '1'");
                        System.out.println(screens.getName() + "  - - - - - - - - - - - нажмите '2'");
                        System.out.println(officeEquement.getName() + "  - нажмите '3'");
                        System.out.println(inputDevices.getName() + "  - - - - - - - нажмите '4'");
                        System.out.println("\tВыход из программы - нажмите '9'");
                        System.out.print("\nВведите число -> ");
                        n = iScanner.nextInt();
                        switch (n) {
                            case 1:
                                System.out.println(computer.getName());
                                printArray(listCategory_1);
                                fl1 = listCategory_1.size() != 0 && request_1(iScanner);
                                if (fl1) {
                                    System.out.print("Для перемещения товара в корзину");
                                    System.out.print(" введите номер товара -> ");
                                    n = iScanner.nextInt();
                                    fl3 = check(n, listCategory_1);
                                    if (fl3) {
                                        basketShop.add(listCategory_1.get(n - 1));
                                        listCategory_1.remove(n - 1);
                                        System.out.println("Товар перемещен в корзину");
                                    }
                                } else {
                                    System.out.println("В данной кагегории нет товаров");
                                }
                                break;
                            case 2:
                                System.out.println(screens.getName());
                                printArray(listCategory_2);
                                fl1 = listCategory_2.size() != 0 && request_1(iScanner);
                                if (fl1) {
                                    System.out.print("Для перемещения товара в корзину");
                                    System.out.print(" введите номер товара -> ");
                                    n = iScanner.nextInt();
                                    fl3 = check(n, listCategory_2);
                                    if (fl3) {
                                        basketShop.add(listCategory_2.get(n - 1));
                                        listCategory_2.remove(n - 1);
                                        System.out.println("Товар перемещен в корзину");
                                    }
                                } else {
                                    System.out.println("В данной кагегории нет товаров");
                                }
                                break;
                            case 3:
                                System.out.println(officeEquement.getName());
                                printArray(listCategory_3);
                                fl1 = listCategory_3.size() != 0 && request_1(iScanner);
                                if (fl1) {
                                    System.out.print("Для перемещения товара в корзину");
                                    System.out.print(" введите номер товара -> ");
                                    n = iScanner.nextInt();
                                    fl3 = check(n, listCategory_3);
                                    if (fl3) {
                                        basketShop.add(listCategory_3.get(n - 1));
                                        listCategory_3.remove(n - 1);
                                        System.out.println("Товар перемещен в корзину");
                                    }
                                } else {
                                    System.out.println("В данной кагегории нет товаров");
                                }
                                break;
                            case 4:
                                System.out.println(inputDevices.getName());
                                printArray(listCategory_4);
                                fl1 = listCategory_4.size() != 0 && request_1(iScanner);
                                if (fl1) {
                                    System.out.print("Для перемещения товара в корзину");
                                    System.out.print(" введите номер товара -> ");
                                    n = iScanner.nextInt();
                                    fl3 = check(n, listCategory_4);
                                    if (fl3) {
                                        basketShop.add(listCategory_4.get(n - 1));
                                        listCategory_4.remove(n - 1);
                                        System.out.println("Товар перемещен в корзину");
                                    }
                                } else {
                                    System.out.println("В данной кагегории нет товаров");
                                }
                                break;
                        }
                        break;
                    case 3:
                        if (basketShop.size() == 0) {
                            System.out.println("В корзине нет товаров!");
                        } else {
                            System.out.println("В корзине:");
                            printArray2(basketShop);
                            fl2 = request_2(iScanner);
                            if (fl2) {
                                System.out.println("Транзакция прошла успешна");
                                System.out.println("Спасибо Вам!\n");
                                for (int i = 0; i < basketShop.size(); i++) {
                                    basketUser.add(basketShop.get(i));
                                }
//                                basketUser = (ArrayList) basketShop.clone();
                                basketShop.clear();
                            } else {
                                System.out.println("В корзине нет товаров");
                            }
                        }
                        break;
                    case 9:
                        System.out.print("Завершение программы.\n\n");
                        flcheck = false;
                        break;
                }
            }

        }

        iScanner.close();
    }
}
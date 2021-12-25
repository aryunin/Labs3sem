package lab_1;

import java.util.regex.Pattern;

class Person {
    private String name; // имя
    private String phoneNumber; // номер телефона

    // конструктор по умолчанию
    public Person() {
        name = "none";
        phoneNumber = "none";
    }

    // пользовательский конструктор
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // метод изменения номера телефона
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // метод создания нового объекта с исп. конструктора по умолчанию
    static public Person create() {
        return new Person();
    }

    // метод создания нового объекта с исп. пользовательского конструктора
    static public Person create(String name, String phoneNumber) {
        return new Person(name, phoneNumber);
    }

    // метод проверки номера телефона
    public boolean checkPhone() {
        return phoneNumber.matches("(\\+7|8)-\\d{3}-\\d{7}");
    }

    // метод вывода информации
    public void showInfo() {
        System.out.print("Name: " + name + "\nPhone: " + phoneNumber);
    }

    // получение имени
    public String getName() {
        return name;
    }

    // сравнение объектов по именам
    public boolean equalNames(Person person) {
        return name.equals(person.getName());
    }
}


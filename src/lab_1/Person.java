package lab_1;

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
        // если номер начинается с 8 и его длина не 11 символов
        if (phoneNumber.charAt(0) == '8') {
            if (phoneNumber.length() != 11)
                return false;
        }
        // если номер начинается с +7 и его длина не 12 символов
        else if (phoneNumber.substring(0,2).equals("+7")) {
            if(phoneNumber.length() != 12)
                return false;
        }
        // если номер начинается некорректно
        else return false;

        // если в номере присутствует что-то кроме цифр (не считая начала)
        try {
            long longValue = Long.parseLong(phoneNumber.substring(1));
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
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


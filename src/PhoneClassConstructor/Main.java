package PhoneClassConstructor;

/*2.Класс Phone.
1 Создайте класс Phone,который содержит переменные number,model и weight.
2 Создайте три экземпляра этого класса.
3 Выведите на консоль значения их переменных.
4 Добавить в класс Phone методы:receiveCall,имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит{name}”.Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.*/

/*5 Добавить конструктор в класс Phone, который принимает на вход три параметра
для инициализации переменных класса - number, model и weight.
6 Добавить конструктор, который принимает на вход два параметра
для инициализации переменных класса - number, model.
7 Добавить конструктор без параметров.
8 Добавьте перегруженный метод receiveCall, который принимает два параметра
- имя звонящего и номер телефона звонящего. Вызвать этот метод.
9 Создать метод sendMessage. Данный метод принимает на вход сообщение и номера телефонов
которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.*/


public class Main {

    public static void main(String[] args) {

        Phone samsung = new Phone("Samsung", "123654", 223.12);
        Phone xiaomi = new Phone("Xiaomi", "564897", 231);
        Phone sony = new Phone("Sony", "6871243", 265);

        System.out.println("Printing without a separate method " + samsung.getModel() + " " + samsung.getNumber() + " " + samsung.getWeight());
        System.out.println("");

        samsung.phoneConsol();
        xiaomi.phoneConsol();
        sony.phoneConsol();
        System.out.println("");

        samsung.receiveCall("Tom");
        xiaomi.receiveCall("Alisa");
        sony.receiveCall("Max");
        System.out.println("");

        xiaomi.setNumber("654234");
        xiaomi.receiveCall("Alisa" + " her new number is");
        System.out.println("");



        samsung.setNumber("");
        samsung.receiveCall("Tom");
        System.out.println("");


        sony.setNumber(null);
        sony.receiveCall("Max");
        System.out.println("");


        System.out.println(xiaomi.getCallerName("Alisa, ") + "new number " + xiaomi.getNumber());
        System.out.println("");

        Phone newsamsung = new Phone("Mark", "987123");
        System.out.println(newsamsung);
        System.out.println("");

        Phone nullPhone = new Phone(null, "593840", -345623);
        nullPhone.phoneConsol();
        nullPhone.setNumber(null);
        nullPhone.phoneConsol();
        nullPhone.receiveCall(null);
        nullPhone.setNumber("111111");
        nullPhone.phoneConsol();
        System.out.println("");

        nullPhone.sendMessage(null, "777777");
        System.out.println("");

        xiaomi.sendMessage("'it's all so complicated'", xiaomi.getNumber());

        //не могу понять, что нужно сделать, чтобы метод sendMessage принимал это сообщение по его значению
        sony.setMessage("'I'm out of words'");

    }


}

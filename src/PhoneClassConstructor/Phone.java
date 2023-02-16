package PhoneClassConstructor;


public class Phone {
    private String model;
    private String number;
    private double weight;


    private String callerName;

    private String message;

    public Phone(String model, String number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    //если без this
   /* public Phone(String modelTel, String numberNum, double weightGr) {
        model = modelTel;
        number = numberNum;
        weight = weightGr;
          }*/

    public Phone() {
    }

    //почему нельзя создать два конструктора со двумя String, но с разным содержанием?
    //я не смогла создать этот конструктор, потому что у меня был тот, что в задании
    // public Phone(String model, String number) {
    // this.model = model;
    // this.number = number;
    //пришлось String model переименовать в String callerName
    //потому что выдавало ошибку
    //'Phone(String, String)' is already defined in 'PhoneClassConstructor.Phone'



    public Phone(String callerName, String number) {
        this.callerName = callerName;
        this.number = number;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void phoneConsol () {
        System.out.println(model + " " + number + " " + weight);
    }


    public String getNumber () {
        return number;
    }

    public String getModel () {
        return model;
    }

    public double getWeight () {
        return weight;
    }

    public String getCallerName (String callerName){
        return callerName;
    }



    public void receiveCall (String callerName){
        System.out.println("Calling " + callerName + " " + getNumber());
    }

    public void sendMessage (String message, String number) {
        System.out.println("Message " + message + " received from " + number);
    }


 /*   @Override
    public String toString() {
        return "Phone{" +
                "callerName='" + callerName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }*/

    protected void setNumber (String number){
        if (number !=null  && !number.isBlank()
        )
            this.number = number;
        System.out.println("this is his new number " + number);
        // System.out.println("Calling " + callerName + " her new number is " + number);
        //на печати при вводе новых цифр выводит Calling null her new number is 654234
        //на печати при вводе пустого поля выводит Calling null her new number is
    }
    @Override
    public String toString() {
        return ("Calling " + callerName + ", number " + number);
    }

     /*   public String toString () {
            return number + callerName;
        }*/



}

public class Person {
    public static void main  (String[] args)  {
        Person person = new Person();

        person.personInfo("Jackie", "Chan", "Shanghai", 45663373);
        person.personInfo( "Will", "Smith", "New York",46647733);
        person.personInfo("Sherlock", "Holmes", "London", 746646444);

        person.personInfoStatic("Jackie", "Chan", "Shanghai", 45663373);
        person.personInfoStatic("Will", "Smith", "New York",46647733);
        person.personInfoStatic("Sherlock", "Holmes", "London", 746646444);
    }
    public static void personInfo(String name, String surname, String city, long phone) {
        System.out.println("Зателефонувати громадянину: " + name + surname + " із міста " + city + " можна за номером " + phone);
    }
    public void personInfoStatic (String name, String surname, String city, long phone) {
            System.out.println("Зателефонувати громадянину: " + name + surname + " із міста " + city + " можна за номером " + phone);
    }
}


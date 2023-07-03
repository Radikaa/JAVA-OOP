package animals;

public class Tomcat extends Cat{
    public final static String GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    public String produceSound(){
        return "MEOW";
    }
}

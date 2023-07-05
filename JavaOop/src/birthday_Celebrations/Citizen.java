package birthday_Celebrations;

public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private int age;
    private String birthDate;
    private String id;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.id = id;
    }
    public String getModel() {
        return getModel();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }
}
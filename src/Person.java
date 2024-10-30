import java.time.*;

public class Person {
    private String name;
    private int age;
    private String gender;
    private int yearOfBirth;

    public Person(String name, String gender, int yearOfBirth) {
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public int Age() {
        int year = Year.now().getValue();
        age = year - yearOfBirth;

        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        Age();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Gender: " + gender + ", Year of birth: " + yearOfBirth + ", Age: " + Age());
    }
}

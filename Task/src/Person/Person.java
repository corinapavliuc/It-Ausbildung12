package Person;

import java.time.LocalDate;

public class Person {
    private int id;

    private String firstName;

    private String lastName;

    private LocalDate dateOFBirth;

    private long nin;

    private  Gender gender;

    private Person(){
    }
     public Person (int inn){
        if (inn<0 ) throw new RuntimeException();
       this.nin=inn;

    }
    public Person(int inn,String lastName ){
        this(inn);
        this.lastName=lastName;
    }

    public Person(Person original){
        this(original.id, original.lastName);
        this.firstName=original.firstName;
        this.id=original.id;
        this.gender =original.gender;
        this.dateOFBirth =original.dateOFBirth;

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        if (id<0)throw new IllegalArgumentException("Id не может быть отрицательным");
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return dateOFBirth;
    }
    public long getTaxNum() {
        return getTaxNum();
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        if (firstName==null || firstName.isEmpty())throw new IllegalArgumentException("Имя не может быть пустым");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName==null || lastName.isEmpty())throw new IllegalArgumentException("Фамилия не может быть пустой");
        this.lastName = lastName;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.dateOFBirth = birthDate;
    }



    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

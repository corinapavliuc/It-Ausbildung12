package Person;

import java.time.LocalDate;

public class Main {
    public static void main (String[] agrs) throws IllegalAccessException {
                Person Vasia =new Person(12345);
        System.out.println(Vasia.getId());
        System.out.println(Vasia.getFirstName());
        Vasia.setFirstName("Vasia");
        System.out.println(Vasia.getFirstName());

        Person Irina =new Person(43566,"Irinaob");
        System.out.println(Irina.getLastName());

        Person irinaClon =new Person(Irina);
        System.out.println(Irina==irinaClon);
        System.out.println(Irina.getId());
        System.out.println(irinaClon.getId());
        irinaClon.setId(11245);
        System.out.println(Irina.getId());
        System.out.println(irinaClon.getId());
//      Vasia.id=1;
//      Vasia.firstName ="Vasia";
//      Vasia.lastName = "Vaskov";
//      Vasia.dateOFBirth = LocalDate.of(1990,5,20);
//      Vasia.nin=12345L;
//      Vasia.gender= Gender.Male;
//
//        System.out.println(Vasia.lastName);
//
//        Person Irina =new Person();
//        Irina.id=2;
//        Irina.firstName ="Irina";
//        Irina.lastName = "Vaskova";
//        Irina.dateOFBirth = LocalDate.of(1991,7,30);
//        Irina.nin=13256L;
//        Irina.gender= Gender.Female;
//
//        System.out.println(Irina.lastName);
      Person dima =new Person(2);
      dima.setId(35);
      System.out.println(dima.getId());

    }
}

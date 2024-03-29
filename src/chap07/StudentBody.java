package chap07;

/**
 * Demonstrates the use of an aggregate class.
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class StudentBody {
    /**
    * Creates some Address and Student objects and prints them.
    * @param args Unused
    */
    public static void main(String[] args) {
        Address school = new Address("3700 Willingdon Ave.", "Burnaby", "BC",
                "V5G 3H2");

        Address jHome = new Address("21 Jump Street", "Langley", "BC",
                    "V3A 6K6");
        Student john = new Student("John", "Smith", jHome, school);

        Address mHome = new Address("123 Main Street", "North Pole", "NU",
                    "H0H 0H0");
        Student marsha = new Student("Marsha", "Jones", mHome, school);

        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
    }
}

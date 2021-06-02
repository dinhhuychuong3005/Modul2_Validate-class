public class ClassExampleTest {
    private static ValidateNameClass validateNameClass;
    private static final String [] validClass = {"C0318G","C0321K1","C0321K","A0321M","P0321I"};

    public static void main(String[] args) {
        validateNameClass = new ValidateNameClass();
        for (String classes: validClass) {
            boolean isClass = validateNameClass.validate(classes);
            System.out.println("Class is: " + classes + " " + isClass);
        }
    }
}

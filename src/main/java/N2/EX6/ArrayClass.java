package N2.EX6;

public class ArrayClass {

    String[] array = new String[5];

    public void launchException() {
        String inexistentElement = array[7];
    }
}

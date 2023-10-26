public class ScratchWork {
    public static void main(String[] args) {
        String timestamp = "4:15:56";
//        Hint: you'll want to use `String.split(":")`
            System.out.printf("%02d", Integer.parseInt(timestamp.split(":")[0]));
//        Hint: you'll probably also want to use `Integer.parseInt`
        }
}

public class Main {
    public static void main(String[] args) {
        String name = "        Monica";

        /*
        name = name.concat(" Galler");
        name = name.toUpperCase();
        name = name.trim();
        */
        //Instead of using three lines, now we're using method chaining
        //Now we just need one line code.
        name = name.concat(" Galler").toUpperCase().trim();
        System.out.println(name);
    }
}
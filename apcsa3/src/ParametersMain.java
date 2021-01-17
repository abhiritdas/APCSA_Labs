public class ParametersMain {
    public static void main (String[] Args) {
        System.out.println(Parameters.getCount());
        Parameters monster1 = new Parameters();
        Parameters monster2 = new Parameters("Bob");
        Parameters monster3 = new Parameters("Sally");
        System.out.println(monster1);
        System.out.println(monster2);
        System.out.println(monster3);
    }
}
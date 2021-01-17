public class Monster {
    private String name;
    private int size;
    private int num;

    public Monster(String xname, int xsize, int xnum) {
        name = xname;
        size = xsize;
        num = xnum;
    }
    public void MonsterStore() {
            System.out.println("Monster " + num + " - " + name + " " + size);
    }

    public void compareSize(int size1, int size2) {
        if (size1 > size2) {
            System.out.println("Monster one is bigger than Monster two.");
        }
        else if (size2 > size1) {
            System.out.println("Monster one is smaller than Monster two.");
        }
        else {
            System.out.println("They are the same size.");
        }
    }
}
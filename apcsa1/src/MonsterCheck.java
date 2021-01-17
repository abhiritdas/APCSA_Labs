/* Name: Abhirit Das
Period: 3
Lab/Project: MonsterCheckLab*/

public class MonsterCheck {
    private String name;
    private int size;

    public MonsterCheck(String xname, int xsize) {
        name = xname;
        size = xsize;
    }
    public void MonsterStore() {
        System.out.println(name + " " + size);
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
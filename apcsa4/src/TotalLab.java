import java.util.ArrayList;
import java.util.Collections;
public class TotalLab {

    private static ArrayList<Integer> a1;



    public TotalLab(ArrayList<Integer> a1) {
        this.a1 = a1;
    }



    public void ListTotal() {
        int total = 0;
        for(int i = 0; i < a1.size(); i++) {
            total += a1.get(i);
        }
        System.out.println("The summed value is " + total);
    }



    public void ListSumFirst() {
        int first = a1.get(0);
        int total = 0;
        boolean yes = false;

        for(int i = 1; i < a1.size(); i++) {
            if(a1.get(i) > first) {
                total += a1.get(i);
                yes = true;
            }
        }
        if(yes)
            System.out.println(total);
        else
            System.out.println(-1);
    }



    public void ListLast() {
        int last = a1.get(a1.size()-1);
        boolean tick = false;
        for(int i = 0; i < a1.size()-1; i++) {
            if(a1.get(i) == last)
                tick = true;
        }
        System.out.println("Last value occurs more than once: " + tick);
    }



    public void ListOddtoEven() {
        int odd = 0;
        int even = 0;
        boolean check1 = false;
        boolean check2 = false;
        for(int i = 0; i < a1.size(); i++) {
            if(!check1) {
                if(a1.get(i) % 2 == 1) {
                    odd = i;
                    check1 = true;
                }
            }
            if(check1) {
                if(a1.get(i) % 2 == 0) {
                    even = i;
                    check2 = true;
                }
            }
        }
        if(check1 && check2)
            System.out.println("Distance between last even and first odd: " + (even - odd));
        else
            System.out.println(-1);
    }



    public void ListAverage() {
        int smallest = Collections.min(a1);
        int largest = Collections.max(a1);
        int total = smallest + largest;
        System.out.println(total/2);
     }


    public void ListDown() {   //not working
        boolean result = true;
        for(int i = 1; i < a1.size(); i++) {
            if(a1.size() < 2) {
                break;
            }
            while(result) {
                if(a1.get(i) > a1.get(i-1))
                    result = false;
            }
        }
        System.out.println(result);
    }



     public void ListGetNums() {
        //returns the first 3 numbers greater than 11
         ArrayList<Integer> threeList = new ArrayList<>();
         int threeCount = 0;
         for(int i = 0; i < a1.size(); i++) {
             if(threeCount < 3) {
                 if (a1.get(i) > 11) {
                     threeList.add(a1.get(i));
                     threeCount++;
                 }
             }
         }
         System.out.println("Values greater than 11: " + threeList);
     }



     public void ListGetLast() {
        int last = a1.get(a1.size()-1);
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 0; i < a1.size() - 1; i++) {
            if(a1.get(i) > last) {
                newList.add(a1.get(i));
            }
        }
         System.out.println("Values greater then the last value: " + newList);
     }


     /*public void ListNoRepeats() {
        ArrayList<Integer> tracker = new ArrayList<>();
        boolean result = true;
        while(result) {
        }

     }*/
}
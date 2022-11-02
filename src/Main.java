import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    MyList<Integer> arr=new MyList<>();
        System.out.println("Dizideki eleman sayısı: "+arr.size());
        System.out.println("Dizinin kapasitesi: "+ arr.getCapacity());
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println("Dizideki eleman sayısı: "+arr.size());
        System.out.println("Dizinin kapasitesi: "+ arr.getCapacity());
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.add(100);
        arr.add(110);
        System.out.println("Dizideki eleman sayısı: "+arr.size());
        System.out.println("Dizinin kapasitesi: "+ arr.getCapacity());
        Object[] dizi=arr.toArray();
        MyList<Integer> arr2=new MyList<>();
        System.out.println(arr.subList(0,3));

    }

}

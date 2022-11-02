import java.util.Arrays;

public class MyList<T> {
    private T[] arr;
    private Integer arrLength = 10;
    private static Integer value = 0;
    private T[] temporaryArr;


    public MyList() {
        this.arr = (T[]) new Object[this.getArrLength()];
    }

    public MyList(int arrLength) {
        this.arrLength = arrLength;
        this.arr = (T[]) new Object[arrLength];
    }

    public int size() {
        int counter = 0;
        for (T i : this.getArr()) {
            if (i != null) {
                counter++;
            }
        }
        return counter;
    }

    public void remove(int index) {
        if (index < 0 || index > this.getCapacity()) {
            System.out.println("Geçersiz değer girdiniz.");
        }
        this.getArr()[index] = null;
        for (int i = index + 1; i < this.getCapacity(); i++) {
            this.getArr()[i - 1] = this.getArr()[i];
        }
        System.out.println(index + ".index silindi");
    }

    @Override
    public String toString() {
        return "Dizi: " + Arrays.toString(this.getArr());
    }

    public void set(int index, T data) {
        if (index < 0 || index > this.getCapacity()) {
            System.out.println("Geçersiz değer girdiniz.");
        }
        this.getArr()[index] = (this.getArr()[index] = data);
    }

    public int getCapacity() {
        return this.arrLength;
    }

    public void add(T data) {
        if (size() >= getCapacity()) {
            this.temporaryArr = this.getArr();
            this.setArrLength(this.getArrLength() * 2);
            this.arr = ((T[]) new Object[this.getArrLength()]);
            this.arr = Arrays.copyOf(this.getTemporaryArr(), this.getCapacity());
        }
        this.arr[size()] = data;

    }

    public T get(int index) {
        if (index < 0 || index > this.getCapacity()) {
            return null;
        }
        return this.getArr()[index];
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.getCapacity(); i++) {
            if (this.getArr()[i] == data) {
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        for (int i=0;i<this.getCapacity();i++){
            this.getArr()[i]=null;
        }
    }
    public boolean contains(T data){
        for (int i =0 ;i<this.getCapacity();i++){
            if (this.getArr()[i]==data){
                System.out.println(data+" Listede Mevcut.");
                return true;
            }
        }
        System.out.println(data+" Listede mevcut değil.");
        return false;
    }
    public int lastIndexOf(T data){
        for (int i =this.getCapacity()-1;i>=0;i--){
            if (this.getArr()[i]==data){
                return i;
            }
        }
        return -1 ;
    }
    public T[] toArray(){
      return this.getArr();
    }
    public MyList<T> subList(int start, int finish){
        MyList<T> list=new MyList<>(finish-start);
        for (int i =start;i<finish;i++){
            list.add(this.getArr()[i]);
        }
        return list;
    }
    public boolean isEmpty() {
        int emptyCounter = 0;
        for (T i : this.getArr()) {
            if (i != null) {
                emptyCounter++;
                System.out.println("Liste Dolu.");
                break;
            }
            if (emptyCounter == 0) {
                System.out.println("Liste boş.");
                break;
            }
        }
        return false;
    }

    public static Integer getValue() {
        return value;
    }

    public static void setValue(Integer value) {
        MyList.value = value;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public Integer getArrLength() {
        return arrLength;
    }

    public void setArrLength(Integer arrLength) {
        this.arrLength = arrLength;
    }

    public T[] getTemporaryArr() {
        return temporaryArr;
    }

    public void setTemporaryArr(T[] temporaryArr) {
        this.temporaryArr = temporaryArr;
    }
}

package implementations;


public class Array {

    private Integer[] arr;
    private int len = 0;
    private int cap = 0;

    public Array() {
        arr = new Integer[10];
        cap = 10;
    }

    public Array(int cap) {
        if (cap < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + cap);
        }
        this.cap = cap;
        arr = new Integer[this.cap];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public void clear() {
        for (int i = 0; i < cap; i++) {
            arr[i] = null;
        }
        len = 0;
    }

    public void add(int num) {
        if (len == cap) {
            cap = cap * 2;
            Integer[] newArr = new Integer[cap];

            for (int i = 0; i < len; i++) {
                newArr[i] = arr[i];
            }

            len++;
            arr = newArr;
            arr[len-1] = num;
        } else {
            arr[len] = num;
            len++;
        }
    }

    public int get(int index) {
        if (index >= len) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds: " + index);
        }
        return arr[index];
    }

    public void set(int index, int num) {
        if (index >= len) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds: " + index);
        }

        arr[index] = num;
    }

    public void remove(int index) {
        if (index >= len) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds: " + index);
        }

        arr[index] = null;
        len--;
    }

}

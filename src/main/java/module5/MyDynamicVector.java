package module5;

public class MyDynamicVector<E> {
    public Object[] data = new Object[3];
    public int size = 0;

    public E getLast() {
        return (E)data[size-1];
    }

    public void add(E e) {
        if (data.length <= size) {
            Object[] tmp = data;
            data = new String[size * 2];
            for (int i = 0; i < tmp.length; i++) {
                data[i] = tmp[i];
            }
        }
        data[size] = e;
        size++;
    }


    public E get(int s) {
        return (E)data[s];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        MyDynamicVector<String> vector = new MyDynamicVector<>();
        vector.add("1");
        vector.add("2");
        vector.add("15");
        vector.add("Selenium");
        System.out.println(vector.get(3));
        System.out.println(vector.getLast());
        System.out.println(vector.size());


        MyDynamicVector<Integer> vector1 = new MyDynamicVector<>();
        vector1.add(1);
        vector1.add(3);
        vector1.add(41);
        vector1.add(Integer.parseInt("42"));
    }

}

package module5;

public class MyDynamicStringVector {

    public MyDynamicStringVector() {
    }

    public String[] data = new String[3];
    public int size = 0;

    public String getLast() {
        return data[size-1];
    }

    public void add(String s) {
        if (data.length <= size) {
            String[] tmp = data;
            data = new String[size * 2];
            for (int i = 0; i < tmp.length; i++) {
                data[i] = tmp[i];
            }
        }
        data[size] = s;
        size++;
    }


    public String get(int s) {
        return data[s];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        MyDynamicStringVector vector = new MyDynamicStringVector();
        vector.add("1");
        vector.add("2");
        vector.add("15");
        vector.add("Selenium");
        System.out.println(vector.get(3));
        System.out.println(vector.getLast());
        System.out.println(vector.size());
    }


}

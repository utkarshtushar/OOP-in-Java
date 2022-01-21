class MyData<T> {
  T i;

  public void add(T i1) {
    i = i1;
  }

  public T get() {
    return (i);
  }
}

public class Example {
  public static void main(String[] args) {
    MyData<Integer> m = new MyData<Integer>();
    MyData<String> s = new MyData<String>();
    m.add(45);
    System.out.println(m.get());
    s.add("Utkarsh");
    System.out.println(s.get());
  }
}
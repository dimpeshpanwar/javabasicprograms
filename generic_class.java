public class generic_class <T> {
    T i;
    public void add(T i1){
        i=i1;
    }
    public T get(){
        return i;
    }
    public static void main(String[] args){
        generic_class<Integer> m1=new generic_class<Integer>();
        generic_class<String> m2=new generic_class<String>();
        generic_class<Double> m3=new generic_class<Double>();
        m1.add(40);
        m2.add("abc");
        m3.add(34.789);
        System.out.println("m1="+ m1.get()+"  "+ "m2="+ m2.get()+"  "+"m3="+ m3.get());
    }
}
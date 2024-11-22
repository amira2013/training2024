public class Constructor {
    int a;
    double b;
    String st;
    char c;

    public Constructor(int u,double b,String st){
        this.a=u;
        System.out.println(a);
        System.out.println(u);
        System.out.println(this.st);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Constructor con=new Constructor(9,8.9,"Sami");
    }
}

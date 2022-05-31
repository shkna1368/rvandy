public class FunctionSample {


    public static void sum(int x,int y){
        int result=x+y;
        System.out.println("sum "+x +"+"+y+"="+result);
    }

     public static int  min(int x,int y){
      return x-y;

    }
      public static void  print(int x){
          System.out.println("value is="+x);

    }



    public static void main(String[] args) {
        sum(15,8);

     int x=min(20,15);
     print(x);

    }
}

public class printing2 {
    public static void main(String[] args) {
        int a=10;
        System.out.printf("%05d \n",a);
        
        float f=123.45f;
        System.out.printf("%.2f \n",f);
        
        String str="Java";
        System.out.printf("%20s",str); //op->                Java

    }
}

//Output
// 00010
// 123.45
//                 Java
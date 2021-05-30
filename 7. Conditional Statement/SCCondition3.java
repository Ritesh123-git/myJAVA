import java.util.*;
public class SCCondition3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a url");
        String url=sc.nextLine();

        String protocol=url.substring(0,url.indexOf(":"));

        if(protocol.equals("http"))
        {
            System.out.println("Hyper Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }

        String ext=url.substring(url.indexOf(".")+1);
        if(ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(ext.equals("org"))
        {
            System.out.println("Organization");
        }
        else if(ext.equals("net"))
        {
            System.out.println("Network");
        }



    }
}

import java.util.Scanner;

interface MyWiFi{
    void Available();
    void ConnectingWifi(String s);
    //
}
interface MyCamera{
    void TakeSnap();
    void TakeVideo();
    //Default keyword is used in the interface just to add new method and we dont have to change it in every other classes.
    default void Record4k(){
        System.out.println("Recording in 4K");
    }
}
class Phone{
    public void Call(int num){
        System.out.println("Calling : "+num);
    }
    public void Message(int num,String s){
        System.out.println("Messaging:");
        System.out.println("To:" +num);
        System.out.println("Subject: "+s);
    }
}
class Smartphone extends Phone implements MyCamera,MyWiFi{
    public void Available(){
        String [] temp={"Sanjay's Iphone","Rakesh's OnePlus","Harsh's POCOX2"};
        for(String item : temp)
        {
            System.out.println(item);
        }
    }
    public void ConnectingWifi(String s){
        System.out.println("Connecting to... "+s);
    }
    public void TakeSnap(){
        System.out.println("Taking Snap of You");
    }
    public void TakeVideo(){
        System.out.println("Taking Video");
    }

}
public class Default_in_Interface {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Smartphone Nokia=new Smartphone();
        Nokia.Available();
        Nokia.ConnectingWifi("Raaj's Phone");
        Nokia.TakeSnap();
        Nokia.Record4k();
        Nokia.TakeVideo();
        Nokia.Call(7424882);
        Nokia.Message(723234,"Let's meet at My place");
    }
}

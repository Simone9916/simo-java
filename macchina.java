

public class overloading {
    private int id;
    //fai input e chiama metodi
    public static void main(String[]args){

    }
    public overloading(int id, String desc){
        System.out.println(id + " " + desc);
    }

    public overloading(int id, String desc, String desc2){
        System.out.println(id + " " + desc + " " + desc2);
    }

    public overloading(int id, String desc1, String desc2, String desc3){
        System.out.println(id + " " + desc1 + " " + desc2 + " " + desc3);
    }
}

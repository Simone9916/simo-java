public class ciaociao {
    
    public static void main(String[]args){
        int x = (int)(Math.random()*2);
        System.out.println("valore di partenza"+x);
        numerorandom(x);

    }
    public static int numerorandom(int x){
        int y =(int)(Math.random()*2);
        if(x!=y){
            System.out.println("nuovo numero"+y);
            return y;

        }
        System.out.println("provo un altro numero");
        return numerorandom(x);
    }
}

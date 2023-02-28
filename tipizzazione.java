public class tipizzazione {
    private int radius;
    private int x;
    private int y;
 
    public tipizzazione() {
        this.x = 10;
        this.y = 10;
        this.radius = 20;
    }
 
    public tipizzazione(int radius) {
        this.radius = radius;
    }
 
    public tipizzazione(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    tipizzazione circle1 = new tipizzazione();
 
// creates a circle with R=50 and default center
tipizzazione circle2 = new tipizzazione(50);
 
// creates a circle with R=100, center(x, y) = (50, 70)
tipizzazione circle3 = new tipizzazione(100, 50, 70);
}


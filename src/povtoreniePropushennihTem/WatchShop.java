package povtoreniePropushennihTem;

public class WatchShop {
    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.model ="Swatch";
        w1.material="leather";
        w1.price=345.66;
        w1.showDate();
        w1.showTime();
        w1.tick();
    }
}

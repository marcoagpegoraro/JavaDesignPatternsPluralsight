package builder;

public class LunchOrderDemo {

    public static void main(String[] args) {
        LunchOrder lunchOrder = new LunchOrder.Builder()
                .bread("bread")
                .condiments("bread")
                .dressing("bread")
                .meat("bread")
                .build();


        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
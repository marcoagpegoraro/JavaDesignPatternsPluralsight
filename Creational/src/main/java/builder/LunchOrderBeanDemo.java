package builder;

public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("mene");
        lunchOrderBean.setCondiments("mene");
        lunchOrderBean.setDressing("mene");
        lunchOrderBean.setMeat("mene");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}

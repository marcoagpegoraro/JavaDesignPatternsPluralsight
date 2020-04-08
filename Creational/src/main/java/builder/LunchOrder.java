package builder;

public class LunchOrder {
    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){}

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder){

    }

    public static String getBread() {
        return bread;
    }

    public static String getCondiments() {
        return condiments;
    }

    public static String getDressing() {
        return dressing;
    }

    public static String getMeat() {
        return meat;
    }
}

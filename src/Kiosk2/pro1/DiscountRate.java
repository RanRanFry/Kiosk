package Kiosk2.pro1;

public enum DiscountRate {
    NationalMerit(10),
    Military(5),
    Student(3),
    None(0);

    private int rate;

    public int getRate() {
        return rate;
    }

    DiscountRate(int rate) {
        this.rate = rate;
    }



}

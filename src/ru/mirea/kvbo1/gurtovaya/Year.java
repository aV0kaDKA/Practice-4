package ru.mirea.kvbo1.gurtovaya;

public enum Year {
    WINTER(-10), SRINGS(15), SUMMER(25) {

        public String getDescrption() {
            return "Тёплое время года";
        }
    }, AUTUMN(5);
    private double sredTemp;
    Year(double sredTemp) {
        this.sredTemp= sredTemp;
    }
    public double getTemp(){
        return sredTemp;
    }
    public String getDescrption() {
        return "Холодное время года";
    }
}

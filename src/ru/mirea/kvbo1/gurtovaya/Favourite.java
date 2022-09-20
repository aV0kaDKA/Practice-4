package ru.mirea.kvbo1.gurtovaya;

public class Favourite {
    public static void main(String[] args){
        Year summ = Year.SUMMER;
        System.out.println(summ);
        print (Year.SUMMER);
        printValues();

        Year wint = Year.valueOf("Зима");
        System.out.println(wint);
    }
    public static void print(Year seasons) {
        switch (seasons) {
            case WINTER:
                System.out.println("Я люблю Зиму))");
                break;
            case SRINGS:
                System.out.println("Я люблю Весну))");
                break;
            case SUMMER:
                System.out.println("Я люблю Лето))");
                break;
            case AUTUMN:
                System.out.println("Я люблю Осень))");
                break;
        }
    }
    public static void printValues(){
        for (Year s: Year.values()){
            System.out.println(s + " " + s.getTemp() + " " + s.getDescrption());
        }
    }
}

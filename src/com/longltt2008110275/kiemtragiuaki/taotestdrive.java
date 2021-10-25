package kiemtragiuaki

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apple {
    int ID;
    float weight;
    String color;
    Scanner sc = new Scanner(System.in);
    static List<Apple> lApple = new ArrayList<>();
    public Apple(int iD, float weight, String color) {
        ID = iD;
        this.weight = weight;
        this.color = color;
    }
    Apple()
    {

    }
    
    public void menu(){
        System.out.println("==============MENU=============");
        System.out.println("=1=======Create Apple==========");
        System.out.println("=2=========Add Apple===========");
        System.out.println("=3========Find Apple===========");
        System.out.println("=4======Display Apple==========");
        System.out.println("==============EXIT=============");
    }
    public void createApple()
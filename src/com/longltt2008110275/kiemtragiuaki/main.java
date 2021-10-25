package kiemtragiuaki;

public class main {

    public static void main(String[] args){

        apple p1 = new apple(vàng)
        apple p2 = new apple(xanh)
        apple p3 = new apple(đỏ)

        //khai báo list
        list<apple> listapple = new Arraylist<apple>();

        listapple.add(p1);
        listapple.add(p2);
        listapple.add(p3);

        apple p = listapple.get(index);
        system.out.println(p.getId());

        for (apple apple : listapple){
            system.out.println(apple.getId());
        }

        for (int i=0; i<listapple.size() ; i++ ){
            system.out.println(listapple.get(i).getId());
         
        }

    }
    
}

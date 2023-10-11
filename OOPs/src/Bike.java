class Bike {
    int speedlimit = 90;

    public void display(){
        System.out.println("bike");
    }
}

class Honda3 extends Bike {
    int speedlimit = 150;
    public void display() {
        System.out.println("honda3");
    }

    public static void main(String args[]){
        Bike obj=new Honda3();
        obj.display();

    }
}

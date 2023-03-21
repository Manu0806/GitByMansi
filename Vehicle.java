class Vehicle{
void speed(){
    System.out.println("My speed is 50 km/hr");
}     
 void Horn(){
    System.out.println("blow horn plzz");
 }
 public static void  main(String args[]){
    Vehicle tvs=new Vehicle();
    tvs.speed();
    tvs.Horn();
    Animal ani=new Animal();
    ani.eat();
 }
}
class Animal{
    void eat(){
        System.out.println("i am eating");
    }
}
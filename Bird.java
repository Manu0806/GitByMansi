class Bird{
    String colour;
    int age;
    void show(String c,int a){
        this.colour=c;
        this.age=a;
    }
    void display(){
        System.out.println(colour+" "+age);
    }
    public static void main(String []args) {
        Bird sp=new Bird();
        sp.show("Blue",5);
        sp.display();
        
    }
}
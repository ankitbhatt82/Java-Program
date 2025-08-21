class Animal {
    protected void display() {
        System.out.println("I am an animal");
    }
}

class Modifier3 extends Animal {
    public static void main(String[] args) {

        Modifier3 dog = new Modifier3();
        dog.display();
    }
}
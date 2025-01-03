package vidu;

public class thecat implements Cat {

    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void play() {
        System.out.println("The domestic cat is playing with a ball of yarn.");
    }

    @Override
    public void habitat(){
        System.out.println("The cat live in a house");
    }
}


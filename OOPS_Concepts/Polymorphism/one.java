package OOPS_Concepts.Polymorphism;

interface camera {
    void useCamera();
}

interface call{
    void callMe();
}

interface playGame{
    void game();
}

class phone implements camera, call, playGame{
    @Override
    public void useCamera() {
        System.out.println("I want to use camera of your phone!");
    }

    @Override
    public void callMe() {
        System.out.println("I want to call my friend from my phone!");
    }

    @Override
    public void game() {
        System.out.println("I want to play game on your phone!");
    }
}

public class one {
    public static void main(String[] args) {
        // when user wants to do call
        call user = new phone();
        user.callMe();

        // when user want to use camera
        camera pic = new phone();
        pic.useCamera();

        // when user want to play game
        playGame play = new phone();
        play.game();

    }
}

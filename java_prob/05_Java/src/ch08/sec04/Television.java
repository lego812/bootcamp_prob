package ch08.sec04;

public class Television implements RemoteControl{
    private int volume;


    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    public void setVolume(int volume) {
        this.volume=volume;

        if(volume> RemoteControl.MAX_VOLUME){
            this.volume=RemoteControl.MAX_VOLUME;
        }
        if(volume<RemoteControl.MIN_VOLUME){
            this.volume=RemoteControl.MIN_VOLUME;
        }

        System.out.println("현재 TV 볼륨: " + this.volume);
    }


}
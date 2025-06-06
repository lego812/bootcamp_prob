package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume;


    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;

        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }

        System.out.println("현재 Audio 볼륨: "+ this.volume);
    }



}
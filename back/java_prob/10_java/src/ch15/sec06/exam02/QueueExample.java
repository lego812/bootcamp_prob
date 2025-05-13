package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue=new LinkedList<>();
        queue.add(new Message("sendMail", "홍길동"));
        queue.add(new Message("sendSMS", "신용권"));
        queue.add(new Message("sendKakaotalk", "감자바"));

        while(!queue.isEmpty()){
            Message msg=queue.poll();
            String cmd;
            if(msg.command.equals("sendMail")){
                cmd="메일을";
            }else if(msg.command.equals("sendSMS")){
                cmd="SMS를";
            }else{
                cmd="카카오톡을";
            }
            System.out.println(msg.to+"에게 "+cmd+" 보냅니다.");
        }
    }
}

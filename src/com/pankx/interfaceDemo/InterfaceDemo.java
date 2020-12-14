package com.pankx.interfaceDemo;

/**
 * 接口的使用实例
 */
public class InterfaceDemo {
    public static void main(String arg[]){
    AlarmDoor alarmDoor = new AlarmDoor();
    alarmDoor.alarm();
    alarmDoor.open();
    alarmDoor.close();

    }
}
//定义一个响铃接口
interface Siren{
    void alarm();
}


//定义一个门类
class Door{
    public void open(){
        System.out.println("开门");
    }

    public void close(){
        System.out.println("关门");
    }
}

//定义一个会响铃的门的类并继承Door类中的属性与方法并实现接口Siren
class AlarmDoor extends Door implements Siren {
    public void alarm(){
        System.out.println("门发出声音");
    }

}
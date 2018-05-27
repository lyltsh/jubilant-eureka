package com.multithread.code.chapter6.singleton7_1;

import java.io.*;

/**
 * @Description:
 * @Author: leiyulin
 * @date: 2018/5/26
 */
public class Singleton7Test {
    public static void main(String[] args) {
        try {
            SingleTon7Object object = SingleTon7Object.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("myObject.ext"));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(object);
            outputStream.close();
            fileOutputStream.close();
            System.out.println(object.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(new File("myObject.ext"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SingleTon7Object object = (SingleTon7Object)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(object.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

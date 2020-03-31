package com.wen.settest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName QueueTest
 * @Description 队列的测试
 * @Author wenBo
 * @Date 2020/3/31 12:48
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<User> q=new PriorityQueue<>(new UserComparator());
        //添加3个元素到队列
        q.offer(new User("Bob","A1"));
        q.offer(new User("Alice","A2"));
        q.offer(new User("Boss","V1"));
        System.out.println(q.poll());

    }
}
class User{
    public final String name;
    public final String number;


    User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
class UserComparator implements Comparator<User>{

    @Override
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0)==u2.number.charAt(0)){
            //如果两人的号码都是A开头或者都是V开头，比较号的大小
            return u1.number.compareTo(u2.number);
        }
        if (u1.number.charAt(0)=='V'){
            //u1的号码V开头，优先进行
            return -1;
        }else {
            return 1;
        }
    }
}

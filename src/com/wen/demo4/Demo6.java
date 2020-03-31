package com.wen.demo4; /**
 * @ClassName Demo6
 * @Description TODO
 * @Author wenBo
 * @Date 2020/3/29 1:01
 */

import java.io.DataOutputStream;
import java.util.Arrays;

/**
 *@ClassName Demo6
 *@Description 字符串和字符数组的转换
 *@Author wenBo
 *@Date 2020/3/29 1:01
 */
public class Demo6 {
    public static void main(String[] args) {
        int [] scores={88,90,68,75};
        Score s=new Score(scores);
        s.printScores();
        scores[2]=90;
        s.printScores();
    }
}
class Score{
    private int[] scores;

    public Score(int[] scores) {
        this.scores = scores;
    }
    public void printScores(){
        System.out.println(Arrays.toString(scores));
    }
}

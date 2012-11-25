package com.loser.utils;

import java.util.Random; 

   
/**
 * 随机打乱位置
 * @author loser
 * add by 2012-11-12
 */
public class RandomSort { 

    private Random random = new Random(); 

    //数组大小 

    private static final int SIZE = 10; 

    //要重排序的数组 

    private int[] positions = new int[SIZE]; 

       
    public RandomSort() { 
        for(int index=0; index<SIZE; index++) { 
            //初始化数组，以下标为元素值 
            positions[index] = index; 
        } 
        //顺序打印出数组的值 
        dwn(); 
    } 
       
    //重排序 
    public void changePosition() { 
        for(int index=SIZE-1; index>=0; index--) { 
            //从0到index处之间随机取一个值，跟index处的元素交换 
            exchange(random.nextInt(index+1), index); 
        } 
        dwn(); 
    } 
       
    //交换位置 
    private void exchange(int p1, int p2) { 
        int temp = positions[p1]; 
        positions[p1] = positions[p2]; 
        positions[p2] = temp; 
    } 
       
    //打印数组的值 
    private void dwn() { 
        for(int index=0; index<SIZE; index++) { 
            System.out.print(positions[index]+" ");          
        } 
        System.out.println(); 
    } 
   
    public static void main(String[] args) { 
        RandomSort rs = new RandomSort(); 
        rs.changePosition(); 
        rs.changePosition(); 
        rs.changePosition(); 
    } 
} 

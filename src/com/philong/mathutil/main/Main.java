/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.philong.mathutil.main;

import com.philong.mathutil.core.MathUtil;

/**
 *
 * @author philo
 */
public class Main {
    public static void main(String[] args) {
        // thử ngiệm hàm tính giai thừa coi chạy đúng thiết kế hay k
        // ta cần đưa các tình huống sd hàm trong thực tế
        // vd: -5,0,20,21,1; 
        // TEST CASE: một tình huống hàm/app/màn hình/ tính năng dc đưa vào dùng
        // TEST CASE: là một tình huống dùng,sd mà nó bao hàm data đầu vào cụ thể nào đó 
        // output đầu ra ứng với xử lí của hàm
        // kì vọng: mong hàm trả về value ứng với input ở trên 
        long expected  = 120; // kì vọng hàm đưa ra output là 120 nếu tính 5!
        int n = 5; // input 
        long actual = MathUtil.getFAactorial(n);
        System.out.println("5! = " + expected + "(expected)");
        System.out.println("5! = " + actual + "(actual)");
    }
}

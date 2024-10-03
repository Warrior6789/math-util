/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.philong.mathutil.core;

/**
 *
 * @author philo
 */
public class MathUtil {
    // hàm thư viện xài chung cho ai đó ko cần lưu lại trạng thái giá trị chọn thiết kế là hàm static
    public static long getFAactorial(int n){
        if(n < 0){
            throw new IllegalArgumentException("Invalid argument. N must be > 0");
        }
        if( n == 0 || n == 1){
            return 1;
        }
        long product = 1; // tích nhân dồn
        for (int i = 2; i <= n; i++) {
            product *=  i;
        }
        return product;
    }
}

package com.philong.mathutil.test.core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import com.philong.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author philo
 */
//chỉ chơi với junit báo hiệu sẽ cần loop qua tập data để lấy cặp data input/expected nhòi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    @Parameterized.Parameters // junit lấy data từ đây ngằm chạy qua từng dòng để lấy cặp data
    // quan trọng @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4,24},
            {5,720}
        };
    }
    // giả sử đã loop qua từng dòng của mảng, ta cần gán từng value của cột vào biến tương ứng 
    @Parameterized.Parameter(value = 0)
    public int n; //map cột 0
    @Parameterized.Parameter(value = 1)
    public long expected; //map cột 1

    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
           Assert.assertEquals(expected, MathUtil.getFAactorial(n));
    }
}
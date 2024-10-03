/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.philong.mathutil.test.core;

import com.philong.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author philo
 */
public class MathUtilTest {

    // đây là class sd hàm của thư viên/framework junit để kiểm thử/kiểm tra code chính
    //viết code để test code
    @Test
    //@test junit phối hợp jvm để chạy hàm này
    //@test phía sau hậu trường chính là public static void main()
    public void testGetFactorialGivenRightArgumentReturnWell() {
        int n = 0; //test tình huống tử tế, phải đúng
        long expected = 1; //hy vọng 0! = 1;
        long actual = MathUtil.getFAactorial(n); // gọi hàm cần test bên core
        // so sánh expected vs actual dùng framework
        Assert.assertEquals(expected, actual);
        // hàm giúp so sánh hai giá trị 
        //  giống nhau => màu xanh 
        // k giống nhau => màu đỏ 

        // thêm case hợp lệ vào 
        Assert.assertEquals(1, MathUtil.getFAactorial(1)); // tui muốn 1! ==1
        Assert.assertEquals(2, MathUtil.getFAactorial(2)); // tui muốn 2! ==2
        Assert.assertEquals(6, MathUtil.getFAactorial(3)); // tui muốn 3! ==6
        Assert.assertEquals(24, MathUtil.getFAactorial(4)); // tui muốn 4! ==24
        Assert.assertEquals(120, MathUtil.getFAactorial(5)); // tui muốn 5! ==120
        Assert.assertEquals(720, MathUtil.getFAactorial(6)); // tui muốn 6! ==720

    }
    // màu đỏ 
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFAactorial(-5); // hàm @test chạy, hay hmaf getF() chạy
//                                      // sẽ ném về ngoại lệ number...
//    }
     @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFAactorial(-5); // hàm @test chạy, hay hmaf getF() chạy
                                      // sẽ ném về ngoại lệ number...
    }
    // cách khác để bắt ngoại lệ xuất hiện viết tự nhiên hơn
    // lamda expression
    // test case: hàm ném ngoại lệ nếu nhập -1 
    // cần màu xanh khi dùng -1
     @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
         Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFAactorial(-1));
    }
    @Test
     public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
         try {
            MathUtil.getFAactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be > 0",e.getMessage());
        }
    }
}

/**
 * @author: chende
 * @date: 2019/10/29 21:50
 * @description: https://leetcode.com/problems/divide-two-integers/

Given two integers dividend and divisor,
divide two integers without using multiplication, division and mod operator.
Return the quotient after dividing dividend by divisor.
The integer division should truncate toward zero.

Example 1:
Input: dividend = 10, divisor = 3
Output: 3

Example 2:
Input: dividend = 7, divisor = -3
Output: -2
 */
public class n0029_DivideTwoIntegers {

    public  boolean changeBool(boolean f){
        if (f)
            return false;
        else
            return true;
    }

    public int divide(int dividend, int divisor) {
        boolean cop=true;
        if (dividend<0) { cop=changeBool(cop);   }
        if (divisor<0) {  cop=changeBool(cop); }
        int res=0;
        int change=cop==true?1:-1;
        while(  true ){}


    }
}

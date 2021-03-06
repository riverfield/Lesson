import java.util.*;
import java.lang.*;
import java.io.*;

class NewtonMethod
{
    double f(double x)
    {
        return x*x - 4;
    }
 
    double df(double x)
    {
        return 2*x;
    }
 
    double calc(double a, double eps)
    {
        int i=0;
        double ah = 0;
 
        while(i<1000) {
            i++;
            ah = a - f(a)/df(a);
            // 収束条件を満たせばループ終了
            if(Math.abs(ah - a)<eps) break;
            a = ah;
        }
        return ah; 
    }
 
	public static void main (String[] args) throws java.lang.Exception
	{
	    NewtonMethod nm = new NewtonMethod();
	    // 解を計算(初期値, 収束条件)
	    double ah = nm.calc(1.0, 0.0001);
            // 結果表示
            System.out.printf("解：%f\n", ah); // 解：2.000000
	}
}

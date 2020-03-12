package _courses.imooc.algorithmic_interview.Time_Complexity.Basic;

/**
 * Description:递归调用会有额外的空间开销
 *
 * @date: 2019/1/20 16:31
 */
public class Main2 {

    private static int sum1(int n){

        assert n >= 0;
        int ret = 0;
        for( int i = 0 ; i <= n ; i ++ )
            ret += i;
        return ret;
    }

    private static int sum2(int n){

        assert n >= 0;
        if( n == 0 )
            return 0;

        return n + sum2(n-1);
    }

    public static void main(String[] args) {

        System.out.println(sum1(10000));
        System.out.println(sum2(10000));
    }
}

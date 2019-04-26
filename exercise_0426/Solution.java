package exercise.exercise_0426;


//抽象建模能力
/*
孩子们的游戏(圆圈中最后剩下的数)
题目描述
每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,
并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 */

/*
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0 || m <= 0){
            return -1;
        }
        int d = 0;
        for(int i=2; i<=n; i++){
            d = (d+m)%i;
        }
        return d;
    }
}*/

/*
扑克牌顺子
题目描述
LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,
嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,
他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,
然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 */

/*
import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length == 0 || numbers == null){
            return false;
        }
        Arrays.sort(numbers);
        int count = 0;//大小王的计数
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 0){
                count++;
            }else{
                break;
            }
        }
        //0,2,3,4,6
        if(count == numbers.length||count == numbers.length-1){
            return true;
        }
        for(int i=count+1; i<numbers.length; i++){
            int tmp = numbers[i]-numbers[i-1];
            if(tmp == 0 || tmp-1 >count){
                return false;
            }else{
                count -= tmp-1;
            }
        }
        return count==0;
    }
}
*/

//发散思维能力
/*
求1+2+3+...+n
题目描述
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
/*
public class Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n>0)&&((sum += Sum_Solution(n-1))>0);
        return sum;
    }
}
*/

/*
不用加减乘除做加法
题目描述
写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Solution {
    public int Add(int num1,int num2) {
        while(num2 !=0){
            int sum = num1^num2;
            int carry = (num1&num2)<<1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
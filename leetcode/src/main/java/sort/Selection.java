package sort;

import org.junit.Test;

/**
 * 选择排序（Selection Sort）
 *
 * 选择排序(Selection-sort)是一种简单直观的排序算法。
 * 它的工作原理：首先在未排序序列中找到最小（大）元素，
 * 存放到排序序列的起始位置，然后，
 * 再从剩余未排序元素中继续寻找最小（大）元素，
 * 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 *
 * n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
 *     初始状态：无序区为R[1..n]，有序区为空；
 *     第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。
 *     该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，
 *     使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
 *     n-1趟结束，数组有序化了。
 *
 */
public class Selection {

    //直接找最大或者最小的数，放到相应的位置
    //循环次数（n-1）*n/2,求对数之后，时间复杂度为
//    @Test
    public void test(){
        int[] arr = {4,8,9,10,1,39,90,20,2,38};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i :arr){
            System.out.print(i+",");
        }
    }
    @Test
    public void test1(){
        int[] arr = {4,8,9,10,1,39,90,20,2,38};
        for(int i=0;i<arr.length-1;i++){
            int  mini = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mini]>arr[j]){
                  mini=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        for(int i :arr){
            System.out.print(i+",");
        }
    }
}

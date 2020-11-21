package sort;

import org.junit.Test;

/**
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，
 * 一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 *比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 *对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 *针对所有的元素重复以上的步骤，除了最后一个；
 *重复步骤1~3，直到排序完成。
 */
public class Bubbling {



    public static void main(String[] args) {
        int[] arr = {4,8,9,10,1,39,90,20,2,38};
        for(int i=0;i<arr.length-1;i++){
          for(int j=0;j<arr.length-1-i;j++){
              if(arr[j] > arr[j+1]){
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = temp;
              }
          }
        }
        for(int i : arr){
            System.out.print(i+",");
        }

    }

   //  冒泡排序循环次数（n-1）*n/2,(n^2-n)，对它求对数，可以得出冒泡排序时间复杂度为n
//   @Test
   public  void test() {
        int[] arr = {10,8,29,74,39,50,72,47,91,30};
        for(int i=0;i<arr.length-1;i++){
            int j=0;
            while(j<arr.length-1-i){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    //冒泡排序：降序
    @Test
    public void test3(){
        int[] arr = {10,8,29,74,39,50,72,47,91,30};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+",");
        }
    }
}

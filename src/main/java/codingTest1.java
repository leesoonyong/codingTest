public class codingTest1 {
    /* 피보나치 수열 */


    public static void main(String[] args) {
        fibo(99);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static int[] arr = new int[100];


    public void  solution(int n) {
        int prevPrevNum = 1;
        int prevNum = 1;

        for (int i =3; i < 100; i++){
            int curNum = prevPrevNum + prevNum;
            System.out.println(curNum + " ");

            prevPrevNum = prevNum;
            prevNum = curNum;
        }
    }


    public static int fibo(int k) {
        if(arr[k] != 0){
            //이미 계산한 값
        }else {
            //처음 계산한값
            if(k <= 2){
                arr[k] = 1;
            }else{
                //3번째 항부터는 계산
                arr[k] = fibo(k -1) + fibo(k -2);
            }
        }
        return arr[k];
    }
}

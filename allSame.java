public class allSame {

    public static boolean r(int[] arr) {
        for (int i = 0; i < (arr.length) - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=3;
        arr[2]=-1;
//        arr[3]=3;arr[4]=3;

        boolean p=r(arr);
        if(p==true)System.out.printf("True\n");
        if(p==false)System.out.printf("False\n");
    }
}

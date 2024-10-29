import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        if (n == 0){
            return new int[0];
        }
        else
        {
            int [] arr = new int[n];
            int numOfNarcsFound = 0;
            int i = 10;
            int len = 0;
            int div = 0;
            int temp = 0;
            int numSum = 0;
            while(numOfNarcsFound < n)
            {
                numSum = 0;
                div = 10;
                len = numLen(i);
                temp = i;
                for(int j = 0; j < len; j++){
                   numSum += (int) Math.pow((temp % div), len);
                    temp /= 10;
                }
                if(numSum == i){
                    arr[numOfNarcsFound] = i;
                    numOfNarcsFound++;
                }
                i++;
            }
            return arr;
        }

    }

    public static int numLen(int n){
        int len = 0;
        int num = 10;
        while(n > 0){
            len++;
            n = n - (n % num);
            num *= 10;
        }
        return len;
    }

}
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
        if(n==0){
            return new int[0];
        }
        else{
            int[] arr=new int[n];
            int length=0;
            int number=10;
            int numOfNarcsFound=0;
            int numSum=0;
            while(numOfNarcsFound < n){
                length=numLength(number);
                numSum=0;
                int temp=number;
                for(int i =0 ; i<length ; i++){
                    numSum += (int) Math.pow((temp%10),length);
                    temp/=10;
                }
                if(numSum==number){
                    arr[numOfNarcsFound]=number;
                    numOfNarcsFound++;
                }
                number++;
            }
            return arr;
        }

    }
    public static int numLength(int number){
        String str = Integer.toString(number);
        return str.length();

    }

}
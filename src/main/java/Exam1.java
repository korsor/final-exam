/**
 * Created by tapakorn.w on 8/4/2017.
 */
public class Exam1 {

    public void main(String[] args) {
        long a = 653161544328834085L;
        long output = solution(a);
    }

    public long solution(long input) {
        long output = input;
        char[] longString = new Long(input).toString().toCharArray();
        int size = longString.length;
        boolean newValue = false;

        for (int i = 0; i < size - 1; i++) {
            if (longString[i] > longString[i + 1]) {
                if(longString[i] == '1'){
                    char[] newLong = new char[size-1];
                    for (int j = 0; j < size-1; j++) {
                        newLong[j] = '9';
                    }
                    System.out.println("new"+newLong);
                    output = solution(Long.parseLong(String.valueOf(newLong)));
                    System.out.println("out"+output);
                    newValue = true;
                    break;
                }
                else{
                    longString[i] -= 1;

                    for (int j = i + 1; j < size; j++) {
                        longString[j] = '9';
                    }
                    i = i - 1;
                }
            }
        }
        if(!newValue)output = Long.parseLong(String.valueOf(longString));
        return output;
    }

}

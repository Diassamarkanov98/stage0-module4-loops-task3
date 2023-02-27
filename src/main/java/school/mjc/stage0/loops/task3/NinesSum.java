package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber < 0){
            System.out.println(0);
        } else {
            int ten_pow = 1;
            int result = 0;
            for(int i = 1; i <= lengthOfLastNumber; i++){
                ten_pow *= 10;
                result += ten_pow ;
            }
            result -= lengthOfLastNumber;
            System.out.println(result);
        }
    }
}

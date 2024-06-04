public class Main {
    public static void main(String[] args) {
        //задание 1
        int[] payments = {30, 50, 60, 70, 80};
        int paymentsSumma = 0;
        for (int i = 0; i < payments.length; i++) {
            paymentsSumma = paymentsSumma + payments[i];
        }
        System.out.println("сумма трат за месяц составила" + paymentsSumma + "рублей.");




        //задание 2
        long[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 1};
        long minWeight = 1000000000;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] < minWeight) {
                minWeight = weights[i];
            }
        }
        System.out.println(minWeight);


//задание 3
        int[] oneWeekPlan= {10,20,30,40,50};
        float averageValue=0;
        int numberWeeks = 5;
        for (int i = 0; i < oneWeekPlan.length; i++) {
            averageValue = (averageValue + oneWeekPlan[i]);
        }
        averageValue =  averageValue/numberWeeks;
        System.out.println(averageValue);
        //задание4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i>=0;i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}
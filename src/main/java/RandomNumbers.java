import java.util.ArrayList;

public class RandomNumbers {
    private int length = 3;
    private ArrayList<Integer> numbers = new ArrayList<>(3);
    private int min = 1;
    private int max = 10;

    public RandomNumbers() {
        this.numbers = this.generateRandomNumbers();
    }
    public ArrayList<Integer> generateRandomNumbers(){
        ArrayList<Integer> randomNumbers = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            Integer num = generateNonDuplicateNumber();
            randomNumbers.add(num);
        }
        return randomNumbers;
    }

    private Integer generateNonDuplicateNumber() {
        Integer num = this.getRandomInt();
        while (this.numbers.contains(num)) {
            num = this.getRandomInt();
            System.out.println(this.numbers.contains(num));
        }
        return num;
    }

    private Integer getRandomInt(){
        return (int) (Math.random()*(max-min)) + min;
    }

    public ArrayList<Integer> compare(ArrayList<Integer> input){
        int strike =0;
        int ball = 0;
        for(int i =0;i<this.length;i++){
            if(!this.numbers.contains(input.get(i))) {
                continue;
            }
            if(this.numbers.get(i).equals(input.get(i))){
                strike += 1;
                continue;
           }
            ball += 1;
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(strike);
        result.add(ball);
        return result;
    }
}
import java.util.ArrayList;

public class RandomNumbers {
    public ArrayList<Integer> numbers;

    public RandomNumbers() {
        this.numbers = this.generateRandomNumbers();
    }
    public ArrayList<Integer> generateRandomNumbers(){
        ArrayList<Integer> randomNumbers = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            Integer num = generateNonDuplicateNumber(randomNumbers);
            randomNumbers.add(num);
        }
        return randomNumbers;
    }

    private Integer generateNonDuplicateNumber(ArrayList<Integer> randomNumbers) {
        Integer num = this.getRandomInt();
        while (randomNumbers.contains(num)) {
            num = this.getRandomInt();
        }
        return num;
    }

    private Integer getRandomInt(){
        int min = 1;
        int max = 10;
        return (int) (Math.random()*(max - min)) + min;
    }

    public ArrayList<Integer> compare(ArrayList<Integer> input){
        int strike =0;
        int ball = 0;
        int length = 3;
        for(int i = 0; i< length; i++){
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
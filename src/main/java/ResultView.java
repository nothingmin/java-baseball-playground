import java.util.ArrayList;

public class ResultView {
    private ArrayList<Integer> result;

    public void printResult(ArrayList<Integer> result){
        Integer strike = result.get(0);
        Integer ball = result.get(1);
        String resultView = "";
        if(ball != 0){
            resultView = ball + "볼 ";
        }
        if(strike != 0){
            resultView = resultView + strike + "스트라이크";
        }
        resultView = resultView + "\n";
        System.out.println(resultView);
    }
}

import java.io.Console;
import java.util.Arrays;

public class DotProduct {
    public static void main(String[] args) {

        Console cons = System.console();

        String initialInput = cons.readLine("Input no. of rows & columns: ");
        String[] inputs = initialInput.split(" ", 2);
        int rows = Integer.parseInt(inputs[0]);
        int cols = Integer.parseInt(inputs[1]);
        System.out.println("no. of rows: " + rows + ", no. of cols: " + cols);

        int[][] data = new int[rows][cols];
        int[] weights = new int[cols];
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            String numbersInput = cons.readLine("Enter the first row of " + cols + " numbers, separated by space: ");
            String[] numbers = numbersInput.split(" ");
            System.out.println(Arrays.toString(numbers));

            //The part I failed to code
            for (int j = 0; j < cols; j++) {
                data[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        //Get weights
        String weightsInput = cons.readLine("Enter " + cols + " weights, separated by space: ");
        String[] wts = weightsInput.split(" ");
        for (int i = 0; i < cols; i++) {
            weights[i] = Integer.parseInt(wts[i]);
        }

        //Perform dot product calculation
        for (int i = 0; i < rows; i++){
            int total = 0;
            for (int j = 0; j < cols; j++) {
                total += data[i][j] * weights[j];
            }
            result[i] = total;
        }

        //Print result
        for (int i = 0; i < rows; i++){
            System.out.println("Result (Row " + i + "): " + result[i]);
        }
    }
    
}

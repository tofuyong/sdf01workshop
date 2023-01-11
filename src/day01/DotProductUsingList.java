import java.io.Console;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DotProductUsingList {
    public static void main(String[] args) {
        
        Console cons = System.console();

        String initialInput = cons.readLine("Input no. of rows & columns: ");
        String[] inputs = initialInput.split(" ", 2);
        int rows = Integer.parseInt(inputs[0]);
        int cols = Integer.parseInt(inputs[1]);
        System.out.println("no. of rows: " + rows + ", no. of cols: " + cols);

        List <List<Integer>> matrix = new LinkedList<>();
        List <Integer> weights = new LinkedList<>();
        List <Integer> results = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            String numbersInput = cons.readLine("Enter the first row of " + cols + " numbers, separated by space: ");
            String[] numbers = numbersInput.split(" ");
            System.out.println(Arrays.toString(numbers));

            //Store data as list
            List<Integer> rowData = new LinkedList<>();
            for (int j = 0; j < cols; j++) {
                rowData.add(Integer.parseInt(numbers[j]));
            }
            matrix.add(rowData);
            System.out.println(matrix);
        }

        //Get weights
        String weightsInput = cons.readLine("Enter " + cols + " weights, separated by space: ");
        String[] wts = weightsInput.split(" ");
        for (int i = 0; i < cols; i++) {
            weights.add(Integer.parseInt(wts[i]));
        }

        //Perform dot product calculation
        for (int i = 0; i < rows; i++){
            int total = 0;
            for (int j = 0; j < cols; j++) {
                total += matrix.get(i).get(j) * weights.get(j);
            }
            results.add(total);
        }
        System.out.println("Final result: " + results);
    }
}

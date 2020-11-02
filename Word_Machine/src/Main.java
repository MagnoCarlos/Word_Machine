import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String file = "/Volumes/PC/ProjectsProgramming/LearningJava/Problems/Word_Machine/input.txt";
        String line;
        // Creating a Stack
        Stack<Integer> stackOfNum = new Stack<>();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        Main check_Int = new Main();

//change the while to do-while
        while (true) { // loop to separate and get each inputs

            // read next line
            line = reader.readLine();
            System.out.println("whole line: " + line);
            if(line == null) { // condition to break the loop
                break;
            }
            System.out.println("New Stack Machine");
            String [] arrSplit = line.split(" ");
            for (int i = 0; i < arrSplit.length; i++) {
                if(check_Int.Is_Number(arrSplit[i])) {
                    int num = Integer.parseInt(arrSplit[i]);
                    System.out.println("PUSH => " + num);
                    stackOfNum.push(num);
                    System.out.println("Current Stack => " + stackOfNum);
                } else {
                    // Add repetition to request the input again
                }
                try {
                    switch (arrSplit[i]) {
                        case "DUP":
                            System.out.println("DUP => " + stackOfNum.peek());
                            stackOfNum.push(stackOfNum.peek());
                            System.out.println("Current Stack => " + stackOfNum);
                            break;
                        case "POP":
                            System.out.println("POP => " + stackOfNum.peek());
                            stackOfNum.pop();
                            System.out.println("Current Stack => " + stackOfNum);
                            break;
                        case "+":
                            System.out.println("+");
                            int last_pop = stackOfNum.pop();
                            int result = last_pop + stackOfNum.pop();
                            stackOfNum.push(result);
                            System.out.println("Current Stack => " + stackOfNum);
                            break;
                        case "-":
                            System.out.println("-");
                            int last_popsub = stackOfNum.pop();
                            int result_sub = last_popsub - stackOfNum.pop();
                            stackOfNum.push(result_sub);
                            System.out.println("Current Stack => " + stackOfNum);
                            break;

                    }
                } catch (EmptyStackException e) {
                    System.out.println(e);
                }
            }

        }

    } //main

    public boolean Is_Number(String line) {

        try {
            Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    } //Is_Number

}

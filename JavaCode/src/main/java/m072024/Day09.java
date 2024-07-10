package m072024;

import java.util.Stack;

public class Day09 {
    /* 1598:
    You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
    The file system starts in the main folder, then the operations in logs are performed.
    Return the minimum number of operations needed to go back to the main folder after the change folder operations. */
    public static int minOperationsCounter(String[] logs) {
        int folderDepth = 0;
        for (String currentOperation : logs) {
            if (currentOperation.equals("../")) {
                folderDepth = Math.max(0, folderDepth - 1);
            } else if (!currentOperation.equals("./")) {
                folderDepth += 1;
            }
            System.out.println("Before: " + currentOperation + "index: " + folderDepth);
        }
        return folderDepth;
    }

    public static int minOperationStack(String[] logs) {

        Stack<String> folderStack = new Stack<>();

        for (String currentOperation : logs) {
            if (currentOperation.equals("../")) {
                if(!folderStack.isEmpty()){
                    folderStack.pop();
                }
            } else if (!currentOperation.equals("./")) {
                folderStack.push(currentOperation);
            }
            System.out.println("Before: " + currentOperation + "index: " + folderStack);
        }
        return folderStack.size();
    }

}

package m072024;


public class Day04 {

    /* You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
       For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
       Return the head of the modified linked list.*/

    public static ListNode mergeNodes(ListNode head) {

        ListNode modify = head.next;
        ListNode nextSum = modify;

        // Initialize a sentinel/dummy node with the first non-zero value.
        while (nextSum != null) {
            int sum = 0;

            // Find the sum of all nodes until you encounter a 0.
            while (nextSum.val != 0) {
                sum += nextSum.val;
                nextSum = nextSum.next;
            }
            // Assign the sum to the current node's value.
            modify.val = sum;

            // Move nextSum to the first non-zero value of the next block.
            nextSum = nextSum.next;
            if (nextSum != null) {
                // Move modify also to this node.
                modify.next = nextSum;
                modify = modify.next;
            } else {
                modify.next = null;
            }


        }


        return head.next;

    }

    public class ListNode {
        private int val;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1, new ListNode(3, new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0, new ListNode(4, new ListNode(0))))))));

        // Merge nodes
        ListNode modifiedHead = mergeNodes(head);

        // Print the modified linked list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }


    }

}

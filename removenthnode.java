 public static ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode temp_head=head;

        int count=0;
        while(temp_head!=null){
            count++;
            temp_head = temp_head.next;
        }


        if (n == count) {
            head=head.next;
            return head;
        }

        else {
            int pos = count - n;
            ListNode temp_head_2 = head;

            while (pos != 1) {
                temp_head_2 = temp_head_2.next;
                pos--;
            }

            temp_head_2.next = temp_head_2.next.next;
        }

        return head;

    }

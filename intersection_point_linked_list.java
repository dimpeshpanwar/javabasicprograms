// Intersection Point in Y Shaped Linked Lists
// Problem Link: https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

// Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

//  Example 1:

// Input:
// LinkList1 = 3->6->9->common
// LinkList2 = 10->common
// common = 15->30->NULL
// Output: 15
  
class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int size1=0;
         int size2=0;
         Node temp1=head1;
         Node temp2=head2;
         while(temp1!=null){
             size1++;
             temp1=temp1.next;
         }
         
         while(temp2!=null){
             size2++;
             temp2=temp2.next;
         }
         
         int delta=Math.abs(size1-size2);
         if(size1>size2){
             
             for(int i=0;i<delta;i++){
                 head1=head1.next;
             }
             
         }else{
              for(int i=0;i<delta;i++){
                 head2=head2.next;
             }
         }
         
         while(head1!=head2){
             head1=head1.next;
             head2=head2.next;
         }
            if(head1!=null)
            return head1.data;
            else
            return -1;
         
	}
	
}

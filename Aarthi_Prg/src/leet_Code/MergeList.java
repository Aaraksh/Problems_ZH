package leet_Code;

public class MergeList
{

	public class ListNode
	{
		     int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode n1=new ListNode();
        ListNode n2=new ListNode();
        n2=n1;
        while(l1!=null && l2!=null)
        {
            if(l1.val == l2.val)
            {
                n1.val=l1.val;
                n1=n1.next;
                n1.val=l2.val;
                n1=n1.next;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1.val<l2.val)
            {
                n1.val=l1.val;
                n1=n1.next;
                l1=l1.next;
            }
            else if(l2.val<l1.val)
            {
                n1.val=l2.val;
                n1=n1.next;
                l2=l2.next;
            }
        }
        while(l1!=null)
        {
            n1.val=l1.val;
            n1=n1.next;
            l1=l1.next;
            
        }
        while(l1!=null)
        {
            n1.val=l2.val;
            n1=n1.next;
            l2=l2.next;
        }
        n2=n1;
        return n2;
    }
	public static void main(String[] args) 
	{
		

	}

}

e second = head;
        
        while(second != null && second.next != null){
          // using 
            first = first.next;
            second = second.next.next;
            
            if(first == second){
                return first;
            }
        }
        return null; 
    }
    
    
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode intersect = intersection(head);
      
        if(intersect == null){
            return null;
        }
      
        ListNode start = head;
        while(intersect != start){
            start = start.next;
            intersect = intersect.next;
        }
        return start;
    }
    
}

 public int nextNode(int value) {

    if(isEmpty())
      throw new NoSuchElementException();
    if(size()==1)
       throw new NoSuchElementException();

    else {
        if(getIndex(value)==-1) 
            throw new NoSuchElementException();
        if(value==tail.value)
           throw new NoSuchElementException("next node is not available because entering value is tail node value");
              
       else {
        Node current=head;
        int nextValue=head.next.value;
        while(current!=tail) {

            if(current.value==value) {
                  return nextValue;
            }
            
            current=current.next;
            nextValue=current.next.value;           
        }
              
    }     
    
   }
   return 0;
}

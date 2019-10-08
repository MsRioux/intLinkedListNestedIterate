public class IntLinkedList
{
    //variables
    private Node head;
    private Node current; //
    private Node previous; //

    //constructors
    public IntLinkedList()
    {
        head = null;
        current = head; //
        previous = head; //
    }//end head constructor

    public void addANodeToStart(int addData)
    {
        head = new Node(addData, head);
    }//end add to start method

    //delete
    public void deleteANodeFromStart()
    {
        if (head != null)
        {
            head = head.getLink();
        }//end if head not null
        else
        {
            System.out.println("Deleting from an empty list");
            System.exit(0);
        }//end else
    }//end delete Node

    //length
    public int length()
    {
        int count = 0;
        Node position = head;
        while (position  != null)
        {
            count++;
            position = position.getLink();

        }//end while

        return count;
    }//end length method

    //hasNext
    public boolean hasNext()
    {
        if(current.link != null) //
        {
            return true;
        }
        return false;
    }//end method hasNext

    /*add for iteration     */

    public void goToNext()
    {
        if (current != null)
        {
            previous = current;
            current = current.link;
        }
        else if (head != null)
        {
            System.out.println("Iteration reached end of line");
            System.exit(0);
        }
        else
        {
            System.out.println("You can't iterate an empty list");
            System.exit(0);
        }
    }//end method goToNext
    public void resetIteration()
    {
        current = head;
        previous = null;
    }//end method resetIteration

    public int getDataAtNode()
    {
        int result = -1;
        if (current != null)
            result = current.data;
        else
            System.out.println("You can't get blood from a turnip");
        return result;
    }//end method getData

    //setData

    public void showList()
    {
        Node position =  head;
        while (position != null)
        {
            System.out.println(position.data);
            position = position.link;
        }
    }//end method showList


    private class Node
    {
        //instance variables
        private int data;
        private Node link;
        //constructor
        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }//end Node constructor

        //getters & setters

        //toString
        public String toString()
        {
            return "data: " + data + " links to: " + link;
        }//end toString

        public int getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }
    }// end class Node
}//end public class List
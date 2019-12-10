class Stack{
    int stackPointer= 0;
    String[] stack;
    int size; 


    public Stack(String[] data)
    {
        stack = data;
        size= data.length;
    }

    public String top()
    {   
        String t;
        if(stackPointer < size)
        {
            t  = stack[stackPointer];
            stackPointer++;
        }else
        {
            t="Stack Empty!";
        }
        return t;
    }
}
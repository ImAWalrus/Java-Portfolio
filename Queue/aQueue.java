
import java.util.*;
class aQueue{
	ArrayList<Integer> q ;//ArrayList

	public aQueue(){
		q = new ArrayList<Integer>();
		
	}
	public void enqueue(int item){ //Method used for inserting elements
		q.add(item);

	}
	public int dequeue(){ //Dequeueing elements
		int tmp= q.get(q.size() - 1);
		q.remove(0);
		return tmp;
	}
	public boolean isEmpty(){ //Return empty
		if (q.size() == 0){
			return true;
		}else{
			return false;		
		}
	}
	public Object peek(){ //Check FIFO
		return q.get(0);
	}
	public int getCap(){//Get Capacity of ArrayList
		return q.size();
	}
	public void print(){//Print Statment
		for(int i = 0; i < q.size(); i++){
			System.out.println(q.get(i));
		}
	}
	public static void main(String[] args){
		aQueue queue1 = new aQueue();
		
		queue1.enqueue(1);//Elements inside ArrayList
		queue1.enqueue(2);
		queue1.enqueue(3);
		queue1.enqueue(4);
		queue1.enqueue(5);
		
		queue1.print();

		while( queue1.getCap() != 0){ //Dequeue 
			queue1.dequeue();
		}
		if(queue1.getCap() == 0) //Check 		
			System.out.println("Empty");
		else
			System.out.println("FULL");
		}
}	
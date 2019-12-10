import java.util.*;
class errorHandling{
	int[] data;
	int NUM_ITEMS;

	public void loadData(int[] initialData){
		NUM_ITEMS = initialData.length;
		data = new int[initialData.length + initialData.length / 2];
		for(int i = 0; i < initialData.length; i++){
			data[i] = initialData[i];
		}
	}

	public int find(int q){
		int high = NUM_ITEMS - 1;
		int middle = 0;
		int low = 0;
		while(low <= high){
			middle = (low + high) / 2;
				if(data[middle] > q){
					high = middle -1;
				}else if(data[middle] < q){
					low = middle + 1;
				}else{
					return middle;
				}
			}
		return -1; 
	}

	public int sort(){
		int count = 0;
		int temp = 0;
		for(int last = NUM_ITEMS - 1; last > 0; last--){
			int maxNum = 0;
			for(int i = 1; i <= last; i++){
				if(data[i] > data[maxNum]){
					maxNum = i;
				}
			}
			if(maxNum != last){
				temp = data[maxNum]; 
		      	data[maxNum] = data[last];
		      	data[last] = temp;
		      	count++;
	      	}
		}
		return count;
	}

	public int insert(int newItem){
		int tempLoc = NUM_ITEMS - 1;
		while(tempLoc >= 0 && data[tempLoc] > newItem){
			data[tempLoc + 1] = data[tempLoc];
			tempLoc = tempLoc - 1;
		}
		data[tempLoc + 1] = newItem;
		NUM_ITEMS++;
		return NUM_ITEMS;	
	} 

	public int getCapacity(){
		return data.length;
	}

	public int getNumItems(){
		int elementLoc = 0;
		for(int i : data){
			if(i != 0)
				elementLoc++;
		}
		return elementLoc;
	}	

	public int getEmptyLocations(){ 
		int emptyLoc = 0;
		for( int i : data){
			if(i == 0 )
				emptyLoc++;
		}
		return emptyLoc;
	}	

	public void print(){
		for(int i : data)
			System.out.println(i);
	}
	public static void main(String[] args) {
		int query;
		int result= -1;
		double relevance;
		int[] rands = { 49, 22, 21, 65, 19, 2, 25, 90, 7, 2411 };

		errorHandling points = new errorHandling();
		//**********************************************
		try{
		result = points.getNumItems();
		}catch(Exception e){
			System.out.println("EXCEPTION****DETECTED!!!!");
			points.loadData(rands);
			result = 0;
		}
		//**********************************************		
		if (result == 0) {
			System.out.println("TEST 0 PASSED. NUMBER OF ITEMS IN points DATA SHOULD BE ==> " + result);
			
		} else {
			System.out.println("TEST 0 FAILED. NUMBER OF ITEMS IN points DATA IS NOT ==> " + result);
		}
	
		result = points.getCapacity();
				
		if (result == 15) {
			System.out.println("TEST 1 PASSED. CAPACITY OF points DATA IS NOW ==> " + result);
		} else {
			System.out.println("TEST 1 FAILED. CAPACITY OF points DATA IS NOT ==> " + result);
		}

		System.out.println();
		points.print();
		System.out.println();
		
		result = points.sort();
		
		if (result == 7) {
			System.out.println("TEST 2 PASSED. SELECTION SORT # OF EXHANGES ==> " + result);
		} else {
			System.out.println("TEST 2 FAILED. SELECTION SORT # OF EXCHANGES ==> " + result);
		}
		
		query = 65;
		result = points.find(query);

		if (result == 7) {
			System.out.println("TEST 3 PASSED. SELECTION SORT ==> (list sorted) " + query + " at index " + result);
		} else {
			System.out.println("TEST 3 FAILED. SELECTION SORT ==> (list not sorted) " + query + " not at index " + result);
		}

		query = 77;
		result = points.find(query);
		if (result < 0) {
			System.out.println("TEST 4 PASSED. (" + query + " not found) ==> " + result);
		} else {
			System.out.println("TEST 4 FAILED. ==> " + result);
		}

		query = 19;
		result = points.find(query);
		if (result == 2) {
			System.out.println("TEST 5 PASSED. ==> " + query + " at index " + result);
		} else {
			System.out.println("TEST 5 FAILED. ==> "  + query + " not at index " + result);
		}

		query = 2411;
		result = points.find(query);
		if (result == 9) {
			System.out.println("TEST 6 PASSED. ==> " + query + " at index " + result);
		} else {
			System.out.println("TEST 6 FAILED. ==> "  + query + " not at index " + result);
		}

		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter an integer item to insert. (Entering 2410 should result in successful tests.)\n# ==> ");
		//**********************************************
		int item = 0;
		int temp = 0;
		//boolean done = false;	
		do{	
			try{
				item = scnr.nextInt();
				temp = 1;
				//done = true;
			}
			catch(Exception e){
				System.out.println("INPUT EXCEPTION, TRY AGAIN: ");
				scnr.nextLine();
			}
		//}while(!done);
		}while(temp == 0);
		//**********************************************
		result = points.insert(item);

		if (result == 11) {
			System.out.println("TEST 7 PASSED. ==> NUMBER OF ITEMS IN points DATA WAS INCREASED TO " + result);
		} else {
			System.out.println("TEST 7 FAILED. ==> NUMBER OF ITEMS IN points DATA IS NOT " + result);
		}

		result = points.find(item);
		if (result == 9) {
			System.out.println("TEST 8 PASSED. INSERTION ==> " + item + " at index " + result);
		} else {
			System.out.println("TEST 8 FAILED. INSERTION ==> "  + item + " not at index " + result);
		}

		result = points.getEmptyLocations();
		if (result == 4) {
			System.out.println("TEST 9 PASSED. NUMBER OF EMPTY LOCATIONS NOW ==> " + result + "\n");
		} else {
			System.out.println("TEST 9 FAILED. NUMBER OF EMPTY LOCATIONS IS NOT  ==> "  + result + "\n");
		}
		System.out.println();
		points.print();
	}
}
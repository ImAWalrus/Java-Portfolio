class sortAlgorithms{

	int data[] = new data[100];

	public sortAlgorithms(){

	}

	public void loadData(int[] initialData){
		for(int i = 0; i < initialData; i++){
			data[i] = initialData[i];
		}

	}

	public int find(int q){
		for(int i = 0; i < data.length; i++){
			if(data[i] == q)
				return i;
		}
		return -1;
	}


	public double findrelevance(int q){
		int count = 0;
			for(int cinnamonRolls = 0; cinnamonRolls < d.length; cinnamonRolls++){
				if(d[cinnamonRolls] == q)
				count++;
			}
			return (double)count/d.length;
	}


	
	public int bubbleSort(){
		int temp = 0;
	 for(int i = 0; i < data.length; i++){
   	 for(int j = 1; j < data.length-i; j++){
      if(data[j-1] > data[j]){
         temp = data[j];
         data[j] = data[j-1];
         data[j-1] = temp;
     		}
     	}
 	
}
 return data[data.length-1];
 }

	public int selectionSort(){
		for(int last = data.length -1; last > 0; last--){
			int maxNum = 0;
			for(int i = 1; j <= last; j++){
				if(data[i] > data[maxNum]){
					maxNum = i;
				}
			}
			int temp = data[maxNum]; 
      		data[maxNum] = data[last];
      		data[last] = temp;
		}
		return temp;

	}
	
	public static void main(String[] args) {
		int query;
		int result;
		double relevance;
		int[] rands ={4936, 2277, 2180, 654, 1965, 2218, 4543, 1468, 4875, 3887, 12, 754, 2755, 833, 3234, 4443, 403, 914, 4861, 2717, 3249, 4623, 2008, 1596, 989, 4814, 461, 1355, 4464, 4362, 2760, 4457, 4961, 2476, 4474, 4173, 1474, 3044, 4114, 4796, 4785, 4264, 2094, 3854, 550, 3874, 4212, 15, 4563, 3487, 1225, 4321, 2346, 1715, 2037, 1580, 2701, 4960, 2893, 951, 3060, 1136, 1061, 4050, 2303, 2227, 4156, 1203, 4184, 3656, 1765, 4589, 4296, 4345, 3711, 2755, 1667, 2241, 891, 834, 2266, 2971, 710, 666, 1124, 3878, 2538, 4325, 1437, 1224, 632, 1769, 1155, 4160, 1605, 4247, 1539, 4645, 4931, 3642};
		
		sortAlgorithms points = new sortAlgorithms();

		// Load the data in rands to test the bubble sort...
		points.loadData(rands);
		result = points.bubbleSort();

		if (result == 2589) {
			System.out.println("TEST 0 PASSED. BUBBLE SORT # OF EXHANGES ==> " + result);
		} else {
			System.out.println("TEST 0 FAILED. BUBBLE SORT # OF EXCHANGES ==> " + result);
		}

		query = 2701;
		result = points.find(query);

		if (result == 49) {
			System.out.println("TEST 1 PASSED. BUBBLE SORT ==> " + query + " at index " + result);
		} else {
			System.out.println("TEST 1 FAILED. BUBBLE SORT ==> " + query + " not at index " + result);
		}

		// Reload the data in rands to test the selection sort...
		points.loadData(rands);
		result = points.selectionSort();
		
		if (result == 95) {
			System.out.println("TEST 2 PASSED. SELECTION SORT # OF EXHANGES ==> " + result);
		} else {
			System.out.println("TEST 2 FAILED. SELECTION SORT # OF EXCHANGES ==> " + result);
		}
		
		query = 2701;
		result = points.find(query);

		if (result == 49) {
			System.out.println("TEST 3 PASSED. SELECTION SORT ==> (list sorted) " + query + " at index " + result);
		} else {
			System.out.println("TEST 3 FAILED. SELECTION SORT ==> (list not sorted) " + query + " not at index " + result);
		}

		query = 77;
		result = points.find(query);
		if (result < 0) {
			System.out.println("TEST 4 PASSED (" + query + " not found) ==> " + result);
		} else {
			System.out.println("TEST 4 FAILED ==> " + result);
		}

		query = 2755;
		relevance = points.findrelevance(query);
		if (Double.compare(relevance, 0.02) == 0) {
			System.out.println("TEST 5 PASSED ==> " + query + " relevance " + relevance);
		} else {
			System.out.println("TEST 5 FAILED ==> " + query + " relevance not "+ relevance);
		}

		query = 12;
		result = points.find(query);
		if (result == 0) {
			System.out.println("TEST 6 PASSED ==> " + query + " at index " + result);
		} else {
			System.out.println("TEST 6 FAILED ==> "  + query + " not at index " + result);
		}

		query = 4961;
		result = points.find(query);
		if (result == 99) {
			System.out.println("TEST 7 PASSED ==> " + query + " at index " + result);
		} else {
			System.out.println("TEST 7 FAILED ==> "  + query + " not at index " + result);
		}
	}	
		
	}
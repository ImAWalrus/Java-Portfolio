class ibarraj_hw3{
// Use this method to test your implementation of a extended STACK. You will need to
// reference YOUR stack class not mine as listed below. 

public static void main (String[] args) {
	// This is calling my stack. Replace mine with your own stack class.
	Stack simpleStack = new Stack();

	// Testing the API:

	// Push data on:
	int returncode = simpleStack.push("red");
	returncode = simpleStack.push("green");
	returncode = simpleStack.push("blue");
	returncode = simpleStack.push("yellow");
	returncode = simpleStack.push("purple");
	
	if (returncode == 1) {
		System.out.println("PUSH OF FIVE ITEMS PASSED! ==> ");
		simpleStack.print();
	} else {
		System.out.println("PUSH OF FIVE ITEMS FAILED ==> ");
		simpleStack.print();
	}

	String popped = simpleStack.pop();
	if (popped.equals("red")) {
		System.out.println("FIRST POP PASSED ==> " + popped);
	} else {
		System.out.println("FIRST POP FAILED ==> " + popped);
	}

	System.out.println("***********************************\n");

	popped = simpleStack.pop();
	
	if (popped.equals("green")) {
		System.out.println("SECOND POP PASSED ==> " + popped);
	} else {
		System.out.println("SECOND POP FAILED ==> " + popped);
	}

	System.out.println("***********************************\n");
	
	String topped = simpleStack.top();

	if (popped.equals("blue")) {
		System.out.println("FIRST TOP PASSED ==> " + topped);
	} else {
		System.out.println("FIRST TOP FAILED ==> " + topped);
	}

	System.out.println("***********************************\n");

	popped = simpleStack.pop();

	if (popped.equals("blue")) {
		System.out.println("THIRD POP PASSED ==> " + popped);
	} else {
		System.out.println("THIRD POP FAILED ==> " + popped);
	}
	System.out.println("***********************************\n");


	returncode = simpleStack.push("orange");
	returncode = simpleStack.push("mauve");
	returncode = simpleStack.push("pink");


	if (returncode == 0) {
		System.out.println("PUSHING ON A FULL STACK TEST PASSED ==> " + returncode);
	} else {
		System.out.println("PUSHING ON A FULL STACK TEST FAILED ==> " + returncode);
	}
	System.out.println("***********************************\n");

}
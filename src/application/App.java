package application;

public class App {

	public static void main(String[] args) {
		String[] animals = {"cat", "dog", "sloth", "panda"};

		//length of array is hard coded
		for(int i = 0; i < 3; i++) {
			System.out.println(animals[i]);
		}
		
		//let Java get the number of elements
		//note that array.length doesn't end in () since .length
		//isn't a method call, just a property of array
		for(int j= 0; j < animals.length; j++) {
			//System.out.println(animals[j]);
			System.out.printf("%d. %s\n", j, animals[j]);
		}
	}

}

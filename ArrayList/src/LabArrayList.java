import java.util.ArrayList;

import java.util.Scanner;



public class LabArrayList {



	public static void main(String[] args) {



		Scanner s = new Scanner(System.in);

		ArrayList<Integer> MyArray = new ArrayList<Integer>();



		int command,num;



		for (int i = 0; i < 5; i++) {

			System.out.print("Please enter a request: ");

			command = s.nextInt();



			if (command == 1) {

				System.out.print("Please enter integer number: ");

				num = s.nextInt();

				MyArray.add(num);

			}



			else if (command == 2) {

				System.out.print("Pleae enter integer number: ");

				num = s.nextInt();

				if (MyArray.contains(num)) {

					for (int m=0; m<MyArray.size(); m++) {

						if (MyArray.get(m).equals(num)) {

							MyArray.remove(m);

						}

					}

				}

			}



			else if (command == 3) {

				System.out.println(MyArray.size());

			}



			else {

				System.out.println("Incorrect Input, please try again.");

			}

			System.out.println(MyArray);

		}

	}

}
package CS586Project;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver();
		d.selectVM();
	
	}

	void selectVM() {
		int vm;
		boolean valid = false;
		while (valid == false) {
			System.out.println("Please select Vending machine: ");
			System.out.println("1. Vending machine 1");
			System.out.println("2. Vending machine 2");

			Scanner in = new Scanner(System.in);
			vm = in.nextInt();

			Output_processor OP = new Output_processor();
			MDA_EFSM MD = new MDA_EFSM();

			State_abstract state_list[] = new State_abstract[4];
			state_list[0] = new State_S0(MD, OP);
			state_list[1] = new State_S1(MD, OP);
			state_list[2] = new State_S2(MD, OP);
			state_list[3] = new State_start(MD, OP);

			MD.setStateList(state_list);

			switch (vm) {
			case 1: {
				Factory_abstract AF1 = new Factory_vm1();
				OP.setFactory(AF1);
				selection_vm1(AF1, MD, OP);
				valid = true;
				break;
			}
			case 2: {
				Factory_abstract AF2 = new Factory_vm2();
				OP.setFactory(AF2);
				selection_vm2(AF2, MD, OP);
				valid = true;
				break;
			}
			default: {
				System.out.println("\nInvalid input. try again\n");
				valid = false;
				break;
				}
			}
			in.close();
		}
		
	}

	void selection_vm1(Factory_abstract AF1, MDA_EFSM MD, Output_processor OP) {
		VendingMachine_1 vm1 = new VendingMachine_1();
		vm1.set_MDAEFSM(MD);
		vm1.set_factory(AF1);
		vm1.set_datestore();
		OP.setDataStore(vm1.DS);
		MD.A = new int[1];

		char ch;
		int n;
		boolean selectSugar = false;
		int price;

		Scanner reader = new Scanner(System.in);
		ch = '1';
		while (ch != 'q') {
			System.out.println("\nSelect Operation: ");
			System.out.println("1 - create, 2 - insert_cups, 3 - coin, 4 - card, 5 - sugar, ");
			System.out.println("6 - tea, 7 - chocolate, 8 - set_price, 9 - cancel, q - Quit");

			ch = (char) reader.next().charAt(0);
			switch (ch) {
			case '1': {
				System.out.println("Enter Price: ");
				vm1.create((int)reader.nextInt());
				break;
			}
			case '2': {
				System.out.println("Insert cups, enter number:");
				n = reader.nextInt();
				MD.insert_cups(n);
				break;
			}
			case '3': {
				System.out.println("Enter the amount of coins to be inserted");
				vm1.coin((int) reader.nextInt());
				break;
			}
			case '4': {
				System.out.println("Enter the balance available of the card inserted");
				vm1.card((float) reader.nextFloat());
				break;
			}
			case '5': {
				if (selectSugar == false) {
					System.out.println("Sugar selected. ");
					selectSugar = true;
					vm1.sugar();
				} else if (selectSugar == true) {
					System.out.println("Sugar canceled. ");
					selectSugar = false;
					vm1.sugar();
				}
				break;
			}
			case '6': {
				vm1.tea();
				break;
			}
			case '7': {
				vm1.chocolate();
				break;
			}

			case '8': {
				System.out.println("Enter the new price");
				price = reader.nextInt();
				vm1.set_price(price);
				break;
			}
			case '9': {
				vm1.cancel();
				break;
			}

			case 'q':
				reader.close();
				break;
			}
		}
	}

	void selection_vm2(Factory_abstract AF2, MDA_EFSM MD, Output_processor OP) {
		VendingMachine_2 vm2 = new VendingMachine_2();
		vm2.set_MDAEFSM(MD);
		vm2.set_factory(AF2);
		vm2.set_datestore();
		OP.setDataStore(vm2.DS);
		MD.A = new int[2];

		char ch;
		int n;
		boolean selectSugar = false;
		boolean selectCream = false;
		float price;

		Scanner reader = new Scanner(System.in);
		ch = '1';
		while (ch != 'q') {
			System.out.println("\nSelect Operation: ");
			System.out.println("1 - CREATE, 2 - InsertCups, 3 - COIN, 4 - SUGAR, 5 - CREAM,");
			System.out.println("6 - COFFEE, 7 - SetPrice, 8 - CANCEL, q - Quit");

			ch = (char) reader.next().charAt(0);
			switch (ch) {
			case '1': {
				System.out.println("Enter Price: ");
				vm2.CREATE((float)reader.nextFloat());
				break;
			}
			case '2': {
				System.out.println("Insert cups, enter number:");
				n = reader.nextInt();
				MD.insert_cups(n);
				break;
			}
			case '3': {
				System.out.println("Enter the amount of coins to be inserted");
				vm2.COIN((float) reader.nextFloat());
				break;
			}

			case '4': {
				if (selectSugar == false) {
					System.out.println("Sugar selected. ");
					selectSugar = true;
					vm2.SUGAR();
				} else if (selectSugar == true) {
					System.out.println("Sugar canceled. ");
					selectSugar = false;
					vm2.SUGAR();
				}
				break;
			}

			case '5': {
				if (selectCream == false) {
					System.out.println("Cream selected. ");
					selectCream = true;
					vm2.CREAM();
				} else if (selectCream == true) {
					System.out.println("Cream canceled. ");
					selectCream = false;
					vm2.CREAM();
				}
				break;
			}

			case '6': {
				vm2.COFFEE();
				break;
			}
			case '7': {
				System.out.println("Enter the new price");
				price = reader.nextInt();
				vm2.SetPrice(price);
				break;
			}
			case '8': {
				vm2.CANCEL();
				break;
			}

			case 'q':
				reader.close();
				break;

			}
		}
	}
}
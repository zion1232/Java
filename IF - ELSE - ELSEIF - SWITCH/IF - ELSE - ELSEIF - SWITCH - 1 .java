/*switch*/
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num_rooms, price =0 , duplex;
	System.out.println("enter the num of rooms (3 - 4 - 5)");
	num_rooms=s.nextInt();

	switch (num_rooms)
	{
	case 3:
		price = 120;
		break;
	case 4:
		price = 150;
		break;
	case 5:
		System.out.println("is duplex? ( 1 - yes/ 0 - no) :");
		duplex=s.nextInt();
		if (duplex == 1) {
			price = 200;
		}
		else {
			price = 180;
			break;
		}

	}
	System.out.println("please py me"  +price +" nis");


	}

}

/*if-else*/



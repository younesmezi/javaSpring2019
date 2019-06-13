package day23;

public class TableCellLocations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			  System.out.println("Row : " + i);
			  for (int x = 1; x <= 4; x++) {

			    System.out.print("Column : " + x + " ");

			  }
			  System.out.println();
			}
		System.out.print("Cell(" + 1 + "," + 1 + ") "    );
		System.out.print("Cell(" + 1 + "," + 2 + ") "    );
		System.out.print("Cell(" + 1 + "," + 3 + ") "    );
		System.out.print("Cell(" + 1 + "," + 4 + ") "    );
	}

}

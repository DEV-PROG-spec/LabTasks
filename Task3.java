//Author:Devendra Srivastava(DEV-PROG-Spec)
//Sec:B
package labWork;

//Create a program in Java that prints the following table...
public class Task3 {

	public static void main(String[] args) {
		System.out.printf("%-13s\t%-13s\t%-13s\t%-13s", "Data type", "Size in bits", "Size in bytes", "Range");
		System.out.println();

		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %d to %d", "Byte", Byte.SIZE, Byte.SIZE / 8, Byte.MIN_VALUE,
				Byte.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %d to %d", "SHORT", Short.SIZE, Short.SIZE / 8, Short.MIN_VALUE,
				Short.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %s to %s", "CHAR", Character.SIZE,
				Character.SIZE
				/ 8, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %s to %s", "INT", Integer.SIZE,
				Integer.SIZE / 8,
				Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %d to %d", "LONG", Long.SIZE, Long.SIZE / 8, Long.MIN_VALUE,
				Long.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %s to %s", "FLOAT", Float.SIZE, Float.SIZE
				/ 8,
				Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13d\t%-13d\tfrom %s to %s", "DOUBLE", Double.SIZE,
				Double.SIZE
				/ 8, Double.MIN_VALUE, Double.MAX_VALUE);
		System.out.println();
		System.out.printf("%-13s\t%-13s\t%-13s\thas %s and %s", "BOOLEAN", "**", "**", Boolean.TRUE, Boolean.FALSE);

	}

}

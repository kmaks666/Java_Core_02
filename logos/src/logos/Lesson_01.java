package logos;

public class Lesson_01 {
	public static void main(String[] args) {
		double min, max;
		int[] mas= {11, 17, -8, 1, 54, -4, 18, 21, 0, -11};
		
		System.out.print("Byte " + Byte.MIN_VALUE);
		System.out.println(" "+ Byte.MAX_VALUE );
		System.out.print("Short" + Short.MIN_VALUE);
		System.out.println(" "+ Short.MAX_VALUE);
		System.out.print("Integer " +Integer.MIN_VALUE );
		System.out.println(" "+Integer.MAX_VALUE );
		System.out.print("Long " + Long.MIN_VALUE);
		System.out.println(" " + Long.MAX_VALUE);
		System.out.print("Float " + Float.MIN_VALUE);
		System.out.println(" " + Float.MAX_VALUE);
		System.out.print("Double " + Double.MIN_VALUE);
		System.out.println(" " + Double.MAX_VALUE);
		  min=mas[0];
		  for(int i=0; i < mas.length; i++) {
			  if (mas[i]<min) {
				  min=mas[i];
			  }
		  }
		  System.out.println("Мінімальний елемент - "+ min);
		  max=mas[0];
		  for(int i=0; i < mas.length; i++) {
			  if (mas[i]>max) {
				  max=mas[i];
			  }
		  }
		  System.out.println("Максимальний елемент - "+ max);


	}

}

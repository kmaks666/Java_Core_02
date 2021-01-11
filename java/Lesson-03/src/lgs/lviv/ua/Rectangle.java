package lgs.lviv.ua;

public class Rectangle {
	private int width;
	private int lenght;
	private int square;
	private int perimetr;
	Rectangle(){
		this.width=16;
		this.lenght=10;
		this.square= width*lenght;
		this.perimetr=(width+lenght)*2;
	}
	 Rectangle(int lenght, int width){
		 this.lenght=lenght;
		 this.width=width;
		this.square= width*lenght;
		this.perimetr=(width+lenght)*2;
		
	}
	@Override
	public String toString() {
		return "Розміри прямокутника - "+lenght+" x "+ width +" Площа прямокутника = " + square + ", Переметр прямокутнка = " + perimetr;
	}
	
	}
	
	



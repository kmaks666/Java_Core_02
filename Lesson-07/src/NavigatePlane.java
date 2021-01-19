	
	public class NavigatePlane {
		public void moveUp() {
			System.out.println("Пролетіли на північ " + Move.move() + "км");
		}
	
		public void moveDown() {
			System.out.println("Пролетіли на південь " + Move.move() + "км");
		}
	
		public void moveRight() {
			System.out.println("Пролетіли на схід " + Move.move() + "км");
		}
	
		public void moveLeft() {
			System.out.println("Пролетіли на захід " + Move.move() + "км");
		}
	}

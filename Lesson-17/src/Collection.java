public class Collection {
	private static Number[] array;

	Collection(Number[] array) {
		Collection.array = array;
	}

	public class First implements Iterator {
		private int counter = 0;

		@Override
		public boolean hasNext() {
			return counter < array.length;

		}

		@Override
		public Number next() {
			int number = (int) array[counter++];
			if (number % 2 == 0) {
				return number;
			} else
				return 0;

		}
	}

	public First createFirst() {
		return new First();
	}

	public class Second implements Iterator {
		int counter = array.length - 1;

		@Override
		public boolean hasNext() {
			return counter >= 0;
		}

		@Override
		public Number next() {
			Number number = array[counter];
			counter -= 2;
			return number;
		}
	}

	public Second createSecond() {
		return new Second();
	}

	public Iterator createThird() {
		return new Iterator() {
			int counter = array.length - 1;

			@Override
			public boolean hasNext() {
				return counter >= 0;
			}

			@Override
			public Number next() {
				int number = (int) array[counter];
				if ((number % 2 == -1) || (number % 2 == 1)) {
					counter -= 3;
					return (Number) number;
				} else {
					counter -= 3;
					return null;
				}
			}
		};
	}

	public Iterator createFourth() {
		class Fourth implements Iterator {
			int counter = 0;

			@Override
			public boolean hasNext() {
				return counter < array.length;
			}

			@Override
			public Number next() {
				int number = (int) array[counter];
				if (number % 2 == 0) {
					counter += 5;
					return (Number) (number - 100);
				} else {
					counter += 5;
					return null;
				}
			}
		}
		return new Fourth();
	}
	
	private static class Fifth implements Iterator{
		int counter=0;

		@Override
		public boolean hasNext() {
			return counter<array.length;
		}

		@Override
		public Number next() {
			int number=(int)array[counter];
			counter+=2;
			if(number%2==0) {
				return (Number)(number+1);
			}
			else
			return null;
		}
		
	}
	public static Fifth createFifth() {
		return new Fifth();
	}

	@Override
	public String toString() {
		return "Collection [toString()=" + super.toString() + "]";
	}

}

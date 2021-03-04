package Task02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Commodity implements Comparable<Commodity> {
	private String name;
	private int height;
	private int width;
	private int weight;
	TreeSet<Commodity> commodity = new TreeSet<>(new CommoditySortingName());

	public Commodity(String name, int height, int width, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	public Commodity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", height=" + height + ", width=" + width + ", weight=" + weight + "]";
	}

// 		added product
	public void addCommodity() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of product:");
		if (scan.hasNext()) {
			name = scan.next();
		}
		while (true) {
			System.out.println("Enter height of product");
			if (scan.hasNext()) {
				int h = scan.nextInt();
				if (h > 0) {
					height = h;
					break;
				} else {
					System.out.println("Enter correct height, must be more '0'");
				}
			}
		}
		while (true) {
			System.out.println("Enter width of product");
			if (scan.hasNext()) {
				int w = scan.nextInt();
				if (w > 0) {
					width = w;
					break;
				}
			} else {
				System.out.println("Enter correct width, must be more '0'");
			}
		}

		while (true) {
			System.out.println("Enter weight of product");
			if (scan.hasNext()) {
				int w = scan.nextInt();
				if (w > 0) {
					weight = w;
					break;
				}
			} else {
				System.out.println("Enter correct weight, must be more '0'");
			}
		}
		Commodity product = new Commodity(name, height, width, weight);
		commodity.add(product);

		System.out.println(product.getName() + " added in list");

	}

//		removed product
	public void removeProduct() {
		Scanner scan = new Scanner(System.in);
		String name = null;
		Iterator<Commodity> iter = commodity.iterator();
		System.out.println("All products:");
		showAllProducts();
		System.out.println("Enter name of product to remove:");
		if (scan.hasNext()) {
			name = scan.next();
		}
		while (iter.hasNext()) {
			Commodity c = iter.next();
			if (c.getName().equalsIgnoreCase(name)) {
				System.out.println(c.getName() + " is removed");
				iter.remove();
				break;
			} else {
				System.out.println("Isn't product with this name. Enter other name");
				break;
			}
		}
	}

//		 show all products in list
	public void showAllProducts() {
		Iterator<Commodity> iter = commodity.iterator();
		if (!commodity.isEmpty()) {
			while (iter.hasNext()) {
				System.out.println(iter.next().toString());
			}
		} else {
			System.out.println("In list aren't products to display");
		}
	}

//			sorting Height
	public void commoditySortHeight() {
		TreeSet<Commodity> comm = new TreeSet<>(new CommoditySortingHeight());
		comm.addAll(commodity);
		System.out.println("Sorting by Height:");
		for (Commodity c : comm) {
			System.out.println(c.toString());
		}

	}

//			sorting Width
	public void commoditySortWidth() {
		TreeSet<Commodity> comm = new TreeSet<>(new CommoditySortingWidth());
		comm.addAll(commodity);
		System.out.println("Sorting by Width:");
		for (Commodity c : comm) {
			System.out.println(c.toString());
		}
	}

//			sorting Weight
	public void commoditySortWeight() {
		TreeSet<Commodity> comm = new TreeSet<>(new CommoditySortingWeight());
		comm.addAll(commodity);
		System.out.println("Sorting by Weight:");
		for (Commodity c : comm) {
			System.out.println(c.toString());
		}
	}

// 			show Selected Item
	public void showSelected() {
		TreeSet<Commodity> comm = new TreeSet<>();
		Iterator<Commodity> iter = commodity.iterator();

		int number = 0;
		System.out.println("Enter number of product to display. Total products are " + commodity.size());

		while (true) {
			Scanner scan = new Scanner(System.in);
			// 		exception, when input symbol
			try {
				if (scan.hasNext()) {
					number = scan.nextInt();
				}
			} catch (Exception e) {
				System.out.println(
						"You input incorrect number product. Please enter number between 1-" + commodity.size());
				break;
			}
			// 		exception, when input incorrect number
			try {
				if ((number > 0) && (number < commodity.size() + 1)) {
					int i = 0;
					while (iter.hasNext()) {
						if (i < number) {
							comm.add(iter.next());
							i++;
						} else {
							break;
						}
					}
				} else {
					throw new NoSuchElementException(commodity.size());
				}
			} catch (NoSuchElementException exc) {
				System.out.println(exc);
				break;
			}
			System.out.println(comm.last().toString());
			break;
		}

	}

	@Override
	public int compareTo(Commodity c) {

		return this.name.compareTo(c.getName());
	}

}

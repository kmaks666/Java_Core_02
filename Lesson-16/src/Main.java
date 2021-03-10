import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// Min:
		Class someClass = Student.class;
		System.out.println("Name of the class---> " + someClass.getName());
		System.out.println("Class modifier: " + Modifier.toString(someClass.getModifiers()));
		System.out.println();

		// Constructors
		System.out.println("<---    Constructors of the class " + someClass.getSimpleName() + "    --->");
		Constructor[] constructors = someClass.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("Constructor: " + constructor.getName() + " "
					+ Modifier.toString(constructor.getModifiers()) + " " + constructor.getParameterCount());

			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("Parameter: " + parameter.getName() + " " + parameter.getType().getName());
			}
			System.out.println();
		}

		// Methods
		System.out.println("<---    Methods of the class " + someClass.getSimpleName() + "    --->");
		Method[] methods = someClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print("Method: " + method.getName() + " " + Modifier.toString(method.getModifiers()));

			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.print("	Parameter: " + parameter.getName() + " " + parameter.getType().getName());
			}
			System.out.println();
		}
		System.out.println();

		// Fields
		System.out.println("<---    Fields of the class " + someClass.getSimpleName() + "    --->");
		Field[] fields = someClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("Field: " + field.getName() + " " + field.getType() + " "
					+ Modifier.toString(field.getModifiers()));
			System.out.println();
		}

		// Max:
		// creating new object and setting fields
		Constructor<Student> newStudent = someClass.getConstructor(String.class, String.class, int.class);
		Student newInstanceStudent = newStudent.newInstance("John", "Malkovich", 65);
		System.out.println("<--- Creating new object and setting fields --->");
		System.out.println(newInstanceStudent);
		System.out.println();

		// reset public fields
		Field nameField = someClass.getField("firstName");
		Field lastNameField = someClass.getField("lastName");
		nameField.set(newInstanceStudent, "Sylvester");
		lastNameField.set(newInstanceStudent, "Stallone");

		// reset private field
		Field fieldAge = fields[2];
		fieldAge.setAccessible(true);
		fieldAge.set(newInstanceStudent, 45);
		System.out.println("<--- Resetting fields --->");
		System.out.println(newInstanceStudent);

		// call method "myMethod" without parameters
		System.out.println();
		System.out.println("<--- Calling MyMethod --->");
		Method myMethod = someClass.getMethod("myMethod", null);
		myMethod.invoke(newInstanceStudent);
		// call method "myMethod" with parameters
		System.out.println();
		Method method = someClass.getMethod("myMethod", String.class, int.class);
		method.invoke(newInstanceStudent, "Philosophy", 3);

	}

}

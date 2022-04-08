package global_variable;

public class G4 {

	public static void main(String[] args) {
		Employee pravin = new Employee();
		pravin.emp_name = "pravin mohan balgore";
		pravin.emp_grade = 'a';
		pravin.emp_age = 24;
		pravin.emp_sex = "male";
		pravin.emp_sal = 12356.3254f;
		
		pravin.info();
		
		Employee krupa = new Employee();
		krupa.emp_name = "krupa ravindra savant";
		krupa.emp_grade = 'a';
		krupa.emp_age = 22;
		krupa.emp_sex = "female";
		krupa.emp_sal = 12546.235f;
		
		
		krupa.info();

	}

}

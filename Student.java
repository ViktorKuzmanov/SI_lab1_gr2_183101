class Student {
	String index;
	String firstName;
	String lastName;

	int grades[] = new grades[100];
	
	//TODO constructor
	Student(String i, String f, String l) {
		index = i;
		firstName = f;
		l = lastName;
	}
	//TODO seters & getters
	public void setIndex(String i) { index = i; }
	public void setFirstName(String f) { firstName = f; }
	public void setLastName(String l) { lastName = l; }
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getIndex() {
		return index;
	}

	public int getGrades() {
		return grades;
	}

	public double getAverage() {
		//TODO
		double zbir = 0.0;
		for(int i = 0; i<grades.length; i++) {
			zbir += grades[i];
		}
		return  zbir / grades.length;
	}

	public int ECTSCredits() {
		//TODO
		int zbir = 0;
		for(int i = 0; i<grades.length; i++) {
			zbir += 6;
		}
		return  zbir;
	}
}

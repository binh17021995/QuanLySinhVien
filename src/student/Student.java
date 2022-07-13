package student;

public class Student {
	private int iD;
	private String nameStudent;
	private String bornOfYear;
	private String numberPhone;
	private String majorOfStudent;
	private String typeOfTraining;

	public Student(int iD, String nameStudent, String bornOfYear, String numberPhone, String majorOfStudent,
			String typeOfTraining) {
		this.iD = iD;
		this.nameStudent = nameStudent;
		this.bornOfYear = bornOfYear;
		this.numberPhone = numberPhone;
		this.majorOfStudent = majorOfStudent;
		this.typeOfTraining = typeOfTraining;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getBornOfYear() {
		return bornOfYear;
	}

	public void setBornOfYear(String bornOfYear) {
		this.bornOfYear = bornOfYear;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getMajorOfStudent() {
		return majorOfStudent;
	}

	public void setMajorOfStudent(String majorOfStudent) {
		this.majorOfStudent = majorOfStudent;
	}

	public String getTypeOfTraining() {
		return typeOfTraining;
	}

	public void setTypeOfTraining(String typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}

}


public class Student extends Person{
	
	private int grade;
	
	public Student(String studentName, String studentGender, int studentGrade)
	{
		super(studentName, studentGender);
		this.grade = studentGrade;
	}	
	
	/*public String getName()
	{
		return name;
	}*/
	
	public int getGrade()
	{
		return grade;
	}
	
	public void setGrade(int studentGrade)
	{
		this.grade = studentGrade;
	}
	
	/*public void setName(String studentName)
	{
		this.name = studentName;
	}*/
	@Override
	public String toString()
	{
		return String.format("%s grade: %3d ", super.toString(),grade);
	}

	@Override
	public String getEmotion(int grade) {
		// TODO Auto-generated method stub
		if (grade >= 60)
			return "happy";
		else
			return "sad";		
	}
	
	//public abstract double semesterGrade();

}

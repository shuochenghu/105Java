
public class Student {
	
	private String name;
	private int grade;
	private Date birthDate;
	
	public Student(String studentName, int studentGrade, Date birthDate)
	{
		this.name = studentName;
		this.grade = studentGrade;
		this.birthDate = birthDate;
	}	
	
	public String getName()
	{
		return name;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	public void setGrade(int studentGrade)
	{
		this.grade = studentGrade;
	}
	
	public void setName(String studentName)
	{
		this.name = studentName;
	}
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	public String toString()
	{
		return String.format("%s %s: %d", name, birthDate, grade);
	}

}

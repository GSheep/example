package abc;

public class Teacher {
	private String teacher_id;
	private String teacher_name;
	private String teacher_gender;
	private Student[] students;
	public String getTeacher_gender(){
		return teacher_gender;
	}
	public void setTeacher_gengder(String teacher_gender){
		this.teacher_gender = teacher_gender;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
}

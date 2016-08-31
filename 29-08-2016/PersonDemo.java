class Person{
	protected String name,address;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	String getName(){
		return name;
	}
	String getAddress(){
		return address;
	}
	void setAddress(String address){
		this.address=address;
	}
	String tostring(){
		return "Person[name="+name+",address="+address+"]";
	} 
}

class Student extends Person{
	private String program;
	private int year;
	private double fee;
	Student(String name,String address,String program,int year,double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	String getProgram(){
		return program;
	}
	void setProgram(String program){
		this.program=program;
	}
	int getYear(){
		return year;
	}
	void setYear(int year){
		this.year=year;
	}
	double getFee(){
		return fee;
	}
	void setFee(double fee){
		this.fee=fee;
	}
	String tostring(){
		return "Student[name="+name+",address="+address+",program="+program+",year="+year+",fee="+fee+"]";
	}
}

class Staff extends Person{
	private String school;
	private double pay;
	Staff(String name,String address,String school,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	String getSchool(){
		return school;
	}
	void setSchool(String school){
		this.school=school;
	}
	double getPay(){
		return pay;
	}
	void setPay(double pay){
		this.pay=pay;
	}
	String tostring(){
		return "Staff[name="+name+",address="+address+",School="+school+",pay="+pay+"]";
	}
}

class PersonDemo{
	public static void main(String[] args){
		System.out.println("==========Student==========");
		Student s=new Student("K ManiDeep","BEC","CSE",1,35000.0);
		System.out.println("Name:"+s.getName());
		System.out.println("Address:"+s.getAddress());
		System.out.println("Program:"+s.getProgram());
		s.setProgram("CS&E");
		System.out.println("Program:"+s.getProgram());
		System.out.println("Year:"+s.getYear());
		s.setYear(2);
		System.out.println("Year:"+s.getYear());
		System.out.println("Fee:"+s.getFee());
		s.setFee(75000.0);
		System.out.println("Fee:"+s.getFee());
		System.out.println(s.tostring());
		
		System.out.println("==========Staff==========");
		Staff s1=new Staff("Mani Deep Karumanchi","Bapatla Engineering College","BEC",35000.0);
		System.out.println("Name:"+s1.getName());
		System.out.println("Address:"+s1.getAddress());
		System.out.println("School:"+s1.getSchool());
		s1.setSchool("Bapatla Engineering College");
		System.out.println("School:"+s1.getSchool());
		System.out.println("Pay:"+s1.getPay());
		s1.setPay(41000.0);
		System.out.println("Pay:"+s1.getPay());
		System.out.println(s1.tostring());
		
	}
}
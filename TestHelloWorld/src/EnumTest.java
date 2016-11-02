
public class EnumTest {

	
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		if(s1.getJoinMonth()==MonthEnum.Jan.getCode()){
			System.out.println(MonthEnum.Jan.getCode());
			System.out.println(MonthEnum.Jan.name());
			System.out.println("Eligible Scholorship");
		}else{
			System.out.println("Not eligible!");
		}
	}
	
	
}

class Student1{
	int joinMonth =1;
	public int getJoinMonth(){
		return this.joinMonth;
	}
}


interface Const{
	
	int jan =1;
	int feb=2;

	int dec=12;
	
}

enum MonthEnum{
	Jan(1),Feb(2);
	int month;
	MonthEnum(int code){
		this.month = code;
	}
	public int getCode(){
		return this.month;
	}
	
	
}

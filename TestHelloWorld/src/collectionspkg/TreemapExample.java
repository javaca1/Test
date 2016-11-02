package collectionspkg;
import java.util.Comparator;
import java.util.TreeMap;

import inheritance.student.Student;
public class TreemapExample {
    
    public static void main(String[] args) {
    	
    Comparator<Student> comSpec=new Comparator<Student>(){
        @Override
        public int compare(Student o1, Student o2) {
            // TODO Auto-generated method stub
        	//"Test".compareTo("Hello);
            return o1.getName().compareTo(o2.getName());
        }
    };
    
    TreeMap<Student,String> tm=new TreeMap<Student,String>(comSpec);
    
    tm.put(new Student("aravind","usa","wsu"),"hello");
    tm.put(new Student("aravind","india","griet"),"hai");
    tm.put(new Student("srinu","india","IBM"),"hey");
    
    System.out.println(tm);
    
    }
    
}

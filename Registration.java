import java.util.*;
class COURSE{
String code;
String topic;
int capacity;
int avail_slots;

public COURSE(String code,String topic,int capacity){
this.code=code;
this.topic=topic;
this.capacity=capacity;
this.avail_slots=capacity;
}

public String getcode(){
return code;
}

public String gettopic(){
return topic;
}

public int getavail_slots(){
return avail_slots;
}

public void decremtavail_slots(){
if(avail_slots>0)
avail_slots--;
}

public void incremtavail_slots(){
if(avail_slots<capacity)
avail_slots++;
}

}
class CourseDB{
List<COURSE> courses;
public CourseDB(){
this.courses=new ArrayList<>();
}

public void addCourse(COURSE course){
courses.add(course);
}

public void remCourse(COURSE course){
courses.remove(course);
}

public List<COURSE> getallcourse(){
return courses;
}
}
 
class StudentInfo{
String sid;
String sname;
List<COURSE> regcourses;
public StudentInfo(String sid,String sname){
this.sid=sid;
this.sname=sname;
this.regcourses=new ArrayList<>();
}

public String getsid(){
return sid;
}

public String getsname(){
return sname;
}

public List<COURSE> getregcourses(){
return regcourses;
}

public void register(COURSE course){
if(course.getavail_slots()>0){
regcourses.add(course);
course.decremtavail_slots();
}
else
System.out.println("COURSE"+course.getcode()+"HAS NO VACANCIES..");
}

public void delcourse(COURSE course){
if(regcourses.contains(course)){
regcourses.remove(course);
course.incremtavail_slots();
}
else
System.out.println("COURSE"+course.getcode()+" IS NOT THERE IN COURSE REGISTERED");
}

}

public class Registration{
public static void main(String args[]){
CourseDB db=new CourseDB();
db.addCourse(new COURSE("3JA54","JAVA",15));
db.addCourse(new COURSE("3C55","C",10));
db.addCourse(new COURSE("3PY54","PYTHON",25));
db.addCourse(new COURSE("3HT54","HTML",8));

System.out.println("COURSES AVAILABLE:");
List<COURSE> C_all=db.getallcourse();

for(COURSE course: C_all){
System.out.println("CODE:"+course.getcode());
System.out.println("PROGRAMMING LANGUAGE:"+course.gettopic());
System.out.println("AVAILABLE SLOTS:"+course.getavail_slots());
}

StudentInfo s1=new StudentInfo("1201","Sam");
StudentInfo s2=new StudentInfo("1202","Ram");


s1.register(C_all.get(0));
s1.register(C_all.get(3));
s2.register(C_all.get(1));
s2.register(C_all.get(2));

for(COURSE course:s1.getregcourses()){
System.out.println("CODE"+course.getcode());
System.out.println("PROGRAMMING LANGUAGE:"+course.gettopic());
System.out.println("SLOTS AVAILABLe"+course.getavail_slots());
System.out.println("SLOTS AVAILABLE BEFORE DELETING  COURSE(0): "+course.getavail_slots());
s1.delcourse(C_all.get(0));
System.out.println("SLOTS AVAILABLE AFTER DELETING OF COURSE(0): "+course.getavail_slots());
} 
}
}











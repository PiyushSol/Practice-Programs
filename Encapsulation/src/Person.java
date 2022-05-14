
public class Person {
    private String name;
    private int age;
    private String job;
    
    Person(String name, int age,String job){
    	this.setName(name);
    	this.setAge(age);
    	this.setJob(job);
    }
    
    public String getName(){
    	return name;
    }
    
    public int getAge(){
    	return age;
    }
    
    public String getJob(){
    	return job;
    }
    
    public void setName(String name){
    	this.name=name;
    }
    
    public void setAge(int age){
    	this.age= age;
    }
    
    public void setJob(String job){
    	this.job= job;
    }
}

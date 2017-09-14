
public class Person {
public int height=180;
public String name="default";
public void say(String name)
{
	System.out.println(name);
}
public Person()		{}			//конструктор по умолчанию
public Person(int h, String n) 
{height=h; 
name=n; }
}

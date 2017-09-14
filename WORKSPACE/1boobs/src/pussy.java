public class pussy {
public static void main(String args[]){ 
	reader4 r= new reader4();
	Vika v=new Vika();
	Kristina k=new Kristina();
	Albina a=new Albina();
	r.scan(); 
	r.i=count(r.i); 
	r.k=count(r.k);
	System.out.println(" 1e="+r.i +" 2e="+r.k); 
v.WYB();
k.WYB();
a.WYB();
}
private static int count(int x){
	x=x+3; 
	return x; }





}
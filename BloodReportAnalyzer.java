import java.util.Scanner;


public class BloodAnalyzerReport {

	public static void haemoglobintest(String Gender)

	{
	 Float hp,rbc,wbc;
	 System.out.println("\n Haemoglobin value: ");
	 Scanner S = new Scanner(System.in);
	 hp = S.nextFloat();
	 
	 if(Gender.contentEquals("m"))
	 {
	  if(hp<12.5)
		  System.out.println("\n Haemoglobin is very less \n Eat food containing garlic,zinc,folic acid...");
	  else if(hp>18.0)
		  System.out.println("\n Haemoglobin is high \n You are healthy....");
	  else
		  System.out.println("\n Haemoglobin is normal and continue the same diet...");
	 }
	 
	 else if(Gender.contentEquals("f"))
	 {
	  if(hp<11.5)
		  System.out.println("\n Haemoglobin is very less\n Eat food containing garlic,zinc,folic acid...");
	  else if(hp>16.5)
		  System.out.println("\n Haemoglobin is high\n You are healthy....");
	  else
		  System.out.println("\n Haemoglobin is normal and continue the same diet....");
	 }
	 
	 
	 System.out.println("\n RBC Count(in millions/Cu.mm):\t");
	 rbc = S.nextFloat();
	 if(rbc<3.9)
		 System.out.println("\n RBC count is very less...\n Your diet should contain peas,beans,nuts,leafy vegetables");
	 else if(rbc>6.5)
		 System.out.println("\n RBC count is high.....\n You are healthy");
	 else
		 System.out.println("\n RBC count is normal...\n Continue the same diet");
	 
	 
	 
	 System.out.println("\n WBC Count(in /Cu.mm):\t");
	 wbc = S.nextFloat();
	 if(wbc<4000)
		 System.out.println("\n WBC count is less...\n Your diet should contain zinc,folic acid...");
	 else if(wbc>11000)
		 System.out.println("\n WBC count is High...\n You are healthy");
	 else
		 System.out.println("\n WBC count is Normal...\n Continue the same diet");
	
	 S.close();
	}
	
	
	public static void cholestroltest()
	{
	 float tch,ldch,hdch;
	 System.out.println("\n Total Blood Cholestrol(in mg/dl):");
	 Scanner S = new Scanner(System.in);
	 tch = S.nextFloat();
	 if(tch<200)
		 System.out.println("\n Desirable");
	 else if(tch>240)
		 System.out.println("\n Cholestrol level is high..\n There is a chance of heartattack");
	 else
		 System.out.println("\n Cholestrol is border line high");
	 
	 
	 System.out.println("\n Low Density Cholestrol(in mg/dl):");
	 ldch = S.nextFloat();
	 if(ldch<100)
		 System.out.println("\n Optimal");
	 else if(ldch>=100 && ldch<=129)
		 System.out.println("\n Near Optimal");
	 else if(ldch>=130 && ldch<=159)
		 System.out.println("\n Border line high cholestrol");
	 else if(ldch<=160 && ldch<=189)
		 System.out.println("\n High Cholestrol");
	 else
		 System.out.println("\n Definite Heartattack");
	 
	 
	 System.out.println("\n High Density Cholestrol(in mg/dl):");
	 hdch = S.nextFloat();
	 if(hdch<40)
		 System.out.println("\n You may suffer with heart attack");
	 else if(hdch>60)
		 System.out.println("\n You have protection to heart diseases");
	 else
		 System.out.println("\n Vulnerable to heart");
	 S.close();
	
	}
	
	
	public static void thyroidtest()
	{
	 float tsh,t4;
	 
	 System.out.println("TSH Value:");
	 Scanner S = new Scanner(System.in);
	 tsh = S.nextFloat();
	 
	 if(tsh<=4.0)
	 {
	  System.out.println("T4(thyroxine)(value in pmo/l):");
	  t4 = S.nextFloat();
	  if(t4<10)
		  System.out.println("You are suffering with hypothyroidism...\n Your diet should contain food with less sugar and eat food high in vitamins A and B");
	  else
		  System.out.println("Normal");
	 }
	 
	 else if(tsh>4.0)
	 {
	  System.out.println("T4(thyroxine)(value in pmo/l):\t");
	  t4 = S.nextFloat();
	  if(t4>20)
		  System.out.println("You are normal");
	  else
		  System.out.println("\n You are suffering with hypothyroidism...\n Your diet should contain food with less sugar and eat food high in vitamins A and B");	 }
	
	 S.close();
	}
	
	public static void main(String[] args)
	{
	 
	 System.out.println("----BLOOD REPORT----------");
	 Scanner S = new Scanner(System.in);
	 System.out.println("Patient name: ");
	 String Name = S.nextLine();
	 
	 System.out.println(" Enter blood group: ");
	 String BloodGroup = S.nextLine();
	 
	 System.out.println("Enter the gender(m/f): ");
	 String Gender = S.nextLine();
	 
	 System.out.println("Enter the option of the test to be performed:");
	 System.out.println("1.Haemoglobin test" + "\n" + "2.Cholestrol test" + "\n" + "3.Thyroid test " + "\n" + "4.Overallbloodtest");
	 Integer Option = S.nextInt();
	 
	 if(Option==1)
		  haemoglobintest(Gender);
	 else if(Option==2)
		 cholestroltest();
	 else if(Option==3)
		 thyroidtest();
	 else if(Option==4)
	 {
		 haemoglobintest(Gender);
		 cholestroltest();
		 thyroidtest();
	 }
	 else 
		 System.out.println("Invalid option.");
		
	 S.close();
	}
}

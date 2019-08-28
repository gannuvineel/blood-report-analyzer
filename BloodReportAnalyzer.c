#include<stdio.h>
#include<string.h>
void Haemoglobintest(char g)
{
 float hp,RBC,WBC;
 
 printf("\n Haemoglobin value:\t");
 scanf("%f",&hp);
 
 if(g=='m')
 {
  if(hp<12.5)
    printf("\n Haemoglobin is very less\n Eat food containing garlic,zinc,folic acid...");
  
  else if(hp>18.0)
    printf("\n Haemoglobin is high\n You are healthy....");
  
  else
    printf("\n Haemoglobin is normal and continue the same diet...");
 }
 
 
 else if(g=='f')
 {
  if(hp<11.5)
   printf("\n Haemoglobin is very less\n Eat food containing garlic,zinc,folic acid...");
  
  else if(hp>16.5)
   printf("\n Haemoglobin is high\n You are healthy....");
  
  else
   printf("\n Haemoglobin is normal and continue the same diet....");
 }
 
 
 printf("\n RBC count(in millions/Cu.mm):\t");
 scanf("%f",&RBC);
 if(RBC<3.9)
   printf("\n RBC count is very less...\n Your diet should contain peas,beans,nuts,leafy vegetables");
 
 else if(RBC>6.5)
   printf("\n RBC count is high.....\n You are healthy");
 
 else
   printf("\n RBC count is normal...\n Continue the same diet");
 
 
 printf("\nWBC count(in /Cu.mm):\t");
 scanf("%f",&WBC);
 if(WBC<4000)
  printf("\n WBC count is less...\n Your diet should contain zinc,folic acid...");
 
 else if(WBC>11000)
  printf("\n WBC count is high...\n You are healthy");
 
 else
  printf("\n WBC count is normal...\n Continue the same diet");
}
void cholestroltest()
{
 float tch,ldch,hdch;
 printf("\n Total Blood Cholestrol(in mg/dl):\t");
 scanf("%f",&tch);
 
 if(tch<200)
  printf("\n Desirable");
 
 else if(tch>240)
  printf("\n Cholestrol level is high..\n There is a chance of heartattack");
 
 else
  printf("\n Cholestrol is border line high");
 
 
 printf("\n Low Density Cholestrol(in mg/dl):\t");
 scanf("%f",&ldch);
 
 if(ldch<100)
   printf("\n Optimal");
 
 else if(ldch>=100&&ldch<=129)
   printf("\n Near Optimal");
 
 else if(ldch>=130&&ldch<=159)
   printf("\n Border line high cholestrol");
 
 else if(ldch<=160&&ldch<=189)
   printf("\n High Cholestrol");
 
 else
   printf("\n Definite Heartattack");
 
 
 printf("\n High density cholestrol(in mg/dl):\t");
 scanf("%f",&hdch);
 if(hdch<40)
   printf("\n You may suffer with heart attack");
 
 else if(hdch>60)
   printf("\n You have protection to heart diseases");
 
 else
   printf("\n Vulnerable to heart");
}
void thyroidtest()
{
 float tsh,t4;
 printf("\nTSH value:\t");
 scanf("%f",&tsh);
 
 if(tsh<=4.0)
 {
  printf("\n T4(thyroxine)(value in pmo/l):\t");
  scanf("%f",&t4);
  if(t4<10)
    printf("You are suffering with hypothyroidism...\n Your diet should contain food with less sugar and eat food high in vitamins A and B");
  
  else
    printf("\n Normal");
 }
 
 
 else if(tsh>4.0)
 {
  printf("\n T4(thyroxine)(value in pmo/l):\t");
  scanf("%f",&t4);
  if(t4>20)
    printf("\n You are normal");
  
  else
    printf("\n You are suffering with hypothyroidism...\nyour diet should contain food with less sugar and eat food high in vitamins A and B");
 }
}
void main()
{
 char name[20],bg[3],g;
 int o;
 
 printf("\n----BLOOD REPORT----------");
 
 printf("\n Patient name:\t");
 gets(name);
 
 printf("\n Enter blood group:\t");
 gets(bg);
 
 printf("\n Enter the gender(m/f):\t");
 scanf("%c",&g);
 
 printf("\n Enter the option of the test to be performed: ");
 printf("\n 1.Haemoglobin test\n 2.Cholestrol test\n 3.Thyroid test\n 4.Overallbloodtest\n ");
 scanf("%d",&o);
 
 if(o==1)
  Haemoglobintest(g);
 else if(o==2)
  cholestroltest();
 else if(o==3)
  thyroidtest();
 else if(o==4)
 {
  Haemoglobintest(g);
  cholestroltest();
  thyroidtest();
 }
 else
	 printf("\n Invalid Option");
}
import java.util.*;
class program{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String empid[]={"161E90","171E22","171G55","152K46"};
        String empname[]={"Ramu","Tejas","Abhi","Jaya"};
        int age[]={35,30,25,32};
        int salary[]={59000,82100,100000,85000};

        int n=0;
        System.out.println("Enter the parameter for sorting: 1) empid 2) empname 3) age 4) salary");
        System.out.println("\n");

        n=sc.nextInt();

        switch(n)
        {
            case 1:{
                for(int i=0;i<empid.length;i++)
                {
                    for(int j=i+1;j<empid.length;j++)
                    {
                        if(empid[i].compareTo(empid[j])>0)
                        {
                            String temp=empid[i];
                            empid[i]=empid[j];
                            empid[j]=temp;

                            temp=empname[i];
                            empname[i]=empname[j];
                            empname[j]=temp;

                            int temp1=age[i];
                            age[i]=age[j];
                            age[j]=temp1;

                            temp1=salary[i];
                            salary[i]=salary[j];
                            salary[j]=temp1;
                        }
                    }
                }
                break;
                }
            case 2:
            {
                for(int i=0;i<empname.length;i++)
                {
                    for(int j=i+1;j<empname.length;j++)
                    {
                        if(empname[i].compareTo(empname[j])>0)
                        {
                            String temp=empid[i];
                            empid[i]=empid[j];
                            empid[j]=temp;

                            temp=empname[i];
                            empname[i]=empname[j];
                            empname[j]=temp;

                            int temp1=age[i];
                            age[i]=age[j];
                            age[j]=temp1;

                            temp1=salary[i];
                            salary[i]=salary[j];
                            salary[j]=temp1;
                        }
                    }
                }
                break;
            }   
            
            case 3:
            {
                for(int i=0;i<age.length;i++)
                {
                    for(int j=i+1;j<age.length;j++)
                    {
                        if(age[i]>age[j])
                        {
                            String temp=empid[i];
                            empid[i]=empid[j];
                            empid[j]=temp;

                            temp=empname[i];
                            empname[i]=empname[j];
                            empname[j]=temp;

                            int temp1=age[i];
                            age[i]=age[j];
                            age[j]=temp1;

                            temp1=salary[i];
                            salary[i]=salary[j];
                            salary[j]=temp1;
                        }
                    }
                }
                break;
            }

            case 4:
            {
                for(int i=0;i<salary.length;i++)
                {
                    for(int j=i+1;j<salary.length;j++)
                    {
                        if(salary[i]>salary[j])
                        {
                            String temp=empid[i];
                            empid[i]=empid[j];
                            empid[j]=temp;

                            temp=empname[i];
                            empname[i]=empname[j];
                            empname[j]=temp;

                            int temp1=age[i];
                            age[i]=age[j];
                            age[j]=temp1;

                            temp1=salary[i];
                            salary[i]=salary[j];
                            salary[j]=temp1;
                        }
                    }
                }
                break;
            }
        }


        System.out.println("Empid\tEmpname\tAge\tSalary");
        System.out.print("\n");
        for(int i=0;i<empid.length;i++)
        {
            System.out.println(empid[i]+"\t"+empname[i]+"\t"+age[i]+"\t"+salary[i]);
        }
    }
}
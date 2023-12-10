/**
Name:
Class: SE-2			Batch:
Experiment No: 03
Title:

*/

class Employee
{
    String name,add,mail;
    float id,mobile,basic;
    void salary()
    {
        float da,hra,pf,cf,gross;
        da = basic*97/100;
        hra = basic * 10/100;
        pf = basic *12/100;
        cf = basic*0.1f/100;
        gross = basic+da+hra-pf-cf;
        System.out.println("Name:"+name);
        System.out.println("Basic salary:"+basic);
        System.out.println("Gross Salary:"+gross);
        System.out.println("mailid :"+mail);
        System.out.println("\n");
    }
}

class Programmer extends Employee
{
    Programmer(String name,int sal,String mail)
    {
        System.out.println("Programmer Salary Details:");
        this.name = name;
        this.mail = mail;
        basic = sal;
    }
    
}

class TeamLead extends Employee
{
    TeamLead(String name,int sal,String mail)
    {
        System.out.println("Team Leader Salary Details:");
        this.name = name;
        this.mail = mail;
        basic = sal;
    }
    
}
class APM extends Employee
{
    APM(String name,int sal,String mail)
    {
        System.out.println("Assistant Project Manager Salary Details:");
        this.name = name;
        this.mail = mail;
        basic = sal;
    }
}

class ProjectManager extends Employee
{
    ProjectManager(String name,int sal,String mail)
    {
        System.out.println("Project Manager Salary Details:");
        this.name = name;
        this.mail = mail;
        basic = sal;
    }
    
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Programmer P = new Programmer("S.A Joshi",50000,"sajoshi@gmail.com");
        P.salary();
        
        TeamLead t = new TeamLead("Sagar Patil",60000,"sagar@gmail.com");
        t.salary();
        
        APM A = new APM("Mangesh Patil",70000,"mangesh.patil@gmail.com");
        A.salary();
        
        ProjectManager PM = new ProjectManager("Sonali Mukharji",50000,"sonali@hotmaill.com");
        PM.salary();
        
    }
}

/*
OUTPUT

Programmer Salary Details:


Name:S.A Joshi
Basic salary:50000.0
Gross Salary:97450.0
mailid :sajoshi@gmail.com


Team Leader Salary Details:


Name:Sagar Patil
Basic salary:60000.0
Gross Salary:116940.0
mailid :sagar@gmail.com


Assistant Project Manager Salary Details:


Name:Mangesh Patil
Basic salary:70000.0
Gross Salary:136430.0
mailid :mangesh.patil@gmail.com


Project Manager Salary Details:


Name: Sonali Mukharji
Basic salary:50000.0
Gross Salary:97450.0
mailid :sonali@hotmaill.com


*/
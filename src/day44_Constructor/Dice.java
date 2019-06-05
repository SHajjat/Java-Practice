package day44_Constructor;

import java.util.ArrayList;
import java.util.List;

public class Dice {
	public static void main(String[] args) {
		Jobs job1 = new Jobs();//no arg is called
		Jobs job2 = new Jobs("JAVA DEVELOPER");//
		Jobs job3 = new Jobs("SDET" , " AMAZON", 130_000.00);
		
		System.out.println(job1.toString());
        System.out.println(job2.toString());
        System.out.println(job3.toString());
		
        
        Jobs [] listOfJobs = new Jobs[5];
        listOfJobs[0] = new Jobs("SDET" , " AMAZON", 130_000.00);
        listOfJobs[1] = new Jobs("SDDT" , " AMAZON", 150_000.00);
        listOfJobs[2] = new Jobs("SDET" , " AMAZON", 130_000.00);
        listOfJobs[3] = new Jobs("SDDT" , " AMAZON", 150_000.00);
        listOfJobs[4] = new Jobs("SDET" , " AMAZON", 130_000.00);
       
        
        
        List <Jobs> jobsList = new ArrayList <>();
        jobsList.add(job3);
        jobsList.add(new Jobs("SDET" , " Google", 300_000.00));
        jobsList.add(new Jobs ("SDET", "FreddieMAC",115_000.00));
        jobsList.add(new Jobs ("BA", "Leidos",98_000.00));
        jobsList.add(new Jobs ("Senior QA tester", "Delta", 150_000.00));
       
        
        //find the highest paying job , and print toString
        double max = jobsList.get(0).getAnnualSalary();
        int j=0;
        for (int i = 0 ;i <jobsList.size();i++) {
        	if (jobsList.get(i).getAnnualSalary()>max) {
        		max=jobsList.get(i).getAnnualSalary();
        		j=i;
        	}
        	
        }
        Jobs bestJob = jobsList.get(j);
        System.out.println(bestJob.toString());
        System.out.println(jobsList.get(j).toString());
        
        System.out.println(jobsList.toString());
        
	}
	

}

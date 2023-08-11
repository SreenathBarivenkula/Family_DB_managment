package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Family;
import com.familyDao.familyDao;

public class start {
	public static void main(String[] args) throws IOException {
		System.out.println("welcome to family DB Management System Application");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new familymember");
			System.out.println("press 2 to delete familymember");
			System.out.println("press 3 to display familymember");
			System.out.println("press 4 to update Application");
			System.out.println("press 5 to exit Application");
			
			int c=Integer.parseInt(br.readLine());
			
			switch (c) 
			{
			case 1: //add employee
				System.out.println("enter family id :");
				int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter family name :");
				String name= br.readLine();
				
				System.out.println("Enter family relation :");
				String relation= br.readLine();
				
				System.out.println("Enter family phone no :");
				String phone= br.readLine();
				
				System.out.println("Enter family city :");
				String city= br.readLine();
				
				//create employee object to store the data 
				Family st = new Family(id,name,relation, phone,city);
				
				
				boolean ans = familyDao.insertFamily(st);
				
				if(ans)
				{
					System.out.println("family is added successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				break;
			
			case 2: // delete family
				System.out.println("enter family id which you want to delete");
				int userId = Integer.parseInt(br.readLine());
				boolean f= familyDao.deleteFamily(userId);
				if(f)
				{
					System.out.println("family data deleted successfully");
				}
				else
				{
					System.out.println("Something went wrong..!!");
				}
			
				break;
			
			case 3: // display employees 
				familyDao.showAllFamily();
				break;
			case 4: // update student
				System.out.println("enter family id whose data you want to update");
				int userId2 = Integer.parseInt(br.readLine());
				
				System.out.println("enter family id :");
				int id2 = Integer.parseInt(br.readLine());
				
				System.out.println("Enter family name :");
				String name2= br.readLine();
				
				System.out.println("Enter family relation :");
				String relation2= br.readLine();
				
				System.out.println("Enter family phone no :");
				String phone2= br.readLine();
				
				System.out.println("Enter family city :");
				String city2= br.readLine();
				
				//create employee object to store the data 
				Family st2 = new Family(id2,name2,relation2, phone2,city2);
				
				boolean ans2 =familyDao.updateFamily(st2,userId2);
				
				if(ans2)
				{
					System.out.println("family is updated successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st2);
				break;
		
				
			case 5: // exit
				go=false;
				break;
				
				
			default:
				System.out.println("wrong choice try again");
			}
			
			
			
			}
		System.out.println("thankyou for using my Family DBM application!!");
			
	
		}

	}




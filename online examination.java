// Task no-4 (Online Examination) 
import java.util.*;
class OnlineExam
{   //Creates Object For Scanner
	Scanner sc = new Scanner(System.in);
	//Provides Map Interface i.e- (Key,Value)Pairs
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("XYZ", 1234);
		info.put("LMN",    8764);
		info.put("OPQ",   2234);
		info.put("RST",     2222);
		info.put("UVW",   1111);
		String id;
		int pwd;
		//For Printing
		System.out.println("Please Login Using Your Credentials!");
		System.out.println("Enter Your User Name/ID:");
		//For reading User id token
		id = sc.next();
		System.out.println("Enter Your Password:");
		//For reading password token
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nYou have Successfully Login To The Exam!");
			menu();
		}
		else
		{
			System.out.println("\nIncorrest User Name/ID Or Password!\nEnter With Correct Credentials!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter Your Choice:");
		System.out.println("1.Update/Reset Profile \n2.Start Exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a valid operation!");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter Your username/ID:");
		update_id = sc.next();
		System.out.println("Enter Your old password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter New password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password Reset Successfully!");
		}
		else
		{
			System.out.println("User Data Not Found!\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		
		System.out.println("Instructions:(Attention)");
		System.out.println("1. Totally Five Questions You Will Face");
		System.out.println("2. All Questions Are Compulsory");
		System.out.println("3. Each Correct Answer Will Add 5 marks For You");
		System.out.println("4. For Each Wrong Answer 1 Mark Will Be Reduced From Your Total Obtained Marks");
		System.out.println("5. Time limit to complete the exam is 5 minutes");
		System.out.println("\n All The Best!\n");
		System.out.println("*******Exam has started*******");
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q1.Which component is used to compile, debug and execute the java programs?");
			System.out.println("1.JVM \t2.JIT \t3.JDK\t4.JRE");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q2.Which of these are selection statements in Java?");
			System.out.println("1.break\t2.continue\t3.for()\t4.if()");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q3.Which of the following is a member of the java.lang package?");
			System.out.println("1.Math\t2.Stack\t3.Queue\t4.List");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q4.Which of the following is not a code editor");
			System.out.println("1.Notepad++\t2.NetBeans\t3.Notepad\t4.JEdit");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q5.In JAVA, The Dynamic Array Are Known AS: ");
			System.out.println("1.Kubernates\t2.Remote\t3.Vectors\t4.Cycle");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			System.out.println("-------------------------------------------------------------");
			break;
		}
		System.out.println("You have Submitted Answers");
		System.out.println();
		System.out.println("Your Score is "+score);
		if(score>10)
			System.out.println("Congratulations To You!");
		else
			System.out.println("Better Luck!Appear This Again");
	}
	public static void main(String args[])
	{
		OnlineExam obj = new OnlineExam();
		obj.login();
	}
}

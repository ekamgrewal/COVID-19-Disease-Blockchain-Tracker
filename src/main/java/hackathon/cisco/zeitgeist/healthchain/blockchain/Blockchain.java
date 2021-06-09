package hackathon.cisco.zeitgeist.healthchain.blockchain;
// package cisco_Project;

import java.util.ArrayList;
import java.sql.Date;
import java.util.*;


public class Blockchain {
	
	public static Stack<Block> s = new Stack<Block>();

	public static void main(String[] args)
	{
		Date date = new Date(2019,11,17);
		// https://www.livescience.com/first-case-coronavirus-found.html
		PatientInfo p=new PatientInfo("patient zero","Gender,address","55","insurance");
		HospitalInfo h=new HospitalInfo("Hubei Provincial Hospital","Wuhan");
		DiseaseInfo d=new DiseaseInfo("Covid-19","Symptons");
		
		String UserID = "Dr. Zhang Jixian";
		Date CaseOpended = date;

		Report R0=new Report(UserID,CaseOpended,p,d,h);
		
		List<Report> one =new ArrayList<Report>();
		one.add(R0);
		/*
		 * Block Chain-
		 * Block - hash of previous block + transaction 
		 * chained together
		 */
		
		Block firstBlock = new Block(0,one);
		s.push(firstBlock);

		Block SecondBlock = new Block(s.peek().hashCode(),one);
		
		System.out.println(firstBlock.hashCode() + " " + firstBlock.getPreviousHash());
		System.out.println(SecondBlock.hashCode() + " " + SecondBlock.getPreviousHash());
	}

}

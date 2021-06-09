package hackathon.cisco.zeitgeist.healthchain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import java.sql.Date; 

import hackathon.cisco.zeitgeist.healthchain.blockchain.Block;
import hackathon.cisco.zeitgeist.healthchain.blockchain.Blockchain; 
import hackathon.cisco.zeitgeist.healthchain.blockchain.Report;
import hackathon.cisco.zeitgeist.healthchain.blockchain.DiseaseInfo;

@Controller
@RequestMapping("/diseases")
public class DiseasesController {
	
	@RequestMapping("/existing")
	public String goToExistingDiseasesPage() {
		return "diseaserecords";
	}
	
	
	@RequestMapping("/create")
	@ResponseBody
	public String goToDiseaseCreatorPage() {
		return "diseaserecordcreator"; 
	}
	
	@RequestMapping("/recordSubmitted")
	public String submitDiseaseRecord(
			@RequestParam(value = "diseaseName", required = true) String diseaseName,
			@RequestParam(value = "diseaseSymptoms", required = true) String diseaseSymptoms) {
		
		DiseaseInfo d = new DiseaseInfo(diseaseName, diseaseSymptoms);
		Date date = new Date(2019,11,17); 
		Report r = new Report("Dr. Natalie Picton", date, null, d, null);
		List<Report> reports = new ArrayList<Report>();
		reports.add(r); 
		Block newBlock = new Block(Blockchain.s.peek().hashCode(), reports);
		Blockchain.s.push(newBlock);
		return "recordcreated"; 
	}
	
	@RequestMapping("/recordCancelled")
	public String cancelDiseaseRecord() {
		return "recordcancelled"; 
	}
	
}

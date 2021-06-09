package hackathon.cisco.zeitgeist.healthchain.controllers;

import hackathon.cisco.zeitgeist.healthchain.blockchain.Block;
import hackathon.cisco.zeitgeist.healthchain.blockchain.Blockchain; 
import hackathon.cisco.zeitgeist.healthchain.blockchain.Report;
import hackathon.cisco.zeitgeist.healthchain.blockchain.PatientInfo;

import java.util.ArrayList;
import java.util.List;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/patients")
public class PatientsController {
	
	@RequestMapping("/existing")
	public String goToExistingPatientsPage() {
		return "patientrecords";
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String goToPatientCreatorPage() {
		return "patientrecordceator"; 
	}
	
	@RequestMapping("/recordSubmitted")
	public String submitPatientRecord(
			@RequestParam(value = "patientName", required = true) String patientName,
			@RequestParam(value = "patientAge", required = true) String patientAge,
			@RequestParam(value = "patientInfo", required = true) String patientInfo,
			@RequestParam(value = "insuranceId", required = true) String insuranceId) {
		
		PatientInfo p = new PatientInfo(patientName, patientAge, patientInfo, insuranceId);
		List<Report> reports = new ArrayList<Report>();
		Date date = new Date(2019,11,17);
		Report r = new Report("Dr. Oscar MacDougall", date, p, null, null);
		reports.add(r);
		Block newBlock = new Block(Blockchain.s.peek().hashCode(), reports);
		Blockchain.s.push(newBlock);
		return "recordcreated"; 
	}
	
	@RequestMapping("/recordCancelled")
	public String cancelPatientRecord() {
		return "recordcancelled"; 
	}

}

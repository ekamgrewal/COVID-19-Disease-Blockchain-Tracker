package hackathon.cisco.zeitgeist.healthchain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HealthchainController {

	@RequestMapping("/")
	public String showHome() {
		return "index.html"; 
	}
	
	@GetMapping("/patients")
	public String goToPatientsPage() {
		return "patientspage"; 
	}
	
	@GetMapping("/diseases")
	public String goToDiseasesPage() {
		return "diseasespage"; 
	
	}
	
	@GetMapping("/hospitals")
	public String goToHospitalsPage() {
		return "hospitalpage"; 
	
	}
	
	@GetMapping(value = "/redirect")
	public String returnToIndex() {
		return "redirect:/"; 
	}
}

package hackathon.cisco.zeitgeist.healthchain.blockchain;
// package cisco_Project;

import java.sql.Date;

public class Report implements GenericReport{

	private String UserID; // Which user is inputting information
	private Date CaseOpended;
	private PatientInfo patientDetails;
	private DiseaseInfo diseaseDetails; 
	private HospitalInfo hospitalDetails; 
	
	public Report(String UserID, Date CaseOpended,PatientInfo patientDetails, DiseaseInfo diseaseDetails, HospitalInfo hospitalDetails)
	{
		this.UserID=UserID;
		this.CaseOpended=CaseOpended;
		this.patientDetails=patientDetails;
		this.diseaseDetails=diseaseDetails;
		this.hospitalDetails=hospitalDetails;
	}
	
	public Report(String employeeID, Date dateAdmitted) {
		this.UserID=UserID;
		this.CaseOpended=CaseOpended;
	}

	public String getUserID()
	{
		return UserID;
	}
	public Date CaseOpended()
	{
		return CaseOpended;
	}
	@Override
	public boolean equals(Object o)
	{
	 if(this==o) return true;
	 if(o==null || getClass() !=o.getClass()) return false;
	 Report that=(Report) o;
	 if(UserID !=null ? !this.UserID.equals(that.UserID) : that.UserID!=null) return false;
	 return CaseOpended != null ? this.CaseOpended.equals(that.CaseOpended) : that.CaseOpended == null;
	}
	@Override
    public int hashCode() {
        int result = UserID != null ? UserID.hashCode() : 0;
        result = 31 * result + (CaseOpended != null ? CaseOpended.hashCode() : 0);
        return result;
    }

	@Override
	public String getHospitalName() {
		return hospitalDetails.getHospitalName();
	}

	@Override
	public String getPatientName() {
		
		return patientDetails.getPatientName();
	}

	@Override
	public String getDestinationName() {
		
		return hospitalDetails.getHospitalLocation();
	}
}

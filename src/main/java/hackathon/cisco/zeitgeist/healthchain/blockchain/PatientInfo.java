package hackathon.cisco.zeitgeist.healthchain.blockchain;

import java.sql.Date;

public class PatientInfo extends Report{
	private String PatientName;
	private String PatientInfo;
	private String PatientAge;
    private String insuranceID;
    private static String DocterID; // Docter ID should match/is the with the UserID in the main report class
    private static Date DateAdded; // the date added should match the case opened date
    

	public PatientInfo(String PatientName,String PatientInfo,String PatientAge,String insuranceID) {
		super(DocterID,DateAdded);
		// TODO Auto-generated constructor stub
		this.PatientName=PatientName;
		this.PatientInfo=PatientInfo;
		this.PatientAge=PatientAge;
		this.insuranceID=insuranceID;
	}
	public String getPatientName()
	{
		return this.PatientName;
	}
	public String getPatientInfo()
	{
		return this.PatientInfo;
	}
	public String getPatientAge()
	{
		return this.PatientAge;
	}
	public String getinsuranceID()
	{
		return this.insuranceID;
	}
    public int hashCode() {
        int result = PatientName != null ? PatientName.hashCode() : 0;
        result = 31 * result + (PatientInfo != null ? PatientInfo.hashCode() : 0);
        result = 31 * result + (PatientAge != null ? PatientAge.hashCode() : 0);
        result = 31 * result + (insuranceID != null ? insuranceID.hashCode() : 0);
        return result;
    }
	public boolean equals(Object o)
	{
	 if(this==o) return true;
	 if(o==null || getClass() !=o.getClass()) return false;
	 Report that=(Report) o;
	 if(PatientName !=null ? !this.PatientName.equals(that.getPatientName()) : that.getPatientName() !=null) return false;
	 if(PatientAge !=null ? !this.PatientAge.equals(that.getPatientName()) : that.getPatientName()!=null) return false;
	 if(PatientInfo !=null ? !this.PatientInfo.equals(that.getPatientName()) : that.getPatientName()!=null) return false;
	 if (insuranceID != null)
		return this.insuranceID.equals(((PatientInfo) that).getinsuranceID());
	else
		return ((PatientInfo) that).getinsuranceID() == null;
	}

}

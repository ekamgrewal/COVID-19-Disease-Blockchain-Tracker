package hackathon.cisco.zeitgeist.healthchain.blockchain;
// package cisco_Project;

import java.sql.Date;

public class DiseaseInfo extends Report{
	private String DiseaseName;
	private String DiseaseSymptoms;
	private static String diagnostitianID; // should match with the userID of report
	private static Date dateDiagnosed;

	public DiseaseInfo(String DiseaseName,String DiseaseSymptoms) {
		// TODO Auto-generated constructor stub
		super(diagnostitianID,dateDiagnosed);
		this.DiseaseName=DiseaseName;
		this.DiseaseSymptoms=DiseaseSymptoms;
	}
	public String getDiseaseName()
	{
		return this.DiseaseName;
	}
	public String getDiseaseSymptoms()
	{
		return this.DiseaseSymptoms;
	}
	
	 public int hashCode() {
	        int result = DiseaseName != null ? DiseaseName.hashCode() : 0;
	        result = 31 * result + (DiseaseSymptoms != null ? DiseaseSymptoms.hashCode() : 0);
	        return result;
	    }
		public boolean equals(Object o)
		{
		 if(this==o) return true;
		 if(o==null || getClass() !=o.getClass()) return false;
		 Report that=(Report) o;
		 if(DiseaseName !=null ? !this.DiseaseName.equals(that.getPatientName()) : that.getPatientName() !=null) return false;
		 if (DiseaseSymptoms != null)
			return this.DiseaseSymptoms.equals(((DiseaseInfo) that).getDiseaseSymptoms());
		else
			return ((DiseaseInfo) that).getDiseaseSymptoms() == null;
		}

}

package hackathon.cisco.zeitgeist.healthchain.blockchain;
// package cisco_Project;

import java.sql.Date;

public class HospitalInfo extends Report{
	private String HospitalName;
	private String HospitalLocation;
	private static String EmployeeID; // should match userID in report
	private static Date dateAdmitted;
	

	public HospitalInfo(String HospitalName, String HospitalLocation) {
		// TODO Auto-generated constructor stub
		super(EmployeeID,dateAdmitted);
		this.HospitalName=HospitalName;
		this.HospitalLocation=HospitalLocation;
		
		
	}
	public String getHospitalName()
	{
		return HospitalName;
	}
	public String getHospitalLocation()
	{
		return HospitalLocation;
	}
	public boolean equals(Object o)
	{
	 if(this==o) return true;
	 if(o==null || getClass() !=o.getClass()) return false;
	 Report that=(Report) o;
	 if(HospitalName !=null ? !this.HospitalName.equals(that.getHospitalName()) : that.getHospitalName()!=null) return false;
	 return HospitalLocation != null ? this.HospitalLocation.equals(that.getHospitalName()) : that.getHospitalName() == null;
	}
	@Override
    public int hashCode() {
        int result = HospitalName != null ? HospitalName.hashCode() : 0;
        result = 31 * result + (HospitalLocation != null ? HospitalLocation.hashCode() : 0);
        return result;
    }

}

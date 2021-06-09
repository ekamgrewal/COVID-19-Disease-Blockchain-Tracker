package hackathon.cisco.zeitgeist.healthchain.blockchain;
// package cisco_Project;

import java.util.*;

public class Block {
private int	previousHash;
private int blockHash;
private List<Report> Report; 


 public Block(int previousHash,List<Report> Report)
 {
	 this.previousHash=previousHash;
	 this.Report=Report;
	 
	 //List<Report> contents= {Arrays.hashCode(Report),previousHash};
	 this.blockHash=this.hashCode();
 }
 public int getHash()
 {
	 return blockHash;
 }
 public void setHash(int blockHash)
 {
	this.blockHash = blockHash; 
 }
 public int getPreviousHash()
 {
	 return previousHash;
 }
 public void setPreviousHash(int previousHash)
 {
	this.previousHash=previousHash; 
 }
 public List<Report> getPatientReport()
 {
	 return Report;
 }
 public void setPatientReport(List<Report> Report)
 {
	 this.Report=Report;
 }
 @Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (o == null || getClass() != o.getClass()) return false;

     Block block = (Block) o;

     if (previousHash != block.previousHash) return false;
     return Report != null ? Report.equals(block.Report) : block.Report == null;
 }
 @Override
 public int hashCode() {
     int result = previousHash;
     result = 31 * result + (Report != null ? Report.hashCode() : 0);
     return result;
 }

 
}

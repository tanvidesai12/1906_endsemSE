package hibernate_project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CANDIDATE")
public class Candidate {
	@Id 
	private int id;
	private int totpoints;
	
	
	private String aname;
	
	private Boolean complHSSC;
	
	private Boolean complgrad;
	
	private Boolean complmaster;
	
	private Boolean sports;
	
	 
	 
	public Candidate() {
		super();
	}

	public Candidate(int id, String aname, Boolean complHSSC, Boolean complgrad, Boolean complmaster,Boolean sports) {
		super();
		this.id = id;
		this.aname = aname;
		this.complHSSC = complHSSC;
		this.complgrad = complgrad;
		this.complmaster = complmaster;
		this.sports = sports;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}

	public Boolean getComplHSSC() {
		return complHSSC;
	}

	public void setComplHSSC(Boolean complHSSC) {
		this.complHSSC = complHSSC;
	}

	public Boolean getComplgrad() {
		return complgrad;
	}

	public void setComplgrad(Boolean complgrad) {
		this.complgrad = complgrad;
	}

	public Boolean getComplmaster() {
		return complmaster;
	}

	public void setComplmaster(Boolean complmaster) {
		this.complmaster = complmaster;
	}
	
	
	public Boolean getSports() {
		return sports;
	}

	public void setSports(Boolean sports) {
		this.sports = sports;
	}

	public void calculateTotPoints() {
		int p1=0,p2=0,p3=0,p4=0;
		if(complgrad) {
			p1=3;
		}
		if(complHSSC) {
			p2=1;
		}
		if(complmaster) {
			p3=5;
		}
		if(sports) {
			p4=3;
		}
		
		totpoints=p1+p2+p3+p4;
		System.out.println("Your points are"+totpoints);
	}
	
}

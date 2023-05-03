package ch02;

public class ManagerB extends Employee {
	
	private String manageJob;
	
	public String getManageJob() {
		return manageJob;
	}
	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getName());
		sb.append("|");
		sb.append(this.getJobTitle());
		sb.append("|");
		sb.append(manageJob);
		
		return sb.toString();
	}

}

package projectPart1;

public class DataPoint {
	private Double f1;
	private Double f2;
	private String label;
	private Boolean isTest;
	
	public DataPoint() {
		this.f1 = 0.0;
		this.f2 = 0.0;
		this.label = "";
		this.isTest = null;
	}
	public DataPoint(Double f, Double f2, String label, boolean iParam) {
		this.f1 = f;
		this.f2 = f2;
		this.label = label;
		this.isTest = false;
		
	}
	public Double getF1() {
		return this.f1;
	}
	public Double getF2() {
		return this.f2;
	}
	public String getLabel() {
		return this.label;
	}
	public Boolean getIsTest() {
		return this.isTest;
	}
	public void setF1(Double f) {
		this.f1 = f;
	}
	public void setF2(Double f2) {
		this.f2 = f2;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public void setIsTest(boolean iParam) {
		this.isTest = iParam;
	}
	

}

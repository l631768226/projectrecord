package hsoft.mobile.projectrecord.model;

public class Validation {
	
	private String field;
	private String error;
	
	public Validation(String field , String error){
		this.field = field;
		this.error = error;
	}
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "[field = "+ field + ", " + "error = "+ error + ", "
				+"getField() = " + getField() + ", "
				+"getError() = " + getError() + ", "
				+"getClass() = " + getClass() + ", "
				+"hashCode() = " + hashCode() + ", "
				+"toString() = " + super.toString()
				+"]";
	}
}

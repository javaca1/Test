package enumpkg;

public class Season {
	public enum SeasonEnum {
		SPRING(1, "Spring","This Spring season"), SUMMER(2,"Summer"), FALL(3, "Fall"), WINTER(4, "Winter");
		
		public int code;
		public String sString;
		public String description;

		private SeasonEnum(int code, String sString) {
			this.code = code;
			this.sString = sString;
		}
		private SeasonEnum(int code, String sString, String desc) {
			this.code = code;
			this.sString = sString;
			this.description = desc;
		}
	}

	public static void main(String[] args) {
		for (SeasonEnum cName : SeasonEnum.values()) {
			System.out.println("Company Code: " 
		+ cName.code + " - Company sString: " + cName.sString
		+ " - Company description: "+ cName.description
	 + " - Company Name(): "+ cName.name());
		}

	}
}
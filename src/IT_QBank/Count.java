package IT_QBank;

public class Count {
	
	static int Count;
	public static int setCount() {
		Count++;
		return Count;
	}
	public static int setRestCount() {
		Count = 0;
		return Count;
	}
	public static String getCount() {
		String Score = String.valueOf(Count);
		return Score;
	}
//	----------------------------------------------
	static int Total;
	public static int setTotal() {
		Total++;
		return Total;
	}
	public static int setRestTotal() {
		Total = 0;
		return Total;
	}
	public static String getTotal() {
		String Score = String.valueOf(Total);
		return Score;
	}
		 
	}



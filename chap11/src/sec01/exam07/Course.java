package sec01.exam07;

import java.util.*;

public class Course<T> {
	private String cName;
	private ArrayList<T> mList = new ArrayList<>();
	
	public Course(String cName) {
		this.cName = cName;
	}
	
	public String getcName() {
		return cName;
	}

	public ArrayList<T> getmList() {
		return mList;
	}

	public void setmList(ArrayList<T> mList) {
		this.mList = mList;
	}
	
	
}

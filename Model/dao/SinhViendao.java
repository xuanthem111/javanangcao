package dao;

import java.util.ArrayList;

import bean.Khoabean;
import bean.SinhVienbean;


public class SinhViendao {
	public ArrayList<SinhVienbean> getSv(){
		ArrayList<SinhVienbean> ds = new ArrayList<SinhVienbean>();
		ds.add(new SinhVienbean("sv1", "Nguyen Van A", "Hue", 7.5, "CNTT"));
		ds.add(new SinhVienbean("sv2", "Nguyen Van B", "Hue", 7.0, "CNTT"));
		ds.add(new SinhVienbean("sv3", "Nguyen Van C", "Hue", 5.7, "CNTT"));
		ds.add(new SinhVienbean("sv4", "Nguyen Van D", "Hue", 9.5, "CNTT"));
		ds.add(new SinhVienbean("sv5", "Nguyen Van E", "Hue", 8.1, "CNTT"));
		return ds;
	}
}

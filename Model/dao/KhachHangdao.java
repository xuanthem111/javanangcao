package dao;
import bean.KhachHangbeab;
import bean.Khoabean;

import java.util.ArrayList;

public class KhachHangdao {
	public ArrayList<KhachHangbeab> getkhachhang(){
		 ArrayList<KhachHangbeab> ds= new ArrayList<KhachHangbeab>();
		 ds.add(new KhachHangbeab("kh1", "My","Huế","123456"));
		 ds.add(new KhachHangbeab("kh2", "Nguyễn Văn B","Quảng Trị","123123"));
		 ds.add(new KhachHangbeab("kh3", "Nguyễn Văn C","Quảng Ngãi","123321"));
		 ds.add(new KhachHangbeab("kh4", "Nguyễn Văn D","Quảng Nam","123111"));
		 return ds;
	}
}

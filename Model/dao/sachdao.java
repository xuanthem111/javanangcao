package dao;
import java.util.ArrayList;

import bean.sachbean;

public class sachdao {
	public ArrayList<sachbean> getsach(){
		   ArrayList<sachbean> ds= new ArrayList<sachbean>();
		   ds.add(new sachbean("s1", "Cấu trúc dữ liệu", "Đỗ Ngọc", (long)120000, (long)1000,"b11.jpg", "cntt"));
		   ds.add(new sachbean("s2", "Cơ sở dữ liệu", "Đỗ Ngọc", (long)120000, (long)1000,"b12.jpg", "Kien truc"));
		   ds.add(new sachbean("s3", "lập trình Java", "Quách Tuấn Ngọc", (long)120000, (long)1000,"b14.jpg", "Hoa"));
		   ds.add(new sachbean("s11", "Cấu trúc dữ liệu1", "Đỗ Ngọc", (long)120000,(long)1000,"b21.jpg", "Ly"));
		   ds.add(new sachbean("s22", "Cơ sở dữ liệu2", "Đỗ Ngọc", (long)120000, (long)1000,"b22.jpg", "toan"));
		   ds.add(new sachbean("s33", "lập trình Java3", "Quách Tuấn Ngọc", (long)120000, (long)1000,"b24.jpg", "su"));
		   ds.add(new sachbean("s4", "Đại chất công trình", "Đỗ Ngọc", (long)120000, (long)1000,"b15.jpg", "cong dan"));
		   ds.add(new sachbean("s5", "Bản đồ", "Đỗ Ngọc", (long)120000, (long)1000,"b11.jpg", "dia"));
		   return ds;
	   }

}

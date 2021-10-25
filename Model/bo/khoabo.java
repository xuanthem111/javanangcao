package bo;

import java.util.ArrayList;

import bean.Khoabean;
import dao.Khoadao;

public class khoabo {
	Khoadao kdao= new Khoadao();
	public ArrayList<Khoabean> getkhoa(){
		return kdao.getkhoa();
	}

}

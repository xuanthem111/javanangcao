package bo;
import java.util.ArrayList;
import dao.loaidao;
import bean.loaibean;
public class loaibo {
   loaidao ldao = new loaidao();
   public ArrayList<loaibean> getloai(){
		return ldao.getloai();
	}
   
}

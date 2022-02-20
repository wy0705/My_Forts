
import com.mf.game.engine.DemoApplication;
import com.mf.game.engine.db.controller.UserController;
import com.mf.game.engine.db.dao.hbaseImpl.EquipUtil;
import com.mf.game.engine.db.dao.hbaseImpl.FortUtil;
import com.mf.game.engine.db.entry.Equip;
import com.mf.game.engine.util.Contans;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.sql.SQLException;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

    @Autowired
//    private UserUtil userUtil;
//    private FoundMessageService foundMessageService;
//    private LoseMessageService loseMessageService;
    private FortUtil fortUtil;
//    private EquipUtil equipUtil;

//    private UserController userController;
    @Test
    void test() throws SQLException, IOException, ClassNotFoundException {

//        fortUtil.xx("1,22");
//        userUtil.add("aa","188222","12345");
//        userUtil.loginUser("况雪","12345");
//        userController.UserLogin("况雪","12345");
//        userController.register("aaa","19999999","12345");
//        userController.UserLogin("况雪","12345");
//        fortUtil.add("1,22","ddd");
//        fortUtil.add("1231,2422","ccc");
        fortUtil.setData("1,22");
//        equipUtil.xxx();
//        fortUtil.queryAll(Contans.FORT_TABLE);
//        fortUtil.getData(Contans.FORT_TABLE,"1,22");
//        Equip equip=new Equip("aa","bbb","ccc","ddd",12);
//        equipUtil.insertData(equip);
//        equipUtil.add("aaa","bbb","ccc","ddd",12);
    }


}

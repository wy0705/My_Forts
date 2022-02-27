package com.mf.game.engine.db.tableserver;


import com.mf.game.engine.db.hbase.HbaseUtil;
import com.mf.game.engine.util.Contans;
import org.apache.hadoop.hbase.TableName;

import java.io.IOException;

public class UserEquip extends HbaseUtil {
//    用户购买装备时往表中添加一条数据
//    用户可以查看自己的装备信息

    @Override
    public void insertData(String tbname, String rowKey, String family, String qualifier, String value) {
        super.insertData(tbname, rowKey, family, qualifier, value);
    }

   /* @Override
    public void getData(String tbname, String rowKey) throws IOException {

    }

    @Override
    public void queryAll(String tbname) {
        TableName tableName = TableName.valueOf(Contans.USER_EQUIP_TABLE);
    }*/
}

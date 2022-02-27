package com.mf.game.engine.db.tableserver;


import com.mf.game.engine.db.hbase.HbaseUtil;

public class MerchantFortUtil extends HbaseUtil {
//    商户购买堡垒时添加一条数据
//    商户可以转卖堡垒，删除一条数据
//    商户可以修改此堡垒的广告内容
//    查看堡垒显示的广告内容

    @Override
    public void insertData(String tbname, String rowKey, String family, String qualifier, String value) {
        super.insertData(tbname, rowKey, family, qualifier, value);
        long lt=System.currentTimeMillis();
//        String rowKey=

    }
}

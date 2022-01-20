package com.mf.game.engine.db.tableserver;

import com.mf.game.engine.db.HbaseUtil;

public class MerchantUtil extends HbaseUtil {

    //增加商户信息，增加广告内容

    @Override
    public void insertData(String tbname, String rowKey, String family, String qualifier, String value) {
        super.insertData(tbname, rowKey, family, qualifier, value);
    }
}

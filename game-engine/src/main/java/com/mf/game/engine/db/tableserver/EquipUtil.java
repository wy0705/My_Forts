package com.mf.game.engine.db.tableserver;

import com.mf.game.engine.db.Contans;
import com.mf.game.engine.db.HbaseUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EquipUtil extends HbaseUtil {
//    装备有增加装备

    @Override
    public void insertData(String tbname, String EquipId, String family, String qualifier, String value) {
        Table table = null;
        try {
            Connection hc = ConnectionFactory.createConnection(config);
            TableName tableName=TableName.valueOf(Contans.EQUIP_TABLE);
            table = hc.getTable(tableName);
//            long ts=System.currentTimeMillis();

//            //行键用时间戳+。。。生成
//            String rowkey1=rowKey+ts;

            List rows = new ArrayList();
            Put put = new Put(Bytes.toBytes(EquipId));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            Put put1 = new Put(Bytes.toBytes(EquipId));
            put1.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            put1.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            rows.add(put1);
            table.put(rows);
            System.out.println("添加成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                table.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

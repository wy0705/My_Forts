package com.mf.game.engine.db.tableserver;

import com.mf.game.engine.db.Contans;
import com.mf.game.engine.db.HbaseUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FortUtil extends HbaseUtil {
//    堡垒表进行增加堡垒，查看堡垒


    @Override
    public void insertData(String tbname, String FortId, String family, String qualifier, String value) {
        Table table = null;
        try {
            Connection hc = ConnectionFactory.createConnection(config);
            TableName tableName = TableName.valueOf(Contans.EQUIP_TABLE);
            table = hc.getTable(tableName);

            List rows = new ArrayList();
            Put put = new Put(Bytes.toBytes(FortId));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            Put put1 = new Put(Bytes.toBytes(FortId));
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

    @Override
    public void getData(String tbname, String FortId) throws IOException {

//        Table table = null;
//        try {
//            Connection hc = ConnectionFactory.createConnection(config);
            TableName tableName = TableName.valueOf(Contans.EQUIP_TABLE);
//            table = hc.getTable(tableName);
//            Get get = new Get(FortId.getBytes());
//            //利用get对象信息获取对应的结果result
//            Result result = table.get(get);
//            //获取rowkey
//            byte[] row = result.getRow();
//            //获取cell
//            byte[] name = result.getValue("cf1".getBytes(), "name".getBytes());
//            System.out.println(Bytes.toString(name));
//            //row的类型是字节数组，所以应该借助Bytes转换成字符串输出
//            System.out.println(Bytes.toString(row));
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                table.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }

    //装备表分页

}

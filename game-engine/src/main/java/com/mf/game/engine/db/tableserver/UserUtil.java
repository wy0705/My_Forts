package com.mf.game.engine.db.tableserver;


import com.mf.game.engine.db.hbase.HbaseUtil;
import com.mf.game.engine.util.Contans;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserUtil extends HbaseUtil {
    //    用户表的增删改查
    //    增加数据

    @Override
    public void insertData(String tbname, String userid, String family, String qualifier, String value) {
        super.insertData(tbname, userid, family, qualifier, value);
        Table table = null;
        try {
            Connection hc = ConnectionFactory.createConnection(config);
            TableName tableName = TableName.valueOf(Contans.USER_TABLE);
            table = hc.getTable(tableName);

            List rows = new ArrayList();

            Put put = new Put(Bytes.toBytes(userid));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),
                    Bytes.toBytes(value));
            Put put1 = new Put(Bytes.toBytes(userid));
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
    //删除数据
    @Override
    public void deleteData(String tbname, String rowKey) {
        super.deleteData(tbname, rowKey);
        Table table = null;
        try {
            Connection hc = ConnectionFactory.createConnection(config);
            TableName tableName = TableName.valueOf(Contans.USER_TABLE);
            table = hc.getTable(tableName);


            Delete del = new Delete(Bytes.toBytes(rowKey));
            table.delete(del);
            System.out.println("删除数据成功");
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

    //    修改数据信息
    public void update(String tbname,String userid, String family, String qualifier, String value){
    //        先删除再添加
        deleteData(tbname,userid);
        insertData(tbname,userid,family,qualifier,value);

    }


    //查找数据
   /* @Override
    public void getData(String tbname, String userid) throws IOException {
//        super.getData(tbname, rowKey);
        Table table = null;
        try {
            Connection hc = ConnectionFactory.createConnection(config);
            TableName tableName = TableName.valueOf(Contans.USER_TABLE);
            table = hc.getTable(tableName);
            Get get = new Get(userid.getBytes());
            //利用get对象信息获取对应的结果result
            Result result = table.get(get);
            //获取rowkey
            byte[] row = result.getRow();
            //获取cell
            byte[] name = result.getValue("cf1".getBytes(), "name".getBytes());
            System.out.println(Bytes.toString(name));
            //row的类型是字节数组，所以应该借助Bytes转换成字符串输出
            System.out.println(Bytes.toString(row));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                table.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }*/
}

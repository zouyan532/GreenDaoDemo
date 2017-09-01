package demo.zouyan.com.greendaodemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.github.yuweiguocn.library.greendao.MigrationHelper;

import demo.zouyan.com.greendaodemo.gen.DaoMaster;
import demo.zouyan.com.greendaodemo.gen.DaoSession;
import demo.zouyan.com.greendaodemo.gen.MySQLiteOpenHelper;

/**
 * Created by Boosal on 2017/9/1.
 */

public class BaseAppliaction extends Application {
    private static DaoSession session;
    @Override
    public void onCreate() {
        super.onCreate();
        initDataDao();
    }

    private void initDataDao() {
        //创建数据库shop.db"
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "person.db", null);
        MigrationHelper.DEBUG = true;  //if you want see the log info,default is false
        MySQLiteOpenHelper helper = new MySQLiteOpenHelper(this, "test.db");
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        session = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return session;
    }
}

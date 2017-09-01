package demo.zouyan.com.greendaodemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import demo.zouyan.com.greendaodemo.gen.DaoMaster;
import demo.zouyan.com.greendaodemo.gen.DaoSession;

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
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "person.db", null);
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

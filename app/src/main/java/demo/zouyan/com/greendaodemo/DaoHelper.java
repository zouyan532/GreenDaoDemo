package demo.zouyan.com.greendaodemo;

import java.util.List;

/**
 * Created by Boosal on 2017/9/1.
 */

public class DaoHelper {
    /**
     * 添加数据，如果有重复则覆盖
     *
     */
    public static void insert(Person person) {
        BaseAppliaction.getDaoInstant().getPersonDao().insertOrReplace(person);
    }

    /**
     * 删除数据
     *
     */
    public static void delete(long id) {
        BaseAppliaction.getDaoInstant().getPersonDao().deleteByKey(id);
    }

    /**
     * 更新数据
     *
     */
    public static void update(Person person) {
        BaseAppliaction.getDaoInstant().getPersonDao().update(person);
    }

    /**
     * 查询所有数据
     * @return
     */
    public static List<Person> queryAll() {
        return BaseAppliaction.getDaoInstant().getPersonDao().loadAll();
    }

}

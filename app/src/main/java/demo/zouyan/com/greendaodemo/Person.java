package demo.zouyan.com.greendaodemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Boosal on 2017/9/1.
 */
@Entity
public class Person {
    //不能用int
    @Id(autoincrement = true)
    private Long id;
    @Unique
    private String name;
    @Generated(hash = 628813901)
    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 1024547259)
    public Person() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

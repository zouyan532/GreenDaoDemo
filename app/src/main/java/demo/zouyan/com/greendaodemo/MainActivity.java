package demo.zouyan.com.greendaodemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Person> persons = DaoHelper.queryAll();
        Person person1 = new Person(1l,"张三",123);
        DaoHelper.insert(person1);
        person1 = new Person(2l,"张四",12);
        DaoHelper.insert(person1);
        person1 = new Person(3l,"张五",12);
        DaoHelper.insert(person1);
        person1 = new Person(4l,"张六",1);
        DaoHelper.insert(person1);
        person1.setName("张器");
        person1.setId(2l);
        DaoHelper.update(person1);
        persons = DaoHelper.queryAll();
        DaoHelper.delete(1l);
        persons = DaoHelper.queryAll();
        Log.i("TAG","TAG");
    }
}

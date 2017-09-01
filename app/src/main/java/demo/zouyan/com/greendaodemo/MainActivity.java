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
        Person person1 = new Person(1l,"张三");
        PersonDaoHelper.insert(person1);
        person1 = new Person(2l,"张四");
        PersonDaoHelper.insert(person1);
        person1 = new Person(3l,"张五");
        PersonDaoHelper.insert(person1);
        person1 = new Person(4l,"张六");
        PersonDaoHelper.insert(person1);
        List<Person> persons = PersonDaoHelper.queryAll();
        person1.setName("张器");
        person1.setId(2l);
        PersonDaoHelper.update(person1);
        persons = PersonDaoHelper.queryAll();
        PersonDaoHelper.delete(1l);
        persons = PersonDaoHelper.queryAll();
        Log.i("TAG","TAG");
    }
}

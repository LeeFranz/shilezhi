package leo.fragmentapp_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Fruit> mFruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFruitList();
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(mFruitList);
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initFruitList() {
        Fruit apple = new Fruit();
        apple.setmName(getRandomFruitName("apple"));
        apple.setmDescription("apple is good");
        mFruitList.add(apple);
        Fruit banana = new Fruit();
        banana.setmName(getRandomFruitName("banana"));
        banana.setmDescription("banana is good");
        mFruitList.add(banana);
        Fruit taozi = new Fruit();
        taozi.setmName(getRandomFruitName("taozi"));
        taozi.setmDescription("taozi is good");
        mFruitList.add(taozi);
        Fruit li = new Fruit();
        li.setmName(getRandomFruitName("li"));
        li.setmDescription("li is good");
        mFruitList.add(li);
        Fruit lizhi = new Fruit();
        lizhi.setmName(getRandomFruitName("lizhi"));
        lizhi.setmDescription("lizhi is good");
        mFruitList.add(lizhi);
        Fruit mihoutao = new Fruit();
        mihoutao.setmName(getRandomFruitName("mihoutao"));
        mihoutao.setmDescription("mihoutao is good");
        mFruitList.add(mihoutao);
        Fruit huolongguo = new Fruit();
        huolongguo.setmName(getRandomFruitName("huolongguo"));
        huolongguo.setmDescription("huolongguo is good");
        mFruitList.add(huolongguo);
        Fruit niuyouguo = new Fruit();
        niuyouguo.setmName(getRandomFruitName("niuyouguo"));
        niuyouguo.setmDescription("niuyouguo is good");
        mFruitList.add(niuyouguo);
        Fruit hongmaodan = new Fruit();
        hongmaodan.setmName(getRandomFruitName("hongmaodan"));
        hongmaodan.setmDescription("hongmaodan is good");
        mFruitList.add(hongmaodan);
        Fruit chengzi = new Fruit();
        chengzi.setmName(getRandomFruitName("chengzi"));
        chengzi.setmDescription("chengzi is good");
        mFruitList.add(chengzi);
        Fruit shepiguo = new Fruit();
        shepiguo.setmName(getRandomFruitName("shepiguo"));
        shepiguo.setmDescription("shepiguo is good");
        mFruitList.add(shepiguo);

    }

    private String getRandomFruitName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(name);
        }
        return stringBuilder.toString();
    }
}

package studio.container.com.projetobaseadaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private int [] imagesVegetables = {R.drawable.img2, R.drawable.img3,  R.drawable.img4,
            R.drawable.img5,  R.drawable.img6,};

    private String [] descricao;
    private String [] valores;

    ListaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_items);
        descricao = getResources().getStringArray(R.array.name_vegetables);
        valores = getResources().getStringArray(R.array.price_vegetables);
        int i =0;
        adapter = new ListaAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);
        for (String desc : descricao){
            Carrinho c = new Carrinho(imagesVegetables[i], desc, valores[i]);
            adapter.add(c);
            i++;
        }


    }
}

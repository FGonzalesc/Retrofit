package nofearcode.android.garibay_retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import nofearcode.android.garibay_retrofit.data.model.PokemonFeed;

public class MainActivity extends AppCompatActivity implements MainView {


    private MainPresenter presenter;
    private TextView name;
    private TextView name2;
    private TextView name3;
    private TextView name4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= (TextView)findViewById(R.id.tv_name);
        name2 =(TextView)findViewById(R.id.tv_2);
        name3=(TextView)findViewById(R.id.tv_3);
        name4=(TextView)findViewById(R.id.tv_4);

        presenter = new MainPresenter(this);

        presenter.getData();
    }

    @Override
    public void showdata(PokemonFeed pokemonFeed) {
        name.setText(pokemonFeed.getResults().get(2).getName());

    }
}

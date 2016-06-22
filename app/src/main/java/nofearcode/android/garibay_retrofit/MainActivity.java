package nofearcode.android.garibay_retrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import nofearcode.android.garibay_retrofit.data.model.Result;

public class MainActivity extends AppCompatActivity implements MainView {

    private RecyclerView recyclerView;

    private MainPresenter presenter;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.mi_recicler);
        adapter = new MainAdapter(MainActivity.this, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        presenter = new MainPresenter(this);
        presenter.getData();

    }

    @Override
    public void notifyDataSetChanged(List<Result> pokemon) {
        adapter.swap(pokemon);
    }


    @Override
    public void navigateToDetails(int idPokemon) {
        startActivity(new Intent(this, PokemonDetailActivity.class).putExtra("idPokemon", idPokemon));
    }
}

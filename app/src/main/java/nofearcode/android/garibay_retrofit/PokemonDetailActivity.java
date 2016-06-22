package nofearcode.android.garibay_retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import nofearcode.android.garibay_retrofit.data.model.Ability;

public class PokemonDetailActivity extends AppCompatActivity implements PokemonDetailView{

    private RecyclerView recyclerView;

    private PokemonDetailPresenter presenter;
    private PokemonDetailAdapter adapter;
    private int idPokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon_detail);
        idPokemon = getIntent().getIntExtra("idPokemon", 0);
        Log.d("idddddd", String.valueOf(idPokemon));
        recyclerView = (RecyclerView)findViewById(R.id.mi_recicler2);
        adapter = new PokemonDetailAdapter(PokemonDetailActivity.this, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        presenter = new PokemonDetailPresenter(this);
        presenter.getDataAbility(idPokemon);

    }

    @Override
    public void notifyDataSetChanged(List<Ability> ability) {
        adapter.swap(ability);
    }

}

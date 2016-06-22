package nofearcode.android.garibay_retrofit;

import android.util.Log;

import nofearcode.android.garibay_retrofit.data.api.RestClient;
import nofearcode.android.garibay_retrofit.data.api.RetrofitUtils;
import nofearcode.android.garibay_retrofit.data.model.AbilityFeed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by raitom on 22/06/16.
 */
public class PokemonDetailPresenter{

        private PokemonDetailView view;

        public PokemonDetailPresenter(PokemonDetailView pokemonDetailView) {
            this.view = pokemonDetailView;
        }
    public void getDataAbility(final int id) {
        RestClient restClient = RetrofitUtils.getInstance().create(RestClient.class);
        Call<AbilityFeed> call = restClient.getDataAbility(id);
        call.enqueue(new Callback<AbilityFeed>() {
            @Override
            public void onResponse(Call<AbilityFeed> call, Response<AbilityFeed> response) {
                switch (response.code()) {
                    case 200:
                        AbilityFeed ability = response.body();
                        view.notifyDataSetChanged(ability.getAbilities());
                        Log.e("yeeeeeeeh", ability.getAbilities().get(1).getAbility().getName());
                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<AbilityFeed> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }
}

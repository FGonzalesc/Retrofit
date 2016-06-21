package nofearcode.android.garibay_retrofit;

import android.util.Log;

import nofearcode.android.garibay_retrofit.data.api.RestClient;
import nofearcode.android.garibay_retrofit.data.api.RetrofitUtils;
import nofearcode.android.garibay_retrofit.data.model.PokemonFeed;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by raitom on 18/06/16.
 */
public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView mainView) {
        this.view = mainView;
    }

    public void getData() {
        RestClient restClient = RetrofitUtils.getInstance().create(RestClient.class);
        Call<PokemonFeed> call = restClient.getData();
        call.enqueue(new Callback<PokemonFeed>() {
            @Override
            public void onResponse(Call<PokemonFeed> call, Response<PokemonFeed> response) {
                switch (response.code()) {
                    case 200:
                        PokemonFeed data = response.body();
                        view.notifyDataSetChanged(data.getResults());
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<PokemonFeed> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }
}

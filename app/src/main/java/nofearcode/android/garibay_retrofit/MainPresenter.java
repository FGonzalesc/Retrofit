package nofearcode.android.garibay_retrofit;

import android.util.Log;

import nofearcode.android.garibay_retrofit.data.api.RestClient;
import nofearcode.android.garibay_retrofit.data.api.RetrofitUtils;
import nofearcode.android.garibay_retrofit.data.model.Greeting;
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
        Call<Greeting> call = restClient.getData();
        call.enqueue(new Callback<Greeting>() {
            @Override
            public void onResponse(Call<Greeting> call, Response<Greeting> response) {
                switch (response.code()) {
                    case 200:
                        Greeting data = response.body();
                        view.showdata(data);
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<Greeting> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }
}

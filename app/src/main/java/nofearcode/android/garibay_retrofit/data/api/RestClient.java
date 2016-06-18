package nofearcode.android.garibay_retrofit.data.api;

import nofearcode.android.garibay_retrofit.data.model.Greeting;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by raitom on 18/06/16.
 */
public interface RestClient {
    @GET("posts/1")
    Call<Greeting> getData();
}

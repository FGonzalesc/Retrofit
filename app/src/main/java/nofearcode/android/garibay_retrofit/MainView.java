package nofearcode.android.garibay_retrofit;

import java.util.List;

import nofearcode.android.garibay_retrofit.data.model.Result;

/**
 * Created by raitom on 18/06/16.
 */
public interface MainView {
    void notifyDataSetChanged(List<Result> pokemon);

    void navigateToDetails(int idPokemon);
}

package nofearcode.android.garibay_retrofit;

import java.util.List;

import nofearcode.android.garibay_retrofit.data.model.Ability;

/**
 * Created by raitom on 22/06/16.
 */
public interface PokemonDetailView {
    void notifyDataSetChanged(List<Ability> ability);

}

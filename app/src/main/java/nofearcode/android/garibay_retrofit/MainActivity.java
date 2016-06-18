package nofearcode.android.garibay_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import nofearcode.android.garibay_retrofit.data.model.Greeting;

public class MainActivity extends AppCompatActivity implements MainView {


    private MainPresenter presenter;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title= (TextView)findViewById(R.id.tv_title);

        presenter = new MainPresenter(this);

        presenter.getData();
    }

    @Override
    public void showdata(Greeting greeting) {
        title.setText(greeting.getTitle());
    }
}

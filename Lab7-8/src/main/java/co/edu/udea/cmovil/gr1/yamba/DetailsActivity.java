package co.edu.udea.cmovil.gr1.yamba;

import android.app.Activity;
import android.os.Bundle;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            DetailsFragment fragment = new DetailsFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, fragment, fragment.getClass().getSimpleName()).commit();
        }
    }

}

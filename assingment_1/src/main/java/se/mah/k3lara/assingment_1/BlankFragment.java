package se.mah.k3lara.assingment_1;


import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements View.OnClickListener{


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        View button = v.findViewById(R.id.button2);
        button.setOnClickListener(this);
        // Inflate the layout for this fragment

        return v;
    }


    @Override
    public void onClick(View v) {
        Log.i("BlankFragment", "Click");
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, new BlankFragment2())
                .commit();
    }
}

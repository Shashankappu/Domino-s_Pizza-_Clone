package com.example.dominos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VegPizza#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VegPizza extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VegPizza() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VegPizza.
     */
    // TODO: Rename and change types and number of parameters
    public static VegPizza newInstance(String param1, String param2) {
        VegPizza fragment = new VegPizza();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_veg_pizza, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Onion Pizza","399","Hand Tossed crispy pizza only for you","https://images.dominos.co.in/new_veg_extravaganza.jpg"));
        productList.add(new Product("Peri Peri  Pizza","199","peri peri crispy pizza only for you","https://images.dominos.co.in/new_peppy_paneer.jpg"));
        productList.add(new Product("Peppy Paneer Pizza","169","Onion Filled pizza only for you","https://images.dominos.co.in/updated_achari_do_pyaza.jpg"));
        productList.add(new Product("Delux Veggy Pizza","299","Panner Pizza filled with Love and Paneer","https://images.dominos.co.in/new_veg_extravaganza.jpg"));
        productList.add(new Product("Mexican Green Wave Pizza","69","Cheesy cheesy pizza ","https://images.dominos.co.in/new_peppy_paneer.jpg"));
        productList.add(new Product("Golden Corn Pizza","279","Corn fried Golden pizza ","https://images.dominos.co.in/updated_achari_do_pyaza.jpg"));
        productList.add(new Product("Tomato Pizza","249","Tomato Tomato Patoto Potato Pizzaa","https://images.dominos.co.in/new_veg_extravaganza.jpg"));
        productList.add(new Product("White Clam Pie Pizza","399","Pepper Pepper Pizza Pizzzza","https://images.dominos.co.in/new_peppy_paneer.jpg"));
        productList.add(new Product("Margherita Pizza","99","Margherita pizzza hand Tossed ","https://images.dominos.co.in/updated_achari_do_pyaza.jpg"));

        ListView productListView = view.findViewById(R.id.list_view);
        ProductAdapter productAdapter = new ProductAdapter(getActivity(),productList);
        productListView.setAdapter(productAdapter);
        productListView.setDivider(null);
    }
}
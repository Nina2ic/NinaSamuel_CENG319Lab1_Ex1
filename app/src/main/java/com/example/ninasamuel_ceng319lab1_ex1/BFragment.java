package com.example.ninasamuel_ceng319lab1_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BFragment extends Fragment
{
    private TextView messageTextView;

    public BFragment() {
        // Required empty public constructor
    }

    public static BFragment newInstance(String param1, String param2) {
        BFragment fragment = new BFragment();
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_b, container, false);

        messageTextView = view.findViewById(R.id.message_tv);

        showToast(R.string.on_create_view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        showToast(R.string.on_start);
    }

    void setMessage(String message) {
        if (messageTextView != null) {
            messageTextView.setText(message);
        }
    }

    private void showToast(int messageId)
    {
        Toast.makeText(getContext(), messageId, Toast.LENGTH_SHORT).show();
    }

}
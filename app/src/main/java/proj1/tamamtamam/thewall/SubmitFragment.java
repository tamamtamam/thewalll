package proj1.tamamtamam.thewall;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SubmitFragment extends Fragment {


    private Button sendButton;
    private EditText titleEditor;
    private EditText priceEditor;
    private EditText placeEditor;

    public SubmitFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_submit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        sendButton = getView().findViewById(R.id.send_button);
        placeEditor = getView().findViewById(R.id.place_editor);
        titleEditor = getView().findViewById(R.id.title_editor);
        priceEditor = getView().findViewById(R.id.price_editor);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean success = true;
                if (TextUtils.isEmpty(placeEditor.getText())) {
                    placeEditor.setError("This field is necessary.");
                    success = false;
                }

                if (!TextUtils.isDigitsOnly(priceEditor.getText().toString().replaceAll("[$,]", ""))) {
                    priceEditor.setError("This field can only contain numbers");
                    success = false;
                }


                if (titleEditor.getText().toString().length() < 5) {
                    titleEditor.setError("Title length must be at least 5 characters.");
                    success = false;
                }

                if (success) {
                    Toast.makeText(getContext(), "Post submitted successfully.", Toast.LENGTH_LONG).show();
                    resetFields();
                }
            }
        });
    }

    private void resetFields() {
        titleEditor.setText("");
        priceEditor.setText("");
        placeEditor.setText("");
    }
}

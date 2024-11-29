package com.examJavier.ExamenPMDM;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.examJavier.ExamenPMDM.R;
public class fragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);

        Button button = view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());

                alertDialogBuilder.setTitle("pregunta");
                alertDialogBuilder
                        .setMessage("Hola profe Mario, ¿apruebo?")
                        .setCancelable(false)
                        .setPositiveButton("Si",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                Toast.makeText(getContext(), "aprobado", LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                Toast.makeText(getContext(), " no aprobado", LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        }).create().show();

            }
        });

        return view;
    }
}
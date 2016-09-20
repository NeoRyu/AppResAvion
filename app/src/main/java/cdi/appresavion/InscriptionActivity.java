package cdi.appresavion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.UtilisateurDAO;
import dbclass.Utilisateur;

public class InscriptionActivity extends AppCompatActivity {

    // Variables

    public static final String TAG = "DEBUG";

    // Patterns pour le Regex
    Pattern regex_alpha = Pattern.compile("^[^0-9]+");
    Pattern regex_alphanum = Pattern.compile("^[a-zA-Z_0-9]+");
    Pattern regex_num = Pattern.compile("^[0-9]{5}$");
    Pattern regex_tel = Pattern.compile("^(0)[1-59](\\s?\\d{2}){4}$");
    Pattern regex_mobile = Pattern.compile("^(0)[67](\\s?\\d{2}){4}$+");
    Pattern regex_email = Pattern.compile("^[A-Za-z0-9](([_\\.\\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\\.\\-]?[a-zA-Z0-9]+)*)\\.([A-Za-z]{2,})$");

    // Matcher
    Matcher m;

    // EditTexts
    private EditText nom_user;
    private EditText prenom_user;
    private EditText pseudo_user;
    private EditText mdp_user;
    private EditText confmdp_user;
    private EditText mail_user;
    private EditText adresse_user;
    private EditText ville_user;
    private EditText cp_user;
    private EditText tel_user;
    private EditText mobile_user;
    private Button btn_valider;

    // Le texte qui va en être récupéré
    private String nom;
    private String prenom;
    private String pseudo;
    private String mdp;
    private String confmdp;
    private String mail;
    private String adresse;
    private String ville;
    private String cp;
    private String tel;
    private String mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        // TODO inscription nouvel user


        // On lie les EditText entre XML et Java
        nom_user = (EditText) findViewById(R.id.input_nom);
        prenom_user = (EditText) findViewById(R.id.input_prenom);
        pseudo_user = (EditText) findViewById(R.id.input_pseudo);
        mdp_user = (EditText) findViewById(R.id.input_mdp);
        confmdp_user = (EditText) findViewById(R.id.input_mdpconf);
        mail_user = (EditText) findViewById(R.id.input_mail);
        adresse_user = (EditText) findViewById(R.id.input_adresse);
        ville_user = (EditText) findViewById(R.id.input_ville);
        cp_user = (EditText) findViewById(R.id.input_cp);
        tel_user = (EditText) findViewById(R.id.input_tel);
        mobile_user = (EditText) findViewById(R.id.input_mobile);
        btn_valider = (Button) findViewById(R.id.btn_valider_nvuser);


        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // On instancie la classe qui va stocker toutes les infos
               final Utilisateur nv_user = new Utilisateur();

                // TODO ce bordel
                nom_user.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                        String input_nom = nom_user.getText().toString();
                        m = regex_alpha.matcher(input_nom);
                        if (m.find()) {
                            nv_user.setNom(input_nom);
                        } else {
                            Log.d(TAG, "Nom pas OK"); // TODO toast
                        }
                        m.reset();
                    }
                });
                prenom_user.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        String input_prenom = prenom_user.getText().toString();
                        m = regex_alpha.matcher(input_prenom);
                        if (m.find()) {
                            nv_user.setPrenom(input_prenom);
                        } else {
                            Log.d(TAG, "Prénom pas OK"); // TODO toast
                        }
                        m.reset();

                    }
                });
                pseudo_user.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        String input_pseudo = pseudo_user.getText().toString();
                        m = regex_alphanum.matcher(input_pseudo);
                        if (m.find()) {
                            nv_user.setUsername(input_pseudo);
                        } else {
                            Log.d(TAG, "Pseudo pas OK"); // TODO toast
                        }
                        m.reset();


                    }
                });
                mdp_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        String input_mdp = mdp_user.getText().toString();





                    }
                });
                confmdp_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });
                mail_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });
                adresse_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });
                ville_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });
                cp_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });
                tel_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });
                mobile_user.addTextChangedListener(new TextWatcher(){
                    @Override
                    public void afterTextChanged(Editable s) {


                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {


                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {





                    }
                });


                    UtilisateurDAO.ajouterUtilisateur(nv_user);

                    Intent Login = new Intent(InscriptionActivity.this, LoginActivity.class);
                    startActivity(Login);



            }
        });



    }


}
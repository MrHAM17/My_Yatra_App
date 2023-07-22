package com.example.ticketresellingsystem;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.annotation.NonNull;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;

import android.view.WindowManager;
import android.widget.Toast;


import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;



public class HomeActivity extends AppCompatActivity
{


    ////////////////// CODE FOR SIGN OUT TASK.........................................
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
//    TextView Name,Email; ..........NOT USING
      Button signOutBtn;


    ////////////////// CODE FOR TAKING DATA TASK.........................................
    TextInputLayout name, source, destination, date, email;
    FloatingActionButton fb;
    Button sbmt;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    ////////////////// CODE FOR SIGN OUT TASK.........................................
//       Name = findViewById(R.id.name);
//        //Name = findViewById(R.id.Name);
//       Email = findViewById(R.id.email);
//       //  Email = findViewById(R.id.Email);
         signOutBtn = findViewById(R.id.signout);


        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if(acct!=null)
        {
//            String personName = acct.getDisplayName();
//            String personEmail = acct.getEmail();
//            Name.setText(personName);
//            Email.setText(personEmail);
        }

        signOutBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });


    ////////////////// CODE FOR TAKING DATA TASK.........................................
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        name = (TextInputLayout) findViewById(R.id.nametext);
        source = (TextInputLayout) findViewById(R.id.sourcetext);
        destination = (TextInputLayout) findViewById(R.id.destinationtext);
        date = (TextInputLayout) findViewById(R.id.datetext);
        email = (TextInputLayout) findViewById(R.id.emailtext);
        fb = (FloatingActionButton) findViewById(R.id.fbtn);
        sbmt = (Button) findViewById(R.id.sbmt_add);


        sbmt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                // for checking if any field is empty...
                if (name.getEditText().getText().toString().equals("")|| source.getEditText().getText().toString().equals("")|| destination.getEditText().getText().toString().equals("") || date.getEditText().getText().toString().equals("")|| email.getEditText().getText().toString().equals("") )
                {
                    Toast.makeText(HomeActivity.this, "Please enter all the details.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    // for checking source stations...........................................................................................................................
                    if
                    (
                                    source.getEditText().getText().toString().equals("Abada")||
                                    source.getEditText().getText().toString().equals("Abhaipur")||
                                    source.getEditText().getText().toString().equals("Abhayapuri")||
                                    source.getEditText().getText().toString().equals("Abohar Junction")||
                                    source.getEditText().getText().toString().equals("Abu Road")||
                                    source.getEditText().getText().toString().equals("Abutara Halt")||
                                    source.getEditText().getText().toString().equals("Acharapakkam")||
                                    source.getEditText().getText().toString().equals("Acharya Narendra Dev Nagar")||
                                    source.getEditText().getText().toString().equals("Achalganj")||
                                    source.getEditText().getText().toString().equals("Achalpur")||
                                    source.getEditText().getText().toString().equals("Achhalda")||
                                    source.getEditText().getText().toString().equals("Achhnera Junction")||
                                    source.getEditText().getText().toString().equals("Adarshnagar")||
                                    source.getEditText().getText().toString().equals("Adarshnagar Delhi")||
                                    source.getEditText().getText().toString().equals("Adas Road")||
                                    source.getEditText().getText().toString().equals("Adesar")||
                                    source.getEditText().getText().toString().equals("Adgaon Buzurg")||
                                    source.getEditText().getText().toString().equals("Adilabad")||
                                    source.getEditText().getText().toString().equals("Adipur Junction")||
                                    source.getEditText().getText().toString().equals("Adisaptagram")||
                                    source.getEditText().getText().toString().equals("Adityapur")||
                                    source.getEditText().getText().toString().equals("Adoni")||
                                    source.getEditText().getText().toString().equals("Adra Junction")||
                                    source.getEditText().getText().toString().equals("Aduturai")||
                                    source.getEditText().getText().toString().equals("Agartala")||
                                    source.getEditText().getText().toString().equals("Agas")||
                                    source.getEditText().getText().toString().equals("Agasod")||
                                    source.getEditText().getText().toString().equals("Aghwanpur")||
                                    source.getEditText().getText().toString().equals("Agomani")||
                                    source.getEditText().getText().toString().equals("Agori Khas")||
                                    source.getEditText().getText().toString().equals("Agra Cantonment")||
                                    source.getEditText().getText().toString().equals("Agra City")||
                                    source.getEditText().getText().toString().equals("Agra Fort")||
                                    source.getEditText().getText().toString().equals("Ahalyapur")||
                                    source.getEditText().getText().toString().equals("Ahmadgarh")||
                                    source.getEditText().getText().toString().equals("Ahmednagar")||
                                    source.getEditText().getText().toString().equals("Ahmadpur Junction")||
                                    source.getEditText().getText().toString().equals("Ahmedabad Junction")||
                                    source.getEditText().getText().toString().equals("Ahraura Road")||
                                    source.getEditText().getText().toString().equals("Airoli")||
                                    source.getEditText().getText().toString().equals("Aishbagh")||
                                    source.getEditText().getText().toString().equals("Ait")||
                                    source.getEditText().getText().toString().equals("Aithal")||
                                    source.getEditText().getText().toString().equals("Ajaibpur")||
                                    source.getEditText().getText().toString().equals("Ajanti")||
                                    source.getEditText().getText().toString().equals("Ajaraka")||
                                    source.getEditText().getText().toString().equals("Ajgain")||
                                    source.getEditText().getText().toString().equals("Ajhai")||
                                    source.getEditText().getText().toString().equals("Ajit")||
                                    source.getEditText().getText().toString().equals("Ajmer Junction")||
                                    source.getEditText().getText().toString().equals("Ajni")||
                                    source.getEditText().getText().toString().equals("Akalkot Road")||
                                    source.getEditText().getText().toString().equals("Akaltara")||
                                    source.getEditText().getText().toString().equals("Akanapet")||
                                    source.getEditText().getText().toString().equals("Akbarganj")||
                                    source.getEditText().getText().toString().equals("Akbarpur Junction")||
                                    source.getEditText().getText().toString().equals("Akividu")||
                                    source.getEditText().getText().toString().equals("Akodia")||
                                    source.getEditText().getText().toString().equals("Akola Junction")||
                                    source.getEditText().getText().toString().equals("Akolner")||
                                    source.getEditText().getText().toString().equals("Akona")||
                                    source.getEditText().getText().toString().equals("Akot")||
                                    source.getEditText().getText().toString().equals("Akurdi")||
                                    source.getEditText().getText().toString().equals("Alamnagar")||
                                    source.getEditText().getText().toString().equals("Aler")||
                                    source.getEditText().getText().toString().equals("Algapur")||
                                    source.getEditText().getText().toString().equals("Algawan")||
                                    source.getEditText().getText().toString().equals("Alia Bada")||
                                    source.getEditText().getText().toString().equals("Aligarh Junction")||
                                    source.getEditText().getText().toString().equals("Alipurduar")||
                                    source.getEditText().getText().toString().equals("Alipurduar Junction")||
                                    source.getEditText().getText().toString().equals("Alirajpur")||
                                    source.getEditText().getText().toString().equals("Allahabad City")||
                                    source.getEditText().getText().toString().equals("Allahabad Junction")||
                                    source.getEditText().getText().toString().equals("Alappuzha")||
                                    source.getEditText().getText().toString().equals("Almatti")||
                                    source.getEditText().getText().toString().equals("Alnavar Junction")||
                                    source.getEditText().getText().toString().equals("Alniya")||
                                    source.getEditText().getText().toString().equals("Aluabari Road Junction")||
                                    source.getEditText().getText().toString().equals("Alwar Junction")||
                                    source.getEditText().getText().toString().equals("Aluva")||
                                    source.getEditText().getText().toString().equals("Amalner")||
                                    source.getEditText().getText().toString().equals("Amalsad")||
                                    source.getEditText().getText().toString().equals("Aman Vadi")||
                                    source.getEditText().getText().toString().equals("Amarpura")||
                                    source.getEditText().getText().toString().equals("Amausi")||
                                    source.getEditText().getText().toString().equals("Amb Andaura")||
                                    source.getEditText().getText().toString().equals("Ambagaon")||
                                    source.getEditText().getText().toString().equals("Ambala Cantonment")||
                                    source.getEditText().getText().toString().equals("Ambala City")||
                                    source.getEditText().getText().toString().equals("Ambalappuzha")||
                                    source.getEditText().getText().toString().equals("Ambale")||
                                    source.getEditText().getText().toString().equals("Ambari")||
                                    source.getEditText().getText().toString().equals("Ambari Falakata")||
                                    source.getEditText().getText().toString().equals("Ambarnath")||
                                    source.getEditText().getText().toString().equals("Ambassa")||
                                    source.getEditText().getText().toString().equals("Ambasamudram")||
                                    source.getEditText().getText().toString().equals("Ambattur")||
                                    source.getEditText().getText().toString().equals("Ambaturai")||
                                    source.getEditText().getText().toString().equals("Ambiapur")||
                                    source.getEditText().getText().toString().equals("Ambika Kalna")||
                                    source.getEditText().getText().toString().equals("Ambikapur")||
                                    source.getEditText().getText().toString().equals("Ambikeshwar")||
                                    source.getEditText().getText().toString().equals("Ambivli")||
                                    source.getEditText().getText().toString().equals("Ambli Road")||
                                    source.getEditText().getText().toString().equals("Ambliyasan Junction")||
                                    source.getEditText().getText().toString().equals("Ambodala")||
                                    source.getEditText().getText().toString().equals("Ambur")||
                                    source.getEditText().getText().toString().equals("Amethi")||
                                    source.getEditText().getText().toString().equals("Amgaon")||
                                    source.getEditText().getText().toString().equals("Amguri")||
                                    source.getEditText().getText().toString().equals("Amla Junction")||
                                    source.getEditText().getText().toString().equals("Amlai")||
                                    source.getEditText().getText().toString().equals("Amlakhurd")||
                                    source.getEditText().getText().toString().equals("Amli")||
                                    source.getEditText().getText().toString().equals("Ammasandra")||
                                    source.getEditText().getText().toString().equals("Amoni")||
                                    source.getEditText().getText().toString().equals("Amravati")||
                                    source.getEditText().getText().toString().equals("Amreli")||
                                    source.getEditText().getText().toString().equals("Amritsar Junction")||
                                    source.getEditText().getText().toString().equals("Amritvel")||
                                    source.getEditText().getText().toString().equals("Amroha")||
                                    source.getEditText().getText().toString().equals("Anakapalle")||
                                    source.getEditText().getText().toString().equals("Anand Junction")||
                                    source.getEditText().getText().toString().equals("Anand Nagar Junction")||
                                    source.getEditText().getText().toString().equals("Anand Vihar")||
                                    source.getEditText().getText().toString().equals("Anandpur Sahib")||
                                    source.getEditText().getText().toString().equals("Anandtandavpur")||
                                    source.getEditText().getText().toString().equals("Anantapur")||
                                    source.getEditText().getText().toString().equals("Anantnag")||
                                    source.getEditText().getText().toString().equals("Anaparti")||
                                    source.getEditText().getText().toString().equals("Anara")||
                                    source.getEditText().getText().toString().equals("Anas")||
                                    source.getEditText().getText().toString().equals("Andal Junction")||
                                    source.getEditText().getText().toString().equals("Andheri")||
                                    source.getEditText().getText().toString().equals("Angadippuram")||
                                    source.getEditText().getText().toString().equals("Angamaly")||
                                    source.getEditText().getText().toString().equals("Angar")||
                                    source.getEditText().getText().toString().equals("Angul")||
                                    source.getEditText().getText().toString().equals("Anipur")||
                                    source.getEditText().getText().toString().equals("Anjangaon")||
                                    source.getEditText().getText().toString().equals("Anjani")||
                                    source.getEditText().getText().toString().equals("Anjar")||
                                    source.getEditText().getText().toString().equals("Anjhi Shahabad")||
                                    source.getEditText().getText().toString().equals("Ankai Killa")||
                                    source.getEditText().getText().toString().equals("Ankleshwar Junction")||
                                    source.getEditText().getText().toString().equals("Ankleshwar Udyognagar")||
                                    source.getEditText().getText().toString().equals("Ankola")||
                                    source.getEditText().getText().toString().equals("Annanur")||
                                    source.getEditText().getText().toString().equals("Annavaram")||
                                    source.getEditText().getText().toString().equals("Annigeri")||
                                    source.getEditText().getText().toString().equals("Anpara")||
                                    source.getEditText().getText().toString().equals("Antah")||
                                    source.getEditText().getText().toString().equals("Antu")||
                                    source.getEditText().getText().toString().equals("Anugraha Narayan Road")||
                                    source.getEditText().getText().toString().equals("Anupgarh")||
                                    source.getEditText().getText().toString().equals("Anuppur Junction")||
                                    source.getEditText().getText().toString().equals("Anupshahr")||
                                    source.getEditText().getText().toString().equals("Aonla")||
                                    source.getEditText().getText().toString().equals("Ara Junction")||
                                    source.getEditText().getText().toString().equals("Arabagatta H")||
                                    source.getEditText().getText().toString().equals("Arakkonam Junction")||
                                    source.getEditText().getText().toString().equals("Araku")||
                                    source.getEditText().getText().toString().equals("Aralvaymozhi")||
                                    source.getEditText().getText().toString().equals("Arariya")||
                                    source.getEditText().getText().toString().equals("Arariya Court")||
                                    source.getEditText().getText().toString().equals("Arasur")||
                                    source.getEditText().getText().toString().equals("Aravali Road")||
                                    source.getEditText().getText().toString().equals("Arunachal Junction")||
                                    source.getEditText().getText().toString().equals("Aravankadu")||
                                    source.getEditText().getText().toString().equals("Ariyalur")||
                                    source.getEditText().getText().toString().equals("Argora")||
                                    source.getEditText().getText().toString().equals("Arjansar")||
                                    source.getEditText().getText().toString().equals("Arjuni")||
                                    source.getEditText().getText().toString().equals("Arnetha")||
                                    source.getEditText().getText().toString().equals("Arni Road")||
                                    source.getEditText().getText().toString().equals("Arsikere Junction")||
                                    source.getEditText().getText().toString().equals("Aruppukkottai")||
                                    source.getEditText().getText().toString().equals("Arvi")||
                                    source.getEditText().getText().toString().equals("Aryankavu")||
                                    source.getEditText().getText().toString().equals("Asafpur")||
                                    source.getEditText().getText().toString().equals("Asalpur Jobner")||
                                    source.getEditText().getText().toString().equals("Asangaon")||
                                    source.getEditText().getText().toString().equals("Asansol Junction")||
                                    source.getEditText().getText().toString().equals("Asaoti")||
                                    source.getEditText().getText().toString().equals("Ashoknagar")||
                                    source.getEditText().getText().toString().equals("Asthal Bohar Junction")||
                                    source.getEditText().getText().toString().equals("Aslana")||
                                    source.getEditText().getText().toString().equals("Aslaoda")||
                                    source.getEditText().getText().toString().equals("Asnoti")||
                                    source.getEditText().getText().toString().equals("Asokhar")||
                                    source.getEditText().getText().toString().equals("Asranada")||
                                    source.getEditText().getText().toString().equals("Attari")||
                                    source.getEditText().getText().toString().equals("Ataria")||
                                    source.getEditText().getText().toString().equals("Atarra")||
                                    source.getEditText().getText().toString().equals("Ateli")||
                                    source.getEditText().getText().toString().equals("Atgaon")||
                                    source.getEditText().getText().toString().equals("Athipattu")||
                                    source.getEditText().getText().toString().equals("Athipattu Pudhunagar")||
                                    source.getEditText().getText().toString().equals("Atrampur")||
                                    source.getEditText().getText().toString().equals("Atrauli Road")||
                                    source.getEditText().getText().toString().equals("Atru")||
                                    source.getEditText().getText().toString().equals("Attabira")||
                                    source.getEditText().getText().toString().equals("Attar")||
                                    source.getEditText().getText().toString().equals("Attur")||
                                    source.getEditText().getText().toString().equals("Aujari")||
                                    source.getEditText().getText().toString().equals("Aulenda")||
                                    source.getEditText().getText().toString().equals("Aunrihar Junction")||
                                    source.getEditText().getText().toString().equals("Aurangabad")||
                                    source.getEditText().getText().toString().equals("Auvaneeswarem")||
                                    source.getEditText().getText().toString().equals("Auwa")||
                                    source.getEditText().getText().toString().equals("Avadi")||
                                    source.getEditText().getText().toString().equals("Awantipora")||
                                    source.getEditText().getText().toString().equals("Ayodhya Junction")||
                                    source.getEditText().getText().toString().equals("Azamgarh")||
                                    source.getEditText().getText().toString().equals("Azamnagar Road")||
                                    source.getEditText().getText().toString().equals("Azara")||
                                    source.getEditText().getText().toString().equals("Azimganj City")||
                                    source.getEditText().getText().toString().equals("Azimganj Junction")||
                                    source.getEditText().getText().toString().equals("Babarpur")||
                                    source.getEditText().getText().toString().equals("Babatpur")||
                                    source.getEditText().getText().toString().equals("Bebejia")||
                                    source.getEditText().getText().toString().equals("Babhnan")||
                                    source.getEditText().getText().toString().equals("Babina")||
                                    source.getEditText().getText().toString().equals("Babrala")||
                                    source.getEditText().getText().toString().equals("Babugarh")||
                                    source.getEditText().getText().toString().equals("Babupeth")||
                                    source.getEditText().getText().toString().equals("Bacheli")||
                                    source.getEditText().getText().toString().equals("Bachhrawan")||
                                    source.getEditText().getText().toString().equals("Bachwara Junction")||
                                    source.getEditText().getText().toString().equals("Badmal")||
                                    source.getEditText().getText().toString().equals("Baad")||
                                    source.getEditText().getText().toString().equals("Badami")||
                                    source.getEditText().getText().toString().equals("Badampahar")||
                                    source.getEditText().getText().toString().equals("Badampudi")||
                                    source.getEditText().getText().toString().equals("Badurpur Ghat")||
                                    source.getEditText().getText().toString().equals("Badarpur Junction")||
                                    source.getEditText().getText().toString().equals("Badausa")||
                                    source.getEditText().getText().toString().equals("Budgam")||
                                    source.getEditText().getText().toString().equals("Badhada")||
                                    source.getEditText().getText().toString().equals("Badhal")||
                                    source.getEditText().getText().toString().equals("Badlapur")||
                                    source.getEditText().getText().toString().equals("Badli")||
                                    source.getEditText().getText().toString().equals("Badnapur")||
                                    source.getEditText().getText().toString().equals("Badnera Junction")||
                                    source.getEditText().getText().toString().equals("Badshahnagar")||
                                    source.getEditText().getText().toString().equals("Badshahpur")||
                                    source.getEditText().getText().toString().equals("Badwasi")||
                                    source.getEditText().getText().toString().equals("Bagaha")||
                                    source.getEditText().getText().toString().equals("Bagalkot")||
                                    source.getEditText().getText().toString().equals("Bagbahra")||
                                    source.getEditText().getText().toString().equals("Bagetar")||
                                    source.getEditText().getText().toString().equals("Bagevadi Rd")||
                                    source.getEditText().getText().toString().equals("Baghajatin")||
                                    source.getEditText().getText().toString().equals("Baghauli")||
                                    source.getEditText().getText().toString().equals("Baghnapara")||
                                    source.getEditText().getText().toString().equals("Baghora")||
                                    source.getEditText().getText().toString().equals("Bagra Tawa")||
                                    source.getEditText().getText().toString().equals("Bagri Nagar")||
                                    source.getEditText().getText().toString().equals("Bagri Sajjanpur")||
                                    source.getEditText().getText().toString().equals("Bagula")||
                                    source.getEditText().getText().toString().equals("Bagwali")||
                                    source.getEditText().getText().toString().equals("Bahadur Singh Wala")||
                                    source.getEditText().getText().toString().equals("Bahadurgarh")||
                                    source.getEditText().getText().toString().equals("Bahadurpur")||
                                    source.getEditText().getText().toString().equals("Baheri")||
                                    source.getEditText().getText().toString().equals("Bahilpurwa")||
                                    source.getEditText().getText().toString().equals("Bahirkhand")||
                                    source.getEditText().getText().toString().equals("Bahjoi")||
                                    source.getEditText().getText().toString().equals("Bahraich")||
                                    source.getEditText().getText().toString().equals("Baidyanathdham")||
                                    source.getEditText().getText().toString().equals("Baihata Chariali")||
                                    source.getEditText().getText().toString().equals("Baiguda")||
                                    source.getEditText().getText().toString().equals("Baijnathpur")||
                                    source.getEditText().getText().toString().equals("Baikunthpur Rd")||
                                    source.getEditText().getText().toString().equals("Bainchi / Boinchi")||
                                    source.getEditText().getText().toString().equals("Bairabi (Bhairabi)")||
                                    source.getEditText().getText().toString().equals("Bairapur")||
                                    source.getEditText().getText().toString().equals("Bairgania")||
                                    source.getEditText().getText().toString().equals("Baitalpur")||
                                    source.getEditText().getText().toString().equals("Bajalta")||
                                    source.getEditText().getText().toString().equals("Bajva")||
                                    source.getEditText().getText().toString().equals("Bakhtiyarpur Junction")||
                                    source.getEditText().getText().toString().equals("Bakra Road")||
                                    source.getEditText().getText().toString().equals("Balaghat")||
                                    source.getEditText().getText().toString().equals("Balamau Junction")||
                                    source.getEditText().getText().toString().equals("Balangir")||
                                    source.getEditText().getText().toString().equals("Balasore")||
                                    source.getEditText().getText().toString().equals("Balauda Takun")||
                                    source.getEditText().getText().toString().equals("Balawala")||
                                    source.getEditText().getText().toString().equals("Balawali")||
                                    source.getEditText().getText().toString().equals("Balharshah")||
                                    source.getEditText().getText().toString().equals("Baliakheri")||
                                    source.getEditText().getText().toString().equals("Balikotia")||
                                    source.getEditText().getText().toString().equals("Balipara")||
                                    source.getEditText().getText().toString().equals("Ballabhgarh")||
                                    source.getEditText().getText().toString().equals("Balli railway station")||
                                    source.getEditText().getText().toString().equals("Ballia")||
                                    source.getEditText().getText().toString().equals("Ballupur")||
                                    source.getEditText().getText().toString().equals("Bally")||
                                    source.getEditText().getText().toString().equals("Ballygunge Junction")||
                                    source.getEditText().getText().toString().equals("Balrampur")||
                                    source.getEditText().getText().toString().equals("Balsamand")||
                                    source.getEditText().getText().toString().equals("Balugan")||
                                    source.getEditText().getText().toString().equals("Balwa")||
                                    source.getEditText().getText().toString().equals("Balwara")||
                                    source.getEditText().getText().toString().equals("Bamangachhi")||
                                    source.getEditText().getText().toString().equals("Bamanheri")||
                                    source.getEditText().getText().toString().equals("Bamhni")||
                                    source.getEditText().getText().toString().equals("Bamhni Banjar")||
                                    source.getEditText().getText().toString().equals("Bamla")||
                                    source.getEditText().getText().toString().equals("Bamnia")||
                                    source.getEditText().getText().toString().equals("Bamsin")||
                                    source.getEditText().getText().toString().equals("Bamra")||
                                    source.getEditText().getText().toString().equals("Bamsin")||
                                    source.getEditText().getText().toString().equals("Bamuni Gaon")||
                                    source.getEditText().getText().toString().equals("Banahi")||
                                    source.getEditText().getText().toString().equals("Banapura")||
                                    source.getEditText().getText().toString().equals("Banar")||
                                    source.getEditText().getText().toString().equals("Banarhat")||
                                    source.getEditText().getText().toString().equals("Banas")||
                                    source.getEditText().getText().toString().equals("Banaswadi")||
                                    source.getEditText().getText().toString().equals("Banasandra")||
                                    source.getEditText().getText().toString().equals("Banbasa")||
                                    source.getEditText().getText().toString().equals("Banda Junction")||
                                    source.getEditText().getText().toString().equals("Bandakpur")||
                                    source.getEditText().getText().toString().equals("Bandanwara")||
                                    source.getEditText().getText().toString().equals("Bandarkhal")||
                                    source.getEditText().getText().toString().equals("Bandel Junction")||
                                    source.getEditText().getText().toString().equals("Bandh Bareta")||
                                    source.getEditText().getText().toString().equals("Bandikui Junction")||
                                    source.getEditText().getText().toString().equals("Bandra")||
                                    source.getEditText().getText().toString().equals("Bandra Terminus")||
                                    source.getEditText().getText().toString().equals("Bengaluru Cantonment")||
                                    source.getEditText().getText().toString().equals("Bengaluru City Junction (Krantivira Sangolli Rayanna)")||
                                    source.getEditText().getText().toString().equals("Bengaluru East")||
                                    source.getEditText().getText().toString().equals("Bangarapet")||
                                    source.getEditText().getText().toString().equals("Bangarapet")||
                                    source.getEditText().getText().toString().equals("Bangrod")||
                                    source.getEditText().getText().toString().equals("Bani")||
                                    source.getEditText().getText().toString().equals("Banihal")||
                                    source.getEditText().getText().toString().equals("Baniya Sanda DH")||
                                    source.getEditText().getText().toString().equals("Bankata")||
                                    source.getEditText().getText().toString().equals("Bankura")||
                                    source.getEditText().getText().toString().equals("Bankura")||
                                    source.getEditText().getText().toString().equals("Banmankhi Junction")||
                                    source.getEditText().getText().toString().equals("Banmor")||
                                    source.getEditText().getText().toString().equals("Bansdih Road")||
                                    source.getEditText().getText().toString().equals("Banshlai Bridge")||
                                    source.getEditText().getText().toString().equals("Bansi Paharpur")||
                                    source.getEditText().getText().toString().equals("Bansipur")||
                                    source.getEditText().getText().toString().equals("Banasthali Niwai")||
                                    source.getEditText().getText().toString().equals("Banta Raghunathgarh")||
                                    source.getEditText().getText().toString().equals("Bantawala")||
                                    source.getEditText().getText().toString().equals("Banthra")||
                                    source.getEditText().getText().toString().equals("Banwali")||
                                    source.getEditText().getText().toString().equals("Baori Thikria")||
                                    source.getEditText().getText().toString().equals("Bapatla")||
                                    source.getEditText().getText().toString().equals("Bar")||
                                    source.getEditText().getText().toString().equals("Bara Jamda")||
                                    source.getEditText().getText().toString().equals("Barabanki Junction")||
                                    source.getEditText().getText().toString().equals("Barabhum")||
                                    source.getEditText().getText().toString().equals("Barbil")||
                                    source.getEditText().getText().toString().equals("Baradwar")||
                                    source.getEditText().getText().toString().equals("Baragaon")||
                                    source.getEditText().getText().toString().equals("Barahu")||
                                    source.getEditText().getText().toString().equals("Baraigram Junction")||
                                    source.getEditText().getText().toString().equals("Barakar")||
                                    source.getEditText().getText().toString().equals("Baral")||
                                    source.getEditText().getText().toString().equals("Baramati")||
                                    source.getEditText().getText().toString().equals("Baramula")||
                                    source.getEditText().getText().toString().equals("Baran")||
                                    source.getEditText().getText().toString().equals("Baranagar")||
                                    source.getEditText().getText().toString().equals("Barara")||
                                    source.getEditText().getText().toString().equals("Barasat Junction")||
                                    source.getEditText().getText().toString().equals("Baraut")||
                                    source.getEditText().getText().toString().equals("Barauni Junction")||
                                    source.getEditText().getText().toString().equals("Barbatpur")||
                                    source.getEditText().getText().toString().equals("Barchi Road")||
                                    source.getEditText().getText().toString().equals("Barddhaman Junction")||
                                    source.getEditText().getText().toString().equals("Bardoli")||
                                    source.getEditText().getText().toString().equals("Bareilly")||
                                    source.getEditText().getText().toString().equals("Bareilly")||
                                    source.getEditText().getText().toString().equals("Bareilly Cantt")||
                                    source.getEditText().getText().toString().equals("Barejadi")||
                                    source.getEditText().getText().toString().equals("Bareta")||
                                    source.getEditText().getText().toString().equals("Bareth")||
                                    source.getEditText().getText().toString().equals("Bargarh Road")||
                                    source.getEditText().getText().toString().equals("Bargawan")||
                                    source.getEditText().getText().toString().equals("Barh")||
                                    source.getEditText().getText().toString().equals("Barhan Junction")||
                                    source.getEditText().getText().toString().equals("Barharwa Junction")||
                                    source.getEditText().getText().toString().equals("Barhiya")||
                                    source.getEditText().getText().toString().equals("Barhni")||
                                    source.getEditText().getText().toString().equals("Bari Brahman")||
                                    source.getEditText().getText().toString().equals("Bariarpur")||
                                    source.getEditText().getText().toString().equals("Barkakana")||
                                    source.getEditText().getText().toString().equals("Barkur")||
                                    source.getEditText().getText().toString().equals("Barlai")||
                                    source.getEditText().getText().toString().equals("Barmer")||
                                    source.getEditText().getText().toString().equals("Barnagar")||
                                    source.getEditText().getText().toString().equals("Barnala")||
                                    source.getEditText().getText().toString().equals("Barog")||
                                    source.getEditText().getText().toString().equals("Barpali")||
                                    source.getEditText().getText().toString().equals("Barpeta Road")||
                                    source.getEditText().getText().toString().equals("Barrackpore")||
                                    source.getEditText().getText().toString().equals("Barsathi")||
                                    source.getEditText().getText().toString().equals("Barsi Takli")||
                                    source.getEditText().getText().toString().equals("Barsi Town")||
                                    source.getEditText().getText().toString().equals("Barsoi Junction")||
                                    source.getEditText().getText().toString().equals("Barsola")||
                                    source.getEditText().getText().toString().equals("Barsuan")||
                                    source.getEditText().getText().toString().equals("Bartara")||
                                    source.getEditText().getText().toString().equals("Baruva")||
                                    source.getEditText().getText().toString().equals("Baruipur Junction")||
                                    source.getEditText().getText().toString().equals("Barwa Sagar")||
                                    source.getEditText().getText().toString().equals("Barwadih Junction")||
                                    source.getEditText().getText().toString().equals("Barwaha")||
                                    source.getEditText().getText().toString().equals("Barya Ram")||
                                    source.getEditText().getText().toString().equals("Basai")||
                                    source.getEditText().getText().toString().equals("Basantar Block Hut")||
                                    source.getEditText().getText().toString().equals("Basar")||
                                    source.getEditText().getText().toString().equals("Basbari")||
                                    source.getEditText().getText().toString().equals("Basharatganj")||
                                    source.getEditText().getText().toString().equals("Basi Kiratpur")||
                                    source.getEditText().getText().toString().equals("Basin Bridge")||
                                    source.getEditText().getText().toString().equals("Basmat")||
                                    source.getEditText().getText().toString().equals("Basni")||
                                    source.getEditText().getText().toString().equals("Bassi Pathana")||
                                    source.getEditText().getText().toString().equals("Basta")||
                                    source.getEditText().getText().toString().equals("Basti")||
                                    source.getEditText().getText().toString().equals("Basugaon")||
                                    source.getEditText().getText().toString().equals("Baswa")||
                                    source.getEditText().getText().toString().equals("Batadrowa Road")||
                                    source.getEditText().getText().toString().equals("Batala Junction")||
                                    source.getEditText().getText().toString().equals("Bathinda Cantonment")||
                                    source.getEditText().getText().toString().equals("Bathinda Junction")||
                                    source.getEditText().getText().toString().equals("Batuva")||
                                    source.getEditText().getText().toString().equals("Bavla")||
                                    source.getEditText().getText().toString().equals("Bawal")||
                                    source.getEditText().getText().toString().equals("Bawani Khera")||
                                    source.getEditText().getText().toString().equals("Bayana Junction")||
                                    source.getEditText().getText().toString().equals("Baytu")||
                                    source.getEditText().getText().toString().equals("Bazida Jatan")||
                                    source.getEditText().getText().toString().equals("Bazpur")||
                                    source.getEditText().getText().toString().equals("Bazurghat")||
                                    source.getEditText().getText().toString().equals("Beas Junction")||
                                    source.getEditText().getText().toString().equals("Beawar")||
                                    source.getEditText().getText().toString().equals("Begunkodor")||
                                    source.getEditText().getText().toString().equals("Bedetti")||
                                    source.getEditText().getText().toString().equals("Begampet")||
                                    source.getEditText().getText().toString().equals("Begu Sarai")||
                                    source.getEditText().getText().toString().equals("Behtagokul")||
                                    source.getEditText().getText().toString().equals("Behula")||
                                    source.getEditText().getText().toString().equals("Bejnal")||
                                    source.getEditText().getText().toString().equals("Bela Tal")||
                                    source.getEditText().getText().toString().equals("Belampalli")||
                                    source.getEditText().getText().toString().equals("Belandur Road")||
                                    source.getEditText().getText().toString().equals("Belapur")||
                                    source.getEditText().getText().toString().equals("Belgahna")||
                                    source.getEditText().getText().toString().equals("Belgharia")||
                                    source.getEditText().getText().toString().equals("Belgaum")||
                                    source.getEditText().getText().toString().equals("Belha")||
                                    source.getEditText().getText().toString().equals("Bellary Junction")||
                                    source.getEditText().getText().toString().equals("Bellary Cantonment railway station")||
                                    source.getEditText().getText().toString().equals("Belpahar")||
                                    source.getEditText().getText().toString().equals("Belrayan")||
                                    source.getEditText().getText().toString().equals("Belsiri")||
                                    source.getEditText().getText().toString().equals("Belthara Road")||
                                    source.getEditText().getText().toString().equals("Belur")||
                                    source.getEditText().getText().toString().equals("Belvandi")||
                                    source.getEditText().getText().toString().equals("Beohari")||
                                    source.getEditText().getText().toString().equals("Berchha")||
                                    source.getEditText().getText().toString().equals("Berhampore Court")||
                                    source.getEditText().getText().toString().equals("Brahmapur")||
                                    source.getEditText().getText().toString().equals("Besroli")||
                                    source.getEditText().getText().toString().equals("Betavad")||
                                    source.getEditText().getText().toString().equals("Bettiah")||
                                    source.getEditText().getText().toString().equals("Bethamcherla")||
                                    source.getEditText().getText().toString().equals("Betul")||
                                    source.getEditText().getText().toString().equals("Bhabhar")||
                                    source.getEditText().getText().toString().equals("Bhabua Road")||
                                    source.getEditText().getText().toString().equals("Bhachau")||
                                    source.getEditText().getText().toString().equals("Bhachau BG")||
                                    source.getEditText().getText().toString().equals("Bhadan")||
                                    source.getEditText().getText().toString().equals("Bhadaura")||
                                    source.getEditText().getText().toString().equals("Bhadbhadaghat")||
                                    source.getEditText().getText().toString().equals("Bhadli")||
                                    source.getEditText().getText().toString().equals("Bhadohi")||
                                    source.getEditText().getText().toString().equals("Bhadra")||
                                    source.getEditText().getText().toString().equals("Bhadrachalam Road")||
                                    source.getEditText().getText().toString().equals("Bhadrak")||
                                    source.getEditText().getText().toString().equals("Bhadran")||
                                    source.getEditText().getText().toString().equals("Bhadravati")||
                                    source.getEditText().getText().toString().equals("Bhadroli")||
                                    source.getEditText().getText().toString().equals("Bhaga Junction")||
                                    source.getEditText().getText().toString().equals("Bhagalpur")||
                                    source.getEditText().getText().toString().equals("Bhagat Ki Kothi")||
                                    source.getEditText().getText().toString().equals("Bhagega")||
                                    source.getEditText().getText().toString().equals("Bhagtanwala")
//                                    source.getEditText().getText().toString().equals("Bhagwanpur")||
//                                    source.getEditText().getText().toString().equals("Bhagwanpura")||
//                                    source.getEditText().getText().toString().equals("Bhaini Khurd")||
//                                    source.getEditText().getText().toString().equals("Bhairongarh")||
//                                    source.getEditText().getText().toString().equals("Bhakti Nagar")||
//                                    source.getEditText().getText().toString().equals("Bhalki")||
//                                    source.getEditText().getText().toString().equals("Bhalumaska")||
//                                    source.getEditText().getText().toString().equals("Bhanapur")||
//                                    source.getEditText().getText().toString().equals("Bhandak")||
//                                    source.getEditText().getText().toString().equals("Bhandara Road")||
//                                    source.getEditText().getText().toString().equals("Bhandup")||
//                                    source.getEditText().getText().toString().equals("Bhanga")||
//                                    source.getEditText().getText().toString().equals("Bhankoda")||
//                                    source.getEditText().getText().toString().equals("Bharat Kup")||
//                                    source.getEditText().getText().toString().equals("Bharatkund")||
//                                    source.getEditText().getText().toString().equals("Bharatpur Junction")||
//                                    source.getEditText().getText().toString().equals("Bharatwada")||
//                                    source.getEditText().getText().toString().equals("Bharoli Junction")||
//                                    source.getEditText().getText().toString().equals("Bharthana")||
//                                    source.getEditText().getText().toString().equals("Bharuch Junction")||
//                                    source.getEditText().getText().toString().equals("Bharwa Sumerpur")||
//                                    source.getEditText().getText().toString().equals("Bharwari")||
//                                    source.getEditText().getText().toString().equals("Bhatel")||
//                                    source.getEditText().getText().toString().equals("Bhatgaon")||
//                                    source.getEditText().getText().toString().equals("Bhatiya")||
//                                    source.getEditText().getText().toString().equals("Bhatkal")||
//                                    source.getEditText().getText().toString().equals("Bhatni Junction")||
//                                    source.getEditText().getText().toString().equals("Bhaton Ki Gali")||
//                                    source.getEditText().getText().toString().equals("Bhatpar Rani")||
//                                    source.getEditText().getText().toString().equals("Bhatpur")||
//                                    source.getEditText().getText().toString().equals("Bhattu")||
//                                    source.getEditText().getText().toString().equals("Bhaunra")||
//                                    source.getEditText().getText().toString().equals("Bhavnagar Para railway station")||
//                                    source.getEditText().getText().toString().equals("Bhavani Nagar")||
//                                    source.getEditText().getText().toString().equals("Bhavnagar Terminus railway station")||
//                                    source.getEditText().getText().toString().equals("Bhawani Mandi")||
//                                    source.getEditText().getText().toString().equals("Bhawanipatna")||
//                                    source.getEditText().getText().toString().equals("Bhawanipur Kalan")||
//                                    source.getEditText().getText().toString().equals("Bhayandar")||
//                                    source.getEditText().getText().toString().equals("Bhayavadar")||
//                                    source.getEditText().getText().toString().equals("Bheempura")||
//                                    source.getEditText().getText().toString().equals("Bheerpur")||
//                                    source.getEditText().getText().toString().equals("Bhemswadi")||
//                                    source.getEditText().getText().toString().equals("Bheraghat")||
//                                    source.getEditText().getText().toString().equals("Bhesana")||
//                                    source.getEditText().getText().toString().equals("Bhigwan")||
//                                    source.getEditText().getText().toString().equals("Bhilad")||
//                                    source.getEditText().getText().toString().equals("Bhilai Power House")||
//                                    source.getEditText().getText().toString().equals("Bhilainagar")||
//                                    source.getEditText().getText().toString().equals("Bhilavdi")||
//                                    source.getEditText().getText().toString().equals("Bhildi")||
//                                    source.getEditText().getText().toString().equals("Bhilwara")||
//                                    source.getEditText().getText().toString().equals("Bhimal")||
//                                    source.getEditText().getText().toString().equals("Bhimana")||
//                                    source.getEditText().getText().toString().equals("Bhimarlai")||
//                                    source.getEditText().getText().toString().equals("Bhimasar")||
//                                    source.getEditText().getText().toString().equals("Bhimavaram Junction")||
//                                    source.getEditText().getText().toString().equals("Bhimavaram Town")||
//                                    source.getEditText().getText().toString().equals("Bhimnath")||
//                                    source.getEditText().getText().toString().equals("Bhimsen")||
//                                    source.getEditText().getText().toString().equals("Bhind")||
//                                    source.getEditText().getText().toString().equals("Bhinwaliya")||
//                                    source.getEditText().getText().toString().equals("Bhitaura")||
//                                    source.getEditText().getText().toString().equals("Bhivpuri Road")||
//                                    source.getEditText().getText().toString().equals("Bhiwandi")||
//                                    source.getEditText().getText().toString().equals("Bhiwani")||
//                                    source.getEditText().getText().toString().equals("Bhiwani City")||
//                                    source.getEditText().getText().toString().equals("Bhodwal Majri")||
//                                    source.getEditText().getText().toString().equals("Bhogpur Sirwal")||
//                                    source.getEditText().getText().toString().equals("Bhojipura Junction")||
//                                    source.getEditText().getText().toString().equals("Bhojo")||
//                                    source.getEditText().getText().toString().equals("Bhojras")||
//                                    source.getEditText().getText().toString().equals("Bhojudih Junction")||
//                                    source.getEditText().getText().toString().equals("Bhoke")||
//                                    source.getEditText().getText().toString().equals("Bhone")||
//                                    source.getEditText().getText().toString().equals("Bhongaon")||
//                                    source.getEditText().getText().toString().equals("Bhongir")||
//                                    source.getEditText().getText().toString().equals("Bhopal Bairagarh")||
//                                    source.getEditText().getText().toString().equals("Bhopal Dewanganj")||
//                                    source.getEditText().getText().toString().equals("Bhopal Habibganj")||
//                                    source.getEditText().getText().toString().equals("Bhopal Junction")||
//                                    source.getEditText().getText().toString().equals("Bhopal Mandideep")||
//                                    source.getEditText().getText().toString().equals("Bhopal Misrod")||
//                                    source.getEditText().getText().toString().equals("Bhopal Nishatpura")||
//                                    source.getEditText().getText().toString().equals("Bhubaneswar")||
//                                    source.getEditText().getText().toString().equals("Bhuj")||
//                                    source.getEditText().getText().toString().equals("Bhupalsagar")||
//                                    source.getEditText().getText().toString().equals("Bhupia Mau")||
//                                    source.getEditText().getText().toString().equals("Bhusaval Junction")||
//                                    source.getEditText().getText().toString().equals("Bhutakia Bhimsa")||
//                                    source.getEditText().getText().toString().equals("Bhusaval")||
//                                    source.getEditText().getText().toString().equals("Bibinagar Junction")||
//                                    source.getEditText().getText().toString().equals("Bichia")||
//                                    source.getEditText().getText().toString().equals("Bichpuri")||
//                                    source.getEditText().getText().toString().equals("Bidadi")||
//                                    source.getEditText().getText().toString().equals("Bidanpur")||
//                                    source.getEditText().getText().toString().equals("Bidar")||
//                                    source.getEditText().getText().toString().equals("Bidhan Nagar Road")||
//                                    source.getEditText().getText().toString().equals("Bidupur")||
//                                    source.getEditText().getText().toString().equals("Bidyadabri")||
//                                    source.getEditText().getText().toString().equals("Bighapur")||
//                                    source.getEditText().getText().toString().equals("Bihara")||
//                                    source.getEditText().getText().toString().equals("Bihar Sharif")||
//                                    source.getEditText().getText().toString().equals("Bihiya")||
//                                    source.getEditText().getText().toString().equals("Bihta")||
//                                    source.getEditText().getText().toString().equals("Bijainagar")||
//                                    source.getEditText().getText().toString().equals("Bijapur")||
//                                    source.getEditText().getText().toString().equals("Bijauli")||
//                                    source.getEditText().getText().toString().equals("Bijaysota")||
//                                    source.getEditText().getText().toString().equals("Bijbiara")||
//                                    source.getEditText().getText().toString().equals("Bijni")||
//                                    source.getEditText().getText().toString().equals("Bijnor")||
//                                    source.getEditText().getText().toString().equals("Bijoor")||
//                                    source.getEditText().getText().toString().equals("Bijora")||
//                                    source.getEditText().getText().toString().equals("Bijrotha")||
//                                    source.getEditText().getText().toString().equals("Bijuri")||
//                                    source.getEditText().getText().toString().equals("Bikaner Junction")||
//                                    source.getEditText().getText().toString().equals("Bikrampur")||
//                                    source.getEditText().getText().toString().equals("Bilaspur")||
//                                    source.getEditText().getText().toString().equals("Bilaspur Road")||
//                                    source.getEditText().getText().toString().equals("Bildi")||
//                                    source.getEditText().getText().toString().equals("Bilhar Ghat")||
//                                    source.getEditText().getText().toString().equals("Bilhaur")||
//                                    source.getEditText().getText().toString().equals("Bilimora Junction")||
//                                    source.getEditText().getText().toString().equals("Bilkha")||
//                                    source.getEditText().getText().toString().equals("Billi")||
//                                    source.getEditText().getText().toString().equals("Bilpur")||
//                                    source.getEditText().getText().toString().equals("Bilwai")||
//                                    source.getEditText().getText().toString().equals("Bina Junction")||
//                                    source.getEditText().getText().toString().equals("Binaur")||
//                                    source.getEditText().getText().toString().equals("Bindki Road")||
//                                    source.getEditText().getText().toString().equals("Binnaguri")||
//                                    source.getEditText().getText().toString().equals("Bir")||
//                                    source.getEditText().getText().toString().equals("Biradhwal")||
//                                    source.getEditText().getText().toString().equals("Birambad")||
//                                    source.getEditText().getText().toString().equals("Birang Khera")||
//                                    source.getEditText().getText().toString().equals("Birapatti")||
//                                    source.getEditText().getText().toString().equals("Birlanagar")||
//                                    source.getEditText().getText().toString().equals("Birmitrapur")||
//                                    source.getEditText().getText().toString().equals("Birohe")||
//                                    source.getEditText().getText().toString().equals("Biroliya")||
//                                    source.getEditText().getText().toString().equals("Birsinghpur")||
//                                    source.getEditText().getText().toString().equals("Birur")||
//                                    source.getEditText().getText().toString().equals("Bisalwas Kalan")||
//                                    source.getEditText().getText().toString().equals("Bishengarh")||
//                                    source.getEditText().getText().toString().equals("Bishnathganj")||
//                                    source.getEditText().getText().toString().equals("Bishnupur")||
//                                    source.getEditText().getText().toString().equals("Bishrampur")||
//                                    source.getEditText().getText().toString().equals("Bissam Cuttack")||
//                                    source.getEditText().getText().toString().equals("Bissau")||
//                                    source.getEditText().getText().toString().equals("Biswa Bridge")||
//                                    source.getEditText().getText().toString().equals("Biswan")||
//                                    source.getEditText().getText().toString().equals("Biyavra")||
//                                    source.getEditText().getText().toString().equals("Biyavra Rajgarh")||
//                                    source.getEditText().getText().toString().equals("Bobas")||
//                                    source.getEditText().getText().toString().equals("Bobbili Junction")||
//                                    source.getEditText().getText().toString().equals("Bodeli")||
//                                    source.getEditText().getText().toString().equals("Bodhan")||
//                                    source.getEditText().getText().toString().equals("Bodwad")||
//                                    source.getEditText().getText().toString().equals("Boinda")||
//                                    source.getEditText().getText().toString().equals("Boisar")||
//                                    source.getEditText().getText().toString().equals("Bokajan")||
//                                    source.getEditText().getText().toString().equals("Bokaro Steel City")||
//                                    source.getEditText().getText().toString().equals("Bokaro Thermal")||
//                                    source.getEditText().getText().toString().equals("Boko")||
//                                    source.getEditText().getText().toString().equals("Bolai")||
//                                    source.getEditText().getText().toString().equals("Bolarum")||
//                                    source.getEditText().getText().toString().equals("Bolda")||
//                                    source.getEditText().getText().toString().equals("Bolpur — Santiniketan")||
//                                    source.getEditText().getText().toString().equals("Bommidi")||
//                                    source.getEditText().getText().toString().equals("Bongaigaon")||
//                                    source.getEditText().getText().toString().equals("Borawar")||
//                                    source.getEditText().getText().toString().equals("Bordhal")||
//                                    source.getEditText().getText().toString().equals("Bordi")||
//                                    source.getEditText().getText().toString().equals("Bordi Road")||
//                                    source.getEditText().getText().toString().equals("Borgaon")||
//                                    source.getEditText().getText().toString().equals("Borivali")||
//                                    source.getEditText().getText().toString().equals("Borra Guhalu")||
//                                    source.getEditText().getText().toString().equals("Borvihir")||
//                                    source.getEditText().getText().toString().equals("Botad Junction")||
//                                    source.getEditText().getText().toString().equals("Boxirhat")||
//                                    source.getEditText().getText().toString().equals("Brahmavart")||
//                                    source.getEditText().getText().toString().equals("Brajarajnagar")||
//                                    source.getEditText().getText().toString().equals("Brayla Chaurasi")||
//                                    source.getEditText().getText().toString().equals("Budalur")||
//                                    source.getEditText().getText().toString().equals("Budaun")||
//                                    source.getEditText().getText().toString().equals("Budge Budge")||
//                                    source.getEditText().getText().toString().equals("Budhi")||
//                                    source.getEditText().getText().toString().equals("Budhlada")||
//                                    source.getEditText().getText().toString().equals("Budni")||
//                                    source.getEditText().getText().toString().equals("Bulandshahr")||
//                                    source.getEditText().getText().toString().equals("Bundi")||
//                                    source.getEditText().getText().toString().equals("Bundki")||
//                                    source.getEditText().getText().toString().equals("Burdwan")||
//                                    source.getEditText().getText().toString().equals("Burhanpur")||
//                                    source.getEditText().getText().toString().equals("Burhar")||
//                                    source.getEditText().getText().toString().equals("Burhwal")||
//                                    source.getEditText().getText().toString().equals("Burnpur")||
//                                    source.getEditText().getText().toString().equals("Butari")||
//                                    source.getEditText().getText().toString().equals("Butewala")||
//                                    source.getEditText().getText().toString().equals("Buxar")||
//                                    source.getEditText().getText().toString().equals("Byadarahalli")||
//                                    source.getEditText().getText().toString().equals("Byculla")||
//                                    source.getEditText().getText().toString().equals("Boridand")||
//                                    source.getEditText().getText().toString().equals("Barai Jalalpur")||
//                                    source.getEditText().getText().toString().equals("Bangaon")||
//                                    source.getEditText().getText().toString().equals("B.B.D. Bag")||
//                                    source.getEditText().getText().toString().equals("Budge Budge")||
//                                    source.getEditText().getText().toString().equals("Bamangachi")||
//                                    source.getEditText().getText().toString().equals("Bira")||
//                                    source.getEditText().getText().toString().equals("Birati")||
//                                    source.getEditText().getText().toString().equals("Bibhuti Bhushan Halt")||
//                                    source.getEditText().getText().toString().equals("Belur")||
//                                    source.getEditText().getText().toString().equals("Belur Math")||
//                                    source.getEditText().getText().toString().equals("Bisharpara Kodaliya")||
//                                    source.getEditText().getText().toString().equals("Baghbazar")||
//                                    source.getEditText().getText().toString().equals("Burra Bazar")||
//                                    source.getEditText().getText().toString().equals("Birnagar")||
//                                    source.getEditText().getText().toString().equals("Beldanga")||
//                                    source.getEditText().getText().toString().equals("Chatrapur")||
//                                    source.getEditText().getText().toString().equals("C Shahumaharaj T")||
//                                    source.getEditText().getText().toString().equals("Kozhikode")||
//                                    source.getEditText().getText().toString().equals("Canacona railway station")||
//                                    source.getEditText().getText().toString().equals("Cansaulim railway station")||
//                                    source.getEditText().getText().toString().equals("Caranzol railway station")||
//                                    source.getEditText().getText().toString().equals("Kannur")||
//                                    source.getEditText().getText().toString().equals("Cannanore South")||
//                                    source.getEditText().getText().toString().equals("Carmelaram (Sarjapur Road, Bangalore)")||
//                                    source.getEditText().getText().toString().equals("Castle Rock")||
//                                    source.getEditText().getText().toString().equals("CBD Belapur")||
//                                    source.getEditText().getText().toString().equals("Chandanathope")||
//                                    source.getEditText().getText().toString().equals("Chabua")||
//                                    source.getEditText().getText().toString().equals("Chachaura Bngj")||
//                                    source.getEditText().getText().toString().equals("Chadotar")||
//                                    source.getEditText().getText().toString().equals("Chaibasa")||
//                                    source.getEditText().getText().toString().equals("Chainwa")||
//                                    source.getEditText().getText().toString().equals("Chajawa")||
//                                    source.getEditText().getText().toString().equals("Chajli")||
//                                    source.getEditText().getText().toString().equals("Chak Dayala")||
//                                    source.getEditText().getText().toString().equals("Chak Rakhwal")||
//                                    source.getEditText().getText().toString().equals("Chakdaha")||
//                                    source.getEditText().getText().toString().equals("Chakehri(Kanpur)")||
//                                    source.getEditText().getText().toString().equals("Chakia")||
//                                    source.getEditText().getText().toString().equals("Chakradharpur")||
//                                    source.getEditText().getText().toString().equals("Chakraj Mal")||
//                                    source.getEditText().getText().toString().equals("Chaksu")||
//                                    source.getEditText().getText().toString().equals("Chakulia")||
//                                    source.getEditText().getText().toString().equals("Chalakudy")||
//                                    source.getEditText().getText().toString().equals("Chalala")||
//                                    source.getEditText().getText().toString().equals("Chalisgaon Junction")||
//                                    source.getEditText().getText().toString().equals("Challakere")||
//                                    source.getEditText().getText().toString().equals("Chalthan")||
//                                    source.getEditText().getText().toString().equals("Chamagram")||
//                                    source.getEditText().getText().toString().equals("Chamarajanagar")||
//                                    source.getEditText().getText().toString().equals("Champa")||
//                                    source.getEditText().getText().toString().equals("Champaner Rd Junction")||
//                                    source.getEditText().getText().toString().equals("Chamraura")||
//                                    source.getEditText().getText().toString().equals("Chand Siau")||
//                                    source.getEditText().getText().toString().equals("Chanda Fort")||
//                                    source.getEditText().getText().toString().equals("Chandan Nagar")||
//                                    source.getEditText().getText().toString().equals("Chandar railway station")||
//                                    source.getEditText().getText().toString().equals("Chandari(Kanpur)")||
//                                    source.getEditText().getText().toString().equals("Chandauli Majhwar")||
//                                    source.getEditText().getText().toString().equals("Chandausi Junction")||
//                                    source.getEditText().getText().toString().equals("Chandawal")||
//                                    source.getEditText().getText().toString().equals("Chanderiya")||
//                                    source.getEditText().getText().toString().equals("Chandi Mandir")||
//                                    source.getEditText().getText().toString().equals("Chandia Road")||
//                                    source.getEditText().getText().toString().equals("Chandigarh")||
//                                    source.getEditText().getText().toString().equals("Chandil Junction")||
//                                    source.getEditText().getText().toString().equals("Chandiposi")||
//                                    source.getEditText().getText().toString().equals("Chandisar")||
//                                    source.getEditText().getText().toString().equals("Chandkhira Bagn")||
//                                    source.getEditText().getText().toString().equals("Chandlodiya")||
//                                    source.getEditText().getText().toString().equals("Chandok")||
//                                    source.getEditText().getText().toString().equals("Chandranathpur")||
//                                    source.getEditText().getText().toString().equals("Chandrapur")||
//                                    source.getEditText().getText().toString().equals("Chandrapura")||
//                                    source.getEditText().getText().toString().equals("Chandresal")||
//                                    source.getEditText().getText().toString().equals("Chandur")||
//                                    source.getEditText().getText().toString().equals("Chaneti")||
//                                    source.getEditText().getText().toString().equals("Changanacheri")||
//                                    source.getEditText().getText().toString().equals("Changsari")||
//                                    source.getEditText().getText().toString().equals("Channani")||
//                                    source.getEditText().getText().toString().equals("Channapatna")||
//                                    source.getEditText().getText().toString().equals("Chanpatia")||
//                                    source.getEditText().getText().toString().equals("Chaparmukh Junction")||
//                                    source.getEditText().getText().toString().equals("Chaprakata")||
//                                    source.getEditText().getText().toString().equals("Charaud")||
//                                    source.getEditText().getText().toString().equals("Charbagh")||
//                                    source.getEditText().getText().toString().equals("Charbatia")||
//                                    source.getEditText().getText().toString().equals("Charbhuja Road")||
//                                    source.getEditText().getText().toString().equals("Chargola")||
//                                    source.getEditText().getText().toString().equals("Charkhari Road")||
//                                    source.getEditText().getText().toString().equals("Charkhi Dadri")||
//                                    source.getEditText().getText().toString().equals("Charni Road")||
//                                    source.getEditText().getText().toString().equals("Charvattur")||
//                                    source.getEditText().getText().toString().equals("Chata")||
//                                    source.getEditText().getText().toString().equals("Chau Mahla")||
//                                    source.getEditText().getText().toString().equals("Chaube")||
//                                    source.getEditText().getText().toString().equals("Chaukhandi")||
//                                    source.getEditText().getText().toString().equals("Chaunrah")||
//                                    source.getEditText().getText().toString().equals("Chaurakheri")||
//                                    source.getEditText().getText().toString().equals("Chaure Bazar")||
//                                    source.getEditText().getText().toString().equals("Chauri Chaura")||
//                                    source.getEditText().getText().toString().equals("Chausa")||
//                                    source.getEditText().getText().toString().equals("Chautara")||
//                                    source.getEditText().getText().toString().equals("Chauth Ka Brwra")||
//                                    source.getEditText().getText().toString().equals("Chavalkhede")||
//                                    source.getEditText().getText().toString().equals("Chawapall")||
//                                    source.getEditText().getText().toString().equals("Chaygaon")||
//                                    source.getEditText().getText().toString().equals("Chemancheri")||
//                                    source.getEditText().getText().toString().equals("Chembur")||
//                                    source.getEditText().getText().toString().equals("Chengalpattu")||
//                                    source.getEditText().getText().toString().equals("Chengannur")||
//                                    source.getEditText().getText().toString().equals("Chennai Beach")||
//                                    source.getEditText().getText().toString().equals("Chennai Central railway station")||
//                                    source.getEditText().getText().toString().equals("Chennai Egmore")||
//                                    source.getEditText().getText().toString().equals("Chennai Fort")||
//                                    source.getEditText().getText().toString().equals("Chennai Park")||
//                                    source.getEditText().getText().toString().equals("Cheriyanad")||
//                                    source.getEditText().getText().toString().equals("Cherthala")||
//                                    source.getEditText().getText().toString().equals("Chetar")||
//                                    source.getEditText().getText().toString().equals("Chettinad")||
//                                    source.getEditText().getText().toString().equals("Chhabra Gugor")||
//                                    source.getEditText().getText().toString().equals("Chhan Arorian")||
//                                    source.getEditText().getText().toString().equals("Chhandrauli")||
//                                    source.getEditText().getText().toString().equals("Chhansara")||
//                                    source.getEditText().getText().toString().equals("Chhapi")||
//                                    source.getEditText().getText().toString().equals("Chhapra")||
//                                    source.getEditText().getText().toString().equals("Chhapra Kacheri")||
//                                    source.getEditText().getText().toString().equals("Chharodi")||
//                                    source.getEditText().getText().toString().equals("Chhatrapati Shivaji Terminus")||
//                                    source.getEditText().getText().toString().equals("Chhatarpur")||
//                                    source.getEditText().getText().toString().equals("Chatrapur")||
//                                    source.getEditText().getText().toString().equals("Chhidgaon")||
//                                    source.getEditText().getText().toString().equals("Chhina")||
//                                    source.getEditText().getText().toString().equals("Chhindwara Junction")||
//                                    source.getEditText().getText().toString().equals("Chhipadohar")||
//                                    source.getEditText().getText().toString().equals("Chhitauni")||
//                                    source.getEditText().getText().toString().equals("Chhota Gudha")||
//                                    source.getEditText().getText().toString().equals("Chhota Udaipur")||
//                                    source.getEditText().getText().toString().equals("Chhoti Odai")||
//                                    source.getEditText().getText().toString().equals("Chianki")||
//                                    source.getEditText().getText().toString().equals("Chidambaram")||
//                                    source.getEditText().getText().toString().equals("Chiheru")||
//                                    source.getEditText().getText().toString().equals("Chikballapur")||
//                                    source.getEditText().getText().toString().equals("Chikkamagaluru")||
//                                    source.getEditText().getText().toString().equals("Chikalthan")||
//                                    source.getEditText().getText().toString().equals("Chikjajur Junction")||
//                                    source.getEditText().getText().toString().equals("Chikni Road")||
//                                    source.getEditText().getText().toString().equals("Chikodi Road")||
//                                    source.getEditText().getText().toString().equals("Chilbila Junction")||
//                                    source.getEditText().getText().toString().equals("Chilka")||
//                                    source.getEditText().getText().toString().equals("Chilo")||
//                                    source.getEditText().getText().toString().equals("Chinchli")||
//                                    source.getEditText().getText().toString().equals("Chinchpada")||
//                                    source.getEditText().getText().toString().equals("Chinchpokli")||
//                                    source.getEditText().getText().toString().equals("Chinchwad")||
//                                    source.getEditText().getText().toString().equals("Chinna Ganjam")||
//                                    source.getEditText().getText().toString().equals("Chinna Salem")||
//                                    source.getEditText().getText().toString().equals("Chintamani")||
//                                    source.getEditText().getText().toString().equals("Chiplun")||
//                                    source.getEditText().getText().toString().equals("Chipurupalle")||
//                                    source.getEditText().getText().toString().equals("Chirai")||
//                                    source.getEditText().getText().toString().equals("Chirala")||
//                                    source.getEditText().getText().toString().equals("Chirawa")||
//                                    source.getEditText().getText().toString().equals("Chirayinkil")||
//                                    source.getEditText().getText().toString().equals("Chirgaon")||
//                                    source.getEditText().getText().toString().equals("Chirmiri")||
//                                    source.getEditText().getText().toString().equals("Chit Baragaon")||
//                                    source.getEditText().getText().toString().equals("Chitahra")||
//                                    source.getEditText().getText().toString().equals("Chital")||
//                                    source.getEditText().getText().toString().equals("Chitali")||
//                                    source.getEditText().getText().toString().equals("Chitradurga")||
//                                    source.getEditText().getText().toString().equals("Chitrakuta")||
//                                    source.getEditText().getText().toString().equals("Chitrapur")||
//                                    source.getEditText().getText().toString().equals("Chitrasani")||
//                                    source.getEditText().getText().toString().equals("Chitrawad")||
//                                    source.getEditText().getText().toString().equals("Chitrod")||
//                                    source.getEditText().getText().toString().equals("Chitapur")||
//                                    source.getEditText().getText().toString().equals("Chittaranjan")||
//                                    source.getEditText().getText().toString().equals("Chittaurgarh")||
//                                    source.getEditText().getText().toString().equals("Chittoor")||
//                                    source.getEditText().getText().toString().equals("Chodiala")||
//                                    source.getEditText().getText().toString().equals("Choki Sorath")||
//                                    source.getEditText().getText().toString().equals("Chola")||
//                                    source.getEditText().getText().toString().equals("Cholang")||
//                                    source.getEditText().getText().toString().equals("Chomun Samod")||
//                                    source.getEditText().getText().toString().equals("Chondi")||
//                                    source.getEditText().getText().toString().equals("Chopan")||
//                                    source.getEditText().getText().toString().equals("Choral")||
//                                    source.getEditText().getText().toString().equals("Chorvad Road")||
//                                    source.getEditText().getText().toString().equals("Chosla")||
//                                    source.getEditText().getText().toString().equals("Choti Khatu")||
//                                    source.getEditText().getText().toString().equals("Chuchura")||
//                                    source.getEditText().getText().toString().equals("Chuda")||
//                                    source.getEditText().getText().toString().equals("Chunabhatti")||
//                                    source.getEditText().getText().toString().equals("Chunar")||
//                                    source.getEditText().getText().toString().equals("Churchgate")||
//                                    source.getEditText().getText().toString().equals("Churk")||
//                                    source.getEditText().getText().toString().equals("Churu")||
//                                    source.getEditText().getText().toString().equals("Clutterbuckganj")||
//                                    source.getEditText().getText().toString().equals("Cochin Harbour Terminus")||
//                                    source.getEditText().getText().toString().equals("Coimbatore Junction")||
//                                    source.getEditText().getText().toString().equals("Coimbatore North Junction")||
//                                    source.getEditText().getText().toString().equals("Colonelganj")||
//                                    source.getEditText().getText().toString().equals("Contai Road")||
//                                    source.getEditText().getText().toString().equals("Coonoor")||
//                                    source.getEditText().getText().toString().equals("Cotton Green")||
//                                    source.getEditText().getText().toString().equals("Cuddalore Junction")||
//                                    source.getEditText().getText().toString().equals("Cuddalore Port")||
//                                    source.getEditText().getText().toString().equals("Cuddapah")||
//                                    source.getEditText().getText().toString().equals("Cumbum")||
//                                    source.getEditText().getText().toString().equals("Cuttack")||
//                                    source.getEditText().getText().toString().equals("Currey Road")||
//                                    source.getEditText().getText().toString().equals("Dabhaura")||
//                                    source.getEditText().getText().toString().equals("Dabhoi Junction")||
//                                    source.getEditText().getText().toString().equals("Dabilpur")||
//                                    source.getEditText().getText().toString().equals("Dabla")||
//                                    source.getEditText().getText().toString().equals("Dabli Rathan")||
//                                    source.getEditText().getText().toString().equals("Dabolim railway station")||
//                                    source.getEditText().getText().toString().equals("Dabra")||
//                                    source.getEditText().getText().toString().equals("Dabtara")||
//                                    source.getEditText().getText().toString().equals("Dadar (Western Railway)")||
//                                    source.getEditText().getText().toString().equals("Dadar (Central Railway)")||
//                                    source.getEditText().getText().toString().equals("Dadri")||
//                                    source.getEditText().getText().toString().equals("Dagaon")||
//                                    source.getEditText().getText().toString().equals("Dagmagpur")||
//                                    source.getEditText().getText().toString().equals("Dahanu Road")||
//                                    source.getEditText().getText().toString().equals("Dahar Ka Balaji")||
//                                    source.getEditText().getText().toString().equals("Dahina Zainabad")||
//                                    source.getEditText().getText().toString().equals("Dahisar")||
//                                    source.getEditText().getText().toString().equals("Dahod")||
//                                    source.getEditText().getText().toString().equals("Dailwara")||
//                                    source.getEditText().getText().toString().equals("Dakaniya Talav")||
//                                    source.getEditText().getText().toString().equals("Dakhineswar")||
//                                    source.getEditText().getText().toString().equals("Dakor")||
//                                    source.getEditText().getText().toString().equals("Daladi")||
//                                    source.getEditText().getText().toString().equals("Dalauda")||
//                                    source.getEditText().getText().toString().equals("Dalelnagar")||
//                                    source.getEditText().getText().toString().equals("Dalgaon")||
//                                    source.getEditText().getText().toString().equals("Daliganj")||
//                                    source.getEditText().getText().toString().equals("Dalhousie Road")||
//                                    source.getEditText().getText().toString().equals("Dalkhola")||
//                                    source.getEditText().getText().toString().equals("Dalli-Rajhara")||
//                                    source.getEditText().getText().toString().equals("Dalmau Junction")||
//                                    source.getEditText().getText().toString().equals("Dalmera")||
//                                    source.getEditText().getText().toString().equals("Dalpatpur")||
//                                    source.getEditText().getText().toString().equals("Dalsingh Sarai")||
//                                    source.getEditText().getText().toString().equals("Daltonganj")||
//                                    source.getEditText().getText().toString().equals("Damanjodi")||
//                                    source.getEditText().getText().toString().equals("Damchara")||
//                                    source.getEditText().getText().toString().equals("Damnagar")||
//                                    source.getEditText().getText().toString().equals("Damoh")||
//                                    source.getEditText().getText().toString().equals("Danapur")||
//                                    source.getEditText().getText().toString().equals("Dandeli")||
//                                    source.getEditText().getText().toString().equals("Dandupur")||
//                                    source.getEditText().getText().toString().equals("Dangoaposi")||
//                                    source.getEditText().getText().toString().equals("Dangtal")||
//                                    source.getEditText().getText().toString().equals("Daniyawan Bzr H")||
//                                    source.getEditText().getText().toString().equals("Dankaur")||
//                                    source.getEditText().getText().toString().equals("Dankuni")||
//                                    source.getEditText().getText().toString().equals("Danwar")||
//                                    source.getEditText().getText().toString().equals("Dapodi")||
//                                    source.getEditText().getText().toString().equals("Dappar")||
//                                    source.getEditText().getText().toString().equals("Daotuhaja")||
//                                    source.getEditText().getText().toString().equals("Dara")||
//                                    source.getEditText().getText().toString().equals("Daraganj")||
//                                    source.getEditText().getText().toString().equals("Darbhanga")||
//                                    source.getEditText().getText().toString().equals("Darjeeling")||
//                                    source.getEditText().getText().toString().equals("Darritola")||
//                                    source.getEditText().getText().toString().equals("Daryabad")||
//                                    source.getEditText().getText().toString().equals("Daryapur")||
//                                    source.getEditText().getText().toString().equals("Dasna")||
//                                    source.getEditText().getText().toString().equals("Dasuya")||
//                                    source.getEditText().getText().toString().equals("Datia")||
//                                    source.getEditText().getText().toString().equals("Dativali")||
//                                    source.getEditText().getText().toString().equals("Daudpur")||
//                                    source.getEditText().getText().toString().equals("Daulatabad")||
//                                    source.getEditText().getText().toString().equals("Daund Junction")||
//                                    source.getEditText().getText().toString().equals("Daundaj")||
//                                    source.getEditText().getText().toString().equals("Daurai")||
//                                    source.getEditText().getText().toString().equals("Daurala")||
//                                    source.getEditText().getText().toString().equals("Dauram Madhpura")||
//                                    source.getEditText().getText().toString().equals("Dausa")||
//                                    source.getEditText().getText().toString().equals("Dausni")||
//                                    source.getEditText().getText().toString().equals("Davanagere")||
//                                    source.getEditText().getText().toString().equals("Dayalpur")||
//                                    source.getEditText().getText().toString().equals("Debari")||
//                                    source.getEditText().getText().toString().equals("Debipur")||
//                                    source.getEditText().getText().toString().equals("Degana Junction")||
//                                    source.getEditText().getText().toString().equals("Dehradun")||
//                                    source.getEditText().getText().toString().equals("Dehri On Sone")||
//                                    source.getEditText().getText().toString().equals("Dehu Road")||
//                                    source.getEditText().getText().toString().equals("Dekapam")||
//                                    source.getEditText().getText().toString().equals("Delhi")||
//                                    source.getEditText().getText().toString().equals("Delhi MG")||
//                                    source.getEditText().getText().toString().equals("Delhi Azadpur")||
//                                    source.getEditText().getText().toString().equals("Delhi Cantonment")||
//                                    source.getEditText().getText().toString().equals("Delhi Kishanganj")||
//                                    source.getEditText().getText().toString().equals("Sarai Rohilla")||
//                                    source.getEditText().getText().toString().equals("Delhi Safdarjung")||
//                                    source.getEditText().getText().toString().equals("Shahdara")||
//                                    source.getEditText().getText().toString().equals("Delvada")||
//                                    source.getEditText().getText().toString().equals("Demu")||
//                                    source.getEditText().getText().toString().equals("Deoband")||
//                                    source.getEditText().getText().toString().equals("Deogan Road")||
//                                    source.getEditText().getText().toString().equals("Deoghar Junction")||
//                                    source.getEditText().getText().toString().equals("Deorakot")||
//                                    source.getEditText().getText().toString().equals("Deoria Sadar")||
//                                    source.getEditText().getText().toString().equals("Depalsar")||
//                                    source.getEditText().getText().toString().equals("Derol")||
//                                    source.getEditText().getText().toString().equals("Desari")||
//                                    source.getEditText().getText().toString().equals("Deshalpar")||
//                                    source.getEditText().getText().toString().equals("Deshnok")||
//                                    source.getEditText().getText().toString().equals("Deswal")||
//                                    source.getEditText().getText().toString().equals("Detroj")||
//                                    source.getEditText().getText().toString().equals("Devakottai Road")||
//                                    source.getEditText().getText().toString().equals("Devbaloda Charoda")||
//                                    source.getEditText().getText().toString().equals("Devgam")||
//                                    source.getEditText().getText().toString().equals("Devgarh Madriya")||
//                                    source.getEditText().getText().toString().equals("Devlali")||
//                                    source.getEditText().getText().toString().equals("Devpura")||
//                                    source.getEditText().getText().toString().equals("Dewalgaon")||
//                                    source.getEditText().getText().toString().equals("Dewanganj")||
//                                    source.getEditText().getText().toString().equals("Dewas")||
//                                    source.getEditText().getText().toString().equals("Dhaban")||
//                                    source.getEditText().getText().toString().equals("Dhalaibil")||
//                                    source.getEditText().getText().toString().equals("Dhalgaon")||
//                                    source.getEditText().getText().toString().equals("Dhalpukhuri")||
//                                    source.getEditText().getText().toString().equals("Dhamangaon")||
//                                    source.getEditText().getText().toString().equals("Dhamni")||
//                                    source.getEditText().getText().toString().equals("Dhamora")||
//                                    source.getEditText().getText().toString().equals("Dhampur")||
//                                    source.getEditText().getText().toString().equals("Dhamtari")||
//                                    source.getEditText().getText().toString().equals("Dhamua")||
//                                    source.getEditText().getText().toString().equals("Dhana Kherli")||
//                                    source.getEditText().getText().toString().equals("Dhanakwada")||
//                                    source.getEditText().getText().toString().equals("Dhanakya")||
//                                    source.getEditText().getText().toString().equals("Dhanari")||
//                                    source.getEditText().getText().toString().equals("Dhanawala Wada")||
//                                    source.getEditText().getText().toString().equals("Dhanbad Junction")||
//                                    source.getEditText().getText().toString().equals("Dhandari Kalan")||
//                                    source.getEditText().getText().toString().equals("Dhandhera")||
//                                    source.getEditText().getText().toString().equals("Dhandhuka")||
//                                    source.getEditText().getText().toString().equals("Dhanera")||
//                                    source.getEditText().getText().toString().equals("Dhaneta")||
//                                    source.getEditText().getText().toString().equals("Dhangadra")||
//                                    source.getEditText().getText().toString().equals("Dhanmandal")||
//                                    source.getEditText().getText().toString().equals("Dharamtul")||
//                                    source.getEditText().getText().toString().equals("Dharangaon")||
//                                    source.getEditText().getText().toString().equals("Dhareshwar")||
//                                    source.getEditText().getText().toString().equals("Dhari Junction")||
//                                    source.getEditText().getText().toString().equals("Dhariwal")||
//                                    source.getEditText().getText().toString().equals("Dharmabad")||
//                                    source.getEditText().getText().toString().equals("Dharmanagar")||
//                                    source.getEditText().getText().toString().equals("Dharmapuri")||
//                                    source.getEditText().getText().toString().equals("Dharmavaram Junction")||
//                                    source.getEditText().getText().toString().equals("Dharmpur Himachal")||
//                                    source.getEditText().getText().toString().equals("Dharnaoda")||
//                                    source.getEditText().getText().toString().equals("Dharodi")||
//                                    source.getEditText().getText().toString().equals("Dharwad")||
//                                    source.getEditText().getText().toString().equals("Dhasa Junction")||
//                                    source.getEditText().getText().toString().equals("Dholpur")||
//                                    source.getEditText().getText().toString().equals("Dhaura")||
//                                    source.getEditText().getText().toString().equals("Dheena")||
//                                    source.getEditText().getText().toString().equals("Dhekiajili Road")||
//                                    source.getEditText().getText().toString().equals("Dhemaji")||
//                                    source.getEditText().getText().toString().equals("Dhenkanal")||
//                                    source.getEditText().getText().toString().equals("Dhilwan")||
//                                    source.getEditText().getText().toString().equals("Dhinda")||
//                                    source.getEditText().getText().toString().equals("Dhindhora HKMKD")||
//                                    source.getEditText().getText().toString().equals("Dhindsa")||
//                                    source.getEditText().getText().toString().equals("Dhing")||
//                                    source.getEditText().getText().toString().equals("Dhing Bazar")||
//                                    source.getEditText().getText().toString().equals("Dhinoj")||
//                                    source.getEditText().getText().toString().equals("Dhirera")||
//                                    source.getEditText().getText().toString().equals("Dhirganj")||
//                                    source.getEditText().getText().toString().equals("Dhirpur")||
//                                    source.getEditText().getText().toString().equals("Dhoda Khedi")||
//                                    source.getEditText().getText().toString().equals("Dhodhar")||
//                                    source.getEditText().getText().toString().equals("Dhodra Mohar")||
//                                    source.getEditText().getText().toString().equals("Dhola Junction")||
//                                    source.getEditText().getText().toString().equals("Dhola Mazra")||
//                                    source.getEditText().getText().toString().equals("Dholi")||
//                                    source.getEditText().getText().toString().equals("Dholka")||
//                                    source.getEditText().getText().toString().equals("Dhondi")||
//                                    source.getEditText().getText().toString().equals("Dhoraji")||
//                                    source.getEditText().getText().toString().equals("Dhrangadhra Junction")||
//                                    source.getEditText().getText().toString().equals("Dhubri")||
//                                    source.getEditText().getText().toString().equals("Dhule")||
//                                    source.getEditText().getText().toString().equals("Dhulghat")||
//                                    source.getEditText().getText().toString().equals("Dhulkot")||
//                                    source.getEditText().getText().toString().equals("Dhup Dhara")||
//                                    source.getEditText().getText().toString().equals("Dhupguri")||
//                                    source.getEditText().getText().toString().equals("Dhuri Junction")||
//                                    source.getEditText().getText().toString().equals("Diamond Harbour")||
//                                    source.getEditText().getText().toString().equals("Dibai")||
//                                    source.getEditText().getText().toString().equals("Dibrugarh")||
//                                    source.getEditText().getText().toString().equals("Dibrugarh Town")||
//                                    source.getEditText().getText().toString().equals("Dichpalli")||
//                                    source.getEditText().getText().toString().equals("Didwana")||
//                                    source.getEditText().getText().toString().equals("Digaru")||
//                                    source.getEditText().getText().toString().equals("Digboi")||
//                                    source.getEditText().getText().toString().equals("Digha")||
//                                    source.getEditText().getText().toString().equals("Dighwara")||
//                                    source.getEditText().getText().toString().equals("Digod")||
//                                    source.getEditText().getText().toString().equals("Dihakho")||
//                                    source.getEditText().getText().toString().equals("Dilawarnagar")||
//                                    source.getEditText().getText().toString().equals("Dildarnagar Junction")||
//                                    source.getEditText().getText().toString().equals("Dimapur")||
//                                    source.getEditText().getText().toString().equals("Dimow")||
//                                    source.getEditText().getText().toString().equals("Dina Nagar")||
//                                    source.getEditText().getText().toString().equals("Dinagaon")||
//                                    source.getEditText().getText().toString().equals("Dindigul Junction")||
//                                    source.getEditText().getText().toString().equals("Dingwahi")||
//                                    source.getEditText().getText().toString().equals("Dipa")||
//                                    source.getEditText().getText().toString().equals("Diphu")||
//                                    source.getEditText().getText().toString().equals("Diplana")||
//                                    source.getEditText().getText().toString().equals("Dipori")||
//                                    source.getEditText().getText().toString().equals("Deesa")||
//                                    source.getEditText().getText().toString().equals("Ditokcherra")||
//                                    source.getEditText().getText().toString().equals("Diva Junction")||
//                                    source.getEditText().getText().toString().equals("Divine Nagar")||
//                                    source.getEditText().getText().toString().equals("Diwana")||
//                                    source.getEditText().getText().toString().equals("Diwankhavati")||
//                                    source.getEditText().getText().toString().equals("Diyodar")||
//                                    source.getEditText().getText().toString().equals("Dobh Bahali")||
//                                    source.getEditText().getText().toString().equals("Dockyard Road")||
//                                    source.getEditText().getText().toString().equals("Doddaballapur")||
//                                    source.getEditText().getText().toString().equals("Dodbele")||
//                                    source.getEditText().getText().toString().equals("Dohrighat")||
//                                    source.getEditText().getText().toString().equals("Doiwala")||
//                                    source.getEditText().getText().toString().equals("Dolavli")||
//                                    source.getEditText().getText().toString().equals("Dombivli")||
//                                    source.getEditText().getText().toString().equals("Domingarh")||
//                                    source.getEditText().getText().toString().equals("Donakonda")||
//                                    source.getEditText().getText().toString().equals("Dondaicha")||
//                                    source.getEditText().getText().toString().equals("Dongargaon")||
//                                    source.getEditText().getText().toString().equals("Dongargarh")||
//                                    source.getEditText().getText().toString().equals("Donigal")||
//                                    source.getEditText().getText().toString().equals("Doraha")||
//                                    source.getEditText().getText().toString().equals("Doravart Chtram")||
//                                    source.getEditText().getText().toString().equals("Dornakal Junction")||
//                                    source.getEditText().getText().toString().equals("Dronachalam Junction")||
//                                    source.getEditText().getText().toString().equals("Dronagiri")||
//                                    source.getEditText().getText().toString().equals("Dubaha")||
//                                    source.getEditText().getText().toString().equals("Dubia")||
//                                    source.getEditText().getText().toString().equals("Duddhinagar")||
//                                    source.getEditText().getText().toString().equals("Dudhani")||
//                                    source.getEditText().getText().toString().equals("Dudhia Khurd")||
//                                    source.getEditText().getText().toString().equals("Dudhnoi")||
//                                    source.getEditText().getText().toString().equals("Dudhwakhara")||
//                                    source.getEditText().getText().toString().equals("Dudh Sagar railway station")||
//                                    source.getEditText().getText().toString().equals("Dudh Sagar Water Falls railway station")||
//                                    source.getEditText().getText().toString().equals("Dudia")||
//                                    source.getEditText().getText().toString().equals("Dudwindi")||
//                                    source.getEditText().getText().toString().equals("Duganpur")||
//                                    source.getEditText().getText().toString().equals("Dugdol")||
//                                    source.getEditText().getText().toString().equals("Duggirala")||
//                                    source.getEditText().getText().toString().equals("Duhai")||
//                                    source.getEditText().getText().toString().equals("Duliajan")||
//                                    source.getEditText().getText().toString().equals("Dullabcherra")||
//                                    source.getEditText().getText().toString().equals("Dullahapur")||
//                                    source.getEditText().getText().toString().equals("Dulrasar")||
//                                    source.getEditText().getText().toString().equals("Dum Dum")||
//                                    source.getEditText().getText().toString().equals("Dum Dum Cantonment")||
//                                    source.getEditText().getText().toString().equals("Dumariya")||
//                                    source.getEditText().getText().toString().equals("Dumraon")||
//                                    source.getEditText().getText().toString().equals("Dumka")||
//                                    source.getEditText().getText().toString().equals("Dumuriput")||
//                                    source.getEditText().getText().toString().equals("Dundara")||
//                                    source.getEditText().getText().toString().equals("Dundlod MKDGRH")||
//                                    source.getEditText().getText().toString().equals("Dungar Junction")||
//                                    source.getEditText().getText().toString().equals("Dungarpur")||
//                                    source.getEditText().getText().toString().equals("Duraundha Junction")||
//                                    source.getEditText().getText().toString().equals("Durgauti")||
//                                    source.getEditText().getText().toString().equals("Durg")||
//                                    source.getEditText().getText().toString().equals("Durgapur")||
//                                    source.getEditText().getText().toString().equals("Duttapukur")||
//                                    source.getEditText().getText().toString().equals("Durgapura")||
//                                    source.getEditText().getText().toString().equals("Duskheda")||
//                                    source.getEditText().getText().toString().equals("Duvvada")||
//                                    source.getEditText().getText().toString().equals("Dwarka")||
//                                    source.getEditText().getText().toString().equals("Dwarkaganj")||
//                                    source.getEditText().getText().toString().equals("Errupalem")||
//                                    source.getEditText().getText().toString().equals("Ekambara kuppam")||
//                                    source.getEditText().getText().toString().equals("Ekangarsarai")||
//                                    source.getEditText().getText().toString().equals("Ekchari")||
//                                    source.getEditText().getText().toString().equals("Ekma")||
//                                    source.getEditText().getText().toString().equals("Ekma")||
//                                    source.getEditText().getText().toString().equals("Elamanur")||
//                                    source.getEditText().getText().toString().equals("Yelamanchili")||
//                                    source.getEditText().getText().toString().equals("Ellenabad")||
//                                    source.getEditText().getText().toString().equals("Eluru")||
//                                    source.getEditText().getText().toString().equals("Ennore")||
//                                    source.getEditText().getText().toString().equals("Eraligu")||
//                                    source.getEditText().getText().toString().equals("Eraniel")||
//                                    source.getEditText().getText().toString().equals("Eravipuram")||
//                                    source.getEditText().getText().toString().equals("Ernakulam Junction")||
//                                    source.getEditText().getText().toString().equals("Ernakulam Town")||
//                                    source.getEditText().getText().toString().equals("Ernakulam Terminus")||
//                                    source.getEditText().getText().toString().equals("Erode Junction")||
//                                    source.getEditText().getText().toString().equals("Etah")||
//                                    source.getEditText().getText().toString().equals("Etawah")||
//                                    source.getEditText().getText().toString().equals("Ettimadai(Coimbatore)")||
//                                    source.getEditText().getText().toString().equals("Etmadpur")||
//                                    source.getEditText().getText().toString().equals("Etakkot")||
//                                    source.getEditText().getText().toString().equals("Faizabad Junction")||
//                                    source.getEditText().getText().toString().equals("Faizullapur")||
//                                    source.getEditText().getText().toString().equals("Fakhrabad")||
//                                    source.getEditText().getText().toString().equals("Fakiragram Junction")||
//                                    source.getEditText().getText().toString().equals("Falakata")||
//                                    source.getEditText().getText().toString().equals("Falna")||
//                                    source.getEditText().getText().toString().equals("Farah Town")||
//                                    source.getEditText().getText().toString().equals("Farhedi")||
//                                    source.getEditText().getText().toString().equals("Faridabad")||
//                                    source.getEditText().getText().toString().equals("Faridabad New Town")||
//                                    source.getEditText().getText().toString().equals("Faridkot")||
//                                    source.getEditText().getText().toString().equals("Farrukhabad")||
//                                    source.getEditText().getText().toString().equals("Farrukhabad")||
//                                    source.getEditText().getText().toString().equals("Fateh Singhpura")||
//                                    source.getEditText().getText().toString().equals("Fatehabad Chandrawati Ganj Junction")||
//                                    source.getEditText().getText().toString().equals("Fatehgarh")||
//                                    source.getEditText().getText().toString().equals("Fatehgarh Sahib")||
//                                    source.getEditText().getText().toString().equals("Fatehnagar")||
//                                    source.getEditText().getText().toString().equals("Fatehpur")||
//                                    source.getEditText().getText().toString().equals("Fatehpur Sikri")||
//                                    source.getEditText().getText().toString().equals("Fatehpur Shekhawati")||
//                                    source.getEditText().getText().toString().equals("Fatuha")||
//                                    source.getEditText().getText().toString().equals("Fazalpur")||
//                                    source.getEditText().getText().toString().equals("Fazilka")||
//                                    source.getEditText().getText().toString().equals("Ferok")||
//                                    source.getEditText().getText().toString().equals("Firozabad")||
//                                    source.getEditText().getText().toString().equals("Firozpur Cant.")||
//                                    source.getEditText().getText().toString().equals("Firozpur City")||
//                                    source.getEditText().getText().toString().equals("Forbesganj")||
//                                    source.getEditText().getText().toString().equals("Furkating Junction")||
//                                    source.getEditText().getText().toString().equals("Fursatganj")||
//                                    source.getEditText().getText().toString().equals("Gachhipura")||
//                                    source.getEditText().getText().toString().equals("Gardhrubeswar")||
//                                    source.getEditText().getText().toString().equals("Gadag Junction")||
//                                    source.getEditText().getText().toString().equals("Gadarwara")||
//                                    source.getEditText().getText().toString().equals("Gadhakda")||
//                                    source.getEditText().getText().toString().equals("Gadra Road")||
//                                    source.getEditText().getText().toString().equals("Gadwal")||
//                                    source.getEditText().getText().toString().equals("Gahmar")||
//                                    source.getEditText().getText().toString().equals("Gainjahwa")||
//                                    source.getEditText().getText().toString().equals("Gainsari Junction")||
//                                    source.getEditText().getText().toString().equals("Gaipura")||
//                                    source.getEditText().getText().toString().equals("Gajraula Junction")||
//                                    source.getEditText().getText().toString().equals("Galan")||
//                                    source.getEditText().getText().toString().equals("Gambhiri Road")||
//                                    source.getEditText().getText().toString().equals("Ganagapur Road")||
//                                    source.getEditText().getText().toString().equals("Ganj Dundwara")||
//                                    source.getEditText().getText().toString().equals("Gannaur")||
//                                    source.getEditText().getText().toString().equals("Gandhi Smarak Road")||
//                                    source.getEditText().getText().toString().equals("Gandhidham Junction")||
//                                    source.getEditText().getText().toString().equals("Gandhigram")||
//                                    source.getEditText().getText().toString().equals("Gandhinagar Jaipur")||
//                                    source.getEditText().getText().toString().equals("Gandhinagar Capital")||
//                                    source.getEditText().getText().toString().equals("Ganeshganj")||
//                                    source.getEditText().getText().toString().equals("Gangaganj")||
//                                    source.getEditText().getText().toString().equals("Gangakher")||
//                                    source.getEditText().getText().toString().equals("Gangapur City")||
//                                    source.getEditText().getText().toString().equals("Gangarampur")||
//                                    source.getEditText().getText().toString().equals("Gangrar")||
//                                    source.getEditText().getText().toString().equals("Gangsar Jaitu")||
//                                    source.getEditText().getText().toString().equals("Ganj Basoda")||
//                                    source.getEditText().getText().toString().equals("Ganjmuradabad")||
//                                    source.getEditText().getText().toString().equals("Gannavaram")||
//                                    source.getEditText().getText().toString().equals("Garhi Harsaru Junction")||
//                                    source.getEditText().getText().toString().equals("Garhi Manikpur")||
//                                    source.getEditText().getText().toString().equals("Garhmuktesar")||
//                                    source.getEditText().getText().toString().equals("Garhmuktesar BR")||
//                                    source.getEditText().getText().toString().equals("Garna Sahib")||
//                                    source.getEditText().getText().toString().equals("Garhwa")||
//                                    source.getEditText().getText().toString().equals("Garia")||
//                                    source.getEditText().getText().toString().equals("Garwa Road Junction")||
//                                    source.getEditText().getText().toString().equals("Garot")||
//                                    source.getEditText().getText().toString().equals("Gaura")||
//                                    source.getEditText().getText().toString().equals("Gauri Bazar")||
//                                    source.getEditText().getText().toString().equals("Gauri Phanta")||
//                                    source.getEditText().getText().toString().equals("Gauribidanur")||
//                                    source.getEditText().getText().toString().equals("Gauriganj")||
//                                    source.getEditText().getText().toString().equals("Gauripur")||
//                                    source.getEditText().getText().toString().equals("Gauriyamau")||
//                                    source.getEditText().getText().toString().equals("Gaushala")||
//                                    source.getEditText().getText().toString().equals("Gautampura Road")||
//                                    source.getEditText().getText().toString().equals("Gaya Junction")||
//                                    source.getEditText().getText().toString().equals("Geratpur")||
//                                    source.getEditText().getText().toString().equals("Gerita Kolvada")||
//                                    source.getEditText().getText().toString().equals("Gevra Road")||
//                                    source.getEditText().getText().toString().equals("Gevrai")||
//                                    source.getEditText().getText().toString().equals("Ghaggar")||
//                                    source.getEditText().getText().toString().equals("Ghagwal")||
//                                    source.getEditText().getText().toString().equals("Ghanauli")||
//                                    source.getEditText().getText().toString().equals("Ghansoli")||
//                                    source.getEditText().getText().toString().equals("Gharaunda")||
//                                    source.getEditText().getText().toString().equals("Ghaso")||
//                                    source.getEditText().getText().toString().equals("Ghataka Varana")||
//                                    source.getEditText().getText().toString().equals("Ghatampur")||
//                                    source.getEditText().getText().toString().equals("Ghatkopar railway station")||
//                                    source.getEditText().getText().toString().equals("Ghatkopar")||
//                                    source.getEditText().getText().toString().equals("Ghatsila")||
//                                    source.getEditText().getText().toString().equals("Ghaziabad Junction")||
//                                    source.getEditText().getText().toString().equals("Ghazipur City")||
//                                    source.getEditText().getText().toString().equals("Ghograpur")||
//                                    source.getEditText().getText().toString().equals("Gholvad")||
//                                    source.getEditText().getText().toString().equals("Ghoradongri")||
//                                    source.getEditText().getText().toString().equals("Ghorawadi")||
//                                    source.getEditText().getText().toString().equals("Ghorpuri")||
//                                    source.getEditText().getText().toString().equals("Ghorpuri West")||
//                                    source.getEditText().getText().toString().equals("Ghosipura")||
//                                    source.getEditText().getText().toString().equals("Ghosunda")||
//                                    source.getEditText().getText().toString().equals("Ghughuli")||
//                                    source.getEditText().getText().toString().equals("Ghugus")||
//                                    source.getEditText().getText().toString().equals("Ghutai")||
//                                    source.getEditText().getText().toString().equals("Gidarpindi")||
//                                    source.getEditText().getText().toString().equals("Giddalur")||
//                                    source.getEditText().getText().toString().equals("Giddarbaha")||
//                                    source.getEditText().getText().toString().equals("Gidhaur")||
//                                    source.getEditText().getText().toString().equals("Gir Gadhara")||
//                                    source.getEditText().getText().toString().equals("Gir Hadmatiya")||
//                                    source.getEditText().getText().toString().equals("Giridih")||
//                                    source.getEditText().getText().toString().equals("Girwar")||
//                                    source.getEditText().getText().toString().equals("Goalpara Town")||
//                                    source.getEditText().getText().toString().equals("Godha")||
//                                    source.getEditText().getText().toString().equals("Godhra Junction")||
//                                    source.getEditText().getText().toString().equals("Gogameri")||
//                                    source.getEditText().getText().toString().equals("Gogamukh")||
//                                    source.getEditText().getText().toString().equals("Gohad Road")||
//                                    source.getEditText().getText().toString().equals("Gohana")||
//                                    source.getEditText().getText().toString().equals("Gohpur")||
//                                    source.getEditText().getText().toString().equals("Gokak Road")||
//                                    source.getEditText().getText().toString().equals("Gokarna Road")||
//                                    source.getEditText().getText().toString().equals("Gola Gokarannath")||
//                                    source.getEditText().getText().toString().equals("Golakganj Junction")||
//                                    source.getEditText().getText().toString().equals("Golanthra")||
//                                    source.getEditText().getText().toString().equals("Gole")||
//                                    source.getEditText().getText().toString().equals("Golsar")||
//                                    source.getEditText().getText().toString().equals("Gomti Nagar")||
//                                    source.getEditText().getText().toString().equals("Gonda Junction")||
//                                    source.getEditText().getText().toString().equals("Gonda Kachahri")||
//                                    source.getEditText().getText().toString().equals("Gonda MG")||
//                                    source.getEditText().getText().toString().equals("Gondal")||
//                                    source.getEditText().getText().toString().equals("Gondia Junction")||
//                                    source.getEditText().getText().toString().equals("Gondumri")||
//                                    source.getEditText().getText().toString().equals("Goneana")||
//                                    source.getEditText().getText().toString().equals("Gooty Junction")||
//                                    source.getEditText().getText().toString().equals("Gop Jam")||
//                                    source.getEditText().getText().toString().equals("Gopalganj")||
//                                    source.getEditText().getText().toString().equals("Gopalpur")||
//                                    source.getEditText().getText().toString().equals("Gora Ghuma")||
//                                    source.getEditText().getText().toString().equals("Gorakhpur Cantonment")||
//                                    source.getEditText().getText().toString().equals("Gorakhpur Junction")||
//                                    source.getEditText().getText().toString().equals("Goram Ghat")||
//                                    source.getEditText().getText().toString().equals("Ghorasahan")||
//                                    source.getEditText().getText().toString().equals("Goraul")||
//                                    source.getEditText().getText().toString().equals("Goraya")||
//                                    source.getEditText().getText().toString().equals("Goregaon")||
//                                    source.getEditText().getText().toString().equals("Goregaon Road Halt")||
//                                    source.getEditText().getText().toString().equals("Goresuar")||
//                                    source.getEditText().getText().toString().equals("Goriyan")||
//                                    source.getEditText().getText().toString().equals("Goshainganj")||
//                                    source.getEditText().getText().toString().equals("Gossaigaon Hat")||
//                                    source.getEditText().getText().toString().equals("Gotan")||
//                                    source.getEditText().getText().toString().equals("Gotegaon")||
//                                    source.getEditText().getText().toString().equals("Gothaj")||
//                                    source.getEditText().getText().toString().equals("Govandi")||
//                                    source.getEditText().getText().toString().equals("Goverdhan")||
//                                    source.getEditText().getText().toString().equals("Govindgarh")||
//                                    source.getEditText().getText().toString().equals("Govindgarh Malk")||
//                                    source.getEditText().getText().toString().equals("Govindi Marwar")||
//                                    source.getEditText().getText().toString().equals("Govindnagar")||
//                                    source.getEditText().getText().toString().equals("Govindpuri")||
//                                    source.getEditText().getText().toString().equals("Grant Road")||
//                                    source.getEditText().getText().toString().equals("Gudha")||
//                                    source.getEditText().getText().toString().equals("Guindy")||
//                                    source.getEditText().getText().toString().equals("Gubbi")||
//                                    source.getEditText().getText().toString().equals("Gudivada Junction")||
//                                    source.getEditText().getText().toString().equals("Gudiyattam")||
//                                    source.getEditText().getText().toString().equals("Gudur Junction")||
//                                    source.getEditText().getText().toString().equals("Gujhandi")||
//                                    source.getEditText().getText().toString().equals("Gulabhganj")||
//                                    source.getEditText().getText().toString().equals("Gulabpura")||
//                                    source.getEditText().getText().toString().equals("Gulaothi")||
//                                    source.getEditText().getText().toString().equals("Gularbhoj")||
//                                    source.getEditText().getText().toString().equals("Gulbarga")||
//                                    source.getEditText().getText().toString().equals("Guldhar")||
//                                    source.getEditText().getText().toString().equals("Guledagudda Road")||
//                                    source.getEditText().getText().toString().equals("Guler")||
//                                    source.getEditText().getText().toString().equals("Gulzarbagh")||
//                                    source.getEditText().getText().toString().equals("Guma")||
//                                    source.getEditText().getText().toString().equals("Gumia")||
//                                    source.getEditText().getText().toString().equals("Gumman")||
//                                    source.getEditText().getText().toString().equals("Gummidipundi")||
//                                    source.getEditText().getText().toString().equals("Gumthal")||
//                                    source.getEditText().getText().toString().equals("Guna Junction")||
//                                    source.getEditText().getText().toString().equals("Gundardehi")||
//                                    source.getEditText().getText().toString().equals("Guneru Bamori")||
//                                    source.getEditText().getText().toString().equals("Guntakal Junction")||
//                                    source.getEditText().getText().toString().equals("Guntur Junction")||
//                                    source.getEditText().getText().toString().equals("Guptipara")||
//                                    source.getEditText().getText().toString().equals("Guraru")||
//                                    source.getEditText().getText().toString().equals("Gurap")||
//                                    source.getEditText().getText().toString().equals("Gurdaspur")||
//                                    source.getEditText().getText().toString().equals("Gurgaon")||
//                                    source.getEditText().getText().toString().equals("Gurhi")||
//                                    source.getEditText().getText().toString().equals("Guriya")||
//                                    source.getEditText().getText().toString().equals("Gurla")||
//                                    source.getEditText().getText().toString().equals("Gurmura")||
//                                    source.getEditText().getText().toString().equals("Gurpa")||
//                                    source.getEditText().getText().toString().equals("Gursahaiganj")||
//                                    source.getEditText().getText().toString().equals("Gursar Shnewala")||
//                                    source.getEditText().getText().toString().equals("Gauravpur")||
//                                    source.getEditText().getText().toString().equals("Guru Tegh Bahadur Nagar")||
//                                    source.getEditText().getText().toString().equals("Guwahati")||
//                                    source.getEditText().getText().toString().equals("Gwalior Junction")||
//                                    source.getEditText().getText().toString().equals("Gyanpur Road")||
//                                    source.getEditText().getText().toString().equals("Habaipur")||
//                                    source.getEditText().getText().toString().equals("Habibganj")||
//                                    source.getEditText().getText().toString().equals("Habibwala")||
//                                    source.getEditText().getText().toString().equals("Habra")||
//                                    source.getEditText().getText().toString().equals("Hadapsar")||
//                                    source.getEditText().getText().toString().equals("Hadmadiya")||
//                                    source.getEditText().getText().toString().equals("Hadmatiya Junction")||
//                                    source.getEditText().getText().toString().equals("Hafizpur")||
//                                    source.getEditText().getText().toString().equals("Haflong Hill")||
//                                    source.getEditText().getText().toString().equals("Haiaghat")||
//                                    source.getEditText().getText().toString().equals("Haibargaon")||
//                                    source.getEditText().getText().toString().equals("Haidergarh")||
//                                    source.getEditText().getText().toString().equals("Hailakandi")||
//                                    source.getEditText().getText().toString().equals("Hajipur Junction")||
//                                    source.getEditText().getText().toString().equals("Hakimpur")||
//                                    source.getEditText().getText().toString().equals("Haldaur")||
//                                    source.getEditText().getText().toString().equals("Haldi Road")||
//                                    source.getEditText().getText().toString().equals("Haldia")||
//                                    source.getEditText().getText().toString().equals("Haldibari")||
//                                    source.getEditText().getText().toString().equals("Haldwani")||
//                                    source.getEditText().getText().toString().equals("Halisahar")||
//                                    source.getEditText().getText().toString().equals("Halvad")||
//                                    source.getEditText().getText().toString().equals("Hamira")||
//                                    source.getEditText().getText().toString().equals("Hamirgarh")||
//                                    source.getEditText().getText().toString().equals("Hamirpur Road")||
//                                    source.getEditText().getText().toString().equals("Hamre")||
//                                    source.getEditText().getText().toString().equals("Hanakere")||
//                                    source.getEditText().getText().toString().equals("Handia Khas")||
//                                    source.getEditText().getText().toString().equals("Hansi")||
//                                    source.getEditText().getText().toString().equals("Hansiawas")||
//                                    source.getEditText().getText().toString().equals("Hanumangarh Junction")||
//                                    source.getEditText().getText().toString().equals("Hanumangarh Town")||
//                                    source.getEditText().getText().toString().equals("Hanwant")||
//                                    source.getEditText().getText().toString().equals("Hapa")||
//                                    source.getEditText().getText().toString().equals("Hapa Road")||
//                                    source.getEditText().getText().toString().equals("Hapur Junction")||
//                                    source.getEditText().getText().toString().equals("Harangajao")||
//                                    source.getEditText().getText().toString().equals("Harangul")||
//                                    source.getEditText().getText().toString().equals("Haranya Kheri")||
//                                    source.getEditText().getText().toString().equals("Harauni")||
//                                    source.getEditText().getText().toString().equals("Harwada")||
//                                    source.getEditText().getText().toString().equals("Harchandpur")||
//                                    source.getEditText().getText().toString().equals("Harda")||
//                                    source.getEditText().getText().toString().equals("Hardoi")||
//                                    source.getEditText().getText().toString().equals("Harduaganj")||
//                                    source.getEditText().getText().toString().equals("Haridwar")||
//                                    source.getEditText().getText().toString().equals("Harihar")||
//                                    source.getEditText().getText().toString().equals("Harinagar")||
//                                    source.getEditText().getText().toString().equals("Haripad")||
//                                    source.getEditText().getText().toString().equals("Haripur")||
//                                    source.getEditText().getText().toString().equals("Haripur Gram")||
//                                    source.getEditText().getText().toString().equals("Harischandrapur")||
//                                    source.getEditText().getText().toString().equals("Harishanker Road")||
//                                    source.getEditText().getText().toString().equals("Harisinga")||
//                                    source.getEditText().getText().toString().equals("Harkia Khal")||
//                                    source.getEditText().getText().toString().equals("Harmuti")||
//                                    source.getEditText().getText().toString().equals("Harnaut")||
//                                    source.getEditText().getText().toString().equals("Harpalganj")||
//                                    source.getEditText().getText().toString().equals("Harpalpur")||
//                                    source.getEditText().getText().toString().equals("Harrawala")||
//                                    source.getEditText().getText().toString().equals("Harsauli")||
//                                    source.getEditText().getText().toString().equals("Harsud")||
//                                    source.getEditText().getText().toString().equals("Harthala")||
//                                    source.getEditText().getText().toString().equals("Harwada")||
//                                    source.getEditText().getText().toString().equals("Hasimara")||
//                                    source.getEditText().getText().toString().equals("Hassan Junction")||
//                                    source.getEditText().getText().toString().equals("Hasanparthi Road")||
//                                    source.getEditText().getText().toString().equals("Hathbandh")||
//                                    source.getEditText().getText().toString().equals("Hathidah Junction")||
//                                    source.getEditText().getText().toString().equals("Hathigadh")||
//                                    source.getEditText().getText().toString().equals("Hathras City")||
//                                    source.getEditText().getText().toString().equals("Hathras Junction")||
//                                    source.getEditText().getText().toString().equals("Hathras Road")||
//                                    source.getEditText().getText().toString().equals("Hathras Qilla")||
//                                    source.getEditText().getText().toString().equals("Hatia")||
//                                    source.getEditText().getText().toString().equals("Hatikhali")||
//                                    source.getEditText().getText().toString().equals("Hatkanagale")||
//                                    source.getEditText().getText().toString().equals("Hatundi")||
//                                    source.getEditText().getText().toString().equals("Haveri")||
//                                    source.getEditText().getText().toString().equals("Hazaribagh Road")||
//                                    source.getEditText().getText().toString().equals("Hazrat Nizamuddin")||
//                                    source.getEditText().getText().toString().equals("Hejjala")||
//                                    source.getEditText().getText().toString().equals("Helak")||
//                                    source.getEditText().getText().toString().equals("Helem")||
//                                    source.getEditText().getText().toString().equals("Hempur")||
//                                    source.getEditText().getText().toString().equals("Hendegir")||
//                                    source.getEditText().getText().toString().equals("Hilara")||
//                                    source.getEditText().getText().toString().equals("Hiller Shahabad")||
//                                    source.getEditText().getText().toString().equals("Hilsa")||
//                                    source.getEditText().getText().toString().equals("Himayatnagar")||
//                                    source.getEditText().getText().toString().equals("Himmatnagar Junction")||
//                                    source.getEditText().getText().toString().equals("Hindaun City")||
//                                    source.getEditText().getText().toString().equals("Hind Motor")||
//                                    source.getEditText().getText().toString().equals("Hindu College")||
//                                    source.getEditText().getText().toString().equals("Hindumalkote")||
//                                    source.getEditText().getText().toString().equals("Hindupur")||
//                                    source.getEditText().getText().toString().equals("Hinganghat")||
//                                    source.getEditText().getText().toString().equals("Hingoli Deccan")||
//                                    source.getEditText().getText().toString().equals("Hira Nagar")||
//                                    source.getEditText().getText().toString().equals("Hirakud")||
//                                    source.getEditText().getText().toString().equals("Hirapur")||
//                                    source.getEditText().getText().toString().equals("Hirdagarh")||
//                                    source.getEditText().getText().toString().equals("Hirnoda")||
//                                    source.getEditText().getText().toString().equals("Hisar")||
//                                    source.getEditText().getText().toString().equals("Hisvahal")||
//                                    source.getEditText().getText().toString().equals("Hodal")||
//                                    source.getEditText().getText().toString().equals("Hojai")||
//                                    source.getEditText().getText().toString().equals("Hol")||
//                                    source.getEditText().getText().toString().equals("Holambi Kalan")||
//                                    source.getEditText().getText().toString().equals("Hole Alur")||
//                                    source.getEditText().getText().toString().equals("Honnavar")||
//                                    source.getEditText().getText().toString().equals("Hooghly")||
//                                    source.getEditText().getText().toString().equals("Hooghly Ghat")||
//                                    source.getEditText().getText().toString().equals("Homnabad")||
//                                    source.getEditText().getText().toString().equals("Hosdurga Road")||
//                                    source.getEditText().getText().toString().equals("Hoshangabad")||
//                                    source.getEditText().getText().toString().equals("Hoshiarpur")||
//                                    source.getEditText().getText().toString().equals("Hosapete Junction")||
//                                    source.getEditText().getText().toString().equals("Hosur")||
//                                    source.getEditText().getText().toString().equals("Hotgi Junction")||
//                                    source.getEditText().getText().toString().equals("Howbagh Jabalpur")||
//                                    source.getEditText().getText().toString().equals("Howrah Junction")||
//                                    source.getEditText().getText().toString().equals("Hubli Junction")||
//                                    source.getEditText().getText().toString().equals("Hugrajuli")||
//                                    source.getEditText().getText().toString().equals("Husainpur")||
//                                    source.getEditText().getText().toString().equals("Hyderabad Deccan")||
//                                    source.getEditText().getText().toString().equals("Ib")||
//                                    source.getEditText().getText().toString().equals("Ichhapur")||
//                                    source.getEditText().getText().toString().equals("Ichapuram")||
//                                    source.getEditText().getText().toString().equals("Ichauli")||
//                                    source.getEditText().getText().toString().equals("Idar")||
//                                    source.getEditText().getText().toString().equals("Idgah Agra Junction")||
//                                    source.getEditText().getText().toString().equals("Igatpuri")||
//                                    source.getEditText().getText().toString().equals("Ikkar")||
//                                    source.getEditText().getText().toString().equals("Iklehra")||
//                                    source.getEditText().getText().toString().equals("Inchhapuri")||
//                                    source.getEditText().getText().toString().equals("Indalvai")||
//                                    source.getEditText().getText().toString().equals("Indapur")||
//                                    source.getEditText().getText().toString().equals("Indara Junction")||
//                                    source.getEditText().getText().toString().equals("Indargarh")||
//                                    source.getEditText().getText().toString().equals("Indi Road")||
//                                    source.getEditText().getText().toString().equals("Indore Junction (BG)")||
//                                    source.getEditText().getText().toString().equals("Indore Junction (MG)")||
//                                    source.getEditText().getText().toString().equals("Innanje")||
//                                    source.getEditText().getText().toString().equals("Intikanne")||
//                                    source.getEditText().getText().toString().equals("Intiyathok")||
//                                    source.getEditText().getText().toString().equals("Itehar")||
//                                    source.getEditText().getText().toString().equals("Iqbal Gadh")||
//                                    source.getEditText().getText().toString().equals("Iqbalpur")||
//                                    source.getEditText().getText().toString().equals("Irinjalakuda")||
//                                    source.getEditText().getText().toString().equals("Irugur")||
//                                    source.getEditText().getText().toString().equals("Isarda")||
//                                    source.getEditText().getText().toString().equals("Islampur")||
//                                    source.getEditText().getText().toString().equals("Ismaila Haryana")||
//                                    source.getEditText().getText().toString().equals("Itarsi Junction")||
//                                    source.getEditText().getText().toString().equals("Itola")||
//                                    source.getEditText().getText().toString().equals("Itwari")||
//                                    source.getEditText().getText().toString().equals("Izzatnagar")||
//                                    source.getEditText().getText().toString().equals("Jabalpur")||
//                                    source.getEditText().getText().toString().equals("Jabli")||
//                                    source.getEditText().getText().toString().equals("Jabri")||
//                                    source.getEditText().getText().toString().equals("Jadar")||
//                                    source.getEditText().getText().toString().equals("Jadavpur")||
//                                    source.getEditText().getText().toString().equals("Jadcherla")||
//                                    source.getEditText().getText().toString().equals("Jagadhri")||
//                                    source.getEditText().getText().toString().equals("Jagadhri Workshop")||
//                                    source.getEditText().getText().toString().equals("Jagadishpur")||
//                                    source.getEditText().getText().toString().equals("Jagaddal")||
//                                    source.getEditText().getText().toString().equals("Jessore Road")||
//                                    source.getEditText().getText().toString().equals("Jagatbela")||
//                                    source.getEditText().getText().toString().equals("Jagdalpur")||
//                                    source.getEditText().getText().toString().equals("Jagdevwala")||
//                                    source.getEditText().getText().toString().equals("Jagesharganj")||
//                                    source.getEditText().getText().toString().equals("Jagi road")||
//                                    source.getEditText().getText().toString().equals("Jagnath Road Halt")||
//                                    source.getEditText().getText().toString().equals("Jagraon")||
//                                    source.getEditText().getText().toString().equals("Jahanikhera")||
//                                    source.getEditText().getText().toString().equals("Jaipur")||
//                                    source.getEditText().getText().toString().equals("Jais")||
//                                    source.getEditText().getText().toString().equals("Jaisalmer")||
//                                    source.getEditText().getText().toString().equals("Jaithari")||
//                                    source.getEditText().getText().toString().equals("Jaitipur")||
//                                    source.getEditText().getText().toString().equals("Jaitwar")||
//                                    source.getEditText().getText().toString().equals("Jajiwal")||
//                                    source.getEditText().getText().toString().equals("Jajpur Kheonjhar Road")||
//                                    source.getEditText().getText().toString().equals("Jakhal Junction")||
//                                    source.getEditText().getText().toString().equals("Jakhalabandha")||
//                                    source.getEditText().getText().toString().equals("Jakhalaun")||
//                                    source.getEditText().getText().toString().equals("Jakhania")||
//                                    source.getEditText().getText().toString().equals("Jakhaura")||
//                                    source.getEditText().getText().toString().equals("Jakhim")||
//                                    source.getEditText().getText().toString().equals("Jakhvada")||
//                                    source.getEditText().getText().toString().equals("Jaksi")||
//                                    source.getEditText().getText().toString().equals("Jalalganj")||
//                                    source.getEditText().getText().toString().equals("Jalalpur Dhai")||
//                                    source.getEditText().getText().toString().equals("Jalamb Junction")||
//                                    source.getEditText().getText().toString().equals("Jalandhar Cantonment")||
//                                    source.getEditText().getText().toString().equals("Jalandhar City")||
//                                    source.getEditText().getText().toString().equals("Jalesar Road")||
//                                    source.getEditText().getText().toString().equals("Jaleswar")||
//                                    source.getEditText().getText().toString().equals("Jalgaon Junction")||
//                                    source.getEditText().getText().toString().equals("Jalila Road")||
//                                    source.getEditText().getText().toString().equals("Jaliya Devani")||
//                                    source.getEditText().getText().toString().equals("Jalna")||
//                                    source.getEditText().getText().toString().equals("Jalor")||
//                                    source.getEditText().getText().toString().equals("Jalpaiguri")||
//                                    source.getEditText().getText().toString().equals("Jalpaiguri Road")||
//                                    source.getEditText().getText().toString().equals("Jalsu")||
//                                    source.getEditText().getText().toString().equals("Jalsu Nanak")||
//                                    source.getEditText().getText().toString().equals("Jam Jodhpur Junction")||
//                                    source.getEditText().getText().toString().equals("Jam Wanthali")||
//                                    source.getEditText().getText().toString().equals("Jamalpur Junction")||
//                                    source.getEditText().getText().toString().equals("Jambara")||
//                                    source.getEditText().getText().toString().equals("Jambur")||
//                                    source.getEditText().getText().toString().equals("Jamira")||
//                                    source.getEditText().getText().toString().equals("Jammalamadugu")||
//                                    source.getEditText().getText().toString().equals("Jammikunta")||
//                                    source.getEditText().getText().toString().equals("Jammu Tawi")||
//                                    source.getEditText().getText().toString().equals("Jamnagar")||
//                                    source.getEditText().getText().toString().equals("Jamsar")||
//                                    source.getEditText().getText().toString().equals("Jamtara")||
//                                    source.getEditText().getText().toString().equals("Jamui")||
//                                    source.getEditText().getText().toString().equals("Jamunamukh")||
//                                    source.getEditText().getText().toString().equals("Jamwala")||
//                                    source.getEditText().getText().toString().equals("Janakpur Road")||
//                                    source.getEditText().getText().toString().equals("Jandiala")||
//                                    source.getEditText().getText().toString().equals("Jangaon")||
//                                    source.getEditText().getText().toString().equals("Janghai Junction")||
//                                    source.getEditText().getText().toString().equals("Jangipur Road")||
//                                    source.getEditText().getText().toString().equals("Janiyana")||
//                                    source.getEditText().getText().toString().equals("Jankampet Junction")||
//                                    source.getEditText().getText().toString().equals("Jaora")||
//                                    source.getEditText().getText().toString().equals("Japla")||
//                                    source.getEditText().getText().toString().equals("Jarandeshwar")||
//                                    source.getEditText().getText().toString().equals("Jargaon")||
//                                    source.getEditText().getText().toString().equals("Jari")||
//                                    source.getEditText().getText().toString().equals("Jaruda Naraa")||
//                                    source.getEditText().getText().toString().equals("Jarwal Road")||
//                                    source.getEditText().getText().toString().equals("Jasia")||
//                                    source.getEditText().getText().toString().equals("Jasali")||
//                                    source.getEditText().getText().toString().equals("Jasidih Junction")||
//                                    source.getEditText().getText().toString().equals("Jasra")||
//                                    source.getEditText().getText().toString().equals("Jaswantgarh")||
//                                    source.getEditText().getText().toString().equals("Jaswantnagar railway station")||
//                                    source.getEditText().getText().toString().equals("Jataula Samphka")||
//                                    source.getEditText().getText().toString().equals("Jath Road")||
//                                    source.getEditText().getText().toString().equals("Jatinga")||
//                                    source.getEditText().getText().toString().equals("Jatusana")||
//                                    source.getEditText().getText().toString().equals("Jaulka")||
//                                    source.getEditText().getText().toString().equals("Jaunpur City railway station")||
//                                    source.getEditText().getText().toString().equals("Jaunpur Junction")||
//                                    source.getEditText().getText().toString().equals("Javale")||
//                                    source.getEditText().getText().toString().equals("Jawad Road")||
//                                    source.getEditText().getText().toString().equals("Jawai Bandh")||
//                                    source.getEditText().getText().toString().equals("Jawali")||
//                                    source.getEditText().getText().toString().equals("Jawalamukhi Road")||
//                                    source.getEditText().getText().toString().equals("Jayasingpur")||
//                                    source.getEditText().getText().toString().equals("Jaynagar")||
//                                    source.getEditText().getText().toString().equals("Jaynagar Majilpur")||
//                                    source.getEditText().getText().toString().equals("Jehanabad")||
//                                    source.getEditText().getText().toString().equals("Jejuri")||
//                                    source.getEditText().getText().toString().equals("Jenal")||
//                                    source.getEditText().getText().toString().equals("Jeonathpur")||
//                                    source.getEditText().getText().toString().equals("Jetalsar Junction")||
//                                    source.getEditText().getText().toString().equals("Jetalvad")||
//                                    source.getEditText().getText().toString().equals("Jetpur")||
//                                    source.getEditText().getText().toString().equals("Jeur")||
//                                    source.getEditText().getText().toString().equals("Jagannath Temple Gate")||
//                                    source.getEditText().getText().toString().equals("Jhadupudi")||
//                                    source.getEditText().getText().toString().equals("Jhagadiya Junction")||
//                                    source.getEditText().getText().toString().equals("Jhajha")||
//                                    source.getEditText().getText().toString().equals("Jhalawar Road")||
//                                    source.getEditText().getText().toString().equals("Jhalida")||
//                                    source.getEditText().getText().toString().equals("Jhanjharpur")||
//                                    source.getEditText().getText().toString().equals("Jhansi Junction")||
//                                    source.getEditText().getText().toString().equals("Jhargram")||
//                                    source.getEditText().getText().toString().equals("Jharia")||
//                                    source.getEditText().getText().toString().equals("Jharokhas")||
//                                    source.getEditText().getText().toString().equals("Jharsuguda Junction")||
//                                    source.getEditText().getText().toString().equals("Jharwasaa")||
//                                    source.getEditText().getText().toString().equals("Jhingura")||
//                                    source.getEditText().getText().toString().equals("Jhinjhak")||
//                                    source.getEditText().getText().toString().equals("Jhunjhunu")||
//                                    source.getEditText().getText().toString().equals("Jhunpa")||
//                                    source.getEditText().getText().toString().equals("Jigna")||
//                                    source.getEditText().getText().toString().equals("Jind Junction")||
//                                    source.getEditText().getText().toString().equals("Jira Road")||
//                                    source.getEditText().getText().toString().equals("Jiradei")||
//                                    source.getEditText().getText().toString().equals("Jiribam")||
//                                    source.getEditText().getText().toString().equals("Jirighat")||
//                                    source.getEditText().getText().toString().equals("Jiron")||
//                                    source.getEditText().getText().toString().equals("Jiyapuram")||
//                                    source.getEditText().getText().toString().equals("Jodhpur Junction")||
//                                    source.getEditText().getText().toString().equals("Jogbani")||
//                                    source.getEditText().getText().toString().equals("Jogeshwari")||
//                                    source.getEditText().getText().toString().equals("Jogi Magra")||
//                                    source.getEditText().getText().toString().equals("Jogidih")||
//                                    source.getEditText().getText().toString().equals("Jogighopa")||
//                                    source.getEditText().getText().toString().equals("Joginder Nagar railway station")||
//                                    source.getEditText().getText().toString().equals("Jogiwala")||
//                                    source.getEditText().getText().toString().equals("Jolarpettai Junction")||
//                                    source.getEditText().getText().toString().equals("Jone Karrang")||
//                                    source.getEditText().getText().toString().equals("Joravaragar")||
//                                    source.getEditText().getText().toString().equals("Jorhat")||
//                                    source.getEditText().getText().toString().equals("Jorhat Town")||
//                                    source.getEditText().getText().toString().equals("Jotana")||
//                                    source.getEditText().getText().toString().equals("Joychandi Pahar railway station")||
//                                    source.getEditText().getText().toString().equals("Juchandra")||
//                                    source.getEditText().getText().toString().equals("Jugijan")||
//                                    source.getEditText().getText().toString().equals("Juinagar")||
//                                    source.getEditText().getText().toString().equals("Jukehi")||
//                                    source.getEditText().getText().toString().equals("Julana")||
//                                    source.getEditText().getText().toString().equals("Junagadh C B")||
//                                    source.getEditText().getText().toString().equals("Junagadh Junction")||
//                                    source.getEditText().getText().toString().equals("Jung Bahadurganj")||
//                                    source.getEditText().getText().toString().equals("Junichavand")||
//                                    source.getEditText().getText().toString().equals("Junnor Deo")||
//                                    source.getEditText().getText().toString().equals("Juriagaon")||
//                                    source.getEditText().getText().toString().equals("Jutogh")||
//                                    source.getEditText().getText().toString().equals("Jwalapur")||
//                                    source.getEditText().getText().toString().equals("Kacheguda")||
//                                    source.getEditText().getText().toString().equals("Kachhwa Road")||
//                                    source.getEditText().getText().toString().equals("Kondapalli")||
//                                    source.getEditText().getText().toString().equals("Kadalundi")||
//                                    source.getEditText().getText().toString().equals("Kadambur")||
//                                    source.getEditText().getText().toString().equals("Kadaynallur")||
//                                    source.getEditText().getText().toString().equals("Kadiri")||
//                                    source.getEditText().getText().toString().equals("Kadur Junction")||
//                                    source.getEditText().getText().toString().equals("Kaithal")||
//                                    source.getEditText().getText().toString().equals("Kaithalkuchi")||
//                                    source.getEditText().getText().toString().equals("Kakapor")||
//                                    source.getEditText().getText().toString().equals("Kakinada Port")||
//                                    source.getEditText().getText().toString().equals("Kakinada Town")||
//                                    source.getEditText().getText().toString().equals("Kankinara")||
//                                    source.getEditText().getText().toString().equals("Kalachand")||
//                                    source.getEditText().getText().toString().equals("Kalamboli")||
//                                    source.getEditText().getText().toString().equals("Kalanaur kalan")||
//                                    source.getEditText().getText().toString().equals("Kalem railway station")||
//                                    source.getEditText().getText().toString().equals("Kalianpur")||
//                                    source.getEditText().getText().toString().equals("Kalka")||
//                                    source.getEditText().getText().toString().equals("Kalkalighat")||
//                                    source.getEditText().getText().toString().equals("Kalwa")||
//                                    source.getEditText().getText().toString().equals("Kalwan")||
//                                    source.getEditText().getText().toString().equals("Kalyan")||
//                                    source.getEditText().getText().toString().equals("Kondapalli railway station")||
//                                    source.getEditText().getText().toString().equals("Kanchrapara")||
//                                    source.getEditText().getText().toString().equals("Kalyani")||
//                                    source.getEditText().getText().toString().equals("Kalyanadurg")||
//                                    source.getEditText().getText().toString().equals("Kalinarayanpur Junction")||
//                                    source.getEditText().getText().toString().equals("Kalol Junction")||
//                                    source.getEditText().getText().toString().equals("Kamakhya Junction")||
//                                    source.getEditText().getText().toString().equals("Kaman Road")||
//                                    source.getEditText().getText().toString().equals("Kamareddi")||
//                                    source.getEditText().getText().toString().equals("Kampil Road")||
//                                    source.getEditText().getText().toString().equals("Kamshet")||
//                                    source.getEditText().getText().toString().equals("Kamakhya Junction")||
//                                    source.getEditText().getText().toString().equals("Kampur")||
//                                    source.getEditText().getText().toString().equals("Kamrup Khetri")||
//                                    source.getEditText().getText().toString().equals("Kanaibazar")||
//                                    source.getEditText().getText().toString().equals("Kanakpura")||
//                                    source.getEditText().getText().toString().equals("Kanchausi")||
//                                    source.getEditText().getText().toString().equals("Kanchipuram")||
//                                    source.getEditText().getText().toString().equals("Kandivali")||
//                                    source.getEditText().getText().toString().equals("Kangra")||
//                                    source.getEditText().getText().toString().equals("Kanhangad")||
//                                    source.getEditText().getText().toString().equals("Kanina Khas")||
//                                    source.getEditText().getText().toString().equals("Kaniyapuram")||
//                                    source.getEditText().getText().toString().equals("Kanjiramittam")||
//                                    source.getEditText().getText().toString().equals("Kanjurmarg")||
//                                    source.getEditText().getText().toString().equals("Kankanadi")||
//                                    source.getEditText().getText().toString().equals("Kannauj")||
//                                    source.getEditText().getText().toString().equals("Kanpur Anwarganj")||
//                                    source.getEditText().getText().toString().equals("Kanpur Central")||
//                                    source.getEditText().getText().toString().equals("Kanpur Rooma")||
//                                    source.getEditText().getText().toString().equals("Kanpur SMU CBSA CPSM")||
//                                    source.getEditText().getText().toString().equals("Kanpur Govindpuri railway station")||
//                                    source.getEditText().getText().toString().equals("Kanpur Panki")||
//                                    source.getEditText().getText().toString().equals("Kanpur Bridge Left Bank")||
//                                    source.getEditText().getText().toString().equals("Kanyakumari")||
//                                    source.getEditText().getText().toString().equals("Kapurthala")||
//                                    source.getEditText().getText().toString().equals("Karad")||
//                                    source.getEditText().getText().toString().equals("Karaikal")||
//                                    source.getEditText().getText().toString().equals("Karaikkudi Junction")||
//                                    source.getEditText().getText().toString().equals("Karanja")||
//                                    source.getEditText().getText().toString().equals("Karchha")||
//                                    source.getEditText().getText().toString().equals("Karimganj Junction")||
//                                    source.getEditText().getText().toString().equals("Karimnagar")||
//                                    source.getEditText().getText().toString().equals("Karjat")||
//                                    source.getEditText().getText().toString().equals("Karmali")||
//                                    source.getEditText().getText().toString().equals("Karnal")||
//                                    source.getEditText().getText().toString().equals("Karur Junction")||
//                                    source.getEditText().getText().toString().equals("Karunagappalli")||
//                                    source.getEditText().getText().toString().equals("Karwar")||
//                                    source.getEditText().getText().toString().equals("Kasara")||
//                                    source.getEditText().getText().toString().equals("Kasaragod")||
//                                    source.getEditText().getText().toString().equals("Kashi")||
//                                    source.getEditText().getText().toString().equals("Kashipur Junction")||
//                                    source.getEditText().getText().toString().equals("Katakhal Junction")||
//                                    source.getEditText().getText().toString().equals("Kathgodam")||
//                                    source.getEditText().getText().toString().equals("Kathivakkam")||
//                                    source.getEditText().getText().toString().equals("Kathua")||
//                                    source.getEditText().getText().toString().equals("Katihar")||
//                                    source.getEditText().getText().toString().equals("Katlicherra")||
//                                    source.getEditText().getText().toString().equals("Katni")||
//                                    source.getEditText().getText().toString().equals("Katol")||
//                                    source.getEditText().getText().toString().equals("Katpadi Junction, Vellore")||
//                                    source.getEditText().getText().toString().equals("Katra")||
//                                    source.getEditText().getText().toString().equals("Kavali")||
//                                    source.getEditText().getText().toString().equals("Kayamkulam")||
//                                    source.getEditText().getText().toString().equals("Kayasthagram")||
//                                    source.getEditText().getText().toString().equals("Kazhakoottam TechnoPark Trivandrum")||
//                                    source.getEditText().getText().toString().equals("Kazipet Junction")||
//                                    source.getEditText().getText().toString().equals("Kelavli")||
//                                    source.getEditText().getText().toString().equals("Kelve Road")||
//                                    source.getEditText().getText().toString().equals("Kempegowda International Airport Bengaluru")||
//                                    source.getEditText().getText().toString().equals("Kendukana")||
//                                    source.getEditText().getText().toString().equals("Kengeri")||
//                                    source.getEditText().getText().toString().equals("Kerakat railway station")||
//                                    source.getEditText().getText().toString().equals("Kesinga")||
//                                    source.getEditText().getText().toString().equals("Kesamudram")||
//                                    source.getEditText().getText().toString().equals("Kevadia")||
//                                    source.getEditText().getText().toString().equals("Khadavli")||
//                                    source.getEditText().getText().toString().equals("Khadki")||
//                                    source.getEditText().getText().toString().equals("Khairthal")||
//                                    source.getEditText().getText().toString().equals("Khajuraho")||
//                                    source.getEditText().getText().toString().equals("Khalilpur")||
//                                    source.getEditText().getText().toString().equals("Khambhaliya")||
//                                    source.getEditText().getText().toString().equals("Khamgaon")||
//                                    source.getEditText().getText().toString().equals("Khamkhed")||
//                                    source.getEditText().getText().toString().equals("Khammam")||
//                                    source.getEditText().getText().toString().equals("Khana Junction")||
//                                    source.getEditText().getText().toString().equals("Khandala")||
//                                    source.getEditText().getText().toString().equals("Khandeshwar")||
//                                    source.getEditText().getText().toString().equals("Khandwa")||
//                                    source.getEditText().getText().toString().equals("Khanna")||
//                                    source.getEditText().getText().toString().equals("Kharagpur Junction")||
//                                    source.getEditText().getText().toString().equals("Kharbao")||
//                                    source.getEditText().getText().toString().equals("Khardi")||
//                                    source.getEditText().getText().toString().equals("Kharghar")||
//                                    source.getEditText().getText().toString().equals("Khar Road")||
//                                    source.getEditText().getText().toString().equals("Khatauli")||
//                                    source.getEditText().getText().toString().equals("Khatu")||
//                                    source.getEditText().getText().toString().equals("Khed")||
//                                    source.getEditText().getText().toString().equals("Khera Kalan")||
//                                    source.getEditText().getText().toString().equals("Khopoli")||
//                                    source.getEditText().getText().toString().equals("Khurai")||
//                                    source.getEditText().getText().toString().equals("Kinwat")||
//                                    source.getEditText().getText().toString().equals("Kirakat railway station")||
//                                    source.getEditText().getText().toString().equals("Kirloskarvadi")||
//                                    source.getEditText().getText().toString().equals("Kirnahar")||
//                                    source.getEditText().getText().toString().equals("Kilikolloor")||
//                                    source.getEditText().getText().toString().equals("King's Circle")||
//                                    source.getEditText().getText().toString().equals("Kishanganj")||
//                                    source.getEditText().getText().toString().equals("Kiul Junction")||
//                                    source.getEditText().getText().toString().equals("Kochuveli (Trivandrum /Thiruvananthapuram)")||
//                                    source.getEditText().getText().toString().equals("Kodaikanal road")||
//                                    source.getEditText().getText().toString().equals("Koderma")||
//                                    source.getEditText().getText().toString().equals("Kodinar")||
//                                    source.getEditText().getText().toString().equals("Kodumudi")||
//                                    source.getEditText().getText().toString().equals("Koduru")||
//                                    source.getEditText().getText().toString().equals("Kokrajhar")||
//                                    source.getEditText().getText().toString().equals("Kolar")||
//                                    source.getEditText().getText().toString().equals("Kollidam")||
//                                    source.getEditText().getText().toString().equals("Kolhapur")||
//                                    source.getEditText().getText().toString().equals("Kolad")||
//                                    source.getEditText().getText().toString().equals("Kolkata railway station")||
//                                    source.getEditText().getText().toString().equals("Kollam Junction")||
//                                    source.getEditText().getText().toString().equals("Konnagar")||
//                                    source.getEditText().getText().toString().equals("Kopar")||
//                                    source.getEditText().getText().toString().equals("Kopargaon")||
//                                    source.getEditText().getText().toString().equals("Kopar Khairane")||
//                                    source.getEditText().getText().toString().equals("Koraput Junction")||
//                                    source.getEditText().getText().toString().equals("Koratla railway station")||
//                                    source.getEditText().getText().toString().equals("Korattiangadi")||
//                                    source.getEditText().getText().toString().equals("Korattur")||
//                                    source.getEditText().getText().toString().equals("Korba")||
//                                    source.getEditText().getText().toString().equals("Koregaon")||
//                                    source.getEditText().getText().toString().equals("Korukkupet")||
//                                    source.getEditText().getText().toString().equals("Kosamba")||
//                                    source.getEditText().getText().toString().equals("Kosi Kalan")||
//                                    source.getEditText().getText().toString().equals("Kosli")||
//                                    source.getEditText().getText().toString().equals("Kotdwar")||
//                                    source.getEditText().getText().toString().equals("Kotkapura Junction")||
//                                    source.getEditText().getText().toString().equals("Kota Junction")||
//                                    source.getEditText().getText().toString().equals("Kotli Kalan")||
//                                    source.getEditText().getText().toString().equals("Kotma")||
//                                    source.getEditText().getText().toString().equals("Kotshila Junction")||
//                                    source.getEditText().getText().toString().equals("Kottapalli")||
//                                    source.getEditText().getText().toString().equals("Kottavalasa")||
//                                    source.getEditText().getText().toString().equals("Kottayam")||
//                                    source.getEditText().getText().toString().equals("Kottarakkara")||
//                                    source.getEditText().getText().toString().equals("Kotikulam")||
//                                    source.getEditText().getText().toString().equals("Kotturu")||
//                                    source.getEditText().getText().toString().equals("Kovilpatti")||
//                                    source.getEditText().getText().toString().equals("Koyilandy")||
//                                    source.getEditText().getText().toString().equals("Kozhikode")||
//                                    source.getEditText().getText().toString().equals("Krishna")||
//                                    source.getEditText().getText().toString().equals("Krishna Canal")||
//                                    source.getEditText().getText().toString().equals("Krishnai")||
//                                    source.getEditText().getText().toString().equals("Krishnarajapuram")||
//                                    source.getEditText().getText().toString().equals("Kuchaman City")||
//                                    source.getEditText().getText().toString().equals("Kudal")||
//                                    source.getEditText().getText().toString().equals("Kudchade railway station")||
//                                    source.getEditText().getText().toString().equals("Kulem railway station")||
//                                    source.getEditText().getText().toString().equals("Kulitalai")||
//                                    source.getEditText().getText().toString().equals("Kulpahar")||
//                                    source.getEditText().getText().toString().equals("Kulti")||
//                                    source.getEditText().getText().toString().equals("Kulukkallur")||
//                                    source.getEditText().getText().toString().equals("Kumgaon Burti")||
//                                    source.getEditText().getText().toString().equals("Kumbakonam")||
//                                    source.getEditText().getText().toString().equals("Kumta")||
//                                    source.getEditText().getText().toString().equals("Kundapura")||
//                                    source.getEditText().getText().toString().equals("Kuppam")||
//                                    source.getEditText().getText().toString().equals("Kuram")||
//                                    source.getEditText().getText().toString().equals("Kuri")||
//                                    source.getEditText().getText().toString().equals("Kurichedu")||
//                                    source.getEditText().getText().toString().equals("Kurduvadi")||
//                                    source.getEditText().getText().toString().equals("Kurla")||
//                                    source.getEditText().getText().toString().equals("Kurnool Town")||
//                                    source.getEditText().getText().toString().equals("Kurukshetra Junction")||
//                                    source.getEditText().getText().toString().equals("Kuttippuram")||
//                                    source.getEditText().getText().toString().equals("Khurda Road")||
//                                    source.getEditText().getText().toString().equals("kursela")||
//                                    source.getEditText().getText().toString().equals("Laban")||
//                                    source.getEditText().getText().toString().equals("Labha")||
//                                    source.getEditText().getText().toString().equals("Labhpur")||
//                                    source.getEditText().getText().toString().equals("Lachhipura")||
//                                    source.getEditText().getText().toString().equals("Lachhmangarh SK")||
//                                    source.getEditText().getText().toString().equals("Lachhmanpur")||
//                                    source.getEditText().getText().toString().equals("Lachyan")||
//                                    source.getEditText().getText().toString().equals("Ladhowal")||
//                                    source.getEditText().getText().toString().equals("Ladnun")||
//                                    source.getEditText().getText().toString().equals("Laheria Sarai")||
//                                    source.getEditText().getText().toString().equals("Lahli")||
//                                    source.getEditText().getText().toString().equals("Laimekuri")||
//                                    source.getEditText().getText().toString().equals("Lakadiya")||
//                                    source.getEditText().getText().toString().equals("Lakheri")||
//                                    source.getEditText().getText().toString().equals("Lakhimpur")||
//                                    source.getEditText().getText().toString().equals("Lakhminia")||
//                                    source.getEditText().getText().toString().equals("Lakhnauria")||
//                                    source.getEditText().getText().toString().equals("Lakhtar")||
//                                    source.getEditText().getText().toString().equals("Lakkidi")||
//                                    source.getEditText().getText().toString().equals("Laksar Junction")||
//                                    source.getEditText().getText().toString().equals("Lakshmibai Nagar")||
//                                    source.getEditText().getText().toString().equals("Lal Kuan")||
//                                    source.getEditText().getText().toString().equals("Lalabazar")||
//                                    source.getEditText().getText().toString().equals("Lalapet")||
//                                    source.getEditText().getText().toString().equals("Lalganj")||
//                                    source.getEditText().getText().toString().equals("Lalgarh Junction")||
//                                    source.getEditText().getText().toString().equals("Lalgopalganj")||
//                                    source.getEditText().getText().toString().equals("Lalgudi")||
//                                    source.getEditText().getText().toString().equals("Lalitpur")||
//                                    source.getEditText().getText().toString().equals("Lalkuan Junction")||
//                                    source.getEditText().getText().toString().equals("Lalpur")||
//                                    source.getEditText().getText().toString().equals("Lalpur Chandra")||
//                                    source.getEditText().getText().toString().equals("Lalpur Jam")||
//                                    source.getEditText().getText().toString().equals("Lalpur Umri")||
//                                    source.getEditText().getText().toString().equals("Lalru")||
//                                    source.getEditText().getText().toString().equals("Lamana")||
//                                    source.getEditText().getText().toString().equals("Lambhua")||
//                                    source.getEditText().getText().toString().equals("Lambiya")||
//                                    source.getEditText().getText().toString().equals("Lamsakhang")||
//                                    source.getEditText().getText().toString().equals("Landaura")||
//                                    source.getEditText().getText().toString().equals("Langting")||
//                                    source.getEditText().getText().toString().equals("Lanka")||
//                                    source.getEditText().getText().toString().equals("Laopani")||
//                                    source.getEditText().getText().toString().equals("Lar Road")||
//                                    source.getEditText().getText().toString().equals("Lasalgaon")||
//                                    source.getEditText().getText().toString().equals("Lasur")||
//                                    source.getEditText().getText().toString().equals("Latehar")||
//                                    source.getEditText().getText().toString().equals("Lathi")||
//                                    source.getEditText().getText().toString().equals("Latur")||
//                                    source.getEditText().getText().toString().equals("Latur Road Junction")||
//                                    source.getEditText().getText().toString().equals("Laukaha Bazar")||
//                                    source.getEditText().getText().toString().equals("Laul")||
//                                    source.getEditText().getText().toString().equals("Lawa Sardargarh")||
//                                    source.getEditText().getText().toString().equals("Ledarmer")||
//                                    source.getEditText().getText().toString().equals("Lehra Gaga")||
//                                    source.getEditText().getText().toString().equals("Lidhora Khurd")||
//                                    source.getEditText().getText().toString().equals("Liliya Mota")||
//                                    source.getEditText().getText().toString().equals("Limbdi")||
//                                    source.getEditText().getText().toString().equals("Limkheda")||
//                                    source.getEditText().getText().toString().equals("Linch")||
//                                    source.getEditText().getText().toString().equals("Lingampalli")||
//                                    source.getEditText().getText().toString().equals("Liluah")||
//                                    source.getEditText().getText().toString().equals("Lodipur Bishnpr")||
//                                    source.getEditText().getText().toString().equals("Loha")||
//                                    source.getEditText().getText().toString().equals("Loharu")||
//                                    source.getEditText().getText().toString().equals("Loharwara")||
//                                    source.getEditText().getText().toString().equals("Lohian Khas Junction")||
//                                    source.getEditText().getText().toString().equals("Lohna Road")||
//                                    source.getEditText().getText().toString().equals("Lohogad")||
//                                    source.getEditText().getText().toString().equals("Loisingha")||
//                                    source.getEditText().getText().toString().equals("Lokmanya Tilak Terminus")||
//                                    source.getEditText().getText().toString().equals("Loliem railway station")||
//                                    source.getEditText().getText().toString().equals("Lonand")||
//                                    source.getEditText().getText().toString().equals("Lonavala")||
//                                    source.getEditText().getText().toString().equals("Londa Junction")||
//                                    source.getEditText().getText().toString().equals("Loni")||
//                                    source.getEditText().getText().toString().equals("Lorwada")||
//                                    source.getEditText().getText().toString().equals("Lower Haflong")||
//                                    source.getEditText().getText().toString().equals("Lower Parel")||
//                                    source.getEditText().getText().toString().equals("Lowjee")||
//                                    source.getEditText().getText().toString().equals("Luckeesarai Junction")||
//                                    source.getEditText().getText().toString().equals("Lucknow Junction")||
//                                    source.getEditText().getText().toString().equals("Lucknow")||
//                                    source.getEditText().getText().toString().equals("Lucknow City")||
//                                    source.getEditText().getText().toString().equals("Ludhiana Junction")||
//                                    source.getEditText().getText().toString().equals("Lumding Junction")||
//                                    source.getEditText().getText().toString().equals("Lunavada")||
//                                    source.getEditText().getText().toString().equals("Luni Junction")||
//                                    source.getEditText().getText().toString().equals("Luni Richha")||
//                                    source.getEditText().getText().toString().equals("Lunidhar")||
//                                    source.getEditText().getText().toString().equals("Lunkaransar")||
//                                    source.getEditText().getText().toString().equals("Lusa")||
//                                    source.getEditText().getText().toString().equals("Lusadiya")||
//                                    source.getEditText().getText().toString().equals("Lushala")||
//                                    source.getEditText().getText().toString().equals("Lalgola")||
//                                    source.getEditText().getText().toString().equals("Macharya")||
//                                    source.getEditText().getText().toString().equals("Machavaram")||
//                                    source.getEditText().getText().toString().equals("Machavaram")||
//                                    source.getEditText().getText().toString().equals("Machelipatnam")||
//                                    source.getEditText().getText().toString().equals("Macherla")||
//                                    source.getEditText().getText().toString().equals("Madan Mahal")||
//                                    source.getEditText().getText().toString().equals("Madanapalle Rd")||
//                                    source.getEditText().getText().toString().equals("Madanpur")||
//                                    source.getEditText().getText().toString().equals("Maddur")||
//                                    source.getEditText().getText().toString().equals("Madhavnagar")||
//                                    source.getEditText().getText().toString().equals("Madukarai(Coimbatore)")||
//                                    source.getEditText().getText().toString().equals("Madurai Junction railway station")||
//                                    source.getEditText().getText().toString().equals("Madgaon Junction railway station")||
//                                    source.getEditText().getText().toString().equals("Majorda Junction railway station")||
//                                    source.getEditText().getText().toString().equals("Marmagao railway station")||
//                                    source.getEditText().getText().toString().equals("Mithlanchal Deep")||
//                                    source.getEditText().getText().toString().equals("Madha")||
//                                    source.getEditText().getText().toString().equals("Madhabpur")||
//                                    source.getEditText().getText().toString().equals("Madhapar")||
//                                    source.getEditText().getText().toString().equals("Madhapur Road")||
//                                    source.getEditText().getText().toString().equals("Madhi")||
//                                    source.getEditText().getText().toString().equals("Madhira")||
//                                    source.getEditText().getText().toString().equals("Madhopur Punjab")||
//                                    source.getEditText().getText().toString().equals("Madhorajpur")||
//                                    source.getEditText().getText().toString().equals("Madhosingh")||
//                                    source.getEditText().getText().toString().equals("Madhubani")||
//                                    source.getEditText().getText().toString().equals("Madhupur Junction")||
//                                    source.getEditText().getText().toString().equals("Madurai Junction")||
//                                    source.getEditText().getText().toString().equals("Madurantakam")||
//                                    source.getEditText().getText().toString().equals("Madure")||
//                                    source.getEditText().getText().toString().equals("Maghar")||
//                                    source.getEditText().getText().toString().equals("Mahadanapuram")||
//                                    source.getEditText().getText().toString().equals("Mahadevpara")||
//                                    source.getEditText().getText().toString().equals("Mahajan")||
//                                    source.getEditText().getText().toString().equals("Mahalam")||
//                                    source.getEditText().getText().toString().equals("Mahalaxmi")||
//                                    source.getEditText().getText().toString().equals("Mahamandir")||
//                                    source.getEditText().getText().toString().equals("Mahansar")||
//                                    source.getEditText().getText().toString().equals("Mahasamund")||
//                                    source.getEditText().getText().toString().equals("Mahbubabad")||
//                                    source.getEditText().getText().toString().equals("Mahbubnagar")||
//                                    source.getEditText().getText().toString().equals("Mahe")||
//                                    source.getEditText().getText().toString().equals("Maheji")||
//                                    source.getEditText().getText().toString().equals("Mahendragarh")||
//                                    source.getEditText().getText().toString().equals("Mahes Khunt")||
//                                    source.getEditText().getText().toString().equals("Mahesana Junction")||
//                                    source.getEditText().getText().toString().equals("Maheshmunda")||
//                                    source.getEditText().getText().toString().equals("Mahidpur Road")||
//                                    source.getEditText().getText().toString().equals("Mahim")||
//                                    source.getEditText().getText().toString().equals("Mahisgaon")||
//                                    source.getEditText().getText().toString().equals("Mahmudabad Avdh")||
//                                    source.getEditText().getText().toString().equals("Mahmudpur SRYN")||
//                                    source.getEditText().getText().toString().equals("Mahoba")||
//                                    source.getEditText().getText().toString().equals("Maholi")||
//                                    source.getEditText().getText().toString().equals("Mahpur")||
//                                    source.getEditText().getText().toString().equals("Mahuamilan")||
//                                    source.getEditText().getText().toString().equals("Mahuariya")||
//                                    source.getEditText().getText().toString().equals("Mahuda Junction")||
//                                    source.getEditText().getText().toString().equals("Mahugarha")||
//                                    source.getEditText().getText().toString().equals("Mahur")||
//                                    source.getEditText().getText().toString().equals("Mahuva Junction")||
//                                    source.getEditText().getText().toString().equals("Maibang")||
//                                    source.getEditText().getText().toString().equals("Maihar")||
//                                    source.getEditText().getText().toString().equals("Maikalganj")||
//                                    source.getEditText().getText().toString().equals("Mailani Junction")||
//                                    source.getEditText().getText().toString().equals("Mailongdisa")||
//                                    source.getEditText().getText().toString().equals("Mainpuri")||
//                                    source.getEditText().getText().toString().equals("Mairabari")||
//                                    source.getEditText().getText().toString().equals("Mairwa")||
//                                    source.getEditText().getText().toString().equals("Majbat")||
//                                    source.getEditText().getText().toString().equals("Majgaon")||
//                                    source.getEditText().getText().toString().equals("Majhagawan")||
//                                    source.getEditText().getText().toString().equals("Majhola Pakarya")||
//                                    source.getEditText().getText().toString().equals("Makhu")||
//                                    source.getEditText().getText().toString().equals("Makrana Junction")||
//                                    source.getEditText().getText().toString().equals("Makrera")||
//                                    source.getEditText().getText().toString().equals("Makronia")||
//                                    source.getEditText().getText().toString().equals("Maksi")||
//                                    source.getEditText().getText().toString().equals("Malad")||
//                                    source.getEditText().getText().toString().equals("Malarna")||
//                                    source.getEditText().getText().toString().equals("Malavli")||
//                                    source.getEditText().getText().toString().equals("Malda Town")||
//                                    source.getEditText().getText().toString().equals("Malerkotla")||
//                                    source.getEditText().getText().toString().equals("Malethu Kanak")||
//                                    source.getEditText().getText().toString().equals("Malhargarh")||
//                                    source.getEditText().getText().toString().equals("Malhour")||
//                                    source.getEditText().getText().toString().equals("Malihabad")||
//                                    source.getEditText().getText().toString().equals("Malipur")||
//                                    source.getEditText().getText().toString().equals("Maliya Hatina")||
//                                    source.getEditText().getText().toString().equals("Maliya Miyana")||
//                                    source.getEditText().getText().toString().equals("Malkapur")||
//                                    source.getEditText().getText().toString().equals("Malkhaid Road")||
//                                    source.getEditText().getText().toString().equals("Malkisar")||
//                                    source.getEditText().getText().toString().equals("Mallanwala Khas")||
//                                    source.getEditText().getText().toString().equals("Malleswaram")||
//                                    source.getEditText().getText().toString().equals("Malliyam")||
//                                    source.getEditText().getText().toString().equals("Malout")||
//                                    source.getEditText().getText().toString().equals("Malpura")||
//                                    source.getEditText().getText().toString().equals("Malsailu")||
//                                    source.getEditText().getText().toString().equals("Malsian Shahkht")||
//                                    source.getEditText().getText().toString().equals("Malugur")||
//                                    source.getEditText().getText().toString().equals("Malur")||
//                                    source.getEditText().getText().toString().equals("Malwan")||
//                                    source.getEditText().getText().toString().equals("Malwara")||
//                                    source.getEditText().getText().toString().equals("Maman")||
//                                    source.getEditText().getText().toString().equals("Manaksar")||
//                                    source.getEditText().getText().toString().equals("Manamadurai Junction")||
//                                    source.getEditText().getText().toString().equals("Mananpur")||
//                                    source.getEditText().getText().toString().equals("Manaparai")||
//                                    source.getEditText().getText().toString().equals("Manauri railway station")||
//                                    source.getEditText().getText().toString().equals("Manavadar")||
//                                    source.getEditText().getText().toString().equals("Mancherial")||
//                                    source.getEditText().getText().toString().equals("Mancheswar")||
//                                    source.getEditText().getText().toString().equals("Manda Road")||
//                                    source.getEditText().getText().toString().equals("Mandagere")||
//                                    source.getEditText().getText().toString().equals("Mandal")||
//                                    source.getEditText().getText().toString().equals("Mandalgarh")||
//                                    source.getEditText().getText().toString().equals("Mandapam")||
//                                    source.getEditText().getText().toString().equals("Mandapam Camp")||
//                                    source.getEditText().getText().toString().equals("Mandar Hill")||
//                                    source.getEditText().getText().toString().equals("Mandasa Road")||
//                                    source.getEditText().getText().toString().equals("Mandasor")||
//                                    source.getEditText().getText().toString().equals("Manderdisa")||
//                                    source.getEditText().getText().toString().equals("Mandhana Junction, Kanpur")||
//                                    source.getEditText().getText().toString().equals("Mandi Adampur")||
//                                    source.getEditText().getText().toString().equals("Mandi Bamora")||
//                                    source.getEditText().getText().toString().equals("Mandi Dabwali")||
//                                    source.getEditText().getText().toString().equals("Mandi Dhanaura")||
//                                    source.getEditText().getText().toString().equals("Mandi Dip")||
//                                    source.getEditText().getText().toString().equals("Mandla Fort")||
//                                    source.getEditText().getText().toString().equals("Mandor")||
//                                    source.getEditText().getText().toString().equals("Mandrak")||
//                                    source.getEditText().getText().toString().equals("Manduadih")||
//                                    source.getEditText().getText().toString().equals("Mandya")||
//                                    source.getEditText().getText().toString().equals("Manendragarh")||
//                                    source.getEditText().getText().toString().equals("Mangalagiri")||
//                                    source.getEditText().getText().toString().equals("Mangaliyawas")||
//                                    source.getEditText().getText().toString().equals("Mangaluru Central")||
//                                    source.getEditText().getText().toString().equals("Mangaluru Junction")||
//                                    source.getEditText().getText().toString().equals("Mangaon")||
//                                    source.getEditText().getText().toString().equals("Mangliya Gaon")||
//                                    source.getEditText().getText().toString().equals("Mangolpuri")||
//                                    source.getEditText().getText().toString().equals("Mangra")||
//                                    source.getEditText().getText().toString().equals("Manheru")||
//                                    source.getEditText().getText().toString().equals("Manigachi")||
//                                    source.getEditText().getText().toString().equals("Manikpur Junction")||
//                                    source.getEditText().getText().toString().equals("Maninagar")||
//                                    source.getEditText().getText().toString().equals("Manipur Bagan")||
//                                    source.getEditText().getText().toString().equals("Vanchi Maniyachchi Junction")||
//                                    source.getEditText().getText().toString().equals("Manjeshwar")||
//                                    source.getEditText().getText().toString().equals("Mankapur Junction")||
//                                    source.getEditText().getText().toString().equals("Mankar")||
//                                    source.getEditText().getText().toString().equals("Mankarai")||
//                                    source.getEditText().getText().toString().equals("Mankatha")||
//                                    source.getEditText().getText().toString().equals("Mankhurd")||
//                                    source.getEditText().getText().toString().equals("Manki")||
//                                    source.getEditText().getText().toString().equals("Manmad Junction")||
//                                    source.getEditText().getText().toString().equals("Mannanur")||
//                                    source.getEditText().getText().toString().equals("Manoharganj")||
//                                    source.getEditText().getText().toString().equals("Manoharpur")||
//                                    source.getEditText().getText().toString().equals("Mansa")||
//                                    source.getEditText().getText().toString().equals("Mansarovar")||
//                                    source.getEditText().getText().toString().equals("Mansi Junction")||
//                                    source.getEditText().getText().toString().equals("Mansurpur")||
//                                    source.getEditText().getText().toString().equals("Manthralayam Road")||
//                                    source.getEditText().getText().toString().equals("Manuguru")||
//                                    source.getEditText().getText().toString().equals("Manwal")||
//                                    source.getEditText().getText().toString().equals("Manwath Road")||
//                                    source.getEditText().getText().toString().equals("Manzurgarhi")||
//                                    source.getEditText().getText().toString().equals("Marahra")||
//                                    source.getEditText().getText().toString().equals("Maramjhiri")||
//                                    source.getEditText().getText().toString().equals("Marauda")||
//                                    source.getEditText().getText().toString().equals("Mariahu")||
//                                    source.getEditText().getText().toString().equals("Mariani Junction")||
//                                    source.getEditText().getText().toString().equals("Marikuppam")||
//                                    source.getEditText().getText().toString().equals("Marine Lines")||
//                                    source.getEditText().getText().toString().equals("Maripat")||
//                                    source.getEditText().getText().toString().equals("Markapur Road")||
//                                    source.getEditText().getText().toString().equals("Markundi")||
//                                    source.getEditText().getText().toString().equals("Maroli")||
//                                    source.getEditText().getText().toString().equals("Marsul")||
//                                    source.getEditText().getText().toString().equals("Marthipalayam")||
//                                    source.getEditText().getText().toString().equals("Marwar Bagra")||
//                                    source.getEditText().getText().toString().equals("Marwar Balia")||
//                                    source.getEditText().getText().toString().equals("Marwar Bhinmal")||
//                                    source.getEditText().getText().toString().equals("Marwar Birthi")||
//                                    source.getEditText().getText().toString().equals("Marwar Chapri")||
//                                    source.getEditText().getText().toString().equals("Marwar Junction")||
//                                    source.getEditText().getText().toString().equals("Marwar Kori")||
//                                    source.getEditText().getText().toString().equals("Marwar Lohwat")||
//                                    source.getEditText().getText().toString().equals("Marwar Mathanya")||
//                                    source.getEditText().getText().toString().equals("Marwar Ratanpur")||
//                                    source.getEditText().getText().toString().equals("Masit")||
//                                    source.getEditText().getText().toString().equals("Masjid Bunder")||
//                                    source.getEditText().getText().toString().equals("Maskanwa")||
//                                    source.getEditText().getText().toString().equals("Masodha")||
//                                    source.getEditText().getText().toString().equals("Masrakh")||
//                                    source.getEditText().getText().toString().equals("Masur")||
//                                    source.getEditText().getText().toString().equals("Matana Buzurg")||
//                                    source.getEditText().getText().toString().equals("Mataundh")||
//                                    source.getEditText().getText().toString().equals("Mathura Cantonment")||
//                                    source.getEditText().getText().toString().equals("Mathura Junction")||
//                                    source.getEditText().getText().toString().equals("Matlabpur")||
//                                    source.getEditText().getText().toString().equals("Matmari")||
//                                    source.getEditText().getText().toString().equals("Mattancheri Halt")||
//                                    source.getEditText().getText().toString().equals("Matunga")||
//                                    source.getEditText().getText().toString().equals("Matunga Road")||
//                                    source.getEditText().getText().toString().equals("Mau Aimma")||
//                                    source.getEditText().getText().toString().equals("Mau Junction")||
//                                    source.getEditText().getText().toString().equals("Mau Ranipur")||
//                                    source.getEditText().getText().toString().equals("Maur")||
//                                    source.getEditText().getText().toString().equals("Maval")||
//                                    source.getEditText().getText().toString().equals("Mavelikara")||
//                                    source.getEditText().getText().toString().equals("Mavli Junction")||
//                                    source.getEditText().getText().toString().equals("Mayanoor")||
//                                    source.getEditText().getText().toString().equals("Mayiladuturai Junction")||
//                                    source.getEditText().getText().toString().equals("Mayyanad")||
//                                    source.getEditText().getText().toString().equals("Mazhama Rajwansher")||
//                                    source.getEditText().getText().toString().equals("Mazhom")||
//                                    source.getEditText().getText().toString().equals("McCluskieganj")||
//                                    source.getEditText().getText().toString().equals("Mecheda")||
//                                    source.getEditText().getText().toString().equals("Medchal")||
//                                    source.getEditText().getText().toString().equals("Meerut Cantonment")||
//                                    source.getEditText().getText().toString().equals("Meerut City")||
//                                    source.getEditText().getText().toString().equals("Meghnagar")||
//                                    source.getEditText().getText().toString().equals("Mehnar Road")||
//                                    source.getEditText().getText().toString().equals("Mehsi")||
//                                    source.getEditText().getText().toString().equals("Meja Road")||
//                                    source.getEditText().getText().toString().equals("Melmaruvattur")||
//                                    source.getEditText().getText().toString().equals("Melusar")||
//                                    source.getEditText().getText().toString().equals("Mendipathar")||
//                                    source.getEditText().getText().toString().equals("Memari")||
//                                    source.getEditText().getText().toString().equals("Meralgram")||
//                                    source.getEditText().getText().toString().equals("Merta City")||
//                                    source.getEditText().getText().toString().equals("Merta Road Junction")||
//                                    source.getEditText().getText().toString().equals("Mettur")||
//                                    source.getEditText().getText().toString().equals("Metupalaiyam")||
//                                    source.getEditText().getText().toString().equals("Mettur Dam")||
//                                    source.getEditText().getText().toString().equals("Mhasavad")||
//                                    source.getEditText().getText().toString().equals("Mahemdavad Kheda Road")||
//                                    source.getEditText().getText().toString().equals("Mhow")||
//                                    source.getEditText().getText().toString().equals("Midnapore")||
//                                    source.getEditText().getText().toString().equals("Migrendisa")||
//                                    source.getEditText().getText().toString().equals("Mihinpurwa")||
//                                    source.getEditText().getText().toString().equals("Mihrawan")||
//                                    source.getEditText().getText().toString().equals("Milak")||
//                                    source.getEditText().getText().toString().equals("Minjur")||
//                                    source.getEditText().getText().toString().equals("Miraj Junction")||
//                                    source.getEditText().getText().toString().equals("Miranpur Katra")||
//                                    source.getEditText().getText().toString().equals("Mira Road")||
//                                    source.getEditText().getText().toString().equals("Mirchadhori")||
//                                    source.getEditText().getText().toString().equals("Mirhakur")||
//                                    source.getEditText().getText().toString().equals("Mirthal")||
//                                    source.getEditText().getText().toString().equals("Mirza")||
//                                    source.getEditText().getText().toString().equals("Mirzapali")||
//                                    source.getEditText().getText().toString().equals("Miryalaguda")||
//                                    source.getEditText().getText().toString().equals("Mirzapur")||
//                                    source.getEditText().getText().toString().equals("Misamari")||
//                                    source.getEditText().getText().toString().equals("Misrauli")||
//                                    source.getEditText().getText().toString().equals("Mitha")||
//                                    source.getEditText().getText().toString().equals("Mithapur")||
//                                    source.getEditText().getText().toString().equals("Miyagam Karjan")||
//                                    source.getEditText().getText().toString().equals("Miyana")||
//                                    source.getEditText().getText().toString().equals("Miyona ka Bara")||
//                                    source.getEditText().getText().toString().equals("Modelgram")||
//                                    source.getEditText().getText().toString().equals("Modinagar")||
//                                    source.getEditText().getText().toString().equals("Modnimb")||
//                                    source.getEditText().getText().toString().equals("Modpur")||
//                                    source.getEditText().getText().toString().equals("Modran")||
//                                    source.getEditText().getText().toString().equals("Moga")||
//                                    source.getEditText().getText().toString().equals("Mohammadkhera")||
//                                    source.getEditText().getText().toString().equals("Mohanlalganj")||
//                                    source.getEditText().getText().toString().equals("Mohiuddinnagar")||
//                                    source.getEditText().getText().toString().equals("Mohiuddinpur")||
//                                    source.getEditText().getText().toString().equals("Mohol")||
//                                    source.getEditText().getText().toString().equals("Mohri")||
//                                    source.getEditText().getText().toString().equals("Mokalsar")||
//                                    source.getEditText().getText().toString().equals("Mokama Junction")||
//                                    source.getEditText().getText().toString().equals("Mokholi")||
//                                    source.getEditText().getText().toString().equals("Monabari")||
//                                    source.getEditText().getText().toString().equals("Monacherra")||
//                                    source.getEditText().getText().toString().equals("Mondh")||
//                                    source.getEditText().getText().toString().equals("Munger")||
//                                    source.getEditText().getText().toString().equals("Monglajhora")||
//                                    source.getEditText().getText().toString().equals("Moore Market Complex (Chennai Central Suburban)")||
//                                    source.getEditText().getText().toString().equals("Moradabad")||
//                                    source.getEditText().getText().toString().equals("Morak")||
//                                    source.getEditText().getText().toString().equals("Morappur")||
//                                    source.getEditText().getText().toString().equals("Morbi")||
//                                    source.getEditText().getText().toString().equals("Mordar")||
//                                    source.getEditText().getText().toString().equals("Morena")||
//                                    source.getEditText().getText().toString().equals("Mori Bera")||
//                                    source.getEditText().getText().toString().equals("Morinda")||
//                                    source.getEditText().getText().toString().equals("Morthala")||
//                                    source.getEditText().getText().toString().equals("Mota Jadra")||
//                                    source.getEditText().getText().toString().equals("Moterjhar")||
//                                    source.getEditText().getText().toString().equals("Moth")||
//                                    source.getEditText().getText().toString().equals("Mothala")||
//                                    source.getEditText().getText().toString().equals("Mothala Halt")||
//                                    source.getEditText().getText().toString().equals("Motichur")||
//                                    source.getEditText().getText().toString().equals("Bapudham Motihari")||
//                                    source.getEditText().getText().toString().equals("Motipur")||
//                                    source.getEditText().getText().toString().equals("Motipura Chauki")||
//                                    source.getEditText().getText().toString().equals("Moula-Ali")||
//                                    source.getEditText().getText().toString().equals("Muddanuru")||
//                                    source.getEditText().getText().toString().equals("Mudkhed Junction")||
//                                    source.getEditText().getText().toString().equals("Muftiganj")||
//                                    source.getEditText().getText().toString().equals("Mughal Sarai Junction")||
//                                    source.getEditText().getText().toString().equals("Muhammadabad")||
//                                    source.getEditText().getText().toString().equals("Muirpur Road")||
//                                    source.getEditText().getText().toString().equals("Mukerian")||
//                                    source.getEditText().getText().toString().equals("Mukhtiar Balwar")||
//                                    source.getEditText().getText().toString().equals("Muktsar")||
//                                    source.getEditText().getText().toString().equals("Mukundarayapuram")||
//                                    source.getEditText().getText().toString().equals("Muli Road")||
//                                    source.getEditText().getText().toString().equals("Mulki")||
//                                    source.getEditText().getText().toString().equals("Mullanpur")||
//                                    source.getEditText().getText().toString().equals("Mulanur")||
//                                    source.getEditText().getText().toString().equals("Multai")||
//                                    source.getEditText().getText().toString().equals("Mulund")||
//                                    source.getEditText().getText().toString().equals("Mumbai Central")||
//                                    source.getEditText().getText().toString().equals("Mumbra")||
//                                    source.getEditText().getText().toString().equals("Munabao")||
//                                    source.getEditText().getText().toString().equals("Mundalaram")||
//                                    source.getEditText().getText().toString().equals("Mundha Pande")||
//                                    source.getEditText().getText().toString().equals("Mundhewadi")||
//                                    source.getEditText().getText().toString().equals("Mungaoli")||
//                                    source.getEditText().getText().toString().equals("Muniguda")||
//                                    source.getEditText().getText().toString().equals("Munirabad")||
//                                    source.getEditText().getText().toString().equals("Munroturuttu")||
//                                    source.getEditText().getText().toString().equals("Mupa")||
//                                    source.getEditText().getText().toString().equals("Muradnagar")||
//                                    source.getEditText().getText().toString().equals("Murdeshwar")||
//                                    source.getEditText().getText().toString().equals("Murdeshwar")||
//                                    source.getEditText().getText().toString().equals("Muri")||
//                                    source.getEditText().getText().toString().equals("Murkeongselek")||
//                                    source.getEditText().getText().toString().equals("Murliganj")||
//                                    source.getEditText().getText().toString().equals("Murshadpur")||
//                                    source.getEditText().getText().toString().equals("Murshidabad")||
//                                    source.getEditText().getText().toString().equals("Murtizapur Junction")||
//                                    source.getEditText().getText().toString().equals("Musafir Khana")||
//                                    source.getEditText().getText().toString().equals("Mustafabad")||
//                                    source.getEditText().getText().toString().equals("Muttarasanallur")||
//                                    source.getEditText().getText().toString().equals("Mutupet")||
//                                    source.getEditText().getText().toString().equals("Muzaffarnagar")||
//                                    source.getEditText().getText().toString().equals("Muzaffarpur Junction")||
//                                    source.getEditText().getText().toString().equals("Muzzampur Narayan")||
//                                    source.getEditText().getText().toString().equals("Mysuru Junction")||
//                                    source.getEditText().getText().toString().equals("Naya Ghaziabad")||
//                                    source.getEditText().getText().toString().equals("N J Ramanal")||
//                                    source.getEditText().getText().toString().equals("Nabadwip Dham")||
//                                    source.getEditText().getText().toString().equals("Nabha")||
//                                    source.getEditText().getText().toString().equals("Nadauj")||
//                                    source.getEditText().getText().toString().equals("Nadiad Junction")||
//                                    source.getEditText().getText().toString().equals("Nandikoor")||
//                                    source.getEditText().getText().toString().equals("Nadikudi")||
//                                    source.getEditText().getText().toString().equals("Nagal")||
//                                    source.getEditText().getText().toString().equals("Naganahalli")||
//                                    source.getEditText().getText().toString().equals("Nagaon")||
//                                    source.getEditText().getText().toString().equals("Nagappattinam junction")||
//                                    source.getEditText().getText().toString().equals("Nagar")||
//                                    source.getEditText().getText().toString().equals("Nagar Untari")||
//                                    source.getEditText().getText().toString().equals("Nagercoil Junction")||
//                                    source.getEditText().getText().toString().equals("Nagardevla")||
//                                    source.getEditText().getText().toString().equals("Nagargali")||
//                                    source.getEditText().getText().toString().equals("Nagari")||
//                                    source.getEditText().getText().toString().equals("Nagaria Sadat")||
//                                    source.getEditText().getText().toString().equals("Nagarur")||
//                                    source.getEditText().getText().toString().equals("Nagaur")||
//                                    source.getEditText().getText().toString().equals("Nagbhir Junction")||
//                                    source.getEditText().getText().toString().equals("Nagda Junction")||
//                                    source.getEditText().getText().toString().equals("Nagercoil Town")||
//                                    source.getEditText().getText().toString().equals("Nagina")||
//                                    source.getEditText().getText().toString().equals("Naglatula")||
//                                    source.getEditText().getText().toString().equals("Nagore")||
//                                    source.getEditText().getText().toString().equals("Nagpur")||
//                                    source.getEditText().getText().toString().equals("Nagrota")||
//                                    source.getEditText().getText().toString().equals("Naharkatiya")||
//                                    source.getEditText().getText().toString().equals("Naharlagun")||
//                                    source.getEditText().getText().toString().equals("Nahur")||
//                                    source.getEditText().getText().toString().equals("Naigaon")||
//                                    source.getEditText().getText().toString().equals("Naihati Junction")||
//                                    source.getEditText().getText().toString().equals("Naikheri")||
//                                    source.getEditText().getText().toString().equals("Naila")||
//                                    source.getEditText().getText().toString().equals("Naini")||
//                                    source.getEditText().getText().toString().equals("Nainpur Junction")||
//                                    source.getEditText().getText().toString().equals("Najibabad Junction")||
//                                    source.getEditText().getText().toString().equals("Nakodar Junction")||
//                                    source.getEditText().getText().toString().equals("Nalanda")||
//                                    source.getEditText().getText().toString().equals("Nala Sopara")||
//                                    source.getEditText().getText().toString().equals("Nalbari")||
//                                    source.getEditText().getText().toString().equals("Nalgonda")||
//                                    source.getEditText().getText().toString().equals("Nalhati")||
//                                    source.getEditText().getText().toString().equals("Naliya")||
//                                    source.getEditText().getText().toString().equals("Naliya Cantonment")||
//                                    source.getEditText().getText().toString().equals("Nalwar")||
//                                    source.getEditText().getText().toString().equals("Namakkal")||
//                                    source.getEditText().getText().toString().equals("Namburu")||
//                                    source.getEditText().getText().toString().equals("Namkom")||
//                                    source.getEditText().getText().toString().equals("Namli")||
//                                    source.getEditText().getText().toString().equals("Namrup")||
//                                    source.getEditText().getText().toString().equals("Nana")||
//                                    source.getEditText().getText().toString().equals("Nana Bhamodra")||
//                                    source.getEditText().getText().toString().equals("Nanaksar")||
//                                    source.getEditText().getText().toString().equals("Nandalur")||
//                                    source.getEditText().getText().toString().equals("Nandapur")||
//                                    source.getEditText().getText().toString().equals("Hazur Sahib Nanded")||
//                                    source.getEditText().getText().toString().equals("Nandesari")||
//                                    source.getEditText().getText().toString().equals("Nandganj")||
//                                    source.getEditText().getText().toString().equals("Nandgaon")||
//                                    source.getEditText().getText().toString().equals("Nandgaon Road")||
//                                    source.getEditText().getText().toString().equals("Nandiambakkam")||
//                                    source.getEditText().getText().toString().equals("Nandol Dehegam")||
//                                    source.getEditText().getText().toString().equals("Nandura")||
//                                    source.getEditText().getText().toString().equals("Nandurbar")||
//                                    source.getEditText().getText().toString().equals("Nandyal Junction")||
//                                    source.getEditText().getText().toString().equals("Nangal Dam")||
//                                    source.getEditText().getText().toString().equals("Nangloi")||
//                                    source.getEditText().getText().toString().equals("Nanguneri")||
//                                    source.getEditText().getText().toString().equals("Nanjangud Town")||
//                                    source.getEditText().getText().toString().equals("Nanpara Junction")||
//                                    source.getEditText().getText().toString().equals("Naojan")||
//                                    source.getEditText().getText().toString().equals("Napasar")||
//                                    source.getEditText().getText().toString().equals("Nar Town")||
//                                    source.getEditText().getText().toString().equals("Naraikkinar")||
//                                    source.getEditText().getText().toString().equals("Naraina")||
//                                    source.getEditText().getText().toString().equals("Narangi")||
//                                    source.getEditText().getText().toString().equals("Naranjipur")||
//                                    source.getEditText().getText().toString().equals("Narasapur")||
//                                    source.getEditText().getText().toString().equals("Narasaraopet")||
//                                    source.getEditText().getText().toString().equals("Narayanpet Road")||
//                                    source.getEditText().getText().toString().equals("Narayanpur")||
//                                    source.getEditText().getText().toString().equals("Narayanpur Anant")||
//                                    source.getEditText().getText().toString().equals("Nardana")||
//                                    source.getEditText().getText().toString().equals("Narela")||
//                                    source.getEditText().getText().toString().equals("Nari Road")||
//                                    source.getEditText().getText().toString().equals("Nariaoli")||
//                                    source.getEditText().getText().toString().equals("Narkatiaganj Junction")||
//                                    source.getEditText().getText().toString().equals("Narkher")||
//                                    source.getEditText().getText().toString().equals("Narnaul")||
//                                    source.getEditText().getText().toString().equals("Naroda")||
//                                    source.getEditText().getText().toString().equals("Narsinghpur")||
//                                    source.getEditText().getText().toString().equals("Narwana Junction")||
//                                    source.getEditText().getText().toString().equals("Narwasi")||
//                                    source.getEditText().getText().toString().equals("Nasik Road")||
//                                    source.getEditText().getText().toString().equals("Nasirabad")||
//                                    source.getEditText().getText().toString().equals("Nathdwara")||
//                                    source.getEditText().getText().toString().equals("Nathwana")||
//                                    source.getEditText().getText().toString().equals("Naugachia")||
//                                    source.getEditText().getText().toString().equals("Nauganwan")||
//                                    source.getEditText().getText().toString().equals("Naugarh")||
//                                    source.getEditText().getText().toString().equals("Naupada Junction")||
//                                    source.getEditText().getText().toString().equals("Nautanwa")||
//                                    source.getEditText().getText().toString().equals("Navade Road")||
//                                    source.getEditText().getText().toString().equals("Navagadh")||
//                                    source.getEditText().getText().toString().equals("Navalur")||
//                                    source.getEditText().getText().toString().equals("Navapur")||
//                                    source.getEditText().getText().toString().equals("Navlakhi")||
//                                    source.getEditText().getText().toString().equals("Navsari")||
//                                    source.getEditText().getText().toString().equals("Nawa City")||
//                                    source.getEditText().getText().toString().equals("Nawadah")||
//                                    source.getEditText().getText().toString().equals("Nawagaon")||
//                                    source.getEditText().getText().toString().equals("Nawalgarh")||
//                                    source.getEditText().getText().toString().equals("Nawalgohan")||
//                                    source.getEditText().getText().toString().equals("Naya Azadpur")||
//                                    source.getEditText().getText().toString().equals("Naya Kharadia")||
//                                    source.getEditText().getText().toString().equals("Naya Nangal")||
//                                    source.getEditText().getText().toString().equals("Nayadupeta")||
//                                    source.getEditText().getText().toString().equals("Nayagaon")||
//                                    source.getEditText().getText().toString().equals("Naydongri")||
//                                    source.getEditText().getText().toString().equals("Nazareth")||
//                                    source.getEditText().getText().toString().equals("Nazirganj")||
//                                    source.getEditText().getText().toString().equals("Nekonda")||
//                                    source.getEditText().getText().toString().equals("Nellimaria")||
//                                    source.getEditText().getText().toString().equals("Nellore")||
//                                    source.getEditText().getText().toString().equals("Nemilichery")||
//                                    source.getEditText().getText().toString().equals("Nemom")||
//                                    source.getEditText().getText().toString().equals("Nenpur")||
//                                    source.getEditText().getText().toString().equals("Nepalganj Road")||
//                                    source.getEditText().getText().toString().equals("Nepanagar")||
//                                    source.getEditText().getText().toString().equals("Neral")||
//                                    source.getEditText().getText().toString().equals("Nergundi")||
//                                    source.getEditText().getText().toString().equals("Neri")||
//                                    source.getEditText().getText().toString().equals("Nerul")||
//                                    source.getEditText().getText().toString().equals("Netawal")||
//                                    source.getEditText().getText().toString().equals("New Alipurduar")||
//                                    source.getEditText().getText().toString().equals("New Bhuj")||
//                                    source.getEditText().getText().toString().equals("New Bhuj")||
//                                    source.getEditText().getText().toString().equals("New Bongaigaon Junction")||
//                                    source.getEditText().getText().toString().equals("New Cooch Behar")||
//                                    source.getEditText().getText().toString().equals("New Delhi")||
//                                    source.getEditText().getText().toString().equals("New Farakka Junction")||
//                                    source.getEditText().getText().toString().equals("New Garia")||
//                                    source.getEditText().getText().toString().equals("New Giridih")||
//                                    source.getEditText().getText().toString().equals("New Gitldada Junction")||
//                                    source.getEditText().getText().toString().equals("New Guntur")||
//                                    source.getEditText().getText().toString().equals("New Jalpaiguri")||
//                                    source.getEditText().getText().toString().equals("New Mal Junction")||
//                                    source.getEditText().getText().toString().equals("New Maynaguri")||
//                                    source.getEditText().getText().toString().equals("New Misamari")||
//                                    source.getEditText().getText().toString().equals("Neyveli")||
//                                    source.getEditText().getText().toString().equals("Neyyattinkara")||
//                                    source.getEditText().getText().toString().equals("Ngrjunanagaramu")||
//                                    source.getEditText().getText().toString().equals("Nibhapur")||
//                                    source.getEditText().getText().toString().equals("Nidadavolu Junction")||
//                                    source.getEditText().getText().toString().equals("Nidamangalam Junction")||
//                                    source.getEditText().getText().toString().equals("Nidubrolu")||
//                                    source.getEditText().getText().toString().equals("Nigohan")||
//                                    source.getEditText().getText().toString().equals("Nihalgarh")||
//                                    source.getEditText().getText().toString().equals("Nilaje")||
//                                    source.getEditText().getText().toString().equals("Nilambazar")||
//                                    source.getEditText().getText().toString().equals("Nilambur Road")||
//                                    source.getEditText().getText().toString().equals("Nileshwar")||
//                                    source.getEditText().getText().toString().equals("Nilokheri")||
//                                    source.getEditText().getText().toString().equals("Nim Ka Thana")||
//                                    source.getEditText().getText().toString().equals("Nimach")||
//                                    source.getEditText().getText().toString().equals("Nimar Kheri")||
//                                    source.getEditText().getText().toString().equals("Nimbahera")||
//                                    source.getEditText().getText().toString().equals("Nimbhora")||
//                                    source.getEditText().getText().toString().equals("Nimtita")||
//                                    source.getEditText().getText().toString().equals("Nindhar Benar")||
//                                    source.getEditText().getText().toString().equals("Ningala Junction")||
//                                    source.getEditText().getText().toString().equals("Nipani Vadgaon")||
//                                    source.getEditText().getText().toString().equals("Niphad")||
//                                    source.getEditText().getText().toString().equals("Nira")||
//                                    source.getEditText().getText().toString().equals("Nirakarpur")||
//                                    source.getEditText().getText().toString().equals("Nirmali")||
//                                    source.getEditText().getText().toString().equals("Nisui")||
//                                    source.getEditText().getText().toString().equals("Nivari")||
//                                    source.getEditText().getText().toString().equals("Nivasar")||
//                                    source.getEditText().getText().toString().equals("Nizamabad")||
//                                    source.getEditText().getText().toString().equals("Nizampur")||
//                                    source.getEditText().getText().toString().equals("Nizbarganj")||
//                                    source.getEditText().getText().toString().equals("Nizchatia")||
//                                    source.getEditText().getText().toString().equals("Noamundi")||
//                                    source.getEditText().getText().toString().equals("Nohar")||
//                                    source.getEditText().getText().toString().equals("Nokha")||
//                                    source.getEditText().getText().toString().equals("Nomoda")||
//                                    source.getEditText().getText().toString().equals("Nonera")||
//                                    source.getEditText().getText().toString().equals("Norla Road")||
//                                    source.getEditText().getText().toString().equals("North Lakhimpur")||
//                                    source.getEditText().getText().toString().equals("Nosaria")||
//                                    source.getEditText().getText().toString().equals("Nowrozabad")||
//                                    source.getEditText().getText().toString().equals("Noyal")||
//                                    source.getEditText().getText().toString().equals("Narayanpur Tatwar")||
//                                    source.getEditText().getText().toString().equals("Nua")||
//                                    source.getEditText().getText().toString().equals("Nunkhar")||
//                                    source.getEditText().getText().toString().equals("Nurmahal")||
//                                    source.getEditText().getText().toString().equals("Okha")||
//                                    source.getEditText().getText().toString().equals("Old Delhi Junction")||
//                                    source.getEditText().getText().toString().equals("Old Malda Junction")||
//                                    source.getEditText().getText().toString().equals("Omkareshwar Road")||
//                                    source.getEditText().getText().toString().equals("Ondagram")||
//                                    source.getEditText().getText().toString().equals("Ongole")||
//                                    source.getEditText().getText().toString().equals("Ontimitta")||
//                                    source.getEditText().getText().toString().equals("Orai")||
//                                    source.getEditText().getText().toString().equals("Ottapalam")||
//                                    source.getEditText().getText().toString().equals("Oorgaum")||
//                                    source.getEditText().getText().toString().equals("Pabai")||
//                                    source.getEditText().getText().toString().equals("Pabli Khas")||
//                                    source.getEditText().getText().toString().equals("Pachrukhi")||
//                                    source.getEditText().getText().toString().equals("Pachhapur")||
//                                    source.getEditText().getText().toString().equals("Pachor Road")||
//                                    source.getEditText().getText().toString().equals("Pachora Junction")||
//                                    source.getEditText().getText().toString().equals("Pachperwa")||
//                                    source.getEditText().getText().toString().equals("Paddhari")||
//                                    source.getEditText().getText().toString().equals("Padhegaon")||
//                                    source.getEditText().getText().toString().equals("Padrauna")||
//                                    source.getEditText().getText().toString().equals("Padse")||
//                                    source.getEditText().getText().toString().equals("Padubidri")||
//                                    source.getEditText().getText().toString().equals("Pagara")||
//                                    source.getEditText().getText().toString().equals("Pahara")||
//                                    source.getEditText().getText().toString().equals("Paharpur")||
//                                    source.getEditText().getText().toString().equals("Pajian")||
//                                    source.getEditText().getText().toString().equals("Pakala Junction")||
//                                    source.getEditText().getText().toString().equals("Pakki")||
//                                    source.getEditText().getText().toString().equals("Pakur")||
//                                    source.getEditText().getText().toString().equals("Palachauri")||
//                                    source.getEditText().getText().toString().equals("Palam")||
//                                    source.getEditText().getText().toString().equals("Palampur Himachal railway station")||
//                                    source.getEditText().getText().toString().equals("Palampur HP OA")||
//                                    source.getEditText().getText().toString().equals("Palana")||
//                                    source.getEditText().getText().toString().equals("Palani")||
//                                    source.getEditText().getText().toString().equals("Palanpur Junction")||
//                                    source.getEditText().getText().toString().equals("Palappuram")||
//                                    source.getEditText().getText().toString().equals("Palasa")||
//                                    source.getEditText().getText().toString().equals("Palasdari")||
//                                    source.getEditText().getText().toString().equals("Paldhi")||
//                                    source.getEditText().getText().toString().equals("Pahlejaghat Junction")||
//                                    source.getEditText().getText().toString().equals("Palej")||
//                                    source.getEditText().getText().toString().equals("Palghar")||
//                                    source.getEditText().getText().toString().equals("Palakkad Junction")||
//                                    source.getEditText().getText().toString().equals("Palakkad Town")||
//                                    source.getEditText().getText().toString().equals("Palakollu")||
//                                    source.getEditText().getText().toString().equals("Pali Marwar")||
//                                    source.getEditText().getText().toString().equals("Palia")||
//                                    source.getEditText().getText().toString().equals("Palia Kalan")||
//                                    source.getEditText().getText().toString().equals("Palitana")||
//                                    source.getEditText().getText().toString().equals("Palpara")||
//                                    source.getEditText().getText().toString().equals("Palsana")||
//                                    source.getEditText().getText().toString().equals("Palsora Makrawa")||
//                                    source.getEditText().getText().toString().equals("Palwal")||
//                                    source.getEditText().getText().toString().equals("Pamban Junction")||
//                                    source.getEditText().getText().toString().equals("Pampur")||
//                                    source.getEditText().getText().toString().equals("Panagarh")||
//                                    source.getEditText().getText().toString().equals("Panbari")||
//                                    source.getEditText().getText().toString().equals("Panch Pipila")||
//                                    source.getEditText().getText().toString().equals("Panch Rukhi")||
//                                    source.getEditText().getText().toString().equals("Pancharatna")||
//                                    source.getEditText().getText().toString().equals("Panchgram")||
//                                    source.getEditText().getText().toString().equals("Panchtalavda Rd")||
//                                    source.getEditText().getText().toString().equals("Pandavapura")||
//                                    source.getEditText().getText().toString().equals("Pandaravadai")||
//                                    source.getEditText().getText().toString().equals("Pandharpur")||
//                                    source.getEditText().getText().toString().equals("Pandhurna")||
//                                    source.getEditText().getText().toString().equals("Pandoli")||
//                                    source.getEditText().getText().toString().equals("Paneli Moti")||
//                                    source.getEditText().getText().toString().equals("Paniahwa")||
//                                    source.getEditText().getText().toString().equals("Panikhaiti")||
//                                    source.getEditText().getText().toString().equals("Panipat Junction")||
//                                    source.getEditText().getText().toString().equals("Panitola")||
//                                    source.getEditText().getText().toString().equals("Panjhan")||
//                                    source.getEditText().getText().toString().equals("Panki, Kanpur")||
//                                    source.getEditText().getText().toString().equals("Panruti")||
//                                    source.getEditText().getText().toString().equals("Panskura Junction")||
//                                    source.getEditText().getText().toString().equals("Pantnagar")||
//                                    source.getEditText().getText().toString().equals("Panvel")||
//                                    source.getEditText().getText().toString().equals("Panzgom")||
//                                    source.getEditText().getText().toString().equals("Papanasam")||
//                                    source.getEditText().getText().toString().equals("Paradgaon")||
//                                    source.getEditText().getText().toString().equals("Paralakhemundi")||
//                                    source.getEditText().getText().toString().equals("Paramakkudi")||
//                                    source.getEditText().getText().toString().equals("Paras")||
//                                    source.getEditText().getText().toString().equals("Parasia")||
//                                    source.getEditText().getText().toString().equals("Parasnath Station")||
//                                    source.getEditText().getText().toString().equals("Paravur")||
//                                    source.getEditText().getText().toString().equals("Parbati")||
//                                    source.getEditText().getText().toString().equals("Parbhani Junction")||
//                                    source.getEditText().getText().toString().equals("Pardhande")||
//                                    source.getEditText().getText().toString().equals("Pardi")||
//                                    source.getEditText().getText().toString().equals("Parel")||
//                                    source.getEditText().getText().toString().equals("Parhihara")||
//                                    source.getEditText().getText().toString().equals("Parkham")||
//                                    source.getEditText().getText().toString().equals("Parli")||
//                                    source.getEditText().getText().toString().equals("Parli Vaijnath")||
//                                    source.getEditText().getText().toString().equals("Parlu")||
//                                    source.getEditText().getText().toString().equals("Parappanangadi")||
//                                    source.getEditText().getText().toString().equals("Parsa Bazar")||
//                                    source.getEditText().getText().toString().equals("Parsa Khera")||
//                                    source.getEditText().getText().toString().equals("Parsabad")||
//                                    source.getEditText().getText().toString().equals("Parsipur")||
//                                    source.getEditText().getText().toString().equals("Parsoda")||
//                                    source.getEditText().getText().toString().equals("Partapgarh Junction")||
//                                    source.getEditText().getText().toString().equals("Partapur, Uttar Pradesh")||
//                                    source.getEditText().getText().toString().equals("Partur")||
//                                    source.getEditText().getText().toString().equals("Parvatipuram")||
//                                    source.getEditText().getText().toString().equals("Parvatipuram Town")||
//                                    source.getEditText().getText().toString().equals("Pasur")||
//                                    source.getEditText().getText().toString().equals("Patal Pani")||
//                                    source.getEditText().getText().toString().equals("Patan")||
//                                    source.getEditText().getText().toString().equals("Patara")||
//                                    source.getEditText().getText().toString().equals("Patas")||
//                                    source.getEditText().getText().toString().equals("Pataudi Road")||
//                                    source.getEditText().getText().toString().equals("Pathankot Junction")||
//                                    source.getEditText().getText().toString().equals("Pathankot Cantt")||
//                                    source.getEditText().getText().toString().equals("Pathardih Junction")||
//                                    source.getEditText().getText().toString().equals("Patharkandi")||
//                                    source.getEditText().getText().toString().equals("Patharkhola S")||
//                                    source.getEditText().getText().toString().equals("Patharia")||
//                                    source.getEditText().getText().toString().equals("Pathauli")||
//                                    source.getEditText().getText().toString().equals("Pathri")||
//                                    source.getEditText().getText().toString().equals("Pathsala")||
//                                    source.getEditText().getText().toString().equals("Patiala")||
//                                    source.getEditText().getText().toString().equals("Patiladaha")||
//                                    source.getEditText().getText().toString().equals("Patli")||
//                                    source.getEditText().getText().toString().equals("Patna Junction")||
//                                    source.getEditText().getText().toString().equals("Patna Saheb")||
//                                    source.getEditText().getText().toString().equals("Patranga")||
//                                    source.getEditText().getText().toString().equals("Patratu")||
//                                    source.getEditText().getText().toString().equals("Patsul")||
//                                    source.getEditText().getText().toString().equals("Pattabiram")||
//                                    source.getEditText().getText().toString().equals("Pattabiram West")||
//                                    source.getEditText().getText().toString().equals("Pattabiram East Depot")||
//                                    source.getEditText().getText().toString().equals("Pattambi")||
//                                    source.getEditText().getText().toString().equals("Pattan")||
//                                    source.getEditText().getText().toString().equals("Pattaravakkam")||
//                                    source.getEditText().getText().toString().equals("Pattukkottai")||
//                                    source.getEditText().getText().toString().equals("Patti")||
//                                    source.getEditText().getText().toString().equals("Pavur Chatram")||
//                                    source.getEditText().getText().toString().equals("Pawapuri Road")||
//                                    source.getEditText().getText().toString().equals("Payagpur")||
//                                    source.getEditText().getText().toString().equals("Payangadi")||
//                                    source.getEditText().getText().toString().equals("Payyanur")||
//                                    source.getEditText().getText().toString().equals("Payyoli")||
//                                    source.getEditText().getText().toString().equals("Peddapalli")||
//                                    source.getEditText().getText().toString().equals("Pendra Road")||
//                                    source.getEditText().getText().toString().equals("Penganga")||
//                                    source.getEditText().getText().toString().equals("Penukonda")||
//                                    source.getEditText().getText().toString().equals("Perambur")||
//                                    source.getEditText().getText().toString().equals("Perambur Carriage Works")||
//                                    source.getEditText().getText().toString().equals("Perambur Loco Works")||
//                                    source.getEditText().getText().toString().equals("Pernem railway station")||
//                                    source.getEditText().getText().toString().equals("Perugamani")||
//                                    source.getEditText().getText().toString().equals("Petlad Junction")||
//                                    source.getEditText().getText().toString().equals("Pethanaickenpalayam")||
//                                    source.getEditText().getText().toString().equals("Pettaivayatalai")||
//                                    source.getEditText().getText().toString().equals("Phagwara Junction")||
//                                    source.getEditText().getText().toString().equals("Phakhoagram")||
//                                    source.getEditText().getText().toString().equals("Phalodi")||
//                                    source.getEditText().getText().toString().equals("Phanda")||
//                                    source.getEditText().getText().toString().equals("Phaphamau Junction")||
//                                    source.getEditText().getText().toString().equals("Phaphund")||
//                                    source.getEditText().getText().toString().equals("Phephna Junction")||
//                                    source.getEditText().getText().toString().equals("Phesar")||
//                                    source.getEditText().getText().toString().equals("Phillaur Junction")||
//                                    source.getEditText().getText().toString().equals("Phulad")||
//                                    source.getEditText().getText().toString().equals("Phulaguri")||
//                                    source.getEditText().getText().toString().equals("Phulera Junction")||
//                                    source.getEditText().getText().toString().equals("Phulia")||
//                                    source.getEditText().getText().toString().equals("Phulpur")||
//                                    source.getEditText().getText().toString().equals("Pij")||
//                                    source.getEditText().getText().toString().equals("Pilamedu(Coimbatore)")||
//                                    source.getEditText().getText().toString().equals("Pili Bangan")||
//                                    source.getEditText().getText().toString().equals("Pilibhit Junction railway station")||
//                                    source.getEditText().getText().toString().equals("Pilioda")||
//                                    source.getEditText().getText().toString().equals("Piler")||
//                                    source.getEditText().getText().toString().equals("Pilkhua")||
//                                    source.getEditText().getText().toString().equals("Pimpar Khed")||
//                                    source.getEditText().getText().toString().equals("Pimpri")||
//                                    source.getEditText().getText().toString().equals("Pindra Road")||
//                                    source.getEditText().getText().toString().equals("Pingleshwar")||
//                                    source.getEditText().getText().toString().equals("Pipalda Road")||
//                                    source.getEditText().getText().toString().equals("Pipalsana")||
//                                    source.getEditText().getText().toString().equals("Pipar Road Junction")||
//                                    source.getEditText().getText().toString().equals("Pipariya")||
//                                    source.getEditText().getText().toString().equals("Piparpur")||
//                                    source.getEditText().getText().toString().equals("Piparsand")||
//                                    source.getEditText().getText().toString().equals("Piplaj")||
//                                    source.getEditText().getText().toString().equals("Piplee")||
//                                    source.getEditText().getText().toString().equals("Piplia")||
//                                    source.getEditText().getText().toString().equals("Piplod Junction")||
//                                    source.getEditText().getText().toString().equals("Piploda Bagla")||
//                                    source.getEditText().getText().toString().equals("Pipraich")||
//                                    source.getEditText().getText().toString().equals("Pipraigaon")||
//                                    source.getEditText().getText().toString().equals("Piprala")||
//                                    source.getEditText().getText().toString().equals("Pipri Dih")||
//                                    source.getEditText().getText().toString().equals("Pirjhalar")||
//                                    source.getEditText().getText().toString().equals("Pirpainti")||
//                                    source.getEditText().getText().toString().equals("Pirthiganj")||
//                                    source.getEditText().getText().toString().equals("Pirumadara")||
//                                    source.getEditText().getText().toString().equals("Pirwa")||
//                                    source.getEditText().getText().toString().equals("Pitambarpur")||
//                                    source.getEditText().getText().toString().equals("Pithapuram")||
//                                    source.getEditText().getText().toString().equals("Plassey")||
//                                    source.getEditText().getText().toString().equals("PMBAKVL_SHANDY")||
//                                    source.getEditText().getText().toString().equals("Podanur Junction")||
//                                    source.getEditText().getText().toString().equals("Pokhrayan")||
//                                    source.getEditText().getText().toString().equals("Pokran")||
//                                    source.getEditText().getText().toString().equals("Pollachi Junction")||
//                                    source.getEditText().getText().toString().equals("Polur")||
//                                    source.getEditText().getText().toString().equals("Ponmalai Golden Rock")||
//                                    source.getEditText().getText().toString().equals("Ponneri")||
//                                    source.getEditText().getText().toString().equals("Porbandar")||
//                                    source.getEditText().getText().toString().equals("Potul")||
//                                    source.getEditText().getText().toString().equals("Prabhadevi")||
//                                    source.getEditText().getText().toString().equals("Prachi Road Junction")||
//                                    source.getEditText().getText().toString().equals("Pranpur Road")||
//                                    source.getEditText().getText().toString().equals("Prantij")||
//                                    source.getEditText().getText().toString().equals("Prantik")||
//                                    source.getEditText().getText().toString().equals("Pratapnagar")||
//                                    source.getEditText().getText().toString().equals("Prayag Junction")||
//                                    source.getEditText().getText().toString().equals("Prayag Ghat")||
//                                    source.getEditText().getText().toString().equals("Pritam Nagar")||
//                                    source.getEditText().getText().toString().equals("Proddatur")||
//                                    source.getEditText().getText().toString().equals("Puducherry")||
//                                    source.getEditText().getText().toString().equals("Pudukad")||
//                                    source.getEditText().getText().toString().equals("Pudukkottai")||
//                                    source.getEditText().getText().toString().equals("Pugalur")||
//                                    source.getEditText().getText().toString().equals("Pulgaon Junction")||
//                                    source.getEditText().getText().toString().equals("Punalur")||
//                                    source.getEditText().getText().toString().equals("Punarakh")||
//                                    source.getEditText().getText().toString().equals("Pundhag")||
//                                    source.getEditText().getText().toString().equals("Pune Junction")||
//                                    source.getEditText().getText().toString().equals("Punkunnam")||
//                                    source.getEditText().getText().toString().equals("Punpun")||
//                                    source.getEditText().getText().toString().equals("Puntamba")||
//                                    source.getEditText().getText().toString().equals("Purab Sarai")||
//                                    source.getEditText().getText().toString().equals("Puraini")||
//                                    source.getEditText().getText().toString().equals("Puranigudam")||
//                                    source.getEditText().getText().toString().equals("Puranpur")||
//                                    source.getEditText().getText().toString().equals("Puri")||
//                                    source.getEditText().getText().toString().equals("Purna Junction")||
//                                    source.getEditText().getText().toString().equals("Purnia Junction")||
//                                    source.getEditText().getText().toString().equals("Purnia Court")||
//                                    source.getEditText().getText().toString().equals("Purua Khera")||
//                                    source.getEditText().getText().toString().equals("Pusad")||
//                                    source.getEditText().getText().toString().equals("Purulia Junction")||
//                                    source.getEditText().getText().toString().equals("Puttur")||
//                                    source.getEditText().getText().toString().equals("Quarry SDG")||
//                                    source.getEditText().getText().toString().equals("Qazigund")||
//                                    source.getEditText().getText().toString().equals("Rabale")||
//                                    source.getEditText().getText().toString().equals("Radhanpur")||
//                                    source.getEditText().getText().toString().equals("Radhikapur")||
//                                    source.getEditText().getText().toString().equals("Rae Bareli Junction")||
//                                    source.getEditText().getText().toString().equals("Rafiganj")||
//                                    source.getEditText().getText().toString().equals("Ragaul")||
//                                    source.getEditText().getText().toString().equals("Raghunathpur")||
//                                    source.getEditText().getText().toString().equals("Raha")||
//                                    source.getEditText().getText().toString().equals("Rahimabad, India")||
//                                    source.getEditText().getText().toString().equals("Rahimatpur")||
//                                    source.getEditText().getText().toString().equals("Rahul Road")||
//                                    source.getEditText().getText().toString().equals("Rahuri")||
//                                    source.getEditText().getText().toString().equals("Rai Singh Nagar")||
//                                    source.getEditText().getText().toString().equals("Raibha railway station")||
//                                    source.getEditText().getText().toString().equals("Raichur")||
//                                    source.getEditText().getText().toString().equals("Raiganj")||
//                                    source.getEditText().getText().toString().equals("Raigarh")||
//                                    source.getEditText().getText().toString().equals("Raika Bagh")||
//                                    source.getEditText().getText().toString().equals("Raila Road")||
//                                    source.getEditText().getText().toString().equals("Raimehatpur")||
//                                    source.getEditText().getText().toString().equals("Raipur Junction")||
//                                    source.getEditText().getText().toString().equals("Rairakhol")||
//                                    source.getEditText().getText().toString().equals("Raisi")||
//                                    source.getEditText().getText().toString().equals("Raiwala")||
//                                    source.getEditText().getText().toString().equals("Raj Gangpur")||
//                                    source.getEditText().getText().toString().equals("Raj Nandgaon")||
//                                    source.getEditText().getText().toString().equals("Raja Bhat Khawa")||
//                                    source.getEditText().getText().toString().equals("Raja Ka Sahaspur")||
//                                    source.getEditText().getText().toString().equals("Raja Ki Mandi")||
//                                    source.getEditText().getText().toString().equals("Rajaldesar")||
//                                    source.getEditText().getText().toString().equals("Rajamundry")||
//                                    source.getEditText().getText().toString().equals("Rajapalayam")||
//                                    source.getEditText().getText().toString().equals("Rajapur Road")||
//                                    source.getEditText().getText().toString().equals("Rajawari")||
//                                    source.getEditText().getText().toString().equals("Rajendranagar Terminal")||
//                                    source.getEditText().getText().toString().equals("Rajgarh")||
//                                    source.getEditText().getText().toString().equals("Rajghat Narora")||
//                                    source.getEditText().getText().toString().equals("Rajgir")||
//                                    source.getEditText().getText().toString().equals("Rajhura")||
//                                    source.getEditText().getText().toString().equals("Rajiyasar")||
//                                    source.getEditText().getText().toString().equals("Rajkharsawan Junction")||
//                                    source.getEditText().getText().toString().equals("Rajkot Junction")||
//                                    source.getEditText().getText().toString().equals("Rajlu Garhi")||
//                                    source.getEditText().getText().toString().equals("Rajmahal")||
//                                    source.getEditText().getText().toString().equals("Rajmane")||
//                                    source.getEditText().getText().toString().equals("Rajosi")||
//                                    source.getEditText().getText().toString().equals("Rajpipla")||
//                                    source.getEditText().getText().toString().equals("Rajpura Junction")||
//                                    source.getEditText().getText().toString().equals("Rajula City")||
//                                    source.getEditText().getText().toString().equals("Rajula Junction")||
//                                    source.getEditText().getText().toString().equals("Rajur")||
//                                    source.getEditText().getText().toString().equals("Rakha Mines")||
//                                    source.getEditText().getText().toString().equals("Rakhi")||
//                                    source.getEditText().getText().toString().equals("Ram Chaura Road")||
//                                    source.getEditText().getText().toString().equals("Raman")||
//                                    source.getEditText().getText().toString().equals("Ram Dayalu Nagar")||
//                                    source.getEditText().getText().toString().equals("Ramanagaram")||
//                                    source.getEditText().getText().toString().equals("Ramanathapuram")||
//                                    source.getEditText().getText().toString().equals("Ramdevra")||
//                                    source.getEditText().getText().toString().equals("Rameswaram")||
//                                    source.getEditText().getText().toString().equals("Ramganga")||
//                                    source.getEditText().getText().toString().equals("Ramganj")||
//                                    source.getEditText().getText().toString().equals("Ramganj Mandi")||
//                                    source.getEditText().getText().toString().equals("Ramgarh Cantonment")||
//                                    source.getEditText().getText().toString().equals("Ramgarhwa")||
//                                    source.getEditText().getText().toString().equals("Ramagundam")||
//                                    source.getEditText().getText().toString().equals("Ramkola")||
//                                    source.getEditText().getText().toString().equals("Ram Mandir")||
//                                    source.getEditText().getText().toString().equals("Ramna")||
//                                    source.getEditText().getText().toString().equals("Ramnagar (J&K)")||
//                                    source.getEditText().getText().toString().equals("Ramnagar")||
//                                    source.getEditText().getText().toString().equals("Rampur")||
//                                    source.getEditText().getText().toString().equals("Rampur Dumra")||
//                                    source.getEditText().getText().toString().equals("Rampur Hat")||
//                                    source.getEditText().getText().toString().equals("Rampura Phul")||
//                                    source.getEditText().getText().toString().equals("Ramsan")||
//                                    source.getEditText().getText().toString().equals("Ramsar")||
//                                    source.getEditText().getText().toString().equals("Ramtek")||
//                                    source.getEditText().getText().toString().equals("Rana Bordi")||
//                                    source.getEditText().getText().toString().equals("Ranaghat Junction")||
//                                    source.getEditText().getText().toString().equals("Ranala")||
//                                    source.getEditText().getText().toString().equals("Ranapratapnagar")||
//                                    source.getEditText().getText().toString().equals("Ranavav")||
//                                    source.getEditText().getText().toString().equals("Marwar Ranawas")||
//                                    source.getEditText().getText().toString().equals("Ranchi")||
//                                    source.getEditText().getText().toString().equals("Ranchi Road")||
//                                    source.getEditText().getText().toString().equals("Rangapara North")||
//                                    source.getEditText().getText().toString().equals("Rangiya Junction")||
//                                    source.getEditText().getText().toString().equals("Rangjuli")||
//                                    source.getEditText().getText().toString().equals("Rangmahal")||
//                                    source.getEditText().getText().toString().equals("Rani")||
//                                    source.getEditText().getText().toString().equals("Ranibennur")||
//                                    source.getEditText().getText().toString().equals("Raniganj")||
//                                    source.getEditText().getText().toString().equals("Ranipur Road")||
//                                    source.getEditText().getText().toString().equals("Raniwara")||
//                                    source.getEditText().getText().toString().equals("Ranjangaon Rd")||
//                                    source.getEditText().getText().toString().equals("Ranjani")||
//                                    source.getEditText().getText().toString().equals("Ranoli")||
//                                    source.getEditText().getText().toString().equals("Ranolishishu")||
//                                    source.getEditText().getText().toString().equals("Ranpur")||
//                                    source.getEditText().getText().toString().equals("Ranthambhore")||
//                                    source.getEditText().getText().toString().equals("Ranuj")||
//                                    source.getEditText().getText().toString().equals("Rasra")||
//                                    source.getEditText().getText().toString().equals("Rasulabad")||
//                                    source.getEditText().getText().toString().equals("Rasull")||
//                                    source.getEditText().getText().toString().equals("Rasuriya")||
//                                    source.getEditText().getText().toString().equals("Rasipuram")||
//                                    source.getEditText().getText().toString().equals("Ratabari")||
//                                    source.getEditText().getText().toString().equals("Ratan Shahr")||
//                                    source.getEditText().getText().toString().equals("Ratangaon")||
//                                    source.getEditText().getText().toString().equals("Ratangarh Junction")||
//                                    source.getEditText().getText().toString().equals("Ratangarh West")||
//                                    source.getEditText().getText().toString().equals("Ratanpura")||
//                                    source.getEditText().getText().toString().equals("Rathdhana")||
//                                    source.getEditText().getText().toString().equals("Ratlam Junction")||
//                                    source.getEditText().getText().toString().equals("Ratnagiri")||
//                                    source.getEditText().getText().toString().equals("Ratnal")||
//                                    source.getEditText().getText().toString().equals("Rau")||
//                                    source.getEditText().getText().toString().equals("Rauzagaon")||
//                                    source.getEditText().getText().toString().equals("Raver")||
//                                    source.getEditText().getText().toString().equals("Rawania Dungar")||
//                                    source.getEditText().getText().toString().equals("Rawatpur(Kanpur)")||
//                                    source.getEditText().getText().toString().equals("Raxaul Junction")||
//                                    source.getEditText().getText().toString().equals("Rayagada")||
//                                    source.getEditText().getText().toString().equals("Rayalcheruvu")||
//                                    source.getEditText().getText().toString().equals("Raybag")||
//                                    source.getEditText().getText().toString().equals("Rayadurg")||
//                                    source.getEditText().getText().toString().equals("Razampeta")||
//                                    source.getEditText().getText().toString().equals("Reay Road")||
//                                    source.getEditText().getText().toString().equals("Rechni Road")||
//                                    source.getEditText().getText().toString().equals("Ren")||
//                                    source.getEditText().getText().toString().equals("Renigunta Junction")||
//                                    source.getEditText().getText().toString().equals("Renukut")||
//                                    source.getEditText().getText().toString().equals("Renwal")||
//                                    source.getEditText().getText().toString().equals("Reoti B Khera")||
//                                    source.getEditText().getText().toString().equals("Repalle")||
//                                    source.getEditText().getText().toString().equals("Rethorakalan")||
//                                    source.getEditText().getText().toString().equals("Rewa Terminal")||
//                                    source.getEditText().getText().toString().equals("Rewari Junction")||
//                                    source.getEditText().getText().toString().equals("Richha Road")||
//                                    source.getEditText().getText().toString().equals("Richughutu")||
//                                    source.getEditText().getText().toString().equals("Ridhore")||
//                                    source.getEditText().getText().toString().equals("Ringas Junction")||
//                                    source.getEditText().getText().toString().equals("Risama")||
//                                    source.getEditText().getText().toString().equals("Rishikesh")||
//                                    source.getEditText().getText().toString().equals("Rishra")||
//                                    source.getEditText().getText().toString().equals("Risia")||
//                                    source.getEditText().getText().toString().equals("Rithi")||
//                                    source.getEditText().getText().toString().equals("Rajendar Nagar Bihar")||
//                                    source.getEditText().getText().toString().equals("Ramgarh Shekhwati")||
//                                    source.getEditText().getText().toString().equals("Raninagar Jalpaiguri")||
//                                    source.getEditText().getText().toString().equals("Robertsganj")||
//                                    source.getEditText().getText().toString().equals("Roha")||
//                                    source.getEditText().getText().toString().equals("Rohana Kalan")||
//                                    source.getEditText().getText().toString().equals("Rohini")||
//                                    source.getEditText().getText().toString().equals("Rohtak Junction")||
//                                    source.getEditText().getText().toString().equals("Roorkee")||
//                                    source.getEditText().getText().toString().equals("Rora")||
//                                    source.getEditText().getText().toString().equals("Roshanpur")||
//                                    source.getEditText().getText().toString().equals("Rotegaon")||
//                                    source.getEditText().getText().toString().equals("Rourkela")||
//                                    source.getEditText().getText().toString().equals("Rowta Bagan")||
//                                    source.getEditText().getText().toString().equals("Roza Junction")||
//                                    source.getEditText().getText().toString().equals("Rudauli")||
//                                    source.getEditText().getText().toString().equals("Rudrapur City")||
//                                    source.getEditText().getText().toString().equals("Rudrapur Road")||
//                                    source.getEditText().getText().toString().equals("Rukadi")||
//                                    source.getEditText().getText().toString().equals("Runija")||
//                                    source.getEditText().getText().toString().equals("Runkhera")||
//                                    source.getEditText().getText().toString().equals("Rupaheli")||
//                                    source.getEditText().getText().toString().equals("Rupahigaon")||
//                                    source.getEditText().getText().toString().equals("Rupamau")||
//                                    source.getEditText().getText().toString().equals("Rupaund")||
//                                    source.getEditText().getText().toString().equals("Rupasibari")||
//                                    source.getEditText().getText().toString().equals("Rupbas")||
//                                    source.getEditText().getText().toString().equals("Rupnagar")||
//                                    source.getEditText().getText().toString().equals("Rupnarayanpur")||
//                                    source.getEditText().getText().toString().equals("Rupra Road")||
//                                    source.getEditText().getText().toString().equals("Rupsa Junction")||
//                                    source.getEditText().getText().toString().equals("Rura")||
//                                    source.getEditText().getText().toString().equals("Rusera Ghat")||
//                                    source.getEditText().getText().toString().equals("Ruthiyai Junction")||
//                                    source.getEditText().getText().toString().equals("Swami Narayan Chhapia")||
//                                    source.getEditText().getText().toString().equals("Sabalgarh")||
//                                    source.getEditText().getText().toString().equals("Sabarmati Bridge")||
//                                    source.getEditText().getText().toString().equals("Sabarmati Junction (Metre Gauge)")||
//                                    source.getEditText().getText().toString().equals("Sabarmati Junction")||
//                                    source.getEditText().getText().toString().equals("Sabarmati South")||
//                                    source.getEditText().getText().toString().equals("Sabaur")||
//                                    source.getEditText().getText().toString().equals("Sabroom")||
//                                    source.getEditText().getText().toString().equals("Sachin")||
//                                    source.getEditText().getText().toString().equals("Sadar Bazar")||
//                                    source.getEditText().getText().toString().equals("Sadat")||
//                                    source.getEditText().getText().toString().equals("Sadhoogarh")||
//                                    source.getEditText().getText().toString().equals("Sadisopur")||
//                                    source.getEditText().getText().toString().equals("Sadulpur Junction")||
//                                    source.getEditText().getText().toString().equals("Sadulshahr")||
//                                    source.getEditText().getText().toString().equals("Sadura")||
//                                    source.getEditText().getText().toString().equals("Safdarjung")||
//                                    source.getEditText().getText().toString().equals("Safedabad")||
//                                    source.getEditText().getText().toString().equals("Safilguda")||
//                                    source.getEditText().getText().toString().equals("Sagardighi")||
//                                    source.getEditText().getText().toString().equals("Sagar Jambagaru")||
//                                    source.getEditText().getText().toString().equals("Sagarpali")||
//                                    source.getEditText().getText().toString().equals("Sagauli Junction")||
//                                    source.getEditText().getText().toString().equals("Sagoni")||
//                                    source.getEditText().getText().toString().equals("Saharanpur Junction")||
//                                    source.getEditText().getText().toString().equals("Saharsa Junction")||
//                                    source.getEditText().getText().toString().equals("Sahatwar")||
//                                    source.getEditText().getText().toString().equals("Sahawar Town")||
//                                    source.getEditText().getText().toString().equals("Sahibabad Junction")||
//                                    source.getEditText().getText().toString().equals("Sahibganj Junction")||
//                                    source.getEditText().getText().toString().equals("Sahibpur KML Junction")||
//                                    source.getEditText().getText().toString().equals("Sahjanwa")||
//                                    source.getEditText().getText().toString().equals("Sri Sathya Sai Prasanthi Nilayam")||
//                                    source.getEditText().getText().toString().equals("Saidkhanpur")||
//                                    source.getEditText().getText().toString().equals("Saidraja")||
//                                    source.getEditText().getText().toString().equals("Sainthia railway station")||
//                                    source.getEditText().getText().toString().equals("Saiyid Sarawan")||
//                                    source.getEditText().getText().toString().equals("Sajanvar Road")||
//                                    source.getEditText().getText().toString().equals("Sajiyavadar")||
//                                    source.getEditText().getText().toString().equals("Sakaldiha")||
//                                    source.getEditText().getText().toString().equals("Sakharayapatna (Sakrepatna)")||
//                                    source.getEditText().getText().toString().equals("Sakhi Gopal")||
//                                    source.getEditText().getText().toString().equals("Sakhoti Tanda")||
//                                    source.getEditText().getText().toString().equals("Sakhpur")||
//                                    source.getEditText().getText().toString().equals("Sakleshpur")||
//                                    source.getEditText().getText().toString().equals("Sakri Junction")||
//                                    source.getEditText().getText().toString().equals("Saktesgarh")||
//                                    source.getEditText().getText().toString().equals("Sakti")||
//                                    source.getEditText().getText().toString().equals("Salakati")||
//                                    source.getEditText().getText().toString().equals("Salamatpur")||
//                                    source.getEditText().getText().toString().equals("Salar")||
//                                    source.getEditText().getText().toString().equals("Salarpur")||
//                                    source.getEditText().getText().toString().equals("Salawas")||
//                                    source.getEditText().getText().toString().equals("Salchapra")||
//                                    source.getEditText().getText().toString().equals("Salekasa")||
//                                    source.getEditText().getText().toString().equals("Salem Junction")||
//                                    source.getEditText().getText().toString().equals("Salem Market")||
//                                    source.getEditText().getText().toString().equals("Salem Town")||
//                                    source.getEditText().getText().toString().equals("Salemgarhmasani")||
//                                    source.getEditText().getText().toString().equals("Salempur Junction")||
//                                    source.getEditText().getText().toString().equals("Salogra")||
//                                    source.getEditText().getText().toString().equals("Salona")||
//                                    source.getEditText().getText().toString().equals("Salpura")||
//                                    source.getEditText().getText().toString().equals("Salur")||
//                                    source.getEditText().getText().toString().equals("Salwa")||
//                                    source.getEditText().getText().toString().equals("Samaguri")||
//                                    source.getEditText().getText().toString().equals("Samakhiali")||
//                                    source.getEditText().getText().toString().equals("Samakhiali B G")||
//                                    source.getEditText().getText().toString().equals("Samalkha")||
//                                    source.getEditText().getText().toString().equals("Samalpatti")||
//                                    source.getEditText().getText().toString().equals("Samalkot Junction")||
//                                    source.getEditText().getText().toString().equals("Samastipur Junction")||
//                                    source.getEditText().getText().toString().equals("Samba")||
//                                    source.getEditText().getText().toString().equals("Sambalpur")||
//                                    source.getEditText().getText().toString().equals("Sambalpur Road")||
//                                    source.getEditText().getText().toString().equals("Sambhar Salt Lake")||
//                                    source.getEditText().getText().toString().equals("Samdhari Junction")||
//                                    source.getEditText().getText().toString().equals("Samlaya Junction")||
//                                    source.getEditText().getText().toString().equals("Sampla")||
//                                    source.getEditText().getText().toString().equals("Samrau")||
//                                    source.getEditText().getText().toString().equals("Samsi")||
//                                    source.getEditText().getText().toString().equals("Sanehwal")||
//                                    source.getEditText().getText().toString().equals("Sanand")||
//                                    source.getEditText().getText().toString().equals("Sanaura")||
//                                    source.getEditText().getText().toString().equals("Sanawad")||
//                                    source.getEditText().getText().toString().equals("Sanchi")||
//                                    source.getEditText().getText().toString().equals("Sandal Kalan")||
//                                    source.getEditText().getText().toString().equals("Sandila")||
//                                    source.getEditText().getText().toString().equals("Sanathnagar")||
//                                    source.getEditText().getText().toString().equals("Sandhurst Road")||
//                                    source.getEditText().getText().toString().equals("Saneh Road")||
//                                    source.getEditText().getText().toString().equals("Sangar")||
//                                    source.getEditText().getText().toString().equals("Sanganapur")||
//                                    source.getEditText().getText().toString().equals("Sanganer")||
//                                    source.getEditText().getText().toString().equals("Sangaria")||
//                                    source.getEditText().getText().toString().equals("Sangat")||
//                                    source.getEditText().getText().toString().equals("Sangli")||
//                                    source.getEditText().getText().toString().equals("Sangameshwar Road")||
//                                    source.getEditText().getText().toString().equals("Sangola")||
//                                    source.getEditText().getText().toString().equals("Sangrampur")||
//                                    source.getEditText().getText().toString().equals("Sangrana Sahib")||
//                                    source.getEditText().getText().toString().equals("Sangrur")||
//                                    source.getEditText().getText().toString().equals("Sanichara")||
//                                    source.getEditText().getText().toString().equals("Sanjan")||
//                                    source.getEditText().getText().toString().equals("Sankarankovil")||
//                                    source.getEditText().getText().toString().equals("SankariDurg")||
//                                    source.getEditText().getText().toString().equals("Sankval")||
//                                    source.getEditText().getText().toString().equals("Sanosara Nandra")||
//                                    source.getEditText().getText().toString().equals("Sanosra")||
//                                    source.getEditText().getText().toString().equals("Sanpada")||
//                                    source.getEditText().getText().toString().equals("Sant Road")||
//                                    source.getEditText().getText().toString().equals("Santacruz")||
//                                    source.getEditText().getText().toString().equals("Santaldih")||
//                                    source.getEditText().getText().toString().equals("Santalpur")||
//                                    source.getEditText().getText().toString().equals("Santragachi Junction")||
//                                    source.getEditText().getText().toString().equals("Santir Bazar")||
//                                    source.getEditText().getText().toString().equals("Sanvordam Curchorem")||
//                                    source.getEditText().getText().toString().equals("Sanvatsar")||
//                                    source.getEditText().getText().toString().equals("Sanvrad")||
//                                    source.getEditText().getText().toString().equals("Sapatgram")||
//                                    source.getEditText().getText().toString().equals("Saphale")||
//                                    source.getEditText().getText().toString().equals("Saradhna")||
//                                    source.getEditText().getText().toString().equals("Sarai Chandi")||
//                                    source.getEditText().getText().toString().equals("Sarai Harkhu")||
//                                    source.getEditText().getText().toString().equals("Sarai Kansrai")||
//                                    source.getEditText().getText().toString().equals("Sarai Mir")||
//                                    source.getEditText().getText().toString().equals("Sarai Rani")||
//                                    source.getEditText().getText().toString().equals("Sarangpur")||
//                                    source.getEditText().getText().toString().equals("Sardarnagar")||
//                                    source.getEditText().getText().toString().equals("Sardarshahr")||
//                                    source.getEditText().getText().toString().equals("Sardiha")||
//                                    source.getEditText().getText().toString().equals("Sareigram")||
//                                    source.getEditText().getText().toString().equals("Sareri")||
//                                    source.getEditText().getText().toString().equals("Sarkoni")||
//                                    source.getEditText().getText().toString().equals("Sarnath")||
//                                    source.getEditText().getText().toString().equals("Sarojini Nagar")||
//                                    source.getEditText().getText().toString().equals("Sarola")||
//                                    source.getEditText().getText().toString().equals("Sarotra Road")||
//                                    source.getEditText().getText().toString().equals("Sarsawa")||
//                                    source.getEditText().getText().toString().equals("Sarupathar")||
//                                    source.getEditText().getText().toString().equals("Sarwari")||
//                                    source.getEditText().getText().toString().equals("Sasan Gir")||
//                                    source.getEditText().getText().toString().equals("Sasaram Junction")||
//                                    source.getEditText().getText().toString().equals("Sasni")||
//                                    source.getEditText().getText().toString().equals("Satadhar")||
//                                    source.getEditText().getText().toString().equals("Satara")||
//                                    source.getEditText().getText().toString().equals("Sathajagat")||
//                                    source.getEditText().getText().toString().equals("Sathiaon")||
//                                    source.getEditText().getText().toString().equals("Sathin Road")||
//                                    source.getEditText().getText().toString().equals("Satna")||
//                                    source.getEditText().getText().toString().equals("Satnali")||
//                                    source.getEditText().getText().toString().equals("Satuna")||
//                                    source.getEditText().getText().toString().equals("Satur")||
//                                    source.getEditText().getText().toString().equals("Saugor (Sagar)")||
//                                    source.getEditText().getText().toString().equals("Savarda")||
//                                    source.getEditText().getText().toString().equals("Savarkundla")||
//                                    source.getEditText().getText().toString().equals("Savda")||
//                                    source.getEditText().getText().toString().equals("Sawai Madhopur")||
//                                    source.getEditText().getText().toString().equals("Sawai Madhopur Junction")||
//                                    source.getEditText().getText().toString().equals("Sawantwadi Road")||
//                                    source.getEditText().getText().toString().equals("Sealdah")||
//                                    source.getEditText().getText().toString().equals("Seawoods–Darave")||
//                                    source.getEditText().getText().toString().equals("Secunderabad Junction")||
//                                    source.getEditText().getText().toString().equals("Sehore")||
//                                    source.getEditText().getText().toString().equals("Sehramau")||
//                                    source.getEditText().getText().toString().equals("Selu")||
//                                    source.getEditText().getText().toString().equals("Semarkheri")||
//                                    source.getEditText().getText().toString().equals("Senapura")||
//                                    source.getEditText().getText().toString().equals("Senchoa Junction")||
//                                    source.getEditText().getText().toString().equals("Sendra")||
//                                    source.getEditText().getText().toString().equals("Sengottai")||
//                                    source.getEditText().getText().toString().equals("Seohara")||
//                                    source.getEditText().getText().toString().equals("Seoraphuli")||
//                                    source.getEditText().getText().toString().equals("Seram")||
//                                    source.getEditText().getText().toString().equals("Serampore")||
//                                    source.getEditText().getText().toString().equals("Settihally")||
//                                    source.getEditText().getText().toString().equals("Sevagram")||
//                                    source.getEditText().getText().toString().equals("Sevaliya")||
//                                    source.getEditText().getText().toString().equals("Sewapuri")||
//                                    source.getEditText().getText().toString().equals("Sewri")||
//                                    source.getEditText().getText().toString().equals("Shadhoragaon")||
//                                    source.getEditText().getText().toString().equals("Shahabad")||
//                                    source.getEditText().getText().toString().equals("Shahad")||
//                                    source.getEditText().getText().toString().equals("Saharsa Junction")||
//                                    source.getEditText().getText().toString().equals("Shahbad Markanda")||
//                                    source.getEditText().getText().toString().equals("Shahbad Mohammadpur")||
//                                    source.getEditText().getText().toString().equals("Shahdol")||
//                                    source.getEditText().getText().toString().equals("Shahganj Junction")||
//                                    source.getEditText().getText().toString().equals("Shahjehanpur")||
//                                    source.getEditText().getText().toString().equals("Shahpur Patoree")||
//                                    source.getEditText().getText().toString().equals("Shahzad Nagar")||
//                                    source.getEditText().getText().toString().equals("Shajahanpur court")||
//                                    source.getEditText().getText().toString().equals("Shajapur")||
//                                    source.getEditText().getText().toString().equals("Shakti Nagar")||
//                                    source.getEditText().getText().toString().equals("Shakurbasti")||
//                                    source.getEditText().getText().toString().equals("Shambhupura")||
//                                    source.getEditText().getText().toString().equals("Shamgarh")||
//                                    source.getEditText().getText().toString().equals("Shamlaji Road")||
//                                    source.getEditText().getText().toString().equals("Shankargarh")||
//                                    source.getEditText().getText().toString().equals("Shankarpalli")||
//                                    source.getEditText().getText().toString().equals("Shantipur")||
//                                    source.getEditText().getText().toString().equals("Shapur Sorath Junction")||
//                                    source.getEditText().getText().toString().equals("Sharma")||
//                                    source.getEditText().getText().toString().equals("SHDSPRA_PADMPRA")||
//                                    source.getEditText().getText().toString().equals("Shedbal")||
//                                    source.getEditText().getText().toString().equals("Shegaon")||
//                                    source.getEditText().getText().toString().equals("Sheikpura")||
//                                    source.getEditText().getText().toString().equals("Shelu")||
//                                    source.getEditText().getText().toString().equals("Shendri")||
//                                    source.getEditText().getText().toString().equals("Shenoli")||
//                                    source.getEditText().getText().toString().equals("Sheo Singh Pura")||
//                                    source.getEditText().getText().toString().equals("Sheopur Kalan")||
//                                    source.getEditText().getText().toString().equals("Sherekan")||
//                                    source.getEditText().getText().toString().equals("Shertalai")||
//                                    source.getEditText().getText().toString().equals("Shikohabad Junction")||
//                                    source.getEditText().getText().toString().equals("Shimla")||
//                                    source.getEditText().getText().toString().equals("Shimoga")||
//                                    source.getEditText().getText().toString().equals("Shimoga Town")||
//                                    source.getEditText().getText().toString().equals("Shirdi (Sainagar Shirdi)")||
//                                    source.getEditText().getText().toString().equals("Shiribagilu")||
//                                    source.getEditText().getText().toString().equals("Shiroor")||
//                                    source.getEditText().getText().toString().equals("Shirravde")||
//                                    source.getEditText().getText().toString().equals("Shirsoli")||
//                                    source.getEditText().getText().toString().equals("Shisho")||
//                                    source.getEditText().getText().toString().equals("Shiupur")||
//                                    source.getEditText().getText().toString().equals("Shivamogga")||
//                                    source.getEditText().getText().toString().equals("Shivarampur")||
//                                    source.getEditText().getText().toString().equals("Shivnagar")||
//                                    source.getEditText().getText().toString().equals("Shivni Shivapur")||
//                                    source.getEditText().getText().toString().equals("Shivpuri")||
//                                    source.getEditText().getText().toString().equals("Shivrampur")||
//                                    source.getEditText().getText().toString().equals("Shivaji Bridge")||
//                                    source.getEditText().getText().toString().equals("Shoghi")||
//                                    source.getEditText().getText().toString().equals("Shohratgarh")||
//                                    source.getEditText().getText().toString().equals("Sholapur CB")||
//                                    source.getEditText().getText().toString().equals("Sholavandan")||
//                                    source.getEditText().getText().toString().equals("Shoranur Junction")||
//                                    source.getEditText().getText().toString().equals("Shri Amirgadh")||
//                                    source.getEditText().getText().toString().equals("Shri Ganganagar")||
//                                    source.getEditText().getText().toString().equals("Shri Karanpur")||
//                                    source.getEditText().getText().toString().equals("Shri Madhopur")||
//                                    source.getEditText().getText().toString().equals("Shri Mahabirji")||
//                                    source.getEditText().getText().toString().equals("Shri Mata Vaishno Devi Katra")||
//                                    source.getEditText().getText().toString().equals("Shridham")||
//                                    source.getEditText().getText().toString().equals("Shrigonda Road")||
//                                    source.getEditText().getText().toString().equals("Shrikalyanpura")||
//                                    source.getEditText().getText().toString().equals("ShriKshetra Nagzari")||
//                                    source.getEditText().getText().toString().equals("Shrirajnagar")||
//                                    source.getEditText().getText().toString().equals("Shrirangapatna")||
//                                    source.getEditText().getText().toString().equals("Shrivagilu")||
//                                    source.getEditText().getText().toString().equals("Shujaatpur")||
//                                    source.getEditText().getText().toString().equals("Shujalpur")||
//                                    source.getEditText().getText().toString().equals("Shyamnagar")||
//                                    source.getEditText().getText().toString().equals("Siajuli")||
//                                    source.getEditText().getText().toString().equals("Sibsagar Town")||
//                                    source.getEditText().getText().toString().equals("Siddhpur")||
//                                    source.getEditText().getText().toString().equals("Sidhauli")||
//                                    source.getEditText().getText().toString().equals("Sidmukh")||
//                                    source.getEditText().getText().toString().equals("Sihapar")||
//                                    source.getEditText().getText().toString().equals("Siho")||
//                                    source.getEditText().getText().toString().equals("Sihor")||
//                                    source.getEditText().getText().toString().equals("Sihora Road")||
//                                    source.getEditText().getText().toString().equals("Sikandarpur")||
//                                    source.getEditText().getText().toString().equals("Sikandra Rao")||
//                                    source.getEditText().getText().toString().equals("Sikar Junction")||
//                                    source.getEditText().getText().toString().equals("Sikir")||
//                                    source.getEditText().getText().toString().equals("Silanibari")||
//                                    source.getEditText().getText().toString().equals("Silao")||
//                                    source.getEditText().getText().toString().equals("Silapathar")||
//                                    source.getEditText().getText().toString().equals("Silaut")||
//                                    source.getEditText().getText().toString().equals("Silchar")||
//                                    source.getEditText().getText().toString().equals("Siliguri Junction")||
//                                    source.getEditText().getText().toString().equals("Siliguru Town")||
//                                    source.getEditText().getText().toString().equals("Silli")||
//                                    source.getEditText().getText().toString().equals("Simaluguri Junction")||
//                                    source.getEditText().getText().toString().equals("Simaria")||
//                                    source.getEditText().getText().toString().equals("Simbhooli")||
//                                    source.getEditText().getText().toString().equals("Simen Chapari")||
//                                    source.getEditText().getText().toString().equals("Simhachalam")||
//                                    source.getEditText().getText().toString().equals("Simlagarh")||
//                                    source.getEditText().getText().toString().equals("Simultala")||
//                                    source.getEditText().getText().toString().equals("Simurali")||
//                                    source.getEditText().getText().toString().equals("Sindhudurg")||
//                                    source.getEditText().getText().toString().equals("Sindi")||
//                                    source.getEditText().getText().toString().equals("Sindkheda")||
//                                    source.getEditText().getText().toString().equals("Sindpan")||
//                                    source.getEditText().getText().toString().equals("Sindri Town")||
//                                    source.getEditText().getText().toString().equals("Sindurwa")||
//                                    source.getEditText().getText().toString().equals("Singanallur(Coimbatore)")||
//                                    source.getEditText().getText().toString().equals("Singapur Road")||
//                                    source.getEditText().getText().toString().equals("Singarayakonda")||
//                                    source.getEditText().getText().toString().equals("Singareni Colleries")||
//                                    source.getEditText().getText().toString().equals("Singarpur")||
//                                    source.getEditText().getText().toString().equals("Singrauli")||
//                                    source.getEditText().getText().toString().equals("Singwal")||
//                                    source.getEditText().getText().toString().equals("Sini Junction")||
//                                    source.getEditText().getText().toString().equals("Sion")||
//                                    source.getEditText().getText().toString().equals("Siras")||
//                                    source.getEditText().getText().toString().equals("Sirathu")||
//                                    source.getEditText().getText().toString().equals("Sirhind Junction")||
//                                    source.getEditText().getText().toString().equals("Sirkazhi")||
//                                    source.getEditText().getText().toString().equals("Sirli")||
//                                    source.getEditText().getText().toString().equals("Sirohi Road")||
//                                    source.getEditText().getText().toString().equals("Sirpur Kaghaznagar")||
//                                    source.getEditText().getText().toString().equals("Sirpur Town")||
//                                    source.getEditText().getText().toString().equals("Sirran")||
//                                    source.getEditText().getText().toString().equals("Sirsa")||
//                                    source.getEditText().getText().toString().equals("Sisarka")||
//                                    source.getEditText().getText().toString().equals("Sisvinhalli")||
//                                    source.getEditText().getText().toString().equals("Siswa Bazar")||
//                                    source.getEditText().getText().toString().equals("Sitamarhi")||
//                                    source.getEditText().getText().toString().equals("Sitapur")||
//                                    source.getEditText().getText().toString().equals("Sitapur Cantonment")||
//                                    source.getEditText().getText().toString().equals("Sitapur City")||
//                                    source.getEditText().getText().toString().equals("Sitarampur")||
//                                    source.getEditText().getText().toString().equals("Sithalavai")||
//                                    source.getEditText().getText().toString().equals("Sithouli")||
//                                    source.getEditText().getText().toString().equals("Sitimani")||
//                                    source.getEditText().getText().toString().equals("Sivaganga")||
//                                    source.getEditText().getText().toString().equals("Sivajinagar")||
//                                    source.getEditText().getText().toString().equals("Sivakasi")||
//                                    source.getEditText().getText().toString().equals("Siwaith")||
//                                    source.getEditText().getText().toString().equals("Siwan Junction")||
//                                    source.getEditText().getText().toString().equals("Siwani")||
//                                    source.getEditText().getText().toString().equals("Sodepur")||
//                                    source.getEditText().getText().toString().equals("Sogariya")||
//                                    source.getEditText().getText().toString().equals("Sohagpur")||
//                                    source.getEditText().getText().toString().equals("Sohwal")||
//                                    source.getEditText().getText().toString().equals("Sojat Road")||
//                                    source.getEditText().getText().toString().equals("Sojitra")||
//                                    source.getEditText().getText().toString().equals("Solan")||
//                                    source.getEditText().getText().toString().equals("Solan Brewery")||
//                                    source.getEditText().getText().toString().equals("Solapur Junction")||
//                                    source.getEditText().getText().toString().equals("Solapur Junction")||
//                                    source.getEditText().getText().toString().equals("Somanur")||
//                                    source.getEditText().getText().toString().equals("Somesar")||
//                                    source.getEditText().getText().toString().equals("Somna")||
//                                    source.getEditText().getText().toString().equals("Somnath")||
//                                    source.getEditText().getText().toString().equals("Sompeta")||
//                                    source.getEditText().getText().toString().equals("Son Nagar")||
//                                    source.getEditText().getText().toString().equals("Sonagir")||
//                                    source.getEditText().getText().toString().equals("Sonarpur Junction")||
//                                    source.getEditText().getText().toString().equals("Sondha Road")||
//                                    source.getEditText().getText().toString().equals("Sonegaon")||
//                                    source.getEditText().getText().toString().equals("Songadh")||
//                                    source.getEditText().getText().toString().equals("Soni")||
//                                    source.getEditText().getText().toString().equals("Sonik")||
//                                    source.getEditText().getText().toString().equals("Sonipat Junction")||
//                                    source.getEditText().getText().toString().equals("Sonpur Junction")||
//                                    source.getEditText().getText().toString().equals("Sonwara")||
//                                    source.getEditText().getText().toString().equals("Sopur")||
//                                    source.getEditText().getText().toString().equals("Sorbhog Junction")||
//                                    source.getEditText().getText().toString().equals("Sorupeta")||
//                                    source.getEditText().getText().toString().equals("Soro")||
//                                    source.getEditText().getText().toString().equals("Soron Shukar Kshetra")||
//                                    source.getEditText().getText().toString().equals("Sri Dungargarh")||
//                                    source.getEditText().getText().toString().equals("Sri Kalahasti")||
//                                    source.getEditText().getText().toString().equals("Srikakulam Road")||
//                                    source.getEditText().getText().toString().equals("Srikrishna Nagar")||
//                                    source.getEditText().getText().toString().equals("Srinagar")||
//                                    source.getEditText().getText().toString().equals("Sriramnagar")||
//                                    source.getEditText().getText().toString().equals("Srirampur, Assam")||
//                                    source.getEditText().getText().toString().equals("Srirangam")||
//                                    source.getEditText().getText().toString().equals("Srivilliputtur")||
//                                    source.getEditText().getText().toString().equals("Subansiri")||
//                                    source.getEditText().getText().toString().equals("Subedarganj")||
//                                    source.getEditText().getText().toString().equals("Subrahmanya Road")||
//                                    source.getEditText().getText().toString().equals("Subzi Mandi")||
//                                    source.getEditText().getText().toString().equals("Suchipind")||
//                                    source.getEditText().getText().toString().equals("Sudsar")||
//                                    source.getEditText().getText().toString().equals("Sujangarh")||
//                                    source.getEditText().getText().toString().equals("Sujanpur")||
//                                    source.getEditText().getText().toString().equals("Sukhisewaniyan")||
//                                    source.getEditText().getText().toString().equals("Sukhpar Roha")||
//                                    source.getEditText().getText().toString().equals("Sukhpur")||
//                                    source.getEditText().getText().toString().equals("Sukritipur")||
//                                    source.getEditText().getText().toString().equals("Suladhal")||
//                                    source.getEditText().getText().toString().equals("Sulah Himachal Pradesh")||
//                                    source.getEditText().getText().toString().equals("Sulgare")||
//                                    source.getEditText().getText().toString().equals("Sullurupeta")||
//                                    source.getEditText().getText().toString().equals("Sultanganj")||
//                                    source.getEditText().getText().toString().equals("Sultanpur")||
//                                    source.getEditText().getText().toString().equals("Sultanpur Lodi")||
//                                    source.getEditText().getText().toString().equals("Sulur Road (Coimbatore)")||
//                                    source.getEditText().getText().toString().equals("Sumer")||
//                                    source.getEditText().getText().toString().equals("Summadevi")||
//                                    source.getEditText().getText().toString().equals("Summer Hill")||
//                                    source.getEditText().getText().toString().equals("Sumreri")||
//                                    source.getEditText().getText().toString().equals("Sunam")||
//                                    source.getEditText().getText().toString().equals("SundaraperumalKoil")||
//                                    source.getEditText().getText().toString().equals("Sunderabad")||
//                                    source.getEditText().getText().toString().equals("Sundlak")||
//                                    source.getEditText().getText().toString().equals("Supaul")||
//                                    source.getEditText().getText().toString().equals("Suraimanpur")||
//                                    source.getEditText().getText().toString().equals("Surajgarh")||
//                                    source.getEditText().getText().toString().equals("Surajpur")||
//                                    source.getEditText().getText().toString().equals("Surajpur Road")||
//                                    source.getEditText().getText().toString().equals("Surat")||
//                                    source.getEditText().getText().toString().equals("Suratgarh Junction")||
//                                    source.getEditText().getText().toString().equals("Surathkal")||
//                                    source.getEditText().getText().toString().equals("Suravali")||
//                                    source.getEditText().getText().toString().equals("Sureli")||
//                                    source.getEditText().getText().toString().equals("Surendranagar")||
//                                    source.getEditText().getText().toString().equals("Suriawan")||
//                                    source.getEditText().getText().toString().equals("Surla Road")||
//                                    source.getEditText().getText().toString().equals("Surpura")||
//                                    source.getEditText().getText().toString().equals("Suwansa")||
//                                    source.getEditText().getText().toString().equals("Suwasra")||
//                                    source.getEditText().getText().toString().equals("Swamimalai")||
//                                    source.getEditText().getText().toString().equals("Swarupganj")||
//                                    source.getEditText().getText().toString().equals("Sanjuje Da Arey]")||
//                                    source.getEditText().getText().toString().equals("Sankval")||
//                                    source.getEditText().getText().toString().equals("Sonalium")||
//                                    source.getEditText().getText().toString().equals("Suravali")||
//                                    source.getEditText().getText().toString().equals("Tadali")||
//                                    source.getEditText().getText().toString().equals("Tadepalligudem")||
//                                    source.getEditText().getText().toString().equals("Tadipatri")||
//                                    source.getEditText().getText().toString().equals("Tadwal")||
//                                    source.getEditText().getText().toString().equals("Tahsil Bhadra")||
//                                    source.getEditText().getText().toString().equals("Tahsil Fatehpur")||
//                                    source.getEditText().getText().toString().equals("Tajpur")||
//                                    source.getEditText().getText().toString().equals("Tajpur Dehma")||
//                                    source.getEditText().getText().toString().equals("Takal")||
//                                    source.getEditText().getText().toString().equals("Takari")||
//                                    source.getEditText().getText().toString().equals("Takarkhede")||
//                                    source.getEditText().getText().toString().equals("Takia")||
//                                    source.getEditText().getText().toString().equals("Taksal")||
//                                    source.getEditText().getText().toString().equals("Taku")||
//                                    source.getEditText().getText().toString().equals("Talaiyuthu")||
//                                    source.getEditText().getText().toString().equals("Talara")||
//                                    source.getEditText().getText().toString().equals("Talakhajuri")||
//                                    source.getEditText().getText().toString().equals("Talala Junction")||
//                                    source.getEditText().getText().toString().equals("Talvadiya Junction")||
//                                    source.getEditText().getText().toString().equals("Talbahat")||
//                                    source.getEditText().getText().toString().equals("Talcher")||
//                                    source.getEditText().getText().toString().equals("Talchhapar")||
//                                    source.getEditText().getText().toString().equals("Talegaon Dabhade")||
//                                    source.getEditText().getText().toString().equals("Talguppa")||
//                                    source.getEditText().getText().toString().equals("Talheri Buzurg")||
//                                    source.getEditText().getText().toString().equals("Talli Saidasahu")||
//                                    source.getEditText().getText().toString().equals("Talod")||
//                                    source.getEditText().getText().toString().equals("Taloja")||
//                                    source.getEditText().getText().toString().equals("Talwandi")||
//                                    source.getEditText().getText().toString().equals("Tambaram")||
//                                    source.getEditText().getText().toString().equals("Tamkuhi Road")||
//                                    source.getEditText().getText().toString().equals("Tamluk")||
//                                    source.getEditText().getText().toString().equals("Tamuriya")||
//                                    source.getEditText().getText().toString().equals("Tanakpur")||
//                                    source.getEditText().getText().toString().equals("Tanda Urmar")||
//                                    source.getEditText().getText().toString().equals("Tandur railway station")||
//                                    source.getEditText().getText().toString().equals("Tangla")||
//                                    source.getEditText().getText().toString().equals("Tangra")||
//                                    source.getEditText().getText().toString().equals("Tankuppa")||
//                                    source.getEditText().getText().toString().equals("Tanuku")||
//                                    source.getEditText().getText().toString().equals("Tanur")||
//                                    source.getEditText().getText().toString().equals("Tapa")||
//                                    source.getEditText().getText().toString().equals("Tapri")||
//                                    source.getEditText().getText().toString().equals("Tarabari")||
//                                    source.getEditText().getText().toString().equals("Taradevi")||
//                                    source.getEditText().getText().toString().equals("Tarak Nagar")||
//                                    source.getEditText().getText().toString().equals("Tarana Road")||
//                                    source.getEditText().getText().toString().equals("Taranga Hill")||
//                                    source.getEditText().getText().toString().equals("Taraori")||
//                                    source.getEditText().getText().toString().equals("Taregna")||
//                                    source.getEditText().getText().toString().equals("Targaon")||
//                                    source.getEditText().getText().toString().equals("Tarighat")||
//                                    source.getEditText().getText().toString().equals("Tarlupadu")||
//                                    source.getEditText().getText().toString().equals("Tarn Taran")||
//                                    source.getEditText().getText().toString().equals("Tarsai")||
//                                    source.getEditText().getText().toString().equals("Tarsari Muria")||
//                                    source.getEditText().getText().toString().equals("Tatanagar Junction")||
//                                    source.getEditText().getText().toString().equals("Tatibahar")||
//                                    source.getEditText().getText().toString().equals("Tatisilwai")||
//                                    source.getEditText().getText().toString().equals("Teghra")||
//                                    source.getEditText().getText().toString().equals("Teharka")||
//                                    source.getEditText().getText().toString().equals("Telam")||
//                                    source.getEditText().getText().toString().equals("Tellicherry")||
//                                    source.getEditText().getText().toString().equals("Tenali Junction")||
//                                    source.getEditText().getText().toString().equals("Theni")||
//                                    source.getEditText().getText().toString().equals("Tenkasi")||
//                                    source.getEditText().getText().toString().equals("Tenmalai")||
//                                    source.getEditText().getText().toString().equals("Tetelia")||
//                                    source.getEditText().getText().toString().equals("Tetulmari")||
//                                    source.getEditText().getText().toString().equals("Tezpore")||
//                                    source.getEditText().getText().toString().equals("Thakurkuchi")||
//                                    source.getEditText().getText().toString().equals("Thakurli")||
//                                    source.getEditText().getText().toString().equals("Than Junction")||
//                                    source.getEditText().getText().toString().equals("Thana Bihpur Junction")||
//                                    source.getEditText().getText().toString().equals("Thandla Rd")||
//                                    source.getEditText().getText().toString().equals("Thane")||
//                                    source.getEditText().getText().toString().equals("Thanjavur Junction")||
//                                    source.getEditText().getText().toString().equals("Thathana Mithri")||
//                                    source.getEditText().getText().toString().equals("Thawe Junction")||
//                                    source.getEditText().getText().toString().equals("Thekeraguri")||
//                                    source.getEditText().getText().toString().equals("Therubali")||
//                                    source.getEditText().getText().toString().equals("Thrissur")||
//                                    source.getEditText().getText().toString().equals("Trivandrum Central")||
//                                    source.getEditText().getText().toString().equals("Thirumullaivoyal")||
//                                    source.getEditText().getText().toString().equals("Thiruninravur")||
//                                    source.getEditText().getText().toString().equals("Thiruvananthapuram Pettah")||
//                                    source.getEditText().getText().toString().equals("Thoothukudi Melur railway station")||
//                                    source.getEditText().getText().toString().equals("Thoothukudi railway station")||
//                                    source.getEditText().getText().toString().equals("Thiruvarur Junction")||
//                                    source.getEditText().getText().toString().equals("Thivim railway station")||
//                                    source.getEditText().getText().toString().equals("Thokur")||
//                                    source.getEditText().getText().toString().equals("Thuria, India")||
//                                    source.getEditText().getText().toString().equals("Tibi")||
//                                    source.getEditText().getText().toString().equals("Tihu")||
//                                    source.getEditText().getText().toString().equals("Tikaria")||
//                                    source.getEditText().getText().toString().equals("Tikekarwadi")||
//                                    source.getEditText().getText().toString().equals("Tikunia")||
//                                    source.getEditText().getText().toString().equals("Tilak Bridge")||
//                                    source.getEditText().getText().toString().equals("Tilak Nagar")||
//                                    source.getEditText().getText().toString().equals("Tilaru")||
//                                    source.getEditText().getText().toString().equals("Tilaiya")||
//                                    source.getEditText().getText().toString().equals("Tilda")||
//                                    source.getEditText().getText().toString().equals("Tilhar")||
//                                    source.getEditText().getText().toString().equals("Tilrath")||
//                                    source.getEditText().getText().toString().equals("Tilwara")||
//                                    source.getEditText().getText().toString().equals("Timarni")||
//                                    source.getEditText().getText().toString().equals("Timba Road")||
//                                    source.getEditText().getText().toString().equals("Timmapur")||
//                                    source.getEditText().getText().toString().equals("Tinai Ghat")||
//                                    source.getEditText().getText().toString().equals("Tindivanam")||
//                                    source.getEditText().getText().toString().equals("Tinpahar Junction")||
//                                    source.getEditText().getText().toString().equals("Tinsukia Junction")||
//                                    source.getEditText().getText().toString().equals("Tipkai")||
//                                    source.getEditText().getText().toString().equals("Tipling")||
//                                    source.getEditText().getText().toString().equals("Tiptur")||
//                                    source.getEditText().getText().toString().equals("Tiruchirapalli Fort")||
//                                    source.getEditText().getText().toString().equals("Tirodi")||
//                                    source.getEditText().getText().toString().equals("Tirora")||
//                                    source.getEditText().getText().toString().equals("Tiruchirapalli Junction")||
//                                    source.getEditText().getText().toString().equals("Tiruchendur")||
//                                    source.getEditText().getText().toString().equals("Tiruchirapalli Palakkarai")||
//                                    source.getEditText().getText().toString().equals("Tirukoilur")||
//                                    source.getEditText().getText().toString().equals("Tirumalairayanpattinam")||
//                                    source.getEditText().getText().toString().equals("Tirumangalam")||
//                                    source.getEditText().getText().toString().equals("Tirunagesvaram")||
//                                    source.getEditText().getText().toString().equals("Tirunelveli Junction")||
//                                    source.getEditText().getText().toString().equals("Tirupadripuliyur")||
//                                    source.getEditText().getText().toString().equals("Tirupati")||
//                                    source.getEditText().getText().toString().equals("Tiruparankndrm")||
//                                    source.getEditText().getText().toString().equals("Tirupattur Junction")||
//                                    source.getEditText().getText().toString().equals("Tiruppappuliyur")||
//                                    source.getEditText().getText().toString().equals("Tiruppur")||
//                                    source.getEditText().getText().toString().equals("Tirur")||
//                                    source.getEditText().getText().toString().equals("Tiruttani")||
//                                    source.getEditText().getText().toString().equals("Tiruttangal")||
//                                    source.getEditText().getText().toString().equals("Tiruturaipundi Junction")||
//                                    source.getEditText().getText().toString().equals("Tiruvalla")||
//                                    source.getEditText().getText().toString().equals("Tiruvallur")||
//                                    source.getEditText().getText().toString().equals("Tiruvannamalai railway station")||
//                                    source.getEditText().getText().toString().equals("Tiruverumbur")||
//                                    source.getEditText().getText().toString().equals("Tiruvidaimarudur")||
//                                    source.getEditText().getText().toString().equals("Tiruvottiyur")||
//                                    source.getEditText().getText().toString().equals("Tisi")||
//                                    source.getEditText().getText().toString().equals("Tisua")||
//                                    source.getEditText().getText().toString().equals("Titabar")||
//                                    source.getEditText().getText().toString().equals("Titlagarh")||
//                                    source.getEditText().getText().toString().equals("Titlagarh Junction")||
//                                    source.getEditText().getText().toString().equals("Titwala")||
//                                    source.getEditText().getText().toString().equals("Tivari")||
//                                    source.getEditText().getText().toString().equals("Todarpur")||
//                                    source.getEditText().getText().toString().equals("Tohana")||
//                                    source.getEditText().getText().toString().equals("Toranagallu")||
//                                    source.getEditText().getText().toString().equals("Tori")||
//                                    source.getEditText().getText().toString().equals("Trichur")||
//                                    source.getEditText().getText().toString().equals("Trikarpur")||
//                                    source.getEditText().getText().toString().equals("Trilochan Mahdo")||
//                                    source.getEditText().getText().toString().equals("Tripunittura")||
//                                    source.getEditText().getText().toString().equals("Tondiarpet")||
//                                    source.getEditText().getText().toString().equals("Tsunduru")||
//                                    source.getEditText().getText().toString().equals("Tughlakabad")||
//                                    source.getEditText().getText().toString().equals("Tukaithad")||
//                                    source.getEditText().getText().toString().equals("Tulsipur")||
//                                    source.getEditText().getText().toString().equals("Tulwara Jhil")||
//                                    source.getEditText().getText().toString().equals("Tumkur")||
//                                    source.getEditText().getText().toString().equals("Tumsar Road")||
//                                    source.getEditText().getText().toString().equals("Tundla Junction")||
//                                    source.getEditText().getText().toString().equals("Tuni")||
//                                    source.getEditText().getText().toString().equals("Turbhe")||
//                                    source.getEditText().getText().toString().equals("Turtipar")||
//                                    source.getEditText().getText().toString().equals("Tuwa")||
//                                    source.getEditText().getText().toString().equals("Twining Ganj")||
//                                    source.getEditText().getText().toString().equals("Tada")||
//                                    source.getEditText().getText().toString().equals("Ubarni")||
//                                    source.getEditText().getText().toString().equals("Uchana")||
//                                    source.getEditText().getText().toString().equals("Uchippuli")||
//                                    source.getEditText().getText().toString().equals("Udagamandalam")||
//                                    source.getEditText().getText().toString().equals("Udaipur City")||
//                                    source.getEditText().getText().toString().equals("Udaipur Khurd Halt")||
//                                    source.getEditText().getText().toString().equals("Udaipur Tripura")||
//                                    source.getEditText().getText().toString().equals("Udaipura")||
//                                    source.getEditText().getText().toString().equals("Udairampur")||
//                                    source.getEditText().getText().toString().equals("Udalguri")||
//                                    source.getEditText().getText().toString().equals("Udalkachar")||
//                                    source.getEditText().getText().toString().equals("Udasar")||
//                                    source.getEditText().getText().toString().equals("Udgir")||
//                                    source.getEditText().getText().toString().equals("Udhampur")||
//                                    source.getEditText().getText().toString().equals("Udhna Junction")||
//                                    source.getEditText().getText().toString().equals("Udramsar")||
//                                    source.getEditText().getText().toString().equals("Udupi")||
//                                    source.getEditText().getText().toString().equals("Udvada")||
//                                    source.getEditText().getText().toString().equals("Udwantnagar Halt")||
//                                    source.getEditText().getText().toString().equals("Udyankheri")||
//                                    source.getEditText().getText().toString().equals("Ugaon")||
//                                    source.getEditText().getText().toString().equals("Ugar Khurd")||
//                                    source.getEditText().getText().toString().equals("Ugarpur")||
//                                    source.getEditText().getText().toString().equals("Ugna Halt")||
//                                    source.getEditText().getText().toString().equals("Ugrasenpur")||
//                                    source.getEditText().getText().toString().equals("Ugu")||
//                                    source.getEditText().getText().toString().equals("Ugwe")||
//                                    source.getEditText().getText().toString().equals("Ujalvav")||
//                                    source.getEditText().getText().toString().equals("Ujhani")||
//                                    source.getEditText().getText().toString().equals("Ujiarpur")||
//                                    source.getEditText().getText().toString().equals("Ujjain Junction")||
//                                    source.getEditText().getText().toString().equals("Ukai Songadh")||
//                                    source.getEditText().getText().toString().equals("Ukhali")||
//                                    source.getEditText().getText().toString().equals("Ukhra")||
//                                    source.getEditText().getText().toString().equals("Ukilerhat Halt")||
//                                    source.getEditText().getText().toString().equals("Uklana")||
//                                    source.getEditText().getText().toString().equals("Ukshi")||
//                                    source.getEditText().getText().toString().equals("Ulavapadu")||
//                                    source.getEditText().getText().toString().equals("Ulhasnagar")||
//                                    source.getEditText().getText().toString().equals("Ulindakonda")||
//                                    source.getEditText().getText().toString().equals("Ullal")||
//                                    source.getEditText().getText().toString().equals("Ulnabhari")||
//                                    source.getEditText().getText().toString().equals("Ulubaria")||
//                                    source.getEditText().getText().toString().equals("Ulundurpet")||
//                                    source.getEditText().getText().toString().equals("Umar Tali")||
//                                    source.getEditText().getText().toString().equals("Umardashi")||
//                                    source.getEditText().getText().toString().equals("Umaria")||
//                                    source.getEditText().getText().toString().equals("Umariaispah Halt")||
//                                    source.getEditText().getText().toString().equals("Umarpada")||
//                                    source.getEditText().getText().toString().equals("Umargam Road")||
//                                    source.getEditText().getText().toString().equals("Umda Nagar")||
//                                    source.getEditText().getText().toString().equals("Umed")||
//                                    source.getEditText().getText().toString().equals("Umeshnagar")||
//                                    source.getEditText().getText().toString().equals("Umra")||
//                                    source.getEditText().getText().toString().equals("Umranala")||
//                                    source.getEditText().getText().toString().equals("Umram")||
//                                    source.getEditText().getText().toString().equals("Umred")||
//                                    source.getEditText().getText().toString().equals("Umreth")||
//                                    source.getEditText().getText().toString().equals("Umri")||
//                                    source.getEditText().getText().toString().equals("Umroli")||
//                                    source.getEditText().getText().toString().equals("Una")||
//                                    source.getEditText().getText().toString().equals("Una Himachal")||
//                                    source.getEditText().getText().toString().equals("Unai Vansada Rd")||
//                                    source.getEditText().getText().toString().equals("Unaula")||
//                                    source.getEditText().getText().toString().equals("Unchahar Junction")||
//                                    source.getEditText().getText().toString().equals("Unchaulia")||
//                                    source.getEditText().getText().toString().equals("Unchdih")||
//                                    source.getEditText().getText().toString().equals("Unchhera")||
//                                    source.getEditText().getText().toString().equals("Unchi Bassi")||
//                                    source.getEditText().getText().toString().equals("Undasa Madhawpu")||
//                                    source.getEditText().getText().toString().equals("Undi")||
//                                    source.getEditText().getText().toString().equals("Unguturu")||
//                                    source.getEditText().getText().toString().equals("Unhel")||
//                                    source.getEditText().getText().toString().equals("Unjalur")||
//                                    source.getEditText().getText().toString().equals("Unjha")||
//                                    source.getEditText().getText().toString().equals("Unkal")||
//                                    source.getEditText().getText().toString().equals("Unnao Junction")||
//                                    source.getEditText().getText().toString().equals("Untare Road")||
//                                    source.getEditText().getText().toString().equals("Uplai")||
//                                    source.getEditText().getText().toString().equals("Upleta")||
//                                    source.getEditText().getText().toString().equals("Uppal")||
//                                    source.getEditText().getText().toString().equals("Uppala")||
//                                    source.getEditText().getText().toString().equals("Uppalavai")||
//                                    source.getEditText().getText().toString().equals("Uppalur")||
//                                    source.getEditText().getText().toString().equals("Uppuguda")||
//                                    source.getEditText().getText().toString().equals("Uppugunduru")||
//                                    source.getEditText().getText().toString().equals("Urappakkam")||
//                                    source.getEditText().getText().toString().equals("Urdauli")||
//                                    source.getEditText().getText().toString().equals("Uren")||
//                                    source.getEditText().getText().toString().equals("Urga")||
//                                    source.getEditText().getText().toString().equals("Urkura")||
//                                    source.getEditText().getText().toString().equals("Urlam")||
//                                    source.getEditText().getText().toString().equals("Urma")||
//                                    source.getEditText().getText().toString().equals("Uruli")||
//                                    source.getEditText().getText().toString().equals("Usalapur")||
//                                    source.getEditText().getText().toString().equals("Usia Khas")||
//                                    source.getEditText().getText().toString().equals("Uska Bazar")||
//                                    source.getEditText().getText().toString().equals("Usmanpur")||
//                                    source.getEditText().getText().toString().equals("Usra")||
//                                    source.getEditText().getText().toString().equals("Utarlai")||
//                                    source.getEditText().getText().toString().equals("Utarsanda")||
//                                    source.getEditText().getText().toString().equals("Utrahtia")||
//                                    source.getEditText().getText().toString().equals("Utran")||
//                                    source.getEditText().getText().toString().equals("Utripura")||
//                                    source.getEditText().getText().toString().equals("Uttamarkovil")||
//                                    source.getEditText().getText().toString().equals("Uttangal Mangalam")||
//                                    source.getEditText().getText().toString().equals("Uttar Radhanagar Halt")||
//                                    source.getEditText().getText().toString().equals("Uttarpara")||
//                                    source.getEditText().getText().toString().equals("Uttukuli")||
//                                    source.getEditText().getText().toString().equals("Udumalpettai")||
//                                    source.getEditText().getText().toString().equals("V.O.C Nagar")||
//                                    source.getEditText().getText().toString().equals("Vachaspati Nagar")||
//                                    source.getEditText().getText().toString().equals("Vadaj")||
//                                    source.getEditText().getText().toString().equals("Vadakara")||
//                                    source.getEditText().getText().toString().equals("Vadal")||
//                                    source.getEditText().getText().toString().equals("Vadali")||
//                                    source.getEditText().getText().toString().equals("Vadali Luter Road")||
//                                    source.getEditText().getText().toString().equals("Vadalur")||
//                                    source.getEditText().getText().toString().equals("Vadamadura")||
//                                    source.getEditText().getText().toString().equals("Vadanam Kurussi Halt")||
//                                    source.getEditText().getText().toString().equals("Vadgaon")||
//                                    source.getEditText().getText().toString().equals("Vadgaon Nila")||
//                                    source.getEditText().getText().toString().equals("Vadhvana")||
//                                    source.getEditText().getText().toString().equals("Vadippatti")||
//                                    source.getEditText().getText().toString().equals("Vadiya Devli")||
//                                    source.getEditText().getText().toString().equals("Vadlamannadu")||
//                                    source.getEditText().getText().toString().equals("Vadnagar")||
//                                    source.getEditText().getText().toString().equals("Vadod")||
//                                    source.getEditText().getText().toString().equals("Vadodara Junction")||
//                                    source.getEditText().getText().toString().equals("Vadtal Swaminarayan")||
//                                    source.getEditText().getText().toString().equals("Vadviyala")||
//                                    source.getEditText().getText().toString().equals("Vagdiya")||
//                                    source.getEditText().getText().toString().equals("Vaghli")||
//                                    source.getEditText().getText().toString().equals("Vaibhavwadi Road")||
//                                    source.getEditText().getText().toString().equals("Vaikom Road")||
//                                    source.getEditText().getText().toString().equals("Vailapuzha")||
//                                    source.getEditText().getText().toString().equals("Vaitarna")||
//                                    source.getEditText().getText().toString().equals("Vaitheeswaran Koil")||
//                                    source.getEditText().getText().toString().equals("Vakav")||
//                                    source.getEditText().getText().toString().equals("Valadar")||
//                                    source.getEditText().getText().toString().equals("Valadi")||
//                                    source.getEditText().getText().toString().equals("Valantaravai")||
//                                    source.getEditText().getText().toString().equals("Valapattanam")||
//                                    source.getEditText().getText().toString().equals("Valappadi G Halt")||
//                                    source.getEditText().getText().toString().equals("Valaramanikkam")||
//                                    source.getEditText().getText().toString().equals("Valathoor")||
//                                    source.getEditText().getText().toString().equals("Valavanur")||
//                                    source.getEditText().getText().toString().equals("Valha")||
//                                    source.getEditText().getText().toString().equals("Valivade")||
//                                    source.getEditText().getText().toString().equals("Vallabhnagar")||
//                                    source.getEditText().getText().toString().equals("Vallabh Vidyanagar")||
//                                    source.getEditText().getText().toString().equals("Vallampadugai")||
//                                    source.getEditText().getText().toString().equals("Vallathol Nagar")||
//                                    source.getEditText().getText().toString().equals("Vallikkunnu")||
//                                    source.getEditText().getText().toString().equals("Valliveedu")||
//                                    source.getEditText().getText().toString().equals("Valliyur")||
//                                    source.getEditText().getText().toString().equals("Valmikinagar Road")||
//                                    source.getEditText().getText().toString().equals("Valsad")||
//                                    source.getEditText().getText().toString().equals("Valyampatti")||
//                                    source.getEditText().getText().toString().equals("Vambori")||
//                                    source.getEditText().getText().toString().equals("Vandalu")||
//                                    source.getEditText().getText().toString().equals("Vangani")||
//                                    source.getEditText().getText().toString().equals("Vanganur")||
//                                    source.getEditText().getText().toString().equals("Vangaon")||
//                                    source.getEditText().getText().toString().equals("Vangal")||
//                                    source.getEditText().getText().toString().equals("Vani Road")||
//                                    source.getEditText().getText().toString().equals("Vanigonda")||
//                                    source.getEditText().getText().toString().equals("Vaniyambadi")||
//                                    source.getEditText().getText().toString().equals("Vaniyambadi")||
//                                    source.getEditText().getText().toString().equals("Vaniyambalam")||
//                                    source.getEditText().getText().toString().equals("Vanji Maniyachi Junction")||
//                                    source.getEditText().getText().toString().equals("Vankal")||
//                                    source.getEditText().getText().toString().equals("Vapi")||
//                                    source.getEditText().getText().toString().equals("Varahi")||
//                                    source.getEditText().getText().toString().equals("Varakalpattu")||
//                                    source.getEditText().getText().toString().equals("Varanasi City")||
//                                    source.getEditText().getText().toString().equals("Varanasi Junction")||
//                                    source.getEditText().getText().toString().equals("Varangaon")||
//                                    source.getEditText().getText().toString().equals("Varediya")||
//                                    source.getEditText().getText().toString().equals("Varkala")||
//                                    source.getEditText().getText().toString().equals("Varkhedi")||
//                                    source.getEditText().getText().toString().equals("Varnama")||
//                                    source.getEditText().getText().toString().equals("Vartej")||
//                                    source.getEditText().getText().toString().equals("Varvala")||
//                                    source.getEditText().getText().toString().equals("Vasad Junction")||
//                                    source.getEditText().getText().toString().equals("Vasai Road")||
//                                    source.getEditText().getText().toString().equals("Vasan Iyawa")||
//                                    source.getEditText().getText().toString().equals("Vasco da Gama railway station")||
//                                    source.getEditText().getText().toString().equals("Vashi")||
//                                    source.getEditText().getText().toString().equals("Vasind")||
//                                    source.getEditText().getText().toString().equals("Vaso")||
//                                    source.getEditText().getText().toString().equals("Vastrapur")||
//                                    source.getEditText().getText().toString().equals("Vatluru")||
//                                    source.getEditText().getText().toString().equals("Vatva")||
//                                    source.getEditText().getText().toString().equals("Vavdi")||
//                                    source.getEditText().getText().toString().equals("Vavdi Khurd")||
//                                    source.getEditText().getText().toString().equals("Vavera")||
//                                    source.getEditText().getText().toString().equals("Vayalar")||
//                                    source.getEditText().getText().toString().equals("Vayalpad")||
//                                    source.getEditText().getText().toString().equals("Vazeerpur Halt")||
//                                    source.getEditText().getText().toString().equals("Vedayapalem")||
//                                    source.getEditText().getText().toString().equals("Vedchha")||
//                                    source.getEditText().getText().toString().equals("Veer")||
//                                    source.getEditText().getText().toString().equals("Vejalka")||
//                                    source.getEditText().getText().toString().equals("Vejendla")||
//                                    source.getEditText().getText().toString().equals("Velachery")||
//                                    source.getEditText().getText().toString().equals("Velaccha")||
//                                    source.getEditText().getText().toString().equals("Velankanni")||
//                                    source.getEditText().getText().toString().equals("Veldurti")||
//                                    source.getEditText().getText().toString().equals("Vellanur")||
//                                    source.getEditText().getText().toString().equals("Vellarakkad")||
//                                    source.getEditText().getText().toString().equals("Vellayil")||
//                                    source.getEditText().getText().toString().equals("Vellipalayem")||
//                                    source.getEditText().getText().toString().equals("Velliyani")||
//                                    source.getEditText().getText().toString().equals("Vellodu")||
//                                    source.getEditText().getText().toString().equals("Vellore Cantonment")||
//                                    source.getEditText().getText().toString().equals("Vellore Town")||
//                                    source.getEditText().getText().toString().equals("Vellur Halt")||
//                                    source.getEditText().getText().toString().equals("Velpuru")||
//                                    source.getEditText().getText().toString().equals("Velpuru Road")||
//                                    source.getEditText().getText().toString().equals("Vemuru")||
//                                    source.getEditText().getText().toString().equals("Vendodu")||
//                                    source.getEditText().getText().toString().equals("Vendra")||
//                                    source.getEditText().getText().toString().equals("Venkatachalam")||
//                                    source.getEditText().getText().toString().equals("Venkatagiri")||
//                                    source.getEditText().getText().toString().equals("Venkatagiri Kote Halt")||
//                                    source.getEditText().getText().toString().equals("Venkatampalli")||
//                                    source.getEditText().getText().toString().equals("Venkatanarashimarajuvaripeta")||
//                                    source.getEditText().getText().toString().equals("Venkatnagar")||
//                                    source.getEditText().getText().toString().equals("Ventraptagada")||
//                                    source.getEditText().getText().toString().equals("Vepagunta")||
//                                    source.getEditText().getText().toString().equals("Veppampattu")||
//                                    source.getEditText().getText().toString().equals("Veraval")||
//                                    source.getEditText().getText().toString().equals("Verka Junction")||
//                                    source.getEditText().getText().toString().equals("Verna railway station")||
//                                    source.getEditText().getText().toString().equals("Vetapalemu")||
//                                    source.getEditText().getText().toString().equals("Vidisha")||
//                                    source.getEditText().getText().toString().equals("Vidhraswattha")||
//                                    source.getEditText().getText().toString().equals("Vidya Nagar")||
//                                    source.getEditText().getText().toString().equals("Vidyapatinagar")||
//                                    source.getEditText().getText().toString().equals("Vidyasagar")||
//                                    source.getEditText().getText().toString().equals("Vidyavihar")||
//                                    source.getEditText().getText().toString().equals("Vijapur")||
//                                    source.getEditText().getText().toString().equals("Vijayamangalam")||
//                                    source.getEditText().getText().toString().equals("Vijianagar")||
//                                    source.getEditText().getText().toString().equals("Vijayawada Junction")||
//                                    source.getEditText().getText().toString().equals("Vijaypur Jammu")||
//                                    source.getEditText().getText().toString().equals("Vijpadi Road")||
//                                    source.getEditText().getText().toString().equals("Vikarabad Junction")||
//                                    source.getEditText().getText().toString().equals("Vikhran")||
//                                    source.getEditText().getText().toString().equals("Vikhroli")||
//                                    source.getEditText().getText().toString().equals("Vikramgarh Alot")||
//                                    source.getEditText().getText().toString().equals("Vikramnagar")||
//                                    source.getEditText().getText().toString().equals("Vikravandi")||
//                                    source.getEditText().getText().toString().equals("Vilad")||
//                                    source.getEditText().getText().toString().equals("Vilavade")||
//                                    source.getEditText().getText().toString().equals("Vialayatkalan Road")||
//                                    source.getEditText().getText().toString().equals("Ville Parle")||
//                                    source.getEditText().getText().toString().equals("Vilegaon")||
//                                    source.getEditText().getText().toString().equals("Villianur")||
//                                    source.getEditText().getText().toString().equals("Villivakkam")||
//                                    source.getEditText().getText().toString().equals("Villiyambakkam")||
//                                    source.getEditText().getText().toString().equals("Viluppuram Junction")||
//                                    source.getEditText().getText().toString().equals("Vindhyachal")||
//                                    source.getEditText().getText().toString().equals("Vinhere")||
//                                    source.getEditText().getText().toString().equals("Vinnamangalam")||
//                                    source.getEditText().getText().toString().equals("Vinukonda")||
//                                    source.getEditText().getText().toString().equals("Viramdad")||
//                                    source.getEditText().getText().toString().equals("Viramgam Junction")||
//                                    source.getEditText().getText().toString().equals("Virani Alur")||
//                                    source.getEditText().getText().toString().equals("Virapandy Road")||
//                                    source.getEditText().getText().toString().equals("Viraput")||
//                                    source.getEditText().getText().toString().equals("Virar")||
//                                    source.getEditText().getText().toString().equals("Virarakkiyam")||
//                                    source.getEditText().getText().toString().equals("Viravada")||
//                                    source.getEditText().getText().toString().equals("Viravalli")||
//                                    source.getEditText().getText().toString().equals("Viravasaram")||
//                                    source.getEditText().getText().toString().equals("Virbhadra")||
//                                    source.getEditText().getText().toString().equals("Virichipuram")||
//                                    source.getEditText().getText().toString().equals("Virochannagar")||
//                                    source.getEditText().getText().toString().equals("Virol")||
//                                    source.getEditText().getText().toString().equals("Virpur")||
//                                    source.getEditText().getText().toString().equals("Virudunagar Junction")||
//                                    source.getEditText().getText().toString().equals("Virul")||
//                                    source.getEditText().getText().toString().equals("Visakhapatnam")||
//                                    source.getEditText().getText().toString().equals("Visapur")||
//                                    source.getEditText().getText().toString().equals("Visavadar")||
//                                    source.getEditText().getText().toString().equals("Vishnupuram")||
//                                    source.getEditText().getText().toString().equals("Vishrambag")||
//                                    source.getEditText().getText().toString().equals("Vishvamitri")||
//                                    source.getEditText().getText().toString().equals("Visnagar")||
//                                    source.getEditText().getText().toString().equals("Viswanath Chrli")||
//                                    source.getEditText().getText().toString().equals("Vithalwadi")||
//                                    source.getEditText().getText().toString().equals("Viveka Vihar")||
//                                    source.getEditText().getText().toString().equals("Vivekanandpuri Halt")||
//                                    source.getEditText().getText().toString().equals("Vizianagaram Junction")||
//                                    source.getEditText().getText().toString().equals("V. O. C. Nagar railway station")||
//                                    source.getEditText().getText().toString().equals("Vondh")||
//                                    source.getEditText().getText().toString().equals("Vriddhachalam Junction")||
//                                    source.getEditText().getText().toString().equals("Vrindhachalam Town")||
//                                    source.getEditText().getText().toString().equals("Vrindaban Road")||
//                                    source.getEditText().getText().toString().equals("Vyara")||
//                                    source.getEditText().getText().toString().equals("Vyasarpadi Jeeva")||
//                                    source.getEditText().getText().toString().equals("Vyasnagar")||
//                                    source.getEditText().getText().toString().equals("Wadakanchery")||
//                                    source.getEditText().getText().toString().equals("Wadala Road")||
//                                    source.getEditText().getText().toString().equals("Wadegaon")||
//                                    source.getEditText().getText().toString().equals("Wadhwan City")||
//                                    source.getEditText().getText().toString().equals("Wadi Junction")||
//                                    source.getEditText().getText().toString().equals("Wadiaram")||
//                                    source.getEditText().getText().toString().equals("Wadrengdisa")||
//                                    source.getEditText().getText().toString().equals("Wadsa")||
//                                    source.getEditText().getText().toString().equals("Wadsinge")||
//                                    source.getEditText().getText().toString().equals("Wadwal Nagnath")||
//                                    source.getEditText().getText().toString().equals("Waghai")||
//                                    source.getEditText().getText().toString().equals("Waghoda")||
//                                    source.getEditText().getText().toString().equals("Wair")||
//                                    source.getEditText().getText().toString().equals("Walajabad")||
//                                    source.getEditText().getText().toString().equals("Walajah Road")||
//                                    source.getEditText().getText().toString().equals("Walayar")||
//                                    source.getEditText().getText().toString().equals("Wan Road")||
//                                    source.getEditText().getText().toString().equals("Wandal")||
//                                    source.getEditText().getText().toString().equals("Wanderjatana")||
//                                    source.getEditText().getText().toString().equals("Wanegaon")||
//                                    source.getEditText().getText().toString().equals("Wangapalli")||
//                                    source.getEditText().getText().toString().equals("Wani")||
//                                    source.getEditText().getText().toString().equals("Wankaner City")||
//                                    source.getEditText().getText().toString().equals("Wankaner Junction")||
//                                    source.getEditText().getText().toString().equals("Wanparti Road")||
//                                    source.getEditText().getText().toString().equals("Wansjaliya")||
//                                    source.getEditText().getText().toString().equals("Warangal")||
//                                    source.getEditText().getText().toString().equals("Wardha East")||
//                                    source.getEditText().getText().toString().equals("Wardha Junction")||
//                                    source.getEditText().getText().toString().equals("Waria")||
//                                    source.getEditText().getText().toString().equals("Warigaon Newada")||
//                                    source.getEditText().getText().toString().equals("Waris Aleganj")||
//                                    source.getEditText().getText().toString().equals("Warora")||
//                                    source.getEditText().getText().toString().equals("Warud")||
//                                    source.getEditText().getText().toString().equals("Warudkhed")||
//                                    source.getEditText().getText().toString().equals("Wasanapura")||
//                                    source.getEditText().getText().toString().equals("Washermanpet")||
//                                    source.getEditText().getText().toString().equals("Washim")||
//                                    source.getEditText().getText().toString().equals("Washimbe")||
//                                    source.getEditText().getText().toString().equals("Wasud")||
//                                    source.getEditText().getText().toString().equals("Wathar")||
//                                    source.getEditText().getText().toString().equals("Wazerganj")||
//                                    source.getEditText().getText().toString().equals("Wellington")||
//                                    source.getEditText().getText().toString().equals("Wena")||
//                                    source.getEditText().getText().toString().equals("West Hill")||
//                                    source.getEditText().getText().toString().equals("West Mambalam")||
//                                    source.getEditText().getText().toString().equals("Whitefield")||
//                                    source.getEditText().getText().toString().equals("Wihirgaon")||
//                                    source.getEditText().getText().toString().equals("Wimco Nagar")||
//                                    source.getEditText().getText().toString().equals("Wirur")||
//                                    source.getEditText().getText().toString().equals("WRS Colony PH")||
//                                    source.getEditText().getText().toString().equals("Wyndhamganj")||
//                                    source.getEditText().getText().toString().equals("Yadalapur")||
//                                    source.getEditText().getText().toString().equals("Yadgir")||
//                                    source.getEditText().getText().toString().equals("Yadudih")||
//                                    source.getEditText().getText().toString().equals("Yadvendranagar")||
//                                    source.getEditText().getText().toString().equals("Yakutpura")||
//                                    source.getEditText().getText().toString().equals("Yalvigi")||
//                                    source.getEditText().getText().toString().equals("Yamuna Bridge")||
//                                    source.getEditText().getText().toString().equals("Yamuna South Bank")||
//                                    source.getEditText().getText().toString().equals("Yaqutganj")||
//                                    source.getEditText().getText().toString().equals("Yataluru")||
//                                    source.getEditText().getText().toString().equals("Yavatmal")||
//                                    source.getEditText().getText().toString().equals("Yedamangala")||
//                                    source.getEditText().getText().toString().equals("Yedapalli")||
//                                    source.getEditText().getText().toString().equals("Yedakumeri")||
//                                    source.getEditText().getText().toString().equals("Yedshi")||
//                                    source.getEditText().getText().toString().equals("Yelahanka Junction")||
//                                    source.getEditText().getText().toString().equals("Yelgur")||
//                                    source.getEditText().getText().toString().equals("Yeliyur")||
//                                    source.getEditText().getText().toString().equals("Yellakaru")||
//                                    source.getEditText().getText().toString().equals("Yeola")||
//                                    source.getEditText().getText().toString().equals("Yermaras")||
//                                    source.getEditText().getText().toString().equals("Yerpedu")||
//                                    source.getEditText().getText().toString().equals("Yerra Goppa Halt")||
//                                    source.getEditText().getText().toString().equals("Yerraguntla Junction")||
//                                    source.getEditText().getText().toString().equals("Yesvantpur Junction")||
//                                    source.getEditText().getText().toString().equals("Yeulkhed")||
//                                    source.getEditText().getText().toString().equals("Yevat")||
//                                    source.getEditText().getText().toString().equals("Yogendra Dham Halt")||
//                                    source.getEditText().getText().toString().equals("Yusufpur")||
//                                    source.getEditText().getText().toString().equals("Zafarabad Junction")||
//                                    source.getEditText().getText().toString().equals("Zahirabad")||
//                                    source.getEditText().getText().toString().equals("Zamania")||
//                                    source.getEditText().getText().toString().equals("Zampini")||
//                                    source.getEditText().getText().toString().equals("Zantalapalle")||
//                                    source.getEditText().getText().toString().equals("Zankhvav")||
//                                    source.getEditText().getText().toString().equals("Zarap")||
//                                    source.getEditText().getText().toString().equals("Zarpur Pali")||
//                                    source.getEditText().getText().toString().equals("Zawar")||
//                                    source.getEditText().getText().toString().equals("Zindpura")
                    )
                    {
                            // for checking destination stations..............................................................................................................
                            if
                            (
                                            destination.getEditText().getText().toString().equals("Abada")||
                                            destination.getEditText().getText().toString().equals("Abhaipur")||
                                            destination.getEditText().getText().toString().equals("Abhayapuri")||
                                            destination.getEditText().getText().toString().equals("Abohar Junction")||
                                            destination.getEditText().getText().toString().equals("Abu Road")||
                                            destination.getEditText().getText().toString().equals("Abutara Halt")||
                                            destination.getEditText().getText().toString().equals("Acharapakkam")||
                                            destination.getEditText().getText().toString().equals("Acharya Narendra Dev Nagar")||
                                            destination.getEditText().getText().toString().equals("Achalganj")||
                                            destination.getEditText().getText().toString().equals("Achalpur")||
                                            destination.getEditText().getText().toString().equals("Achhalda")||
                                            destination.getEditText().getText().toString().equals("Achhnera Junction")||
                                            destination.getEditText().getText().toString().equals("Adarshnagar")||
                                            destination.getEditText().getText().toString().equals("Adarshnagar Delhi")||
                                            destination.getEditText().getText().toString().equals("Adas Road")||
                                            destination.getEditText().getText().toString().equals("Adesar")||
                                            destination.getEditText().getText().toString().equals("Adgaon Buzurg")||
                                            destination.getEditText().getText().toString().equals("Adilabad")||
                                            destination.getEditText().getText().toString().equals("Adipur Junction")||
                                            destination.getEditText().getText().toString().equals("Adisaptagram")||
                                            destination.getEditText().getText().toString().equals("Adityapur")||
                                            destination.getEditText().getText().toString().equals("Adoni")||
                                            destination.getEditText().getText().toString().equals("Adra Junction")||
                                            destination.getEditText().getText().toString().equals("Aduturai")||
                                            destination.getEditText().getText().toString().equals("Agartala")||
                                            destination.getEditText().getText().toString().equals("Agas")||
                                            destination.getEditText().getText().toString().equals("Agasod")||
                                            destination.getEditText().getText().toString().equals("Aghwanpur")||
                                            destination.getEditText().getText().toString().equals("Agomani")||
                                            destination.getEditText().getText().toString().equals("Agori Khas")||
                                            destination.getEditText().getText().toString().equals("Agra Cantonment")||
                                            destination.getEditText().getText().toString().equals("Agra City")||
                                            destination.getEditText().getText().toString().equals("Agra Fort")||
                                            destination.getEditText().getText().toString().equals("Ahalyapur")||
                                            destination.getEditText().getText().toString().equals("Ahmadgarh")||
                                            destination.getEditText().getText().toString().equals("Ahmednagar")||
                                            destination.getEditText().getText().toString().equals("Ahmadpur Junction")||
                                            destination.getEditText().getText().toString().equals("Ahmedabad Junction")||
                                            destination.getEditText().getText().toString().equals("Ahraura Road")||
                                            destination.getEditText().getText().toString().equals("Airoli")||
                                            destination.getEditText().getText().toString().equals("Aishbagh")||
                                            destination.getEditText().getText().toString().equals("Ait")||
                                            destination.getEditText().getText().toString().equals("Aithal")||
                                            destination.getEditText().getText().toString().equals("Ajaibpur")||
                                            destination.getEditText().getText().toString().equals("Ajanti")||
                                            destination.getEditText().getText().toString().equals("Ajaraka")||
                                            destination.getEditText().getText().toString().equals("Ajgain")||
                                            destination.getEditText().getText().toString().equals("Ajhai")||
                                            destination.getEditText().getText().toString().equals("Ajit")||
                                            destination.getEditText().getText().toString().equals("Ajmer Junction")||
                                            destination.getEditText().getText().toString().equals("Ajni")||
                                            destination.getEditText().getText().toString().equals("Akalkot Road")||
                                            destination.getEditText().getText().toString().equals("Akaltara")||
                                            destination.getEditText().getText().toString().equals("Akanapet")||
                                            destination.getEditText().getText().toString().equals("Akbarganj")||
                                            destination.getEditText().getText().toString().equals("Akbarpur Junction")||
                                            destination.getEditText().getText().toString().equals("Akividu")||
                                            destination.getEditText().getText().toString().equals("Akodia")||
                                            destination.getEditText().getText().toString().equals("Akola Junction")||
                                            destination.getEditText().getText().toString().equals("Akolner")||
                                            destination.getEditText().getText().toString().equals("Akona")||
                                            destination.getEditText().getText().toString().equals("Akot")||
                                            destination.getEditText().getText().toString().equals("Akurdi")||
                                            destination.getEditText().getText().toString().equals("Alamnagar")||
                                            destination.getEditText().getText().toString().equals("Aler")||
                                            destination.getEditText().getText().toString().equals("Algapur")||
                                            destination.getEditText().getText().toString().equals("Algawan")||
                                            destination.getEditText().getText().toString().equals("Alia Bada")||
                                            destination.getEditText().getText().toString().equals("Aligarh Junction")||
                                            destination.getEditText().getText().toString().equals("Alipurduar")||
                                            destination.getEditText().getText().toString().equals("Alipurduar Junction")||
                                            destination.getEditText().getText().toString().equals("Alirajpur")||
                                            destination.getEditText().getText().toString().equals("Allahabad City")||
                                            destination.getEditText().getText().toString().equals("Allahabad Junction")||
                                            destination.getEditText().getText().toString().equals("Alappuzha")||
                                            destination.getEditText().getText().toString().equals("Almatti")||
                                            destination.getEditText().getText().toString().equals("Alnavar Junction")||
                                            destination.getEditText().getText().toString().equals("Alniya")||
                                            destination.getEditText().getText().toString().equals("Aluabari Road Junction")||
                                            destination.getEditText().getText().toString().equals("Alwar Junction")||
                                            destination.getEditText().getText().toString().equals("Aluva")||
                                            destination.getEditText().getText().toString().equals("Amalner")||
                                            destination.getEditText().getText().toString().equals("Amalsad")||
                                            destination.getEditText().getText().toString().equals("Aman Vadi")||
                                            destination.getEditText().getText().toString().equals("Amarpura")||
                                            destination.getEditText().getText().toString().equals("Amausi")||
                                            destination.getEditText().getText().toString().equals("Amb Andaura")||
                                            destination.getEditText().getText().toString().equals("Ambagaon")||
                                            destination.getEditText().getText().toString().equals("Ambala Cantonment")||
                                            destination.getEditText().getText().toString().equals("Ambala City")||
                                            destination.getEditText().getText().toString().equals("Ambalappuzha")||
                                            destination.getEditText().getText().toString().equals("Ambale")||
                                            destination.getEditText().getText().toString().equals("Ambari")||
                                            destination.getEditText().getText().toString().equals("Ambari Falakata")||
                                            destination.getEditText().getText().toString().equals("Ambarnath")||
                                            destination.getEditText().getText().toString().equals("Ambassa")||
                                            destination.getEditText().getText().toString().equals("Ambasamudram")||
                                            destination.getEditText().getText().toString().equals("Ambattur")||
                                            destination.getEditText().getText().toString().equals("Ambaturai")||
                                            destination.getEditText().getText().toString().equals("Ambiapur")||
                                            destination.getEditText().getText().toString().equals("Ambika Kalna")||
                                            destination.getEditText().getText().toString().equals("Ambikapur")||
                                            destination.getEditText().getText().toString().equals("Ambikeshwar")||
                                            destination.getEditText().getText().toString().equals("Ambivli")||
                                            destination.getEditText().getText().toString().equals("Ambli Road")||
                                            destination.getEditText().getText().toString().equals("Ambliyasan Junction")||
                                            destination.getEditText().getText().toString().equals("Ambodala")||
                                            destination.getEditText().getText().toString().equals("Ambur")||
                                            destination.getEditText().getText().toString().equals("Amethi")||
                                            destination.getEditText().getText().toString().equals("Amgaon")||
                                            destination.getEditText().getText().toString().equals("Amguri")||
                                            destination.getEditText().getText().toString().equals("Amla Junction")||
                                            destination.getEditText().getText().toString().equals("Amlai")||
                                            destination.getEditText().getText().toString().equals("Amlakhurd")||
                                            destination.getEditText().getText().toString().equals("Amli")||
                                            destination.getEditText().getText().toString().equals("Ammasandra")||
                                            destination.getEditText().getText().toString().equals("Amoni")||
                                            destination.getEditText().getText().toString().equals("Amravati")||
                                            destination.getEditText().getText().toString().equals("Amreli")||
                                            destination.getEditText().getText().toString().equals("Amritsar Junction")||
                                            destination.getEditText().getText().toString().equals("Amritvel")||
                                            destination.getEditText().getText().toString().equals("Amroha")||
                                            destination.getEditText().getText().toString().equals("Anakapalle")||
                                            destination.getEditText().getText().toString().equals("Anand Junction")||
                                            destination.getEditText().getText().toString().equals("Anand Nagar Junction")||
                                            destination.getEditText().getText().toString().equals("Anand Vihar")||
                                            destination.getEditText().getText().toString().equals("Anandpur Sahib")||
                                            destination.getEditText().getText().toString().equals("Anandtandavpur")||
                                            destination.getEditText().getText().toString().equals("Anantapur")||
                                            destination.getEditText().getText().toString().equals("Anantnag")||
                                            destination.getEditText().getText().toString().equals("Anaparti")||
                                            destination.getEditText().getText().toString().equals("Anara")||
                                            destination.getEditText().getText().toString().equals("Anas")||
                                            destination.getEditText().getText().toString().equals("Andal Junction")||
                                            destination.getEditText().getText().toString().equals("Andheri")||
                                            destination.getEditText().getText().toString().equals("Angadippuram")||
                                            destination.getEditText().getText().toString().equals("Angamaly")||
                                            destination.getEditText().getText().toString().equals("Angar")||
                                            destination.getEditText().getText().toString().equals("Angul")||
                                            destination.getEditText().getText().toString().equals("Anipur")||
                                            destination.getEditText().getText().toString().equals("Anjangaon")||
                                            destination.getEditText().getText().toString().equals("Anjani")||
                                            destination.getEditText().getText().toString().equals("Anjar")||
                                            destination.getEditText().getText().toString().equals("Anjhi Shahabad")||
                                            destination.getEditText().getText().toString().equals("Ankai Killa")||
                                            destination.getEditText().getText().toString().equals("Ankleshwar Junction")||
                                            destination.getEditText().getText().toString().equals("Ankleshwar Udyognagar")||
                                            destination.getEditText().getText().toString().equals("Ankola")||
                                            destination.getEditText().getText().toString().equals("Annanur")||
                                            destination.getEditText().getText().toString().equals("Annavaram")||
                                            destination.getEditText().getText().toString().equals("Annigeri")||
                                            destination.getEditText().getText().toString().equals("Anpara")||
                                            destination.getEditText().getText().toString().equals("Antah")||
                                            destination.getEditText().getText().toString().equals("Antu")||
                                            destination.getEditText().getText().toString().equals("Anugraha Narayan Road")||
                                            destination.getEditText().getText().toString().equals("Anupgarh")||
                                            destination.getEditText().getText().toString().equals("Anuppur Junction")||
                                            destination.getEditText().getText().toString().equals("Anupshahr")||
                                            destination.getEditText().getText().toString().equals("Aonla")||
                                            destination.getEditText().getText().toString().equals("Ara Junction")||
                                            destination.getEditText().getText().toString().equals("Arabagatta H")||
                                            destination.getEditText().getText().toString().equals("Arakkonam Junction")||
                                            destination.getEditText().getText().toString().equals("Araku")||
                                            destination.getEditText().getText().toString().equals("Aralvaymozhi")||
                                            destination.getEditText().getText().toString().equals("Arariya")||
                                            destination.getEditText().getText().toString().equals("Arariya Court")||
                                            destination.getEditText().getText().toString().equals("Arasur")||
                                            destination.getEditText().getText().toString().equals("Aravali Road")||
                                            destination.getEditText().getText().toString().equals("Arunachal Junction")||
                                            destination.getEditText().getText().toString().equals("Aravankadu")||
                                            destination.getEditText().getText().toString().equals("Ariyalur")||
                                            destination.getEditText().getText().toString().equals("Argora")||
                                            destination.getEditText().getText().toString().equals("Arjansar")||
                                            destination.getEditText().getText().toString().equals("Arjuni")||
                                            destination.getEditText().getText().toString().equals("Arnetha")||
                                            destination.getEditText().getText().toString().equals("Arni Road")||
                                            destination.getEditText().getText().toString().equals("Arsikere Junction")||
                                            destination.getEditText().getText().toString().equals("Aruppukkottai")||
                                            destination.getEditText().getText().toString().equals("Arvi")||
                                            destination.getEditText().getText().toString().equals("Aryankavu")||
                                            destination.getEditText().getText().toString().equals("Asafpur")||
                                            destination.getEditText().getText().toString().equals("Asalpur Jobner")||
                                            destination.getEditText().getText().toString().equals("Asangaon")||
                                            destination.getEditText().getText().toString().equals("Asansol Junction")||
                                            destination.getEditText().getText().toString().equals("Asaoti")||
                                            destination.getEditText().getText().toString().equals("Ashoknagar")||
                                            destination.getEditText().getText().toString().equals("Asthal Bohar Junction")||
                                            destination.getEditText().getText().toString().equals("Aslana")||
                                            destination.getEditText().getText().toString().equals("Aslaoda")||
                                            destination.getEditText().getText().toString().equals("Asnoti")||
                                            destination.getEditText().getText().toString().equals("Asokhar")||
                                            destination.getEditText().getText().toString().equals("Asranada")||
                                            destination.getEditText().getText().toString().equals("Attari")||
                                            destination.getEditText().getText().toString().equals("Ataria")||
                                            destination.getEditText().getText().toString().equals("Atarra")||
                                            destination.getEditText().getText().toString().equals("Ateli")||
                                            destination.getEditText().getText().toString().equals("Atgaon")||
                                            destination.getEditText().getText().toString().equals("Athipattu")||
                                            destination.getEditText().getText().toString().equals("Athipattu Pudhunagar")||
                                            destination.getEditText().getText().toString().equals("Atrampur")||
                                            destination.getEditText().getText().toString().equals("Atrauli Road")||
                                            destination.getEditText().getText().toString().equals("Atru")||
                                            destination.getEditText().getText().toString().equals("Attabira")||
                                            destination.getEditText().getText().toString().equals("Attar")||
                                            destination.getEditText().getText().toString().equals("Attur")||
                                            destination.getEditText().getText().toString().equals("Aujari")||
                                            destination.getEditText().getText().toString().equals("Aulenda")||
                                            destination.getEditText().getText().toString().equals("Aunrihar Junction")||
                                            destination.getEditText().getText().toString().equals("Aurangabad")||
                                            destination.getEditText().getText().toString().equals("Auvaneeswarem")||
                                            destination.getEditText().getText().toString().equals("Auwa")||
                                            destination.getEditText().getText().toString().equals("Avadi")||
                                            destination.getEditText().getText().toString().equals("Awantipora")||
                                            destination.getEditText().getText().toString().equals("Ayodhya Junction")||
                                            destination.getEditText().getText().toString().equals("Azamgarh")||
                                            destination.getEditText().getText().toString().equals("Azamnagar Road")||
                                            destination.getEditText().getText().toString().equals("Azara")||
                                            destination.getEditText().getText().toString().equals("Azimganj City")||
                                            destination.getEditText().getText().toString().equals("Azimganj Junction")||
                                            destination.getEditText().getText().toString().equals("Babarpur")||
                                            destination.getEditText().getText().toString().equals("Babatpur")||
                                            destination.getEditText().getText().toString().equals("Bebejia")||
                                            destination.getEditText().getText().toString().equals("Babhnan")||
                                            destination.getEditText().getText().toString().equals("Babina")||
                                            destination.getEditText().getText().toString().equals("Babrala")||
                                            destination.getEditText().getText().toString().equals("Babugarh")||
                                            destination.getEditText().getText().toString().equals("Babupeth")||
                                            destination.getEditText().getText().toString().equals("Bacheli")||
                                            destination.getEditText().getText().toString().equals("Bachhrawan")||
                                            destination.getEditText().getText().toString().equals("Bachwara Junction")||
                                            destination.getEditText().getText().toString().equals("Badmal")||
                                            destination.getEditText().getText().toString().equals("Baad")||
                                            destination.getEditText().getText().toString().equals("Badami")||
                                            destination.getEditText().getText().toString().equals("Badampahar")||
                                            destination.getEditText().getText().toString().equals("Badampudi")||
                                            destination.getEditText().getText().toString().equals("Badurpur Ghat")||
                                            destination.getEditText().getText().toString().equals("Badarpur Junction")||
                                            destination.getEditText().getText().toString().equals("Badausa")||
                                            destination.getEditText().getText().toString().equals("Budgam")||
                                            destination.getEditText().getText().toString().equals("Badhada")||
                                            destination.getEditText().getText().toString().equals("Badhal")||
                                            destination.getEditText().getText().toString().equals("Badlapur")||
                                            destination.getEditText().getText().toString().equals("Badli")||
                                            destination.getEditText().getText().toString().equals("Badnapur")||
                                            destination.getEditText().getText().toString().equals("Badnera Junction")||
                                            destination.getEditText().getText().toString().equals("Badshahnagar")||
                                            destination.getEditText().getText().toString().equals("Badshahpur")||
                                            destination.getEditText().getText().toString().equals("Badwasi")||
                                            destination.getEditText().getText().toString().equals("Bagaha")||
                                            destination.getEditText().getText().toString().equals("Bagalkot")||
                                            destination.getEditText().getText().toString().equals("Bagbahra")||
                                            destination.getEditText().getText().toString().equals("Bagetar")||
                                            destination.getEditText().getText().toString().equals("Bagevadi Rd")||
                                            destination.getEditText().getText().toString().equals("Baghajatin")||
                                            destination.getEditText().getText().toString().equals("Baghauli")||
                                            destination.getEditText().getText().toString().equals("Baghnapara")||
                                            destination.getEditText().getText().toString().equals("Baghora")||
                                            destination.getEditText().getText().toString().equals("Bagra Tawa")||
                                            destination.getEditText().getText().toString().equals("Bagri Nagar")||
                                            destination.getEditText().getText().toString().equals("Bagri Sajjanpur")||
                                            destination.getEditText().getText().toString().equals("Bagula")||
                                            destination.getEditText().getText().toString().equals("Bagwali")||
                                            destination.getEditText().getText().toString().equals("Bahadur Singh Wala")||
                                            destination.getEditText().getText().toString().equals("Bahadurgarh")||
                                            destination.getEditText().getText().toString().equals("Bahadurpur")||
                                            destination.getEditText().getText().toString().equals("Baheri")||
                                            destination.getEditText().getText().toString().equals("Bahilpurwa")||
                                            destination.getEditText().getText().toString().equals("Bahirkhand")||
                                            destination.getEditText().getText().toString().equals("Bahjoi")||
                                            destination.getEditText().getText().toString().equals("Bahraich")||
                                            destination.getEditText().getText().toString().equals("Baidyanathdham")||
                                            destination.getEditText().getText().toString().equals("Baihata Chariali")||
                                            destination.getEditText().getText().toString().equals("Baiguda")||
                                            destination.getEditText().getText().toString().equals("Baijnathpur")||
                                            destination.getEditText().getText().toString().equals("Baikunthpur Rd")||
                                            destination.getEditText().getText().toString().equals("Bainchi / Boinchi")||
                                            destination.getEditText().getText().toString().equals("Bairabi (Bhairabi)")||
                                            destination.getEditText().getText().toString().equals("Bairapur")||
                                            destination.getEditText().getText().toString().equals("Bairgania")||
                                            destination.getEditText().getText().toString().equals("Baitalpur")||
                                            destination.getEditText().getText().toString().equals("Bajalta")||
                                            destination.getEditText().getText().toString().equals("Bajva")||
                                            destination.getEditText().getText().toString().equals("Bakhtiyarpur Junction")||
                                            destination.getEditText().getText().toString().equals("Bakra Road")||
                                            destination.getEditText().getText().toString().equals("Balaghat")||
                                            destination.getEditText().getText().toString().equals("Balamau Junction")||
                                            destination.getEditText().getText().toString().equals("Balangir")||
                                            destination.getEditText().getText().toString().equals("Balasore")||
                                            destination.getEditText().getText().toString().equals("Balauda Takun")||
                                            destination.getEditText().getText().toString().equals("Balawala")||
                                            destination.getEditText().getText().toString().equals("Balawali")||
                                            destination.getEditText().getText().toString().equals("Balharshah")||
                                            destination.getEditText().getText().toString().equals("Baliakheri")||
                                            destination.getEditText().getText().toString().equals("Balikotia")||
                                            destination.getEditText().getText().toString().equals("Balipara")||
                                            destination.getEditText().getText().toString().equals("Ballabhgarh")||
                                            destination.getEditText().getText().toString().equals("Balli railway station")||
                                            destination.getEditText().getText().toString().equals("Ballia")||
                                            destination.getEditText().getText().toString().equals("Ballupur")||
                                            destination.getEditText().getText().toString().equals("Bally")||
                                            destination.getEditText().getText().toString().equals("Ballygunge Junction")||
                                            destination.getEditText().getText().toString().equals("Balrampur")||
                                            destination.getEditText().getText().toString().equals("Balsamand")||
                                            destination.getEditText().getText().toString().equals("Balugan")||
                                            destination.getEditText().getText().toString().equals("Balwa")||
                                            destination.getEditText().getText().toString().equals("Balwara")||
                                            destination.getEditText().getText().toString().equals("Bamangachhi")||
                                            destination.getEditText().getText().toString().equals("Bamanheri")||
                                            destination.getEditText().getText().toString().equals("Bamhni")||
                                            destination.getEditText().getText().toString().equals("Bamhni Banjar")||
                                            destination.getEditText().getText().toString().equals("Bamla")||
                                            destination.getEditText().getText().toString().equals("Bamnia")||
                                            destination.getEditText().getText().toString().equals("Bamsin")||
                                            destination.getEditText().getText().toString().equals("Bamra")||
                                            destination.getEditText().getText().toString().equals("Bamsin")||
                                            destination.getEditText().getText().toString().equals("Bamuni Gaon")||
                                            destination.getEditText().getText().toString().equals("Banahi")||
                                            destination.getEditText().getText().toString().equals("Banapura")||
                                            destination.getEditText().getText().toString().equals("Banar")||
                                            destination.getEditText().getText().toString().equals("Banarhat")||
                                            destination.getEditText().getText().toString().equals("Banas")||
                                            destination.getEditText().getText().toString().equals("Banaswadi")||
                                            destination.getEditText().getText().toString().equals("Banasandra")||
                                            destination.getEditText().getText().toString().equals("Banbasa")||
                                            destination.getEditText().getText().toString().equals("Banda Junction")||
                                            destination.getEditText().getText().toString().equals("Bandakpur")||
                                            destination.getEditText().getText().toString().equals("Bandanwara")||
                                            destination.getEditText().getText().toString().equals("Bandarkhal")||
                                            destination.getEditText().getText().toString().equals("Bandel Junction")||
                                            destination.getEditText().getText().toString().equals("Bandh Bareta")||
                                            destination.getEditText().getText().toString().equals("Bandikui Junction")||
                                            destination.getEditText().getText().toString().equals("Bandra")||
                                            destination.getEditText().getText().toString().equals("Bandra Terminus")||
                                            destination.getEditText().getText().toString().equals("Bengaluru Cantonment")||
                                            destination.getEditText().getText().toString().equals("Bengaluru City Junction (Krantivira Sangolli Rayanna)")||
                                            destination.getEditText().getText().toString().equals("Bengaluru East")||
                                            destination.getEditText().getText().toString().equals("Bangarapet")||
                                            destination.getEditText().getText().toString().equals("Bangarapet")||
                                            destination.getEditText().getText().toString().equals("Bangrod")||
                                            destination.getEditText().getText().toString().equals("Bani")||
                                            destination.getEditText().getText().toString().equals("Banihal")||
                                            destination.getEditText().getText().toString().equals("Baniya Sanda DH")||
                                            destination.getEditText().getText().toString().equals("Bankata")||
                                            destination.getEditText().getText().toString().equals("Bankura")||
                                            destination.getEditText().getText().toString().equals("Bankura")||
                                            destination.getEditText().getText().toString().equals("Banmankhi Junction")||
                                            destination.getEditText().getText().toString().equals("Banmor")||
                                            destination.getEditText().getText().toString().equals("Bansdih Road")||
                                            destination.getEditText().getText().toString().equals("Banshlai Bridge")||
                                            destination.getEditText().getText().toString().equals("Bansi Paharpur")||
                                            destination.getEditText().getText().toString().equals("Bansipur")||
                                            destination.getEditText().getText().toString().equals("Banasthali Niwai")||
                                            destination.getEditText().getText().toString().equals("Banta Raghunathgarh")||
                                            destination.getEditText().getText().toString().equals("Bantawala")||
                                            destination.getEditText().getText().toString().equals("Banthra")||
                                            destination.getEditText().getText().toString().equals("Banwali")||
                                            destination.getEditText().getText().toString().equals("Baori Thikria")||
                                            destination.getEditText().getText().toString().equals("Bapatla")||
                                            destination.getEditText().getText().toString().equals("Bar")||
                                            destination.getEditText().getText().toString().equals("Bara Jamda")||
                                            destination.getEditText().getText().toString().equals("Barabanki Junction")||
                                            destination.getEditText().getText().toString().equals("Barabhum")||
                                            destination.getEditText().getText().toString().equals("Barbil")||
                                            destination.getEditText().getText().toString().equals("Baradwar")||
                                            destination.getEditText().getText().toString().equals("Baragaon")||
                                            destination.getEditText().getText().toString().equals("Barahu")||
                                            destination.getEditText().getText().toString().equals("Baraigram Junction")||
                                            destination.getEditText().getText().toString().equals("Barakar")||
                                            destination.getEditText().getText().toString().equals("Baral")||
                                            destination.getEditText().getText().toString().equals("Baramati")||
                                            destination.getEditText().getText().toString().equals("Baramula")||
                                            destination.getEditText().getText().toString().equals("Baran")||
                                            destination.getEditText().getText().toString().equals("Baranagar")||
                                            destination.getEditText().getText().toString().equals("Barara")||
                                            destination.getEditText().getText().toString().equals("Barasat Junction")||
                                            destination.getEditText().getText().toString().equals("Baraut")||
                                            destination.getEditText().getText().toString().equals("Barauni Junction")||
                                            destination.getEditText().getText().toString().equals("Barbatpur")||
                                            destination.getEditText().getText().toString().equals("Barchi Road")||
                                            destination.getEditText().getText().toString().equals("Barddhaman Junction")||
                                            destination.getEditText().getText().toString().equals("Bardoli")||
                                            destination.getEditText().getText().toString().equals("Bareilly")||
                                            destination.getEditText().getText().toString().equals("Bareilly")||
                                            destination.getEditText().getText().toString().equals("Bareilly Cantt")||
                                            destination.getEditText().getText().toString().equals("Barejadi")||
                                            destination.getEditText().getText().toString().equals("Bareta")||
                                            destination.getEditText().getText().toString().equals("Bareth")||
                                            destination.getEditText().getText().toString().equals("Bargarh Road")||
                                            destination.getEditText().getText().toString().equals("Bargawan")||
                                            destination.getEditText().getText().toString().equals("Barh")||
                                            destination.getEditText().getText().toString().equals("Barhan Junction")||
                                            destination.getEditText().getText().toString().equals("Barharwa Junction")||
                                            destination.getEditText().getText().toString().equals("Barhiya")||
                                            destination.getEditText().getText().toString().equals("Barhni")||
                                            destination.getEditText().getText().toString().equals("Bari Brahman")||
                                            destination.getEditText().getText().toString().equals("Bariarpur")||
                                            destination.getEditText().getText().toString().equals("Barkakana")||
                                            destination.getEditText().getText().toString().equals("Barkur")||
                                            destination.getEditText().getText().toString().equals("Barlai")||
                                            destination.getEditText().getText().toString().equals("Barmer")||
                                            destination.getEditText().getText().toString().equals("Barnagar")||
                                            destination.getEditText().getText().toString().equals("Barnala")||
                                            destination.getEditText().getText().toString().equals("Barog")||
                                            destination.getEditText().getText().toString().equals("Barpali")||
                                            destination.getEditText().getText().toString().equals("Barpeta Road")||
                                            destination.getEditText().getText().toString().equals("Barrackpore")||
                                            destination.getEditText().getText().toString().equals("Barsathi")||
                                            destination.getEditText().getText().toString().equals("Barsi Takli")||
                                            destination.getEditText().getText().toString().equals("Barsi Town")||
                                            destination.getEditText().getText().toString().equals("Barsoi Junction")||
                                            destination.getEditText().getText().toString().equals("Barsola")||
                                            destination.getEditText().getText().toString().equals("Barsuan")||
                                            destination.getEditText().getText().toString().equals("Bartara")||
                                            destination.getEditText().getText().toString().equals("Baruva")||
                                            destination.getEditText().getText().toString().equals("Baruipur Junction")||
                                            destination.getEditText().getText().toString().equals("Barwa Sagar")||
                                            destination.getEditText().getText().toString().equals("Barwadih Junction")||
                                            destination.getEditText().getText().toString().equals("Barwaha")||
                                            destination.getEditText().getText().toString().equals("Barya Ram")||
                                            destination.getEditText().getText().toString().equals("Basai")||
                                            destination.getEditText().getText().toString().equals("Basantar Block Hut")||
                                            destination.getEditText().getText().toString().equals("Basar")||
                                            destination.getEditText().getText().toString().equals("Basbari")||
                                            destination.getEditText().getText().toString().equals("Basharatganj")||
                                            destination.getEditText().getText().toString().equals("Basi Kiratpur")||
                                            destination.getEditText().getText().toString().equals("Basin Bridge")||
                                            destination.getEditText().getText().toString().equals("Basmat")||
                                            destination.getEditText().getText().toString().equals("Basni")||
                                            destination.getEditText().getText().toString().equals("Bassi Pathana")||
                                            destination.getEditText().getText().toString().equals("Basta")||
                                            destination.getEditText().getText().toString().equals("Basti")||
                                            destination.getEditText().getText().toString().equals("Basugaon")||
                                            destination.getEditText().getText().toString().equals("Baswa")||
                                            destination.getEditText().getText().toString().equals("Batadrowa Road")||
                                            destination.getEditText().getText().toString().equals("Batala Junction")||
                                            destination.getEditText().getText().toString().equals("Bathinda Cantonment")||
                                            destination.getEditText().getText().toString().equals("Bathinda Junction")||
                                            destination.getEditText().getText().toString().equals("Batuva")||
                                            destination.getEditText().getText().toString().equals("Bavla")||
                                            destination.getEditText().getText().toString().equals("Bawal")||
                                            destination.getEditText().getText().toString().equals("Bawani Khera")||
                                            destination.getEditText().getText().toString().equals("Bayana Junction")||
                                            destination.getEditText().getText().toString().equals("Baytu")||
                                            destination.getEditText().getText().toString().equals("Bazida Jatan")||
                                            destination.getEditText().getText().toString().equals("Bazpur")||
                                            destination.getEditText().getText().toString().equals("Bazurghat")||
                                            destination.getEditText().getText().toString().equals("Beas Junction")||
                                            destination.getEditText().getText().toString().equals("Beawar")||
                                            destination.getEditText().getText().toString().equals("Begunkodor")||
                                            destination.getEditText().getText().toString().equals("Bedetti")||
                                            destination.getEditText().getText().toString().equals("Begampet")||
                                            destination.getEditText().getText().toString().equals("Begu Sarai")||
                                            destination.getEditText().getText().toString().equals("Behtagokul")||
                                            destination.getEditText().getText().toString().equals("Behula")||
                                            destination.getEditText().getText().toString().equals("Bejnal")||
                                            destination.getEditText().getText().toString().equals("Bela Tal")||
                                            destination.getEditText().getText().toString().equals("Belampalli")||
                                            destination.getEditText().getText().toString().equals("Belandur Road")||
                                            destination.getEditText().getText().toString().equals("Belapur")||
                                            destination.getEditText().getText().toString().equals("Belgahna")||
                                            destination.getEditText().getText().toString().equals("Belgharia")||
                                            destination.getEditText().getText().toString().equals("Belgaum")||
                                            destination.getEditText().getText().toString().equals("Belha")||
                                            destination.getEditText().getText().toString().equals("Bellary Junction")||
                                            destination.getEditText().getText().toString().equals("Bellary Cantonment railway station")||
                                            destination.getEditText().getText().toString().equals("Belpahar")||
                                            destination.getEditText().getText().toString().equals("Belrayan")||
                                            destination.getEditText().getText().toString().equals("Belsiri")||
                                            destination.getEditText().getText().toString().equals("Belthara Road")||
                                            destination.getEditText().getText().toString().equals("Belur")||
                                            destination.getEditText().getText().toString().equals("Belvandi")||
                                            destination.getEditText().getText().toString().equals("Beohari")||
                                            destination.getEditText().getText().toString().equals("Berchha")||
                                            destination.getEditText().getText().toString().equals("Berhampore Court")||
                                            destination.getEditText().getText().toString().equals("Brahmapur")||
                                            destination.getEditText().getText().toString().equals("Besroli")||
                                            destination.getEditText().getText().toString().equals("Betavad")||
                                            destination.getEditText().getText().toString().equals("Bettiah")||
                                            destination.getEditText().getText().toString().equals("Bethamcherla")||
                                            destination.getEditText().getText().toString().equals("Betul")||
                                            destination.getEditText().getText().toString().equals("Bhabhar")||
                                            destination.getEditText().getText().toString().equals("Bhabua Road")||
                                            destination.getEditText().getText().toString().equals("Bhachau")||
                                            destination.getEditText().getText().toString().equals("Bhachau BG")||
                                            destination.getEditText().getText().toString().equals("Bhadan")||
                                            destination.getEditText().getText().toString().equals("Bhadaura")||
                                            destination.getEditText().getText().toString().equals("Bhadbhadaghat")||
                                            destination.getEditText().getText().toString().equals("Bhadli")||
                                            destination.getEditText().getText().toString().equals("Bhadohi")||
                                            destination.getEditText().getText().toString().equals("Bhadra")||
                                            destination.getEditText().getText().toString().equals("Bhadrachalam Road")||
                                            destination.getEditText().getText().toString().equals("Bhadrak")||
                                            destination.getEditText().getText().toString().equals("Bhadran")||
                                            destination.getEditText().getText().toString().equals("Bhadravati")||
                                            destination.getEditText().getText().toString().equals("Bhadroli")||
                                            destination.getEditText().getText().toString().equals("Bhaga Junction")||
                                            destination.getEditText().getText().toString().equals("Bhagalpur")||
                                            destination.getEditText().getText().toString().equals("Bhagat Ki Kothi")||
                                            destination.getEditText().getText().toString().equals("Bhagega")||
                                            destination.getEditText().getText().toString().equals("Bhagtanwala")
//                                            destination.getEditText().getText().toString().equals("Bhagwanpur")||
//                                            destination.getEditText().getText().toString().equals("Bhagwanpura")||
//                                            destination.getEditText().getText().toString().equals("Bhaini Khurd")||
//                                            destination.getEditText().getText().toString().equals("Bhairongarh")||
//                                            destination.getEditText().getText().toString().equals("Bhakti Nagar")||
//                                            destination.getEditText().getText().toString().equals("Bhalki")||
//                                            destination.getEditText().getText().toString().equals("Bhalumaska")||
//                                            destination.getEditText().getText().toString().equals("Bhanapur")||
//                                            destination.getEditText().getText().toString().equals("Bhandak")||
//                                            destination.getEditText().getText().toString().equals("Bhandara Road")||
//                                            destination.getEditText().getText().toString().equals("Bhandup")||
//                                            destination.getEditText().getText().toString().equals("Bhanga")||
//                                            destination.getEditText().getText().toString().equals("Bhankoda")||
//                                            destination.getEditText().getText().toString().equals("Bharat Kup")||
//                                            destination.getEditText().getText().toString().equals("Bharatkund")||
//                                            destination.getEditText().getText().toString().equals("Bharatpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Bharatwada")||
//                                            destination.getEditText().getText().toString().equals("Bharoli Junction")||
//                                            destination.getEditText().getText().toString().equals("Bharthana")||
//                                            destination.getEditText().getText().toString().equals("Bharuch Junction")||
//                                            destination.getEditText().getText().toString().equals("Bharwa Sumerpur")||
//                                            destination.getEditText().getText().toString().equals("Bharwari")||
//                                            destination.getEditText().getText().toString().equals("Bhatel")||
//                                            destination.getEditText().getText().toString().equals("Bhatgaon")||
//                                            destination.getEditText().getText().toString().equals("Bhatiya")||
//                                            destination.getEditText().getText().toString().equals("Bhatkal")||
//                                            destination.getEditText().getText().toString().equals("Bhatni Junction")||
//                                            destination.getEditText().getText().toString().equals("Bhaton Ki Gali")||
//                                            destination.getEditText().getText().toString().equals("Bhatpar Rani")||
//                                            destination.getEditText().getText().toString().equals("Bhatpur")||
//                                            destination.getEditText().getText().toString().equals("Bhattu")||
//                                            destination.getEditText().getText().toString().equals("Bhaunra")||
//                                            destination.getEditText().getText().toString().equals("Bhavnagar Para railway station")||
//                                            destination.getEditText().getText().toString().equals("Bhavani Nagar")||
//                                            destination.getEditText().getText().toString().equals("Bhavnagar Terminus railway station")||
//                                            destination.getEditText().getText().toString().equals("Bhawani Mandi")||
//                                            destination.getEditText().getText().toString().equals("Bhawanipatna")||
//                                            destination.getEditText().getText().toString().equals("Bhawanipur Kalan")||
//                                            destination.getEditText().getText().toString().equals("Bhayandar")||
//                                            destination.getEditText().getText().toString().equals("Bhayavadar")||
//                                            destination.getEditText().getText().toString().equals("Bheempura")||
//                                            destination.getEditText().getText().toString().equals("Bheerpur")||
//                                            destination.getEditText().getText().toString().equals("Bhemswadi")||
//                                            destination.getEditText().getText().toString().equals("Bheraghat")||
//                                            destination.getEditText().getText().toString().equals("Bhesana")||
//                                            destination.getEditText().getText().toString().equals("Bhigwan")||
//                                            destination.getEditText().getText().toString().equals("Bhilad")||
//                                            destination.getEditText().getText().toString().equals("Bhilai Power House")||
//                                            destination.getEditText().getText().toString().equals("Bhilainagar")||
//                                            destination.getEditText().getText().toString().equals("Bhilavdi")||
//                                            destination.getEditText().getText().toString().equals("Bhildi")||
//                                            destination.getEditText().getText().toString().equals("Bhilwara")||
//                                            destination.getEditText().getText().toString().equals("Bhimal")||
//                                            destination.getEditText().getText().toString().equals("Bhimana")||
//                                            destination.getEditText().getText().toString().equals("Bhimarlai")||
//                                            destination.getEditText().getText().toString().equals("Bhimasar")||
//                                            destination.getEditText().getText().toString().equals("Bhimavaram Junction")||
//                                            destination.getEditText().getText().toString().equals("Bhimavaram Town")||
//                                            destination.getEditText().getText().toString().equals("Bhimnath")||
//                                            destination.getEditText().getText().toString().equals("Bhimsen")||
//                                            destination.getEditText().getText().toString().equals("Bhind")||
//                                            destination.getEditText().getText().toString().equals("Bhinwaliya")||
//                                            destination.getEditText().getText().toString().equals("Bhitaura")||
//                                            destination.getEditText().getText().toString().equals("Bhivpuri Road")||
//                                            destination.getEditText().getText().toString().equals("Bhiwandi")||
//                                            destination.getEditText().getText().toString().equals("Bhiwani")||
//                                            destination.getEditText().getText().toString().equals("Bhiwani City")||
//                                            destination.getEditText().getText().toString().equals("Bhodwal Majri")||
//                                            destination.getEditText().getText().toString().equals("Bhogpur Sirwal")||
//                                            destination.getEditText().getText().toString().equals("Bhojipura Junction")||
//                                            destination.getEditText().getText().toString().equals("Bhojo")||
//                                            destination.getEditText().getText().toString().equals("Bhojras")||
//                                            destination.getEditText().getText().toString().equals("Bhojudih Junction")||
//                                            destination.getEditText().getText().toString().equals("Bhoke")||
//                                            destination.getEditText().getText().toString().equals("Bhone")||
//                                            destination.getEditText().getText().toString().equals("Bhongaon")||
//                                            destination.getEditText().getText().toString().equals("Bhongir")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Bairagarh")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Dewanganj")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Habibganj")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Junction")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Mandideep")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Misrod")||
//                                            destination.getEditText().getText().toString().equals("Bhopal Nishatpura")||
//                                            destination.getEditText().getText().toString().equals("Bhubaneswar")||
//                                            destination.getEditText().getText().toString().equals("Bhuj")||
//                                            destination.getEditText().getText().toString().equals("Bhupalsagar")||
//                                            destination.getEditText().getText().toString().equals("Bhupia Mau")||
//                                            destination.getEditText().getText().toString().equals("Bhusaval Junction")||
//                                            destination.getEditText().getText().toString().equals("Bhutakia Bhimsa")||
//                                            destination.getEditText().getText().toString().equals("Bhusaval")||
//                                            destination.getEditText().getText().toString().equals("Bibinagar Junction")||
//                                            destination.getEditText().getText().toString().equals("Bichia")||
//                                            destination.getEditText().getText().toString().equals("Bichpuri")||
//                                            destination.getEditText().getText().toString().equals("Bidadi")||
//                                            destination.getEditText().getText().toString().equals("Bidanpur")||
//                                            destination.getEditText().getText().toString().equals("Bidar")||
//                                            destination.getEditText().getText().toString().equals("Bidhan Nagar Road")||
//                                            destination.getEditText().getText().toString().equals("Bidupur")||
//                                            destination.getEditText().getText().toString().equals("Bidyadabri")||
//                                            destination.getEditText().getText().toString().equals("Bighapur")||
//                                            destination.getEditText().getText().toString().equals("Bihara")||
//                                            destination.getEditText().getText().toString().equals("Bihar Sharif")||
//                                            destination.getEditText().getText().toString().equals("Bihiya")||
//                                            destination.getEditText().getText().toString().equals("Bihta")||
//                                            destination.getEditText().getText().toString().equals("Bijainagar")||
//                                            destination.getEditText().getText().toString().equals("Bijapur")||
//                                            destination.getEditText().getText().toString().equals("Bijauli")||
//                                            destination.getEditText().getText().toString().equals("Bijaysota")||
//                                            destination.getEditText().getText().toString().equals("Bijbiara")||
//                                            destination.getEditText().getText().toString().equals("Bijni")||
//                                            destination.getEditText().getText().toString().equals("Bijnor")||
//                                            destination.getEditText().getText().toString().equals("Bijoor")||
//                                            destination.getEditText().getText().toString().equals("Bijora")||
//                                            destination.getEditText().getText().toString().equals("Bijrotha")||
//                                            destination.getEditText().getText().toString().equals("Bijuri")||
//                                            destination.getEditText().getText().toString().equals("Bikaner Junction")||
//                                            destination.getEditText().getText().toString().equals("Bikrampur")||
//                                            destination.getEditText().getText().toString().equals("Bilaspur")||
//                                            destination.getEditText().getText().toString().equals("Bilaspur Road")||
//                                            destination.getEditText().getText().toString().equals("Bildi")||
//                                            destination.getEditText().getText().toString().equals("Bilhar Ghat")||
//                                            destination.getEditText().getText().toString().equals("Bilhaur")||
//                                            destination.getEditText().getText().toString().equals("Bilimora Junction")||
//                                            destination.getEditText().getText().toString().equals("Bilkha")||
//                                            destination.getEditText().getText().toString().equals("Billi")||
//                                            destination.getEditText().getText().toString().equals("Bilpur")||
//                                            destination.getEditText().getText().toString().equals("Bilwai")||
//                                            destination.getEditText().getText().toString().equals("Bina Junction")||
//                                            destination.getEditText().getText().toString().equals("Binaur")||
//                                            destination.getEditText().getText().toString().equals("Bindki Road")||
//                                            destination.getEditText().getText().toString().equals("Binnaguri")||
//                                            destination.getEditText().getText().toString().equals("Bir")||
//                                            destination.getEditText().getText().toString().equals("Biradhwal")||
//                                            destination.getEditText().getText().toString().equals("Birambad")||
//                                            destination.getEditText().getText().toString().equals("Birang Khera")||
//                                            destination.getEditText().getText().toString().equals("Birapatti")||
//                                            destination.getEditText().getText().toString().equals("Birlanagar")||
//                                            destination.getEditText().getText().toString().equals("Birmitrapur")||
//                                            destination.getEditText().getText().toString().equals("Birohe")||
//                                            destination.getEditText().getText().toString().equals("Biroliya")||
//                                            destination.getEditText().getText().toString().equals("Birsinghpur")||
//                                            destination.getEditText().getText().toString().equals("Birur")||
//                                            destination.getEditText().getText().toString().equals("Bisalwas Kalan")||
//                                            destination.getEditText().getText().toString().equals("Bishengarh")||
//                                            destination.getEditText().getText().toString().equals("Bishnathganj")||
//                                            destination.getEditText().getText().toString().equals("Bishnupur")||
//                                            destination.getEditText().getText().toString().equals("Bishrampur")||
//                                            destination.getEditText().getText().toString().equals("Bissam Cuttack")||
//                                            destination.getEditText().getText().toString().equals("Bissau")||
//                                            destination.getEditText().getText().toString().equals("Biswa Bridge")||
//                                            destination.getEditText().getText().toString().equals("Biswan")||
//                                            destination.getEditText().getText().toString().equals("Biyavra")||
//                                            destination.getEditText().getText().toString().equals("Biyavra Rajgarh")||
//                                            destination.getEditText().getText().toString().equals("Bobas")||
//                                            destination.getEditText().getText().toString().equals("Bobbili Junction")||
//                                            destination.getEditText().getText().toString().equals("Bodeli")||
//                                            destination.getEditText().getText().toString().equals("Bodhan")||
//                                            destination.getEditText().getText().toString().equals("Bodwad")||
//                                            destination.getEditText().getText().toString().equals("Boinda")||
//                                            destination.getEditText().getText().toString().equals("Boisar")||
//                                            destination.getEditText().getText().toString().equals("Bokajan")||
//                                            destination.getEditText().getText().toString().equals("Bokaro Steel City")||
//                                            destination.getEditText().getText().toString().equals("Bokaro Thermal")||
//                                            destination.getEditText().getText().toString().equals("Boko")||
//                                            destination.getEditText().getText().toString().equals("Bolai")||
//                                            destination.getEditText().getText().toString().equals("Bolarum")||
//                                            destination.getEditText().getText().toString().equals("Bolda")||
//                                            destination.getEditText().getText().toString().equals("Bolpur — Santiniketan")||
//                                            destination.getEditText().getText().toString().equals("Bommidi")||
//                                            destination.getEditText().getText().toString().equals("Bongaigaon")||
//                                            destination.getEditText().getText().toString().equals("Borawar")||
//                                            destination.getEditText().getText().toString().equals("Bordhal")||
//                                            destination.getEditText().getText().toString().equals("Bordi")||
//                                            destination.getEditText().getText().toString().equals("Bordi Road")||
//                                            destination.getEditText().getText().toString().equals("Borgaon")||
//                                            destination.getEditText().getText().toString().equals("Borivali")||
//                                            destination.getEditText().getText().toString().equals("Borra Guhalu")||
//                                            destination.getEditText().getText().toString().equals("Borvihir")||
//                                            destination.getEditText().getText().toString().equals("Botad Junction")||
//                                            destination.getEditText().getText().toString().equals("Boxirhat")||
//                                            destination.getEditText().getText().toString().equals("Brahmavart")||
//                                            destination.getEditText().getText().toString().equals("Brajarajnagar")||
//                                            destination.getEditText().getText().toString().equals("Brayla Chaurasi")||
//                                            destination.getEditText().getText().toString().equals("Budalur")||
//                                            destination.getEditText().getText().toString().equals("Budaun")||
//                                            destination.getEditText().getText().toString().equals("Budge Budge")||
//                                            destination.getEditText().getText().toString().equals("Budhi")||
//                                            destination.getEditText().getText().toString().equals("Budhlada")||
//                                            destination.getEditText().getText().toString().equals("Budni")||
//                                            destination.getEditText().getText().toString().equals("Bulandshahr")||
//                                            destination.getEditText().getText().toString().equals("Bundi")||
//                                            destination.getEditText().getText().toString().equals("Bundki")||
//                                            destination.getEditText().getText().toString().equals("Burdwan")||
//                                            destination.getEditText().getText().toString().equals("Burhanpur")||
//                                            destination.getEditText().getText().toString().equals("Burhar")||
//                                            destination.getEditText().getText().toString().equals("Burhwal")||
//                                            destination.getEditText().getText().toString().equals("Burnpur")||
//                                            destination.getEditText().getText().toString().equals("Butari")||
//                                            destination.getEditText().getText().toString().equals("Butewala")||
//                                            destination.getEditText().getText().toString().equals("Buxar")||
//                                            destination.getEditText().getText().toString().equals("Byadarahalli")||
//                                            destination.getEditText().getText().toString().equals("Byculla")||
//                                            destination.getEditText().getText().toString().equals("Boridand")||
//                                            destination.getEditText().getText().toString().equals("Barai Jalalpur")||
//                                            destination.getEditText().getText().toString().equals("Bangaon")||
//                                            destination.getEditText().getText().toString().equals("B.B.D. Bag")||
//                                            destination.getEditText().getText().toString().equals("Budge Budge")||
//                                            destination.getEditText().getText().toString().equals("Bamangachi")||
//                                            destination.getEditText().getText().toString().equals("Bira")||
//                                            destination.getEditText().getText().toString().equals("Birati")||
//                                            destination.getEditText().getText().toString().equals("Bibhuti Bhushan Halt")||
//                                            destination.getEditText().getText().toString().equals("Belur")||
//                                            destination.getEditText().getText().toString().equals("Belur Math")||
//                                            destination.getEditText().getText().toString().equals("Bisharpara Kodaliya")||
//                                            destination.getEditText().getText().toString().equals("Baghbazar")||
//                                            destination.getEditText().getText().toString().equals("Burra Bazar")||
//                                            destination.getEditText().getText().toString().equals("Birnagar")||
//                                            destination.getEditText().getText().toString().equals("Beldanga")||
//                                            destination.getEditText().getText().toString().equals("Chatrapur")||
//                                            destination.getEditText().getText().toString().equals("C Shahumaharaj T")||
//                                            destination.getEditText().getText().toString().equals("Kozhikode")||
//                                            destination.getEditText().getText().toString().equals("Canacona railway station")||
//                                            destination.getEditText().getText().toString().equals("Cansaulim railway station")||
//                                            destination.getEditText().getText().toString().equals("Caranzol railway station")||
//                                            destination.getEditText().getText().toString().equals("Kannur")||
//                                            destination.getEditText().getText().toString().equals("Cannanore South")||
//                                            destination.getEditText().getText().toString().equals("Carmelaram (Sarjapur Road, Bangalore)")||
//                                            destination.getEditText().getText().toString().equals("Castle Rock")||
//                                            destination.getEditText().getText().toString().equals("CBD Belapur")||
//                                            destination.getEditText().getText().toString().equals("Chandanathope")||
//                                            destination.getEditText().getText().toString().equals("Chabua")||
//                                            destination.getEditText().getText().toString().equals("Chachaura Bngj")||
//                                            destination.getEditText().getText().toString().equals("Chadotar")||
//                                            destination.getEditText().getText().toString().equals("Chaibasa")||
//                                            destination.getEditText().getText().toString().equals("Chainwa")||
//                                            destination.getEditText().getText().toString().equals("Chajawa")||
//                                            destination.getEditText().getText().toString().equals("Chajli")||
//                                            destination.getEditText().getText().toString().equals("Chak Dayala")||
//                                            destination.getEditText().getText().toString().equals("Chak Rakhwal")||
//                                            destination.getEditText().getText().toString().equals("Chakdaha")||
//                                            destination.getEditText().getText().toString().equals("Chakehri(Kanpur)")||
//                                            destination.getEditText().getText().toString().equals("Chakia")||
//                                            destination.getEditText().getText().toString().equals("Chakradharpur")||
//                                            destination.getEditText().getText().toString().equals("Chakraj Mal")||
//                                            destination.getEditText().getText().toString().equals("Chaksu")||
//                                            destination.getEditText().getText().toString().equals("Chakulia")||
//                                            destination.getEditText().getText().toString().equals("Chalakudy")||
//                                            destination.getEditText().getText().toString().equals("Chalala")||
//                                            destination.getEditText().getText().toString().equals("Chalisgaon Junction")||
//                                            destination.getEditText().getText().toString().equals("Challakere")||
//                                            destination.getEditText().getText().toString().equals("Chalthan")||
//                                            destination.getEditText().getText().toString().equals("Chamagram")||
//                                            destination.getEditText().getText().toString().equals("Chamarajanagar")||
//                                            destination.getEditText().getText().toString().equals("Champa")||
//                                            destination.getEditText().getText().toString().equals("Champaner Rd Junction")||
//                                            destination.getEditText().getText().toString().equals("Chamraura")||
//                                            destination.getEditText().getText().toString().equals("Chand Siau")||
//                                            destination.getEditText().getText().toString().equals("Chanda Fort")||
//                                            destination.getEditText().getText().toString().equals("Chandan Nagar")||
//                                            destination.getEditText().getText().toString().equals("Chandar railway station")||
//                                            destination.getEditText().getText().toString().equals("Chandari(Kanpur)")||
//                                            destination.getEditText().getText().toString().equals("Chandauli Majhwar")||
//                                            destination.getEditText().getText().toString().equals("Chandausi Junction")||
//                                            destination.getEditText().getText().toString().equals("Chandawal")||
//                                            destination.getEditText().getText().toString().equals("Chanderiya")||
//                                            destination.getEditText().getText().toString().equals("Chandi Mandir")||
//                                            destination.getEditText().getText().toString().equals("Chandia Road")||
//                                            destination.getEditText().getText().toString().equals("Chandigarh")||
//                                            destination.getEditText().getText().toString().equals("Chandil Junction")||
//                                            destination.getEditText().getText().toString().equals("Chandiposi")||
//                                            destination.getEditText().getText().toString().equals("Chandisar")||
//                                            destination.getEditText().getText().toString().equals("Chandkhira Bagn")||
//                                            destination.getEditText().getText().toString().equals("Chandlodiya")||
//                                            destination.getEditText().getText().toString().equals("Chandok")||
//                                            destination.getEditText().getText().toString().equals("Chandranathpur")||
//                                            destination.getEditText().getText().toString().equals("Chandrapur")||
//                                            destination.getEditText().getText().toString().equals("Chandrapura")||
//                                            destination.getEditText().getText().toString().equals("Chandresal")||
//                                            destination.getEditText().getText().toString().equals("Chandur")||
//                                            destination.getEditText().getText().toString().equals("Chaneti")||
//                                            destination.getEditText().getText().toString().equals("Changanacheri")||
//                                            destination.getEditText().getText().toString().equals("Changsari")||
//                                            destination.getEditText().getText().toString().equals("Channani")||
//                                            destination.getEditText().getText().toString().equals("Channapatna")||
//                                            destination.getEditText().getText().toString().equals("Chanpatia")||
//                                            destination.getEditText().getText().toString().equals("Chaparmukh Junction")||
//                                            destination.getEditText().getText().toString().equals("Chaprakata")||
//                                            destination.getEditText().getText().toString().equals("Charaud")||
//                                            destination.getEditText().getText().toString().equals("Charbagh")||
//                                            destination.getEditText().getText().toString().equals("Charbatia")||
//                                            destination.getEditText().getText().toString().equals("Charbhuja Road")||
//                                            destination.getEditText().getText().toString().equals("Chargola")||
//                                            destination.getEditText().getText().toString().equals("Charkhari Road")||
//                                            destination.getEditText().getText().toString().equals("Charkhi Dadri")||
//                                            destination.getEditText().getText().toString().equals("Charni Road")||
//                                            destination.getEditText().getText().toString().equals("Charvattur")||
//                                            destination.getEditText().getText().toString().equals("Chata")||
//                                            destination.getEditText().getText().toString().equals("Chau Mahla")||
//                                            destination.getEditText().getText().toString().equals("Chaube")||
//                                            destination.getEditText().getText().toString().equals("Chaukhandi")||
//                                            destination.getEditText().getText().toString().equals("Chaunrah")||
//                                            destination.getEditText().getText().toString().equals("Chaurakheri")||
//                                            destination.getEditText().getText().toString().equals("Chaure Bazar")||
//                                            destination.getEditText().getText().toString().equals("Chauri Chaura")||
//                                            destination.getEditText().getText().toString().equals("Chausa")||
//                                            destination.getEditText().getText().toString().equals("Chautara")||
//                                            destination.getEditText().getText().toString().equals("Chauth Ka Brwra")||
//                                            destination.getEditText().getText().toString().equals("Chavalkhede")||
//                                            destination.getEditText().getText().toString().equals("Chawapall")||
//                                            destination.getEditText().getText().toString().equals("Chaygaon")||
//                                            destination.getEditText().getText().toString().equals("Chemancheri")||
//                                            destination.getEditText().getText().toString().equals("Chembur")||
//                                            destination.getEditText().getText().toString().equals("Chengalpattu")||
//                                            destination.getEditText().getText().toString().equals("Chengannur")||
//                                            destination.getEditText().getText().toString().equals("Chennai Beach")||
//                                            destination.getEditText().getText().toString().equals("Chennai Central railway station")||
//                                            destination.getEditText().getText().toString().equals("Chennai Egmore")||
//                                            destination.getEditText().getText().toString().equals("Chennai Fort")||
//                                            destination.getEditText().getText().toString().equals("Chennai Park")||
//                                            destination.getEditText().getText().toString().equals("Cheriyanad")||
//                                            destination.getEditText().getText().toString().equals("Cherthala")||
//                                            destination.getEditText().getText().toString().equals("Chetar")||
//                                            destination.getEditText().getText().toString().equals("Chettinad")||
//                                            destination.getEditText().getText().toString().equals("Chhabra Gugor")||
//                                            destination.getEditText().getText().toString().equals("Chhan Arorian")||
//                                            destination.getEditText().getText().toString().equals("Chhandrauli")||
//                                            destination.getEditText().getText().toString().equals("Chhansara")||
//                                            destination.getEditText().getText().toString().equals("Chhapi")||
//                                            destination.getEditText().getText().toString().equals("Chhapra")||
//                                            destination.getEditText().getText().toString().equals("Chhapra Kacheri")||
//                                            destination.getEditText().getText().toString().equals("Chharodi")||
//                                            destination.getEditText().getText().toString().equals("Chhatrapati Shivaji Terminus")||
//                                            destination.getEditText().getText().toString().equals("Chhatarpur")||
//                                            destination.getEditText().getText().toString().equals("Chatrapur")||
//                                            destination.getEditText().getText().toString().equals("Chhidgaon")||
//                                            destination.getEditText().getText().toString().equals("Chhina")||
//                                            destination.getEditText().getText().toString().equals("Chhindwara Junction")||
//                                            destination.getEditText().getText().toString().equals("Chhipadohar")||
//                                            destination.getEditText().getText().toString().equals("Chhitauni")||
//                                            destination.getEditText().getText().toString().equals("Chhota Gudha")||
//                                            destination.getEditText().getText().toString().equals("Chhota Udaipur")||
//                                            destination.getEditText().getText().toString().equals("Chhoti Odai")||
//                                            destination.getEditText().getText().toString().equals("Chianki")||
//                                            destination.getEditText().getText().toString().equals("Chidambaram")||
//                                            destination.getEditText().getText().toString().equals("Chiheru")||
//                                            destination.getEditText().getText().toString().equals("Chikballapur")||
//                                            destination.getEditText().getText().toString().equals("Chikkamagaluru")||
//                                            destination.getEditText().getText().toString().equals("Chikalthan")||
//                                            destination.getEditText().getText().toString().equals("Chikjajur Junction")||
//                                            destination.getEditText().getText().toString().equals("Chikni Road")||
//                                            destination.getEditText().getText().toString().equals("Chikodi Road")||
//                                            destination.getEditText().getText().toString().equals("Chilbila Junction")||
//                                            destination.getEditText().getText().toString().equals("Chilka")||
//                                            destination.getEditText().getText().toString().equals("Chilo")||
//                                            destination.getEditText().getText().toString().equals("Chinchli")||
//                                            destination.getEditText().getText().toString().equals("Chinchpada")||
//                                            destination.getEditText().getText().toString().equals("Chinchpokli")||
//                                            destination.getEditText().getText().toString().equals("Chinchwad")||
//                                            destination.getEditText().getText().toString().equals("Chinna Ganjam")||
//                                            destination.getEditText().getText().toString().equals("Chinna Salem")||
//                                            destination.getEditText().getText().toString().equals("Chintamani")||
//                                            destination.getEditText().getText().toString().equals("Chiplun")||
//                                            destination.getEditText().getText().toString().equals("Chipurupalle")||
//                                            destination.getEditText().getText().toString().equals("Chirai")||
//                                            destination.getEditText().getText().toString().equals("Chirala")||
//                                            destination.getEditText().getText().toString().equals("Chirawa")||
//                                            destination.getEditText().getText().toString().equals("Chirayinkil")||
//                                            destination.getEditText().getText().toString().equals("Chirgaon")||
//                                            destination.getEditText().getText().toString().equals("Chirmiri")||
//                                            destination.getEditText().getText().toString().equals("Chit Baragaon")||
//                                            destination.getEditText().getText().toString().equals("Chitahra")||
//                                            destination.getEditText().getText().toString().equals("Chital")||
//                                            destination.getEditText().getText().toString().equals("Chitali")||
//                                            destination.getEditText().getText().toString().equals("Chitradurga")||
//                                            destination.getEditText().getText().toString().equals("Chitrakuta")||
//                                            destination.getEditText().getText().toString().equals("Chitrapur")||
//                                            destination.getEditText().getText().toString().equals("Chitrasani")||
//                                            destination.getEditText().getText().toString().equals("Chitrawad")||
//                                            destination.getEditText().getText().toString().equals("Chitrod")||
//                                            destination.getEditText().getText().toString().equals("Chitapur")||
//                                            destination.getEditText().getText().toString().equals("Chittaranjan")||
//                                            destination.getEditText().getText().toString().equals("Chittaurgarh")||
//                                            destination.getEditText().getText().toString().equals("Chittoor")||
//                                            destination.getEditText().getText().toString().equals("Chodiala")||
//                                            destination.getEditText().getText().toString().equals("Choki Sorath")||
//                                            destination.getEditText().getText().toString().equals("Chola")||
//                                            destination.getEditText().getText().toString().equals("Cholang")||
//                                            destination.getEditText().getText().toString().equals("Chomun Samod")||
//                                            destination.getEditText().getText().toString().equals("Chondi")||
//                                            destination.getEditText().getText().toString().equals("Chopan")||
//                                            destination.getEditText().getText().toString().equals("Choral")||
//                                            destination.getEditText().getText().toString().equals("Chorvad Road")||
//                                            destination.getEditText().getText().toString().equals("Chosla")||
//                                            destination.getEditText().getText().toString().equals("Choti Khatu")||
//                                            destination.getEditText().getText().toString().equals("Chuchura")||
//                                            destination.getEditText().getText().toString().equals("Chuda")||
//                                            destination.getEditText().getText().toString().equals("Chunabhatti")||
//                                            destination.getEditText().getText().toString().equals("Chunar")||
//                                            destination.getEditText().getText().toString().equals("Churchgate")||
//                                            destination.getEditText().getText().toString().equals("Churk")||
//                                            destination.getEditText().getText().toString().equals("Churu")||
//                                            destination.getEditText().getText().toString().equals("Clutterbuckganj")||
//                                            destination.getEditText().getText().toString().equals("Cochin Harbour Terminus")||
//                                            destination.getEditText().getText().toString().equals("Coimbatore Junction")||
//                                            destination.getEditText().getText().toString().equals("Coimbatore North Junction")||
//                                            destination.getEditText().getText().toString().equals("Colonelganj")||
//                                            destination.getEditText().getText().toString().equals("Contai Road")||
//                                            destination.getEditText().getText().toString().equals("Coonoor")||
//                                            destination.getEditText().getText().toString().equals("Cotton Green")||
//                                            destination.getEditText().getText().toString().equals("Cuddalore Junction")||
//                                            destination.getEditText().getText().toString().equals("Cuddalore Port")||
//                                            destination.getEditText().getText().toString().equals("Cuddapah")||
//                                            destination.getEditText().getText().toString().equals("Cumbum")||
//                                            destination.getEditText().getText().toString().equals("Cuttack")||
//                                            destination.getEditText().getText().toString().equals("Currey Road")||
//                                            destination.getEditText().getText().toString().equals("Dabhaura")||
//                                            destination.getEditText().getText().toString().equals("Dabhoi Junction")||
//                                            destination.getEditText().getText().toString().equals("Dabilpur")||
//                                            destination.getEditText().getText().toString().equals("Dabla")||
//                                            destination.getEditText().getText().toString().equals("Dabli Rathan")||
//                                            destination.getEditText().getText().toString().equals("Dabolim railway station")||
//                                            destination.getEditText().getText().toString().equals("Dabra")||
//                                            destination.getEditText().getText().toString().equals("Dabtara")||
//                                            destination.getEditText().getText().toString().equals("Dadar (Western Railway)")||
//                                            destination.getEditText().getText().toString().equals("Dadar (Central Railway)")||
//                                            destination.getEditText().getText().toString().equals("Dadri")||
//                                            destination.getEditText().getText().toString().equals("Dagaon")||
//                                            destination.getEditText().getText().toString().equals("Dagmagpur")||
//                                            destination.getEditText().getText().toString().equals("Dahanu Road")||
//                                            destination.getEditText().getText().toString().equals("Dahar Ka Balaji")||
//                                            destination.getEditText().getText().toString().equals("Dahina Zainabad")||
//                                            destination.getEditText().getText().toString().equals("Dahisar")||
//                                            destination.getEditText().getText().toString().equals("Dahod")||
//                                            destination.getEditText().getText().toString().equals("Dailwara")||
//                                            destination.getEditText().getText().toString().equals("Dakaniya Talav")||
//                                            destination.getEditText().getText().toString().equals("Dakhineswar")||
//                                            destination.getEditText().getText().toString().equals("Dakor")||
//                                            destination.getEditText().getText().toString().equals("Daladi")||
//                                            destination.getEditText().getText().toString().equals("Dalauda")||
//                                            destination.getEditText().getText().toString().equals("Dalelnagar")||
//                                            destination.getEditText().getText().toString().equals("Dalgaon")||
//                                            destination.getEditText().getText().toString().equals("Daliganj")||
//                                            destination.getEditText().getText().toString().equals("Dalhousie Road")||
//                                            destination.getEditText().getText().toString().equals("Dalkhola")||
//                                            destination.getEditText().getText().toString().equals("Dalli-Rajhara")||
//                                            destination.getEditText().getText().toString().equals("Dalmau Junction")||
//                                            destination.getEditText().getText().toString().equals("Dalmera")||
//                                            destination.getEditText().getText().toString().equals("Dalpatpur")||
//                                            destination.getEditText().getText().toString().equals("Dalsingh Sarai")||
//                                            destination.getEditText().getText().toString().equals("Daltonganj")||
//                                            destination.getEditText().getText().toString().equals("Damanjodi")||
//                                            destination.getEditText().getText().toString().equals("Damchara")||
//                                            destination.getEditText().getText().toString().equals("Damnagar")||
//                                            destination.getEditText().getText().toString().equals("Damoh")||
//                                            destination.getEditText().getText().toString().equals("Danapur")||
//                                            destination.getEditText().getText().toString().equals("Dandeli")||
//                                            destination.getEditText().getText().toString().equals("Dandupur")||
//                                            destination.getEditText().getText().toString().equals("Dangoaposi")||
//                                            destination.getEditText().getText().toString().equals("Dangtal")||
//                                            destination.getEditText().getText().toString().equals("Daniyawan Bzr H")||
//                                            destination.getEditText().getText().toString().equals("Dankaur")||
//                                            destination.getEditText().getText().toString().equals("Dankuni")||
//                                            destination.getEditText().getText().toString().equals("Danwar")||
//                                            destination.getEditText().getText().toString().equals("Dapodi")||
//                                            destination.getEditText().getText().toString().equals("Dappar")||
//                                            destination.getEditText().getText().toString().equals("Daotuhaja")||
//                                            destination.getEditText().getText().toString().equals("Dara")||
//                                            destination.getEditText().getText().toString().equals("Daraganj")||
//                                            destination.getEditText().getText().toString().equals("Darbhanga")||
//                                            destination.getEditText().getText().toString().equals("Darjeeling")||
//                                            destination.getEditText().getText().toString().equals("Darritola")||
//                                            destination.getEditText().getText().toString().equals("Daryabad")||
//                                            destination.getEditText().getText().toString().equals("Daryapur")||
//                                            destination.getEditText().getText().toString().equals("Dasna")||
//                                            destination.getEditText().getText().toString().equals("Dasuya")||
//                                            destination.getEditText().getText().toString().equals("Datia")||
//                                            destination.getEditText().getText().toString().equals("Dativali")||
//                                            destination.getEditText().getText().toString().equals("Daudpur")||
//                                            destination.getEditText().getText().toString().equals("Daulatabad")||
//                                            destination.getEditText().getText().toString().equals("Daund Junction")||
//                                            destination.getEditText().getText().toString().equals("Daundaj")||
//                                            destination.getEditText().getText().toString().equals("Daurai")||
//                                            destination.getEditText().getText().toString().equals("Daurala")||
//                                            destination.getEditText().getText().toString().equals("Dauram Madhpura")||
//                                            destination.getEditText().getText().toString().equals("Dausa")||
//                                            destination.getEditText().getText().toString().equals("Dausni")||
//                                            destination.getEditText().getText().toString().equals("Davanagere")||
//                                            destination.getEditText().getText().toString().equals("Dayalpur")||
//                                            destination.getEditText().getText().toString().equals("Debari")||
//                                            destination.getEditText().getText().toString().equals("Debipur")||
//                                            destination.getEditText().getText().toString().equals("Degana Junction")||
//                                            destination.getEditText().getText().toString().equals("Dehradun")||
//                                            destination.getEditText().getText().toString().equals("Dehri On Sone")||
//                                            destination.getEditText().getText().toString().equals("Dehu Road")||
//                                            destination.getEditText().getText().toString().equals("Dekapam")||
//                                            destination.getEditText().getText().toString().equals("Delhi")||
//                                            destination.getEditText().getText().toString().equals("Delhi MG")||
//                                            destination.getEditText().getText().toString().equals("Delhi Azadpur")||
//                                            destination.getEditText().getText().toString().equals("Delhi Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Delhi Kishanganj")||
//                                            destination.getEditText().getText().toString().equals("Sarai Rohilla")||
//                                            destination.getEditText().getText().toString().equals("Delhi Safdarjung")||
//                                            destination.getEditText().getText().toString().equals("Shahdara")||
//                                            destination.getEditText().getText().toString().equals("Delvada")||
//                                            destination.getEditText().getText().toString().equals("Demu")||
//                                            destination.getEditText().getText().toString().equals("Deoband")||
//                                            destination.getEditText().getText().toString().equals("Deogan Road")||
//                                            destination.getEditText().getText().toString().equals("Deoghar Junction")||
//                                            destination.getEditText().getText().toString().equals("Deorakot")||
//                                            destination.getEditText().getText().toString().equals("Deoria Sadar")||
//                                            destination.getEditText().getText().toString().equals("Depalsar")||
//                                            destination.getEditText().getText().toString().equals("Derol")||
//                                            destination.getEditText().getText().toString().equals("Desari")||
//                                            destination.getEditText().getText().toString().equals("Deshalpar")||
//                                            destination.getEditText().getText().toString().equals("Deshnok")||
//                                            destination.getEditText().getText().toString().equals("Deswal")||
//                                            destination.getEditText().getText().toString().equals("Detroj")||
//                                            destination.getEditText().getText().toString().equals("Devakottai Road")||
//                                            destination.getEditText().getText().toString().equals("Devbaloda Charoda")||
//                                            destination.getEditText().getText().toString().equals("Devgam")||
//                                            destination.getEditText().getText().toString().equals("Devgarh Madriya")||
//                                            destination.getEditText().getText().toString().equals("Devlali")||
//                                            destination.getEditText().getText().toString().equals("Devpura")||
//                                            destination.getEditText().getText().toString().equals("Dewalgaon")||
//                                            destination.getEditText().getText().toString().equals("Dewanganj")||
//                                            destination.getEditText().getText().toString().equals("Dewas")||
//                                            destination.getEditText().getText().toString().equals("Dhaban")||
//                                            destination.getEditText().getText().toString().equals("Dhalaibil")||
//                                            destination.getEditText().getText().toString().equals("Dhalgaon")||
//                                            destination.getEditText().getText().toString().equals("Dhalpukhuri")||
//                                            destination.getEditText().getText().toString().equals("Dhamangaon")||
//                                            destination.getEditText().getText().toString().equals("Dhamni")||
//                                            destination.getEditText().getText().toString().equals("Dhamora")||
//                                            destination.getEditText().getText().toString().equals("Dhampur")||
//                                            destination.getEditText().getText().toString().equals("Dhamtari")||
//                                            destination.getEditText().getText().toString().equals("Dhamua")||
//                                            destination.getEditText().getText().toString().equals("Dhana Kherli")||
//                                            destination.getEditText().getText().toString().equals("Dhanakwada")||
//                                            destination.getEditText().getText().toString().equals("Dhanakya")||
//                                            destination.getEditText().getText().toString().equals("Dhanari")||
//                                            destination.getEditText().getText().toString().equals("Dhanawala Wada")||
//                                            destination.getEditText().getText().toString().equals("Dhanbad Junction")||
//                                            destination.getEditText().getText().toString().equals("Dhandari Kalan")||
//                                            destination.getEditText().getText().toString().equals("Dhandhera")||
//                                            destination.getEditText().getText().toString().equals("Dhandhuka")||
//                                            destination.getEditText().getText().toString().equals("Dhanera")||
//                                            destination.getEditText().getText().toString().equals("Dhaneta")||
//                                            destination.getEditText().getText().toString().equals("Dhangadra")||
//                                            destination.getEditText().getText().toString().equals("Dhanmandal")||
//                                            destination.getEditText().getText().toString().equals("Dharamtul")||
//                                            destination.getEditText().getText().toString().equals("Dharangaon")||
//                                            destination.getEditText().getText().toString().equals("Dhareshwar")||
//                                            destination.getEditText().getText().toString().equals("Dhari Junction")||
//                                            destination.getEditText().getText().toString().equals("Dhariwal")||
//                                            destination.getEditText().getText().toString().equals("Dharmabad")||
//                                            destination.getEditText().getText().toString().equals("Dharmanagar")||
//                                            destination.getEditText().getText().toString().equals("Dharmapuri")||
//                                            destination.getEditText().getText().toString().equals("Dharmavaram Junction")||
//                                            destination.getEditText().getText().toString().equals("Dharmpur Himachal")||
//                                            destination.getEditText().getText().toString().equals("Dharnaoda")||
//                                            destination.getEditText().getText().toString().equals("Dharodi")||
//                                            destination.getEditText().getText().toString().equals("Dharwad")||
//                                            destination.getEditText().getText().toString().equals("Dhasa Junction")||
//                                            destination.getEditText().getText().toString().equals("Dholpur")||
//                                            destination.getEditText().getText().toString().equals("Dhaura")||
//                                            destination.getEditText().getText().toString().equals("Dheena")||
//                                            destination.getEditText().getText().toString().equals("Dhekiajili Road")||
//                                            destination.getEditText().getText().toString().equals("Dhemaji")||
//                                            destination.getEditText().getText().toString().equals("Dhenkanal")||
//                                            destination.getEditText().getText().toString().equals("Dhilwan")||
//                                            destination.getEditText().getText().toString().equals("Dhinda")||
//                                            destination.getEditText().getText().toString().equals("Dhindhora HKMKD")||
//                                            destination.getEditText().getText().toString().equals("Dhindsa")||
//                                            destination.getEditText().getText().toString().equals("Dhing")||
//                                            destination.getEditText().getText().toString().equals("Dhing Bazar")||
//                                            destination.getEditText().getText().toString().equals("Dhinoj")||
//                                            destination.getEditText().getText().toString().equals("Dhirera")||
//                                            destination.getEditText().getText().toString().equals("Dhirganj")||
//                                            destination.getEditText().getText().toString().equals("Dhirpur")||
//                                            destination.getEditText().getText().toString().equals("Dhoda Khedi")||
//                                            destination.getEditText().getText().toString().equals("Dhodhar")||
//                                            destination.getEditText().getText().toString().equals("Dhodra Mohar")||
//                                            destination.getEditText().getText().toString().equals("Dhola Junction")||
//                                            destination.getEditText().getText().toString().equals("Dhola Mazra")||
//                                            destination.getEditText().getText().toString().equals("Dholi")||
//                                            destination.getEditText().getText().toString().equals("Dholka")||
//                                            destination.getEditText().getText().toString().equals("Dhondi")||
//                                            destination.getEditText().getText().toString().equals("Dhoraji")||
//                                            destination.getEditText().getText().toString().equals("Dhrangadhra Junction")||
//                                            destination.getEditText().getText().toString().equals("Dhubri")||
//                                            destination.getEditText().getText().toString().equals("Dhule")||
//                                            destination.getEditText().getText().toString().equals("Dhulghat")||
//                                            destination.getEditText().getText().toString().equals("Dhulkot")||
//                                            destination.getEditText().getText().toString().equals("Dhup Dhara")||
//                                            destination.getEditText().getText().toString().equals("Dhupguri")||
//                                            destination.getEditText().getText().toString().equals("Dhuri Junction")||
//                                            destination.getEditText().getText().toString().equals("Diamond Harbour")||
//                                            destination.getEditText().getText().toString().equals("Dibai")||
//                                            destination.getEditText().getText().toString().equals("Dibrugarh")||
//                                            destination.getEditText().getText().toString().equals("Dibrugarh Town")||
//                                            destination.getEditText().getText().toString().equals("Dichpalli")||
//                                            destination.getEditText().getText().toString().equals("Didwana")||
//                                            destination.getEditText().getText().toString().equals("Digaru")||
//                                            destination.getEditText().getText().toString().equals("Digboi")||
//                                            destination.getEditText().getText().toString().equals("Digha")||
//                                            destination.getEditText().getText().toString().equals("Dighwara")||
//                                            destination.getEditText().getText().toString().equals("Digod")||
//                                            destination.getEditText().getText().toString().equals("Dihakho")||
//                                            destination.getEditText().getText().toString().equals("Dilawarnagar")||
//                                            destination.getEditText().getText().toString().equals("Dildarnagar Junction")||
//                                            destination.getEditText().getText().toString().equals("Dimapur")||
//                                            destination.getEditText().getText().toString().equals("Dimow")||
//                                            destination.getEditText().getText().toString().equals("Dina Nagar")||
//                                            destination.getEditText().getText().toString().equals("Dinagaon")||
//                                            destination.getEditText().getText().toString().equals("Dindigul Junction")||
//                                            destination.getEditText().getText().toString().equals("Dingwahi")||
//                                            destination.getEditText().getText().toString().equals("Dipa")||
//                                            destination.getEditText().getText().toString().equals("Diphu")||
//                                            destination.getEditText().getText().toString().equals("Diplana")||
//                                            destination.getEditText().getText().toString().equals("Dipori")||
//                                            destination.getEditText().getText().toString().equals("Deesa")||
//                                            destination.getEditText().getText().toString().equals("Ditokcherra")||
//                                            destination.getEditText().getText().toString().equals("Diva Junction")||
//                                            destination.getEditText().getText().toString().equals("Divine Nagar")||
//                                            destination.getEditText().getText().toString().equals("Diwana")||
//                                            destination.getEditText().getText().toString().equals("Diwankhavati")||
//                                            destination.getEditText().getText().toString().equals("Diyodar")||
//                                            destination.getEditText().getText().toString().equals("Dobh Bahali")||
//                                            destination.getEditText().getText().toString().equals("Dockyard Road")||
//                                            destination.getEditText().getText().toString().equals("Doddaballapur")||
//                                            destination.getEditText().getText().toString().equals("Dodbele")||
//                                            destination.getEditText().getText().toString().equals("Dohrighat")||
//                                            destination.getEditText().getText().toString().equals("Doiwala")||
//                                            destination.getEditText().getText().toString().equals("Dolavli")||
//                                            destination.getEditText().getText().toString().equals("Dombivli")||
//                                            destination.getEditText().getText().toString().equals("Domingarh")||
//                                            destination.getEditText().getText().toString().equals("Donakonda")||
//                                            destination.getEditText().getText().toString().equals("Dondaicha")||
//                                            destination.getEditText().getText().toString().equals("Dongargaon")||
//                                            destination.getEditText().getText().toString().equals("Dongargarh")||
//                                            destination.getEditText().getText().toString().equals("Donigal")||
//                                            destination.getEditText().getText().toString().equals("Doraha")||
//                                            destination.getEditText().getText().toString().equals("Doravart Chtram")||
//                                            destination.getEditText().getText().toString().equals("Dornakal Junction")||
//                                            destination.getEditText().getText().toString().equals("Dronachalam Junction")||
//                                            destination.getEditText().getText().toString().equals("Dronagiri")||
//                                            destination.getEditText().getText().toString().equals("Dubaha")||
//                                            destination.getEditText().getText().toString().equals("Dubia")||
//                                            destination.getEditText().getText().toString().equals("Duddhinagar")||
//                                            destination.getEditText().getText().toString().equals("Dudhani")||
//                                            destination.getEditText().getText().toString().equals("Dudhia Khurd")||
//                                            destination.getEditText().getText().toString().equals("Dudhnoi")||
//                                            destination.getEditText().getText().toString().equals("Dudhwakhara")||
//                                            destination.getEditText().getText().toString().equals("Dudh Sagar railway station")||
//                                            destination.getEditText().getText().toString().equals("Dudh Sagar Water Falls railway station")||
//                                            destination.getEditText().getText().toString().equals("Dudia")||
//                                            destination.getEditText().getText().toString().equals("Dudwindi")||
//                                            destination.getEditText().getText().toString().equals("Duganpur")||
//                                            destination.getEditText().getText().toString().equals("Dugdol")||
//                                            destination.getEditText().getText().toString().equals("Duggirala")||
//                                            destination.getEditText().getText().toString().equals("Duhai")||
//                                            destination.getEditText().getText().toString().equals("Duliajan")||
//                                            destination.getEditText().getText().toString().equals("Dullabcherra")||
//                                            destination.getEditText().getText().toString().equals("Dullahapur")||
//                                            destination.getEditText().getText().toString().equals("Dulrasar")||
//                                            destination.getEditText().getText().toString().equals("Dum Dum")||
//                                            destination.getEditText().getText().toString().equals("Dum Dum Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Dumariya")||
//                                            destination.getEditText().getText().toString().equals("Dumraon")||
//                                            destination.getEditText().getText().toString().equals("Dumka")||
//                                            destination.getEditText().getText().toString().equals("Dumuriput")||
//                                            destination.getEditText().getText().toString().equals("Dundara")||
//                                            destination.getEditText().getText().toString().equals("Dundlod MKDGRH")||
//                                            destination.getEditText().getText().toString().equals("Dungar Junction")||
//                                            destination.getEditText().getText().toString().equals("Dungarpur")||
//                                            destination.getEditText().getText().toString().equals("Duraundha Junction")||
//                                            destination.getEditText().getText().toString().equals("Durgauti")||
//                                            destination.getEditText().getText().toString().equals("Durg")||
//                                            destination.getEditText().getText().toString().equals("Durgapur")||
//                                            destination.getEditText().getText().toString().equals("Duttapukur")||
//                                            destination.getEditText().getText().toString().equals("Durgapura")||
//                                            destination.getEditText().getText().toString().equals("Duskheda")||
//                                            destination.getEditText().getText().toString().equals("Duvvada")||
//                                            destination.getEditText().getText().toString().equals("Dwarka")||
//                                            destination.getEditText().getText().toString().equals("Dwarkaganj")||
//                                            destination.getEditText().getText().toString().equals("Errupalem")||
//                                            destination.getEditText().getText().toString().equals("Ekambara kuppam")||
//                                            destination.getEditText().getText().toString().equals("Ekangarsarai")||
//                                            destination.getEditText().getText().toString().equals("Ekchari")||
//                                            destination.getEditText().getText().toString().equals("Ekma")||
//                                            destination.getEditText().getText().toString().equals("Ekma")||
//                                            destination.getEditText().getText().toString().equals("Elamanur")||
//                                            destination.getEditText().getText().toString().equals("Yelamanchili")||
//                                            destination.getEditText().getText().toString().equals("Ellenabad")||
//                                            destination.getEditText().getText().toString().equals("Eluru")||
//                                            destination.getEditText().getText().toString().equals("Ennore")||
//                                            destination.getEditText().getText().toString().equals("Eraligu")||
//                                            destination.getEditText().getText().toString().equals("Eraniel")||
//                                            destination.getEditText().getText().toString().equals("Eravipuram")||
//                                            destination.getEditText().getText().toString().equals("Ernakulam Junction")||
//                                            destination.getEditText().getText().toString().equals("Ernakulam Town")||
//                                            destination.getEditText().getText().toString().equals("Ernakulam Terminus")||
//                                            destination.getEditText().getText().toString().equals("Erode Junction")||
//                                            destination.getEditText().getText().toString().equals("Etah")||
//                                            destination.getEditText().getText().toString().equals("Etawah")||
//                                            destination.getEditText().getText().toString().equals("Ettimadai(Coimbatore)")||
//                                            destination.getEditText().getText().toString().equals("Etmadpur")||
//                                            destination.getEditText().getText().toString().equals("Etakkot")||
//                                            destination.getEditText().getText().toString().equals("Faizabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Faizullapur")||
//                                            destination.getEditText().getText().toString().equals("Fakhrabad")||
//                                            destination.getEditText().getText().toString().equals("Fakiragram Junction")||
//                                            destination.getEditText().getText().toString().equals("Falakata")||
//                                            destination.getEditText().getText().toString().equals("Falna")||
//                                            destination.getEditText().getText().toString().equals("Farah Town")||
//                                            destination.getEditText().getText().toString().equals("Farhedi")||
//                                            destination.getEditText().getText().toString().equals("Faridabad")||
//                                            destination.getEditText().getText().toString().equals("Faridabad New Town")||
//                                            destination.getEditText().getText().toString().equals("Faridkot")||
//                                            destination.getEditText().getText().toString().equals("Farrukhabad")||
//                                            destination.getEditText().getText().toString().equals("Farrukhabad")||
//                                            destination.getEditText().getText().toString().equals("Fateh Singhpura")||
//                                            destination.getEditText().getText().toString().equals("Fatehabad Chandrawati Ganj Junction")||
//                                            destination.getEditText().getText().toString().equals("Fatehgarh")||
//                                            destination.getEditText().getText().toString().equals("Fatehgarh Sahib")||
//                                            destination.getEditText().getText().toString().equals("Fatehnagar")||
//                                            destination.getEditText().getText().toString().equals("Fatehpur")||
//                                            destination.getEditText().getText().toString().equals("Fatehpur Sikri")||
//                                            destination.getEditText().getText().toString().equals("Fatehpur Shekhawati")||
//                                            destination.getEditText().getText().toString().equals("Fatuha")||
//                                            destination.getEditText().getText().toString().equals("Fazalpur")||
//                                            destination.getEditText().getText().toString().equals("Fazilka")||
//                                            destination.getEditText().getText().toString().equals("Ferok")||
//                                            destination.getEditText().getText().toString().equals("Firozabad")||
//                                            destination.getEditText().getText().toString().equals("Firozpur Cant.")||
//                                            destination.getEditText().getText().toString().equals("Firozpur City")||
//                                            destination.getEditText().getText().toString().equals("Forbesganj")||
//                                            destination.getEditText().getText().toString().equals("Furkating Junction")||
//                                            destination.getEditText().getText().toString().equals("Fursatganj")||
//                                            destination.getEditText().getText().toString().equals("Gachhipura")||
//                                            destination.getEditText().getText().toString().equals("Gardhrubeswar")||
//                                            destination.getEditText().getText().toString().equals("Gadag Junction")||
//                                            destination.getEditText().getText().toString().equals("Gadarwara")||
//                                            destination.getEditText().getText().toString().equals("Gadhakda")||
//                                            destination.getEditText().getText().toString().equals("Gadra Road")||
//                                            destination.getEditText().getText().toString().equals("Gadwal")||
//                                            destination.getEditText().getText().toString().equals("Gahmar")||
//                                            destination.getEditText().getText().toString().equals("Gainjahwa")||
//                                            destination.getEditText().getText().toString().equals("Gainsari Junction")||
//                                            destination.getEditText().getText().toString().equals("Gaipura")||
//                                            destination.getEditText().getText().toString().equals("Gajraula Junction")||
//                                            destination.getEditText().getText().toString().equals("Galan")||
//                                            destination.getEditText().getText().toString().equals("Gambhiri Road")||
//                                            destination.getEditText().getText().toString().equals("Ganagapur Road")||
//                                            destination.getEditText().getText().toString().equals("Ganj Dundwara")||
//                                            destination.getEditText().getText().toString().equals("Gannaur")||
//                                            destination.getEditText().getText().toString().equals("Gandhi Smarak Road")||
//                                            destination.getEditText().getText().toString().equals("Gandhidham Junction")||
//                                            destination.getEditText().getText().toString().equals("Gandhigram")||
//                                            destination.getEditText().getText().toString().equals("Gandhinagar Jaipur")||
//                                            destination.getEditText().getText().toString().equals("Gandhinagar Capital")||
//                                            destination.getEditText().getText().toString().equals("Ganeshganj")||
//                                            destination.getEditText().getText().toString().equals("Gangaganj")||
//                                            destination.getEditText().getText().toString().equals("Gangakher")||
//                                            destination.getEditText().getText().toString().equals("Gangapur City")||
//                                            destination.getEditText().getText().toString().equals("Gangarampur")||
//                                            destination.getEditText().getText().toString().equals("Gangrar")||
//                                            destination.getEditText().getText().toString().equals("Gangsar Jaitu")||
//                                            destination.getEditText().getText().toString().equals("Ganj Basoda")||
//                                            destination.getEditText().getText().toString().equals("Ganjmuradabad")||
//                                            destination.getEditText().getText().toString().equals("Gannavaram")||
//                                            destination.getEditText().getText().toString().equals("Garhi Harsaru Junction")||
//                                            destination.getEditText().getText().toString().equals("Garhi Manikpur")||
//                                            destination.getEditText().getText().toString().equals("Garhmuktesar")||
//                                            destination.getEditText().getText().toString().equals("Garhmuktesar BR")||
//                                            destination.getEditText().getText().toString().equals("Garna Sahib")||
//                                            destination.getEditText().getText().toString().equals("Garhwa")||
//                                            destination.getEditText().getText().toString().equals("Garia")||
//                                            destination.getEditText().getText().toString().equals("Garwa Road Junction")||
//                                            destination.getEditText().getText().toString().equals("Garot")||
//                                            destination.getEditText().getText().toString().equals("Gaura")||
//                                            destination.getEditText().getText().toString().equals("Gauri Bazar")||
//                                            destination.getEditText().getText().toString().equals("Gauri Phanta")||
//                                            destination.getEditText().getText().toString().equals("Gauribidanur")||
//                                            destination.getEditText().getText().toString().equals("Gauriganj")||
//                                            destination.getEditText().getText().toString().equals("Gauripur")||
//                                            destination.getEditText().getText().toString().equals("Gauriyamau")||
//                                            destination.getEditText().getText().toString().equals("Gaushala")||
//                                            destination.getEditText().getText().toString().equals("Gautampura Road")||
//                                            destination.getEditText().getText().toString().equals("Gaya Junction")||
//                                            destination.getEditText().getText().toString().equals("Geratpur")||
//                                            destination.getEditText().getText().toString().equals("Gerita Kolvada")||
//                                            destination.getEditText().getText().toString().equals("Gevra Road")||
//                                            destination.getEditText().getText().toString().equals("Gevrai")||
//                                            destination.getEditText().getText().toString().equals("Ghaggar")||
//                                            destination.getEditText().getText().toString().equals("Ghagwal")||
//                                            destination.getEditText().getText().toString().equals("Ghanauli")||
//                                            destination.getEditText().getText().toString().equals("Ghansoli")||
//                                            destination.getEditText().getText().toString().equals("Gharaunda")||
//                                            destination.getEditText().getText().toString().equals("Ghaso")||
//                                            destination.getEditText().getText().toString().equals("Ghataka Varana")||
//                                            destination.getEditText().getText().toString().equals("Ghatampur")||
//                                            destination.getEditText().getText().toString().equals("Ghatkopar railway station")||
//                                            destination.getEditText().getText().toString().equals("Ghatkopar")||
//                                            destination.getEditText().getText().toString().equals("Ghatsila")||
//                                            destination.getEditText().getText().toString().equals("Ghaziabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Ghazipur City")||
//                                            destination.getEditText().getText().toString().equals("Ghograpur")||
//                                            destination.getEditText().getText().toString().equals("Gholvad")||
//                                            destination.getEditText().getText().toString().equals("Ghoradongri")||
//                                            destination.getEditText().getText().toString().equals("Ghorawadi")||
//                                            destination.getEditText().getText().toString().equals("Ghorpuri")||
//                                            destination.getEditText().getText().toString().equals("Ghorpuri West")||
//                                            destination.getEditText().getText().toString().equals("Ghosipura")||
//                                            destination.getEditText().getText().toString().equals("Ghosunda")||
//                                            destination.getEditText().getText().toString().equals("Ghughuli")||
//                                            destination.getEditText().getText().toString().equals("Ghugus")||
//                                            destination.getEditText().getText().toString().equals("Ghutai")||
//                                            destination.getEditText().getText().toString().equals("Gidarpindi")||
//                                            destination.getEditText().getText().toString().equals("Giddalur")||
//                                            destination.getEditText().getText().toString().equals("Giddarbaha")||
//                                            destination.getEditText().getText().toString().equals("Gidhaur")||
//                                            destination.getEditText().getText().toString().equals("Gir Gadhara")||
//                                            destination.getEditText().getText().toString().equals("Gir Hadmatiya")||
//                                            destination.getEditText().getText().toString().equals("Giridih")||
//                                            destination.getEditText().getText().toString().equals("Girwar")||
//                                            destination.getEditText().getText().toString().equals("Goalpara Town")||
//                                            destination.getEditText().getText().toString().equals("Godha")||
//                                            destination.getEditText().getText().toString().equals("Godhra Junction")||
//                                            destination.getEditText().getText().toString().equals("Gogameri")||
//                                            destination.getEditText().getText().toString().equals("Gogamukh")||
//                                            destination.getEditText().getText().toString().equals("Gohad Road")||
//                                            destination.getEditText().getText().toString().equals("Gohana")||
//                                            destination.getEditText().getText().toString().equals("Gohpur")||
//                                            destination.getEditText().getText().toString().equals("Gokak Road")||
//                                            destination.getEditText().getText().toString().equals("Gokarna Road")||
//                                            destination.getEditText().getText().toString().equals("Gola Gokarannath")||
//                                            destination.getEditText().getText().toString().equals("Golakganj Junction")||
//                                            destination.getEditText().getText().toString().equals("Golanthra")||
//                                            destination.getEditText().getText().toString().equals("Gole")||
//                                            destination.getEditText().getText().toString().equals("Golsar")||
//                                            destination.getEditText().getText().toString().equals("Gomti Nagar")||
//                                            destination.getEditText().getText().toString().equals("Gonda Junction")||
//                                            destination.getEditText().getText().toString().equals("Gonda Kachahri")||
//                                            destination.getEditText().getText().toString().equals("Gonda MG")||
//                                            destination.getEditText().getText().toString().equals("Gondal")||
//                                            destination.getEditText().getText().toString().equals("Gondia Junction")||
//                                            destination.getEditText().getText().toString().equals("Gondumri")||
//                                            destination.getEditText().getText().toString().equals("Goneana")||
//                                            destination.getEditText().getText().toString().equals("Gooty Junction")||
//                                            destination.getEditText().getText().toString().equals("Gop Jam")||
//                                            destination.getEditText().getText().toString().equals("Gopalganj")||
//                                            destination.getEditText().getText().toString().equals("Gopalpur")||
//                                            destination.getEditText().getText().toString().equals("Gora Ghuma")||
//                                            destination.getEditText().getText().toString().equals("Gorakhpur Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Gorakhpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Goram Ghat")||
//                                            destination.getEditText().getText().toString().equals("Ghorasahan")||
//                                            destination.getEditText().getText().toString().equals("Goraul")||
//                                            destination.getEditText().getText().toString().equals("Goraya")||
//                                            destination.getEditText().getText().toString().equals("Goregaon")||
//                                            destination.getEditText().getText().toString().equals("Goregaon Road Halt")||
//                                            destination.getEditText().getText().toString().equals("Goresuar")||
//                                            destination.getEditText().getText().toString().equals("Goriyan")||
//                                            destination.getEditText().getText().toString().equals("Goshainganj")||
//                                            destination.getEditText().getText().toString().equals("Gossaigaon Hat")||
//                                            destination.getEditText().getText().toString().equals("Gotan")||
//                                            destination.getEditText().getText().toString().equals("Gotegaon")||
//                                            destination.getEditText().getText().toString().equals("Gothaj")||
//                                            destination.getEditText().getText().toString().equals("Govandi")||
//                                            destination.getEditText().getText().toString().equals("Goverdhan")||
//                                            destination.getEditText().getText().toString().equals("Govindgarh")||
//                                            destination.getEditText().getText().toString().equals("Govindgarh Malk")||
//                                            destination.getEditText().getText().toString().equals("Govindi Marwar")||
//                                            destination.getEditText().getText().toString().equals("Govindnagar")||
//                                            destination.getEditText().getText().toString().equals("Govindpuri")||
//                                            destination.getEditText().getText().toString().equals("Grant Road")||
//                                            destination.getEditText().getText().toString().equals("Gudha")||
//                                            destination.getEditText().getText().toString().equals("Guindy")||
//                                            destination.getEditText().getText().toString().equals("Gubbi")||
//                                            destination.getEditText().getText().toString().equals("Gudivada Junction")||
//                                            destination.getEditText().getText().toString().equals("Gudiyattam")||
//                                            destination.getEditText().getText().toString().equals("Gudur Junction")||
//                                            destination.getEditText().getText().toString().equals("Gujhandi")||
//                                            destination.getEditText().getText().toString().equals("Gulabhganj")||
//                                            destination.getEditText().getText().toString().equals("Gulabpura")||
//                                            destination.getEditText().getText().toString().equals("Gulaothi")||
//                                            destination.getEditText().getText().toString().equals("Gularbhoj")||
//                                            destination.getEditText().getText().toString().equals("Gulbarga")||
//                                            destination.getEditText().getText().toString().equals("Guldhar")||
//                                            destination.getEditText().getText().toString().equals("Guledagudda Road")||
//                                            destination.getEditText().getText().toString().equals("Guler")||
//                                            destination.getEditText().getText().toString().equals("Gulzarbagh")||
//                                            destination.getEditText().getText().toString().equals("Guma")||
//                                            destination.getEditText().getText().toString().equals("Gumia")||
//                                            destination.getEditText().getText().toString().equals("Gumman")||
//                                            destination.getEditText().getText().toString().equals("Gummidipundi")||
//                                            destination.getEditText().getText().toString().equals("Gumthal")||
//                                            destination.getEditText().getText().toString().equals("Guna Junction")||
//                                            destination.getEditText().getText().toString().equals("Gundardehi")||
//                                            destination.getEditText().getText().toString().equals("Guneru Bamori")||
//                                            destination.getEditText().getText().toString().equals("Guntakal Junction")||
//                                            destination.getEditText().getText().toString().equals("Guntur Junction")||
//                                            destination.getEditText().getText().toString().equals("Guptipara")||
//                                            destination.getEditText().getText().toString().equals("Guraru")||
//                                            destination.getEditText().getText().toString().equals("Gurap")||
//                                            destination.getEditText().getText().toString().equals("Gurdaspur")||
//                                            destination.getEditText().getText().toString().equals("Gurgaon")||
//                                            destination.getEditText().getText().toString().equals("Gurhi")||
//                                            destination.getEditText().getText().toString().equals("Guriya")||
//                                            destination.getEditText().getText().toString().equals("Gurla")||
//                                            destination.getEditText().getText().toString().equals("Gurmura")||
//                                            destination.getEditText().getText().toString().equals("Gurpa")||
//                                            destination.getEditText().getText().toString().equals("Gursahaiganj")||
//                                            destination.getEditText().getText().toString().equals("Gursar Shnewala")||
//                                            destination.getEditText().getText().toString().equals("Gauravpur")||
//                                            destination.getEditText().getText().toString().equals("Guru Tegh Bahadur Nagar")||
//                                            destination.getEditText().getText().toString().equals("Guwahati")||
//                                            destination.getEditText().getText().toString().equals("Gwalior Junction")||
//                                            destination.getEditText().getText().toString().equals("Gyanpur Road")||
//                                            destination.getEditText().getText().toString().equals("Habaipur")||
//                                            destination.getEditText().getText().toString().equals("Habibganj")||
//                                            destination.getEditText().getText().toString().equals("Habibwala")||
//                                            destination.getEditText().getText().toString().equals("Habra")||
//                                            destination.getEditText().getText().toString().equals("Hadapsar")||
//                                            destination.getEditText().getText().toString().equals("Hadmadiya")||
//                                            destination.getEditText().getText().toString().equals("Hadmatiya Junction")||
//                                            destination.getEditText().getText().toString().equals("Hafizpur")||
//                                            destination.getEditText().getText().toString().equals("Haflong Hill")||
//                                            destination.getEditText().getText().toString().equals("Haiaghat")||
//                                            destination.getEditText().getText().toString().equals("Haibargaon")||
//                                            destination.getEditText().getText().toString().equals("Haidergarh")||
//                                            destination.getEditText().getText().toString().equals("Hailakandi")||
//                                            destination.getEditText().getText().toString().equals("Hajipur Junction")||
//                                            destination.getEditText().getText().toString().equals("Hakimpur")||
//                                            destination.getEditText().getText().toString().equals("Haldaur")||
//                                            destination.getEditText().getText().toString().equals("Haldi Road")||
//                                            destination.getEditText().getText().toString().equals("Haldia")||
//                                            destination.getEditText().getText().toString().equals("Haldibari")||
//                                            destination.getEditText().getText().toString().equals("Haldwani")||
//                                            destination.getEditText().getText().toString().equals("Halisahar")||
//                                            destination.getEditText().getText().toString().equals("Halvad")||
//                                            destination.getEditText().getText().toString().equals("Hamira")||
//                                            destination.getEditText().getText().toString().equals("Hamirgarh")||
//                                            destination.getEditText().getText().toString().equals("Hamirpur Road")||
//                                            destination.getEditText().getText().toString().equals("Hamre")||
//                                            destination.getEditText().getText().toString().equals("Hanakere")||
//                                            destination.getEditText().getText().toString().equals("Handia Khas")||
//                                            destination.getEditText().getText().toString().equals("Hansi")||
//                                            destination.getEditText().getText().toString().equals("Hansiawas")||
//                                            destination.getEditText().getText().toString().equals("Hanumangarh Junction")||
//                                            destination.getEditText().getText().toString().equals("Hanumangarh Town")||
//                                            destination.getEditText().getText().toString().equals("Hanwant")||
//                                            destination.getEditText().getText().toString().equals("Hapa")||
//                                            destination.getEditText().getText().toString().equals("Hapa Road")||
//                                            destination.getEditText().getText().toString().equals("Hapur Junction")||
//                                            destination.getEditText().getText().toString().equals("Harangajao")||
//                                            destination.getEditText().getText().toString().equals("Harangul")||
//                                            destination.getEditText().getText().toString().equals("Haranya Kheri")||
//                                            destination.getEditText().getText().toString().equals("Harauni")||
//                                            destination.getEditText().getText().toString().equals("Harwada")||
//                                            destination.getEditText().getText().toString().equals("Harchandpur")||
//                                            destination.getEditText().getText().toString().equals("Harda")||
//                                            destination.getEditText().getText().toString().equals("Hardoi")||
//                                            destination.getEditText().getText().toString().equals("Harduaganj")||
//                                            destination.getEditText().getText().toString().equals("Haridwar")||
//                                            destination.getEditText().getText().toString().equals("Harihar")||
//                                            destination.getEditText().getText().toString().equals("Harinagar")||
//                                            destination.getEditText().getText().toString().equals("Haripad")||
//                                            destination.getEditText().getText().toString().equals("Haripur")||
//                                            destination.getEditText().getText().toString().equals("Haripur Gram")||
//                                            destination.getEditText().getText().toString().equals("Harischandrapur")||
//                                            destination.getEditText().getText().toString().equals("Harishanker Road")||
//                                            destination.getEditText().getText().toString().equals("Harisinga")||
//                                            destination.getEditText().getText().toString().equals("Harkia Khal")||
//                                            destination.getEditText().getText().toString().equals("Harmuti")||
//                                            destination.getEditText().getText().toString().equals("Harnaut")||
//                                            destination.getEditText().getText().toString().equals("Harpalganj")||
//                                            destination.getEditText().getText().toString().equals("Harpalpur")||
//                                            destination.getEditText().getText().toString().equals("Harrawala")||
//                                            destination.getEditText().getText().toString().equals("Harsauli")||
//                                            destination.getEditText().getText().toString().equals("Harsud")||
//                                            destination.getEditText().getText().toString().equals("Harthala")||
//                                            destination.getEditText().getText().toString().equals("Harwada")||
//                                            destination.getEditText().getText().toString().equals("Hasimara")||
//                                            destination.getEditText().getText().toString().equals("Hassan Junction")||
//                                            destination.getEditText().getText().toString().equals("Hasanparthi Road")||
//                                            destination.getEditText().getText().toString().equals("Hathbandh")||
//                                            destination.getEditText().getText().toString().equals("Hathidah Junction")||
//                                            destination.getEditText().getText().toString().equals("Hathigadh")||
//                                            destination.getEditText().getText().toString().equals("Hathras City")||
//                                            destination.getEditText().getText().toString().equals("Hathras Junction")||
//                                            destination.getEditText().getText().toString().equals("Hathras Road")||
//                                            destination.getEditText().getText().toString().equals("Hathras Qilla")||
//                                            destination.getEditText().getText().toString().equals("Hatia")||
//                                            destination.getEditText().getText().toString().equals("Hatikhali")||
//                                            destination.getEditText().getText().toString().equals("Hatkanagale")||
//                                            destination.getEditText().getText().toString().equals("Hatundi")||
//                                            destination.getEditText().getText().toString().equals("Haveri")||
//                                            destination.getEditText().getText().toString().equals("Hazaribagh Road")||
//                                            destination.getEditText().getText().toString().equals("Hazrat Nizamuddin")||
//                                            destination.getEditText().getText().toString().equals("Hejjala")||
//                                            destination.getEditText().getText().toString().equals("Helak")||
//                                            destination.getEditText().getText().toString().equals("Helem")||
//                                            destination.getEditText().getText().toString().equals("Hempur")||
//                                            destination.getEditText().getText().toString().equals("Hendegir")||
//                                            destination.getEditText().getText().toString().equals("Hilara")||
//                                            destination.getEditText().getText().toString().equals("Hiller Shahabad")||
//                                            destination.getEditText().getText().toString().equals("Hilsa")||
//                                            destination.getEditText().getText().toString().equals("Himayatnagar")||
//                                            destination.getEditText().getText().toString().equals("Himmatnagar Junction")||
//                                            destination.getEditText().getText().toString().equals("Hindaun City")||
//                                            destination.getEditText().getText().toString().equals("Hind Motor")||
//                                            destination.getEditText().getText().toString().equals("Hindu College")||
//                                            destination.getEditText().getText().toString().equals("Hindumalkote")||
//                                            destination.getEditText().getText().toString().equals("Hindupur")||
//                                            destination.getEditText().getText().toString().equals("Hinganghat")||
//                                            destination.getEditText().getText().toString().equals("Hingoli Deccan")||
//                                            destination.getEditText().getText().toString().equals("Hira Nagar")||
//                                            destination.getEditText().getText().toString().equals("Hirakud")||
//                                            destination.getEditText().getText().toString().equals("Hirapur")||
//                                            destination.getEditText().getText().toString().equals("Hirdagarh")||
//                                            destination.getEditText().getText().toString().equals("Hirnoda")||
//                                            destination.getEditText().getText().toString().equals("Hisar")||
//                                            destination.getEditText().getText().toString().equals("Hisvahal")||
//                                            destination.getEditText().getText().toString().equals("Hodal")||
//                                            destination.getEditText().getText().toString().equals("Hojai")||
//                                            destination.getEditText().getText().toString().equals("Hol")||
//                                            destination.getEditText().getText().toString().equals("Holambi Kalan")||
//                                            destination.getEditText().getText().toString().equals("Hole Alur")||
//                                            destination.getEditText().getText().toString().equals("Honnavar")||
//                                            destination.getEditText().getText().toString().equals("Hooghly")||
//                                            destination.getEditText().getText().toString().equals("Hooghly Ghat")||
//                                            destination.getEditText().getText().toString().equals("Homnabad")||
//                                            destination.getEditText().getText().toString().equals("Hosdurga Road")||
//                                            destination.getEditText().getText().toString().equals("Hoshangabad")||
//                                            destination.getEditText().getText().toString().equals("Hoshiarpur")||
//                                            destination.getEditText().getText().toString().equals("Hosapete Junction")||
//                                            destination.getEditText().getText().toString().equals("Hosur")||
//                                            destination.getEditText().getText().toString().equals("Hotgi Junction")||
//                                            destination.getEditText().getText().toString().equals("Howbagh Jabalpur")||
//                                            destination.getEditText().getText().toString().equals("Howrah Junction")||
//                                            destination.getEditText().getText().toString().equals("Hubli Junction")||
//                                            destination.getEditText().getText().toString().equals("Hugrajuli")||
//                                            destination.getEditText().getText().toString().equals("Husainpur")||
//                                            destination.getEditText().getText().toString().equals("Hyderabad Deccan")||
//                                            destination.getEditText().getText().toString().equals("Ib")||
//                                            destination.getEditText().getText().toString().equals("Ichhapur")||
//                                            destination.getEditText().getText().toString().equals("Ichapuram")||
//                                            destination.getEditText().getText().toString().equals("Ichauli")||
//                                            destination.getEditText().getText().toString().equals("Idar")||
//                                            destination.getEditText().getText().toString().equals("Idgah Agra Junction")||
//                                            destination.getEditText().getText().toString().equals("Igatpuri")||
//                                            destination.getEditText().getText().toString().equals("Ikkar")||
//                                            destination.getEditText().getText().toString().equals("Iklehra")||
//                                            destination.getEditText().getText().toString().equals("Inchhapuri")||
//                                            destination.getEditText().getText().toString().equals("Indalvai")||
//                                            destination.getEditText().getText().toString().equals("Indapur")||
//                                            destination.getEditText().getText().toString().equals("Indara Junction")||
//                                            destination.getEditText().getText().toString().equals("Indargarh")||
//                                            destination.getEditText().getText().toString().equals("Indi Road")||
//                                            destination.getEditText().getText().toString().equals("Indore Junction (BG)")||
//                                            destination.getEditText().getText().toString().equals("Indore Junction (MG)")||
//                                            destination.getEditText().getText().toString().equals("Innanje")||
//                                            destination.getEditText().getText().toString().equals("Intikanne")||
//                                            destination.getEditText().getText().toString().equals("Intiyathok")||
//                                            destination.getEditText().getText().toString().equals("Itehar")||
//                                            destination.getEditText().getText().toString().equals("Iqbal Gadh")||
//                                            destination.getEditText().getText().toString().equals("Iqbalpur")||
//                                            destination.getEditText().getText().toString().equals("Irinjalakuda")||
//                                            destination.getEditText().getText().toString().equals("Irugur")||
//                                            destination.getEditText().getText().toString().equals("Isarda")||
//                                            destination.getEditText().getText().toString().equals("Islampur")||
//                                            destination.getEditText().getText().toString().equals("Ismaila Haryana")||
//                                            destination.getEditText().getText().toString().equals("Itarsi Junction")||
//                                            destination.getEditText().getText().toString().equals("Itola")||
//                                            destination.getEditText().getText().toString().equals("Itwari")||
//                                            destination.getEditText().getText().toString().equals("Izzatnagar")||
//                                            destination.getEditText().getText().toString().equals("Jabalpur")||
//                                            destination.getEditText().getText().toString().equals("Jabli")||
//                                            destination.getEditText().getText().toString().equals("Jabri")||
//                                            destination.getEditText().getText().toString().equals("Jadar")||
//                                            destination.getEditText().getText().toString().equals("Jadavpur")||
//                                            destination.getEditText().getText().toString().equals("Jadcherla")||
//                                            destination.getEditText().getText().toString().equals("Jagadhri")||
//                                            destination.getEditText().getText().toString().equals("Jagadhri Workshop")||
//                                            destination.getEditText().getText().toString().equals("Jagadishpur")||
//                                            destination.getEditText().getText().toString().equals("Jagaddal")||
//                                            destination.getEditText().getText().toString().equals("Jessore Road")||
//                                            destination.getEditText().getText().toString().equals("Jagatbela")||
//                                            destination.getEditText().getText().toString().equals("Jagdalpur")||
//                                            destination.getEditText().getText().toString().equals("Jagdevwala")||
//                                            destination.getEditText().getText().toString().equals("Jagesharganj")||
//                                            destination.getEditText().getText().toString().equals("Jagi road")||
//                                            destination.getEditText().getText().toString().equals("Jagnath Road Halt")||
//                                            destination.getEditText().getText().toString().equals("Jagraon")||
//                                            destination.getEditText().getText().toString().equals("Jahanikhera")||
//                                            destination.getEditText().getText().toString().equals("Jaipur")||
//                                            destination.getEditText().getText().toString().equals("Jais")||
//                                            destination.getEditText().getText().toString().equals("Jaisalmer")||
//                                            destination.getEditText().getText().toString().equals("Jaithari")||
//                                            destination.getEditText().getText().toString().equals("Jaitipur")||
//                                            destination.getEditText().getText().toString().equals("Jaitwar")||
//                                            destination.getEditText().getText().toString().equals("Jajiwal")||
//                                            destination.getEditText().getText().toString().equals("Jajpur Kheonjhar Road")||
//                                            destination.getEditText().getText().toString().equals("Jakhal Junction")||
//                                            destination.getEditText().getText().toString().equals("Jakhalabandha")||
//                                            destination.getEditText().getText().toString().equals("Jakhalaun")||
//                                            destination.getEditText().getText().toString().equals("Jakhania")||
//                                            destination.getEditText().getText().toString().equals("Jakhaura")||
//                                            destination.getEditText().getText().toString().equals("Jakhim")||
//                                            destination.getEditText().getText().toString().equals("Jakhvada")||
//                                            destination.getEditText().getText().toString().equals("Jaksi")||
//                                            destination.getEditText().getText().toString().equals("Jalalganj")||
//                                            destination.getEditText().getText().toString().equals("Jalalpur Dhai")||
//                                            destination.getEditText().getText().toString().equals("Jalamb Junction")||
//                                            destination.getEditText().getText().toString().equals("Jalandhar Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Jalandhar City")||
//                                            destination.getEditText().getText().toString().equals("Jalesar Road")||
//                                            destination.getEditText().getText().toString().equals("Jaleswar")||
//                                            destination.getEditText().getText().toString().equals("Jalgaon Junction")||
//                                            destination.getEditText().getText().toString().equals("Jalila Road")||
//                                            destination.getEditText().getText().toString().equals("Jaliya Devani")||
//                                            destination.getEditText().getText().toString().equals("Jalna")||
//                                            destination.getEditText().getText().toString().equals("Jalor")||
//                                            destination.getEditText().getText().toString().equals("Jalpaiguri")||
//                                            destination.getEditText().getText().toString().equals("Jalpaiguri Road")||
//                                            destination.getEditText().getText().toString().equals("Jalsu")||
//                                            destination.getEditText().getText().toString().equals("Jalsu Nanak")||
//                                            destination.getEditText().getText().toString().equals("Jam Jodhpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Jam Wanthali")||
//                                            destination.getEditText().getText().toString().equals("Jamalpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Jambara")||
//                                            destination.getEditText().getText().toString().equals("Jambur")||
//                                            destination.getEditText().getText().toString().equals("Jamira")||
//                                            destination.getEditText().getText().toString().equals("Jammalamadugu")||
//                                            destination.getEditText().getText().toString().equals("Jammikunta")||
//                                            destination.getEditText().getText().toString().equals("Jammu Tawi")||
//                                            destination.getEditText().getText().toString().equals("Jamnagar")||
//                                            destination.getEditText().getText().toString().equals("Jamsar")||
//                                            destination.getEditText().getText().toString().equals("Jamtara")||
//                                            destination.getEditText().getText().toString().equals("Jamui")||
//                                            destination.getEditText().getText().toString().equals("Jamunamukh")||
//                                            destination.getEditText().getText().toString().equals("Jamwala")||
//                                            destination.getEditText().getText().toString().equals("Janakpur Road")||
//                                            destination.getEditText().getText().toString().equals("Jandiala")||
//                                            destination.getEditText().getText().toString().equals("Jangaon")||
//                                            destination.getEditText().getText().toString().equals("Janghai Junction")||
//                                            destination.getEditText().getText().toString().equals("Jangipur Road")||
//                                            destination.getEditText().getText().toString().equals("Janiyana")||
//                                            destination.getEditText().getText().toString().equals("Jankampet Junction")||
//                                            destination.getEditText().getText().toString().equals("Jaora")||
//                                            destination.getEditText().getText().toString().equals("Japla")||
//                                            destination.getEditText().getText().toString().equals("Jarandeshwar")||
//                                            destination.getEditText().getText().toString().equals("Jargaon")||
//                                            destination.getEditText().getText().toString().equals("Jari")||
//                                            destination.getEditText().getText().toString().equals("Jaruda Naraa")||
//                                            destination.getEditText().getText().toString().equals("Jarwal Road")||
//                                            destination.getEditText().getText().toString().equals("Jasia")||
//                                            destination.getEditText().getText().toString().equals("Jasali")||
//                                            destination.getEditText().getText().toString().equals("Jasidih Junction")||
//                                            destination.getEditText().getText().toString().equals("Jasra")||
//                                            destination.getEditText().getText().toString().equals("Jaswantgarh")||
//                                            destination.getEditText().getText().toString().equals("Jaswantnagar railway station")||
//                                            destination.getEditText().getText().toString().equals("Jataula Samphka")||
//                                            destination.getEditText().getText().toString().equals("Jath Road")||
//                                            destination.getEditText().getText().toString().equals("Jatinga")||
//                                            destination.getEditText().getText().toString().equals("Jatusana")||
//                                            destination.getEditText().getText().toString().equals("Jaulka")||
//                                            destination.getEditText().getText().toString().equals("Jaunpur City railway station")||
//                                            destination.getEditText().getText().toString().equals("Jaunpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Javale")||
//                                            destination.getEditText().getText().toString().equals("Jawad Road")||
//                                            destination.getEditText().getText().toString().equals("Jawai Bandh")||
//                                            destination.getEditText().getText().toString().equals("Jawali")||
//                                            destination.getEditText().getText().toString().equals("Jawalamukhi Road")||
//                                            destination.getEditText().getText().toString().equals("Jayasingpur")||
//                                            destination.getEditText().getText().toString().equals("Jaynagar")||
//                                            destination.getEditText().getText().toString().equals("Jaynagar Majilpur")||
//                                            destination.getEditText().getText().toString().equals("Jehanabad")||
//                                            destination.getEditText().getText().toString().equals("Jejuri")||
//                                            destination.getEditText().getText().toString().equals("Jenal")||
//                                            destination.getEditText().getText().toString().equals("Jeonathpur")||
//                                            destination.getEditText().getText().toString().equals("Jetalsar Junction")||
//                                            destination.getEditText().getText().toString().equals("Jetalvad")||
//                                            destination.getEditText().getText().toString().equals("Jetpur")||
//                                            destination.getEditText().getText().toString().equals("Jeur")||
//                                            destination.getEditText().getText().toString().equals("Jagannath Temple Gate")||
//                                            destination.getEditText().getText().toString().equals("Jhadupudi")||
//                                            destination.getEditText().getText().toString().equals("Jhagadiya Junction")||
//                                            destination.getEditText().getText().toString().equals("Jhajha")||
//                                            destination.getEditText().getText().toString().equals("Jhalawar Road")||
//                                            destination.getEditText().getText().toString().equals("Jhalida")||
//                                            destination.getEditText().getText().toString().equals("Jhanjharpur")||
//                                            destination.getEditText().getText().toString().equals("Jhansi Junction")||
//                                            destination.getEditText().getText().toString().equals("Jhargram")||
//                                            destination.getEditText().getText().toString().equals("Jharia")||
//                                            destination.getEditText().getText().toString().equals("Jharokhas")||
//                                            destination.getEditText().getText().toString().equals("Jharsuguda Junction")||
//                                            destination.getEditText().getText().toString().equals("Jharwasaa")||
//                                            destination.getEditText().getText().toString().equals("Jhingura")||
//                                            destination.getEditText().getText().toString().equals("Jhinjhak")||
//                                            destination.getEditText().getText().toString().equals("Jhunjhunu")||
//                                            destination.getEditText().getText().toString().equals("Jhunpa")||
//                                            destination.getEditText().getText().toString().equals("Jigna")||
//                                            destination.getEditText().getText().toString().equals("Jind Junction")||
//                                            destination.getEditText().getText().toString().equals("Jira Road")||
//                                            destination.getEditText().getText().toString().equals("Jiradei")||
//                                            destination.getEditText().getText().toString().equals("Jiribam")||
//                                            destination.getEditText().getText().toString().equals("Jirighat")||
//                                            destination.getEditText().getText().toString().equals("Jiron")||
//                                            destination.getEditText().getText().toString().equals("Jiyapuram")||
//                                            destination.getEditText().getText().toString().equals("Jodhpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Jogbani")||
//                                            destination.getEditText().getText().toString().equals("Jogeshwari")||
//                                            destination.getEditText().getText().toString().equals("Jogi Magra")||
//                                            destination.getEditText().getText().toString().equals("Jogidih")||
//                                            destination.getEditText().getText().toString().equals("Jogighopa")||
//                                            destination.getEditText().getText().toString().equals("Joginder Nagar railway station")||
//                                            destination.getEditText().getText().toString().equals("Jogiwala")||
//                                            destination.getEditText().getText().toString().equals("Jolarpettai Junction")||
//                                            destination.getEditText().getText().toString().equals("Jone Karrang")||
//                                            destination.getEditText().getText().toString().equals("Joravaragar")||
//                                            destination.getEditText().getText().toString().equals("Jorhat")||
//                                            destination.getEditText().getText().toString().equals("Jorhat Town")||
//                                            destination.getEditText().getText().toString().equals("Jotana")||
//                                            destination.getEditText().getText().toString().equals("Joychandi Pahar railway station")||
//                                            destination.getEditText().getText().toString().equals("Juchandra")||
//                                            destination.getEditText().getText().toString().equals("Jugijan")||
//                                            destination.getEditText().getText().toString().equals("Juinagar")||
//                                            destination.getEditText().getText().toString().equals("Jukehi")||
//                                            destination.getEditText().getText().toString().equals("Julana")||
//                                            destination.getEditText().getText().toString().equals("Junagadh C B")||
//                                            destination.getEditText().getText().toString().equals("Junagadh Junction")||
//                                            destination.getEditText().getText().toString().equals("Jung Bahadurganj")||
//                                            destination.getEditText().getText().toString().equals("Junichavand")||
//                                            destination.getEditText().getText().toString().equals("Junnor Deo")||
//                                            destination.getEditText().getText().toString().equals("Juriagaon")||
//                                            destination.getEditText().getText().toString().equals("Jutogh")||
//                                            destination.getEditText().getText().toString().equals("Jwalapur")||
//                                            destination.getEditText().getText().toString().equals("Kacheguda")||
//                                            destination.getEditText().getText().toString().equals("Kachhwa Road")||
//                                            destination.getEditText().getText().toString().equals("Kondapalli")||
//                                            destination.getEditText().getText().toString().equals("Kadalundi")||
//                                            destination.getEditText().getText().toString().equals("Kadambur")||
//                                            destination.getEditText().getText().toString().equals("Kadaynallur")||
//                                            destination.getEditText().getText().toString().equals("Kadiri")||
//                                            destination.getEditText().getText().toString().equals("Kadur Junction")||
//                                            destination.getEditText().getText().toString().equals("Kaithal")||
//                                            destination.getEditText().getText().toString().equals("Kaithalkuchi")||
//                                            destination.getEditText().getText().toString().equals("Kakapor")||
//                                            destination.getEditText().getText().toString().equals("Kakinada Port")||
//                                            destination.getEditText().getText().toString().equals("Kakinada Town")||
//                                            destination.getEditText().getText().toString().equals("Kankinara")||
//                                            destination.getEditText().getText().toString().equals("Kalachand")||
//                                            destination.getEditText().getText().toString().equals("Kalamboli")||
//                                            destination.getEditText().getText().toString().equals("Kalanaur kalan")||
//                                            destination.getEditText().getText().toString().equals("Kalem railway station")||
//                                            destination.getEditText().getText().toString().equals("Kalianpur")||
//                                            destination.getEditText().getText().toString().equals("Kalka")||
//                                            destination.getEditText().getText().toString().equals("Kalkalighat")||
//                                            destination.getEditText().getText().toString().equals("Kalwa")||
//                                            destination.getEditText().getText().toString().equals("Kalwan")||
//                                            destination.getEditText().getText().toString().equals("Kalyan")||
//                                            destination.getEditText().getText().toString().equals("Kondapalli railway station")||
//                                            destination.getEditText().getText().toString().equals("Kanchrapara")||
//                                            destination.getEditText().getText().toString().equals("Kalyani")||
//                                            destination.getEditText().getText().toString().equals("Kalyanadurg")||
//                                            destination.getEditText().getText().toString().equals("Kalinarayanpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Kalol Junction")||
//                                            destination.getEditText().getText().toString().equals("Kamakhya Junction")||
//                                            destination.getEditText().getText().toString().equals("Kaman Road")||
//                                            destination.getEditText().getText().toString().equals("Kamareddi")||
//                                            destination.getEditText().getText().toString().equals("Kampil Road")||
//                                            destination.getEditText().getText().toString().equals("Kamshet")||
//                                            destination.getEditText().getText().toString().equals("Kamakhya Junction")||
//                                            destination.getEditText().getText().toString().equals("Kampur")||
//                                            destination.getEditText().getText().toString().equals("Kamrup Khetri")||
//                                            destination.getEditText().getText().toString().equals("Kanaibazar")||
//                                            destination.getEditText().getText().toString().equals("Kanakpura")||
//                                            destination.getEditText().getText().toString().equals("Kanchausi")||
//                                            destination.getEditText().getText().toString().equals("Kanchipuram")||
//                                            destination.getEditText().getText().toString().equals("Kandivali")||
//                                            destination.getEditText().getText().toString().equals("Kangra")||
//                                            destination.getEditText().getText().toString().equals("Kanhangad")||
//                                            destination.getEditText().getText().toString().equals("Kanina Khas")||
//                                            destination.getEditText().getText().toString().equals("Kaniyapuram")||
//                                            destination.getEditText().getText().toString().equals("Kanjiramittam")||
//                                            destination.getEditText().getText().toString().equals("Kanjurmarg")||
//                                            destination.getEditText().getText().toString().equals("Kankanadi")||
//                                            destination.getEditText().getText().toString().equals("Kannauj")||
//                                            destination.getEditText().getText().toString().equals("Kanpur Anwarganj")||
//                                            destination.getEditText().getText().toString().equals("Kanpur Central")||
//                                            destination.getEditText().getText().toString().equals("Kanpur Rooma")||
//                                            destination.getEditText().getText().toString().equals("Kanpur SMU CBSA CPSM")||
//                                            destination.getEditText().getText().toString().equals("Kanpur Govindpuri railway station")||
//                                            destination.getEditText().getText().toString().equals("Kanpur Panki")||
//                                            destination.getEditText().getText().toString().equals("Kanpur Bridge Left Bank")||
//                                            destination.getEditText().getText().toString().equals("Kanyakumari")||
//                                            destination.getEditText().getText().toString().equals("Kapurthala")||
//                                            destination.getEditText().getText().toString().equals("Karad")||
//                                            destination.getEditText().getText().toString().equals("Karaikal")||
//                                            destination.getEditText().getText().toString().equals("Karaikkudi Junction")||
//                                            destination.getEditText().getText().toString().equals("Karanja")||
//                                            destination.getEditText().getText().toString().equals("Karchha")||
//                                            destination.getEditText().getText().toString().equals("Karimganj Junction")||
//                                            destination.getEditText().getText().toString().equals("Karimnagar")||
//                                            destination.getEditText().getText().toString().equals("Karjat")||
//                                            destination.getEditText().getText().toString().equals("Karmali")||
//                                            destination.getEditText().getText().toString().equals("Karnal")||
//                                            destination.getEditText().getText().toString().equals("Karur Junction")||
//                                            destination.getEditText().getText().toString().equals("Karunagappalli")||
//                                            destination.getEditText().getText().toString().equals("Karwar")||
//                                            destination.getEditText().getText().toString().equals("Kasara")||
//                                            destination.getEditText().getText().toString().equals("Kasaragod")||
//                                            destination.getEditText().getText().toString().equals("Kashi")||
//                                            destination.getEditText().getText().toString().equals("Kashipur Junction")||
//                                            destination.getEditText().getText().toString().equals("Katakhal Junction")||
//                                            destination.getEditText().getText().toString().equals("Kathgodam")||
//                                            destination.getEditText().getText().toString().equals("Kathivakkam")||
//                                            destination.getEditText().getText().toString().equals("Kathua")||
//                                            destination.getEditText().getText().toString().equals("Katihar")||
//                                            destination.getEditText().getText().toString().equals("Katlicherra")||
//                                            destination.getEditText().getText().toString().equals("Katni")||
//                                            destination.getEditText().getText().toString().equals("Katol")||
//                                            destination.getEditText().getText().toString().equals("Katpadi Junction, Vellore")||
//                                            destination.getEditText().getText().toString().equals("Katra")||
//                                            destination.getEditText().getText().toString().equals("Kavali")||
//                                            destination.getEditText().getText().toString().equals("Kayamkulam")||
//                                            destination.getEditText().getText().toString().equals("Kayasthagram")||
//                                            destination.getEditText().getText().toString().equals("Kazhakoottam TechnoPark Trivandrum")||
//                                            destination.getEditText().getText().toString().equals("Kazipet Junction")||
//                                            destination.getEditText().getText().toString().equals("Kelavli")||
//                                            destination.getEditText().getText().toString().equals("Kelve Road")||
//                                            destination.getEditText().getText().toString().equals("Kempegowda International Airport Bengaluru")||
//                                            destination.getEditText().getText().toString().equals("Kendukana")||
//                                            destination.getEditText().getText().toString().equals("Kengeri")||
//                                            destination.getEditText().getText().toString().equals("Kerakat railway station")||
//                                            destination.getEditText().getText().toString().equals("Kesinga")||
//                                            destination.getEditText().getText().toString().equals("Kesamudram")||
//                                            destination.getEditText().getText().toString().equals("Kevadia")||
//                                            destination.getEditText().getText().toString().equals("Khadavli")||
//                                            destination.getEditText().getText().toString().equals("Khadki")||
//                                            destination.getEditText().getText().toString().equals("Khairthal")||
//                                            destination.getEditText().getText().toString().equals("Khajuraho")||
//                                            destination.getEditText().getText().toString().equals("Khalilpur")||
//                                            destination.getEditText().getText().toString().equals("Khambhaliya")||
//                                            destination.getEditText().getText().toString().equals("Khamgaon")||
//                                            destination.getEditText().getText().toString().equals("Khamkhed")||
//                                            destination.getEditText().getText().toString().equals("Khammam")||
//                                            destination.getEditText().getText().toString().equals("Khana Junction")||
//                                            destination.getEditText().getText().toString().equals("Khandala")||
//                                            destination.getEditText().getText().toString().equals("Khandeshwar")||
//                                            destination.getEditText().getText().toString().equals("Khandwa")||
//                                            destination.getEditText().getText().toString().equals("Khanna")||
//                                            destination.getEditText().getText().toString().equals("Kharagpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Kharbao")||
//                                            destination.getEditText().getText().toString().equals("Khardi")||
//                                            destination.getEditText().getText().toString().equals("Kharghar")||
//                                            destination.getEditText().getText().toString().equals("Khar Road")||
//                                            destination.getEditText().getText().toString().equals("Khatauli")||
//                                            destination.getEditText().getText().toString().equals("Khatu")||
//                                            destination.getEditText().getText().toString().equals("Khed")||
//                                            destination.getEditText().getText().toString().equals("Khera Kalan")||
//                                            destination.getEditText().getText().toString().equals("Khopoli")||
//                                            destination.getEditText().getText().toString().equals("Khurai")||
//                                            destination.getEditText().getText().toString().equals("Kinwat")||
//                                            destination.getEditText().getText().toString().equals("Kirakat railway station")||
//                                            destination.getEditText().getText().toString().equals("Kirloskarvadi")||
//                                            destination.getEditText().getText().toString().equals("Kirnahar")||
//                                            destination.getEditText().getText().toString().equals("Kilikolloor")||
//                                            destination.getEditText().getText().toString().equals("King's Circle")||
//                                            destination.getEditText().getText().toString().equals("Kishanganj")||
//                                            destination.getEditText().getText().toString().equals("Kiul Junction")||
//                                            destination.getEditText().getText().toString().equals("Kochuveli (Trivandrum /Thiruvananthapuram)")||
//                                            destination.getEditText().getText().toString().equals("Kodaikanal road")||
//                                            destination.getEditText().getText().toString().equals("Koderma")||
//                                            destination.getEditText().getText().toString().equals("Kodinar")||
//                                            destination.getEditText().getText().toString().equals("Kodumudi")||
//                                            destination.getEditText().getText().toString().equals("Koduru")||
//                                            destination.getEditText().getText().toString().equals("Kokrajhar")||
//                                            destination.getEditText().getText().toString().equals("Kolar")||
//                                            destination.getEditText().getText().toString().equals("Kollidam")||
//                                            destination.getEditText().getText().toString().equals("Kolhapur")||
//                                            destination.getEditText().getText().toString().equals("Kolad")||
//                                            destination.getEditText().getText().toString().equals("Kolkata railway station")||
//                                            destination.getEditText().getText().toString().equals("Kollam Junction")||
//                                            destination.getEditText().getText().toString().equals("Konnagar")||
//                                            destination.getEditText().getText().toString().equals("Kopar")||
//                                            destination.getEditText().getText().toString().equals("Kopargaon")||
//                                            destination.getEditText().getText().toString().equals("Kopar Khairane")||
//                                            destination.getEditText().getText().toString().equals("Koraput Junction")||
//                                            destination.getEditText().getText().toString().equals("Koratla railway station")||
//                                            destination.getEditText().getText().toString().equals("Korattiangadi")||
//                                            destination.getEditText().getText().toString().equals("Korattur")||
//                                            destination.getEditText().getText().toString().equals("Korba")||
//                                            destination.getEditText().getText().toString().equals("Koregaon")||
//                                            destination.getEditText().getText().toString().equals("Korukkupet")||
//                                            destination.getEditText().getText().toString().equals("Kosamba")||
//                                            destination.getEditText().getText().toString().equals("Kosi Kalan")||
//                                            destination.getEditText().getText().toString().equals("Kosli")||
//                                            destination.getEditText().getText().toString().equals("Kotdwar")||
//                                            destination.getEditText().getText().toString().equals("Kotkapura Junction")||
//                                            destination.getEditText().getText().toString().equals("Kota Junction")||
//                                            destination.getEditText().getText().toString().equals("Kotli Kalan")||
//                                            destination.getEditText().getText().toString().equals("Kotma")||
//                                            destination.getEditText().getText().toString().equals("Kotshila Junction")||
//                                            destination.getEditText().getText().toString().equals("Kottapalli")||
//                                            destination.getEditText().getText().toString().equals("Kottavalasa")||
//                                            destination.getEditText().getText().toString().equals("Kottayam")||
//                                            destination.getEditText().getText().toString().equals("Kottarakkara")||
//                                            destination.getEditText().getText().toString().equals("Kotikulam")||
//                                            destination.getEditText().getText().toString().equals("Kotturu")||
//                                            destination.getEditText().getText().toString().equals("Kovilpatti")||
//                                            destination.getEditText().getText().toString().equals("Koyilandy")||
//                                            destination.getEditText().getText().toString().equals("Kozhikode")||
//                                            destination.getEditText().getText().toString().equals("Krishna")||
//                                            destination.getEditText().getText().toString().equals("Krishna Canal")||
//                                            destination.getEditText().getText().toString().equals("Krishnai")||
//                                            destination.getEditText().getText().toString().equals("Krishnarajapuram")||
//                                            destination.getEditText().getText().toString().equals("Kuchaman City")||
//                                            destination.getEditText().getText().toString().equals("Kudal")||
//                                            destination.getEditText().getText().toString().equals("Kudchade railway station")||
//                                            destination.getEditText().getText().toString().equals("Kulem railway station")||
//                                            destination.getEditText().getText().toString().equals("Kulitalai")||
//                                            destination.getEditText().getText().toString().equals("Kulpahar")||
//                                            destination.getEditText().getText().toString().equals("Kulti")||
//                                            destination.getEditText().getText().toString().equals("Kulukkallur")||
//                                            destination.getEditText().getText().toString().equals("Kumgaon Burti")||
//                                            destination.getEditText().getText().toString().equals("Kumbakonam")||
//                                            destination.getEditText().getText().toString().equals("Kumta")||
//                                            destination.getEditText().getText().toString().equals("Kundapura")||
//                                            destination.getEditText().getText().toString().equals("Kuppam")||
//                                            destination.getEditText().getText().toString().equals("Kuram")||
//                                            destination.getEditText().getText().toString().equals("Kuri")||
//                                            destination.getEditText().getText().toString().equals("Kurichedu")||
//                                            destination.getEditText().getText().toString().equals("Kurduvadi")||
//                                            destination.getEditText().getText().toString().equals("Kurla")||
//                                            destination.getEditText().getText().toString().equals("Kurnool Town")||
//                                            destination.getEditText().getText().toString().equals("Kurukshetra Junction")||
//                                            destination.getEditText().getText().toString().equals("Kuttippuram")||
//                                            destination.getEditText().getText().toString().equals("Khurda Road")||
//                                            destination.getEditText().getText().toString().equals("kursela")||
//                                            destination.getEditText().getText().toString().equals("Laban")||
//                                            destination.getEditText().getText().toString().equals("Labha")||
//                                            destination.getEditText().getText().toString().equals("Labhpur")||
//                                            destination.getEditText().getText().toString().equals("Lachhipura")||
//                                            destination.getEditText().getText().toString().equals("Lachhmangarh SK")||
//                                            destination.getEditText().getText().toString().equals("Lachhmanpur")||
//                                            destination.getEditText().getText().toString().equals("Lachyan")||
//                                            destination.getEditText().getText().toString().equals("Ladhowal")||
//                                            destination.getEditText().getText().toString().equals("Ladnun")||
//                                            destination.getEditText().getText().toString().equals("Laheria Sarai")||
//                                            destination.getEditText().getText().toString().equals("Lahli")||
//                                            destination.getEditText().getText().toString().equals("Laimekuri")||
//                                            destination.getEditText().getText().toString().equals("Lakadiya")||
//                                            destination.getEditText().getText().toString().equals("Lakheri")||
//                                            destination.getEditText().getText().toString().equals("Lakhimpur")||
//                                            destination.getEditText().getText().toString().equals("Lakhminia")||
//                                            destination.getEditText().getText().toString().equals("Lakhnauria")||
//                                            destination.getEditText().getText().toString().equals("Lakhtar")||
//                                            destination.getEditText().getText().toString().equals("Lakkidi")||
//                                            destination.getEditText().getText().toString().equals("Laksar Junction")||
//                                            destination.getEditText().getText().toString().equals("Lakshmibai Nagar")||
//                                            destination.getEditText().getText().toString().equals("Lal Kuan")||
//                                            destination.getEditText().getText().toString().equals("Lalabazar")||
//                                            destination.getEditText().getText().toString().equals("Lalapet")||
//                                            destination.getEditText().getText().toString().equals("Lalganj")||
//                                            destination.getEditText().getText().toString().equals("Lalgarh Junction")||
//                                            destination.getEditText().getText().toString().equals("Lalgopalganj")||
//                                            destination.getEditText().getText().toString().equals("Lalgudi")||
//                                            destination.getEditText().getText().toString().equals("Lalitpur")||
//                                            destination.getEditText().getText().toString().equals("Lalkuan Junction")||
//                                            destination.getEditText().getText().toString().equals("Lalpur")||
//                                            destination.getEditText().getText().toString().equals("Lalpur Chandra")||
//                                            destination.getEditText().getText().toString().equals("Lalpur Jam")||
//                                            destination.getEditText().getText().toString().equals("Lalpur Umri")||
//                                            destination.getEditText().getText().toString().equals("Lalru")||
//                                            destination.getEditText().getText().toString().equals("Lamana")||
//                                            destination.getEditText().getText().toString().equals("Lambhua")||
//                                            destination.getEditText().getText().toString().equals("Lambiya")||
//                                            destination.getEditText().getText().toString().equals("Lamsakhang")||
//                                            destination.getEditText().getText().toString().equals("Landaura")||
//                                            destination.getEditText().getText().toString().equals("Langting")||
//                                            destination.getEditText().getText().toString().equals("Lanka")||
//                                            destination.getEditText().getText().toString().equals("Laopani")||
//                                            destination.getEditText().getText().toString().equals("Lar Road")||
//                                            destination.getEditText().getText().toString().equals("Lasalgaon")||
//                                            destination.getEditText().getText().toString().equals("Lasur")||
//                                            destination.getEditText().getText().toString().equals("Latehar")||
//                                            destination.getEditText().getText().toString().equals("Lathi")||
//                                            destination.getEditText().getText().toString().equals("Latur")||
//                                            destination.getEditText().getText().toString().equals("Latur Road Junction")||
//                                            destination.getEditText().getText().toString().equals("Laukaha Bazar")||
//                                            destination.getEditText().getText().toString().equals("Laul")||
//                                            destination.getEditText().getText().toString().equals("Lawa Sardargarh")||
//                                            destination.getEditText().getText().toString().equals("Ledarmer")||
//                                            destination.getEditText().getText().toString().equals("Lehra Gaga")||
//                                            destination.getEditText().getText().toString().equals("Lidhora Khurd")||
//                                            destination.getEditText().getText().toString().equals("Liliya Mota")||
//                                            destination.getEditText().getText().toString().equals("Limbdi")||
//                                            destination.getEditText().getText().toString().equals("Limkheda")||
//                                            destination.getEditText().getText().toString().equals("Linch")||
//                                            destination.getEditText().getText().toString().equals("Lingampalli")||
//                                            destination.getEditText().getText().toString().equals("Liluah")||
//                                            destination.getEditText().getText().toString().equals("Lodipur Bishnpr")||
//                                            destination.getEditText().getText().toString().equals("Loha")||
//                                            destination.getEditText().getText().toString().equals("Loharu")||
//                                            destination.getEditText().getText().toString().equals("Loharwara")||
//                                            destination.getEditText().getText().toString().equals("Lohian Khas Junction")||
//                                            destination.getEditText().getText().toString().equals("Lohna Road")||
//                                            destination.getEditText().getText().toString().equals("Lohogad")||
//                                            destination.getEditText().getText().toString().equals("Loisingha")||
//                                            destination.getEditText().getText().toString().equals("Lokmanya Tilak Terminus")||
//                                            destination.getEditText().getText().toString().equals("Loliem railway station")||
//                                            destination.getEditText().getText().toString().equals("Lonand")||
//                                            destination.getEditText().getText().toString().equals("Lonavala")||
//                                            destination.getEditText().getText().toString().equals("Londa Junction")||
//                                            destination.getEditText().getText().toString().equals("Loni")||
//                                            destination.getEditText().getText().toString().equals("Lorwada")||
//                                            destination.getEditText().getText().toString().equals("Lower Haflong")||
//                                            destination.getEditText().getText().toString().equals("Lower Parel")||
//                                            destination.getEditText().getText().toString().equals("Lowjee")||
//                                            destination.getEditText().getText().toString().equals("Luckeesarai Junction")||
//                                            destination.getEditText().getText().toString().equals("Lucknow Junction")||
//                                            destination.getEditText().getText().toString().equals("Lucknow")||
//                                            destination.getEditText().getText().toString().equals("Lucknow City")||
//                                            destination.getEditText().getText().toString().equals("Ludhiana Junction")||
//                                            destination.getEditText().getText().toString().equals("Lumding Junction")||
//                                            destination.getEditText().getText().toString().equals("Lunavada")||
//                                            destination.getEditText().getText().toString().equals("Luni Junction")||
//                                            destination.getEditText().getText().toString().equals("Luni Richha")||
//                                            destination.getEditText().getText().toString().equals("Lunidhar")||
//                                            destination.getEditText().getText().toString().equals("Lunkaransar")||
//                                            destination.getEditText().getText().toString().equals("Lusa")||
//                                            destination.getEditText().getText().toString().equals("Lusadiya")||
//                                            destination.getEditText().getText().toString().equals("Lushala")||
//                                            destination.getEditText().getText().toString().equals("Lalgola")||
//                                            destination.getEditText().getText().toString().equals("Macharya")||
//                                            destination.getEditText().getText().toString().equals("Machavaram")||
//                                            destination.getEditText().getText().toString().equals("Machavaram")||
//                                            destination.getEditText().getText().toString().equals("Machelipatnam")||
//                                            destination.getEditText().getText().toString().equals("Macherla")||
//                                            destination.getEditText().getText().toString().equals("Madan Mahal")||
//                                            destination.getEditText().getText().toString().equals("Madanapalle Rd")||
//                                            destination.getEditText().getText().toString().equals("Madanpur")||
//                                            destination.getEditText().getText().toString().equals("Maddur")||
//                                            destination.getEditText().getText().toString().equals("Madhavnagar")||
//                                            destination.getEditText().getText().toString().equals("Madukarai(Coimbatore)")||
//                                            destination.getEditText().getText().toString().equals("Madurai Junction railway station")||
//                                            destination.getEditText().getText().toString().equals("Madgaon Junction railway station")||
//                                            destination.getEditText().getText().toString().equals("Majorda Junction railway station")||
//                                            destination.getEditText().getText().toString().equals("Marmagao railway station")||
//                                            destination.getEditText().getText().toString().equals("Mithlanchal Deep")||
//                                            destination.getEditText().getText().toString().equals("Madha")||
//                                            destination.getEditText().getText().toString().equals("Madhabpur")||
//                                            destination.getEditText().getText().toString().equals("Madhapar")||
//                                            destination.getEditText().getText().toString().equals("Madhapur Road")||
//                                            destination.getEditText().getText().toString().equals("Madhi")||
//                                            destination.getEditText().getText().toString().equals("Madhira")||
//                                            destination.getEditText().getText().toString().equals("Madhopur Punjab")||
//                                            destination.getEditText().getText().toString().equals("Madhorajpur")||
//                                            destination.getEditText().getText().toString().equals("Madhosingh")||
//                                            destination.getEditText().getText().toString().equals("Madhubani")||
//                                            destination.getEditText().getText().toString().equals("Madhupur Junction")||
//                                            destination.getEditText().getText().toString().equals("Madurai Junction")||
//                                            destination.getEditText().getText().toString().equals("Madurantakam")||
//                                            destination.getEditText().getText().toString().equals("Madure")||
//                                            destination.getEditText().getText().toString().equals("Maghar")||
//                                            destination.getEditText().getText().toString().equals("Mahadanapuram")||
//                                            destination.getEditText().getText().toString().equals("Mahadevpara")||
//                                            destination.getEditText().getText().toString().equals("Mahajan")||
//                                            destination.getEditText().getText().toString().equals("Mahalam")||
//                                            destination.getEditText().getText().toString().equals("Mahalaxmi")||
//                                            destination.getEditText().getText().toString().equals("Mahamandir")||
//                                            destination.getEditText().getText().toString().equals("Mahansar")||
//                                            destination.getEditText().getText().toString().equals("Mahasamund")||
//                                            destination.getEditText().getText().toString().equals("Mahbubabad")||
//                                            destination.getEditText().getText().toString().equals("Mahbubnagar")||
//                                            destination.getEditText().getText().toString().equals("Mahe")||
//                                            destination.getEditText().getText().toString().equals("Maheji")||
//                                            destination.getEditText().getText().toString().equals("Mahendragarh")||
//                                            destination.getEditText().getText().toString().equals("Mahes Khunt")||
//                                            destination.getEditText().getText().toString().equals("Mahesana Junction")||
//                                            destination.getEditText().getText().toString().equals("Maheshmunda")||
//                                            destination.getEditText().getText().toString().equals("Mahidpur Road")||
//                                            destination.getEditText().getText().toString().equals("Mahim")||
//                                            destination.getEditText().getText().toString().equals("Mahisgaon")||
//                                            destination.getEditText().getText().toString().equals("Mahmudabad Avdh")||
//                                            destination.getEditText().getText().toString().equals("Mahmudpur SRYN")||
//                                            destination.getEditText().getText().toString().equals("Mahoba")||
//                                            destination.getEditText().getText().toString().equals("Maholi")||
//                                            destination.getEditText().getText().toString().equals("Mahpur")||
//                                            destination.getEditText().getText().toString().equals("Mahuamilan")||
//                                            destination.getEditText().getText().toString().equals("Mahuariya")||
//                                            destination.getEditText().getText().toString().equals("Mahuda Junction")||
//                                            destination.getEditText().getText().toString().equals("Mahugarha")||
//                                            destination.getEditText().getText().toString().equals("Mahur")||
//                                            destination.getEditText().getText().toString().equals("Mahuva Junction")||
//                                            destination.getEditText().getText().toString().equals("Maibang")||
//                                            destination.getEditText().getText().toString().equals("Maihar")||
//                                            destination.getEditText().getText().toString().equals("Maikalganj")||
//                                            destination.getEditText().getText().toString().equals("Mailani Junction")||
//                                            destination.getEditText().getText().toString().equals("Mailongdisa")||
//                                            destination.getEditText().getText().toString().equals("Mainpuri")||
//                                            destination.getEditText().getText().toString().equals("Mairabari")||
//                                            destination.getEditText().getText().toString().equals("Mairwa")||
//                                            destination.getEditText().getText().toString().equals("Majbat")||
//                                            destination.getEditText().getText().toString().equals("Majgaon")||
//                                            destination.getEditText().getText().toString().equals("Majhagawan")||
//                                            destination.getEditText().getText().toString().equals("Majhola Pakarya")||
//                                            destination.getEditText().getText().toString().equals("Makhu")||
//                                            destination.getEditText().getText().toString().equals("Makrana Junction")||
//                                            destination.getEditText().getText().toString().equals("Makrera")||
//                                            destination.getEditText().getText().toString().equals("Makronia")||
//                                            destination.getEditText().getText().toString().equals("Maksi")||
//                                            destination.getEditText().getText().toString().equals("Malad")||
//                                            destination.getEditText().getText().toString().equals("Malarna")||
//                                            destination.getEditText().getText().toString().equals("Malavli")||
//                                            destination.getEditText().getText().toString().equals("Malda Town")||
//                                            destination.getEditText().getText().toString().equals("Malerkotla")||
//                                            destination.getEditText().getText().toString().equals("Malethu Kanak")||
//                                            destination.getEditText().getText().toString().equals("Malhargarh")||
//                                            destination.getEditText().getText().toString().equals("Malhour")||
//                                            destination.getEditText().getText().toString().equals("Malihabad")||
//                                            destination.getEditText().getText().toString().equals("Malipur")||
//                                            destination.getEditText().getText().toString().equals("Maliya Hatina")||
//                                            destination.getEditText().getText().toString().equals("Maliya Miyana")||
//                                            destination.getEditText().getText().toString().equals("Malkapur")||
//                                            destination.getEditText().getText().toString().equals("Malkhaid Road")||
//                                            destination.getEditText().getText().toString().equals("Malkisar")||
//                                            destination.getEditText().getText().toString().equals("Mallanwala Khas")||
//                                            destination.getEditText().getText().toString().equals("Malleswaram")||
//                                            destination.getEditText().getText().toString().equals("Malliyam")||
//                                            destination.getEditText().getText().toString().equals("Malout")||
//                                            destination.getEditText().getText().toString().equals("Malpura")||
//                                            destination.getEditText().getText().toString().equals("Malsailu")||
//                                            destination.getEditText().getText().toString().equals("Malsian Shahkht")||
//                                            destination.getEditText().getText().toString().equals("Malugur")||
//                                            destination.getEditText().getText().toString().equals("Malur")||
//                                            destination.getEditText().getText().toString().equals("Malwan")||
//                                            destination.getEditText().getText().toString().equals("Malwara")||
//                                            destination.getEditText().getText().toString().equals("Maman")||
//                                            destination.getEditText().getText().toString().equals("Manaksar")||
//                                            destination.getEditText().getText().toString().equals("Manamadurai Junction")||
//                                            destination.getEditText().getText().toString().equals("Mananpur")||
//                                            destination.getEditText().getText().toString().equals("Manaparai")||
//                                            destination.getEditText().getText().toString().equals("Manauri railway station")||
//                                            destination.getEditText().getText().toString().equals("Manavadar")||
//                                            destination.getEditText().getText().toString().equals("Mancherial")||
//                                            destination.getEditText().getText().toString().equals("Mancheswar")||
//                                            destination.getEditText().getText().toString().equals("Manda Road")||
//                                            destination.getEditText().getText().toString().equals("Mandagere")||
//                                            destination.getEditText().getText().toString().equals("Mandal")||
//                                            destination.getEditText().getText().toString().equals("Mandalgarh")||
//                                            destination.getEditText().getText().toString().equals("Mandapam")||
//                                            destination.getEditText().getText().toString().equals("Mandapam Camp")||
//                                            destination.getEditText().getText().toString().equals("Mandar Hill")||
//                                            destination.getEditText().getText().toString().equals("Mandasa Road")||
//                                            destination.getEditText().getText().toString().equals("Mandasor")||
//                                            destination.getEditText().getText().toString().equals("Manderdisa")||
//                                            destination.getEditText().getText().toString().equals("Mandhana Junction, Kanpur")||
//                                            destination.getEditText().getText().toString().equals("Mandi Adampur")||
//                                            destination.getEditText().getText().toString().equals("Mandi Bamora")||
//                                            destination.getEditText().getText().toString().equals("Mandi Dabwali")||
//                                            destination.getEditText().getText().toString().equals("Mandi Dhanaura")||
//                                            destination.getEditText().getText().toString().equals("Mandi Dip")||
//                                            destination.getEditText().getText().toString().equals("Mandla Fort")||
//                                            destination.getEditText().getText().toString().equals("Mandor")||
//                                            destination.getEditText().getText().toString().equals("Mandrak")||
//                                            destination.getEditText().getText().toString().equals("Manduadih")||
//                                            destination.getEditText().getText().toString().equals("Mandya")||
//                                            destination.getEditText().getText().toString().equals("Manendragarh")||
//                                            destination.getEditText().getText().toString().equals("Mangalagiri")||
//                                            destination.getEditText().getText().toString().equals("Mangaliyawas")||
//                                            destination.getEditText().getText().toString().equals("Mangaluru Central")||
//                                            destination.getEditText().getText().toString().equals("Mangaluru Junction")||
//                                            destination.getEditText().getText().toString().equals("Mangaon")||
//                                            destination.getEditText().getText().toString().equals("Mangliya Gaon")||
//                                            destination.getEditText().getText().toString().equals("Mangolpuri")||
//                                            destination.getEditText().getText().toString().equals("Mangra")||
//                                            destination.getEditText().getText().toString().equals("Manheru")||
//                                            destination.getEditText().getText().toString().equals("Manigachi")||
//                                            destination.getEditText().getText().toString().equals("Manikpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Maninagar")||
//                                            destination.getEditText().getText().toString().equals("Manipur Bagan")||
//                                            destination.getEditText().getText().toString().equals("Vanchi Maniyachchi Junction")||
//                                            destination.getEditText().getText().toString().equals("Manjeshwar")||
//                                            destination.getEditText().getText().toString().equals("Mankapur Junction")||
//                                            destination.getEditText().getText().toString().equals("Mankar")||
//                                            destination.getEditText().getText().toString().equals("Mankarai")||
//                                            destination.getEditText().getText().toString().equals("Mankatha")||
//                                            destination.getEditText().getText().toString().equals("Mankhurd")||
//                                            destination.getEditText().getText().toString().equals("Manki")||
//                                            destination.getEditText().getText().toString().equals("Manmad Junction")||
//                                            destination.getEditText().getText().toString().equals("Mannanur")||
//                                            destination.getEditText().getText().toString().equals("Manoharganj")||
//                                            destination.getEditText().getText().toString().equals("Manoharpur")||
//                                            destination.getEditText().getText().toString().equals("Mansa")||
//                                            destination.getEditText().getText().toString().equals("Mansarovar")||
//                                            destination.getEditText().getText().toString().equals("Mansi Junction")||
//                                            destination.getEditText().getText().toString().equals("Mansurpur")||
//                                            destination.getEditText().getText().toString().equals("Manthralayam Road")||
//                                            destination.getEditText().getText().toString().equals("Manuguru")||
//                                            destination.getEditText().getText().toString().equals("Manwal")||
//                                            destination.getEditText().getText().toString().equals("Manwath Road")||
//                                            destination.getEditText().getText().toString().equals("Manzurgarhi")||
//                                            destination.getEditText().getText().toString().equals("Marahra")||
//                                            destination.getEditText().getText().toString().equals("Maramjhiri")||
//                                            destination.getEditText().getText().toString().equals("Marauda")||
//                                            destination.getEditText().getText().toString().equals("Mariahu")||
//                                            destination.getEditText().getText().toString().equals("Mariani Junction")||
//                                            destination.getEditText().getText().toString().equals("Marikuppam")||
//                                            destination.getEditText().getText().toString().equals("Marine Lines")||
//                                            destination.getEditText().getText().toString().equals("Maripat")||
//                                            destination.getEditText().getText().toString().equals("Markapur Road")||
//                                            destination.getEditText().getText().toString().equals("Markundi")||
//                                            destination.getEditText().getText().toString().equals("Maroli")||
//                                            destination.getEditText().getText().toString().equals("Marsul")||
//                                            destination.getEditText().getText().toString().equals("Marthipalayam")||
//                                            destination.getEditText().getText().toString().equals("Marwar Bagra")||
//                                            destination.getEditText().getText().toString().equals("Marwar Balia")||
//                                            destination.getEditText().getText().toString().equals("Marwar Bhinmal")||
//                                            destination.getEditText().getText().toString().equals("Marwar Birthi")||
//                                            destination.getEditText().getText().toString().equals("Marwar Chapri")||
//                                            destination.getEditText().getText().toString().equals("Marwar Junction")||
//                                            destination.getEditText().getText().toString().equals("Marwar Kori")||
//                                            destination.getEditText().getText().toString().equals("Marwar Lohwat")||
//                                            destination.getEditText().getText().toString().equals("Marwar Mathanya")||
//                                            destination.getEditText().getText().toString().equals("Marwar Ratanpur")||
//                                            destination.getEditText().getText().toString().equals("Masit")||
//                                            destination.getEditText().getText().toString().equals("Masjid Bunder")||
//                                            destination.getEditText().getText().toString().equals("Maskanwa")||
//                                            destination.getEditText().getText().toString().equals("Masodha")||
//                                            destination.getEditText().getText().toString().equals("Masrakh")||
//                                            destination.getEditText().getText().toString().equals("Masur")||
//                                            destination.getEditText().getText().toString().equals("Matana Buzurg")||
//                                            destination.getEditText().getText().toString().equals("Mataundh")||
//                                            destination.getEditText().getText().toString().equals("Mathura Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Mathura Junction")||
//                                            destination.getEditText().getText().toString().equals("Matlabpur")||
//                                            destination.getEditText().getText().toString().equals("Matmari")||
//                                            destination.getEditText().getText().toString().equals("Mattancheri Halt")||
//                                            destination.getEditText().getText().toString().equals("Matunga")||
//                                            destination.getEditText().getText().toString().equals("Matunga Road")||
//                                            destination.getEditText().getText().toString().equals("Mau Aimma")||
//                                            destination.getEditText().getText().toString().equals("Mau Junction")||
//                                            destination.getEditText().getText().toString().equals("Mau Ranipur")||
//                                            destination.getEditText().getText().toString().equals("Maur")||
//                                            destination.getEditText().getText().toString().equals("Maval")||
//                                            destination.getEditText().getText().toString().equals("Mavelikara")||
//                                            destination.getEditText().getText().toString().equals("Mavli Junction")||
//                                            destination.getEditText().getText().toString().equals("Mayanoor")||
//                                            destination.getEditText().getText().toString().equals("Mayiladuturai Junction")||
//                                            destination.getEditText().getText().toString().equals("Mayyanad")||
//                                            destination.getEditText().getText().toString().equals("Mazhama Rajwansher")||
//                                            destination.getEditText().getText().toString().equals("Mazhom")||
//                                            destination.getEditText().getText().toString().equals("McCluskieganj")||
//                                            destination.getEditText().getText().toString().equals("Mecheda")||
//                                            destination.getEditText().getText().toString().equals("Medchal")||
//                                            destination.getEditText().getText().toString().equals("Meerut Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Meerut City")||
//                                            destination.getEditText().getText().toString().equals("Meghnagar")||
//                                            destination.getEditText().getText().toString().equals("Mehnar Road")||
//                                            destination.getEditText().getText().toString().equals("Mehsi")||
//                                            destination.getEditText().getText().toString().equals("Meja Road")||
//                                            destination.getEditText().getText().toString().equals("Melmaruvattur")||
//                                            destination.getEditText().getText().toString().equals("Melusar")||
//                                            destination.getEditText().getText().toString().equals("Mendipathar")||
//                                            destination.getEditText().getText().toString().equals("Memari")||
//                                            destination.getEditText().getText().toString().equals("Meralgram")||
//                                            destination.getEditText().getText().toString().equals("Merta City")||
//                                            destination.getEditText().getText().toString().equals("Merta Road Junction")||
//                                            destination.getEditText().getText().toString().equals("Mettur")||
//                                            destination.getEditText().getText().toString().equals("Metupalaiyam")||
//                                            destination.getEditText().getText().toString().equals("Mettur Dam")||
//                                            destination.getEditText().getText().toString().equals("Mhasavad")||
//                                            destination.getEditText().getText().toString().equals("Mahemdavad Kheda Road")||
//                                            destination.getEditText().getText().toString().equals("Mhow")||
//                                            destination.getEditText().getText().toString().equals("Midnapore")||
//                                            destination.getEditText().getText().toString().equals("Migrendisa")||
//                                            destination.getEditText().getText().toString().equals("Mihinpurwa")||
//                                            destination.getEditText().getText().toString().equals("Mihrawan")||
//                                            destination.getEditText().getText().toString().equals("Milak")||
//                                            destination.getEditText().getText().toString().equals("Minjur")||
//                                            destination.getEditText().getText().toString().equals("Miraj Junction")||
//                                            destination.getEditText().getText().toString().equals("Miranpur Katra")||
//                                            destination.getEditText().getText().toString().equals("Mira Road")||
//                                            destination.getEditText().getText().toString().equals("Mirchadhori")||
//                                            destination.getEditText().getText().toString().equals("Mirhakur")||
//                                            destination.getEditText().getText().toString().equals("Mirthal")||
//                                            destination.getEditText().getText().toString().equals("Mirza")||
//                                            destination.getEditText().getText().toString().equals("Mirzapali")||
//                                            destination.getEditText().getText().toString().equals("Miryalaguda")||
//                                            destination.getEditText().getText().toString().equals("Mirzapur")||
//                                            destination.getEditText().getText().toString().equals("Misamari")||
//                                            destination.getEditText().getText().toString().equals("Misrauli")||
//                                            destination.getEditText().getText().toString().equals("Mitha")||
//                                            destination.getEditText().getText().toString().equals("Mithapur")||
//                                            destination.getEditText().getText().toString().equals("Miyagam Karjan")||
//                                            destination.getEditText().getText().toString().equals("Miyana")||
//                                            destination.getEditText().getText().toString().equals("Miyona ka Bara")||
//                                            destination.getEditText().getText().toString().equals("Modelgram")||
//                                            destination.getEditText().getText().toString().equals("Modinagar")||
//                                            destination.getEditText().getText().toString().equals("Modnimb")||
//                                            destination.getEditText().getText().toString().equals("Modpur")||
//                                            destination.getEditText().getText().toString().equals("Modran")||
//                                            destination.getEditText().getText().toString().equals("Moga")||
//                                            destination.getEditText().getText().toString().equals("Mohammadkhera")||
//                                            destination.getEditText().getText().toString().equals("Mohanlalganj")||
//                                            destination.getEditText().getText().toString().equals("Mohiuddinnagar")||
//                                            destination.getEditText().getText().toString().equals("Mohiuddinpur")||
//                                            destination.getEditText().getText().toString().equals("Mohol")||
//                                            destination.getEditText().getText().toString().equals("Mohri")||
//                                            destination.getEditText().getText().toString().equals("Mokalsar")||
//                                            destination.getEditText().getText().toString().equals("Mokama Junction")||
//                                            destination.getEditText().getText().toString().equals("Mokholi")||
//                                            destination.getEditText().getText().toString().equals("Monabari")||
//                                            destination.getEditText().getText().toString().equals("Monacherra")||
//                                            destination.getEditText().getText().toString().equals("Mondh")||
//                                            destination.getEditText().getText().toString().equals("Munger")||
//                                            destination.getEditText().getText().toString().equals("Monglajhora")||
//                                            destination.getEditText().getText().toString().equals("Moore Market Complex (Chennai Central Suburban)")||
//                                            destination.getEditText().getText().toString().equals("Moradabad")||
//                                            destination.getEditText().getText().toString().equals("Morak")||
//                                            destination.getEditText().getText().toString().equals("Morappur")||
//                                            destination.getEditText().getText().toString().equals("Morbi")||
//                                            destination.getEditText().getText().toString().equals("Mordar")||
//                                            destination.getEditText().getText().toString().equals("Morena")||
//                                            destination.getEditText().getText().toString().equals("Mori Bera")||
//                                            destination.getEditText().getText().toString().equals("Morinda")||
//                                            destination.getEditText().getText().toString().equals("Morthala")||
//                                            destination.getEditText().getText().toString().equals("Mota Jadra")||
//                                            destination.getEditText().getText().toString().equals("Moterjhar")||
//                                            destination.getEditText().getText().toString().equals("Moth")||
//                                            destination.getEditText().getText().toString().equals("Mothala")||
//                                            destination.getEditText().getText().toString().equals("Mothala Halt")||
//                                            destination.getEditText().getText().toString().equals("Motichur")||
//                                            destination.getEditText().getText().toString().equals("Bapudham Motihari")||
//                                            destination.getEditText().getText().toString().equals("Motipur")||
//                                            destination.getEditText().getText().toString().equals("Motipura Chauki")||
//                                            destination.getEditText().getText().toString().equals("Moula-Ali")||
//                                            destination.getEditText().getText().toString().equals("Muddanuru")||
//                                            destination.getEditText().getText().toString().equals("Mudkhed Junction")||
//                                            destination.getEditText().getText().toString().equals("Muftiganj")||
//                                            destination.getEditText().getText().toString().equals("Mughal Sarai Junction")||
//                                            destination.getEditText().getText().toString().equals("Muhammadabad")||
//                                            destination.getEditText().getText().toString().equals("Muirpur Road")||
//                                            destination.getEditText().getText().toString().equals("Mukerian")||
//                                            destination.getEditText().getText().toString().equals("Mukhtiar Balwar")||
//                                            destination.getEditText().getText().toString().equals("Muktsar")||
//                                            destination.getEditText().getText().toString().equals("Mukundarayapuram")||
//                                            destination.getEditText().getText().toString().equals("Muli Road")||
//                                            destination.getEditText().getText().toString().equals("Mulki")||
//                                            destination.getEditText().getText().toString().equals("Mullanpur")||
//                                            destination.getEditText().getText().toString().equals("Mulanur")||
//                                            destination.getEditText().getText().toString().equals("Multai")||
//                                            destination.getEditText().getText().toString().equals("Mulund")||
//                                            destination.getEditText().getText().toString().equals("Mumbai Central")||
//                                            destination.getEditText().getText().toString().equals("Mumbra")||
//                                            destination.getEditText().getText().toString().equals("Munabao")||
//                                            destination.getEditText().getText().toString().equals("Mundalaram")||
//                                            destination.getEditText().getText().toString().equals("Mundha Pande")||
//                                            destination.getEditText().getText().toString().equals("Mundhewadi")||
//                                            destination.getEditText().getText().toString().equals("Mungaoli")||
//                                            destination.getEditText().getText().toString().equals("Muniguda")||
//                                            destination.getEditText().getText().toString().equals("Munirabad")||
//                                            destination.getEditText().getText().toString().equals("Munroturuttu")||
//                                            destination.getEditText().getText().toString().equals("Mupa")||
//                                            destination.getEditText().getText().toString().equals("Muradnagar")||
//                                            destination.getEditText().getText().toString().equals("Murdeshwar")||
//                                            destination.getEditText().getText().toString().equals("Murdeshwar")||
//                                            destination.getEditText().getText().toString().equals("Muri")||
//                                            destination.getEditText().getText().toString().equals("Murkeongselek")||
//                                            destination.getEditText().getText().toString().equals("Murliganj")||
//                                            destination.getEditText().getText().toString().equals("Murshadpur")||
//                                            destination.getEditText().getText().toString().equals("Murshidabad")||
//                                            destination.getEditText().getText().toString().equals("Murtizapur Junction")||
//                                            destination.getEditText().getText().toString().equals("Musafir Khana")||
//                                            destination.getEditText().getText().toString().equals("Mustafabad")||
//                                            destination.getEditText().getText().toString().equals("Muttarasanallur")||
//                                            destination.getEditText().getText().toString().equals("Mutupet")||
//                                            destination.getEditText().getText().toString().equals("Muzaffarnagar")||
//                                            destination.getEditText().getText().toString().equals("Muzaffarpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Muzzampur Narayan")||
//                                            destination.getEditText().getText().toString().equals("Mysuru Junction")||
//                                            destination.getEditText().getText().toString().equals("Naya Ghaziabad")||
//                                            destination.getEditText().getText().toString().equals("N J Ramanal")||
//                                            destination.getEditText().getText().toString().equals("Nabadwip Dham")||
//                                            destination.getEditText().getText().toString().equals("Nabha")||
//                                            destination.getEditText().getText().toString().equals("Nadauj")||
//                                            destination.getEditText().getText().toString().equals("Nadiad Junction")||
//                                            destination.getEditText().getText().toString().equals("Nandikoor")||
//                                            destination.getEditText().getText().toString().equals("Nadikudi")||
//                                            destination.getEditText().getText().toString().equals("Nagal")||
//                                            destination.getEditText().getText().toString().equals("Naganahalli")||
//                                            destination.getEditText().getText().toString().equals("Nagaon")||
//                                            destination.getEditText().getText().toString().equals("Nagappattinam junction")||
//                                            destination.getEditText().getText().toString().equals("Nagar")||
//                                            destination.getEditText().getText().toString().equals("Nagar Untari")||
//                                            destination.getEditText().getText().toString().equals("Nagercoil Junction")||
//                                            destination.getEditText().getText().toString().equals("Nagardevla")||
//                                            destination.getEditText().getText().toString().equals("Nagargali")||
//                                            destination.getEditText().getText().toString().equals("Nagari")||
//                                            destination.getEditText().getText().toString().equals("Nagaria Sadat")||
//                                            destination.getEditText().getText().toString().equals("Nagarur")||
//                                            destination.getEditText().getText().toString().equals("Nagaur")||
//                                            destination.getEditText().getText().toString().equals("Nagbhir Junction")||
//                                            destination.getEditText().getText().toString().equals("Nagda Junction")||
//                                            destination.getEditText().getText().toString().equals("Nagercoil Town")||
//                                            destination.getEditText().getText().toString().equals("Nagina")||
//                                            destination.getEditText().getText().toString().equals("Naglatula")||
//                                            destination.getEditText().getText().toString().equals("Nagore")||
//                                            destination.getEditText().getText().toString().equals("Nagpur")||
//                                            destination.getEditText().getText().toString().equals("Nagrota")||
//                                            destination.getEditText().getText().toString().equals("Naharkatiya")||
//                                            destination.getEditText().getText().toString().equals("Naharlagun")||
//                                            destination.getEditText().getText().toString().equals("Nahur")||
//                                            destination.getEditText().getText().toString().equals("Naigaon")||
//                                            destination.getEditText().getText().toString().equals("Naihati Junction")||
//                                            destination.getEditText().getText().toString().equals("Naikheri")||
//                                            destination.getEditText().getText().toString().equals("Naila")||
//                                            destination.getEditText().getText().toString().equals("Naini")||
//                                            destination.getEditText().getText().toString().equals("Nainpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Najibabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Nakodar Junction")||
//                                            destination.getEditText().getText().toString().equals("Nalanda")||
//                                            destination.getEditText().getText().toString().equals("Nala Sopara")||
//                                            destination.getEditText().getText().toString().equals("Nalbari")||
//                                            destination.getEditText().getText().toString().equals("Nalgonda")||
//                                            destination.getEditText().getText().toString().equals("Nalhati")||
//                                            destination.getEditText().getText().toString().equals("Naliya")||
//                                            destination.getEditText().getText().toString().equals("Naliya Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Nalwar")||
//                                            destination.getEditText().getText().toString().equals("Namakkal")||
//                                            destination.getEditText().getText().toString().equals("Namburu")||
//                                            destination.getEditText().getText().toString().equals("Namkom")||
//                                            destination.getEditText().getText().toString().equals("Namli")||
//                                            destination.getEditText().getText().toString().equals("Namrup")||
//                                            destination.getEditText().getText().toString().equals("Nana")||
//                                            destination.getEditText().getText().toString().equals("Nana Bhamodra")||
//                                            destination.getEditText().getText().toString().equals("Nanaksar")||
//                                            destination.getEditText().getText().toString().equals("Nandalur")||
//                                            destination.getEditText().getText().toString().equals("Nandapur")||
//                                            destination.getEditText().getText().toString().equals("Hazur Sahib Nanded")||
//                                            destination.getEditText().getText().toString().equals("Nandesari")||
//                                            destination.getEditText().getText().toString().equals("Nandganj")||
//                                            destination.getEditText().getText().toString().equals("Nandgaon")||
//                                            destination.getEditText().getText().toString().equals("Nandgaon Road")||
//                                            destination.getEditText().getText().toString().equals("Nandiambakkam")||
//                                            destination.getEditText().getText().toString().equals("Nandol Dehegam")||
//                                            destination.getEditText().getText().toString().equals("Nandura")||
//                                            destination.getEditText().getText().toString().equals("Nandurbar")||
//                                            destination.getEditText().getText().toString().equals("Nandyal Junction")||
//                                            destination.getEditText().getText().toString().equals("Nangal Dam")||
//                                            destination.getEditText().getText().toString().equals("Nangloi")||
//                                            destination.getEditText().getText().toString().equals("Nanguneri")||
//                                            destination.getEditText().getText().toString().equals("Nanjangud Town")||
//                                            destination.getEditText().getText().toString().equals("Nanpara Junction")||
//                                            destination.getEditText().getText().toString().equals("Naojan")||
//                                            destination.getEditText().getText().toString().equals("Napasar")||
//                                            destination.getEditText().getText().toString().equals("Nar Town")||
//                                            destination.getEditText().getText().toString().equals("Naraikkinar")||
//                                            destination.getEditText().getText().toString().equals("Naraina")||
//                                            destination.getEditText().getText().toString().equals("Narangi")||
//                                            destination.getEditText().getText().toString().equals("Naranjipur")||
//                                            destination.getEditText().getText().toString().equals("Narasapur")||
//                                            destination.getEditText().getText().toString().equals("Narasaraopet")||
//                                            destination.getEditText().getText().toString().equals("Narayanpet Road")||
//                                            destination.getEditText().getText().toString().equals("Narayanpur")||
//                                            destination.getEditText().getText().toString().equals("Narayanpur Anant")||
//                                            destination.getEditText().getText().toString().equals("Nardana")||
//                                            destination.getEditText().getText().toString().equals("Narela")||
//                                            destination.getEditText().getText().toString().equals("Nari Road")||
//                                            destination.getEditText().getText().toString().equals("Nariaoli")||
//                                            destination.getEditText().getText().toString().equals("Narkatiaganj Junction")||
//                                            destination.getEditText().getText().toString().equals("Narkher")||
//                                            destination.getEditText().getText().toString().equals("Narnaul")||
//                                            destination.getEditText().getText().toString().equals("Naroda")||
//                                            destination.getEditText().getText().toString().equals("Narsinghpur")||
//                                            destination.getEditText().getText().toString().equals("Narwana Junction")||
//                                            destination.getEditText().getText().toString().equals("Narwasi")||
//                                            destination.getEditText().getText().toString().equals("Nasik Road")||
//                                            destination.getEditText().getText().toString().equals("Nasirabad")||
//                                            destination.getEditText().getText().toString().equals("Nathdwara")||
//                                            destination.getEditText().getText().toString().equals("Nathwana")||
//                                            destination.getEditText().getText().toString().equals("Naugachia")||
//                                            destination.getEditText().getText().toString().equals("Nauganwan")||
//                                            destination.getEditText().getText().toString().equals("Naugarh")||
//                                            destination.getEditText().getText().toString().equals("Naupada Junction")||
//                                            destination.getEditText().getText().toString().equals("Nautanwa")||
//                                            destination.getEditText().getText().toString().equals("Navade Road")||
//                                            destination.getEditText().getText().toString().equals("Navagadh")||
//                                            destination.getEditText().getText().toString().equals("Navalur")||
//                                            destination.getEditText().getText().toString().equals("Navapur")||
//                                            destination.getEditText().getText().toString().equals("Navlakhi")||
//                                            destination.getEditText().getText().toString().equals("Navsari")||
//                                            destination.getEditText().getText().toString().equals("Nawa City")||
//                                            destination.getEditText().getText().toString().equals("Nawadah")||
//                                            destination.getEditText().getText().toString().equals("Nawagaon")||
//                                            destination.getEditText().getText().toString().equals("Nawalgarh")||
//                                            destination.getEditText().getText().toString().equals("Nawalgohan")||
//                                            destination.getEditText().getText().toString().equals("Naya Azadpur")||
//                                            destination.getEditText().getText().toString().equals("Naya Kharadia")||
//                                            destination.getEditText().getText().toString().equals("Naya Nangal")||
//                                            destination.getEditText().getText().toString().equals("Nayadupeta")||
//                                            destination.getEditText().getText().toString().equals("Nayagaon")||
//                                            destination.getEditText().getText().toString().equals("Naydongri")||
//                                            destination.getEditText().getText().toString().equals("Nazareth")||
//                                            destination.getEditText().getText().toString().equals("Nazirganj")||
//                                            destination.getEditText().getText().toString().equals("Nekonda")||
//                                            destination.getEditText().getText().toString().equals("Nellimaria")||
//                                            destination.getEditText().getText().toString().equals("Nellore")||
//                                            destination.getEditText().getText().toString().equals("Nemilichery")||
//                                            destination.getEditText().getText().toString().equals("Nemom")||
//                                            destination.getEditText().getText().toString().equals("Nenpur")||
//                                            destination.getEditText().getText().toString().equals("Nepalganj Road")||
//                                            destination.getEditText().getText().toString().equals("Nepanagar")||
//                                            destination.getEditText().getText().toString().equals("Neral")||
//                                            destination.getEditText().getText().toString().equals("Nergundi")||
//                                            destination.getEditText().getText().toString().equals("Neri")||
//                                            destination.getEditText().getText().toString().equals("Nerul")||
//                                            destination.getEditText().getText().toString().equals("Netawal")||
//                                            destination.getEditText().getText().toString().equals("New Alipurduar")||
//                                            destination.getEditText().getText().toString().equals("New Bhuj")||
//                                            destination.getEditText().getText().toString().equals("New Bhuj")||
//                                            destination.getEditText().getText().toString().equals("New Bongaigaon Junction")||
//                                            destination.getEditText().getText().toString().equals("New Cooch Behar")||
//                                            destination.getEditText().getText().toString().equals("New Delhi")||
//                                            destination.getEditText().getText().toString().equals("New Farakka Junction")||
//                                            destination.getEditText().getText().toString().equals("New Garia")||
//                                            destination.getEditText().getText().toString().equals("New Giridih")||
//                                            destination.getEditText().getText().toString().equals("New Gitldada Junction")||
//                                            destination.getEditText().getText().toString().equals("New Guntur")||
//                                            destination.getEditText().getText().toString().equals("New Jalpaiguri")||
//                                            destination.getEditText().getText().toString().equals("New Mal Junction")||
//                                            destination.getEditText().getText().toString().equals("New Maynaguri")||
//                                            destination.getEditText().getText().toString().equals("New Misamari")||
//                                            destination.getEditText().getText().toString().equals("Neyveli")||
//                                            destination.getEditText().getText().toString().equals("Neyyattinkara")||
//                                            destination.getEditText().getText().toString().equals("Ngrjunanagaramu")||
//                                            destination.getEditText().getText().toString().equals("Nibhapur")||
//                                            destination.getEditText().getText().toString().equals("Nidadavolu Junction")||
//                                            destination.getEditText().getText().toString().equals("Nidamangalam Junction")||
//                                            destination.getEditText().getText().toString().equals("Nidubrolu")||
//                                            destination.getEditText().getText().toString().equals("Nigohan")||
//                                            destination.getEditText().getText().toString().equals("Nihalgarh")||
//                                            destination.getEditText().getText().toString().equals("Nilaje")||
//                                            destination.getEditText().getText().toString().equals("Nilambazar")||
//                                            destination.getEditText().getText().toString().equals("Nilambur Road")||
//                                            destination.getEditText().getText().toString().equals("Nileshwar")||
//                                            destination.getEditText().getText().toString().equals("Nilokheri")||
//                                            destination.getEditText().getText().toString().equals("Nim Ka Thana")||
//                                            destination.getEditText().getText().toString().equals("Nimach")||
//                                            destination.getEditText().getText().toString().equals("Nimar Kheri")||
//                                            destination.getEditText().getText().toString().equals("Nimbahera")||
//                                            destination.getEditText().getText().toString().equals("Nimbhora")||
//                                            destination.getEditText().getText().toString().equals("Nimtita")||
//                                            destination.getEditText().getText().toString().equals("Nindhar Benar")||
//                                            destination.getEditText().getText().toString().equals("Ningala Junction")||
//                                            destination.getEditText().getText().toString().equals("Nipani Vadgaon")||
//                                            destination.getEditText().getText().toString().equals("Niphad")||
//                                            destination.getEditText().getText().toString().equals("Nira")||
//                                            destination.getEditText().getText().toString().equals("Nirakarpur")||
//                                            destination.getEditText().getText().toString().equals("Nirmali")||
//                                            destination.getEditText().getText().toString().equals("Nisui")||
//                                            destination.getEditText().getText().toString().equals("Nivari")||
//                                            destination.getEditText().getText().toString().equals("Nivasar")||
//                                            destination.getEditText().getText().toString().equals("Nizamabad")||
//                                            destination.getEditText().getText().toString().equals("Nizampur")||
//                                            destination.getEditText().getText().toString().equals("Nizbarganj")||
//                                            destination.getEditText().getText().toString().equals("Nizchatia")||
//                                            destination.getEditText().getText().toString().equals("Noamundi")||
//                                            destination.getEditText().getText().toString().equals("Nohar")||
//                                            destination.getEditText().getText().toString().equals("Nokha")||
//                                            destination.getEditText().getText().toString().equals("Nomoda")||
//                                            destination.getEditText().getText().toString().equals("Nonera")||
//                                            destination.getEditText().getText().toString().equals("Norla Road")||
//                                            destination.getEditText().getText().toString().equals("North Lakhimpur")||
//                                            destination.getEditText().getText().toString().equals("Nosaria")||
//                                            destination.getEditText().getText().toString().equals("Nowrozabad")||
//                                            destination.getEditText().getText().toString().equals("Noyal")||
//                                            destination.getEditText().getText().toString().equals("Narayanpur Tatwar")||
//                                            destination.getEditText().getText().toString().equals("Nua")||
//                                            destination.getEditText().getText().toString().equals("Nunkhar")||
//                                            destination.getEditText().getText().toString().equals("Nurmahal")||
//                                            destination.getEditText().getText().toString().equals("Okha")||
//                                            destination.getEditText().getText().toString().equals("Old Delhi Junction")||
//                                            destination.getEditText().getText().toString().equals("Old Malda Junction")||
//                                            destination.getEditText().getText().toString().equals("Omkareshwar Road")||
//                                            destination.getEditText().getText().toString().equals("Ondagram")||
//                                            destination.getEditText().getText().toString().equals("Ongole")||
//                                            destination.getEditText().getText().toString().equals("Ontimitta")||
//                                            destination.getEditText().getText().toString().equals("Orai")||
//                                            destination.getEditText().getText().toString().equals("Ottapalam")||
//                                            destination.getEditText().getText().toString().equals("Oorgaum")||
//                                            destination.getEditText().getText().toString().equals("Pabai")||
//                                            destination.getEditText().getText().toString().equals("Pabli Khas")||
//                                            destination.getEditText().getText().toString().equals("Pachrukhi")||
//                                            destination.getEditText().getText().toString().equals("Pachhapur")||
//                                            destination.getEditText().getText().toString().equals("Pachor Road")||
//                                            destination.getEditText().getText().toString().equals("Pachora Junction")||
//                                            destination.getEditText().getText().toString().equals("Pachperwa")||
//                                            destination.getEditText().getText().toString().equals("Paddhari")||
//                                            destination.getEditText().getText().toString().equals("Padhegaon")||
//                                            destination.getEditText().getText().toString().equals("Padrauna")||
//                                            destination.getEditText().getText().toString().equals("Padse")||
//                                            destination.getEditText().getText().toString().equals("Padubidri")||
//                                            destination.getEditText().getText().toString().equals("Pagara")||
//                                            destination.getEditText().getText().toString().equals("Pahara")||
//                                            destination.getEditText().getText().toString().equals("Paharpur")||
//                                            destination.getEditText().getText().toString().equals("Pajian")||
//                                            destination.getEditText().getText().toString().equals("Pakala Junction")||
//                                            destination.getEditText().getText().toString().equals("Pakki")||
//                                            destination.getEditText().getText().toString().equals("Pakur")||
//                                            destination.getEditText().getText().toString().equals("Palachauri")||
//                                            destination.getEditText().getText().toString().equals("Palam")||
//                                            destination.getEditText().getText().toString().equals("Palampur Himachal railway station")||
//                                            destination.getEditText().getText().toString().equals("Palampur HP OA")||
//                                            destination.getEditText().getText().toString().equals("Palana")||
//                                            destination.getEditText().getText().toString().equals("Palani")||
//                                            destination.getEditText().getText().toString().equals("Palanpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Palappuram")||
//                                            destination.getEditText().getText().toString().equals("Palasa")||
//                                            destination.getEditText().getText().toString().equals("Palasdari")||
//                                            destination.getEditText().getText().toString().equals("Paldhi")||
//                                            destination.getEditText().getText().toString().equals("Pahlejaghat Junction")||
//                                            destination.getEditText().getText().toString().equals("Palej")||
//                                            destination.getEditText().getText().toString().equals("Palghar")||
//                                            destination.getEditText().getText().toString().equals("Palakkad Junction")||
//                                            destination.getEditText().getText().toString().equals("Palakkad Town")||
//                                            destination.getEditText().getText().toString().equals("Palakollu")||
//                                            destination.getEditText().getText().toString().equals("Pali Marwar")||
//                                            destination.getEditText().getText().toString().equals("Palia")||
//                                            destination.getEditText().getText().toString().equals("Palia Kalan")||
//                                            destination.getEditText().getText().toString().equals("Palitana")||
//                                            destination.getEditText().getText().toString().equals("Palpara")||
//                                            destination.getEditText().getText().toString().equals("Palsana")||
//                                            destination.getEditText().getText().toString().equals("Palsora Makrawa")||
//                                            destination.getEditText().getText().toString().equals("Palwal")||
//                                            destination.getEditText().getText().toString().equals("Pamban Junction")||
//                                            destination.getEditText().getText().toString().equals("Pampur")||
//                                            destination.getEditText().getText().toString().equals("Panagarh")||
//                                            destination.getEditText().getText().toString().equals("Panbari")||
//                                            destination.getEditText().getText().toString().equals("Panch Pipila")||
//                                            destination.getEditText().getText().toString().equals("Panch Rukhi")||
//                                            destination.getEditText().getText().toString().equals("Pancharatna")||
//                                            destination.getEditText().getText().toString().equals("Panchgram")||
//                                            destination.getEditText().getText().toString().equals("Panchtalavda Rd")||
//                                            destination.getEditText().getText().toString().equals("Pandavapura")||
//                                            destination.getEditText().getText().toString().equals("Pandaravadai")||
//                                            destination.getEditText().getText().toString().equals("Pandharpur")||
//                                            destination.getEditText().getText().toString().equals("Pandhurna")||
//                                            destination.getEditText().getText().toString().equals("Pandoli")||
//                                            destination.getEditText().getText().toString().equals("Paneli Moti")||
//                                            destination.getEditText().getText().toString().equals("Paniahwa")||
//                                            destination.getEditText().getText().toString().equals("Panikhaiti")||
//                                            destination.getEditText().getText().toString().equals("Panipat Junction")||
//                                            destination.getEditText().getText().toString().equals("Panitola")||
//                                            destination.getEditText().getText().toString().equals("Panjhan")||
//                                            destination.getEditText().getText().toString().equals("Panki, Kanpur")||
//                                            destination.getEditText().getText().toString().equals("Panruti")||
//                                            destination.getEditText().getText().toString().equals("Panskura Junction")||
//                                            destination.getEditText().getText().toString().equals("Pantnagar")||
//                                            destination.getEditText().getText().toString().equals("Panvel")||
//                                            destination.getEditText().getText().toString().equals("Panzgom")||
//                                            destination.getEditText().getText().toString().equals("Papanasam")||
//                                            destination.getEditText().getText().toString().equals("Paradgaon")||
//                                            destination.getEditText().getText().toString().equals("Paralakhemundi")||
//                                            destination.getEditText().getText().toString().equals("Paramakkudi")||
//                                            destination.getEditText().getText().toString().equals("Paras")||
//                                            destination.getEditText().getText().toString().equals("Parasia")||
//                                            destination.getEditText().getText().toString().equals("Parasnath Station")||
//                                            destination.getEditText().getText().toString().equals("Paravur")||
//                                            destination.getEditText().getText().toString().equals("Parbati")||
//                                            destination.getEditText().getText().toString().equals("Parbhani Junction")||
//                                            destination.getEditText().getText().toString().equals("Pardhande")||
//                                            destination.getEditText().getText().toString().equals("Pardi")||
//                                            destination.getEditText().getText().toString().equals("Parel")||
//                                            destination.getEditText().getText().toString().equals("Parhihara")||
//                                            destination.getEditText().getText().toString().equals("Parkham")||
//                                            destination.getEditText().getText().toString().equals("Parli")||
//                                            destination.getEditText().getText().toString().equals("Parli Vaijnath")||
//                                            destination.getEditText().getText().toString().equals("Parlu")||
//                                            destination.getEditText().getText().toString().equals("Parappanangadi")||
//                                            destination.getEditText().getText().toString().equals("Parsa Bazar")||
//                                            destination.getEditText().getText().toString().equals("Parsa Khera")||
//                                            destination.getEditText().getText().toString().equals("Parsabad")||
//                                            destination.getEditText().getText().toString().equals("Parsipur")||
//                                            destination.getEditText().getText().toString().equals("Parsoda")||
//                                            destination.getEditText().getText().toString().equals("Partapgarh Junction")||
//                                            destination.getEditText().getText().toString().equals("Partapur, Uttar Pradesh")||
//                                            destination.getEditText().getText().toString().equals("Partur")||
//                                            destination.getEditText().getText().toString().equals("Parvatipuram")||
//                                            destination.getEditText().getText().toString().equals("Parvatipuram Town")||
//                                            destination.getEditText().getText().toString().equals("Pasur")||
//                                            destination.getEditText().getText().toString().equals("Patal Pani")||
//                                            destination.getEditText().getText().toString().equals("Patan")||
//                                            destination.getEditText().getText().toString().equals("Patara")||
//                                            destination.getEditText().getText().toString().equals("Patas")||
//                                            destination.getEditText().getText().toString().equals("Pataudi Road")||
//                                            destination.getEditText().getText().toString().equals("Pathankot Junction")||
//                                            destination.getEditText().getText().toString().equals("Pathankot Cantt")||
//                                            destination.getEditText().getText().toString().equals("Pathardih Junction")||
//                                            destination.getEditText().getText().toString().equals("Patharkandi")||
//                                            destination.getEditText().getText().toString().equals("Patharkhola S")||
//                                            destination.getEditText().getText().toString().equals("Patharia")||
//                                            destination.getEditText().getText().toString().equals("Pathauli")||
//                                            destination.getEditText().getText().toString().equals("Pathri")||
//                                            destination.getEditText().getText().toString().equals("Pathsala")||
//                                            destination.getEditText().getText().toString().equals("Patiala")||
//                                            destination.getEditText().getText().toString().equals("Patiladaha")||
//                                            destination.getEditText().getText().toString().equals("Patli")||
//                                            destination.getEditText().getText().toString().equals("Patna Junction")||
//                                            destination.getEditText().getText().toString().equals("Patna Saheb")||
//                                            destination.getEditText().getText().toString().equals("Patranga")||
//                                            destination.getEditText().getText().toString().equals("Patratu")||
//                                            destination.getEditText().getText().toString().equals("Patsul")||
//                                            destination.getEditText().getText().toString().equals("Pattabiram")||
//                                            destination.getEditText().getText().toString().equals("Pattabiram West")||
//                                            destination.getEditText().getText().toString().equals("Pattabiram East Depot")||
//                                            destination.getEditText().getText().toString().equals("Pattambi")||
//                                            destination.getEditText().getText().toString().equals("Pattan")||
//                                            destination.getEditText().getText().toString().equals("Pattaravakkam")||
//                                            destination.getEditText().getText().toString().equals("Pattukkottai")||
//                                            destination.getEditText().getText().toString().equals("Patti")||
//                                            destination.getEditText().getText().toString().equals("Pavur Chatram")||
//                                            destination.getEditText().getText().toString().equals("Pawapuri Road")||
//                                            destination.getEditText().getText().toString().equals("Payagpur")||
//                                            destination.getEditText().getText().toString().equals("Payangadi")||
//                                            destination.getEditText().getText().toString().equals("Payyanur")||
//                                            destination.getEditText().getText().toString().equals("Payyoli")||
//                                            destination.getEditText().getText().toString().equals("Peddapalli")||
//                                            destination.getEditText().getText().toString().equals("Pendra Road")||
//                                            destination.getEditText().getText().toString().equals("Penganga")||
//                                            destination.getEditText().getText().toString().equals("Penukonda")||
//                                            destination.getEditText().getText().toString().equals("Perambur")||
//                                            destination.getEditText().getText().toString().equals("Perambur Carriage Works")||
//                                            destination.getEditText().getText().toString().equals("Perambur Loco Works")||
//                                            destination.getEditText().getText().toString().equals("Pernem railway station")||
//                                            destination.getEditText().getText().toString().equals("Perugamani")||
//                                            destination.getEditText().getText().toString().equals("Petlad Junction")||
//                                            destination.getEditText().getText().toString().equals("Pethanaickenpalayam")||
//                                            destination.getEditText().getText().toString().equals("Pettaivayatalai")||
//                                            destination.getEditText().getText().toString().equals("Phagwara Junction")||
//                                            destination.getEditText().getText().toString().equals("Phakhoagram")||
//                                            destination.getEditText().getText().toString().equals("Phalodi")||
//                                            destination.getEditText().getText().toString().equals("Phanda")||
//                                            destination.getEditText().getText().toString().equals("Phaphamau Junction")||
//                                            destination.getEditText().getText().toString().equals("Phaphund")||
//                                            destination.getEditText().getText().toString().equals("Phephna Junction")||
//                                            destination.getEditText().getText().toString().equals("Phesar")||
//                                            destination.getEditText().getText().toString().equals("Phillaur Junction")||
//                                            destination.getEditText().getText().toString().equals("Phulad")||
//                                            destination.getEditText().getText().toString().equals("Phulaguri")||
//                                            destination.getEditText().getText().toString().equals("Phulera Junction")||
//                                            destination.getEditText().getText().toString().equals("Phulia")||
//                                            destination.getEditText().getText().toString().equals("Phulpur")||
//                                            destination.getEditText().getText().toString().equals("Pij")||
//                                            destination.getEditText().getText().toString().equals("Pilamedu(Coimbatore)")||
//                                            destination.getEditText().getText().toString().equals("Pili Bangan")||
//                                            destination.getEditText().getText().toString().equals("Pilibhit Junction railway station")||
//                                            destination.getEditText().getText().toString().equals("Pilioda")||
//                                            destination.getEditText().getText().toString().equals("Piler")||
//                                            destination.getEditText().getText().toString().equals("Pilkhua")||
//                                            destination.getEditText().getText().toString().equals("Pimpar Khed")||
//                                            destination.getEditText().getText().toString().equals("Pimpri")||
//                                            destination.getEditText().getText().toString().equals("Pindra Road")||
//                                            destination.getEditText().getText().toString().equals("Pingleshwar")||
//                                            destination.getEditText().getText().toString().equals("Pipalda Road")||
//                                            destination.getEditText().getText().toString().equals("Pipalsana")||
//                                            destination.getEditText().getText().toString().equals("Pipar Road Junction")||
//                                            destination.getEditText().getText().toString().equals("Pipariya")||
//                                            destination.getEditText().getText().toString().equals("Piparpur")||
//                                            destination.getEditText().getText().toString().equals("Piparsand")||
//                                            destination.getEditText().getText().toString().equals("Piplaj")||
//                                            destination.getEditText().getText().toString().equals("Piplee")||
//                                            destination.getEditText().getText().toString().equals("Piplia")||
//                                            destination.getEditText().getText().toString().equals("Piplod Junction")||
//                                            destination.getEditText().getText().toString().equals("Piploda Bagla")||
//                                            destination.getEditText().getText().toString().equals("Pipraich")||
//                                            destination.getEditText().getText().toString().equals("Pipraigaon")||
//                                            destination.getEditText().getText().toString().equals("Piprala")||
//                                            destination.getEditText().getText().toString().equals("Pipri Dih")||
//                                            destination.getEditText().getText().toString().equals("Pirjhalar")||
//                                            destination.getEditText().getText().toString().equals("Pirpainti")||
//                                            destination.getEditText().getText().toString().equals("Pirthiganj")||
//                                            destination.getEditText().getText().toString().equals("Pirumadara")||
//                                            destination.getEditText().getText().toString().equals("Pirwa")||
//                                            destination.getEditText().getText().toString().equals("Pitambarpur")||
//                                            destination.getEditText().getText().toString().equals("Pithapuram")||
//                                            destination.getEditText().getText().toString().equals("Plassey")||
//                                            destination.getEditText().getText().toString().equals("PMBAKVL_SHANDY")||
//                                            destination.getEditText().getText().toString().equals("Podanur Junction")||
//                                            destination.getEditText().getText().toString().equals("Pokhrayan")||
//                                            destination.getEditText().getText().toString().equals("Pokran")||
//                                            destination.getEditText().getText().toString().equals("Pollachi Junction")||
//                                            destination.getEditText().getText().toString().equals("Polur")||
//                                            destination.getEditText().getText().toString().equals("Ponmalai Golden Rock")||
//                                            destination.getEditText().getText().toString().equals("Ponneri")||
//                                            destination.getEditText().getText().toString().equals("Porbandar")||
//                                            destination.getEditText().getText().toString().equals("Potul")||
//                                            destination.getEditText().getText().toString().equals("Prabhadevi")||
//                                            destination.getEditText().getText().toString().equals("Prachi Road Junction")||
//                                            destination.getEditText().getText().toString().equals("Pranpur Road")||
//                                            destination.getEditText().getText().toString().equals("Prantij")||
//                                            destination.getEditText().getText().toString().equals("Prantik")||
//                                            destination.getEditText().getText().toString().equals("Pratapnagar")||
//                                            destination.getEditText().getText().toString().equals("Prayag Junction")||
//                                            destination.getEditText().getText().toString().equals("Prayag Ghat")||
//                                            destination.getEditText().getText().toString().equals("Pritam Nagar")||
//                                            destination.getEditText().getText().toString().equals("Proddatur")||
//                                            destination.getEditText().getText().toString().equals("Puducherry")||
//                                            destination.getEditText().getText().toString().equals("Pudukad")||
//                                            destination.getEditText().getText().toString().equals("Pudukkottai")||
//                                            destination.getEditText().getText().toString().equals("Pugalur")||
//                                            destination.getEditText().getText().toString().equals("Pulgaon Junction")||
//                                            destination.getEditText().getText().toString().equals("Punalur")||
//                                            destination.getEditText().getText().toString().equals("Punarakh")||
//                                            destination.getEditText().getText().toString().equals("Pundhag")||
//                                            destination.getEditText().getText().toString().equals("Pune Junction")||
//                                            destination.getEditText().getText().toString().equals("Punkunnam")||
//                                            destination.getEditText().getText().toString().equals("Punpun")||
//                                            destination.getEditText().getText().toString().equals("Puntamba")||
//                                            destination.getEditText().getText().toString().equals("Purab Sarai")||
//                                            destination.getEditText().getText().toString().equals("Puraini")||
//                                            destination.getEditText().getText().toString().equals("Puranigudam")||
//                                            destination.getEditText().getText().toString().equals("Puranpur")||
//                                            destination.getEditText().getText().toString().equals("Puri")||
//                                            destination.getEditText().getText().toString().equals("Purna Junction")||
//                                            destination.getEditText().getText().toString().equals("Purnia Junction")||
//                                            destination.getEditText().getText().toString().equals("Purnia Court")||
//                                            destination.getEditText().getText().toString().equals("Purua Khera")||
//                                            destination.getEditText().getText().toString().equals("Pusad")||
//                                            destination.getEditText().getText().toString().equals("Purulia Junction")||
//                                            destination.getEditText().getText().toString().equals("Puttur")||
//                                            destination.getEditText().getText().toString().equals("Quarry SDG")||
//                                            destination.getEditText().getText().toString().equals("Qazigund")||
//                                            destination.getEditText().getText().toString().equals("Rabale")||
//                                            destination.getEditText().getText().toString().equals("Radhanpur")||
//                                            destination.getEditText().getText().toString().equals("Radhikapur")||
//                                            destination.getEditText().getText().toString().equals("Rae Bareli Junction")||
//                                            destination.getEditText().getText().toString().equals("Rafiganj")||
//                                            destination.getEditText().getText().toString().equals("Ragaul")||
//                                            destination.getEditText().getText().toString().equals("Raghunathpur")||
//                                            destination.getEditText().getText().toString().equals("Raha")||
//                                            destination.getEditText().getText().toString().equals("Rahimabad, India")||
//                                            destination.getEditText().getText().toString().equals("Rahimatpur")||
//                                            destination.getEditText().getText().toString().equals("Rahul Road")||
//                                            destination.getEditText().getText().toString().equals("Rahuri")||
//                                            destination.getEditText().getText().toString().equals("Rai Singh Nagar")||
//                                            destination.getEditText().getText().toString().equals("Raibha railway station")||
//                                            destination.getEditText().getText().toString().equals("Raichur")||
//                                            destination.getEditText().getText().toString().equals("Raiganj")||
//                                            destination.getEditText().getText().toString().equals("Raigarh")||
//                                            destination.getEditText().getText().toString().equals("Raika Bagh")||
//                                            destination.getEditText().getText().toString().equals("Raila Road")||
//                                            destination.getEditText().getText().toString().equals("Raimehatpur")||
//                                            destination.getEditText().getText().toString().equals("Raipur Junction")||
//                                            destination.getEditText().getText().toString().equals("Rairakhol")||
//                                            destination.getEditText().getText().toString().equals("Raisi")||
//                                            destination.getEditText().getText().toString().equals("Raiwala")||
//                                            destination.getEditText().getText().toString().equals("Raj Gangpur")||
//                                            destination.getEditText().getText().toString().equals("Raj Nandgaon")||
//                                            destination.getEditText().getText().toString().equals("Raja Bhat Khawa")||
//                                            destination.getEditText().getText().toString().equals("Raja Ka Sahaspur")||
//                                            destination.getEditText().getText().toString().equals("Raja Ki Mandi")||
//                                            destination.getEditText().getText().toString().equals("Rajaldesar")||
//                                            destination.getEditText().getText().toString().equals("Rajamundry")||
//                                            destination.getEditText().getText().toString().equals("Rajapalayam")||
//                                            destination.getEditText().getText().toString().equals("Rajapur Road")||
//                                            destination.getEditText().getText().toString().equals("Rajawari")||
//                                            destination.getEditText().getText().toString().equals("Rajendranagar Terminal")||
//                                            destination.getEditText().getText().toString().equals("Rajgarh")||
//                                            destination.getEditText().getText().toString().equals("Rajghat Narora")||
//                                            destination.getEditText().getText().toString().equals("Rajgir")||
//                                            destination.getEditText().getText().toString().equals("Rajhura")||
//                                            destination.getEditText().getText().toString().equals("Rajiyasar")||
//                                            destination.getEditText().getText().toString().equals("Rajkharsawan Junction")||
//                                            destination.getEditText().getText().toString().equals("Rajkot Junction")||
//                                            destination.getEditText().getText().toString().equals("Rajlu Garhi")||
//                                            destination.getEditText().getText().toString().equals("Rajmahal")||
//                                            destination.getEditText().getText().toString().equals("Rajmane")||
//                                            destination.getEditText().getText().toString().equals("Rajosi")||
//                                            destination.getEditText().getText().toString().equals("Rajpipla")||
//                                            destination.getEditText().getText().toString().equals("Rajpura Junction")||
//                                            destination.getEditText().getText().toString().equals("Rajula City")||
//                                            destination.getEditText().getText().toString().equals("Rajula Junction")||
//                                            destination.getEditText().getText().toString().equals("Rajur")||
//                                            destination.getEditText().getText().toString().equals("Rakha Mines")||
//                                            destination.getEditText().getText().toString().equals("Rakhi")||
//                                            destination.getEditText().getText().toString().equals("Ram Chaura Road")||
//                                            destination.getEditText().getText().toString().equals("Raman")||
//                                            destination.getEditText().getText().toString().equals("Ram Dayalu Nagar")||
//                                            destination.getEditText().getText().toString().equals("Ramanagaram")||
//                                            destination.getEditText().getText().toString().equals("Ramanathapuram")||
//                                            destination.getEditText().getText().toString().equals("Ramdevra")||
//                                            destination.getEditText().getText().toString().equals("Rameswaram")||
//                                            destination.getEditText().getText().toString().equals("Ramganga")||
//                                            destination.getEditText().getText().toString().equals("Ramganj")||
//                                            destination.getEditText().getText().toString().equals("Ramganj Mandi")||
//                                            destination.getEditText().getText().toString().equals("Ramgarh Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Ramgarhwa")||
//                                            destination.getEditText().getText().toString().equals("Ramagundam")||
//                                            destination.getEditText().getText().toString().equals("Ramkola")||
//                                            destination.getEditText().getText().toString().equals("Ram Mandir")||
//                                            destination.getEditText().getText().toString().equals("Ramna")||
//                                            destination.getEditText().getText().toString().equals("Ramnagar (J&K)")||
//                                            destination.getEditText().getText().toString().equals("Ramnagar")||
//                                            destination.getEditText().getText().toString().equals("Rampur")||
//                                            destination.getEditText().getText().toString().equals("Rampur Dumra")||
//                                            destination.getEditText().getText().toString().equals("Rampur Hat")||
//                                            destination.getEditText().getText().toString().equals("Rampura Phul")||
//                                            destination.getEditText().getText().toString().equals("Ramsan")||
//                                            destination.getEditText().getText().toString().equals("Ramsar")||
//                                            destination.getEditText().getText().toString().equals("Ramtek")||
//                                            destination.getEditText().getText().toString().equals("Rana Bordi")||
//                                            destination.getEditText().getText().toString().equals("Ranaghat Junction")||
//                                            destination.getEditText().getText().toString().equals("Ranala")||
//                                            destination.getEditText().getText().toString().equals("Ranapratapnagar")||
//                                            destination.getEditText().getText().toString().equals("Ranavav")||
//                                            destination.getEditText().getText().toString().equals("Marwar Ranawas")||
//                                            destination.getEditText().getText().toString().equals("Ranchi")||
//                                            destination.getEditText().getText().toString().equals("Ranchi Road")||
//                                            destination.getEditText().getText().toString().equals("Rangapara North")||
//                                            destination.getEditText().getText().toString().equals("Rangiya Junction")||
//                                            destination.getEditText().getText().toString().equals("Rangjuli")||
//                                            destination.getEditText().getText().toString().equals("Rangmahal")||
//                                            destination.getEditText().getText().toString().equals("Rani")||
//                                            destination.getEditText().getText().toString().equals("Ranibennur")||
//                                            destination.getEditText().getText().toString().equals("Raniganj")||
//                                            destination.getEditText().getText().toString().equals("Ranipur Road")||
//                                            destination.getEditText().getText().toString().equals("Raniwara")||
//                                            destination.getEditText().getText().toString().equals("Ranjangaon Rd")||
//                                            destination.getEditText().getText().toString().equals("Ranjani")||
//                                            destination.getEditText().getText().toString().equals("Ranoli")||
//                                            destination.getEditText().getText().toString().equals("Ranolishishu")||
//                                            destination.getEditText().getText().toString().equals("Ranpur")||
//                                            destination.getEditText().getText().toString().equals("Ranthambhore")||
//                                            destination.getEditText().getText().toString().equals("Ranuj")||
//                                            destination.getEditText().getText().toString().equals("Rasra")||
//                                            destination.getEditText().getText().toString().equals("Rasulabad")||
//                                            destination.getEditText().getText().toString().equals("Rasull")||
//                                            destination.getEditText().getText().toString().equals("Rasuriya")||
//                                            destination.getEditText().getText().toString().equals("Rasipuram")||
//                                            destination.getEditText().getText().toString().equals("Ratabari")||
//                                            destination.getEditText().getText().toString().equals("Ratan Shahr")||
//                                            destination.getEditText().getText().toString().equals("Ratangaon")||
//                                            destination.getEditText().getText().toString().equals("Ratangarh Junction")||
//                                            destination.getEditText().getText().toString().equals("Ratangarh West")||
//                                            destination.getEditText().getText().toString().equals("Ratanpura")||
//                                            destination.getEditText().getText().toString().equals("Rathdhana")||
//                                            destination.getEditText().getText().toString().equals("Ratlam Junction")||
//                                            destination.getEditText().getText().toString().equals("Ratnagiri")||
//                                            destination.getEditText().getText().toString().equals("Ratnal")||
//                                            destination.getEditText().getText().toString().equals("Rau")||
//                                            destination.getEditText().getText().toString().equals("Rauzagaon")||
//                                            destination.getEditText().getText().toString().equals("Raver")||
//                                            destination.getEditText().getText().toString().equals("Rawania Dungar")||
//                                            destination.getEditText().getText().toString().equals("Rawatpur(Kanpur)")||
//                                            destination.getEditText().getText().toString().equals("Raxaul Junction")||
//                                            destination.getEditText().getText().toString().equals("Rayagada")||
//                                            destination.getEditText().getText().toString().equals("Rayalcheruvu")||
//                                            destination.getEditText().getText().toString().equals("Raybag")||
//                                            destination.getEditText().getText().toString().equals("Rayadurg")||
//                                            destination.getEditText().getText().toString().equals("Razampeta")||
//                                            destination.getEditText().getText().toString().equals("Reay Road")||
//                                            destination.getEditText().getText().toString().equals("Rechni Road")||
//                                            destination.getEditText().getText().toString().equals("Ren")||
//                                            destination.getEditText().getText().toString().equals("Renigunta Junction")||
//                                            destination.getEditText().getText().toString().equals("Renukut")||
//                                            destination.getEditText().getText().toString().equals("Renwal")||
//                                            destination.getEditText().getText().toString().equals("Reoti B Khera")||
//                                            destination.getEditText().getText().toString().equals("Repalle")||
//                                            destination.getEditText().getText().toString().equals("Rethorakalan")||
//                                            destination.getEditText().getText().toString().equals("Rewa Terminal")||
//                                            destination.getEditText().getText().toString().equals("Rewari Junction")||
//                                            destination.getEditText().getText().toString().equals("Richha Road")||
//                                            destination.getEditText().getText().toString().equals("Richughutu")||
//                                            destination.getEditText().getText().toString().equals("Ridhore")||
//                                            destination.getEditText().getText().toString().equals("Ringas Junction")||
//                                            destination.getEditText().getText().toString().equals("Risama")||
//                                            destination.getEditText().getText().toString().equals("Rishikesh")||
//                                            destination.getEditText().getText().toString().equals("Rishra")||
//                                            destination.getEditText().getText().toString().equals("Risia")||
//                                            destination.getEditText().getText().toString().equals("Rithi")||
//                                            destination.getEditText().getText().toString().equals("Rajendar Nagar Bihar")||
//                                            destination.getEditText().getText().toString().equals("Ramgarh Shekhwati")||
//                                            destination.getEditText().getText().toString().equals("Raninagar Jalpaiguri")||
//                                            destination.getEditText().getText().toString().equals("Robertsganj")||
//                                            destination.getEditText().getText().toString().equals("Roha")||
//                                            destination.getEditText().getText().toString().equals("Rohana Kalan")||
//                                            destination.getEditText().getText().toString().equals("Rohini")||
//                                            destination.getEditText().getText().toString().equals("Rohtak Junction")||
//                                            destination.getEditText().getText().toString().equals("Roorkee")||
//                                            destination.getEditText().getText().toString().equals("Rora")||
//                                            destination.getEditText().getText().toString().equals("Roshanpur")||
//                                            destination.getEditText().getText().toString().equals("Rotegaon")||
//                                            destination.getEditText().getText().toString().equals("Rourkela")||
//                                            destination.getEditText().getText().toString().equals("Rowta Bagan")||
//                                            destination.getEditText().getText().toString().equals("Roza Junction")||
//                                            destination.getEditText().getText().toString().equals("Rudauli")||
//                                            destination.getEditText().getText().toString().equals("Rudrapur City")||
//                                            destination.getEditText().getText().toString().equals("Rudrapur Road")||
//                                            destination.getEditText().getText().toString().equals("Rukadi")||
//                                            destination.getEditText().getText().toString().equals("Runija")||
//                                            destination.getEditText().getText().toString().equals("Runkhera")||
//                                            destination.getEditText().getText().toString().equals("Rupaheli")||
//                                            destination.getEditText().getText().toString().equals("Rupahigaon")||
//                                            destination.getEditText().getText().toString().equals("Rupamau")||
//                                            destination.getEditText().getText().toString().equals("Rupaund")||
//                                            destination.getEditText().getText().toString().equals("Rupasibari")||
//                                            destination.getEditText().getText().toString().equals("Rupbas")||
//                                            destination.getEditText().getText().toString().equals("Rupnagar")||
//                                            destination.getEditText().getText().toString().equals("Rupnarayanpur")||
//                                            destination.getEditText().getText().toString().equals("Rupra Road")||
//                                            destination.getEditText().getText().toString().equals("Rupsa Junction")||
//                                            destination.getEditText().getText().toString().equals("Rura")||
//                                            destination.getEditText().getText().toString().equals("Rusera Ghat")||
//                                            destination.getEditText().getText().toString().equals("Ruthiyai Junction")||
//                                            destination.getEditText().getText().toString().equals("Swami Narayan Chhapia")||
//                                            destination.getEditText().getText().toString().equals("Sabalgarh")||
//                                            destination.getEditText().getText().toString().equals("Sabarmati Bridge")||
//                                            destination.getEditText().getText().toString().equals("Sabarmati Junction (Metre Gauge)")||
//                                            destination.getEditText().getText().toString().equals("Sabarmati Junction")||
//                                            destination.getEditText().getText().toString().equals("Sabarmati South")||
//                                            destination.getEditText().getText().toString().equals("Sabaur")||
//                                            destination.getEditText().getText().toString().equals("Sabroom")||
//                                            destination.getEditText().getText().toString().equals("Sachin")||
//                                            destination.getEditText().getText().toString().equals("Sadar Bazar")||
//                                            destination.getEditText().getText().toString().equals("Sadat")||
//                                            destination.getEditText().getText().toString().equals("Sadhoogarh")||
//                                            destination.getEditText().getText().toString().equals("Sadisopur")||
//                                            destination.getEditText().getText().toString().equals("Sadulpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Sadulshahr")||
//                                            destination.getEditText().getText().toString().equals("Sadura")||
//                                            destination.getEditText().getText().toString().equals("Safdarjung")||
//                                            destination.getEditText().getText().toString().equals("Safedabad")||
//                                            destination.getEditText().getText().toString().equals("Safilguda")||
//                                            destination.getEditText().getText().toString().equals("Sagardighi")||
//                                            destination.getEditText().getText().toString().equals("Sagar Jambagaru")||
//                                            destination.getEditText().getText().toString().equals("Sagarpali")||
//                                            destination.getEditText().getText().toString().equals("Sagauli Junction")||
//                                            destination.getEditText().getText().toString().equals("Sagoni")||
//                                            destination.getEditText().getText().toString().equals("Saharanpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Saharsa Junction")||
//                                            destination.getEditText().getText().toString().equals("Sahatwar")||
//                                            destination.getEditText().getText().toString().equals("Sahawar Town")||
//                                            destination.getEditText().getText().toString().equals("Sahibabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Sahibganj Junction")||
//                                            destination.getEditText().getText().toString().equals("Sahibpur KML Junction")||
//                                            destination.getEditText().getText().toString().equals("Sahjanwa")||
//                                            destination.getEditText().getText().toString().equals("Sri Sathya Sai Prasanthi Nilayam")||
//                                            destination.getEditText().getText().toString().equals("Saidkhanpur")||
//                                            destination.getEditText().getText().toString().equals("Saidraja")||
//                                            destination.getEditText().getText().toString().equals("Sainthia railway station")||
//                                            destination.getEditText().getText().toString().equals("Saiyid Sarawan")||
//                                            destination.getEditText().getText().toString().equals("Sajanvar Road")||
//                                            destination.getEditText().getText().toString().equals("Sajiyavadar")||
//                                            destination.getEditText().getText().toString().equals("Sakaldiha")||
//                                            destination.getEditText().getText().toString().equals("Sakharayapatna (Sakrepatna)")||
//                                            destination.getEditText().getText().toString().equals("Sakhi Gopal")||
//                                            destination.getEditText().getText().toString().equals("Sakhoti Tanda")||
//                                            destination.getEditText().getText().toString().equals("Sakhpur")||
//                                            destination.getEditText().getText().toString().equals("Sakleshpur")||
//                                            destination.getEditText().getText().toString().equals("Sakri Junction")||
//                                            destination.getEditText().getText().toString().equals("Saktesgarh")||
//                                            destination.getEditText().getText().toString().equals("Sakti")||
//                                            destination.getEditText().getText().toString().equals("Salakati")||
//                                            destination.getEditText().getText().toString().equals("Salamatpur")||
//                                            destination.getEditText().getText().toString().equals("Salar")||
//                                            destination.getEditText().getText().toString().equals("Salarpur")||
//                                            destination.getEditText().getText().toString().equals("Salawas")||
//                                            destination.getEditText().getText().toString().equals("Salchapra")||
//                                            destination.getEditText().getText().toString().equals("Salekasa")||
//                                            destination.getEditText().getText().toString().equals("Salem Junction")||
//                                            destination.getEditText().getText().toString().equals("Salem Market")||
//                                            destination.getEditText().getText().toString().equals("Salem Town")||
//                                            destination.getEditText().getText().toString().equals("Salemgarhmasani")||
//                                            destination.getEditText().getText().toString().equals("Salempur Junction")||
//                                            destination.getEditText().getText().toString().equals("Salogra")||
//                                            destination.getEditText().getText().toString().equals("Salona")||
//                                            destination.getEditText().getText().toString().equals("Salpura")||
//                                            destination.getEditText().getText().toString().equals("Salur")||
//                                            destination.getEditText().getText().toString().equals("Salwa")||
//                                            destination.getEditText().getText().toString().equals("Samaguri")||
//                                            destination.getEditText().getText().toString().equals("Samakhiali")||
//                                            destination.getEditText().getText().toString().equals("Samakhiali B G")||
//                                            destination.getEditText().getText().toString().equals("Samalkha")||
//                                            destination.getEditText().getText().toString().equals("Samalpatti")||
//                                            destination.getEditText().getText().toString().equals("Samalkot Junction")||
//                                            destination.getEditText().getText().toString().equals("Samastipur Junction")||
//                                            destination.getEditText().getText().toString().equals("Samba")||
//                                            destination.getEditText().getText().toString().equals("Sambalpur")||
//                                            destination.getEditText().getText().toString().equals("Sambalpur Road")||
//                                            destination.getEditText().getText().toString().equals("Sambhar Salt Lake")||
//                                            destination.getEditText().getText().toString().equals("Samdhari Junction")||
//                                            destination.getEditText().getText().toString().equals("Samlaya Junction")||
//                                            destination.getEditText().getText().toString().equals("Sampla")||
//                                            destination.getEditText().getText().toString().equals("Samrau")||
//                                            destination.getEditText().getText().toString().equals("Samsi")||
//                                            destination.getEditText().getText().toString().equals("Sanehwal")||
//                                            destination.getEditText().getText().toString().equals("Sanand")||
//                                            destination.getEditText().getText().toString().equals("Sanaura")||
//                                            destination.getEditText().getText().toString().equals("Sanawad")||
//                                            destination.getEditText().getText().toString().equals("Sanchi")||
//                                            destination.getEditText().getText().toString().equals("Sandal Kalan")||
//                                            destination.getEditText().getText().toString().equals("Sandila")||
//                                            destination.getEditText().getText().toString().equals("Sanathnagar")||
//                                            destination.getEditText().getText().toString().equals("Sandhurst Road")||
//                                            destination.getEditText().getText().toString().equals("Saneh Road")||
//                                            destination.getEditText().getText().toString().equals("Sangar")||
//                                            destination.getEditText().getText().toString().equals("Sanganapur")||
//                                            destination.getEditText().getText().toString().equals("Sanganer")||
//                                            destination.getEditText().getText().toString().equals("Sangaria")||
//                                            destination.getEditText().getText().toString().equals("Sangat")||
//                                            destination.getEditText().getText().toString().equals("Sangli")||
//                                            destination.getEditText().getText().toString().equals("Sangameshwar Road")||
//                                            destination.getEditText().getText().toString().equals("Sangola")||
//                                            destination.getEditText().getText().toString().equals("Sangrampur")||
//                                            destination.getEditText().getText().toString().equals("Sangrana Sahib")||
//                                            destination.getEditText().getText().toString().equals("Sangrur")||
//                                            destination.getEditText().getText().toString().equals("Sanichara")||
//                                            destination.getEditText().getText().toString().equals("Sanjan")||
//                                            destination.getEditText().getText().toString().equals("Sankarankovil")||
//                                            destination.getEditText().getText().toString().equals("SankariDurg")||
//                                            destination.getEditText().getText().toString().equals("Sankval")||
//                                            destination.getEditText().getText().toString().equals("Sanosara Nandra")||
//                                            destination.getEditText().getText().toString().equals("Sanosra")||
//                                            destination.getEditText().getText().toString().equals("Sanpada")||
//                                            destination.getEditText().getText().toString().equals("Sant Road")||
//                                            destination.getEditText().getText().toString().equals("Santacruz")||
//                                            destination.getEditText().getText().toString().equals("Santaldih")||
//                                            destination.getEditText().getText().toString().equals("Santalpur")||
//                                            destination.getEditText().getText().toString().equals("Santragachi Junction")||
//                                            destination.getEditText().getText().toString().equals("Santir Bazar")||
//                                            destination.getEditText().getText().toString().equals("Sanvordam Curchorem")||
//                                            destination.getEditText().getText().toString().equals("Sanvatsar")||
//                                            destination.getEditText().getText().toString().equals("Sanvrad")||
//                                            destination.getEditText().getText().toString().equals("Sapatgram")||
//                                            destination.getEditText().getText().toString().equals("Saphale")||
//                                            destination.getEditText().getText().toString().equals("Saradhna")||
//                                            destination.getEditText().getText().toString().equals("Sarai Chandi")||
//                                            destination.getEditText().getText().toString().equals("Sarai Harkhu")||
//                                            destination.getEditText().getText().toString().equals("Sarai Kansrai")||
//                                            destination.getEditText().getText().toString().equals("Sarai Mir")||
//                                            destination.getEditText().getText().toString().equals("Sarai Rani")||
//                                            destination.getEditText().getText().toString().equals("Sarangpur")||
//                                            destination.getEditText().getText().toString().equals("Sardarnagar")||
//                                            destination.getEditText().getText().toString().equals("Sardarshahr")||
//                                            destination.getEditText().getText().toString().equals("Sardiha")||
//                                            destination.getEditText().getText().toString().equals("Sareigram")||
//                                            destination.getEditText().getText().toString().equals("Sareri")||
//                                            destination.getEditText().getText().toString().equals("Sarkoni")||
//                                            destination.getEditText().getText().toString().equals("Sarnath")||
//                                            destination.getEditText().getText().toString().equals("Sarojini Nagar")||
//                                            destination.getEditText().getText().toString().equals("Sarola")||
//                                            destination.getEditText().getText().toString().equals("Sarotra Road")||
//                                            destination.getEditText().getText().toString().equals("Sarsawa")||
//                                            destination.getEditText().getText().toString().equals("Sarupathar")||
//                                            destination.getEditText().getText().toString().equals("Sarwari")||
//                                            destination.getEditText().getText().toString().equals("Sasan Gir")||
//                                            destination.getEditText().getText().toString().equals("Sasaram Junction")||
//                                            destination.getEditText().getText().toString().equals("Sasni")||
//                                            destination.getEditText().getText().toString().equals("Satadhar")||
//                                            destination.getEditText().getText().toString().equals("Satara")||
//                                            destination.getEditText().getText().toString().equals("Sathajagat")||
//                                            destination.getEditText().getText().toString().equals("Sathiaon")||
//                                            destination.getEditText().getText().toString().equals("Sathin Road")||
//                                            destination.getEditText().getText().toString().equals("Satna")||
//                                            destination.getEditText().getText().toString().equals("Satnali")||
//                                            destination.getEditText().getText().toString().equals("Satuna")||
//                                            destination.getEditText().getText().toString().equals("Satur")||
//                                            destination.getEditText().getText().toString().equals("Saugor (Sagar)")||
//                                            destination.getEditText().getText().toString().equals("Savarda")||
//                                            destination.getEditText().getText().toString().equals("Savarkundla")||
//                                            destination.getEditText().getText().toString().equals("Savda")||
//                                            destination.getEditText().getText().toString().equals("Sawai Madhopur")||
//                                            destination.getEditText().getText().toString().equals("Sawai Madhopur Junction")||
//                                            destination.getEditText().getText().toString().equals("Sawantwadi Road")||
//                                            destination.getEditText().getText().toString().equals("Sealdah")||
//                                            destination.getEditText().getText().toString().equals("Seawoods–Darave")||
//                                            destination.getEditText().getText().toString().equals("Secunderabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Sehore")||
//                                            destination.getEditText().getText().toString().equals("Sehramau")||
//                                            destination.getEditText().getText().toString().equals("Selu")||
//                                            destination.getEditText().getText().toString().equals("Semarkheri")||
//                                            destination.getEditText().getText().toString().equals("Senapura")||
//                                            destination.getEditText().getText().toString().equals("Senchoa Junction")||
//                                            destination.getEditText().getText().toString().equals("Sendra")||
//                                            destination.getEditText().getText().toString().equals("Sengottai")||
//                                            destination.getEditText().getText().toString().equals("Seohara")||
//                                            destination.getEditText().getText().toString().equals("Seoraphuli")||
//                                            destination.getEditText().getText().toString().equals("Seram")||
//                                            destination.getEditText().getText().toString().equals("Serampore")||
//                                            destination.getEditText().getText().toString().equals("Settihally")||
//                                            destination.getEditText().getText().toString().equals("Sevagram")||
//                                            destination.getEditText().getText().toString().equals("Sevaliya")||
//                                            destination.getEditText().getText().toString().equals("Sewapuri")||
//                                            destination.getEditText().getText().toString().equals("Sewri")||
//                                            destination.getEditText().getText().toString().equals("Shadhoragaon")||
//                                            destination.getEditText().getText().toString().equals("Shahabad")||
//                                            destination.getEditText().getText().toString().equals("Shahad")||
//                                            destination.getEditText().getText().toString().equals("Saharsa Junction")||
//                                            destination.getEditText().getText().toString().equals("Shahbad Markanda")||
//                                            destination.getEditText().getText().toString().equals("Shahbad Mohammadpur")||
//                                            destination.getEditText().getText().toString().equals("Shahdol")||
//                                            destination.getEditText().getText().toString().equals("Shahganj Junction")||
//                                            destination.getEditText().getText().toString().equals("Shahjehanpur")||
//                                            destination.getEditText().getText().toString().equals("Shahpur Patoree")||
//                                            destination.getEditText().getText().toString().equals("Shahzad Nagar")||
//                                            destination.getEditText().getText().toString().equals("Shajahanpur court")||
//                                            destination.getEditText().getText().toString().equals("Shajapur")||
//                                            destination.getEditText().getText().toString().equals("Shakti Nagar")||
//                                            destination.getEditText().getText().toString().equals("Shakurbasti")||
//                                            destination.getEditText().getText().toString().equals("Shambhupura")||
//                                            destination.getEditText().getText().toString().equals("Shamgarh")||
//                                            destination.getEditText().getText().toString().equals("Shamlaji Road")||
//                                            destination.getEditText().getText().toString().equals("Shankargarh")||
//                                            destination.getEditText().getText().toString().equals("Shankarpalli")||
//                                            destination.getEditText().getText().toString().equals("Shantipur")||
//                                            destination.getEditText().getText().toString().equals("Shapur Sorath Junction")||
//                                            destination.getEditText().getText().toString().equals("Sharma")||
//                                            destination.getEditText().getText().toString().equals("SHDSPRA_PADMPRA")||
//                                            destination.getEditText().getText().toString().equals("Shedbal")||
//                                            destination.getEditText().getText().toString().equals("Shegaon")||
//                                            destination.getEditText().getText().toString().equals("Sheikpura")||
//                                            destination.getEditText().getText().toString().equals("Shelu")||
//                                            destination.getEditText().getText().toString().equals("Shendri")||
//                                            destination.getEditText().getText().toString().equals("Shenoli")||
//                                            destination.getEditText().getText().toString().equals("Sheo Singh Pura")||
//                                            destination.getEditText().getText().toString().equals("Sheopur Kalan")||
//                                            destination.getEditText().getText().toString().equals("Sherekan")||
//                                            destination.getEditText().getText().toString().equals("Shertalai")||
//                                            destination.getEditText().getText().toString().equals("Shikohabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Shimla")||
//                                            destination.getEditText().getText().toString().equals("Shimoga")||
//                                            destination.getEditText().getText().toString().equals("Shimoga Town")||
//                                            destination.getEditText().getText().toString().equals("Shirdi (Sainagar Shirdi)")||
//                                            destination.getEditText().getText().toString().equals("Shiribagilu")||
//                                            destination.getEditText().getText().toString().equals("Shiroor")||
//                                            destination.getEditText().getText().toString().equals("Shirravde")||
//                                            destination.getEditText().getText().toString().equals("Shirsoli")||
//                                            destination.getEditText().getText().toString().equals("Shisho")||
//                                            destination.getEditText().getText().toString().equals("Shiupur")||
//                                            destination.getEditText().getText().toString().equals("Shivamogga")||
//                                            destination.getEditText().getText().toString().equals("Shivarampur")||
//                                            destination.getEditText().getText().toString().equals("Shivnagar")||
//                                            destination.getEditText().getText().toString().equals("Shivni Shivapur")||
//                                            destination.getEditText().getText().toString().equals("Shivpuri")||
//                                            destination.getEditText().getText().toString().equals("Shivrampur")||
//                                            destination.getEditText().getText().toString().equals("Shivaji Bridge")||
//                                            destination.getEditText().getText().toString().equals("Shoghi")||
//                                            destination.getEditText().getText().toString().equals("Shohratgarh")||
//                                            destination.getEditText().getText().toString().equals("Sholapur CB")||
//                                            destination.getEditText().getText().toString().equals("Sholavandan")||
//                                            destination.getEditText().getText().toString().equals("Shoranur Junction")||
//                                            destination.getEditText().getText().toString().equals("Shri Amirgadh")||
//                                            destination.getEditText().getText().toString().equals("Shri Ganganagar")||
//                                            destination.getEditText().getText().toString().equals("Shri Karanpur")||
//                                            destination.getEditText().getText().toString().equals("Shri Madhopur")||
//                                            destination.getEditText().getText().toString().equals("Shri Mahabirji")||
//                                            destination.getEditText().getText().toString().equals("Shri Mata Vaishno Devi Katra")||
//                                            destination.getEditText().getText().toString().equals("Shridham")||
//                                            destination.getEditText().getText().toString().equals("Shrigonda Road")||
//                                            destination.getEditText().getText().toString().equals("Shrikalyanpura")||
//                                            destination.getEditText().getText().toString().equals("ShriKshetra Nagzari")||
//                                            destination.getEditText().getText().toString().equals("Shrirajnagar")||
//                                            destination.getEditText().getText().toString().equals("Shrirangapatna")||
//                                            destination.getEditText().getText().toString().equals("Shrivagilu")||
//                                            destination.getEditText().getText().toString().equals("Shujaatpur")||
//                                            destination.getEditText().getText().toString().equals("Shujalpur")||
//                                            destination.getEditText().getText().toString().equals("Shyamnagar")||
//                                            destination.getEditText().getText().toString().equals("Siajuli")||
//                                            destination.getEditText().getText().toString().equals("Sibsagar Town")||
//                                            destination.getEditText().getText().toString().equals("Siddhpur")||
//                                            destination.getEditText().getText().toString().equals("Sidhauli")||
//                                            destination.getEditText().getText().toString().equals("Sidmukh")||
//                                            destination.getEditText().getText().toString().equals("Sihapar")||
//                                            destination.getEditText().getText().toString().equals("Siho")||
//                                            destination.getEditText().getText().toString().equals("Sihor")||
//                                            destination.getEditText().getText().toString().equals("Sihora Road")||
//                                            destination.getEditText().getText().toString().equals("Sikandarpur")||
//                                            destination.getEditText().getText().toString().equals("Sikandra Rao")||
//                                            destination.getEditText().getText().toString().equals("Sikar Junction")||
//                                            destination.getEditText().getText().toString().equals("Sikir")||
//                                            destination.getEditText().getText().toString().equals("Silanibari")||
//                                            destination.getEditText().getText().toString().equals("Silao")||
//                                            destination.getEditText().getText().toString().equals("Silapathar")||
//                                            destination.getEditText().getText().toString().equals("Silaut")||
//                                            destination.getEditText().getText().toString().equals("Silchar")||
//                                            destination.getEditText().getText().toString().equals("Siliguri Junction")||
//                                            destination.getEditText().getText().toString().equals("Siliguru Town")||
//                                            destination.getEditText().getText().toString().equals("Silli")||
//                                            destination.getEditText().getText().toString().equals("Simaluguri Junction")||
//                                            destination.getEditText().getText().toString().equals("Simaria")||
//                                            destination.getEditText().getText().toString().equals("Simbhooli")||
//                                            destination.getEditText().getText().toString().equals("Simen Chapari")||
//                                            destination.getEditText().getText().toString().equals("Simhachalam")||
//                                            destination.getEditText().getText().toString().equals("Simlagarh")||
//                                            destination.getEditText().getText().toString().equals("Simultala")||
//                                            destination.getEditText().getText().toString().equals("Simurali")||
//                                            destination.getEditText().getText().toString().equals("Sindhudurg")||
//                                            destination.getEditText().getText().toString().equals("Sindi")||
//                                            destination.getEditText().getText().toString().equals("Sindkheda")||
//                                            destination.getEditText().getText().toString().equals("Sindpan")||
//                                            destination.getEditText().getText().toString().equals("Sindri Town")||
//                                            destination.getEditText().getText().toString().equals("Sindurwa")||
//                                            destination.getEditText().getText().toString().equals("Singanallur(Coimbatore)")||
//                                            destination.getEditText().getText().toString().equals("Singapur Road")||
//                                            destination.getEditText().getText().toString().equals("Singarayakonda")||
//                                            destination.getEditText().getText().toString().equals("Singareni Colleries")||
//                                            destination.getEditText().getText().toString().equals("Singarpur")||
//                                            destination.getEditText().getText().toString().equals("Singrauli")||
//                                            destination.getEditText().getText().toString().equals("Singwal")||
//                                            destination.getEditText().getText().toString().equals("Sini Junction")||
//                                            destination.getEditText().getText().toString().equals("Sion")||
//                                            destination.getEditText().getText().toString().equals("Siras")||
//                                            destination.getEditText().getText().toString().equals("Sirathu")||
//                                            destination.getEditText().getText().toString().equals("Sirhind Junction")||
//                                            destination.getEditText().getText().toString().equals("Sirkazhi")||
//                                            destination.getEditText().getText().toString().equals("Sirli")||
//                                            destination.getEditText().getText().toString().equals("Sirohi Road")||
//                                            destination.getEditText().getText().toString().equals("Sirpur Kaghaznagar")||
//                                            destination.getEditText().getText().toString().equals("Sirpur Town")||
//                                            destination.getEditText().getText().toString().equals("Sirran")||
//                                            destination.getEditText().getText().toString().equals("Sirsa")||
//                                            destination.getEditText().getText().toString().equals("Sisarka")||
//                                            destination.getEditText().getText().toString().equals("Sisvinhalli")||
//                                            destination.getEditText().getText().toString().equals("Siswa Bazar")||
//                                            destination.getEditText().getText().toString().equals("Sitamarhi")||
//                                            destination.getEditText().getText().toString().equals("Sitapur")||
//                                            destination.getEditText().getText().toString().equals("Sitapur Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Sitapur City")||
//                                            destination.getEditText().getText().toString().equals("Sitarampur")||
//                                            destination.getEditText().getText().toString().equals("Sithalavai")||
//                                            destination.getEditText().getText().toString().equals("Sithouli")||
//                                            destination.getEditText().getText().toString().equals("Sitimani")||
//                                            destination.getEditText().getText().toString().equals("Sivaganga")||
//                                            destination.getEditText().getText().toString().equals("Sivajinagar")||
//                                            destination.getEditText().getText().toString().equals("Sivakasi")||
//                                            destination.getEditText().getText().toString().equals("Siwaith")||
//                                            destination.getEditText().getText().toString().equals("Siwan Junction")||
//                                            destination.getEditText().getText().toString().equals("Siwani")||
//                                            destination.getEditText().getText().toString().equals("Sodepur")||
//                                            destination.getEditText().getText().toString().equals("Sogariya")||
//                                            destination.getEditText().getText().toString().equals("Sohagpur")||
//                                            destination.getEditText().getText().toString().equals("Sohwal")||
//                                            destination.getEditText().getText().toString().equals("Sojat Road")||
//                                            destination.getEditText().getText().toString().equals("Sojitra")||
//                                            destination.getEditText().getText().toString().equals("Solan")||
//                                            destination.getEditText().getText().toString().equals("Solan Brewery")||
//                                            destination.getEditText().getText().toString().equals("Solapur Junction")||
//                                            destination.getEditText().getText().toString().equals("Solapur Junction")||
//                                            destination.getEditText().getText().toString().equals("Somanur")||
//                                            destination.getEditText().getText().toString().equals("Somesar")||
//                                            destination.getEditText().getText().toString().equals("Somna")||
//                                            destination.getEditText().getText().toString().equals("Somnath")||
//                                            destination.getEditText().getText().toString().equals("Sompeta")||
//                                            destination.getEditText().getText().toString().equals("Son Nagar")||
//                                            destination.getEditText().getText().toString().equals("Sonagir")||
//                                            destination.getEditText().getText().toString().equals("Sonarpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Sondha Road")||
//                                            destination.getEditText().getText().toString().equals("Sonegaon")||
//                                            destination.getEditText().getText().toString().equals("Songadh")||
//                                            destination.getEditText().getText().toString().equals("Soni")||
//                                            destination.getEditText().getText().toString().equals("Sonik")||
//                                            destination.getEditText().getText().toString().equals("Sonipat Junction")||
//                                            destination.getEditText().getText().toString().equals("Sonpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Sonwara")||
//                                            destination.getEditText().getText().toString().equals("Sopur")||
//                                            destination.getEditText().getText().toString().equals("Sorbhog Junction")||
//                                            destination.getEditText().getText().toString().equals("Sorupeta")||
//                                            destination.getEditText().getText().toString().equals("Soro")||
//                                            destination.getEditText().getText().toString().equals("Soron Shukar Kshetra")||
//                                            destination.getEditText().getText().toString().equals("Sri Dungargarh")||
//                                            destination.getEditText().getText().toString().equals("Sri Kalahasti")||
//                                            destination.getEditText().getText().toString().equals("Srikakulam Road")||
//                                            destination.getEditText().getText().toString().equals("Srikrishna Nagar")||
//                                            destination.getEditText().getText().toString().equals("Srinagar")||
//                                            destination.getEditText().getText().toString().equals("Sriramnagar")||
//                                            destination.getEditText().getText().toString().equals("Srirampur, Assam")||
//                                            destination.getEditText().getText().toString().equals("Srirangam")||
//                                            destination.getEditText().getText().toString().equals("Srivilliputtur")||
//                                            destination.getEditText().getText().toString().equals("Subansiri")||
//                                            destination.getEditText().getText().toString().equals("Subedarganj")||
//                                            destination.getEditText().getText().toString().equals("Subrahmanya Road")||
//                                            destination.getEditText().getText().toString().equals("Subzi Mandi")||
//                                            destination.getEditText().getText().toString().equals("Suchipind")||
//                                            destination.getEditText().getText().toString().equals("Sudsar")||
//                                            destination.getEditText().getText().toString().equals("Sujangarh")||
//                                            destination.getEditText().getText().toString().equals("Sujanpur")||
//                                            destination.getEditText().getText().toString().equals("Sukhisewaniyan")||
//                                            destination.getEditText().getText().toString().equals("Sukhpar Roha")||
//                                            destination.getEditText().getText().toString().equals("Sukhpur")||
//                                            destination.getEditText().getText().toString().equals("Sukritipur")||
//                                            destination.getEditText().getText().toString().equals("Suladhal")||
//                                            destination.getEditText().getText().toString().equals("Sulah Himachal Pradesh")||
//                                            destination.getEditText().getText().toString().equals("Sulgare")||
//                                            destination.getEditText().getText().toString().equals("Sullurupeta")||
//                                            destination.getEditText().getText().toString().equals("Sultanganj")||
//                                            destination.getEditText().getText().toString().equals("Sultanpur")||
//                                            destination.getEditText().getText().toString().equals("Sultanpur Lodi")||
//                                            destination.getEditText().getText().toString().equals("Sulur Road (Coimbatore)")||
//                                            destination.getEditText().getText().toString().equals("Sumer")||
//                                            destination.getEditText().getText().toString().equals("Summadevi")||
//                                            destination.getEditText().getText().toString().equals("Summer Hill")||
//                                            destination.getEditText().getText().toString().equals("Sumreri")||
//                                            destination.getEditText().getText().toString().equals("Sunam")||
//                                            destination.getEditText().getText().toString().equals("SundaraperumalKoil")||
//                                            destination.getEditText().getText().toString().equals("Sunderabad")||
//                                            destination.getEditText().getText().toString().equals("Sundlak")||
//                                            destination.getEditText().getText().toString().equals("Supaul")||
//                                            destination.getEditText().getText().toString().equals("Suraimanpur")||
//                                            destination.getEditText().getText().toString().equals("Surajgarh")||
//                                            destination.getEditText().getText().toString().equals("Surajpur")||
//                                            destination.getEditText().getText().toString().equals("Surajpur Road")||
//                                            destination.getEditText().getText().toString().equals("Surat")||
//                                            destination.getEditText().getText().toString().equals("Suratgarh Junction")||
//                                            destination.getEditText().getText().toString().equals("Surathkal")||
//                                            destination.getEditText().getText().toString().equals("Suravali")||
//                                            destination.getEditText().getText().toString().equals("Sureli")||
//                                            destination.getEditText().getText().toString().equals("Surendranagar")||
//                                            destination.getEditText().getText().toString().equals("Suriawan")||
//                                            destination.getEditText().getText().toString().equals("Surla Road")||
//                                            destination.getEditText().getText().toString().equals("Surpura")||
//                                            destination.getEditText().getText().toString().equals("Suwansa")||
//                                            destination.getEditText().getText().toString().equals("Suwasra")||
//                                            destination.getEditText().getText().toString().equals("Swamimalai")||
//                                            destination.getEditText().getText().toString().equals("Swarupganj")||
//                                            destination.getEditText().getText().toString().equals("Sanjuje Da Arey]")||
//                                            destination.getEditText().getText().toString().equals("Sankval")||
//                                            destination.getEditText().getText().toString().equals("Sonalium")||
//                                            destination.getEditText().getText().toString().equals("Suravali")||
//                                            destination.getEditText().getText().toString().equals("Tadali")||
//                                            destination.getEditText().getText().toString().equals("Tadepalligudem")||
//                                            destination.getEditText().getText().toString().equals("Tadipatri")||
//                                            destination.getEditText().getText().toString().equals("Tadwal")||
//                                            destination.getEditText().getText().toString().equals("Tahsil Bhadra")||
//                                            destination.getEditText().getText().toString().equals("Tahsil Fatehpur")||
//                                            destination.getEditText().getText().toString().equals("Tajpur")||
//                                            destination.getEditText().getText().toString().equals("Tajpur Dehma")||
//                                            destination.getEditText().getText().toString().equals("Takal")||
//                                            destination.getEditText().getText().toString().equals("Takari")||
//                                            destination.getEditText().getText().toString().equals("Takarkhede")||
//                                            destination.getEditText().getText().toString().equals("Takia")||
//                                            destination.getEditText().getText().toString().equals("Taksal")||
//                                            destination.getEditText().getText().toString().equals("Taku")||
//                                            destination.getEditText().getText().toString().equals("Talaiyuthu")||
//                                            destination.getEditText().getText().toString().equals("Talara")||
//                                            destination.getEditText().getText().toString().equals("Talakhajuri")||
//                                            destination.getEditText().getText().toString().equals("Talala Junction")||
//                                            destination.getEditText().getText().toString().equals("Talvadiya Junction")||
//                                            destination.getEditText().getText().toString().equals("Talbahat")||
//                                            destination.getEditText().getText().toString().equals("Talcher")||
//                                            destination.getEditText().getText().toString().equals("Talchhapar")||
//                                            destination.getEditText().getText().toString().equals("Talegaon Dabhade")||
//                                            destination.getEditText().getText().toString().equals("Talguppa")||
//                                            destination.getEditText().getText().toString().equals("Talheri Buzurg")||
//                                            destination.getEditText().getText().toString().equals("Talli Saidasahu")||
//                                            destination.getEditText().getText().toString().equals("Talod")||
//                                            destination.getEditText().getText().toString().equals("Taloja")||
//                                            destination.getEditText().getText().toString().equals("Talwandi")||
//                                            destination.getEditText().getText().toString().equals("Tambaram")||
//                                            destination.getEditText().getText().toString().equals("Tamkuhi Road")||
//                                            destination.getEditText().getText().toString().equals("Tamluk")||
//                                            destination.getEditText().getText().toString().equals("Tamuriya")||
//                                            destination.getEditText().getText().toString().equals("Tanakpur")||
//                                            destination.getEditText().getText().toString().equals("Tanda Urmar")||
//                                            destination.getEditText().getText().toString().equals("Tandur railway station")||
//                                            destination.getEditText().getText().toString().equals("Tangla")||
//                                            destination.getEditText().getText().toString().equals("Tangra")||
//                                            destination.getEditText().getText().toString().equals("Tankuppa")||
//                                            destination.getEditText().getText().toString().equals("Tanuku")||
//                                            destination.getEditText().getText().toString().equals("Tanur")||
//                                            destination.getEditText().getText().toString().equals("Tapa")||
//                                            destination.getEditText().getText().toString().equals("Tapri")||
//                                            destination.getEditText().getText().toString().equals("Tarabari")||
//                                            destination.getEditText().getText().toString().equals("Taradevi")||
//                                            destination.getEditText().getText().toString().equals("Tarak Nagar")||
//                                            destination.getEditText().getText().toString().equals("Tarana Road")||
//                                            destination.getEditText().getText().toString().equals("Taranga Hill")||
//                                            destination.getEditText().getText().toString().equals("Taraori")||
//                                            destination.getEditText().getText().toString().equals("Taregna")||
//                                            destination.getEditText().getText().toString().equals("Targaon")||
//                                            destination.getEditText().getText().toString().equals("Tarighat")||
//                                            destination.getEditText().getText().toString().equals("Tarlupadu")||
//                                            destination.getEditText().getText().toString().equals("Tarn Taran")||
//                                            destination.getEditText().getText().toString().equals("Tarsai")||
//                                            destination.getEditText().getText().toString().equals("Tarsari Muria")||
//                                            destination.getEditText().getText().toString().equals("Tatanagar Junction")||
//                                            destination.getEditText().getText().toString().equals("Tatibahar")||
//                                            destination.getEditText().getText().toString().equals("Tatisilwai")||
//                                            destination.getEditText().getText().toString().equals("Teghra")||
//                                            destination.getEditText().getText().toString().equals("Teharka")||
//                                            destination.getEditText().getText().toString().equals("Telam")||
//                                            destination.getEditText().getText().toString().equals("Tellicherry")||
//                                            destination.getEditText().getText().toString().equals("Tenali Junction")||
//                                            destination.getEditText().getText().toString().equals("Theni")||
//                                            destination.getEditText().getText().toString().equals("Tenkasi")||
//                                            destination.getEditText().getText().toString().equals("Tenmalai")||
//                                            destination.getEditText().getText().toString().equals("Tetelia")||
//                                            destination.getEditText().getText().toString().equals("Tetulmari")||
//                                            destination.getEditText().getText().toString().equals("Tezpore")||
//                                            destination.getEditText().getText().toString().equals("Thakurkuchi")||
//                                            destination.getEditText().getText().toString().equals("Thakurli")||
//                                            destination.getEditText().getText().toString().equals("Than Junction")||
//                                            destination.getEditText().getText().toString().equals("Thana Bihpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Thandla Rd")||
//                                            destination.getEditText().getText().toString().equals("Thane")||
//                                            destination.getEditText().getText().toString().equals("Thanjavur Junction")||
//                                            destination.getEditText().getText().toString().equals("Thathana Mithri")||
//                                            destination.getEditText().getText().toString().equals("Thawe Junction")||
//                                            destination.getEditText().getText().toString().equals("Thekeraguri")||
//                                            destination.getEditText().getText().toString().equals("Therubali")||
//                                            destination.getEditText().getText().toString().equals("Thrissur")||
//                                            destination.getEditText().getText().toString().equals("Trivandrum Central")||
//                                            destination.getEditText().getText().toString().equals("Thirumullaivoyal")||
//                                            destination.getEditText().getText().toString().equals("Thiruninravur")||
//                                            destination.getEditText().getText().toString().equals("Thiruvananthapuram Pettah")||
//                                            destination.getEditText().getText().toString().equals("Thoothukudi Melur railway station")||
//                                            destination.getEditText().getText().toString().equals("Thoothukudi railway station")||
//                                            destination.getEditText().getText().toString().equals("Thiruvarur Junction")||
//                                            destination.getEditText().getText().toString().equals("Thivim railway station")||
//                                            destination.getEditText().getText().toString().equals("Thokur")||
//                                            destination.getEditText().getText().toString().equals("Thuria, India")||
//                                            destination.getEditText().getText().toString().equals("Tibi")||
//                                            destination.getEditText().getText().toString().equals("Tihu")||
//                                            destination.getEditText().getText().toString().equals("Tikaria")||
//                                            destination.getEditText().getText().toString().equals("Tikekarwadi")||
//                                            destination.getEditText().getText().toString().equals("Tikunia")||
//                                            destination.getEditText().getText().toString().equals("Tilak Bridge")||
//                                            destination.getEditText().getText().toString().equals("Tilak Nagar")||
//                                            destination.getEditText().getText().toString().equals("Tilaru")||
//                                            destination.getEditText().getText().toString().equals("Tilaiya")||
//                                            destination.getEditText().getText().toString().equals("Tilda")||
//                                            destination.getEditText().getText().toString().equals("Tilhar")||
//                                            destination.getEditText().getText().toString().equals("Tilrath")||
//                                            destination.getEditText().getText().toString().equals("Tilwara")||
//                                            destination.getEditText().getText().toString().equals("Timarni")||
//                                            destination.getEditText().getText().toString().equals("Timba Road")||
//                                            destination.getEditText().getText().toString().equals("Timmapur")||
//                                            destination.getEditText().getText().toString().equals("Tinai Ghat")||
//                                            destination.getEditText().getText().toString().equals("Tindivanam")||
//                                            destination.getEditText().getText().toString().equals("Tinpahar Junction")||
//                                            destination.getEditText().getText().toString().equals("Tinsukia Junction")||
//                                            destination.getEditText().getText().toString().equals("Tipkai")||
//                                            destination.getEditText().getText().toString().equals("Tipling")||
//                                            destination.getEditText().getText().toString().equals("Tiptur")||
//                                            destination.getEditText().getText().toString().equals("Tiruchirapalli Fort")||
//                                            destination.getEditText().getText().toString().equals("Tirodi")||
//                                            destination.getEditText().getText().toString().equals("Tirora")||
//                                            destination.getEditText().getText().toString().equals("Tiruchirapalli Junction")||
//                                            destination.getEditText().getText().toString().equals("Tiruchendur")||
//                                            destination.getEditText().getText().toString().equals("Tiruchirapalli Palakkarai")||
//                                            destination.getEditText().getText().toString().equals("Tirukoilur")||
//                                            destination.getEditText().getText().toString().equals("Tirumalairayanpattinam")||
//                                            destination.getEditText().getText().toString().equals("Tirumangalam")||
//                                            destination.getEditText().getText().toString().equals("Tirunagesvaram")||
//                                            destination.getEditText().getText().toString().equals("Tirunelveli Junction")||
//                                            destination.getEditText().getText().toString().equals("Tirupadripuliyur")||
//                                            destination.getEditText().getText().toString().equals("Tirupati")||
//                                            destination.getEditText().getText().toString().equals("Tiruparankndrm")||
//                                            destination.getEditText().getText().toString().equals("Tirupattur Junction")||
//                                            destination.getEditText().getText().toString().equals("Tiruppappuliyur")||
//                                            destination.getEditText().getText().toString().equals("Tiruppur")||
//                                            destination.getEditText().getText().toString().equals("Tirur")||
//                                            destination.getEditText().getText().toString().equals("Tiruttani")||
//                                            destination.getEditText().getText().toString().equals("Tiruttangal")||
//                                            destination.getEditText().getText().toString().equals("Tiruturaipundi Junction")||
//                                            destination.getEditText().getText().toString().equals("Tiruvalla")||
//                                            destination.getEditText().getText().toString().equals("Tiruvallur")||
//                                            destination.getEditText().getText().toString().equals("Tiruvannamalai railway station")||
//                                            destination.getEditText().getText().toString().equals("Tiruverumbur")||
//                                            destination.getEditText().getText().toString().equals("Tiruvidaimarudur")||
//                                            destination.getEditText().getText().toString().equals("Tiruvottiyur")||
//                                            destination.getEditText().getText().toString().equals("Tisi")||
//                                            destination.getEditText().getText().toString().equals("Tisua")||
//                                            destination.getEditText().getText().toString().equals("Titabar")||
//                                            destination.getEditText().getText().toString().equals("Titlagarh")||
//                                            destination.getEditText().getText().toString().equals("Titlagarh Junction")||
//                                            destination.getEditText().getText().toString().equals("Titwala")||
//                                            destination.getEditText().getText().toString().equals("Tivari")||
//                                            destination.getEditText().getText().toString().equals("Todarpur")||
//                                            destination.getEditText().getText().toString().equals("Tohana")||
//                                            destination.getEditText().getText().toString().equals("Toranagallu")||
//                                            destination.getEditText().getText().toString().equals("Tori")||
//                                            destination.getEditText().getText().toString().equals("Trichur")||
//                                            destination.getEditText().getText().toString().equals("Trikarpur")||
//                                            destination.getEditText().getText().toString().equals("Trilochan Mahdo")||
//                                            destination.getEditText().getText().toString().equals("Tripunittura")||
//                                            destination.getEditText().getText().toString().equals("Tondiarpet")||
//                                            destination.getEditText().getText().toString().equals("Tsunduru")||
//                                            destination.getEditText().getText().toString().equals("Tughlakabad")||
//                                            destination.getEditText().getText().toString().equals("Tukaithad")||
//                                            destination.getEditText().getText().toString().equals("Tulsipur")||
//                                            destination.getEditText().getText().toString().equals("Tulwara Jhil")||
//                                            destination.getEditText().getText().toString().equals("Tumkur")||
//                                            destination.getEditText().getText().toString().equals("Tumsar Road")||
//                                            destination.getEditText().getText().toString().equals("Tundla Junction")||
//                                            destination.getEditText().getText().toString().equals("Tuni")||
//                                            destination.getEditText().getText().toString().equals("Turbhe")||
//                                            destination.getEditText().getText().toString().equals("Turtipar")||
//                                            destination.getEditText().getText().toString().equals("Tuwa")||
//                                            destination.getEditText().getText().toString().equals("Twining Ganj")||
//                                            destination.getEditText().getText().toString().equals("Tada")||
//                                            destination.getEditText().getText().toString().equals("Ubarni")||
//                                            destination.getEditText().getText().toString().equals("Uchana")||
//                                            destination.getEditText().getText().toString().equals("Uchippuli")||
//                                            destination.getEditText().getText().toString().equals("Udagamandalam")||
//                                            destination.getEditText().getText().toString().equals("Udaipur City")||
//                                            destination.getEditText().getText().toString().equals("Udaipur Khurd Halt")||
//                                            destination.getEditText().getText().toString().equals("Udaipur Tripura")||
//                                            destination.getEditText().getText().toString().equals("Udaipura")||
//                                            destination.getEditText().getText().toString().equals("Udairampur")||
//                                            destination.getEditText().getText().toString().equals("Udalguri")||
//                                            destination.getEditText().getText().toString().equals("Udalkachar")||
//                                            destination.getEditText().getText().toString().equals("Udasar")||
//                                            destination.getEditText().getText().toString().equals("Udgir")||
//                                            destination.getEditText().getText().toString().equals("Udhampur")||
//                                            destination.getEditText().getText().toString().equals("Udhna Junction")||
//                                            destination.getEditText().getText().toString().equals("Udramsar")||
//                                            destination.getEditText().getText().toString().equals("Udupi")||
//                                            destination.getEditText().getText().toString().equals("Udvada")||
//                                            destination.getEditText().getText().toString().equals("Udwantnagar Halt")||
//                                            destination.getEditText().getText().toString().equals("Udyankheri")||
//                                            destination.getEditText().getText().toString().equals("Ugaon")||
//                                            destination.getEditText().getText().toString().equals("Ugar Khurd")||
//                                            destination.getEditText().getText().toString().equals("Ugarpur")||
//                                            destination.getEditText().getText().toString().equals("Ugna Halt")||
//                                            destination.getEditText().getText().toString().equals("Ugrasenpur")||
//                                            destination.getEditText().getText().toString().equals("Ugu")||
//                                            destination.getEditText().getText().toString().equals("Ugwe")||
//                                            destination.getEditText().getText().toString().equals("Ujalvav")||
//                                            destination.getEditText().getText().toString().equals("Ujhani")||
//                                            destination.getEditText().getText().toString().equals("Ujiarpur")||
//                                            destination.getEditText().getText().toString().equals("Ujjain Junction")||
//                                            destination.getEditText().getText().toString().equals("Ukai Songadh")||
//                                            destination.getEditText().getText().toString().equals("Ukhali")||
//                                            destination.getEditText().getText().toString().equals("Ukhra")||
//                                            destination.getEditText().getText().toString().equals("Ukilerhat Halt")||
//                                            destination.getEditText().getText().toString().equals("Uklana")||
//                                            destination.getEditText().getText().toString().equals("Ukshi")||
//                                            destination.getEditText().getText().toString().equals("Ulavapadu")||
//                                            destination.getEditText().getText().toString().equals("Ulhasnagar")||
//                                            destination.getEditText().getText().toString().equals("Ulindakonda")||
//                                            destination.getEditText().getText().toString().equals("Ullal")||
//                                            destination.getEditText().getText().toString().equals("Ulnabhari")||
//                                            destination.getEditText().getText().toString().equals("Ulubaria")||
//                                            destination.getEditText().getText().toString().equals("Ulundurpet")||
//                                            destination.getEditText().getText().toString().equals("Umar Tali")||
//                                            destination.getEditText().getText().toString().equals("Umardashi")||
//                                            destination.getEditText().getText().toString().equals("Umaria")||
//                                            destination.getEditText().getText().toString().equals("Umariaispah Halt")||
//                                            destination.getEditText().getText().toString().equals("Umarpada")||
//                                            destination.getEditText().getText().toString().equals("Umargam Road")||
//                                            destination.getEditText().getText().toString().equals("Umda Nagar")||
//                                            destination.getEditText().getText().toString().equals("Umed")||
//                                            destination.getEditText().getText().toString().equals("Umeshnagar")||
//                                            destination.getEditText().getText().toString().equals("Umra")||
//                                            destination.getEditText().getText().toString().equals("Umranala")||
//                                            destination.getEditText().getText().toString().equals("Umram")||
//                                            destination.getEditText().getText().toString().equals("Umred")||
//                                            destination.getEditText().getText().toString().equals("Umreth")||
//                                            destination.getEditText().getText().toString().equals("Umri")||
//                                            destination.getEditText().getText().toString().equals("Umroli")||
//                                            destination.getEditText().getText().toString().equals("Una")||
//                                            destination.getEditText().getText().toString().equals("Una Himachal")||
//                                            destination.getEditText().getText().toString().equals("Unai Vansada Rd")||
//                                            destination.getEditText().getText().toString().equals("Unaula")||
//                                            destination.getEditText().getText().toString().equals("Unchahar Junction")||
//                                            destination.getEditText().getText().toString().equals("Unchaulia")||
//                                            destination.getEditText().getText().toString().equals("Unchdih")||
//                                            destination.getEditText().getText().toString().equals("Unchhera")||
//                                            destination.getEditText().getText().toString().equals("Unchi Bassi")||
//                                            destination.getEditText().getText().toString().equals("Undasa Madhawpu")||
//                                            destination.getEditText().getText().toString().equals("Undi")||
//                                            destination.getEditText().getText().toString().equals("Unguturu")||
//                                            destination.getEditText().getText().toString().equals("Unhel")||
//                                            destination.getEditText().getText().toString().equals("Unjalur")||
//                                            destination.getEditText().getText().toString().equals("Unjha")||
//                                            destination.getEditText().getText().toString().equals("Unkal")||
//                                            destination.getEditText().getText().toString().equals("Unnao Junction")||
//                                            destination.getEditText().getText().toString().equals("Untare Road")||
//                                            destination.getEditText().getText().toString().equals("Uplai")||
//                                            destination.getEditText().getText().toString().equals("Upleta")||
//                                            destination.getEditText().getText().toString().equals("Uppal")||
//                                            destination.getEditText().getText().toString().equals("Uppala")||
//                                            destination.getEditText().getText().toString().equals("Uppalavai")||
//                                            destination.getEditText().getText().toString().equals("Uppalur")||
//                                            destination.getEditText().getText().toString().equals("Uppuguda")||
//                                            destination.getEditText().getText().toString().equals("Uppugunduru")||
//                                            destination.getEditText().getText().toString().equals("Urappakkam")||
//                                            destination.getEditText().getText().toString().equals("Urdauli")||
//                                            destination.getEditText().getText().toString().equals("Uren")||
//                                            destination.getEditText().getText().toString().equals("Urga")||
//                                            destination.getEditText().getText().toString().equals("Urkura")||
//                                            destination.getEditText().getText().toString().equals("Urlam")||
//                                            destination.getEditText().getText().toString().equals("Urma")||
//                                            destination.getEditText().getText().toString().equals("Uruli")||
//                                            destination.getEditText().getText().toString().equals("Usalapur")||
//                                            destination.getEditText().getText().toString().equals("Usia Khas")||
//                                            destination.getEditText().getText().toString().equals("Uska Bazar")||
//                                            destination.getEditText().getText().toString().equals("Usmanpur")||
//                                            destination.getEditText().getText().toString().equals("Usra")||
//                                            destination.getEditText().getText().toString().equals("Utarlai")||
//                                            destination.getEditText().getText().toString().equals("Utarsanda")||
//                                            destination.getEditText().getText().toString().equals("Utrahtia")||
//                                            destination.getEditText().getText().toString().equals("Utran")||
//                                            destination.getEditText().getText().toString().equals("Utripura")||
//                                            destination.getEditText().getText().toString().equals("Uttamarkovil")||
//                                            destination.getEditText().getText().toString().equals("Uttangal Mangalam")||
//                                            destination.getEditText().getText().toString().equals("Uttar Radhanagar Halt")||
//                                            destination.getEditText().getText().toString().equals("Uttarpara")||
//                                            destination.getEditText().getText().toString().equals("Uttukuli")||
//                                            destination.getEditText().getText().toString().equals("Udumalpettai")||
//                                            destination.getEditText().getText().toString().equals("V.O.C Nagar")||
//                                            destination.getEditText().getText().toString().equals("Vachaspati Nagar")||
//                                            destination.getEditText().getText().toString().equals("Vadaj")||
//                                            destination.getEditText().getText().toString().equals("Vadakara")||
//                                            destination.getEditText().getText().toString().equals("Vadal")||
//                                            destination.getEditText().getText().toString().equals("Vadali")||
//                                            destination.getEditText().getText().toString().equals("Vadali Luter Road")||
//                                            destination.getEditText().getText().toString().equals("Vadalur")||
//                                            destination.getEditText().getText().toString().equals("Vadamadura")||
//                                            destination.getEditText().getText().toString().equals("Vadanam Kurussi Halt")||
//                                            destination.getEditText().getText().toString().equals("Vadgaon")||
//                                            destination.getEditText().getText().toString().equals("Vadgaon Nila")||
//                                            destination.getEditText().getText().toString().equals("Vadhvana")||
//                                            destination.getEditText().getText().toString().equals("Vadippatti")||
//                                            destination.getEditText().getText().toString().equals("Vadiya Devli")||
//                                            destination.getEditText().getText().toString().equals("Vadlamannadu")||
//                                            destination.getEditText().getText().toString().equals("Vadnagar")||
//                                            destination.getEditText().getText().toString().equals("Vadod")||
//                                            destination.getEditText().getText().toString().equals("Vadodara Junction")||
//                                            destination.getEditText().getText().toString().equals("Vadtal Swaminarayan")||
//                                            destination.getEditText().getText().toString().equals("Vadviyala")||
//                                            destination.getEditText().getText().toString().equals("Vagdiya")||
//                                            destination.getEditText().getText().toString().equals("Vaghli")||
//                                            destination.getEditText().getText().toString().equals("Vaibhavwadi Road")||
//                                            destination.getEditText().getText().toString().equals("Vaikom Road")||
//                                            destination.getEditText().getText().toString().equals("Vailapuzha")||
//                                            destination.getEditText().getText().toString().equals("Vaitarna")||
//                                            destination.getEditText().getText().toString().equals("Vaitheeswaran Koil")||
//                                            destination.getEditText().getText().toString().equals("Vakav")||
//                                            destination.getEditText().getText().toString().equals("Valadar")||
//                                            destination.getEditText().getText().toString().equals("Valadi")||
//                                            destination.getEditText().getText().toString().equals("Valantaravai")||
//                                            destination.getEditText().getText().toString().equals("Valapattanam")||
//                                            destination.getEditText().getText().toString().equals("Valappadi G Halt")||
//                                            destination.getEditText().getText().toString().equals("Valaramanikkam")||
//                                            destination.getEditText().getText().toString().equals("Valathoor")||
//                                            destination.getEditText().getText().toString().equals("Valavanur")||
//                                            destination.getEditText().getText().toString().equals("Valha")||
//                                            destination.getEditText().getText().toString().equals("Valivade")||
//                                            destination.getEditText().getText().toString().equals("Vallabhnagar")||
//                                            destination.getEditText().getText().toString().equals("Vallabh Vidyanagar")||
//                                            destination.getEditText().getText().toString().equals("Vallampadugai")||
//                                            destination.getEditText().getText().toString().equals("Vallathol Nagar")||
//                                            destination.getEditText().getText().toString().equals("Vallikkunnu")||
//                                            destination.getEditText().getText().toString().equals("Valliveedu")||
//                                            destination.getEditText().getText().toString().equals("Valliyur")||
//                                            destination.getEditText().getText().toString().equals("Valmikinagar Road")||
//                                            destination.getEditText().getText().toString().equals("Valsad")||
//                                            destination.getEditText().getText().toString().equals("Valyampatti")||
//                                            destination.getEditText().getText().toString().equals("Vambori")||
//                                            destination.getEditText().getText().toString().equals("Vandalu")||
//                                            destination.getEditText().getText().toString().equals("Vangani")||
//                                            destination.getEditText().getText().toString().equals("Vanganur")||
//                                            destination.getEditText().getText().toString().equals("Vangaon")||
//                                            destination.getEditText().getText().toString().equals("Vangal")||
//                                            destination.getEditText().getText().toString().equals("Vani Road")||
//                                            destination.getEditText().getText().toString().equals("Vanigonda")||
//                                            destination.getEditText().getText().toString().equals("Vaniyambadi")||
//                                            destination.getEditText().getText().toString().equals("Vaniyambadi")||
//                                            destination.getEditText().getText().toString().equals("Vaniyambalam")||
//                                            destination.getEditText().getText().toString().equals("Vanji Maniyachi Junction")||
//                                            destination.getEditText().getText().toString().equals("Vankal")||
//                                            destination.getEditText().getText().toString().equals("Vapi")||
//                                            destination.getEditText().getText().toString().equals("Varahi")||
//                                            destination.getEditText().getText().toString().equals("Varakalpattu")||
//                                            destination.getEditText().getText().toString().equals("Varanasi City")||
//                                            destination.getEditText().getText().toString().equals("Varanasi Junction")||
//                                            destination.getEditText().getText().toString().equals("Varangaon")||
//                                            destination.getEditText().getText().toString().equals("Varediya")||
//                                            destination.getEditText().getText().toString().equals("Varkala")||
//                                            destination.getEditText().getText().toString().equals("Varkhedi")||
//                                            destination.getEditText().getText().toString().equals("Varnama")||
//                                            destination.getEditText().getText().toString().equals("Vartej")||
//                                            destination.getEditText().getText().toString().equals("Varvala")||
//                                            destination.getEditText().getText().toString().equals("Vasad Junction")||
//                                            destination.getEditText().getText().toString().equals("Vasai Road")||
//                                            destination.getEditText().getText().toString().equals("Vasan Iyawa")||
//                                            destination.getEditText().getText().toString().equals("Vasco da Gama railway station")||
//                                            destination.getEditText().getText().toString().equals("Vashi")||
//                                            destination.getEditText().getText().toString().equals("Vasind")||
//                                            destination.getEditText().getText().toString().equals("Vaso")||
//                                            destination.getEditText().getText().toString().equals("Vastrapur")||
//                                            destination.getEditText().getText().toString().equals("Vatluru")||
//                                            destination.getEditText().getText().toString().equals("Vatva")||
//                                            destination.getEditText().getText().toString().equals("Vavdi")||
//                                            destination.getEditText().getText().toString().equals("Vavdi Khurd")||
//                                            destination.getEditText().getText().toString().equals("Vavera")||
//                                            destination.getEditText().getText().toString().equals("Vayalar")||
//                                            destination.getEditText().getText().toString().equals("Vayalpad")||
//                                            destination.getEditText().getText().toString().equals("Vazeerpur Halt")||
//                                            destination.getEditText().getText().toString().equals("Vedayapalem")||
//                                            destination.getEditText().getText().toString().equals("Vedchha")||
//                                            destination.getEditText().getText().toString().equals("Veer")||
//                                            destination.getEditText().getText().toString().equals("Vejalka")||
//                                            destination.getEditText().getText().toString().equals("Vejendla")||
//                                            destination.getEditText().getText().toString().equals("Velachery")||
//                                            destination.getEditText().getText().toString().equals("Velaccha")||
//                                            destination.getEditText().getText().toString().equals("Velankanni")||
//                                            destination.getEditText().getText().toString().equals("Veldurti")||
//                                            destination.getEditText().getText().toString().equals("Vellanur")||
//                                            destination.getEditText().getText().toString().equals("Vellarakkad")||
//                                            destination.getEditText().getText().toString().equals("Vellayil")||
//                                            destination.getEditText().getText().toString().equals("Vellipalayem")||
//                                            destination.getEditText().getText().toString().equals("Velliyani")||
//                                            destination.getEditText().getText().toString().equals("Vellodu")||
//                                            destination.getEditText().getText().toString().equals("Vellore Cantonment")||
//                                            destination.getEditText().getText().toString().equals("Vellore Town")||
//                                            destination.getEditText().getText().toString().equals("Vellur Halt")||
//                                            destination.getEditText().getText().toString().equals("Velpuru")||
//                                            destination.getEditText().getText().toString().equals("Velpuru Road")||
//                                            destination.getEditText().getText().toString().equals("Vemuru")||
//                                            destination.getEditText().getText().toString().equals("Vendodu")||
//                                            destination.getEditText().getText().toString().equals("Vendra")||
//                                            destination.getEditText().getText().toString().equals("Venkatachalam")||
//                                            destination.getEditText().getText().toString().equals("Venkatagiri")||
//                                            destination.getEditText().getText().toString().equals("Venkatagiri Kote Halt")||
//                                            destination.getEditText().getText().toString().equals("Venkatampalli")||
//                                            destination.getEditText().getText().toString().equals("Venkatanarashimarajuvaripeta")||
//                                            destination.getEditText().getText().toString().equals("Venkatnagar")||
//                                            destination.getEditText().getText().toString().equals("Ventraptagada")||
//                                            destination.getEditText().getText().toString().equals("Vepagunta")||
//                                            destination.getEditText().getText().toString().equals("Veppampattu")||
//                                            destination.getEditText().getText().toString().equals("Veraval")||
//                                            destination.getEditText().getText().toString().equals("Verka Junction")||
//                                            destination.getEditText().getText().toString().equals("Verna railway station")||
//                                            destination.getEditText().getText().toString().equals("Vetapalemu")||
//                                            destination.getEditText().getText().toString().equals("Vidisha")||
//                                            destination.getEditText().getText().toString().equals("Vidhraswattha")||
//                                            destination.getEditText().getText().toString().equals("Vidya Nagar")||
//                                            destination.getEditText().getText().toString().equals("Vidyapatinagar")||
//                                            destination.getEditText().getText().toString().equals("Vidyasagar")||
//                                            destination.getEditText().getText().toString().equals("Vidyavihar")||
//                                            destination.getEditText().getText().toString().equals("Vijapur")||
//                                            destination.getEditText().getText().toString().equals("Vijayamangalam")||
//                                            destination.getEditText().getText().toString().equals("Vijianagar")||
//                                            destination.getEditText().getText().toString().equals("Vijayawada Junction")||
//                                            destination.getEditText().getText().toString().equals("Vijaypur Jammu")||
//                                            destination.getEditText().getText().toString().equals("Vijpadi Road")||
//                                            destination.getEditText().getText().toString().equals("Vikarabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Vikhran")||
//                                            destination.getEditText().getText().toString().equals("Vikhroli")||
//                                            destination.getEditText().getText().toString().equals("Vikramgarh Alot")||
//                                            destination.getEditText().getText().toString().equals("Vikramnagar")||
//                                            destination.getEditText().getText().toString().equals("Vikravandi")||
//                                            destination.getEditText().getText().toString().equals("Vilad")||
//                                            destination.getEditText().getText().toString().equals("Vilavade")||
//                                            destination.getEditText().getText().toString().equals("Vialayatkalan Road")||
//                                            destination.getEditText().getText().toString().equals("Ville Parle")||
//                                            destination.getEditText().getText().toString().equals("Vilegaon")||
//                                            destination.getEditText().getText().toString().equals("Villianur")||
//                                            destination.getEditText().getText().toString().equals("Villivakkam")||
//                                            destination.getEditText().getText().toString().equals("Villiyambakkam")||
//                                            destination.getEditText().getText().toString().equals("Viluppuram Junction")||
//                                            destination.getEditText().getText().toString().equals("Vindhyachal")||
//                                            destination.getEditText().getText().toString().equals("Vinhere")||
//                                            destination.getEditText().getText().toString().equals("Vinnamangalam")||
//                                            destination.getEditText().getText().toString().equals("Vinukonda")||
//                                            destination.getEditText().getText().toString().equals("Viramdad")||
//                                            destination.getEditText().getText().toString().equals("Viramgam Junction")||
//                                            destination.getEditText().getText().toString().equals("Virani Alur")||
//                                            destination.getEditText().getText().toString().equals("Virapandy Road")||
//                                            destination.getEditText().getText().toString().equals("Viraput")||
//                                            destination.getEditText().getText().toString().equals("Virar")||
//                                            destination.getEditText().getText().toString().equals("Virarakkiyam")||
//                                            destination.getEditText().getText().toString().equals("Viravada")||
//                                            destination.getEditText().getText().toString().equals("Viravalli")||
//                                            destination.getEditText().getText().toString().equals("Viravasaram")||
//                                            destination.getEditText().getText().toString().equals("Virbhadra")||
//                                            destination.getEditText().getText().toString().equals("Virichipuram")||
//                                            destination.getEditText().getText().toString().equals("Virochannagar")||
//                                            destination.getEditText().getText().toString().equals("Virol")||
//                                            destination.getEditText().getText().toString().equals("Virpur")||
//                                            destination.getEditText().getText().toString().equals("Virudunagar Junction")||
//                                            destination.getEditText().getText().toString().equals("Virul")||
//                                            destination.getEditText().getText().toString().equals("Visakhapatnam")||
//                                            destination.getEditText().getText().toString().equals("Visapur")||
//                                            destination.getEditText().getText().toString().equals("Visavadar")||
//                                            destination.getEditText().getText().toString().equals("Vishnupuram")||
//                                            destination.getEditText().getText().toString().equals("Vishrambag")||
//                                            destination.getEditText().getText().toString().equals("Vishvamitri")||
//                                            destination.getEditText().getText().toString().equals("Visnagar")||
//                                            destination.getEditText().getText().toString().equals("Viswanath Chrli")||
//                                            destination.getEditText().getText().toString().equals("Vithalwadi")||
//                                            destination.getEditText().getText().toString().equals("Viveka Vihar")||
//                                            destination.getEditText().getText().toString().equals("Vivekanandpuri Halt")||
//                                            destination.getEditText().getText().toString().equals("Vizianagaram Junction")||
//                                            destination.getEditText().getText().toString().equals("V. O. C. Nagar railway station")||
//                                            destination.getEditText().getText().toString().equals("Vondh")||
//                                            destination.getEditText().getText().toString().equals("Vriddhachalam Junction")||
//                                            destination.getEditText().getText().toString().equals("Vrindhachalam Town")||
//                                            destination.getEditText().getText().toString().equals("Vrindaban Road")||
//                                            destination.getEditText().getText().toString().equals("Vyara")||
//                                            destination.getEditText().getText().toString().equals("Vyasarpadi Jeeva")||
//                                            destination.getEditText().getText().toString().equals("Vyasnagar")||
//                                            destination.getEditText().getText().toString().equals("Wadakanchery")||
//                                            destination.getEditText().getText().toString().equals("Wadala Road")||
//                                            destination.getEditText().getText().toString().equals("Wadegaon")||
//                                            destination.getEditText().getText().toString().equals("Wadhwan City")||
//                                            destination.getEditText().getText().toString().equals("Wadi Junction")||
//                                            destination.getEditText().getText().toString().equals("Wadiaram")||
//                                            destination.getEditText().getText().toString().equals("Wadrengdisa")||
//                                            destination.getEditText().getText().toString().equals("Wadsa")||
//                                            destination.getEditText().getText().toString().equals("Wadsinge")||
//                                            destination.getEditText().getText().toString().equals("Wadwal Nagnath")||
//                                            destination.getEditText().getText().toString().equals("Waghai")||
//                                            destination.getEditText().getText().toString().equals("Waghoda")||
//                                            destination.getEditText().getText().toString().equals("Wair")||
//                                            destination.getEditText().getText().toString().equals("Walajabad")||
//                                            destination.getEditText().getText().toString().equals("Walajah Road")||
//                                            destination.getEditText().getText().toString().equals("Walayar")||
//                                            destination.getEditText().getText().toString().equals("Wan Road")||
//                                            destination.getEditText().getText().toString().equals("Wandal")||
//                                            destination.getEditText().getText().toString().equals("Wanderjatana")||
//                                            destination.getEditText().getText().toString().equals("Wanegaon")||
//                                            destination.getEditText().getText().toString().equals("Wangapalli")||
//                                            destination.getEditText().getText().toString().equals("Wani")||
//                                            destination.getEditText().getText().toString().equals("Wankaner City")||
//                                            destination.getEditText().getText().toString().equals("Wankaner Junction")||
//                                            destination.getEditText().getText().toString().equals("Wanparti Road")||
//                                            destination.getEditText().getText().toString().equals("Wansjaliya")||
//                                            destination.getEditText().getText().toString().equals("Warangal")||
//                                            destination.getEditText().getText().toString().equals("Wardha East")||
//                                            destination.getEditText().getText().toString().equals("Wardha Junction")||
//                                            destination.getEditText().getText().toString().equals("Waria")||
//                                            destination.getEditText().getText().toString().equals("Warigaon Newada")||
//                                            destination.getEditText().getText().toString().equals("Waris Aleganj")||
//                                            destination.getEditText().getText().toString().equals("Warora")||
//                                            destination.getEditText().getText().toString().equals("Warud")||
//                                            destination.getEditText().getText().toString().equals("Warudkhed")||
//                                            destination.getEditText().getText().toString().equals("Wasanapura")||
//                                            destination.getEditText().getText().toString().equals("Washermanpet")||
//
//                                            destination.getEditText().getText().toString().equals("Washim")||
//                                            destination.getEditText().getText().toString().equals("Washimbe")||
//                                            destination.getEditText().getText().toString().equals("Wasud")||
//                                            destination.getEditText().getText().toString().equals("Wathar")||
//                                            destination.getEditText().getText().toString().equals("Wazerganj")||
//                                            destination.getEditText().getText().toString().equals("Wellington")||
//                                            destination.getEditText().getText().toString().equals("Wena")||
//                                            destination.getEditText().getText().toString().equals("West Hill")||
//                                            destination.getEditText().getText().toString().equals("West Mambalam")||
//                                            destination.getEditText().getText().toString().equals("Whitefield")||
//                                            destination.getEditText().getText().toString().equals("Wihirgaon")||
//                                            destination.getEditText().getText().toString().equals("Wimco Nagar")||
//                                            destination.getEditText().getText().toString().equals("Wirur")||
//                                            destination.getEditText().getText().toString().equals("WRS Colony PH")||
//                                            destination.getEditText().getText().toString().equals("Wyndhamganj")||
//                                            destination.getEditText().getText().toString().equals("Yadalapur")||
//                                            destination.getEditText().getText().toString().equals("Yadgir")||
//                                            destination.getEditText().getText().toString().equals("Yadudih")||
//                                            destination.getEditText().getText().toString().equals("Yadvendranagar")||
//                                            destination.getEditText().getText().toString().equals("Yakutpura")||
//                                            destination.getEditText().getText().toString().equals("Yalvigi")||
//                                            destination.getEditText().getText().toString().equals("Yamuna Bridge")||
//                                            destination.getEditText().getText().toString().equals("Yamuna South Bank")||
//                                            destination.getEditText().getText().toString().equals("Yaqutganj")||
//                                            destination.getEditText().getText().toString().equals("Yataluru")||
//                                            destination.getEditText().getText().toString().equals("Yavatmal")||
//                                            destination.getEditText().getText().toString().equals("Yedamangala")||
//                                            destination.getEditText().getText().toString().equals("Yedapalli")||
//                                            destination.getEditText().getText().toString().equals("Yedakumeri")||
//                                            destination.getEditText().getText().toString().equals("Yedshi")||
//                                            destination.getEditText().getText().toString().equals("Yelahanka Junction")||
//                                            destination.getEditText().getText().toString().equals("Yelgur")||
//                                            destination.getEditText().getText().toString().equals("Yeliyur")||
//                                            destination.getEditText().getText().toString().equals("Yellakaru")||
//                                            destination.getEditText().getText().toString().equals("Yeola")||
//                                            destination.getEditText().getText().toString().equals("Yermaras")||
//                                            destination.getEditText().getText().toString().equals("Yerpedu")||
//                                            destination.getEditText().getText().toString().equals("Yerra Goppa Halt")||
//                                            destination.getEditText().getText().toString().equals("Yerraguntla Junction")||
//                                            destination.getEditText().getText().toString().equals("Yesvantpur Junction")||
//                                            destination.getEditText().getText().toString().equals("Yeulkhed")||
//                                            destination.getEditText().getText().toString().equals("Yevat")||
//                                            destination.getEditText().getText().toString().equals("Yogendra Dham Halt")||
//                                            destination.getEditText().getText().toString().equals("Yusufpur")||
//                                            destination.getEditText().getText().toString().equals("Zafarabad Junction")||
//                                            destination.getEditText().getText().toString().equals("Zahirabad")||
//                                            destination.getEditText().getText().toString().equals("Zamania")||
//                                            destination.getEditText().getText().toString().equals("Zampini")||
//                                            destination.getEditText().getText().toString().equals("Zantalapalle")||
//                                            destination.getEditText().getText().toString().equals("Zankhvav")||
//                                            destination.getEditText().getText().toString().equals("Zarap")||
//                                            destination.getEditText().getText().toString().equals("Zarpur Pali")||
//                                            destination.getEditText().getText().toString().equals("Zawar")||
//                                            destination.getEditText().getText().toString().equals("Zindpura")

                            )
                            {
    //                          if (source.getEditText().getText().toString() == destination.getEditText().getText().toString() ) // wrong syntax
   //                           if (source == destination ) // wrong syntax
                                if(source.getEditText().getText().toString().equals(destination.getEditText().getText().toString()) ) // for checking both source & destination station should be different...
                                {
                                    Toast.makeText(HomeActivity.this, "Source & Destination could not be same.", Toast.LENGTH_SHORT).show();
                                }
                                else // IF ALL CORRECT THEN DATA WILL UPLOAD HERE..................................................................................................

                                {
                                    processinsert(name.getEditText().getText().toString(), source.getEditText().getText().toString(), destination.getEditText().getText().toString(), date.getEditText().getText().toString(), email.getEditText().getText().toString());
                                }
                            }
                            else // if destination station is wrong...
                            {
                                Toast.makeText(HomeActivity.this, "Enter the correct destination station.", Toast.LENGTH_SHORT).show();
                            }
                    }
                    else // if source station is wrong...
                    {
                        Toast.makeText(HomeActivity.this, "Enter the correct source station.", Toast.LENGTH_SHORT).show();
                    }// inner else...if source station is right.
                } // main else... if no any single field is empty.

            }
        }                      );


        fb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(),fetchdata.class));
            }
        }                    );




    }

    ////////////////// CODE FOR SIGN OUT TASK.........................................
    void signOut()
    {
        gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>()
        {
            @Override
            public void onComplete(Task<Void> task) {
                finish();
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
            }
        }
                                           );
    }

    ////////////////// CODE FOR TAKING DATA TASK.........................................
    private void processinsert(String n, String s, String de, String da, String e)
    {
        String res=new dbmanager(this).addrecord(n,s,de,da,e);
        name.getEditText().setText("");
        source.getEditText().setText("");
        destination.getEditText().setText("");
        date.getEditText().setText("");
        email.getEditText().setText("");
        Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
    }


}
        package com.example.ticketresellingsystem;
        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;


        import android.content.Intent;
        import android.view.View;
        import android.widget.Button;
        import android.os.Bundle;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.view.WindowManager;

        import com.google.android.material.textfield.TextInputLayout;


public class DecisionActivity extends AppCompatActivity
{

    TextView welcome_headline, title, Is_Your_Tickets_Going_Waste_headline, Planning_For_Yatra_headline;
    Button btn_sell_option, btn_buy_option;
    // Button signOutBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);


        welcome_headline= (TextView) findViewById(R.id.welcome_headline);
        title = (TextView) findViewById(R.id.title);
        Is_Your_Tickets_Going_Waste_headline = (TextView) findViewById(R.id.Is_Your_Tickets_Going_Waste_headline);
        Planning_For_Yatra_headline = (TextView) findViewById(R.id.Planning_For_Yatra_headline);
        btn_sell_option = (Button) findViewById(R.id.btn_sell_option);
        btn_buy_option = (Button) findViewById(R.id.btn_buy_option);



        ////////////////// CODE FOR Moving To Selling Page.........................................

        btn_sell_option.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            }
        }                             );

//        public void setBtn_sell_option(@NonNull Button btn_sell_option)
//        {
//            this.btn_sell_option = btn_sell_option;
//            btn_sell_option.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View view)
//                {
//                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//                }
//            }                                 );
//        }


        ////////////////// CODE FOR Moving To Offers' Page.........................................
        btn_buy_option.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(),fetchdata.class));
            }
        }                        );

//        public void setBtn_buy_option (@NonNull Button btn_buy_option)
//        {
//            this.btn_buy_option = btn_buy_option;
//            btn_buy_option.setOnClickListener(new View.OnClickListener()
//            {
//                @Override
//                public void onClick(View view)
//                {
//                    startActivity(new Intent(getApplicationContext(), fetchdata.class));
//                }
//            }                                );
//        }



    }
}
package com.askfortricks.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.test.retrofitdemo.R;

import java.util.HashMap;
import java.util.Map;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvApi=findViewById(R.id.tvApi);
        tvApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callApi();
            }
        });

    }

    private void callApi() {
        //Obtain an instance of Retrofit by calling the static method.
        Retrofit retrofit = NetworkClient.getRetrofitClient();
        /*
        The main purpose of Retrofit is to create HTTP calls from the Java interface based on the annotation associated with each method. This is achieved by just passing the interface class as parameter to the create method
        */
        Matchinterface matchApis = retrofit.create(Matchinterface.class);
        /*
        Invoke the method corresponding to the HTTP request which will return a Call object. This Call object will used to send the actual network request with the specified parameters
        */
        //Here the json data is add to a hash map with key data
        Map<String,String> params = new HashMap<String, String>();
        params.put("match_id", "23");
        Call<MatchModel> call = matchApis.postMatchDetails(params);
        /*
        This is the line which actually sends a network request. Calling enqueue() executes a call asynchronously. It has two callback listeners which will invoked on the main thread
        */
        call.enqueue(new Callback<MatchModel>() {
            @Override
            public void onResponse(Call<MatchModel> call, Response<MatchModel> response) {

                if (response.body() != null) {
                    MatchModel matchModel = response.body();
                   // Log.e("apiresponse", "onResponse: "+matchModel.toString());
                    if(matchModel.getSucccess()==1)
                    {
                        Log.e("suggestion1", "onResponse: "+matchModel.getSuggestion1());
                        Log.e("suggestion2", "onResponse: "+matchModel.getSuggestion2());
                        Log.e("suggestion3", "onResponse: "+matchModel.getSuggestion3());
                        Log.e("suggestion4", "onResponse: "+matchModel.getSuggestion4());
                    }

                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {

                t.printStackTrace();
            }
        });


    }
}

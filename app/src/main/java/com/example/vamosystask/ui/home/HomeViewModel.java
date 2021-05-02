package com.example.vamosystask.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.vamosystask.model.Data;
import com.example.vamosystask.model.VehicleLocations;
import com.example.vamosystask.network.MyApi;
import com.example.vamosystask.network.MyClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {


    public String regNo,lastSeen,fuelLitre,odoDistance,status,temperature,speed;
    public List<VehicleLocations> vehicleLocations;
    public MutableLiveData<ArrayList<HomeViewModel>> mutableLiveData = new MutableLiveData<>();
    private ArrayList<HomeViewModel> arrayList;
    private List<Data> myList;


    public HomeViewModel(VehicleLocations vehicleLocations) {
        this.regNo = vehicleLocations.regNo;
        this.lastSeen = vehicleLocations.lastSeen;
        this.fuelLitre = vehicleLocations.fuelLitre;
        this.odoDistance = vehicleLocations.odoDistance;
        this.status= vehicleLocations.status;
        this.temperature = vehicleLocations.temperature;
        this.speed = vehicleLocations.speed+" Km/hr";
    }

    public HomeViewModel() {

    }

    public MutableLiveData<ArrayList<HomeViewModel>> getMutableLiveData() {

        vehicleLocations = new ArrayList<>();

        MyApi api = MyClient.getInstance().getMyApi();
        Call<List<Data>> call = api.getresponse();
        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {

                myList = response.body();
                arrayList = new ArrayList<>();

                vehicleLocations = myList.get(0).vehicleLocations;

                for (int i = 0; i < vehicleLocations.size(); i++) {
                    VehicleLocations myk = vehicleLocations.get(i);
                    HomeViewModel myListViewModel = new HomeViewModel(myk);
                    arrayList.add(myListViewModel);
                    mutableLiveData.setValue(arrayList);
                }

            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }



}
package com.example.nfc_gacor.APIService;

/**
 * Created by user on 1/10/2018.
 */




import com.example.nfc_gacor.model.produk.ModelProduk;
import com.example.nfc_gacor.model.topup.ModelTopup;
import com.example.nfc_gacor.model.user.Modeluser;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;


public interface APIInterfacesRest {

//    @GET("player/all")
//    Call<> getPlayer(@Query("api-key") String apikey);
    @GET("user1/all")

    Call<Modeluser> getUser(@Query("api-key") String apikey);
    @GET("produk/all")

    Call<ModelProduk> getProduk(@Query("api-key") String apikey);
    @GET("topup/all")

    Call<ModelTopup> getTopup(@Query("api-key") String apikey);


    //

   /* @Multipart
    @POST("room/add")
    Call<ModelRoom> sendDataRoomName(

            @Part("room_name") RequestBody room_name,
            @Part("player") RequestBody player,
            @Part("status") RequestBody status

    ); */

   /* @Multipart
    @POST("juara_textjalan/add")
    Call<ModelAdd> sendTextJalan(

            @Part("dari") RequestBody dari,
            @Part("time") RequestBody time,
            @Part("text") RequestBody text,
            @Part("status") RequestBody status,
            @Part MultipartBody.Part picture1
    );*/

     

}


package net.lishaoy.app_retrofit.net.retrofit;

import net.lishaoy.app_retrofit.bean.SearchTripShoot;
import net.lishaoy.app_retrofit.bean.TripShoot;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface IApi {
    @GET("15612/json/getTripShootHomePage")
    Call<TripShoot> get();

    /**
     * 表单请求
     * @param username
     * @return
     */
    @POST
    @FormUrlEncoded
    Call<TripShoot> post(@Field("username") String username);

    /**
     * 文件请求
     * @param requestBody
     * @return
     */
    @POST
    @Multipart
    Call<TripShoot> postMultipart(@Part("requestBody") RequestBody requestBody);

    /**
     * json 请求
     * @param requestBody
     * @return
     */
    @POST("16189/json/searchTripShootListForHomePageV2?_fxpcqlniredt=09031014111431397988&__gw_appid=99999999&__gw_ver=1.0&__gw_from=10650013707&__gw_platform=H5")
    Call<SearchTripShoot> postJson(@Body RequestBody requestBody);


}

package com.AndroidFunitureShopApp.model.Product;

import com.AndroidFunitureShopApp.model.Product.Product;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
public interface productsAPI {
    @GET("getProducts.php")
    Single<List<Product>> getProducts();
}

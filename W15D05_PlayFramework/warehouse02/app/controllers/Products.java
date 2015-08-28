package controllers;

import models.Product;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.list;

import java.util.List;

/**
 * Created by adis.cehajic on 28/08/15.
 */
public class Products extends Controller {

    public Result list() {
        List<Product> products = Product.findAll();
        return ok(list.render(products));
    }

    public Result newProduct() {
        return TODO;
    }

    public Result details(String ean) {
        return TODO;
    }

    public Result save() {
        return TODO;
    }
}

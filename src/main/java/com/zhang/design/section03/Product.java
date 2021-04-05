package com.zhang.design.section03;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Product
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/21 13:09
 * @Version 1.0
 **/
public class Product {

    private String name;

    private String no;

    private Double price;

    public Product(String name, String no, Double price) {
        this.name = name;
        this.no = no;
        this.price = price;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", price=" + price +
                '}';
    }

    public static class ProductBuilder {

        private String name;

        private String no;

        private Double price;

        ProductBuilder() {
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder no(String no) {
            this.no = no;
            return this;
        }

        public ProductBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public Product builder() {
            return new Product(this.name, this.no, this.price);
        }

    }

}

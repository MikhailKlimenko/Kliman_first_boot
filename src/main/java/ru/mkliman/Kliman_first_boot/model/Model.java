package ru.mkliman.Kliman_first_boot.model;

import java.util.Objects;

public class Model {
     private Integer id;
    private Integer car_id;
    private Integer modification_id;
    private Integer complectation_id;
    private Integer package_id;
    private Integer color_exterior_id;
    private Integer color_interior_id;
    private Integer count_show;
    private Integer price;
    private Integer year;
    private String ocn;
    private Integer count_available;
    private String model_name;
    private Integer discount_state;
    private Integer discount_start;
    private Integer credit_available;
    private Integer cash_availabl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public Integer getModification_id() {
        return modification_id;
    }

    public void setModification_id(Integer modification_id) {
        this.modification_id = modification_id;
    }

    public Integer getComplectation_id() {
        return complectation_id;
    }

    public void setComplectation_id(Integer complectation_id) {
        this.complectation_id = complectation_id;
    }

    public Integer getPackage_id() {
        return package_id;
    }

    public void setPackage_id(Integer package_id) {
        this.package_id = package_id;
    }

    public Integer getColor_exterior_id() {
        return color_exterior_id;
    }

    public void setColor_exterior_id(Integer color_exterior_id) {
        this.color_exterior_id = color_exterior_id;
    }

    public Integer getColor_interior_id() {
        return color_interior_id;
    }

    public void setColor_interior_id(Integer color_interior_id) {
        this.color_interior_id = color_interior_id;
    }

    public Integer getCount_show() {
        return count_show;
    }

    public void setCount_show(Integer count_show) {
        this.count_show = count_show;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getOcn() {
        return ocn;
    }

    public void setOcn(String ocn) {
        this.ocn = ocn;
    }

    public Integer getCount_available() {
        return count_available;
    }

    public void setCount_available(Integer count_available) {
        this.count_available = count_available;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public Integer getDiscount_state() {
        return discount_state;
    }

    public void setDiscount_state(Integer discount_state) {
        this.discount_state = discount_state;
    }

    public Integer getDiscount_start() {
        return discount_start;
    }

    public void setDiscount_start(Integer discount_start) {
        this.discount_start = discount_start;
    }

    public Integer getCredit_available() {
        return credit_available;
    }

    public void setCredit_available(Integer credit_available) {
        this.credit_available = credit_available;
    }

    public Integer getCash_availabl() {
        return cash_availabl;
    }

    public void setCash_availabl(Integer cash_availabl) {
        this.cash_availabl = cash_availabl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id.equals(model.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

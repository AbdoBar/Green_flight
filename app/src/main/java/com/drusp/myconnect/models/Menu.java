package com.drusp.myconnect.models;

public class Menu {
    private String menuId;
    private String name;
    private String image;
    private String amount;

    public Menu() {
    }

    public Menu(String menuId, String name, String image, String amount) {
        this.menuId = menuId;
        this.name = name;
        this.image = image;
        this.amount=amount;

    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }



    public String getname() {
        return name;
    }

    public void setname(String name) { this.name = name;}



    public String getimage() {
        return image;
    }

    public void setimage(String image) { this.image = image;}



    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) { this.amount = amount;}


}

package za.ac.cput.domain.menu;

/* menuItem.java
Entity for the MenuItem
Author: Bongisa Mpahleni (216205999)
Date: 02 April 2022
*/


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MenuItem")
public class MenuItem implements Serializable {

    @Id
    private int menuItemID;
    @Column(length = 10,name = "price")
    private Double price;
    @Column(length = 25,name = "portion")
    private String portion ;

    protected MenuItem (){

    }

    private MenuItem(Builder builder) {

        this.menuItemID = builder.menuItemID;
        this.price = builder.price;
        this.portion = builder.portion;

    }



    public Integer getMenuItemID() {
        return menuItemID;
    }

    public Double getPrice() {
        return price;
    }

    public String getPortion() {
        return portion;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemID=" + menuItemID +
                ", price=" + price +
                ", portion='" + portion + '\'' +
                '}';
    }

    public static class Builder
    {
        private int menuItemID;
        private Double price;
        private String portion;

        //Set item id
        public Builder setMenuItemID(int menuItemID) {
            this.menuItemID = menuItemID;
            return this;
        }
        //Set price
        public Builder setPrice(Double price) {
            this.price = price;
            return this;
        }
        //Set portion
        public Builder setPortion(String portion)
        {
            this.portion= portion;
            return this;
        }

        //Copy method
        public Builder copy(MenuItem menuItem)
        {
            this.menuItemID = menuItem.menuItemID;
            this.price = menuItem.price;
            this.portion= menuItem.portion;
            return this;
        }

        public MenuItem build()
        {
            return new MenuItem(this);
        }
    }

}

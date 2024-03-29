package za.ac.cput.domain.menu;

/* Menu.java
Entity for the Menu
Author: Bongisa Mpahleni (216205999)
Date: 02 April 2022
*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Menu")
public class Menu implements Serializable {

    @Id
    private int menuID;
    @Column(length = 25,nullable = false, name = "name")
    private String name;

    protected Menu() {

    }

    private Menu(Builder builder) {

        this.menuID = builder.menuID;
        this.name = builder.name;

    }

    public Integer getMenuID() {
        return menuID;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuID=" + menuID +
                ", name='" + name + '\'' +
                '}';
    }

    public static class Builder
    {
        private int menuID;
        private String name;


        public Builder setMenuID(int menuID) {
            this.menuID = menuID;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        //Copy method
        public Builder copy(Menu menu)
        {
            this.menuID = menu.menuID;
            this.name = menu.name;
            return this;
        }

        public Menu build()
        {
            return new Menu(this);
        }
    }

}

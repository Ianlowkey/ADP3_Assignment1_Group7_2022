/*
TableFactory.java
This is the table factory class
Author: Felecia Zweni(218330189)
Date: 10 April 2022
 */

package za.ac.cput.factory;

import za.ac.cput.entity.Table;
import za.ac.cput.util.genericHelper;

public class TableFactory {
    public static Table createTable(int tblNum, int seatAmount){

        String tableID = genericHelper.generateId();
        Table table = new Table.Builder().setTblNum(tblNum).setSeatAmount(seatAmount).build();
        return table;
    }
}

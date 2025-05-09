package entity;

import java.net.URLDecoder;

public class Consts {
    private Consts() {
        throw new AssertionError();
    }

    protected static final String DB_FILEPATH = getDBPath();

    public static final String CONN_STR = "jdbc:ucanaccess://"  + DB_FILEPATH + ";COLUMNORDER=DISPLAY";
    public static final String SQL_INS_MANUFACTURE =
            "INSERT INTO TblManufactures (manufactureId, manufactureFullName, manufacturePhoneNumber, manufactureAddress, manufactureEmail) VALUES (?, ?, ?, ?, ?)";

    public static final String SQL_INS_WINE =
            "INSERT INTO TblWines (wineCatalogNumber, wineManufactureNumber, wineName, wineDescription, wineProductionYear, winePricePerBootle," +
                    "wineType, wineSweetnessLevel,  wineProductImage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String SQL_DEL_MANUFACTURE =
            "DELETE FROM Manufactures WHERE manufactureId = ?";

    public static final String SQL_UPD_MANUFACTURE =
            "UPDATE Manufactures SET manufactureFullName = ?, manufacturePhoneNumber = ?, manufactureAddress = ?, manufactureEmail = ? WHERE manufactureId = ?";

    // orders const

    public static final String SQL_SEL_ORDERS =
            "SELECT  orderNumber, orderDate, orderCurrentStatus, orderShipmentDate , orderEmployee, orderCountBottle, wineCatalogNumber FROM TblOrders";

    public static final String SQL_INS_ORDER =
            "INSERT INTO TblOrders ( orderNumber, orderDate, orderCurrentStatus, orderShipmentDate , orderEmployee, orderCountBottle, wineCatalogNumber) VALUES (?, ?, ?, ?, ?, ?, ?)";

    public static final String SQL_DEL_ORDER =
            "DELETE FROM TblOrders WHERE orderNumber = ?";

    public static final String SQL_UPD_ORDER =
            "UPDATE TblOrders SET  orderDate = ?, orderCurrentStatus = ?, orderShipmentDate = ?, orderEmployee = ? WHERE orderNumber = ?";

    // storage const
    public static final String SQL_SEL_STORAGE_LOCATIONS =
            "SELECT locationNumber, locationName FROM TblStorageLocations";

    public static final String SQL_SEL_WINE_STORAGE =
            "SELECT locationNumber, botleCount, wineCatalogNumber, wineManifactureNumber FROM TbWinelStorageLocations";

    public static final String SQL_INS_STORAGE_LOCATION =
            "INSERT INTO TblStorageLocations (locationNumber, locationName) VALUES (?, ?)";

    public static final String SQL_INS_WINE_STORAGE =
            "INSERT INTO TbWinelStorageLocations (locationNumber, botleCount, wineCatalogNumber, wineManifactureNumber) VALUES (?, ?, ?, ?)";

    public static final String SQL_DEL_STORAGE_LOCATION =
            "DELETE FROM TblStorageLocations WHERE locationNumber = ?";

    public static final String SQL_DEL_WINE_STORAGE =
            "DELETE FROM TbWinelStorageLocations WHERE locationNumber = ? AND wineCatalogNumber = ?";

    public static final String SQL_UPD_STORAGE_LOCATION =
            "UPDATE TblStorageLocations SET locationName = ? WHERE locationNumber = ?";

    public static final String SQL_UPD_WINE_STORAGE =
            "UPDATE TbWinelStorageLocations SET bottleCount = ? WHERE locationNumber = ? AND wineCatalogNumber = ?";
    //employee
    public static final String SQL_DEL_EMPLOYEE =
            "DELETE FROM TblEmployees WHERE ID = ?";



    //    public static final String SQL_SEL_EMPLOYEES = "SELECT * FROM TblEmployees";
//    public static final String SQL_DEL_EMPLOYEE = "{ call qryDelEmployee(?) }";
//    public static final String SQL_INS_EMPLOYEE =
//            "{ call qryInsEmployee(?,?,?,?,?,?,?,?,?,?,?) }";
//    public static final String SQL_UPD_EMPLOYEE =
//            "{ call qryUpdEmployee(?,?,?,?,?,?,?,?,?,?,?,?) }";
//
   public static final String SQL_SEL_MANUFACTURES = "SELECT * FROM TblManufactures";
//    public static final String SQL_UPD_ORDER =
//            "{ call qryUpdOrder(?,?,?,?,?,?,?,?,?,?) }";
//    public static final String SQL_ADD_ORDER =
//            "{ call qryInsOrder(?,?,?,?,?,?,?,?,?) }";
//    public static final String SQL_DEL_ORDER =
//            "{ call qryDelOrder(?) }";
//
//
   public static final String SQL_SEL_MANUFACTURES_DETAILS =
            "{ call qryDelOrderDetails(?) }";
//    public static final String SQL_DEL_ORDER_DETAILS_PRODUCT =
//            "{ call qryDelOrderDetailProduct(?,?) }";
//
//    public static final String SQL_SEL_ORDER_DETAILS = "SELECT TblOrderDetails.orderID,TblOrderDetails.ProductID, TblProducts.ProductName, TblOrderDetails.Quantity, TblOrderDetails.Discount, TblProducts.UnitPrice, [TblProducts].[UnitPrice]*[TblOrderDetails].[Quantity]*(1-[TblOrderDetails].[Discount]) AS LinePrice FROM TblProducts INNER JOIN TblOrderDetails ON TblProducts.ProductID = TblOrderDetails.ProductID WHERE (((TblOrderDetails.OrderID)=?));";
//    public static final String SQL_UPD_ORDER_DETAILS ="{ call qryUpdOrderDetails(?,?,?,?) }";
//    public static final String SQL_INS_ORDER_DETAILS ="{ call qryInsOrderDetails(?,?,?,?) }";
//    //	"{ call qryInsOrderDetails(?,?,?,?) }";
//
//
//
//    public static final String  SQL_SEL_CUSTOMERS= "SELECT TblCustomers.CustomerID, TblCustomers.CompanyName FROM TblCustomers;";
//    public static final String  SQL_SEL_SHIPPERS= "SELECT TblShippers.* FROM TblShippers;";
//    public static final String  SQL_SEL_PRODUCTS= "SELECT TblProducts.* FROM TblProducts;";
    private static String getDBPath() {
        try {
            String path = Consts.class.getProtectionDomain().getCodeSource().getLocation().getPath();
            String decoded = URLDecoder.decode(path, "UTF-8");

            if (decoded.contains(".jar"))
            {
                decoded = decoded.substring(0, decoded.lastIndexOf('/'));
                System.out.println(decoded);

                return decoded + "/database/database.accdb";}
            else {
                decoded = decoded.substring(0, decoded.lastIndexOf('/'));
                //System.out.println(decoded);

                return decoded + "/entity/database.accdb";}


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

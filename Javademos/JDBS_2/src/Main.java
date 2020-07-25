import java.sql.*;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) throws SQLException {
            //--------------------DELETE KOMUTU----------------------------
            Connection connection=null;
            DbHelper dbHelper=new DbHelper();
            PreparedStatement statement=null;
            ResultSet resultSet;

            try{
                connection=dbHelper.getConnection();
                //statement=connection.prepareStatement
                //      ("DELETE FROM CİTY where id=4082");
                //String sql="DELETE FROM CİTY where id=4081";
                String sql="DELETE FROM CİTY where id=?";
                statement=connection.prepareStatement(sql);
                statement.setInt(1,4081);//ALTERNATİF  YOL...

                statement.executeUpdate();
                System.out.println("kayıt silindi");

            }catch (SQLException exception){
                dbHelper.showErrorMessage(exception);

            }finally {
                statement.close();
                connection.close();

            }

        }

//--------------------SELECT KOMUTU----------------------------
        public static void selectDemo() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;

        try{
            connection=dbHelper.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery(("select Code,Name,Continent,Region from country"));

            ArrayList<Country> countries=new ArrayList<Country>();

            while (resultSet.next()){
                //System.out.println(resultSet.getString("Name"));
                countries.add(new Country(
                                resultSet.getString("Code"),//DATADAKİ ELEMANLAR EKLENİYOR
                                resultSet.getString("Name"),
                                resultSet.getString("Continent"),
                                resultSet.getString("Region")
                        )
                );
            }

            System.out.println(countries.size());//DATALARIN EKLENDİĞİNİN SONUCUNU SIZE A BAKIP ANLAYABİLİRİZ

        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);

        }finally {
            connection.close();

        }

    }

    //--------------------INSERT KOMUTU----------------------------
    public static void insertDemo() throws SQLException{
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;

        try{
            connection=dbHelper.getConnection();
            //statement=connection.prepareStatement
            //      ("insert into city(Name,CountryCode,District,Population) values('Düzce','TUR','Düzce',50000)");  ALTERNATİF EKLEME YOLU....
            String sql="insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);

            statement.executeUpdate();
            System.out.println("kayıt eklendi");

        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);

        }finally {
            statement.close();
            connection.close();

        }
    }

    //--------------------UPDATE KOMUTU----------------------------
    public static void updateData() throws SQLException{

        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;

        try{
            connection=dbHelper.getConnection();
            //statement=connection.prepareStatement
            //      ("update city set Population=80000 where id=4082");
            //String sql="update city set Population=80000,District='Düzce' where id=4081";
            String sql="update city set Population=80000,District='Düzce' where id=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,4081);//ALTERNATİF  YOL...

            statement.executeUpdate();
            System.out.println("kayıt güncellendi");

        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);

        }finally {
            statement.close();
            connection.close();

        }
    }



}


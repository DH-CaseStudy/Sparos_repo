package day04.ex03;

public class DaoExample {
    public static void dbWokr(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWokr(new OracleDao());
        dbWokr(new MySqlDao());
    }
}

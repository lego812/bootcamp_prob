public class Database{

    private String connection = "MySQL";

    private static Database singleton = new Database(); //private 접근권한 갖는 싱글턴 객체 생성

    private Database(){
    } //private 접근권한 갖는 생성자 생성

    public static Database getInstance(){
        return singleton;
    } //public 접근 권한을 갖는 정적 메소드 생성-->외부에서 싱글턴 객체에 접근하는 유일한 방법

    public String getConnection() {
        return connection;
    }//내부 필드에 접근하는 메소드

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }
    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }


}

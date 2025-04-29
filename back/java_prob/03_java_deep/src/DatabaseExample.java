class DatabaseExample {
    public static void main(String[] args) {
        Database database=Database.getInstance();//싱글턴 객체 생성
        database.connect();
        System.out.println("데이터베이스: "+ database.getConnection());
        database.close();
    }
}

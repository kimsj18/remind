//예외처리
//프로그램의 정상적인 종료를 위해 사용


public class day250204 {
    public static void main(String[] args) {

        //예외가 발생하였을때 일단 정상실행할수 있도록 처리하는 코드를 예외코드라 한다.
        // try-catch , try-catch-finally
        try{
            Class.forName("java.lang.String");
            System.out.println("클래스 존재");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());     //예외 정보를 얻는 방법1
            //System.out.println(e.toString());       //예외 정보를 얻는 방법2
            //e.printStackTrace();                    //예외 정보를 얻는 방법3
        }





    }

}

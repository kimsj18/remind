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

        String[] stringarray = {"100","l00"};
        for(int i=0 ; i<stringarray.length+1 ; i++) {
            try {
                int value = Integer.parseInt(stringarray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과" + e.getMessage());
            }catch (NullPointerException | NumberFormatException e1){
                System.out.println("숫자 변환 못함" + e1.getMessage());
            }
        }

        //예외 발생시키기 (throw)
        // try-catch로 예외처리하는 것이 아닌 메소드를 호출한 곳으로 떠넘기기(throw)
        try {
            findClass();
        } catch (Throwable e) {
            System.out.println("예외처리" + e.getMessage());    //호출한 곳에서 예외 처리
        }

    }

        public static void findClass() throws Exception{
            Class.forName("java.lang.String1");
    }



}




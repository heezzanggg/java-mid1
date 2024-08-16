package enumeration.test2.http;

public enum HttpStatus {
    OK(200, "OK"),   //public static HttpStatus ok = new HttpStatus(200,"OK")
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),;

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        System.out.println(code);
        for(HttpStatus httpStatus : HttpStatus.values()) {
            if(httpStatus.getCode() == code) {
                return httpStatus;
            }
        }
        return null;
    }

    public boolean isSuccess(){ //ture, false
        return code >= 200 && code <= 299;
    }

}

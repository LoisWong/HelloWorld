package OO7;

class Msg {
    private String msg;
    void setMsg(String arg) throws Exception  {
        if (arg.equals("Hey Hobo")) {
          throw new Exception("you are stupid");
           
        	// create a custom Exception with message
            // and throw it!               
        } else {                       
            msg = arg;               
        }       
    }    

    String getMsg() {               
        return msg;       
    }
}


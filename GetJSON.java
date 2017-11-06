package JSON;

import org.json.JSONObject;

/**
 * Created by Kai on 2017/11/5.
 * It  is a example to practice JSON
 */
public class GetJSON {
    public static void main(String[] args) {
        JSONObject obj;
        try{
            String tobyInfo = "{\"Data\":{\"Name\":\"tobyWang\",\"career\":\"Fighter|\",\"Email\":\"toby@hotmail.com\",\"Phone\":[1234567,0911123456]}}";
            obj = new JSONObject(tobyInfo);
            Object itsToby = obj.getJSONObject("Data");
            Object tobyOfPhone = obj.getJSONObject("Data").get("Phone");
            System.out.println("JSON object is : "+itsToby);
            System.out.println("Toby's Phone is : "+tobyOfPhone);
        }catch(Exception ex){
            System.out.println("error is : "+ex.toString());
        }

    }
}

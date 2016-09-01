import android.util.Base64;
    
String testValue = "Hello, world!";
        
byte[] encodeValue = Base64.encode(testValue.getBytes(), Base64.DEFAULT);      
byte[] decodeValue = Base64.decode(encodeValue, Base64.DEFAULT);
        
Log.d("TEST", "defaultValue = " + testValue);
Log.d("TEST", "encodeValue = " + new String(encodeValue));
Log.d("TEST", "decodeValue = " + new String(decodeValue));

/*
defaultValue = Test
encodeValue = VGVzdA==
decodeValue = Test
*/

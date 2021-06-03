
import java.net.URLEncoder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class QueryString {
    private String query;
public QueryString(Object name, Object value) {
query = URLEncoder.encode(name.toString( )) + "=" +
URLEncoder.encode(value.toString( ));
}
public QueryString( ) {
query = "";
}
public synchronized void add(Object name, Object value) {
if (!query.trim( ).equals("")) query += "&" ;
query += URLEncoder.encode(name.toString( )) + "=" +
URLEncoder.encode(value.toString( ));
}
public String toString( ) {
return query;
}
}

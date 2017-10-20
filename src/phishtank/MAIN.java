/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phishtank;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tokents=" EAACEdEose0cBAOtQZC8AZBA5lQ0qBUyhqEfKG5uKSjwyS6cPB49fUJWE9EY8hM2zBNqLbtKbnDxhQhTecOS9VmvwsXrABwR6x0gQIzHrgP1HDQv1pzbFLLWehZAtZCbHf6PRZCP2lJrQdZABrdpZBoRZBVEqYKEf0RXSst5yaQAOc56bBkMjuHWpAOePTD6kUILS99JgbChZBpwZDZD";
        FacebookClient fbClient = new DefaultFacebookClient(tokents);
        
        User me= fbClient.fetchObject("me", User.class);
        System.out.println(me.getName());
     
        
        
    }
    
}

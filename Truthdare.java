import java.sql.*;
import java.util.*;
public class Truthdare {
    static Connection conn = null; static Statement statement = null;
    public static void main(String args[]) throws SQLException{
        while(true){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/td?" + "user=root&password=Shubhamgode9@");
            statement = (Statement) conn.createStatement();
            System.out.println("Connected");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        Scanner sc = new Scanner(System.in);
        String t, d,choicetd,uname, partner,pname,particapant;
        System.out.print("Enter your name: ");
         uname = sc.nextLine();
         while(true){
        System.out.print("Playing with -> (Friend / Lover/ Computer):  ");
        partner = sc.nextLine();
        if (partner.equalsIgnoreCase("Friend") || partner.equalsIgnoreCase("Lover") || partner.equalsIgnoreCase("Computer")){
            break;
        }
         }
        while(true){
        if(partner.equals("Friend")||partner.equals("F") ||partner.equals("FRIEND") || partner.equals("friend") 
        && partner.equals("Lover")||partner.equals("L") ||partner.equals("LOVER") || partner.equals("lover")){
            System.out.println("What is his/her name: ");
            pname = sc.nextLine();
         break;
        }
        else if(partner.equals("COMPUTER") ||  partner.equals("C")||  partner.equals("computer") || partner.equals("Computer")){
            pname = "Device";
            break;
        }
        }
        System.out.println("Select one ");
        System.out.println("Truth Or   Dare: ");
        System.out.print("Please type here --->  ");
        choicetd = sc.nextLine();
        if(choicetd.equals("truth") || choicetd.equals("Truth") || choicetd.equals("TRUTH")){
            if(partner.equals("Friend")||partner.equals("F") ||partner.equals("FRIEND") || partner.equals("friend")){
        String [] friendtarr;
        friendtarr = new String[20];
        friendtarr[0]=("What is the most embarrassing thing that has ever happened to you in public?");
        friendtarr[1]=("Have you ever had a crush on someone in this room? Who was it?");
        friendtarr[2]=("If you could switch lives with anyone for a day, who would it be and why?");
        friendtarr[3]=("What is the silliest or funniest fear you have?");
        friendtarr[4]=("Have you ever pulled a prank on someone? What was it?");
        friendtarr[5]=("What is the most adventurous thing you have ever done?");
        friendtarr[6]=("Have you ever had a celebrity crush? Who was it?");
        friendtarr[7]=("What is the most significant challenge you have overcome in your life so far?");
        friendtarr[8]=("What is the most memorable birthday or celebration you have ever had?");
        friendtarr[9]=("What is the most unusual talent or skill you have?");
        friendtarr[10]=("What is your favorite childhood memory?");
        friendtarr[11]=("Have you ever had a secret that you have never told anyone? Care to share it now?");
        friendtarr[12]=("If you could go on a dream vacation, where would you go and who would you take with you?");
        friendtarr[13]=("If you could go on a road trip with three people, dead or alive, who would you choose and why?");
        friendtarr[14]=("Have you ever had a dream that felt so real you thought it actually happened when you woke up?");
        friendtarr[15]=("What is your favorite memory of our friendship?");
        friendtarr[16]=("If you could ask your future self one question, what would it be?");
        friendtarr[17]=("What is your most treasured possession, and why is it so important to you?");
        friendtarr[18]=("Have you ever had a funny or embarrassing nickname? What was it, and how did you get it?");
        friendtarr[19]=("If you could be a character from any movie or TV show, who would you choose and why?");

        Random r = new Random();
         for(int i =0; i < 3; i++){
             int findex = r.nextInt(friendtarr.length);
             String mrq = friendtarr[findex];
             System.out.print( (i + 1) + ": " +mrq+ "  =  ");System.out.print("\n");
            String fans = sc.nextLine();
            savedata(findex,uname,pname,mrq,fans);
         }
            }
        else if(partner.equals("Lover")||partner.equals("L") ||partner.equals("LOVER") || partner.equals("lover")){
        String [] lovearr;
        lovearr = new String[20];
        lovearr[0]=("What was your first impression of me when we met?");
        lovearr[1]=("What is your favorite memory of us together?");
        lovearr[2]=("What is one thing you admire or appreciate about me the most?");
        lovearr[3]=("Have you ever had a dream about us? If so, can you describe it?");
        lovearr[4]=("What is the most adventurous or spontaneous thing we have ever done as a couple?");
        lovearr[5]=("Is there something you have always wanted to ask me but were afraid to?");
        lovearr[6]=("If you could change one thing about our relationship, what would it be?");
        lovearr[7]=("What is your idea of the perfect date with me?");
        lovearr[8]=("What do you think is the key to a successful and happy relationship?");
        lovearr[9]=("What is one thing you believe has made our relationship stronger?");
        lovearr[10]=("Have you ever been nervous about introducing me to your friends or family? Why?");
        lovearr[11]=("What is your favorite thing about our intimacy or emotional connection?");
        lovearr[12]=("Is there a small habit or behavior of mine that you find endearing or cute?");
        lovearr[13]=("Have you ever kept a little surprise or gift hidden from me? If yes, can you share what it was?");
        lovearr[14]=("If we could take a dream vacation together, where would you want to go, and why?");
        lovearr[15]=("What is your love language, and do you feel it is being fulfilled in our relationship?");
        lovearr[16]=("How do you feel we have grown together as a couple since we started dating?");
        lovearr[17]=("What is something you have learned from me that has positively impacted your life");
        lovearr[18]=("Do you have any unfulfilled fantasies or dreams that you would like to share with me?");
        lovearr[19]=("What is one goal or dream you like us to achieve together in the future?");

        Random r = new Random();
         for(int i =0; i < 3; i++){
             int lindex = r.nextInt(lovearr.length);
             String mrq = lovearr[lindex];
             System.out.print( (i + 1) + ": " +mrq+ "  =  ") ;
            String lans = sc.nextLine();
            savedata(lindex,uname,pname,mrq,lans);
         }
        }
        else if(partner.equals("Computer")||partner.equals("C") ||partner.equals("COMPUTER") || partner.equals("computer")){
        String [] arr;
        arr = new String[11];
        arr[0] = ("What is your biggest fear?");
        arr[1] = ("What is the most embarrassing thing you have ever done?");
        arr[2] = ("What is a secret you have never told anyone?");
        arr[3] = ("What is your biggest fantasy?");
        arr[4] = ("When was the last time you cried?");
        arr[5] = ("What is the biggest lie you have ever told?");
        arr[6] = ("What is the most embarrassing photo of you?");
        arr[7] = ("What would you do if you were the opposite gender for a week?");
        arr[8] = ("What do most people assume about you that is true?");
        arr[9] = ("What are your thoughts on reincarnation?");
        arr[10] = ("What is one thing you have always wanted to do but have been too afraid to try?");
         Random r = new Random();
         for(int i =0; i < 3; i++){
             int index = r.nextInt(arr.length);
             String rq = arr[index];
             System.out.print( (i + 1) + ": " +rq+ "  =  ") ;
            String ans = sc.nextLine();
            savedata(index,uname,pname,rq,ans);
         } 
        }
        else {
            System.out.println("Please type correctly!!!");
        }
    }
        else if(choicetd.equals("Dare") || choicetd.equals("dare") || choicetd.equals("DARE")){
            if(partner.equals("Friend")||partner.equals("F") ||partner.equals("FRIEND") || partner.equals("friend")){
            String fdarr[];
            fdarr = new String[13];
            Random r = new Random();
            int dindex = r.nextInt(fdarr.length);
            for(int i = 0; i < fdarr.length; i++){
                fdarr[0]=("Swap clothes with the person on your right for the next three rounds.");
                fdarr[1]=("Dare: Perform your best dance moves in the middle of the room for one minute while others watch and cheer you on.");
                fdarr[2]=("Call a random contact from your phone and sing HAPPY BIRTHDAY to them, regardless of whether its their birthday or not.");
                fdarr[3]=("Send a text message to your crush (or someone you are interested in) saying, \"You are my sunshine, my only sunshine. I can not stop thinking about you!\"");
                fdarr[4]=("Attempt to do a handstand against the wall for at least 10 seconds.");
                fdarr[5]=("Speak in a foreign accent for the next three rounds, chosen by your friend.");
                fdarr[6]=("Give someone in the group a compliment and then do 10 push-ups in front of everyone as a reward.");
                fdarr[7]=("Go outside and shout \"I love [someone in the groups name]\" as loudly as possible three times.");
                fdarr[8]=("Wear a blindfold and guess three random objects that other players choose for you to touch.");
                fdarr[9]=("Create a short rap or song about a household item chosen by the group and perform it on the spot.");
                fdarr[10]=("Make up a short poem about the person on your left and recite it in front of everyone.");
                fdarr[11]=("Take a selfie with a silly facial expression and post it on your social media account with an equally silly caption.");
                fdarr[12]=(" Attempt to do a backflip (only if the person is capable and in a safe environment).");
            }System.out.println(fdarr[dindex]);
            savedata(dindex,uname,pname,fdarr[dindex],"-");
            }
            else if(partner.equals("Lover")||partner.equals("L") ||partner.equals("LOVER") || partner.equals("lover")){
            String ldarr[];
            ldarr = new String[12];
            Random r = new Random();
            int dindex = r.nextInt(ldarr.length);
            for(int i = 0; i < ldarr.length; i++){
                ldarr[0]=("Write and perform a short love poem or song about our relationship.");
                ldarr[1]=("Share our first kiss story with all the sweet and funny details.");
                ldarr[2]=("Recreate our first date, including outfits and activities, and spend an evening together reliving those memories.");
                ldarr[3]=("Plan a future date night with specific details and surprises for each other.");
                ldarr[4]=("Give each other a foot massage or a shoulder massage for at least five minutes.");
                ldarr[5]=("Slow dance to a romantic song in the living room or any other place you like.");
                ldarr[6]=("Take a cute couple selfie and set it as your phone wallpaper for a day.");
                ldarr[7]=("Write a list of five things you love about each other and exchange the lists.");
                ldarr[8]=("Write a short love letter to each other and read it out loud with all your feelings.");
                ldarr[9]=("Pick a romantic movie to watch together, but every time there is a kiss, you have to kiss too!");
                ldarr[10]=("Set a timer for one minute and stare into each others eyes without laughing or looking away.");
                ldarr[11]=("Sing a love song to each other, karaoke-style (even if you are not great singers).");
            }System.out.println(ldarr[dindex]);
            savedata(dindex,uname,pname,ldarr[dindex],"-");
            }
            else if(partner.equals("Computer")||partner.equals("C") ||partner.equals("COMPUTER") || partner.equals("computer")){
            String cdarr[];
            cdarr = new String[11];
            Random r = new Random();
            int dindex = r.nextInt(cdarr.length);
            for(int i = 0; i < cdarr.length; i++){
                cdarr[0]=("Stand in front of a mirror and give yourself a one-minute motivational speech or pep talk.");
                cdarr[1]=("Try a new hobby or activity that you have been curious about but have not tried yet.");
                cdarr[2]=("Wear a quirky or mismatched outfit for a day, just for the fun of it.");
                cdarr[3]=("Go to a public place and strike up a friendly conversation with a stranger.");
                cdarr[4]=(" Write a short story or poem about something that inspires you or an experience from your life.");
                cdarr[5]=("Take yourself out on a solo date to a movie, restaurant, or any place you enjoy.");
                cdarr[6]=("Perform a random act of kindness for someone else without expecting anything in return.");
                cdarr[7]=("Take a day to disconnect from all digital devices and spend time outdoors or engaging in other activities.");
                cdarr[8]=("Try a mindfulness or meditation exercise to relax and clear your mind.");
                cdarr[9]=("Write a letter to your future self, expressing your hopes and aspirations.");
                cdarr[10]=("Step out of your comfort zone and sign up for a class or workshop in a subject you are interested in.");
            }System.out.println(cdarr[dindex]);
            savedata(dindex,uname,pname,cdarr[dindex],"-");
            }
            else{
                System.out.println("Error: Please type correctly!!!");
             }
       }
        else 
        {
            System.out.println("Error: Please type correctly!!!");
        }        
    System.out.print("Do you want to continue this game (y/n): ");
    String decision = sc.nextLine();
        if(decision.equalsIgnoreCase("n")||decision.equalsIgnoreCase("N")){
            break;
        }
    }
    }static void savedata(int i, String n, String p,String q,String a)throws SQLException{ 
        String sql = "insert into qa values('"+n+"','"+p+"','"+q+"','"+a+"')";
        statement.execute(sql);
    } 
}

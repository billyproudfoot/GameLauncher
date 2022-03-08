package Classes;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;

public class Methods {

    static String settingsDir = System.getProperty("user.dir") + "\\userSettings.txt";
    static Connection con;
    static String DatabaseLocation = System.getProperty("user.dir") + "\\NEA ShooterGame.accdb";
    
    public Methods() {
    }

    public static ArrayList readFile(ArrayList<String> textItems, String username) {
        textItems.clear();
        String inputLine;
        int found = 0;
        try {
            BufferedReader read = new BufferedReader(new FileReader(settingsDir));
            while ((inputLine = read.readLine()) != null) {
                if (inputLine.startsWith(username) || found > 14) {
                    textItems.add(inputLine);
                    found++;
                }
            }
            read.close();
            return textItems;
        } catch (IOException e) {
            return null;
        }
    }

        public static ArrayList readFile(String dir, ArrayList<String> textItems) {
        textItems.clear();
        String inputLine;
        int found = 0;
        try {
            BufferedReader read = new BufferedReader(new FileReader(dir));
            while ((inputLine = read.readLine()) != null) {
                    textItems.add(inputLine);
            }
            read.close();
            return textItems;
        } catch (IOException e) {
            return null;
        }
    }
    
    public static ArrayList readFile(ArrayList<String> textItems) {
        textItems.clear();
        String inputLine;
        try {
            BufferedReader read = new BufferedReader(new FileReader(settingsDir));
            while ((inputLine = read.readLine()) != null) {
                textItems.add(inputLine);
            }
            read.close();
            return textItems;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    public static void writeFile(ArrayList textItems, String dir) {
        try {
            FileOutputStream fout = new FileOutputStream(dir);
            String myString = "";
            for (int i = 0; i < textItems.size(); i++) {
                myString = myString + textItems.get(i) + "\n";
            }
            byte b[] = myString.getBytes();
            fout.write(b);
            fout.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void writeFile(String dir, ArrayList textItems) {
        try {
            FileOutputStream fout = new FileOutputStream(dir);
            String myString = "";
            for (int i = 0; i < textItems.size(); i++) {
                myString = myString + textItems.get(i) + "\n";
            }
            byte b[] = myString.getBytes();
            fout.write(b);
            fout.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
    
    
    public static void updateLine(ArrayList<String> itemsToChange, ArrayList<String> newFile, String username) {
        try {
            int index;
            boolean found = false;
            for (int i = 0; i < newFile.size(); i++) {
                if (newFile.get(i).contains(username)) {
                    index = i;
                    newFile.set(index, itemsToChange.get(0));
                    writeFile(newFile, settingsDir);
                    found = true;
                } 
            }
            if(found==false){
            newFile.add(itemsToChange.get(0));
            writeFile(newFile, settingsDir);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public String hashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < digest.length; i++) {
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        password = hexString.toString();
        return password;
    }

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
        }
        return null;
    }

    public static String leaderboardQuery(int Level, String data, int position) {
        try {
            String sql = "SELECT " + data + " FROM LevelsLeaderboard where Position = '" + position + "' AND Level = '" + Level + "';";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                String result = rs.getString(data);
                rs.close();
                con.close();
                if (data.equals("Time_Taken")) {
                    result = result.substring(11, 19);
                }
                return result;
            }
            rs.close();
            con.close();
            return null;

        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
            return null;
        }
    }

    public static String leaderboardQuery(int Level, String data, String username) {
        try {
            String sql = "SELECT " + data + " FROM LevelsLeaderboard where Username = '" + username + "' AND Level = '" + Level + "';";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                String result = rs.getString(data);
                rs.close();
                con.close();
                if (data.equals("Time_Taken")) {
                    result = result.substring(11, 19);
                }
                return result;
            }
            rs.close();
            con.close();
            return "N/A";
        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
            return "N/A";
        }
    }

    public static String leaderboardQuery(String weapon, String data, String username) {
        try {
            String sql = "SELECT * FROM EndlessLeaderboard where Weapon = '" + weapon + "' AND Username = '" + username + "';";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                String result = rs.getString(data);
                rs.close();
                con.close();
                if (data.equals("Time_Alive")) {
                    result = result.substring(11, 19);
                }
                return result;
            }
            rs.close();
            con.close();
            return "N/A";
        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
            return "N/A";
        }
    }

    public static String leaderboardQuery(String weapon, String data, int position) {
        try {
            String sql = "SELECT " + data + " FROM EndlessLeaderboard where Weapon = '" + weapon + "' AND Position = '" + position + "';";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                String result = rs.getString(data);
                rs.close();
                con.close();
                if (data.equals("Time_Alive")) {
                    result = result.substring(11, 19);
                }
                return result;
            }
            rs.close();
            con.close();
            return "N/A";
        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
            return "N/A";
        }
    }

    public static boolean checkLogIn(String username, String password) {
        try {
            String sql = "SELECT * FROM Users where Username = '" + username + "' AND Password = '" + password + "';";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.close();
                con.close();
                return true;
            }
            rs.close();
            con.close();
            return false;
        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
            return false;
        }
    }

    public static boolean checkUsername(String username) {
        try {
            String sql = "SELECT * FROM Users where Username = '" + username + "';";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.close();
                con.close();
                return true;
            }
            rs.close();
            con.close();
            return false;
        } catch (Exception e) {
            System.out.println("Error in the methods class: " + e);
            return false;
        }
    }

    public static void insertNewUser(String username, String password) {

        try {
            String sql = "SELECT * FROM Users";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                rs.updateString("Username", username);
                rs.updateString("Password", password);
                rs.updateDate("Date_Created", Date.valueOf(LocalDate.now()));
                rs.updateString("Level_Reached", "1");
                rs.insertRow();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }
    
    public static void insertNewLeaderboard(String username, String time, int level) {

        try {
            String sql = "SELECT * FROM LevelsLeaderboard";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                rs.updateString("Username", username);
                rs.updateString("Time_Taken", time);
                rs.updateInt("Level", level);
                rs.insertRow();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }
    
        public static void insertNewLeaderboard(String username, String time, int kills, int score, String weapon) {

        try {
            String sql = "SELECT * FROM EndlessLeaderboard";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                rs.updateString("Username", username);
                rs.updateInt("Score", score);
                rs.updateInt("Kills", kills);
                rs.updateString("Weapon", weapon);
                rs.updateString("Time_Alive", time);
                rs.insertRow();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }

}

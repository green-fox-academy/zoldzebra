// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logs {

  public static void main(String[] args) {
    System.out.println("Getting unique IPs: ");
    System.out.println(getUniqueIPs());
    System.out.println("GET / POST ratio = " + getRequestRatio());
  }

  public static Set<String> getUniqueIPs () {
    Path fileName = Paths.get("logs.txt");
    Set<String> uniqueIPs = new HashSet<String>();            // declare hashset which will handle uniques
    try{
      List<String> contents = Files.readAllLines(fileName);   // load data to contents (list of strings)
      List<String> allIPs = new ArrayList<>();                // create empty list for IPs
      for (int i = 0; i < contents.size(); i++) {
        allIPs.add(i, contents.get(i).split(" ")[8]);   // split IP-s from logs and add to IPs list
      }
      for (int i = 0; i < allIPs.size(); i++) {               // put all IPs to set - it handles duplicates
        uniqueIPs.add(allIPs.get(i));
      }
    } catch (IOException e) {
      e.printStackTrace();
    } return uniqueIPs;
  }

  public static double getRequestRatio () {
    Path fileName = Paths.get("logs.txt");
    double getPostRatio = 0.0;
    try {
      List<String> contents = Files.readAllLines(fileName);   // load data to contents (list of strings)
      List<String> requests = new ArrayList<>();               // create empty list for requests
      double posts = 0.0;
      for (int i = 0; i < contents.size(); i++) {
        requests.add(i, contents.get(i).split(" ")[11]);   // split request infos from logs and add to requests list
        if (requests.get(i).equals("POST")) {
          posts++;
        }
      }
      getPostRatio = (contents.size()-posts) / posts;
    } catch (IOException e) {
      e.printStackTrace();
    }
  return getPostRatio;
  }
}

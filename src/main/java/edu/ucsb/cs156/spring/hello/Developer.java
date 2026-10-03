package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // You may use just the name that is used on <https://bit.ly/cs156-f26-teams>

        return "Jonathan G.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {

        return "jguerreropalma";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        
        Team team = new Team("f26-01");
        team.addMember("Andrew");
        team.addMember("Christian");
        team.addMember("Jonathan G.");
        team.addMember("Owen");
        team.addMember("Yifan");
        team.addMember("Nathan");
        return team;
    }
}

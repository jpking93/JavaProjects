
package jpkingfinalproject;

/**
 *
 * @author jpking
 */
public class Country {
    
    // create data fields to store the data read in from the .csv file
    private String countryName;
    private String countryCode;
    private int year;
    private double humanRightsScore;
    private String region;
   
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of countryName
    Output: value of countryName
    */
    public String getCountryName() {
        
        return countryName;
        
    }
    
    
    /*IPO Chart
    Input: String countryName
    Process: use this keyword to set the value of countryName
    Output: none
    */
    public void setCountryName(String countryName) {
        
        this.countryName = countryName;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of countryCode
    Output: value of countryCode
    */
    public String getCountryCode() {
        
        return countryCode;
        
    }
    
    /*IPO Chart
    Input: String countryCode
    Process: use this keyword to set the value of countryCode
    Output: none
    */
    public void setCountryCode(String countryCode) {
        
        this.countryCode = countryCode;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of year
    Output: value of year
    */
    public int getYear() {
        
        return year;
        
    }
    
    /*IPO Chart
    Input: String year
    Process: use this keyword to set the value of year
    Output: none
    */
    public void setYear(int year) {
        
        this.year = year;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of humanRightsScore
    Output: value of humanRightsScore
    */
    public double getHumanRightScore() {
        
        return humanRightsScore;
        
    }
    
    /*IPO Chart
    Input: double humanRightsScore
    Process: use this keyword to set the value of humanRightsScore
    Output: none
    */
    public void setHumanRightsScore(double humanRightsScore) {
        
        this.humanRightsScore = humanRightsScore;
    
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of region
    Output: value of region
    */
    public String getRegion() {
        
        return region;
        
    }
    
    /*IPO Chart
    Input: String region
    Process: use this keyword to set the value of region
    Output: none
    */
    public void setRegion(String region) {
        
        this.region = region;
        
    }
    
    
    /* IPO Chart
    Input: Country[] arr
    Processing: initalize double max and Country maxCountry, use for loop to iterate through array feeding each value into
                the max method and comparing it to the value of the current max, if the max is the value of the new country
                fed in set the value of maxCountry to that country.
    Output: Once all of the elements in the array are cycled through print a message telling the country with the best
            human right score and what the score is using maxCountry and max.
    */
    public String best(Country[] arr) {
        
        double max = arr[0].getHumanRightScore();
        Country maxCountry = arr[0];
        
        
        for (int i = 0; i < arr.length; i++) {
            
                max = Math.max(max, arr[i].getHumanRightScore());

                if (max == arr[i].getHumanRightScore()) {
                    maxCountry = arr[i];
                }
        
        }
        
        return "The contry with the best human rights score in 2021 was " + maxCountry.getCountryName() +
                    " with a score of " + max;
                        
    }
    
    
    /* IPO Chart
    Input: Country[] arr
    Processing: initalize double min and Country minCountry, use for loop to iterate through array feeding each value into
                the min method and comparing it to the value of the current min, if the min is the value of the new country
                fed in set the value of minCountry to that country.
    Output: Once all of the elements in the array are cycled through print a message telling the country with the best
            human rights score and what the score is using minCountry and min.
    */
    public String worst(Country[] arr) {
        
        double min = arr[0].getHumanRightScore();
        Country minCountry = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            
            
                min = Math.min(min, arr[i].getHumanRightScore());

                if (min == arr[i].getHumanRightScore()) {
                    minCountry = arr[i];
                }
            
        }
        
        return "The Country with the worst human right score in 2021 was " + minCountry.getCountryName() +
                            " with a score of " + min;
        
    }
   
}

package dataaccess;

import java.util.ArrayList;
import models.Poster;

public class posterdao {
    
    public ArrayList<Poster> posters = new ArrayList<> ();
    private static posterdao dao = new posterdao();
    /* Creates and populates an arraylist based on the attributes of the Poster Class so that the posters can be called upon dynamically in multiple jsp's*/
    /*    private posterdao(){
        posters.add(new Poster(1, "Thor: Love and Thunder","Poster of the latest Thor movie, the 2022 sequel to 'Thor Ragnarok'!", "Movie", "A4", "Glossy Paper", "Less than a year", "€12.34", "images/thorposter.jpg"));
        posters.add(new Poster(2, "Don't Worry Darling","Poster of the new movie starring Harry Styles and Florence Pugh, set in a mysterious 1950's-esque town.", "Movie", "A3", "Glossy Paper", "Less than a year", "€7.24", "images/dwdposter.jpg"));
        posters.add(new Poster(3, "Mrs Harris Goes to Paris","Poster of the recently released 'Mrs Harris Goes to Paris', starring Lesley Manville set in 1950's Paris.", "Movie", "A4", "Matte Paper", "Less than a year", "€8.66", "images/mhgtpposter.jpg"));
        posters.add(new Poster(4, "Amsterdam","Poster of the new movie, 'Amsterdam', starring Christian Bale, John David Washington and Margot Robbie, investigating a most mysterious death!", "Movie", "A4", "Glossy Paper", "Less than a year", "€6.65", "images/amsterdamposter.webp"));
        posters.add(new Poster(5, "See How They Run","Poster of the 2022 movie starring Sam Rockwell and Saoirse Ronan, a love letter to vintage murder mysteries!", "Movie", "A2", " Matte Paper", "Less than a year", "€7.48", "images/seehowtheyrunposter.jpg"));
        posters.add(new Poster(6, "Lyle, Lyle, Crocodile","Poster of the 2022 children's animated movie, 'Lyle, Lyle, Crocodile' following the adventures of the singing crocodile, Lyle!", "Movie", "A4", "Glossy Paper", "Less than a year", "€100.99", "images/llcposter.jpg"));
        posters.add(new Poster(7, "Black Adam","Poster of the 2022 DC blockbuster, 'Black Adam', wherein the hierarchy of power within the DC universe changed forever.", "Movie", "A3", "Glossy Paper", "2022", "€8.31", "images/bladamposter.jpg"));
        posters.add(new Poster(8, "Unstoppable","Poster of the movie, 'Unstoppable'. Two men, one unstoppable train. Can they stop it before it reaches the Stanton Curve and blows up, killing everyone?!", "Movie", "A2", "Glossy Paper", "2010", "€25.07", "images/unstoppableposter.jpg")); 
        posters.add(new Poster(9, "Criminal UK","Poster of the Netflix released series, 'Criminal UK', an intense show depicting the interrogations of various suspects, both innocent and guilty!", "TV", "A2", "Glossy Paper", "2019", "€8.26", "images/crimukposter.jpg"));
        posters.add(new Poster(10, "Breaking Bad","Poster of the worldwide phenomenon, 'Breaking Bad', following terminally-ill chemistry teacher, Walter White, and his former student, Jesse Pinkman, as they enter the drug world to earn money beyond their wildest dreams.", "TV", "A3", "Matte Paper", "2008", "€7.37", "images/brbaposter.jpg"));
        posters.add(new Poster(11, "Good Omens","Poster of the Amazon Prime released series, 'Good Omens', following the adventures of angel, Aziraphale, and devil, Crowley, as they team up to prevent the antichrist rising to power.", "TV", "A3", "Glossy Paper", "2019", "€9.57", "images/goposter.jpg"));
        posters.add(new Poster(12, "Only Murders in the Building","Poster of the Hulu released series, 'Only Murders in the Building', starring Selena Gomez, Steve Martin and Martin Short as three avid lovers of true crime podcasts as they develop a podcast of their own, based on an alleged murder in their building!", "TV", "A4", "Glossy Paper", "2021", "€9.99", "images/omitbposter.webp"));
        posters.add(new Poster(13, "The Walking Dead","Poster of the massive hit AMC series, 'The Walking Dead', a gritty, gruesome show following the adventures of sheriff Rick Grimes and his family as they fight to survive in the zombie apocalypse.", "TV", "A3", "Glossy Paper", "2010", "€9.45", "images/twdposter.jpg"));
        posters.add(new Poster(14, "Doctor Who","Poster of the BBC legacy series, 'Doctor Who', following the ditzy, jovial time lord known only as 'The Doctor' as they travel through time alongside their human companians.", "TV", "A3", "Matte Paper", "2016", "€11.13", "images/drwhoposter.jpg"));
        posters.add(new Poster(15, "Over the Garden Wall","Poster of the Cartoon Network animated series 'Over the Garden Wall', following the strange adventures of brothers Wirt and Greg as they navigate a mysterious forest.", "TV", "A4", "Glossy Paper", "2014", "€10.39", "images/otgwposter.jpg"));
        posters.add(new Poster(16, "Brooklyn Nine-Nine","Poster of the hit comedy series, 'Brooklyn Nine-Nine', following a wacky team of detectives solving crimes in Brooklyn.", "TV", "A3", "Matte Paper", "2013", "€8.54", "images/bnnposter.jpg"));
        posters.add(new Poster(17, "Cork City","Poster based upon the landmark Irish city of Cork [The true capital ;)].", "Location", "A1", "Glossy Paper", "2015", "€6.47", "images/cocorkposter.webp"));
        posters.add(new Poster(18, "Paris, France","Poster based upon the French capital city of Paris.", "Location", "A2", "Glossy Paper", "2019", "€9.43", "images/parisposter.jpg"));
        posters.add(new Poster(19, "Amsterdam, Netherlands","Poster based upon the infamous Dutch city of Amsterdam.", "Location", "A4", "Glossy Paper", "2022", "€7.58", "images/dutchposter.jpg"));
        posters.add(new Poster(20, "Somalia","Poster based upon the African country of Somalia.", "Location", "A3", "Matte Paper", "2017", "€8.51", "images/somaliaposter.jpg"));
        posters.add(new Poster(21, "South Africa","Poster based upon the beautiful country of South Africa.", "Location", "A1", "Matte Paper", "2018","€11.23", "images/southafricaposter.jpg"));
        posters.add(new Poster(22, "Venice, Italy","Poster based upon the beautiful water city of Venice, Italy.", "Location", "A4", "Glossy Paper", "2017", "€6.66", "images/veniceposter.jpg"));
        posters.add(new Poster(23, "London, England","Poster based upon the famous London, capital city of England.", "Location", "A1", "Matte Paper", "2019", "€10.23", "images/londonposter.jpg"));
        posters.add(new Poster(24, "Munich, Germany","Poster based upon the gorgeous city of Munich, Germany.", "Location", "A2", "Glossy Paper", "2015", "€8.34", "images/germanyposter.jpg"));       
        }
     
    public static posterdao getInstance(){ 
        return dao;
    }
    
    public Poster getPosterById(int id){
       for(Poster pt: posters){
           if(pt.getPosterID() == id) {
               return pt;
           }
       } 
       return null;
    }
    
        
    public Poster getPosterByName(String posterName){
       for(Poster posters : posters){
           if(posters.getPosterName().equals(posterName)) {
               return posters;
           }
       } 
       return null;
    }
        
    public ArrayList<Poster> getPoster(){
        return posters;
    }

    
  */ 
}

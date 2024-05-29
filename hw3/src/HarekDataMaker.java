
public class HarekDataMaker {

    public String aggregateSingle(String name, String age, String planet){
        return String.format("name - %s, age - %s, planet - %s", name, age, planet);
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        String[] aggregatedData = new String[3];
        for (int i = 0; i < 3; i++) {
            aggregatedData[i] = aggregateSingle(names[i], Integer.toString(ages[i]), planets[i]);
        }
        return aggregatedData;


    }
}

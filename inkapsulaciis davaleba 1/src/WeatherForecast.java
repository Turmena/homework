public class WeatherForecast {
    private String cityName;
    private double windSpeed;
    private int rainPercentage;
    private boolean willRain;
    private boolean cloudy;
    private boolean sunny;

    public WeatherForecast(String cityName, double windSpeed, int rainPercentage, boolean willRain, boolean cloudy, boolean sunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.willRain = willRain;
        this.cloudy = cloudy;
        this.sunny = sunny;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(int rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public boolean isWillRain() {
        return willRain;
    }

    public void setWillRain(boolean willRain) {
        this.willRain = willRain;
    }

    public boolean isCloudy() {
        return cloudy;
    }

    public void setCloudy(boolean cloudy) {
        this.cloudy = cloudy;
    }

    public boolean isSunny() {
        return sunny;
    }

    public void setSunny(boolean sunny) {
        this.sunny = sunny;
    }

    public void displayForecast() {
        System.out.println("City: " + cityName);
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Rain Percentage: " + rainPercentage + "%");
        System.out.println("Will Rain: " + (willRain ? "Yes" : "No"));
        System.out.println("Cloudy: " + (cloudy ? "Yes" : "No"));
        System.out.println("Sunny: " + (sunny ? "Yes" : "No"));
    }

    public boolean suggestForOuting() {
        return sunny && !willRain && windSpeed < 20;
    }
}

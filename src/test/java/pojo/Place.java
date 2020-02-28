package pojo;

        import com.fasterxml.jackson.annotation.JsonProperty;

public class Place {
    private String placeName;
    private String longitude;
    private String latitude;
    private String state;
    private String stateAbbreviation;

    @JsonProperty("place name")
    public String getPlaceName() {
        return placeName;
    }

    @JsonProperty("place name")
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state abbreviation")
    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    @JsonProperty("state abbreviation")
    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeName='" + placeName + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", state='" + state + '\'' +
                ", stateAbbreviation='" + stateAbbreviation + '\'' +
                '}';
    }
}
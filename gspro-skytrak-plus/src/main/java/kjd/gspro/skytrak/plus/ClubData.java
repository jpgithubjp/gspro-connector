package kjd.gspro.skytrak.plus;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClubData {
    @JsonProperty("ClubHeadSpeed")
    private float speed;
}

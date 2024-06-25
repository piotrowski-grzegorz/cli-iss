package api;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.sql.Timestamp;
import java.util.Date;

public class LocationResponse {
    String message;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @JsonSerialize(using = TimestampSerializer.class)
//    @JsonDeserialize(using = TimestampDeserializer.class)
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    IssPosition iss_position;
    public LocationResponse(){};

    public LocationResponse(String message, Timestamp timestamp, IssPosition iss_position) {
        this.message = message;
        this.timestamp = timestamp;
        this.iss_position = iss_position;
    }

    public String getMessage() {
        return message;
    }



    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timestamp = timeStamp;
    }

    public IssPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPosition iss_position) {
        this.iss_position = iss_position;
    }

    Date date = timestamp;

    @Override
    public String toString() {
        return "LocationResponse{" +
                "message='" + message + '\'' +
                ", timestamp=" + date +
                ", iss_position=" + iss_position +
                '}';
    }
}

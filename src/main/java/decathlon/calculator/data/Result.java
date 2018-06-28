package decathlon.calculator.data;

import decathlon.calculator.events.FieldEvent;
import decathlon.calculator.events.TrackEvent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    public int res;

    public Result(int res){
        this.res = res;
    }

}
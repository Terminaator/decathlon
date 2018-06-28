package decathlon.calculator;

import decathlon.calculator.data.Result;
import decathlon.calculator.data.ResultDTO;
import decathlon.calculator.events.FieldEvent;
import decathlon.calculator.events.TrackEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Calculator {
    private FieldEvent fieldEvent = new FieldEvent();
    private TrackEvent trackEvent = new TrackEvent();

    @PostMapping("/calculate")
    public ResponseEntity calculate(@RequestBody ResultDTO resultDTO) {
        try {
            return new ResponseEntity(functions(resultDTO), HttpStatus.OK);
        }catch (NumberFormatException exp){
            return new ResponseEntity(exp, HttpStatus.BAD_REQUEST);
        }
    }
    private Result functions(ResultDTO resultDTO){
        String function = resultDTO.getFunction();
        if (0>Float.parseFloat(resultDTO.getInput())) throw new NumberFormatException("Negative number!");
        Result result = null;
        if (function.equals("r100m")) result = new Result(trackEvent.run100Points(resultDTO.getInput()));
        else if (function.equals("r110m")) result = new Result(trackEvent.run110Points(resultDTO.getInput()));
        else if (function.equals("r400m")) result = new Result(trackEvent.run400Points(resultDTO.getInput()));
        else if (function.equals("r1500m")) result = new Result(trackEvent.run1500Points(resultDTO.getInput()));
        else if (function.equals("javelin")) result = new Result(fieldEvent.javalinPoints(resultDTO.getInput()));
        else if (function.equals("pole")) result = new Result(fieldEvent.polePoints(resultDTO.getInput()));
        else if (function.equals("discus")) result = new Result(fieldEvent.discusPoints(resultDTO.getInput()));
        else if (function.equals("high")) result = new Result(fieldEvent.highPoints(resultDTO.getInput()));
        else if (function.equals("shot")) result = new Result(fieldEvent.shotPoints(resultDTO.getInput()));
        else if (function.equals("long")) result = new Result(fieldEvent.longPoints(resultDTO.getInput()));
        return result;
    }
}

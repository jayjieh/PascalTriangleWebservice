package com.pascaltri.PascalTriangle.resource;

import com.pascaltri.PascalTriangle.wrapper.ResponseWrap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PascalController {

    @RequestMapping("/pascal")
    public ResponseEntity<ResponseWrap<List<Integer>>> returnRow(@RequestParam(value = "num") Integer num) {
        ResponseWrap<List<Integer>> wrap = new ResponseWrap<>();
        if(num==null){
            wrap.setCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<>(wrap, HttpStatus.BAD_REQUEST);
        }
        wrap.setCode(200);
        wrap.setData(getPascalRow(num));
        return new ResponseEntity<>(wrap, HttpStatus.OK);
    }

    private List<Integer> getPascalRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>();
        if (rowIndex < 0) {
            return result;
        }
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }
}

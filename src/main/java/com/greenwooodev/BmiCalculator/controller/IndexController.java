package com.greenwooodev.BmiCalculator.controller;

import com.greenwooodev.BmiCalculator.models.BMIcalc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.Contended;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(@RequestParam(required = false) Integer weight,
                        @RequestParam(required = false) Integer height,
                        @RequestParam(required = false) String unitweight,
                        @RequestParam(required = false) String unitheight,
                        @RequestParam(required = false) String gender,
                        ModelMap modelMap) {

        if(weight!=null&&height!=null) {

            BMIcalc bmIcalc = new BMIcalc();

            modelMap.put("bmi", "Your BMI is: "+bmIcalc.getBmiKgCm(weight, height, unitweight, unitheight));
            modelMap.put("weight", weight);
            modelMap.put("height", height);
            modelMap.put("unitweight", unitweight);
            modelMap.put("unitheight", unitheight);
            modelMap.put("gender", gender );
            modelMap.put("genderimg", gender+".png");
        }



        return "index";
    }


}


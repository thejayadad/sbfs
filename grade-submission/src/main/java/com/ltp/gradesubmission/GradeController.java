import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public String sayGrades(){
        return "hitherehtmlgrades";
    }


}

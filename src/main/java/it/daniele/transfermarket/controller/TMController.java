package it.daniele.transfermarket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

@RestController
@RequestMapping("transfer")
public class TMController {
    List<String> squadre=new ArrayList<>();
    Random random = new Random();
    Map<String, List<Map>> db=new HashMap<>();
    @PostConstruct
    public void postC(){
        squadre.add("s1");
        squadre.add("s2");
        squadre.add("s3");
        squadre.add("s4");
    }
    @GetMapping("/{nome}")
    public ResponseEntity<List<Map>> trasferimenti(@PathVariable String nome){
        List<Map> ret = db.get(nome);
        if (ret==null) {
            ret = new ArrayList<>();
            Map<String, Object> map;
            Calendar calendar = Calendar.getInstance();
            int annoCorrente = calendar.get(Calendar.YEAR);
            int annoPartenza = 1995;
            int anno = random.nextInt(annoCorrente - annoPartenza) + annoPartenza;
            String oldSquadra = null;
            String sq = null;
            while (anno < annoCorrente) {
                map = new HashMap<>();
                map.put("anno", anno);
                do {
                    oldSquadra = sq;
                    sq = squadre.get(random.nextInt(squadre.size()));
                } while (sq.equals(oldSquadra));
                map.put("squadra", sq);
                anno = random.nextInt(annoCorrente - anno) + anno + 1;
                ret.add(map);
            }
            db.put(nome,ret);
        }
        return ResponseEntity.ok(ret);
    }
}

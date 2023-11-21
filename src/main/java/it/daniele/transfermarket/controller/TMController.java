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
        squadre.add("50 SFUMATURE DI GIGIO");
        squadre.add("ABATE BORISOV");
        squadre.add("AC DENTI");
        squadre.add("A MUSSO DURO");
        squadre.add("AHIAX");
        squadre.add("ARMERO TU NELL’UNIVERSO");
        squadre.add("AS INTOMATICI");
        squadre.add("ASTON BIRRA");
        squadre.add("ATLETICO MA NON TROPPO");
        squadre.add("AVELLINO BANFI");
        squadre.add("BALLACK COI LUPI");
        squadre.add("BANDA BEARZOT");
        squadre.add("BEVERLY IMPS");
        squadre.add("BIRRAREAL");
        squadre.add("BODO GLIK");
        squadre.add("CAMBIA LA TUA VITA CON UN GLIK");
        squadre.add("CAMERUN DIAZ");
        squadre.add("CASA E CHIESA");
        squadre.add("CELTA VINO");
        squadre.add("CHIVAS CON GHIACCIO");
        squadre.add("COCA KOLAROV");
        squadre.add("CORREA DEL SUD");
        squadre.add("CSKA LA RISSA");
        squadre.add("CUGINI DI ZAMPAGNA");
        squadre.add("DAMMI SOLO UN CAPUTO");
        squadre.add("DAS PORTO");
        squadre.add("DEMOCRAZIA CRISTANTE");
        squadre.add("DEPORTIVO APERITIVO");
        squadre.add("DESPACITY");
        squadre.add("DINAMO LOSCA");
        squadre.add("DIVANO KIEV");
        squadre.add("DJIMSITI LIFE");
        squadre.add("DRAGON BALLOTTA");
        squadre.add("DYBALA COI LUPI");
        squadre.add("EYSSERIC O NON EYSSERIC");
        squadre.add("FINO AL PALACIO");
        squadre.add("FIUMI DI PAROLO");
        squadre.add("FREY’S ANATOMY");
        squadre.add("HANNO UCCISO L’UOMO CRAGNO");
        squadre.add("HERTA MPONE");
        squadre.add("HERTHA VERNELLO");
        squadre.add("HOW I MET YOUR MATA");
        squadre.add("IL CACCIATORE DI AQUILANI");
        squadre.add("IL MIO GROSSO GRASSO MATRIMONIO DZEKO");
        squadre.add("IL SESTO ASENSIO");
        squadre.add("KIM JONG-UNITED");
        squadre.add("KOULIBALY FUNICULA’");
        squadre.add("KUNG FU PANDEV");
        squadre.add("L'APOEL KANN");
        squadre.add("LA DURA LEGGE DE ROON");
        squadre.add("LACAZETTE IN CANADA");
        squadre.add("LAUTARO SII O MIO SIGNORE");
        squadre.add("MAINZ NA GIOIA");
        squadre.add("MANCHESTER SIMY");
        squadre.add("MASIELLOW SUBMARINE");
        squadre.add("MASTERCHEF UNITED");
        squadre.add("MEGLIO ICARDI CHE MAI");
        squadre.add("MILAN E SHIRO");
        squadre.add("NON CI RESTA CHE PJANIC");
        squadre.add("NOTTE PRIMA DEGLI ASLLANI");
        squadre.add("OSASUGNA");
        squadre.add("PARACEZANIOLO");
        squadre.add("PARMACETAMOLO");
        squadre.add("PARIS SAN GENNARO");
        squadre.add("PATETICO MINEIRO");
        squadre.add("PENNIC HELLAS");
        squadre.add("PERDER BREMA");
        squadre.add("PESCARA MANZIA");
        squadre.add("PIATEK ‘NA PASTIGLIA");
        squadre.add("PIU’ NO KESSIE’");
        squadre.add("POGGIOREAL");
        squadre.add("POGGISBRONZI");
        squadre.add("QUATTRO AMICI AL VAR");
        squadre.add("RADICAL SCHICK");
        squadre.add("RAPID MICATANT");
        squadre.add("REAL MADRINK");
        squadre.add("RONALDO GIOVANNI E GIACOMO");
        squadre.add("ROONEY TUNES");
        squadre.add("RUBIN KEBAB");
        squadre.add("SALAH PERCHE’ TI AMO");
        squadre.add("SAMBUCA JUNIORS");
        squadre.add("SBRAGA");
        squadre.add("SBROCCA JUNIORS");
        squadre.add("SCARSENAL");
        squadre.add("SLEAL MADRID");
        squadre.add("SOMMER ON A SOLITARY BEACH");
        squadre.add("SPARTAK MOOSECA");
        squadre.add("SPERA EBBASTA");
        squadre.add("SPIACENZA");
        squadre.add("STORTENHAM");
        squadre.add("TANTO PE’ KANTE’");
        squadre.add("TEAM BARAZZO");
        squadre.add("TEMPTATION ALLAN");
        squadre.add("TODA JOYA TODA BELEZA");
        squadre.add("TRUMPZONSPOR");
        squadre.add("TU SZCZESNY DALLE STELLE");
        squadre.add("UNO SU MILIK CE LA FA");
        squadre.add("VATE BORISOV");
        squadre.add("VERETOUT MI PIACI TU");
        squadre.add("WALKER TEXAS RANGERS");
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

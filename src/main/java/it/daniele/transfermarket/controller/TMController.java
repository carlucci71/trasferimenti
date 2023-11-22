package it.daniele.transfermarket.controller;

import it.daniele.transfermarket.entity.Squadra;
import it.daniele.transfermarket.entity.Transfer;
import it.daniele.transfermarket.repository.SquadraRepository;
import it.daniele.transfermarket.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

@RestController
@RequestMapping("transfer")
public class TMController {
    List<Squadra> squadre=new ArrayList<>();
    Random random = new Random();
    @Autowired
    TransferRepository transferRepository;
    @Autowired
    SquadraRepository squadraRepository;
    @PostConstruct
    public void postC(){
        squadre=squadraRepository.findAll();
    }

    @PostMapping("/inizializza")
    public ResponseEntity<?> inizializza(){
        squadraRepository.deleteAll();
        squadraRepository.save(new Squadra("50 SFUMATURE DI GIGIO"));
        squadraRepository.save(new Squadra("ABATE BORISOV"));
        squadraRepository.save(new Squadra("AC DENTI"));
        squadraRepository.save(new Squadra("A MUSSO DURO"));
        squadraRepository.save(new Squadra("AHIAX"));
        squadraRepository.save(new Squadra("ARMERO TU NELL’UNIVERSO"));
        squadraRepository.save(new Squadra("AS INTOMATICI"));
        squadraRepository.save(new Squadra("ASTON BIRRA"));
        squadraRepository.save(new Squadra("ATLETICO MA NON TROPPO"));
        squadraRepository.save(new Squadra("AVELLINO BANFI"));
        squadraRepository.save(new Squadra("BALLACK COI LUPI"));
        squadraRepository.save(new Squadra("BANDA BEARZOT"));
        squadraRepository.save(new Squadra("BEVERLY IMPS"));
        squadraRepository.save(new Squadra("BIRRAREAL"));
        squadraRepository.save(new Squadra("BODO GLIK"));
        squadraRepository.save(new Squadra("CAMBIA LA TUA VITA CON UN GLIK"));
        squadraRepository.save(new Squadra("CAMERUN DIAZ"));
        squadraRepository.save(new Squadra("CASA E CHIESA"));
        squadraRepository.save(new Squadra("CELTA VINO"));
        squadraRepository.save(new Squadra("CHIVAS CON GHIACCIO"));
        squadraRepository.save(new Squadra("COCA KOLAROV"));
        squadraRepository.save(new Squadra("CORREA DEL SUD"));
        squadraRepository.save(new Squadra("CSKA LA RISSA"));
        squadraRepository.save(new Squadra("CUGINI DI ZAMPAGNA"));
        squadraRepository.save(new Squadra("DAMMI SOLO UN CAPUTO"));
        squadraRepository.save(new Squadra("DAS PORTO"));
        squadraRepository.save(new Squadra("DEMOCRAZIA CRISTANTE"));
        squadraRepository.save(new Squadra("DEPORTIVO APERITIVO"));
        squadraRepository.save(new Squadra("DESPACITY"));
        squadraRepository.save(new Squadra("DINAMO LOSCA"));
        squadraRepository.save(new Squadra("DIVANO KIEV"));
        squadraRepository.save(new Squadra("DJIMSITI LIFE"));
        squadraRepository.save(new Squadra("DRAGON BALLOTTA"));
        squadraRepository.save(new Squadra("DYBALA COI LUPI"));
        squadraRepository.save(new Squadra("EYSSERIC O NON EYSSERIC"));
        squadraRepository.save(new Squadra("FINO AL PALACIO"));
        squadraRepository.save(new Squadra("FIUMI DI PAROLO"));
        squadraRepository.save(new Squadra("FREY’S ANATOMY"));
        squadraRepository.save(new Squadra("HANNO UCCISO L’UOMO CRAGNO"));
        squadraRepository.save(new Squadra("HERTA MPONE"));
        squadraRepository.save(new Squadra("HERTHA VERNELLO"));
        squadraRepository.save(new Squadra("HOW I MET YOUR MATA"));
        squadraRepository.save(new Squadra("IL CACCIATORE DI AQUILANI"));
        squadraRepository.save(new Squadra("IL MIO GROSSO GRASSO MATRIMONIO DZEKO"));
        squadraRepository.save(new Squadra("IL SESTO ASENSIO"));
        squadraRepository.save(new Squadra("KIM JONG-UNITED"));
        squadraRepository.save(new Squadra("KOULIBALY FUNICULA’"));
        squadraRepository.save(new Squadra("KUNG FU PANDEV"));
        squadraRepository.save(new Squadra("L'APOEL KANN"));
        squadraRepository.save(new Squadra("LA DURA LEGGE DE ROON"));
        squadraRepository.save(new Squadra("LACAZETTE IN CANADA"));
        squadraRepository.save(new Squadra("LAUTARO SII O MIO SIGNORE"));
        squadraRepository.save(new Squadra("MAINZ NA GIOIA"));
        squadraRepository.save(new Squadra("MANCHESTER SIMY"));
        squadraRepository.save(new Squadra("MASIELLOW SUBMARINE"));
        squadraRepository.save(new Squadra("MASTERCHEF UNITED"));
        squadraRepository.save(new Squadra("MEGLIO ICARDI CHE MAI"));
        squadraRepository.save(new Squadra("MILAN E SHIRO"));
        squadraRepository.save(new Squadra("NON CI RESTA CHE PJANIC"));
        squadraRepository.save(new Squadra("NOTTE PRIMA DEGLI ASLLANI"));
        squadraRepository.save(new Squadra("OSASUGNA"));
        squadraRepository.save(new Squadra("PARACEZANIOLO"));
        squadraRepository.save(new Squadra("PARMACETAMOLO"));
        squadraRepository.save(new Squadra("PARIS SAN GENNARO"));
        squadraRepository.save(new Squadra("PATETICO MINEIRO"));
        squadraRepository.save(new Squadra("PENNIC HELLAS"));
        squadraRepository.save(new Squadra("PERDER BREMA"));
        squadraRepository.save(new Squadra("PESCARA MANZIA"));
        squadraRepository.save(new Squadra("PIATEK ‘NA PASTIGLIA"));
        squadraRepository.save(new Squadra("PIU’ NO KESSIE’"));
        squadraRepository.save(new Squadra("POGGIOREAL"));
        squadraRepository.save(new Squadra("POGGISBRONZI"));
        squadraRepository.save(new Squadra("QUATTRO AMICI AL VAR"));
        squadraRepository.save(new Squadra("RADICAL SCHICK"));
        squadraRepository.save(new Squadra("RAPID MICATANT"));
        squadraRepository.save(new Squadra("REAL MADRINK"));
        squadraRepository.save(new Squadra("RONALDO GIOVANNI E GIACOMO"));
        squadraRepository.save(new Squadra("ROONEY TUNES"));
        squadraRepository.save(new Squadra("RUBIN KEBAB"));
        squadraRepository.save(new Squadra("SALAH PERCHE’ TI AMO"));
        squadraRepository.save(new Squadra("SAMBUCA JUNIORS"));
        squadraRepository.save(new Squadra("SBRAGA"));
        squadraRepository.save(new Squadra("SBROCCA JUNIORS"));
        squadraRepository.save(new Squadra("SCARSENAL"));
        squadraRepository.save(new Squadra("SLEAL MADRID"));
        squadraRepository.save(new Squadra("SOMMER ON A SOLITARY BEACH"));
        squadraRepository.save(new Squadra("SPARTAK MOOSECA"));
        squadraRepository.save(new Squadra("SPERA EBBASTA"));
        squadraRepository.save(new Squadra("SPIACENZA"));
        squadraRepository.save(new Squadra("STORTENHAM"));
        squadraRepository.save(new Squadra("TANTO PE’ KANTE’"));
        squadraRepository.save(new Squadra("TEAM BARAZZO"));
        squadraRepository.save(new Squadra("TEMPTATION ALLAN"));
        squadraRepository.save(new Squadra("TODA JOYA TODA BELEZA"));
        squadraRepository.save(new Squadra("TRUMPZONSPOR"));
        squadraRepository.save(new Squadra("TU SZCZESNY DALLE STELLE"));
        squadraRepository.save(new Squadra("UNO SU MILIK CE LA FA"));
        squadraRepository.save(new Squadra("VATE BORISOV"));
        squadraRepository.save(new Squadra("VERETOUT MI PIACI TU"));
        squadraRepository.save(new Squadra("WALKER TEXAS RANGERS"));
        transferRepository.deleteAll();
        squadre=squadraRepository.findAll();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Map>> trasferimenti(@PathVariable String nome){
        String ret;
        Optional<Transfer> byId = transferRepository.findById(nome);
        if (byId.isPresent()) {
            ret=byId.get().getPassaggi();
        } else {
            ret = new String();
            String map;
            Calendar calendar = Calendar.getInstance();
            int annoCorrente = calendar.get(Calendar.YEAR);
            int annoPartenza = 1995;
            int anno = random.nextInt(annoCorrente - annoPartenza) + annoPartenza;
            String oldSquadra = null;
            String sq = null;
            while (anno < annoCorrente) {
                map = new String();
                //map.setAnno(anno);
                map=String.valueOf(anno);
                do {
                    oldSquadra = sq;
                    sq = squadre.get(random.nextInt(squadre.size())).getNome();
                } while (sq.equals(oldSquadra));
//                map.setSquadra(sq);
                map=map + "@" + sq;
                anno = random.nextInt(annoCorrente - anno) + anno + 1;
                ret=ret +  map + "#";
            }
            Transfer t = new Transfer(nome, ret);
            transferRepository.save(t);
        }
        List<Map> ok=new ArrayList<>();
        //#2013@STORTENHAM#2018@COCA KOLAROV
        String[] split = ret.split("#");
        for (String s : split) {
               String[] split2 = s.split("@");
               Map m = new HashMap();
            m.put("anno", split2[0]);
            m.put("squadra", split2[1]);
            ok.add(m);
        }
        return ResponseEntity.ok(ok);
    }
}

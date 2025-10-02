 // Programmazione ad oggetti
  
      /*class BankAccount {
        balance =0;
         firstDeposit =0;
         firstDraw =0;
         secondDeposit =0;
         secondDraw= 0;
         canoneAnnuo =0;

         constructor( balance, firstDeposit, firstDraw, secondDeposit, secondDraw, canoneAnnuo){
              this.balance = balance;
              this.firstDeposit = firstDeposit;
              this.firstDraw = firstDraw;
              this.secondDeposit = secondDeposit;
              this.secondDraw = secondDraw;
              this.canoneAnnuo = canoneAnnuo

         }
            
           getFirstDeposit(){
              
              return this.balance + this.firstDeposit;
           }
            
            getFirstDraw(){

             return this.getFirstDeposit()- this.firstDraw;
            }

             getSecondDeposit(){

             return this.getFirstDraw()+ this.secondDeposit;
             }

             getSecondDraw(){
              return this.getSecondDeposit() - this.secondDraw;
             }
             getCanoneAnnuo(){
              return (this.getSecondDraw() * this.canoneAnnuo)/100;

             }
             getTotalAccount(){
              return this.getSecondDraw()- this.getCanoneAnnuo()
             }
      }
         let banca = new BankAccount(1000, 100, 100, 80, 30 ,5)
         let account = banca.getTotalAccount();
         console.log(account);


    class Professionista {
    reditoAnnuoLordo = 0;
    coefRedd = 0;
    aliquotaInps = 0;
    aliquotaIrpef = 0;

    constructor(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef) {
    this.aliquotaInps = aliquotaInps;
    this.aliquotaIrpef = aliquotaIrpef;
    this.reditoAnnuoLordo = reditoAnnuoLordo;
    this.coefRedd = coefRedd;
    }

    getUtileTasse() {
    return (this.reditoAnnuoLordo * this.coefRedd) / 100;
    }

    getAliquotaInps() {
    return (this.getUtileTasse() * this.aliquotaInps) / 100;
    }

    getAliquotaIrpef() {
    return (this.getUtileTasse() * this.aliquotaIrpef) / 100;
   }

    getRedditoAnnuoNetto() {
    return (
      this.reditoAnnuoLordo - (this.getAliquotaInps() + this.getAliquotaIrpef())
    );
   }
 }

   let netto = new Professionista(86000, 78, 26, 15);
    console.log(netto.getRedditoAnnuoNetto()); */

   // Ereditarietà

    /*class SonAccount {
  balance = 0;
  firstDeposit = 0;
  firstDraw = 0;
  secondDeposit = 0;
  secondDraw = 0;

  constructor(balance, firstDeposit, firstDraw, secondDeposit, secondDraw) {
    this.balance = balance;
    this.firstDeposit = firstDeposit;
    this.firstDraw = firstDraw;
    this.secondDeposit = secondDeposit;
    this.secondDraw = secondDraw;
  }

  getFirstDeposit() {
    return this.balance + this.firstDeposit;
  }

  getFirstDraw() {
    return this.getFirstDeposit() - this.firstDraw;
  }

  getSecondDeposit() {
    return this.getFirstDraw() + this.secondDeposit;
  }

  getTotalAccount() {
    return this.getSecondDeposit() - this.secondDraw;
  }
}

let account = new SonAccount(0, 500, 200, 100, 50);
console.log("ACCOUNT SON :"+ account.getTotalAccount() + " €");

class MotherAccount extends SonAccount {
  canoneAnnuo = 0;

  constructor(
    balance,
    firstDeposit,
    firstDraw,
    secondDeposit,
    secondDraw,
    canoneAnnuo
  ) {
    super(balance, firstDeposit, firstDraw, secondDeposit, secondDraw);

    this.canoneAnnuo = canoneAnnuo;
  }

  getFirstDeposit() {
    return this.balance + this.firstDeposit;
  }

  getFirstDraw() {
    return this.getFirstDeposit() - this.firstDraw;
  }

  getSecondDeposit() {
    return this.getFirstDraw() + this.secondDeposit;
  }

  getSecondDraw() {
    return this.getSecondDeposit() - this.secondDraw;
  }

  getCanoneAnnuo() {
    return (this.getSecondDraw() * this.canoneAnnuo) / 100;
  }

  getTotalAccount() {
    return this.getSecondDraw() - this.getCanoneAnnuo();
  }
}

let mother = new MotherAccount(0, 600, 200, 100, 50, 15);

console.log("ACCOUNT MOTHER :"+ mother.getTotalAccount() + " €");



class Psicologa {
  reditoAnnuoLordo = 0;
  coefRedd = 0;
  aliquotaInps = 0;
  aliquotaIrpef = 0;

  constructor(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef) {
    this.aliquotaInps = aliquotaInps;
    this.aliquotaIrpef = aliquotaIrpef;
    this.reditoAnnuoLordo = reditoAnnuoLordo;
    this.coefRedd = coefRedd;
  }

  getUtileTasse() {
    return (this.reditoAnnuoLordo * this.coefRedd) / 100;
  }

  getIrpef() {
    return (this.aliquotaIrpef * this.getUtileTasse()) / 100;
  }

  getInps() {
    return (this.aliquotaInps * this.getUtileTasse()) / 100;
  }

  getUtileNetto() {
    return this.reditoAnnuoLordo - (this.getInps() + this.getIrpef());
  }
}

let ps1 = new Psicologa(30000, 78, 26, 15);
console.log("inps " + ps1.getInps());
console.log("irpef " + ps1.getIrpef());
console.log("utile già tassato " + ps1.getUtileNetto());

class Artigiano extends Psicologa {
  importoEccedente = 0;
  costoFissoInps = 0;

  constructor(
    reditoAnnuoLordo,
    coefRedd,
    aliquotaInps,
    aliquotaIrpef,
    importoEccedente,
    costoFissoInps
  ) {
    //parametri per la classe padre
    super(reditoAnnuoLordo, coefRedd, aliquotaInps, aliquotaIrpef);

    //parametri per this
    this.importoEccedente = importoEccedente;
    this.costoFissoInps = costoFissoInps;
  }

  getInps() {
    return (
      this.getUtileTasse() * this.aliquotaInps +
      this.getUtileTasse() * this.aliquotaIrpef
    );
  }

  getUtileEccedente() {
    return (
      ((this.reditoAnnuoLordo - this.importoEccedente) * this.coefRedd) / 100
    );
  }

  getInps() {
    return (this.getUtileEccedente() * this.aliquotaInps) / 100;
  }

  getRedditoNetto() {
    console.log("annuo lordo = " + this.reditoAnnuoLordo);
    console.log("ral " + this.coefRedd);
    return (
      this.reditoAnnuoLordo -
      (this.getIrpef() + this.getInps() + this.costoFissoInps)
    );
  }
}

/**
 * 
 *  reditoAnnuoLordo,
    coefRedd,
    aliquotaInps,
    aliquotaIrpef,
    importoEccedente,
    costoFissoInps
 * 
 

let artigiano = new Artigiano(90000, 67, 24, 15, 15000, 3500);
console.log(artigiano.getRedditoNetto()); */

   /*class BankAccount {

         balance =0;
         firstDeposit =0;
         firstDraw =0;
         secondDeposit =0;
         secondDraw= 0;
        
  

     getFirstDeposit( balance =0, firstDeposit =500) {
    

    return balance + firstDeposit;
     }
     

     getFirstDraw( firstDraw =20){

       return this.getFirstDeposit() - firstDraw
     }

      getSecondDeposit(secondDeposit =50){

        return this.getFirstDraw() + secondDeposit
      }
      
      getTotalAccount( secondDraw =10){

        return this.getSecondDeposit() - secondDraw
      }
    }
       let account = new BankAccount();
       console.log(account.getTotalAccount()); */

    /*class Avvocato {

    redditoAnnuoLordo = 0;
    coeffRedd = 0;
    aliquotaInps = 0;
    aliquotaIrpef = 0;

    constructor(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef) {

        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.coeffRedd = coeffRedd;
        this.aliquotaInps = aliquotaInps;
        this.aliquotaIrpef = aliquotaIrpef;
    }

    getUtileTasse() {

        return this.redditoAnnuoLordo * this.coeffRedd / 100;
    }

    getTassaInps() {

        return this.getUtileTasse() * this.aliquotaInps / 100;
    }

    getTassaIrpef() {

        return this.getUtileTasse() * this.aliquotaIrpef / 100;
    }

    getRedditoAnnuoNetto() {

        return this.redditoAnnuoLordo - (this.getTassaInps() + this.getTassaIrpef());
    }
}

let avvocato = new Avvocato(70000, 67, 22, 15);

console.log("Utile tasse: " + avvocato.getUtileTasse() + "€");
console.log("Tassa inps: " + avvocato.getTassaInps() + "€");
console.log("Tassa irpef: " + avvocato.getTassaIrpef() + "€");
console.log("Reddito annuo netto avvocato: " + avvocato.getRedditoAnnuoNetto() + "€");

class Elettricista extends Avvocato{

    importoEccedente = 0;
    inpsFissa = 0;

    constructor(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef, importoEccedente, inpsFissa) {

        super(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef)

        this.importoEccedente = importoEccedente;
        this.inpsFissa = inpsFissa;
    }

    getUtileTasse() {

        return this.redditoAnnuoLordo * this.coeffRedd / 100;
    }

    getUtileEccedente() {

        return (this.redditoAnnuoLordo - this.importoEccedente) * this.coeffRedd / 100;
    }

    getTassaInps() {

        return this.getUtileEccedente() * this.aliquotaInps / 100;
    }

    getTassaIrpef() {

        return this.getUtileTasse() * this.aliquotaIrpef / 100;
    }

    getRedditoAnnuoNetto() {

        return this.redditoAnnuoLordo - (this.getTassaIrpef() + this.getTassaInps() + this.inpsFissa);
    }
}

let elettricista = new Elettricista(60000, 67, 22, 15, 1500, 3000);

console.log("Utile eccedente: " + elettricista.getUtileEccedente() + "€");
console.log("Tassa inps : " + elettricista.getTassaInps() + "€");
console.log("Tassa irpef: " + elettricista.getTassaIrpef() + "€");
console.log("Reddito annuo netto elettricista: " + elettricista.getRedditoAnnuoNetto() + "€"); */

 // Esercizio Motorino
  //Scrivere la classe Motorino che ha i seguenti attributi 
// colore: una stringa indicante il colore del motorino
// velocità: un numero con la virgola indicante la velocità in Km/h che possiede il motorino
// tipo: una stringa indicante la marca e il modello del motorino es. “Piaggio scarabeo”
// l’attributo antifurto un boolean che indica se è stato inserito l’antifurto (ha un valore iniziale pari a false). 
// Il costruttore ha come parametri una stringa per il colore, una stringa per il tipo, un numero con la virgola per la velocità ed assegna opportunamente i valori dei parametri agli attributi. 
// Scrivere il metodo getVelocità che restituisce la velocità del motorino
// Scrivere inoltre il metodo accelera che ha come parametro un numero con la virgola indicante i Km/h che si vogliono aggiungere alla velocità
// il metodo verifica il valore dell’attributo antifurto se è false aggiunge il valore del parametro all’attributo velocità, altrimenti non fa nulla. 
// Scrivere il metodo inserisciAntifurto che assegna un valore true all’attributo antifurto.


   /*class Motorino {

      colore ="nero";
      velocità = 50.4;
      tipo = "Piaggio Scarabeo";
      antifurto = false

      constructor(colore, tipo, velocità, antifurto){
        this.colore = colore;
        this.tipo = tipo;
        this.velocità = velocità;
        this.antifurto = antifurto;
      }
      
      getVelocità(){
        return this.velocità;
      }
      accelera(kmAggiunti){
        if(! this.antifurto){
          this.velocità += kmAggiunti;
        } else{
          console.log ("Non è consentito accelerare");
        }
      }
     
       inserisciAntifurto(){
        this.antifurto =true;
       }
   }
        let motorino = new Motorino( "nero", "Piaggio Scarabeo", 50.4, false);

        console.log("Velocità iniziale: ", motorino.getVelocità());
        
        motorino.accelera(20.4);
        console.log( " velocità raggiunta con l'accelerazione " + motorino.getVelocità());

        motorino.inserisciAntifurto();
        motorino.accelera(20.4);
        console.log(" inserito l'antifurto il motorino non accelera, la velocità è: " + motorino.getVelocità());

     // Scrivere la classe MotorinoImmatricolato sottoclasse della classe Motorino 
    // che ha in più 2 attributi: 
    // maxVelocità un numero con la virgola (coerente con la scelta fatta per l’attributo velocità) 
    // indicante la velocità massima in Km/h che il motorino può raggiungere; 
    // targa una stringa indicante la targa del motorino 
    // (ad entrambi gli attributi viene assegnato un valore nel costruttore). 
    // Aggiungere il metodo getMax il metodo stampa il valore dell’attributo maxVelocità. 
    // Ridefinire il metodo accelera in modo che prima di modificare la velocità 
    // effettui un controllo sulla velocità massima raggiunta. 
    // Il metodo definisce una variabile s (dello stesso tipo di velocità) ed assegna ad s 
    // la somma tra il valore del parametro del metodo ed il valore dell’attributo velocità; 
    // se s è minore del valore dell’attributo maxVelocità assegna il valore di s 
    // all’attributo velocità altrimenti assegna all’attributo velocità 
    // il valore dell’attributo maxVelocità.
        



      class MotorinoImmatricolato extends Motorino{
        maxVelocità = 100;
        targa = "AD2334AD";

        constructor( colore, tipo, velocità, antifurto, maxVelocità, targa ){
           
          super( colore, tipo, velocità, antifurto);  
          this.maxVelocità = maxVelocità;
          this.targa = targa;
        }
        
         getMax(){
           return this.maxVelocità;
         }

         accelera(kmAggiunti){
           if(!this.antifurto){
            let s = this.velocità + kmAggiunti;
            if( s < this.maxVelocità){
              this.velocità = s;
            } else {
               this.velocità =this.maxVelocità;
            }
           } else {
               console.log (" Impossibile accelerare, l'antifurto è stato inserito ");
           }
         }
      }  
          let motorino1 = new MotorinoImmatricolato(" nero", "Piaggio Scarabeo", 50.4, false,"AD2334AD")

          console.log(" Velocità attuale " + motorino1.getVelocità());

          console.log("Velocità massima consentita" + motorino1.getMax());

          motorino1.accelera(51);
          console.log("Velocità dopo la prima accelerazione: " + motorino1.getVelocità());

         motorino1.inserisciAntifurto();
         motorino1.accelera(10);
         console.log("Velocità dopo la seconda accelerazione: " + motorino1.getVelocità());





 /*Scrivere la classe Dipendente che ha i seguenti attributi matricola: una stringa indicante il numero di matricola del dipendente, stipendio: un numero con la virgola indicante lo stipendio base che possiede il dipendente, straordinario:
  un numero con la virgola indicante l’importo dovuto per ciascuna ora di straordinario effettuata dal dipendente.
 Il costruttore ha come parametri una stringa per la matricola, un numero con la virgola per lo stipendio ed un numero con la virgola per lo straordinario ed assegna opportunamente i valori dei parametri agli attributi.
 Scrivere il metodo getStipendio che restituisce il valore dell’attributo stipendio, 

 scrivere inoltre il metodo paga che ha come parametro un numero intero indicante il numero di ore di straordinario effettuate dal dipendente, 
 il metodo restituisce il valore ottenuto sommando all’attributo stipendio il risultato del prodotto tra il parametro del metodo e l’attributo straordinario. 

 Scrivere il metodo stampa che stampa il valore degli attributi della classe

*/

 /*class Dipendente {
  matricola = "";
  stipendio = 0;
  straordinario = 0;

  constructor(matricola, stipendio, straordinario) {
    this.matricola = matricola;
    this.stipendio = stipendio;
    this.straordinario = straordinario;
  }

  getStipendio() {
    return this.stipendio;
  }

  paga(oreStraordinario) {
    this.stipendio =
      this.getStipendio() + this.straordinario * oreStraordinario;
    return this.stipendio;
  }

  stampa() {
    return {
      matricola: this.matricola,
      stipendio: this.getStipendio(),
      straordinario: this.straordinario,
    };
  }
}

 let d1 = new Dipendente("A01", 2000, 10);
 console.log(d1.getStipendio());
 console.log(d1.paga(5));
 console.log(d1.stampa());

 /*

Scrivere la sottoclasse DipendenteA della classe Dipendente che ha in più l’attributo malattia: 
un numero intero indicante i giorni di malattia presi che viene inizializzato a zero. 

Aggiungere il metodo prendiMalattia che ha come parametro un numero intero indicante i giorni di malattia presi, il metodo modifica il valore dell’attributo malattia aggiungendogli il valore del parametro. 

Ridefinire il metodo paga in modo che prima definisce una variabile p a cui assegna il valore ottenuto richiamando il metodo paga della superclasse, 
poi se l’attributo malattia è uguale a zero il metodo restituisce il valore di p altrimenti restituisce il valore ottenuto sottraendo a p il valore del prodotto tra malattia e 15,0. 
Definire un metodo stampaMalattia che stampa il valore dell’attributo malattia

*/

/*class DipendenteA extends Dipendente {
  malattia = 0;

  constructor() {
    super("A01", 2000, 10);
  }

  prendiMalattia(malattia) {
    this.malattia += malattia;
    return this.malattia;
  }

  paga(oreStraordinario) {
    let p = super.paga(oreStraordinario);
    return this.malattia == 0 ? p : p - this.malattia * 15;
  }

  stampaMalattia() {
    return {
      malattia: this.malattia,
    };
  }
}

let d2 = new DipendenteA();
console.log(d2.prendiMalattia(30));
console.log(d2.paga(10));
console.log(d2.stampaMalattia()); */

 // Esercizio abbigliamento

/*class TipoCapoAbbigliamento {

   marca = "";
   modello = "";
   costo =0;

   constructor( marca, modello, costo){
      this.marca = marca;
      this.modello = modello;
      this.costo = costo;
   }
    getCosto(){
       return this.costo;
    }
    applicaSconto(sconto){
       return this.costo -(this.costo/100 * sconto);
    }

    modificaCosto( newCosto){
       this.costo = newCosto;
    }

 }
    let capo = new TipoCapoAbbigliamento("adidas", "maglia", 29.99);

     console.log(" Il costo iniziale del capo è di: " + capo.getCosto() + "€");
     console.log( " Il costo scontato del capo è di: " + capo.applicaSconto(20) +"€");
     
     capo.modificaCosto(50);
     console.log (" Il costo dopo la modifica è di " + capo.getCosto() +"€");

     class CapoAbbigliamento extends TipoCapoAbbigliamento{
        
      taglia =0;
      quantitàAcquistata =0;
      quantitàDisponibile =0;

      constructor(
    marca,
    modello,
    costo,
    taglia,
    quantitàAcquistata,
    quantitàDisponibile
  ) {
    super(marca, modello, costo);
    this.taglia = taglia;
    this.quantitàAcquistata = quantitàAcquistata;
    this.quantitàDisponibile = quantitàDisponibile;
  }

  getCosto() {
    return this.costo;
  }

  applicaSconto(sconto) {
    return this.costo - (this.costo / 100) * sconto;
  }

  modificaCosto(newCosto) {
    this.costo = newCosto;
  }

  venduto(quantità) {
    if (this.quantitàDisponibile > quantità) {
      this.quantitàDisponibile -= quantità;
    } else {
      console.log("Chiama il fattorino antipatico");
    }
  }

  getDettagli() {
    console.log("--------------------------------------------------------");
    console.log("MARCA: " + this.marca);
    console.log("MODELLO: " + this.modello);
    console.log("COSTO: " + this.costo + " €");
    console.log("TAGLIA: " + this.taglia);
    console.log("QUANTITA' ACQUISTATA: " + this.quantitàAcquistata);
    console.log("QUANTITA' DISPONIBILE: " + this.quantitàDisponibile);
    console.log("--------------------------------------------------------");
  }
}

let capo1 = new CapoAbbigliamento("adidas", "maglia", 29.99, "M", 35, 20);

console.log("Il costo iniziale del capo è di: " + capo1.getCosto() + " €");
console.log(
  "Il costo scontato del capo è di: " + capo1.applicaSconto(20) + " €"
);
capo1.modificaCosto(50);
console.log(
  "Il costo dopo modifica costo del capo è di: " + capo1.getCosto() + " €"
);
capo1.getDettagli();
capo1.venduto(10);
capo1.getDettagli();
capo1.venduto(15); */
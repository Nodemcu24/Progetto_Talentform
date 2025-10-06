/// <reference lib="es2015" />
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
/*let teacher: string ="fabio";
console.log(teacher);


/*let arr: string[] = ["ciao", "a", "tutti"];
arr.unshift("primo");
arr.push("ultimo");
console.log("--------------------------------------");
console.log(arr);
console.log("--------------------------------------");
console.log(arr.pop());

console.log("--------------------------------------");
console.log("ordine crescente:");
arr.sort();
console.log(arr);

console.log("--------------------------------------");
console.log("reverse:");
arr.reverse();
console.log(arr); */
//Crea un array di interi e stampane ogni elemento. 
//  let arr: number[] = [1,2,3,4,5];
//  for ( let i=0; i< arr.length; i++){
//      console.log(i);
//  }
//Calcola la somma di tutti gli elementi di un array.
/*let ar: number[] =[ 2,5,6,8];
 let sum: number= 0;
 for( let j=0; j < ar.length; j++){
   sum += ar[j]
    
 }
    console.log(sum); */
//Calcola la media aritmetica degli elementi di un array.
/* let numbers: number [] =[ 1,2,3,4,5];
let somma1 : number = 0;
let avg = 0;
for ( let numero of numbers) {

     somma1 += numero
}
avg = somma1/ numbers.length;

   
console.log(avg); */
// Per trovare il valore max
/* let numbers: number[] = [1, 2, 3, 4, 5, 6];

  let numeroMax: number = 0;

for(let numero of numbers) {

   if(numeroMax < numero) {

 numeroMax = numero;
}
}

console.log(numeroMax); */
// Per trovare il valore min 
//      let numbers: number[] = [1, 2, 3, 4, 5, 6];
//     let numeroMin: number = numbers[0];
//    for(let numero of numbers) {
//     if(numeroMin > numero) {
//       numeroMin = numero;
//      }
//  }
//    console.log(numeroMin);
//Conta il numero di elementi pari in un array.
/* let pari: number =0;
 let nPari : number[] = [ 1,2,3,4,5];
  for( let i =0; i< nPari.length; i++){
     if (nPari[i] %2 ==0 ){
         pari ++;
     }
  }
     console.log(pari); */
//    // Stampa gli elementi dell’array in ordine inverso.
//  let npari: number[] = [1, 2, 3, 4, 5];
//   npari.reverse();
// console.log(npari);  
// Conta quanti elementi nell’array sono maggiori di 10.
/* let counter : number =0;
 let num: number[] = [1,2,3,4,5,6,15,14];
  for( let i =0; i < num.length; i++){
      if( num[i] > 10){
          counter ++;
      }
  }
    console.log(counter); */
// numero 10 presente nell' array
// numero 10 presente nell'array
/*let numeri: number[] = [1, 5, 10, 20, 30];

let contieneDieci: boolean = false;

// Cicliamo sull'array e controlliamo se c'è il numero 10
for (let i = 0; i < numeri.length; i++) {
 let numeroCorrente = numeri[i];

 if (numeroCorrente === 10) {
   contieneDieci = true;
   break;
 }
}

if (contieneDieci) {
 console.log("Il numero 10 è presente nell'array.");
} else {
 console.log("Il numero 10 NON è presente nell'array.");
} */
// Esercizi con oggetti
/*let prodotto :{

nome:string,
prezzo : number,
clienti: string[]

} ={
  
   nome : "pasta",
   prezzo : 10,
   clienti : ["Mario Rossi", "Maria Bianchi", "Luigi Verdi"]

}

  console.log("\n");
  console.log("prodotto = ".concat(prodotto.nome));
  console.log(...prodotto.clienti);
  console.log("\n"); */
// Traccia: Crea un oggetto persona con nome e età.
/*let persona : {
  id: number,
  nome: string,
  eta: number,
} = {
  
  id :1,
  nome: "Mario",
  eta: 35

};
  function utente () {
      
   let utente = { nome : "Anna",

      saluta(){
     
     return ` ciao sono ${ this.nome}`
   }

   };
       console.log(utente.saluta());
       
 }
   utente(); */
//Traccia: Crea un oggetto con un metodo che saluta.
/*  function auto() {

    let auto :{

      modello: string,

      Anno ?: number,
    } = {

       modello : "GX230"

    }
     console.log(auto);
     
  }
    console.log("\n");
    auto();
    console.log("\n"); */
// Traccia: Crea un oggetto con un altro oggetto dentro.
/*  function studente () {
   let studente = {
      nome: "Marco",
      indirizzo : { via : "Via Roma", città: "Roma"}
  }
  console.log(studente);
  
 
 }
    studente();
// Traccia: Crea un oggetto classe con un array di studenti.

 function classe (){
    
 let studenti ={

   nome: "5A",
   studenti: ["Luca", "Francesca", "Marta", "Giovanni"];

 }
    console.log(classe);
        
}
classe(); */
// Traccia: Passa un oggetto a una funzione.
/*function persona1 ( p :{ nome: string; età : number}){

console.log( `${p.nome} ${p.età} `);

}
  persona1({nome: "Luca", età: 20}); */
//Oggetto come ritorno
// Traccia: Una funzione deve restituire un oggetto.
/*  function auto () {
     
    return{
      
     marca : "Fiat",
     modello : "Panda",
    }
     
     
  }
      console.log(auto());
      



//. Oggetto con chiavi dinamiche
//Traccia: Crea un oggetto rubrica con chiavi assegnate a runtime.

    function rubrica () {
       
         let rubrica : {[ nome: string] : string} = {

         }
             rubrica [ "Mario"] = "12345";
             rubrica [ "Andrea"] = "45678";
           
          console.log(rubrica)
         
    }
        rubrica();


// Oggetto con unione di tipi
//Traccia: Una proprietà può essere string o number.

  function pagamento() {

     let pagamento :{
     
       tipo: string | number;

      } = {

          tipo: "carte"
      }
       console.log(pagamento);
       
  }
     pagamento (); */
//Traccia: Crea un array contenente più oggetti.
/*function prodotti (){
  let prodotti = [
   { nome : "pane", prezzo: 4 },
   { nome : "cornetto", prezzo: 1 },
   { nome : "uova", prezzo: 2 }
   
  ]
    console.log(prodotti);
    
}
   prodotti();




// Traccia: Stampa tutte le chiavi e i valori di un oggetto.

function nomi(){

let nomi ={
   nome :"Fabio",
   età: "35"
}
  
for ( let chiave in nomi){


  console.log(`${chiave}: ${nomi[chiave as keyof typeof nomi]}`);
}
 
}
nomi();*/
// Esempi di Tupla
/* let prodotti :[ string, string, boolean, number ];
  prodotti = [ " pasta", "barilla", true, 20];
  console.log(prodotti);

 // Traccia: Stampa solo il secondo elemento di una tupla.
 function persone(){
 let persone: [string, number, string, number, string, number];
 persone = ["luca", 39, "andrea",25, "mario", 55];
 persone[2] = "Francesco"; // Traccia: Modifica il contenuto di una tupla già dichiarata.
 console.log(persone);
   
 console.log(persone[1]);
 
 }
   persone();

//Traccia: Crea una funzione che ritorna una tupla [string, number].

function getUtente():[string, number] {
     return [ "Luca", 25];
}
  console.log( getUtente()); */
//Traccia: Crea una tupla [string, number, boolean].
/*  function getNomi(){
  let anagrafe:[ string, string, number, boolean];
   anagrafe = ["Mario", "Bianchi", 25, false]
   console.log(anagrafe);
   
  }
    getNomi();
// Traccia: Crea un array che contiene più tuple [string, number].

  function getArr(){
  let arr = [
    ["mela", 3],
    ["banana", 5],
    ["arancia", 2],
    ["kiwi", 4]
]
    console.log(arr);
 }
    getArr();




// Traccia: Scorri un array di tuple e stampa i dati.
function scorrArr(){
let nomi = [
['Mario', 25],
['Luisa', 30],
['Giovanni', 22]
];
for( let [ nome, età] of nomi){
console.log(` Nome:${ nome}, Età: ${età}`);

}
}
 scorrArr(); */
//Destrutturazione di tuple
//Traccia: Estrai i valori da una tupla in variabili separate.
/*   function valori () {
 let tupla =[ "Paolo", 10];
 let [nome, età] = tupla;
  console.log( nome + "   " + età);
}
   valori();
 
  
    

// Funzione con parametro tupla
// Traccia: Crea una funzione che accetta una tupla [string, number].*/
/* function traccia2(tupla: any) {

const [nome, eta] = tupla;
console.log(nome);
console.log(eta);
}
traccia2(["Mario", 60]);




 // Tuple opzionali
//  Traccia: Definisci una tupla dove il terzo elemento è opzionale.

 function traccia3 (){
    
   let tupla :[ cognome: string, nome?: string ] =[ "Verdi", ];
   tupla.push ("Rossi", "Luigi");
   tupla.push(" Bianchi", "Andrea");
   for( let i =0; i < tupla.length; i++){
     console.log(tupla[i]);
     
   }
 }
  traccia3(); */
//Tupla con tipo readonly
//Traccia: Definisci una tupla immutabile
/*    let coordinate : readonly [number, number] = [1 , 2];

  console.log(coordinate);
   

  console.log("\n");
  coordinate([]);
  console.log("\n"); */
// Tupla come chiave-valore
// Traccia: Crea una funzione che ritorna una tupla chiave-valore.
/* function copia( key : string, value : number) : [ string, number] {
     
   return [ key, value];
 }
   console.log (copia("ab123", 1)) */
//  Uso avanzato con map
// Traccia: Dato un array di tuple [string, number], incrementa tutti i numeri di 1.
/*function coppia() {

   let coppia : [string, number][];

   coppia = [
       ["a", 1],
       ["b", 2],
       ["c", 3]
   ]

   let appoggio = coppia.map(([lettera, numero]) : [string, number] => {return [lettera, numero + 1]});

   console.log(appoggio);
}

console.log("\n");
coppia();
console.log("\n"); */
/*//Traccia: Scrivi una funzione che prende due numeri e ritorna la loro somma.
function somma ( a : number, b : number) : number {

  return   a + b;

}
 console.log(somma( 5,6));
 

//Traccia: Scrivi una funzione che riceve un numero e stampa se è pari o dispari.

 function pari( n : number) :void{
    if( n %2 ==0){
      console.log("pari");
      
    } else {
      console.log( "dispari");
      
    }
 }
    pari(5);
     
//Traccia: Scrivi una funzione che prende una stringa e la ritorna in maiuscolo.

 function str ( stringa : string ) : string{

    return stringa.toUpperCase();
 }
  console.log(str("hello world")); */
//    Primo carattere di una stringa
// Traccia: Scrivi una funzione che ritorna il primo carattere di una stringa.
/* function str ( a: string) : string {
   
  return a[0];
 }
   console.log(str("prova")); */
// Lunghezza di un array
// Traccia: Scrivi una funzione che ritorna il numero di elementi in un array.
/* function arr ( x : number[]) : number {
    
   return x.length;
 }
   console.log(arr([10,20,30,40]));

  // Scrivi una funzione che somma tutti i numeri in un array.

   function arr1 ( y: number[]) : number{
     let somma : number =0;
     for ( let i=0 ; i < y.length; i++){
          somma += y[i]
     }
        return somma;
   }
     console.log(arr1([10,20,30])); */
// Traccia: Scrivi una funzione che ritorna il maggiore tra due numeri.
/*let max = ( a : number, b : number ): number =>{

  return a > b? a:b;
}
 console.log(max(50,40)); */
// Traccia: Scrivi una funzione che conta quante vocali ci sono in una stringa.
/* let vocali = ( str : string): number=> {
     let count =0;
      for ( let i=0 ; i < str.length; i++){
        if ("aeiouAEIOU".includes(str[i]))
   count++;
   }
   return count;
 }
 console.log(vocali("Ciao a tutti"));
 for (let i in vocali) {
  console.log(vocali[i], i);
 }
  console.log(vocali("benvenuti a tutti")); */
//    function contaVocali(testo) {
//   let count = 0;
//   const vocali = "aeiou";
//   for (let c of testo.toLowerCase()) {
//     if (vocali.includes(c)) {
//       count++;
//     }
//   }
//   return count;
// }
// console.log(contaVocali("Ciao")); // 3
//  // Scrivi una funzione che controlla se un valore è presente in un array.
//   let n=[1,2,3,4,5,6,7,8,9];
//  let check=(val:number,n:number[]):number=>{
//   return n.indexOf(val);
//  }
// console.log(check(5,n));
//Enum esercizi 
//Crea un enum chiamato Giorno con i giorni della settimana.
//  Stampa tutti i valori usando un ciclo for.
/* enum Giorno {
   Lunedi ="Lunedi",
   Martedi = "Martedi",
   Mercoledi= "Mercoledi",
   Giovedi ="Giovedi",
   Venerdi= "Venerdi",
   Sabato= " Sabato",
   Domenica = "Domenica"

 }

 for (let giorno in Giorno){
   console.log(giorno);
   
 }
  
  // Crea un enum Stagione con quattro valori.
  //  Usa switch per stampare un messaggio diverso per ogni stagione.

   enum Stagione{
     
      ESTATE,
     INVERNO,
     AUTUNNO,
     PRIMAVERA
   
   }


      function descriviStagione(s: Stagione): void {
 switch (s) {
  case Stagione.PRIMAVERA:
  console.log("Fioriscono i fiori!");
  break;
   case Stagione.ESTATE:
  console.log("Si va al mare!");
  break;
   case Stagione.AUTUNNO:
  console.log("Cadono le foglie!");
  break;
  case Stagione.INVERNO:
  console.log("Fa freddo!");
  break;
}
}

// Uso
let s: Stagione = Stagione.ESTATE;
descriviStagione(s); */
// Custom Type 
//  Type alias con più campi
//  Traccia: Definisci un tipo Persona con nome e età.
/* type Persona = { nome: string, eta: number};

 const mario : Persona ={ nome: " Mario", eta :30}

 console.log(mario);
 
//Traccia: Crea un tipo Risultato che può essere "success" o "error".

 type Risulato = "success" | "error";
  function un(x: Risulato) : void {

     console.log("Esito", x);
     
  }
    un("success"); */
//   Array tipizzato
// Traccia: Crea un tipo Studente e un array di studenti.
/* class Studente {
nome: string = "";
cognome: string = "";
matricola: number | undefined;
dataDiNascita: string = "";
luogoDiNascita: string = "";

constructor(
  nome: string,
  cognome: string,
  matricola: number,
  dataDiNascita: string,
  luogoDiNascita: string
) {
  this.nome = nome;
  this.cognome = cognome;
  this.matricola = matricola;
  this.dataDiNascita = dataDiNascita;
  this.luogoDiNascita = luogoDiNascita;
}
toString() {
  return `{ "nome": "${this.nome}", "cognome": "${this.cognome}", "matricola": "${this.matricola}",`.concat(
     `"data_di_nascita": "${this.dataDiNascita}", "luogo_di_nascita": "${this.luogoDiNascita}" }`
 );
};
}

let studenti: Studente[] = [];
studenti.push(new Studente("Mario", "Rossi", 1, "01-01-1980", "Napoli"));
studenti.push(new Studente("Maria", "Verdi", 2, "01-01-1990", "Torino"));

studenti.forEach((valore) => {
console.log(JSON.parse(valore.toString()));
});

   
    
    

  // Tipo funzione
  // Traccia: Crea un tipo che rappresenta una funzione somma(a,b).
   
    //Tipo funzione
//Traccia: Crea un tipo che rappresenta una funzione somma(a,b).
/*type Numero = number | null;
function somma(a: Numero, b: Numero): Numero {
 if (a != null && b != null) {
   return a + b;
   } else {
    return -1;
  }
}
let res = somma(5, 6);
let res2 = somma(1, null);
console.log(res);
console.log(res2);




  // Tipo con union e oggetti
  // Traccia: Crea un tipo Pagamento che può essere con carta o contanti.*/
//  type SommaFn = (a: number, b: number) => number;
//  const somma: SommaFn = (x, y) => x + y;
// console.log(somma(5, 3)); 
// Intersection type 
//   type Admin1={
//    nome:string;
//   grade:string[];
//   }
//   type Employee1 = {
//   startDate: Date;
//  };
//  type Worker1={
//   worker:string;
//  }
//  type Lavoratore=Admin1 &Worker1&Employee1;
//  const lavoratore1:Lavoratore={
//   nome:'Luca',
//   grade:['Team Leader'],
//   worker:'Developer',
//   startDate:new Date(),
// }
//    Traccia: Unisci i tipi Persona e Contatti.
/*   type Persona ={
     nome:string,
     eta: number
   }
    type contatti={
      telefono : number,
      email :string
    }

    function persona(){
      const utenti : Persona & contatti ={
         nome : "Mario",
         eta : 45,
         telefono : 123456789,
         email : "mario.rossi@live.it"
      }
       console.log(utenti);
    }
      persona();
     


// Traccia: Crea un tipo Studente e uno Indirizzo, poi uniscili.
     type studente ={
       nome:string,
       corso : string
     }
      type Indirizzo ={
        citta : string,
        via : string
      }

       function studenti(){
        const stud: studente & Indirizzo ={
           nome :"Luca",
           corso :"java",
           citta: "Torino",
           via: "Via del non ritorno 1"
        }
           console.log(stud);
           
       }
            studenti(); */
//  Veicolo + Assicurazione
//  Traccia: Aggiungi dati di assicurazione a un veicolo.
// type Veicolo ={
//   targa : string,
//   tipo : string
// }
// type Assicurazione ={
//   scadenza: string
//   compagnia: string
// }
//  function dati() {
//    const d : Veicolo & Assicurazione ={
//        targa : "AB 123 CD",
//        tipo: "auto",
//        scadenza : "15/12/2027",
//        compagnia :"Allianz"
//    }
//        console.log(d);
//  }
//     dati();
// Persona + Lavoro + Hobby
// Traccia: Usa più di due tipi in un’intersezione
/* type Lavoro = { azienda: string; ruolo: string };
 type Hobby = { sport: string };

  function esercizio15() {
  const p: Persona & Lavoro & Hobby = {
  nome: "Sara",
 eta: 28,
 azienda: "Google",
 ruolo: "Developer",
 sport: "Calcio",
 email: "sara@mail.com",
 telefono: "555-123"
};
console.log(p);
}
esercizio15();*/
//Persona + Lavoro + Hobby
//Traccia: Usa più di due tipi in un’intersezione
/*type Persona = {
nome: string;
eta: number;
email: string;
telefono: number;
};
type Lavoro = {
azienda: string;
ruolo: string;
};

type Hobby = {
sport: string;
};

let persona: Persona = {
nome: "Mario",
eta: 10,
email: "mario@yopmail.com",
telefono: 345111111111,
};

let lavoro: Lavoro = {
azienda: "AAA srl",
ruolo: "Manager",
};

let hobby: Hobby = {
sport: "Basket",
};

type Unione = Persona & Lavoro & Hobby;
let unione: Unione = {
nome: persona.nome,
eta: persona.eta,
email: persona.email,
telefono: persona.telefono,
azienda: lavoro.azienda,
ruolo: lavoro.ruolo,
sport: hobby.sport,
};

console.log(unione); */
// Esempio di Generics
/*   function esempioGenerics<T>( a :T): T {
     return a;
        
   }
     let numero_ = esempioGenerics<number>(5.0);
     let stringa_ = esempioGenerics<string>("ciao a tutti");

     console.log(numero_);
     console.log(stringa_);
     
//        Array generico
// Traccia: Crea una funzione che accetta un array generico e ne restituisce la lunghezza.
   
  function getLunghezza<T>(v:T[]): number {
    return v.length
  }
    let v = [ "str1", "str2"];
    let LunghezzaDiv = getLunghezza<string>(v);
    console.log(LunghezzaDiv);
    


// Traccia: Crea un tipo generico Coppia<T, U> che contiene due valori.

  type Coppia< T, U> = {

    nome:T,
    eta:U,
     
  }
    let coppia: Coppia<string, number> = {

   nome: "Mario",
   eta: 50,
};

console.log(coppia); */
//Traccia: Crea una funzione che accetta un array di tipo generico e stampa ogni elemento.
/*function arrStampa<T>( arr: T[]) : void {

     for ( let element of arr) {
       
            console.log(element);
  }
}

console.log("\n");
arrStampa([1, 2, 3, 4, 5, 6]);
console.log("\n");
     
// Traccia: Crea una funzione che combina due valori generici in una tupla.

  function tuplaCombine<T, U>( a: T, b: U) :[T,U] {
     return [a, b]
  }
     
 console.log("\n");
 console.log(tuplaCombine("Mario", 36));
console.log("\n");
     
//        Funzione generica base
// Traccia: Crea una funzione generica che restituisce lo stesso valore passato.

function general<T> ( b: T) : T {

   return b;
}
  let number = general<number>(6.5);

  console.log(number); */
//Traccia: Crea un tipo generico Coppia<T, U> che contiene due valori.
/*function coppia< T, U>( valA :T, valB : U) : T{
    return  valA;
}
  let copp = coppia<number , number>(10,20);
  console.log(copp); */
//      Traccia: Crea una funzione che accetta un array generico e ne restituisce la lunghezza.
/*function arrLun<T>(arr:T[]): number {
  return arr.length;
}
console.log(arrLun<number>([1,23,4,5,6,7,8,9]));
console.log(arrLun<string>([ "a", "b", "c"]));



// Traccia: Crea una funzione che accetta un array di tipo generico e stampa ogni element

function stampaArr<T>(arr: T[]): void {
 arr.forEach((a) => console.log(a));
}

console.log("PRIMO");
stampaArr<number>([1, 2, 3, 4, 5, 6]);
console.log("SECONDO");
stampaArr<string>(["a", "b", "c"]); */
//   Generics con più parametri
// Traccia: Crea una funzione che combina due valori generici in una tupla.
/* function combina< T, U>( first:T, second: U) : [T, U]{
   return [first, second];
 }
  const result1 = combina ("Nicola",24);
  console.log(result1);
  

// Mapper generico
// Traccia: Crea una funzione che trasforma un array generico con map.

function mapArray< T, U>( arr : T[], transform:( item :T) => U): U[]{
   return arr.map( transform);
}
   let numeri = [1,2,3,4];
   let double = mapArray( numeri, n => n*2);

   console.log(double); */
// Programmazione agli oggetti
var BankAccounts = /** @class */ (function () {
    function BankAccounts(balance, firstDeposit, firstDraw, secondDeposit, secondDraw) {
        if (balance === void 0) { balance = 0; }
        if (firstDeposit === void 0) { firstDeposit = 0; }
        if (firstDraw === void 0) { firstDraw = 0; }
        if (secondDeposit === void 0) { secondDeposit = 0; }
        if (secondDraw === void 0) { secondDraw = 0; }
        this.balance = balance;
        this.firstDeposit = firstDeposit;
        this.firstDraw = firstDraw;
        this.secondDeposit = secondDeposit;
        this.secondDraw = secondDraw;
    }
    BankAccounts.prototype.getFirstDeposit = function () {
        return this.balance + this.firstDeposit;
    };
    BankAccounts.prototype.getFirstDraw = function () {
        return this.getFirstDeposit() - this.firstDraw;
    };
    BankAccounts.prototype.getSeconDeposit = function () {
        return this.getFirstDraw() + this.secondDeposit;
    };
    BankAccounts.prototype.getTotalAccount = function () {
        return this.getSeconDeposit() - this.secondDraw;
    };
    return BankAccounts;
}());
var accounts = new BankAccounts(0, 300, 100, 50, 30);
console.log(accounts.getTotalAccount());
var Professionista = /** @class */ (function () {
    function Professionista() {
    }
    return Professionista;
}());
var LavoratoriAutonomi = /** @class */ (function (_super) {
    __extends(LavoratoriAutonomi, _super);
    function LavoratoriAutonomi(redditoAnnuoLordo, coeffRedd, aliquotaInps, aliquotaIrpef) {
        if (redditoAnnuoLordo === void 0) { redditoAnnuoLordo = 0; }
        if (coeffRedd === void 0) { coeffRedd = 0; }
        if (aliquotaInps === void 0) { aliquotaInps = 0; }
        if (aliquotaIrpef === void 0) { aliquotaIrpef = 0; }
        var _this = _super.call(this) || this;
        _this.redditoAnnuoLordo = redditoAnnuoLordo;
        _this.coeffRedd = coeffRedd;
        _this.aliquotaInps = aliquotaInps;
        _this.aliquotaIrpef = aliquotaIrpef;
        return _this;
    }
    LavoratoriAutonomi.prototype.getUtileTasse = function () {
        return this.redditoAnnuoLordo * this.coeffRedd / 100;
    };
    LavoratoriAutonomi.prototype.getTassaInps = function () {
        return this.getUtileTasse() * this.aliquotaInps / 100;
    };
    LavoratoriAutonomi.prototype.getTassaIrpef = function () {
        return this.getUtileTasse() * this.aliquotaIrpef / 100;
    };
    LavoratoriAutonomi.prototype.getRedditoAnnuoNetto = function () {
        return this.redditoAnnuoLordo - (this.getTassaInps() + this.getTassaIrpef());
    };
    return LavoratoriAutonomi;
}(Professionista));
var reddito = new LavoratoriAutonomi(85000, 78, 26, 15);
console.log(reddito.getRedditoAnnuoNetto());
var SonAccount = /** @class */ (function () {
    function SonAccount(balance, firstDeposit, firstDraw, secondDeposit, secondDraw) {
        if (balance === void 0) { balance = 0; }
        if (firstDeposit === void 0) { firstDeposit = 0; }
        if (firstDraw === void 0) { firstDraw = 0; }
        if (secondDeposit === void 0) { secondDeposit = 0; }
        if (secondDraw === void 0) { secondDraw = 0; }
        SonAccount.balance = balance;
        SonAccount.firstDeposit = firstDeposit;
        SonAccount.firstDraw = firstDraw;
        SonAccount.secondDeposit = secondDeposit;
        SonAccount.secondDraw = secondDraw;
    }
    SonAccount.getFirstDeposit = function () {
        return SonAccount.balance + SonAccount.firstDeposit;
    };
    SonAccount.getFirstDraw = function () {
        return this.getFirstDeposit() - SonAccount.firstDraw;
    };
    SonAccount.getSecondDeposit = function () {
        return this.getFirstDraw() + SonAccount.secondDeposit;
    };
    SonAccount.getTotalAccount = function () {
        return this.getSecondDeposit() - SonAccount.firstDraw;
    };
    return SonAccount;
}());
var son = new SonAccount(0, 500, 100, 200, 100);
console.log(SonAccount.getTotalAccount());

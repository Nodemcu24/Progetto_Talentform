import React from 'react'
import {createContext, useContext} from 'react'

const PersonaContext = createContext({nome: "Mario", cognome: "Rossi", eta: 30});

const AppPersona: React.FC = () => {

    const NewPersona = {nome: "Luigi", cognome: "Verdi", eta: 25};

  return (
     
    <PersonaContext.Provider value={NewPersona}>

       <Utente />

    </PersonaContext.Provider>
    
  )
}
const Utente: React.FC = () => {

    return (

        <div>
            <DatiUtente />
        </div>
    );

}
const DatiUtente: React.FC = () => {

   return (
    <>
     <Dati />
    
    </>
   );

}
const Dati: React.FC = () => {

    const DatiApp = useContext(PersonaContext);

       return (
        <>
          <h1>NOME: {DatiApp.nome}</h1>
      <p>
        ETA: {DatiApp.eta} MATRICOLA: {DatiApp.eta}
      </p>
        
        </>

       

       )
}

export default AppPersona
import React, { useContext, createContext } from "react";
import { AppContext, AppContextType } from './Iprodotti';



const AppNicola = () => {
  return (
    
    <React.Fragment>
        <Fabio/>
    </React.Fragment>
  )
};

const Fabio = () => {

    const Random = useContext(AppContext);

    return(

        <React.Fragment>
            <h1>Id prodotto: {Random.id}</h1>
            <h2>Nome prodotto: {Random.nome}</h2>
            <h3>Prezzo prodotto: {Random.prezzo}</h3>
        </React.Fragment>
    );
};

export default AppNicola;
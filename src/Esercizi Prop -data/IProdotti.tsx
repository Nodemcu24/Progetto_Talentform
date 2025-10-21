import React from "react";
import { IProdotti } from "./model";


const Props: React.FC<IProdotti> = (props) => {
  return(
    <div>
      <h1>{props.id}</h1>
      <h1>{props.brand}</h1>
      <h1>{props.prezzo}</h1>
      <h1>{props.colore}</h1>
      <h1>{props.prodotto}</h1>
    </div>
  );
};
 export default Props;
    
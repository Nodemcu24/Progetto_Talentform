import React from "react";
import { IProdotto } from "./IProdotto";

const PropProdotto: React.FC<IProdotto> = (prop) => {
  return (
    <div>
      <div >NOME: {prop.nome} </div>
      <div>PREZZO: {prop.prezzo}</div>
    </div>
  );
};

export default PropProdotto;
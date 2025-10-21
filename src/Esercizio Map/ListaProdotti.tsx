import React from "react";
import PropProdotto from "./PropProdotto";
import { IProdotto } from "./IProdotto";

type Prodotto = IProdotto[];

const ListaProdotti: React.FC<{ lista: Prodotto }> = (prop) => {
  return (
    <div>
      {prop.lista.map((elem) => (
        <PropProdotto key={elem.id} nome={elem.nome} prezzo={elem.prezzo} />
      ))}
    </div>
  );
};

export default ListaProdotti;
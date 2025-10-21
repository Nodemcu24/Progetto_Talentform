import React from "react";
import AnagraficaProp from "./AnagraficaProp";
import { IPersona } from "../model/IPersona";
import "./Anagrafe.css"; 

interface Props {
  persona: IPersona[];
}

const AnagrafeArray: React.FC<Props> = ({ persona }) => {
  return (
    <div className="anagrafe">
      {persona.map((p) => (
        <AnagraficaProp
          key={p.id}
          nome={p.nome}
          cognome={p.cognome}
          eta={p.eta}
        />
      ))}
    </div>
  );
};

export default AnagrafeArray;

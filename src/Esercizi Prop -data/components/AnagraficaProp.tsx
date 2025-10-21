import React from "react";
import { IPersona } from "../model/IPersona";

const AnagraficaProp: React.FC<IPersona> = ({ nome, cognome, eta }) => {
  return (
    <div>
      <h1>NOME: {nome}</h1>
      <h4>COGNOME: {cognome}</h4>
      <h4>ETA: {eta}</h4>
    </div>
  );
};

export default AnagraficaProp;

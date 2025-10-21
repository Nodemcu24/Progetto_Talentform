import React from "react";
import AnagrafeArray from "./AnagrafeArray";

const AnagrafeProps: React.FC = () => {
  const arr = [
    {
      id: 1,
      nome: "Matteo",
      cognome: "Di Paola",
      eta: 22,
    },
    {
      id: 2,
      nome: "Giovanni",
      cognome: "Rossi",
      eta: 32,
    },
    {
      id: 3,
      nome: "Matteo",
      cognome: "Verdi",
      eta: 28,
    },
  ];

  return (
    <div>
      <AnagrafeArray persona={arr} />
    </div>
  );
};

export default AnagrafeProps;

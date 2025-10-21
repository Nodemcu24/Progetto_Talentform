import React, { useState, useEffect } from "react"

const EsempioUseEffect = () => {
    const [count, setCount] = useState<number>(0);

    useEffect(() => {
        console.log("Reindirizzamento avvenuto con successo.");
    });

    useEffect(() => {
        setTimeout(() => {
            setCount((count) => count - 1);
        }, 2000);
    }, [count]);

  return (
    <div>
        <h1>Contatore: {count} </h1>
    </div>
  )
}

export default EsempioUseEffect;
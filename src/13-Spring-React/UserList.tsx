import React, { useEffect, useState } from 'react';

type ProdottiModel = {
  id?: number;
  list?: string[];
  descrizione?: string;
  listPrezzi?: number[];
};

const ProdottiList: React.FC = () => {
  const [prodotti, setProdotti] = useState<ProdottiModel[]>([]);

  useEffect(() => {
    fetch('/api/prodotti')
      .then(response => {
        if (!response.ok) {
          throw new Error('Errore nella fetch');
        }
        return response.json();
      })
      .then(data => setProdotti(data))
      .catch(error => console.error('Errore:', error));
  }, []);

  return (
    <div>
      <h2>Lista Prodotti</h2>
      {prodotti.map(prodotto => (
        <div key={prodotto.id} style={{ border: '1px solid gray', margin: '8px', padding: '8px' }}>
          <p><strong>ID:</strong> {prodotto.id}</p>
          <p><strong>Descrizione:</strong> {prodotto.descrizione}</p>
          <p><strong>Nomi:</strong> {prodotto.list?.join(', ')}</p>
          <p><strong>Prezzi:</strong> {prodotto.listPrezzi?.join(', ')}</p>
        </div>
      ))}
    </div>
  );
};

export default ProdottiList;
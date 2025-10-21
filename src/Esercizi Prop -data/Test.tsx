
import React from 'react'
import Props from './IProdotti'

const PropsFinale = () => {
  const prodotti = [
  {
    id: 1,
    brand: 'nike',
    prezzo: 150,
    colore: 'blue',
    prodotto: 'scarpe',
  },
  {
    id: 2,
    brand: 'adidas',
    prezzo: 70,
    colore: 'blue',
    prodotto: 'scarpe',
  },
  {
    id: 3,
    brand: 'puma',
    prezzo: 50,
    colore: 'blue',
    prodotto: 'scarpe',
  },
]
  return (
    <div>
      <Props id={prodotti[0].id} brand={prodotti[0].brand} prezzo={prodotti[0].prezzo} colore={prodotti[0].colore} prodotto={prodotti[0].prodotto}></Props>
      <Props id={prodotti[1].id} brand={prodotti[1].brand} prezzo={prodotti[1].prezzo} colore={prodotti[1].colore} prodotto={prodotti[1].prodotto}></Props>
      <Props id={prodotti[2].id} brand={prodotti[2].brand} prezzo={prodotti[2].prezzo} colore={prodotti[2].colore} prodotto={prodotti[2].prodotto}></Props> 
    </div>
  )
}
export default PropsFinale;
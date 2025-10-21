import React from 'react'
import ListaProdotti from './ListaProdotti'

const Prodotti = () => {
  const arrayProd = [
    { id: 1, nome: "penna", prezzo: 1.5 },
    { id: 2, nome: "matita", prezzo: 0.5 },
    { id: 3, nome: "gomma", prezzo: 0.8 },
    { id: 4, nome: "righello", prezzo: 2.5 }
  ]

  return (
    <div className="container">
      <h1 style={{ textAlign: 'center' }}>Lista Prodotti</h1>
      <ListaProdotti lista={arrayProd} />
    </div>
  )
}

export default Prodotti

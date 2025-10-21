import React from 'react'
import ListaNomi from './ListaNomi'


 const App = () => {
  const listaNomi1 = [{id: 1, nome: 'Nicola', eta: (24) }, {id: 2, nome: 'Andrea', eta: (27)}];

  return (
    <div>
      <ul>
        {listaNomi1.map((listaNome) => (<ListaNomi key={listaNome.id} nome={listaNome.nome} eta={listaNome.eta} />))}
      </ul>
    </div>
  )
}



export default App;
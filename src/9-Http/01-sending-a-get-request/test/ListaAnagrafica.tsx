import React from 'react'
import { IAnagrafica } from './IAnagrafica'
import DatiAnagrafica from './DatiAnagrafica'

interface ListaAnagraficaProps {
  anagrafica: IAnagrafica[];
}

const ListaAnagrafica:React.FC<ListaAnagraficaProps> = ({anagrafica}) => {
  return (
    <div>
      <ul>
        {anagrafica?.map((anagrafica: IAnagrafica) => (
        <DatiAnagrafica
          key={anagrafica.id}
          name={anagrafica.name}
          surname={anagrafica.surname}
          nation={anagrafica.nation}
          age={anagrafica.age}
          job={anagrafica.job}
        />
      ))}
      </ul>
    </div>
  )
}

export default ListaAnagrafica
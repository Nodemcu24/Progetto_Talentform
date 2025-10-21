import React from 'react'
import { IAnagrafica } from  './IAnagrafica'
import '../HttpRequest.css';










const DatiAnagrafica:React.FC<IAnagrafica> = (props) => {
  return (
    <div>
       <li className="movie">
        { <h1>{props.id}</h1>}
        <h2>{props.name}</h2>
        <h3>{props.surname}</h3>
        <h4>{props.nation}</h4>
        <h5>{props.age}</h5>
        <h6>{props.job}</h6>
      </li>
    </div>
  )
}

export default DatiAnagrafica
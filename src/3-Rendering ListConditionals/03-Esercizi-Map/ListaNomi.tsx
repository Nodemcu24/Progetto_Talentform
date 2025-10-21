import React from 'react'

    const ListaNomi:React.FC<{nome:string, eta:number}>=(props)=> {
        return (
            <ul>
                <li>{props.nome}</li>
                <li>{props.eta}</li>
            </ul>
        );
    }

export default ListaNomi;
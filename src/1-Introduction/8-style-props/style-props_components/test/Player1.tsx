import React, { Fragment } from 'react'
import Player2 from './StyleProps/Player2'



const Player1 = () => {

    const player =[

     {
         name: "Ronaldo",
         nation:"Portogallo",
         età: 40
     },{
         name: "Messi",
         nation: "Argentina",
         età: 38
     },{
         
           name : "Neymar",
           nation : "Brasile",
           età: 33
           
     }


    ]


  return (
      <Fragment>
        
         <Player2 player={player} />
        
        </Fragment>
  )
}

export default Player1


import React,{Fragment} from 'react'
import Player3 from './Player3'
import { IPlayer } from './IPlayer'

 type Player = IPlayer[];
const Player2:React.FC<{player : Player}> = (props) => {
  return (
    <Fragment>
       
        <div>
          
        <Player3
        name ={ props.player[0].name}
        nation ={ props.player[0].nation}
        età ={props.player[0].età}


        />
          <Player3
        name ={ props.player[1].name}
        nation ={ props.player[1].nation}
        età ={props.player[1].età}

         />
             <Player3
        name ={ props.player[2].name}
        nation ={ props.player[2].nation}
        età ={props.player[2].età}
          
        />
        </div>


   </Fragment>
  )
}

export default Player2
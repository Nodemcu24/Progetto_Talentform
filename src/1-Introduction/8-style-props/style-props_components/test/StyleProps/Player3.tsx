import { Fragment } from "react/jsx-runtime"
import { IPlayer } from "./IPlayer"


const Player3:React.FC<IPlayer> =(props) => { 
  return (

    <Fragment>
        
       <div>
        
       <h3> Nickname = {props.name}</h3>
        <h4> Nation = {props.nation}</h4>
        <h5> Età ={ props.età}</h5>
        </div> 
                
            
     


        
         

        



    </Fragment>
  )
}    
     export default Player3
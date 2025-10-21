import React, { Fragment } from "react";
import { Link } from "react-router-dom";


const Prodotti = () => {
  return (
    < React.Fragment>
     <div>
        <h1 style={{fontSize : "40px",
         textAlign: "center",
         color: "yellow",
         background : "black"   
        }}>Ricambi</h1>
        
    
        <h2 style={{color : "red", fontSize: "25px"}}>
            Categorie
        </h2>
        <ul style={{color :"greenyellow", background : "black", marginLeft : "2px"}} >
          
            <li>Sospensioni</li>
            <li>Freni</li>
            <li>Scarichi</li>
            <li>Motore</li>

        </ul>
        
      
        <p style={{marginTop:'30%',marginLeft:'40%'}}>Clicca su Contattaci se vuoi inviare un messaggio

        <Link style={{ color: "orange",marginLeft:'2%' }} to="/contatti">
          Contattaci
          </Link>
          </p>
           </div>
    </React.Fragment>
  );
};

     


export default Prodotti
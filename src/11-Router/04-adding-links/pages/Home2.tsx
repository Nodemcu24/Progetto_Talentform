import React from 'react';
import { Link } from 'react-router-dom';

const HomePage = () => {
  const titolo = "Home";
  const descrizione = "Welcome to Car parts website";

  return (
    <>
      <h1 style={{ textAlign: 'center', color: 'blue', fontSize: "30px" }}>
        {titolo}
      </h1>

      <p style={{
        textAlign: 'center',
        backgroundColor: 'lightgrey',
        color: 'blue',
        marginLeft: '20%',
        marginRight: '20%'
      }}>
        {descrizione}
      </p>

      <p style={{ textAlign: "center" }}>Scopri il catalogo ricambi</p>
      <div style={{ textAlign: "center" }}>
        <Link style={{ color: 'red' }} to="/products">
          Clicca qui
        </Link>
      </div>
    </>
  );
};

export default HomePage;




    
    

 

   
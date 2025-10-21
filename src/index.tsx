 import React from "react";
 import ReactDOM from "react-dom/client";
 import "./index.css";
 import reportWebVitals from "./reportWebVitals";
 import Anagrafica from "./9-Http/01-sending-a-get-request/test/Anagrafica";
import RouterSetup from "./11-Router/02-route-setup/RoutSetup";
import RouteProdLinks from "./11-Router/04-adding-links/pages/RouteProdLinks";
import RoutDynamic from "./11-Router/09-dynamic-routes/RoutDynamic";
import ProdottiList from "./13-Spring-React/UserList";
//  import HttpRequestPost from "./9-Http/04-sending-a-post-request/HttpRequestPost";
// import ConditionalRendering from "./2-State/02-state-conditional-rendering/ConditionalRendering";
// import StylePropsExpenses from "./1-Introduction/8-style-props/StylePropsExpenses";
// import Player1 from "./1-Introduction/8-style-props/style-props_components/test/Player1";
// import ContatoreCleanUp from "./8-Reducers/02-using-the-useeffect-hook/test/ContatoreReset";
// import HttpRequest from "./9-Http/01-sending-a-get-request/HttpRequest";
// import AppPersona from "./8-Reducers/08-using-the-react-context-api/AppPersona";
// import AppCristian from "./8-Reducers/08-using-the-react-context-api/test/AppCristian";
// //import UECup from "./8-Reducers/02-using-the-useeffect-hook/test/Esempio UseEffect";
// //
// import PropsFinale from "./Esercizi Prop -data/Test";
// import State from "./2-State/01- working-state/State";
// import AnagrafeProps from "./Esercizi Prop -data/components/AnagrafeProps";
 //import UseEffect from "./8-Reducers/02-using-the-useeffect-hook/test/UseEffect";
 //import IntroductionComponent from "./1-Introduction/2-custom-component/IntroductionComponent";
// import Padre from "./Esercizi/figli component/Padre";



const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    <ProdottiList/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

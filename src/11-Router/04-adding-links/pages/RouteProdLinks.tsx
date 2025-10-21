import React from "react";
import { createBrowserRouter, RouterProvider } from "react-router-dom";

import Home2 from "./Home2";
import Prodotti from "./Prodotti"
import Contatti from "./Contatti";


const router = createBrowserRouter([
  { path: "/", element: <Home2 /> },
  { path: "/prodotti", element: <Prodotti /> },
  { path: "/contatti", element: <Contatti /> },
]);

const RouteProdLinks = () => {
  return <RouterProvider router={router} />;
};

export default RouteProdLinks;

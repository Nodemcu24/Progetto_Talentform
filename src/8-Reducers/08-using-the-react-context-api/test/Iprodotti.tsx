import { createContext } from "react";

export interface AppContextType {

    id: string;
    nome: string;
    prezzo: number
};

export const AppContext = createContext<AppContextType>({id: "123a", nome: "laptop", prezzo: 670});
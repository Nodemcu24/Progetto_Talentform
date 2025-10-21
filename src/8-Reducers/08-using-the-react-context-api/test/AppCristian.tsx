import AppAlberto from './AppAlberto';
import { AppContext } from './Iprodotti';

const AppCristian: React.FC = () => {

    const newProdotto = {id:"450b", nome: "mouse", prezzo: 70};

    return(

        <AppContext.Provider value={newProdotto}>
            <AppAlberto/>
        </AppContext.Provider>
    );
};

export default AppCristian
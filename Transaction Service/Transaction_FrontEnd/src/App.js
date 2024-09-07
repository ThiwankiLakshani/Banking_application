import React from 'react';
import AddTransaction from './components/AddTransaction';
import ViewTransactions from './components/ViewTransactions';

function App() {
    return (
        <div className="App">
            <h1>Transaction Service</h1>
            <AddTransaction />
            <ViewTransactions />
        </div>
    );
}

export default App;

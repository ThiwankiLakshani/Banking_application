import React, { useState } from 'react';
import { getTransactionsByAccountId, getTransactionsByReferenceId } from '../services/transactionService';

const ViewTransactions = () => {
    const [accountId, setAccountId] = useState('');
    const [referenceId, setReferenceId] = useState('');
    const [transactions, setTransactions] = useState([]);

    const fetchTransactionsByAccount = async () => {
        try {
            const data = await getTransactionsByAccountId(accountId);
            setTransactions(data);
        } catch (error) {
            console.error('Error fetching transactions:', error);
        }
    };

    const fetchTransactionsByReference = async () => {
        try {
            const data = await getTransactionsByReferenceId(referenceId);
            setTransactions(data);
        } catch (error) {
            console.error('Error fetching transactions:', error);
        }
    };

    return (
        <div>
            <div>
                <input value={accountId} onChange={(e) => setAccountId(e.target.value)} placeholder="Account ID" />
                <button onClick={fetchTransactionsByAccount}>Get Transactions by Account</button>
            </div>
            <div>
                <input value={referenceId} onChange={(e) => setReferenceId(e.target.value)} placeholder="Reference ID" />
                <button onClick={fetchTransactionsByReference}>Get Transactions by Reference</button>
            </div>
            <ul>
                {transactions.map((transaction, index) => (
                    <li key={index}>
                        {transaction.referenceId} - {transaction.amount} - {transaction.transactionStatus}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ViewTransactions;

import React, { useState } from 'react';
import { addTransaction } from '../services/transactionService';

const AddTransaction = () => {
    const [transaction, setTransaction] = useState({
        referenceId: '',
        accountId: '',
        transactionType: '',
        amount: '',
        localDateTime: '',
        transactionStatus: '',
        comments: ''
    });

    const handleChange = (e) => {
        setTransaction({ ...transaction, [e.target.name]: e.target.value });
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await addTransaction(transaction);
            alert('Transaction added successfully!');
        } catch (error) {
            console.error('Error adding transaction:', error);
            alert('Error adding transaction');
        }
    };

    return (
        <form onSubmit={handleSubmit}>
            <input name="referenceId" value={transaction.referenceId} onChange={handleChange} placeholder="Reference ID" />
            <input name="accountId" value={transaction.accountId} onChange={handleChange} placeholder="Account ID" />
            <input name="transactionType" value={transaction.transactionType} onChange={handleChange} placeholder="Transaction Type" />
            <input name="amount" value={transaction.amount} onChange={handleChange} placeholder="Amount" />
            <input name="localDateTime" value={transaction.localDateTime} onChange={handleChange} placeholder="Date Time" />
            <input name="transactionStatus" value={transaction.transactionStatus} onChange={handleChange} placeholder="Status" />
            <input name="comments" value={transaction.comments} onChange={handleChange} placeholder="Comments" />
            <button type="submit">Add Transaction</button>
        </form>
    );
};

export default AddTransaction;

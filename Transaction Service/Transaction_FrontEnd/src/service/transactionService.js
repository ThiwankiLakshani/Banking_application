import axios from 'axios';

const API_URL = 'http://localhost:8084'; // Base URL of your backend service

// Add a transaction
export const addTransaction = async (transaction) => {
    try {
        const response = await axios.post(`${API_URL}/transactions`, transaction);
        return response.data;
    } catch (error) {
        throw error;
    }
};

// Get transactions by account ID
export const getTransactionsByAccountId = async (accountId) => {
    try {
        const response = await axios.get(`${API_URL}/transactions?accountId=${accountId}`);
        return response.data;
    } catch (error) {
        throw error;
    }
};

// Get transactions by reference ID
export const getTransactionsByReferenceId = async (referenceId) => {
    try {
        const response = await axios.get(`${API_URL}/transactions?referenceId=${referenceId}`);
        return response.data;
    } catch (error) {
        throw error;
    }
};
